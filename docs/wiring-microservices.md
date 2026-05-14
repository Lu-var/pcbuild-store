# Wiring Microservices in TarroBuild

> How to connect two services via Feign client — using `product-service → category-service` as the concrete walkthrough.

---

## Table of Contents

- [The Problem](#the-problem)
- [The Target: category-service's Endpoint](#the-target-category-services-endpoint)
- [The Current Placeholder](#the-current-placeholder)
- [Approach: Feign Client (declarative)](#approach-feign-client-declarative)
- [Step 0: Understand the Build Order](#step-0-understand-the-build-order)
- [Step 1: Add the Feign Dependency](#step-1-add-the-feign-dependency)
- [Step 2: Enable Feign Clients](#step-2-enable-feign-clients)
- [Step 3: Create the Feign Client Interface](#step-3-create-the-feign-client-interface)
- [Step 4: Add the Client-side DTO](#step-4-add-the-client-side-dto)
- [Step 5: Externalize the URL in Config](#step-5-externalize-the-url-in-config)
- [Step 6: Replace the Placeholder Body](#step-6-replace-the-placeholder-body)
- [The Full Call Chain](#the-full-call-chain)
- [Error Scenarios](#error-scenarios)
- [Adjacent Concepts](#adjacent-concepts)
  - [Feign ErrorDecoder](#feign-errordecoder)
  - [Timeouts](#timeouts)
  - [Logging with Feign](#logging-with-feign)
  - [Service Discovery (future)](#service-discovery-future)
- [Quick Reference — All Files Changed](#quick-reference--all-files-changed)
- [What to Do After This Wire](#what-to-do-after-this-wire)

---

## The Problem

In TarroBuild, each microservice owns its database **and cannot query another service's DB directly** (RNF-05). When service A needs information from service B, the only legal path is an **HTTP call** to service B's REST API.

**Concrete example:** `product-service` stores a `Long categoryId` on every `Product`. But category data (name, slug, attributes) lives in `category-service`'s database. Before creating a product, product-service must verify: *"Does categoryId X actually exist in category-service?"*

That verification **is** the wire.

Right now, the verification is a no-op placeholder:

```java
// ProductService.createProduct()
categoryValidationService.validateCategoryExists(request.categoryId());
// ^ always accepts any id, even 99999
```

---

## The Target: category-service's Endpoint

category-service already has the REST endpoint we need to call:

**File:** `services/category-service/.../controller/CategoryController.java`

```java
@GetMapping("/{id}")
public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {
    return ResponseEntity.ok(categoryService.getCategoryById(id));
}
```

**Contract:**

| Condition | HTTP Status | Body |
|-----------|-------------|------|
| Category exists | `200 OK` | `CategoryResponse` JSON |
| Category not found | `404 Not Found` | `{ "error": "Category not found" }` |

It runs on `localhost:8084`, path prefix `/api/categories`.

So the full URL we need to call is:

```
GET http://localhost:8084/api/categories/{id}
```

---

## The Current Placeholder

**File:** `services/product-service/.../service/CategoryValidationService.java`

```java
@Service
@Slf4j
public class CategoryValidationService {

    // TODO: call category-service via Feign client to verify existence
    public void validateCategoryExists(Long categoryId) {
        log.warn("Category validation PLACEHOLDER — accepting categoryId {} without verification", categoryId);
    }
}
```

It's injected into `ProductService` and called on two paths:

1. `createProduct()` — line 76
2. `updateProduct()` — line 94

Our goal: replace the placeholder body with a real HTTP call, changing only `CategoryValidationService` and its supporting infrastructure.

---

## Approach: Feign Client (declarative)

Feign is a **declarative HTTP client** from Spring Cloud. You define a Java interface with annotations, and Spring auto-generates the implementation — no manual HTTP plumbing.

**Why Feign over alternatives:**

| Approach | Pros | Cons |
|----------|------|------|
| **Feign** | Declarative, central config, integrates with load balancer & circuit breakers | Small extra dependency |
| `RestClient` / `WebClient` | Zero extra deps, explicit code | Boilerplate repeated per service |
| Direct DB access | Fastest (no HTTP) | **Forbidden** by RNF-05 |

The parent POM already includes `spring-cloud-dependencies` (`2025.1.1`) in `<dependencyManagement>`, so Feign version management is handled.

---

## Step 0: Understand the Build Order

Before you start coding, know the dependency chain. This wire is step 3:

```
 1. category-service  ✅  (done)
 2. provider-service   🔄  (Cami's task)
 3. product-service    ◀️  YOU ARE HERE — wire to category-service
 4. compatibility-service ❌ (needs product-service done first)
 5. build-service (inter-service wiring) ❌
 6. estimate-service ❌
 7. hardware-advisor-service ❌
 8. notification-service ❌
 9. auth-service ❌
10. api-gateway ❌
```

**You are unblocked** because category-service is complete and running on `:8084`.

---

## Step 1: Add the Feign Dependency

**File:** `services/product-service/pom.xml`

Add inside `<dependencies>`:

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

**No version tag needed.** The parent POM (`pom.xml` root) manages versions through:

```xml
<properties>
    <spring-cloud.version>2025.1.1</spring-cloud.version>
</properties>

<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>${spring-cloud.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

The `spring-cloud-starter-openfeign` artifact includes:
- Feign core
- Spring Cloud auto-configuration for Feign clients
- Jackson for JSON serialization (already on classpath from Spring Boot)

---

## Step 2: Enable Feign Clients

**File:** `services/product-service/.../ProductServiceApplication.java`

Add `@EnableFeignClients`:

```java
package cl.tarrobuild.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients                    // <-- add this
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}
```

**Why this matters:** Without `@EnableFeignClients`, Spring will scan the `@FeignClient` annotation and silently do nothing. The client bean will never be created. You'll get a `NoSuchBeanDefinitionException` at runtime when `CategoryValidationService` tries to inject it.

---

## Step 3: Create the Feign Client Interface

**New file:** `services/product-service/src/main/java/cl/tarrobuild/product/client/CategoryServiceClient.java`

```java
package cl.tarrobuild.product.client;

import cl.tarrobuild.product.dto.CategoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category-service", url = "${category-service.base-url}")
public interface CategoryServiceClient {

    @GetMapping("/api/categories/{id}")
    CategoryResponse getCategoryById(@PathVariable("id") Long id);
}
```

### Annotation Breakdown

| Element | Value | Why |
|---------|-------|-----|
| `name` | `"category-service"` | Identifies the client (logs, metrics, future discovery). Matches `spring.application.name` in category-service. |
| `url` | `"${category-service.base-url}"` | Externalizes the URL into a config property. Required when there's no service discovery registry. |

### Important: `@PathVariable("id")`

The `("id")` argument is **not optional** here. Without it, the parameter name resolution depends on bytecode debug info (`-parameters` compiler flag). With it, the name is explicit and always correct. If you get a `FeignClientException` with a malformed URL, this is the most common cause.

### Directory Structure After Creation

```
product-service/
  src/main/java/cl/tarrobuild/product/
    ProductServiceApplication.java
    client/
      CategoryServiceClient.java          <-- new
    controller/
    dto/
    exception/
    model/
    repository/
    service/
```

---

## Step 4: Add the Client-side DTO

Feign deserializes the JSON response into the return type. We need a DTO that matches what category-service returns.

**New file:** `services/product-service/src/main/java/cl/tarrobuild/product/dto/CategoryResponse.java`

```java
package cl.tarrobuild.product.dto;

import java.util.List;

public record CategoryResponse(
    Long id,
    String name,
    String slug,
    String description,
    Boolean isActive,
    List<CategoryAttributeResponse> attributes
) {}
```

**New file:** `services/product-service/src/main/java/cl/tarrobuild/product/dto/CategoryAttributeResponse.java`

```java
package cl.tarrobuild.product.dto;

public record CategoryAttributeResponse(
    Long id,
    String attributeName,
    String valueType,
    Boolean isRequired,
    Long categoryId
) {}
```

### Why not import category-service's DTO directly?

Each service is an independent codebase. Sharing DTOs would require extracting a shared library module. That's over-engineering for now — TarroBuild follows **independent service packaging**. A little duplication is acceptable because:

- The two DTOs will naturally diverge as services evolve
- Avoids a coupling point between services
- If the response shape changes, this DTO breaks at compile time, which is *desirable* (you want to know immediately)

### Field Mapping (category-service response → this DTO)

| JSON field in response | Record component | Type |
|-----------------------|-----------------|------|
| `id` | `id` | `Long` |
| `name` | `name` | `String` |
| `slug` | `slug` | `String` |
| `description` | `description` | `String` |
| `isActive` | `isActive` | `Boolean` |
| `attributes` | `attributes` | `List<CategoryAttributeResponse>` |

The JSON property name must match the record component name exactly (Jackson convention). They do.

---

## Step 5: Externalize the URL in Config

Add the `category-service.base-url` property to all three application YAML files in `product-service`.

**File:** `services/product-service/src/main/resources/application.yaml`

```yaml
spring:
  application:
    name: product-service
  profiles:
    active: ${SPRING_PROFILES_ACTIVE:h2}

server:
  port: 8083

category-service:
  base-url: http://localhost:8084
```

**File:** `services/product-service/src/main/resources/application-h2.yaml`

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driverClassName: org.h2.Driver
    username: sa
    password:
  h2:
    console:
      enabled: true
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    defer-datasource-initialization: true
    hibernate:
      ddl-auto: create-drop

category-service:
  base-url: http://localhost:8084
```

**File:** `services/product-service/src/main/resources/application-mysql.yaml`

```yaml
# ... existing MySQL config ...
category-service:
  base-url: http://localhost:8084
```

**Why put it in all three profiles?** Profile-specific configs override the base `application.yaml` values. If you only put it in the base file and a profile doesn't inherit it (Spring profiles use a layered override model), the value could be `null`. Being explicit in every profile avoids confusion.

**Why `http://localhost:8084` specifically?** The architecture spec assigns fixed ports:
- category-service: `:8084`
- product-service: `:8083`

Since there's no service discovery, we use the concrete URL. When api-gateway is implemented, inter-service traffic might route through the gateway instead, but for now direct addresses are fine.

---

## Step 6: Replace the Placeholder Body

**File:** `services/product-service/.../service/CategoryValidationService.java`

Replace the entire content:

```java
package cl.tarrobuild.product.service;

import cl.tarrobuild.product.client.CategoryServiceClient;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryValidationService {

    private final CategoryServiceClient categoryClient;

    public CategoryValidationService(CategoryServiceClient categoryClient) {
        this.categoryClient = categoryClient;
    }

    public void validateCategoryExists(Long categoryId) {
        try {
            categoryClient.getCategoryById(categoryId);
            log.debug("Category {} exists", categoryId);
        } catch (Exception e) {
            log.warn("Category {} validation failed: {}", categoryId, e.getMessage());
            throw new EntityNotFoundException("Category with ID " + categoryId + " not found");
        }
    }
}
```

### What changed

| Before | After |
|--------|-------|
| Constructor with no args | Constructor-injects `CategoryServiceClient` |
| `log.warn("PLACEHOLDER...")` | Makes real HTTP call |
| Returns immediately | Throws `EntityNotFoundException` on failure |
| Always returns void | Still returns void on success |

### Why the try-catch

When category-service responds with 404, Feign throws a `FeignException.NotFound`. But in product-service:

- `FeignException.NotFound` is **not** handled by `GlobalExceptionHandler`
- `GlobalExceptionHandler` only has handlers for: `IllegalArgumentException`, `MethodArgumentNotValidException`, `EntityNotFoundException`, `EntityExistsException`, `NoResourceFoundException`, `Exception` (generic)

There are two ways to handle this:

**Option A (what this guide does):** Catch the exception in `CategoryValidationService` and rethrow as `EntityNotFoundException`. This is simple, local, and doesn't require changes to `GlobalExceptionHandler`.

**Option B (cleaner for many clients):** Create a Feign `ErrorDecoder` bean. The decoder intercepts Feign exceptions globally and converts 404 → `EntityNotFoundException`, 409 → `EntityExistsException`, etc. (See [Adjacent Concepts](#feign-errordecoder).)

For the first wire, Option A is fine. When more Feign clients appear (compatibility-service, build-service, etc.), add the shared `ErrorDecoder`.

### What happens to the callers (`ProductService`)

Nothing changes. The `ProductService` code remains identical:

```java
// createProduct() still does:
categoryValidationService.validateCategoryExists(request.categoryId());
```

It never knew whether validation was a log line or an HTTP call. The only behavioral difference: now it can throw.

---

## The Full Call Chain

When a user calls `POST /api/products` on product-service:

```
 1. ProductController.createProduct(request)
 2.   → ProductService.createProduct(request)
 3.     → CategoryValidationService.validateCategoryExists(categoryId)
 4.       → CategoryServiceClient.getCategoryById(id)
 5.         ──→ HTTP GET http://localhost:8084/api/categories/{id}
 6.              (arrives at category-service CategoryController)
 7.              → CategoryService.getCategoryById(id)
 8.                → CategoryRepository.findById(id)
 9.
10.     ◀── 200 OK with CategoryResponse JSON ──
11.       → Validation successful, returns void
12.     → Product saved to product-service database
13.   ←── 201 Created with ProductResponse
```

**If the category doesn't exist:**

```
 3.     → CategoryValidationService.validateCategoryExists(categoryId)
 4.       → CategoryServiceClient.getCategoryById(id)
 5.         ──→ HTTP GET /api/categories/{id}
 6.              → CategoryRepository.findById(id) → empty Optional
 7.              → throws EntityNotFoundException("Category not found")
 8.              → GlobalExceptionHandler maps to HTTP 404
 9.         ◀── 404 Not Found body
10.       ←── FeignException.NotFound
11.     ←── EntityNotFoundException("Category with ID X not found")
12.   ←── GlobalExceptionHandler maps to HTTP 404
13.   ←── 404 Not Found {"error": "Category with ID X not found"}
```

---

## Error Scenarios

### Scenario 1: Category doesn't exist (404)

category-service returns 404 → Feign throws `FeignException.NotFound` → caught in `CategoryValidationService` → rethrown as `EntityNotFoundException` → product-service `GlobalExceptionHandler` returns HTTP 404.

**Correct behavior.** The client sees a semantic 404, just as if the product itself wasn't found.

### Scenario 2: Category service is down (connection refused)

The HTTP call fails immediately with `Connection refused: localhost:8084`. Feign wraps this as `FeignException` (not `FeignException.NotFound`, just the base class). The catch clause fires, and the client gets:

```
HTTP 404 Not Found
{"error": "Category with ID 5 not found"}
```

**Acceptable for now.** The client sees a 404 — unclear whether the category doesn't exist or is unreachable, but the request fails safely (product was NOT created with an unvalidated categoryId). If you want different behavior for "down" vs "not found", add a custom `ErrorDecoder` (see below).

### Scenario 3: Category service is slow (timeout)

If there's no explicit timeout, Feign uses the default connection timeout (~2s) and read timeout (~60s). A slow category-service could hold the product creation thread.

**Mitigation:** Add explicit timeouts (see [Timeouts](#timeouts)).

### Scenario 4: Category service returns 500

category-service has a bug and returns HTTP 500. Feign wraps this as `FeignException.InternalServerError`. The catch clause fires, and the client gets 404.

**Suboptimal but safe.** The product was NOT created. For now this is fine — later you can differentiate by checking the exception type:

```java
try {
    categoryClient.getCategoryById(categoryId);
} catch (FeignException.NotFound e) {
    throw new EntityNotFoundException("Category " + categoryId + " not found");
} catch (FeignException.InternalServerError e) {
    throw new RuntimeException("Category service unavailable", e);
}
```

---

## Adjacent Concepts

### Feign ErrorDecoder

If you find yourself writing the same try-catch pattern in multiple services, centralize it with an `ErrorDecoder`.

**New file:** `services/product-service/.../client/FeignErrorDecoder.java`

```java
package cl.tarrobuild.product.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        return switch (response.status()) {
            case 404 -> new EntityNotFoundException("Referenced resource not found");
            case 409 -> new jakarta.persistence.EntityExistsException("Referenced resource conflict");
            case 500 -> new RuntimeException("Downstream service error: " + methodKey);
            default  -> defaultDecoder.decode(methodKey, response);
        };
    }
}
```

When this bean exists, Feign routes ALL response handling through it. Now `CategoryValidationService` can simplify to:

```java
public void validateCategoryExists(Long categoryId) {
    categoryClient.getCategoryById(categoryId);
    log.debug("Category {} exists", categoryId);
}
```

No try-catch needed. The `ErrorDecoder` converts 404 → `EntityNotFoundException`, which `GlobalExceptionHandler` handles.

### Timeouts

Set Feign timeouts in `application.yaml` to prevent thread blocking:

```yaml
spring:
  cloud:
    openfeign:
      client:
        config:
          category-service:
            connect-timeout: 2000
            read-timeout: 3000
```

| Property | Default | Recommended | Notes |
|----------|---------|-------------|-------|
| `connect-timeout` | 2000ms | 2000ms | Time to establish TCP connection |
| `read-timeout` | 60000ms | 3000ms | Time to wait for response body |

If category-service is on the same machine, these can be lower (500ms / 1000ms).

### Logging with Feign

Enable Feign request logging in development by adding a configuration bean:

```java
package cl.tarrobuild.product.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.BASIC;
    }
}
```

And in `application-h2.yaml`:

```yaml
logging:
  level:
    cl.tarrobuild.product.client: DEBUG
```

Feign log levels:

| Level | What it logs |
|-------|-------------|
| `NONE` | Nothing (default) |
| `BASIC` | Request method, URL, response status, response time |
| `HEADERS` | BASIC + request/response headers |
| `FULL` | HEADERS + body |

### Service Discovery (future)

The `name = "category-service"` in `@FeignClient(name = "category-service", url = "...")` is forward-looking. If you later add a service registry (Eureka or Consul), the `url` property can be removed and Feign will resolve the name via the registry.

The transition path:

```java
// TODAY — explicit URL
@FeignClient(name = "category-service", url = "${category-service.base-url}")

// FUTURE — with service discovery (url not set = use discovery)
@FeignClient(name = "category-service")
// category-service.base-url property is now ignored
```

Both work without changing any calling code.

---

## Quick Reference — All Files Changed

| # | Action | File Path (relative to `services/product-service/`) |
|---|--------|------------------------------------------------------|
| 1 | Edit | `pom.xml` — add `spring-cloud-starter-openfeign` dependency |
| 2 | Edit | `src/main/java/.../ProductServiceApplication.java` — add `@EnableFeignClients` |
| 3 | **Create** | `src/main/java/.../client/CategoryServiceClient.java` — Feign client interface |
| 4 | **Create** | `src/main/java/.../dto/CategoryResponse.java` — response DTO record |
| 5 | **Create** | `src/main/java/.../dto/CategoryAttributeResponse.java` — nested DTO record |
| 6 | Edit | `src/main/resources/application.yaml` — add `category-service.base-url` |
| 7 | Edit | `src/main/resources/application-h2.yaml` — add `category-service.base-url` |
| 8 | Edit | `src/main/resources/application-mysql.yaml` — add `category-service.base-url` |
| 9 | Edit | `src/main/java/.../service/CategoryValidationService.java` — replace placeholder body |

---

## What to Do After This Wire

Once product-service → category-service is wired and building:

1. **Run both services locally** — verify that `POST /api/products` with a valid `categoryId` works and with an invalid one returns 404.
2. **Cami finishes provider-service** — then wire product-service → provider-service if needed, or proceed to the next dependency.
3. **Next service: compatibility-service** — it depends on product-service having a solid attribute model (ProductAttribute already exists). The full product-service with working category validation is the prerequisite.

The dependency chain after your wire is complete:

```
category-service  ──feign──▶  product-service  ──▶  compatibility-service
                                              ──▶  build-service (inter-service wiring)
                                              ──▶  estimate-service
                                              ──▶  hardware-advisor-service
```
