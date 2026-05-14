# TarroBuild — Project Architecture

## Overview
Plataforma online para asistencia de armado de computadores y análisis de compatibilidad de hardware. Usuarios exploran componentes, crean configuraciones de PC y reciben validación técnica automática (compatibilidad, consumo energético, precios referenciales, recomendaciones).

## Stack
- **Java 21**, Spring Boot 4.0.6, Spring Cloud 2025.1.1
- **Maven multi-module**, each module is an independent microservice
- **Lombok** (`@Getter/@Setter/@NoArgsConstructor`), **Jakarta Validation**, **Spring Data JPA**
- **H2** (dev) / **MySQL** (prod) via Spring profiles
- Each service operates its own independent database — **strictly no shared tables**

## Modules (11 total)

| # | Service | Port | Status | DB |
|---|---------|------|--------|-----|
| MS-01 | api-gateway | 8080 | shell | none |
| MS-02 | auth-service | 8081 | shell | db_auth |
| MS-03 | user-service | 8082 | **full CRUD** | db_users |
| MS-04 | category-service | 8084 | **full CRUD** | db_categories |
| MS-05 | product-service | 8083 | entities + DTOs only | db_products |
| MS-06 | compatibility-service | 8085 | shell | db_compatibility |
| MS-07 | provider-service | 8086 | shell | db_providers |
| MS-08 | build-service | 8087 | **full CRUD** | db_builds |
| MS-09 | estimate-service | 8088 | shell | db_estimates |
| MS-10 | hardware-advisor | 8089 | shell | db_advisor |
| MS-11 | notification-service | 8090 | shell | db_notifications |

> Note: Ports from README design. Only user-service (8082), product-service (8083), category-service (8084), and build-service (8087) have `application.yaml` with matching ports.

## Entity Definitions (from README design)

| Service | Entity | Fields |
|---------|--------|--------|
| auth-service | Credential | id, email, passwordHash, role, userId, createdAt |
| user-service | User | id, name, lastName, email, phone, createdAt |
| category-service | Category | id, name, slug (unique), description, isActive, `@OneToMany` -> List\<AttributeDefinition\> |
| category-service | AttributeDefinition | id, attributeName, valueType (STRING/NUMBER/BOOLEAN), isRequired, `@ManyToOne` -> Category |
| **product-service** | **Product** | **id, name, description, price, categoryId, brand, model, isActive, `@OneToMany` -> List\<ProductAttribute\>** |
| **product-service** | **ProductAttribute** | **id, attributeName, attributeValue, `@ManyToOne` -> Product** |
| compatibility-service | CompatibilityRule | id, sourceCategory, sourceAttributeName, operator, targetCategory, targetAttributeName, incompatibilityReason |
| compatibility-service | CompatibilityCheck | id, productIds, result, details |
| provider-service | Provider | id, name, contact, website, isActive |
| provider-service | ProviderProduct | id, providerId, productId, externalReference |
| build-service | Build | id, userId, name, status (DRAFT/VALIDATED/INCOMPATIBLE), createdAt, `@OneToMany` -> List\<BuildItem\> |
| build-service | BuildItem | id, productId, quantity, `@ManyToOne` -> Build |
| estimate-service | Estimate | id, buildId, totalPrice, currency, createdAt |
| hardware-advisor | Recommendation | id, buildId, ruleApplied, suggestedProductId, reason, createdAt |
| notification-service | NotificationLog | id, userId, type, content, status, timestamp |

## Functional Requirements Mapping

| ID | Description | Key Service(s) |
|----|-------------|----------------|
| RF-01 | Register user (bcrypt) | auth-service |
| RF-02 | Authenticate user (JWT) | auth-service |
| RF-03 | List catalog components | product-service |
| RF-04 | Component detail | product-service |
| RF-05 | Filter by category/brand/price | product-service |
| RF-06 | Create build | build-service |
| RF-07 | Manage build items | build-service |
| RF-08 | Compatibility check | compatibility-service |
| RF-09 | Power consumption estimate | compatibility/estimate |
| RF-10 | Reference prices from providers | provider-service |
| RF-11 | Consolidated build analysis | estimate-service |
| RF-12 | Save favorite builds | build-service |
| RF-13 | Upgrade recommendations | hardware-advisor |
| RF-14 | CRUD components/attributes | product/category |
| RF-15 | CRUD compatibility rules | compatibility-service |
| RF-16 | CRUD price references | provider-service |
| RF-17 | Price/availability alerts | notification-service |
| RF-18 | Auto-notifications | notification-service |

## Inter-Service Communication

| Origin | Destination | Reason |
|--------|-------------|--------|
| api-gateway | auth-service | Validate JWT tokens |
| auth-service | user-service | Link credentials to user profile |
| build-service | product-service | Get component technical info |
| build-service | compatibility-service | Validate component compatibility |
| build-service | provider-service | Query external references |
| estimate-service | build-service | Get full build configuration |
| estimate-service | product-service | Get updated prices |
| estimate-service | notification-service | Notify user of estimate |
| hardware-advisor | build-service | Analyze current user build |
| hardware-advisor | product-service | Get catalog for suggestions |
| hardware-advisor | compatibility-service | Validate recommended components |
| hardware-advisor | notification-service | Notify recommendations |

## Architecture Diagram

```
CLIENTE / FRONTEND
        |
        v
API GATEWAY :8080
        |
------------------------------------------------------------
|       |       |       |       |       |       |       |
AUTH   USER  PRODUCT CATEGORY COMPAT PROVIDER  BUILD
8081   8082   8083    8084    8085   8086     8087
------------------------------------------------------------
                         |
                         v
                 ESTIMATE :8088
                         |
                         v
             HARDWARE ADVISOR :8089
                         |
                         v
             NOTIFICATION :8090
```

## Layered Architecture (every service follows this)

```
cl.tarrobuild.<service>/
  dto/        - Java records (request with @Valid, response without)
  controller/ - @RestController, constructor injection
  service/    - @Service @Slf4j, constructor injection
  repository/ - extends JpaRepository<Entity, Long>
  model/      - @Entity, Lombok, JPA annotations
  exception/  - ApiError record + @ControllerAdvice handler
```

### DTO Conventions
- **Request** = Java record with `jakarta.validation.constraints.*`
- **Response** = Java record, no validation, includes nested sub-entity responses as `List<ChildResponse>`
- **Update** = separate record only when fields differ from create (e.g. `UserUpdateRequest` omits `email`)

### Controller Patterns
- Constructor injection only (no `@Autowired`)
- `@Valid @RequestBody` on POST/PUT
- `@PathVariable Long id` on single-resource endpoints
- Sub-entity routes: `/api/parents/{parentId}/children`
- Returns `ResponseEntity<T>` with explicit status

### Service Patterns
- `@Slf4j` + `@Service`
- `throws EntityNotFoundException` / `IllegalArgumentException` / `EntityExistsException`
- `toResponse(Entity)` method for mapping
- `Optional.map().orElseThrow()` for find-by-id

### Repository Patterns
- `extends JpaRepository<Entity, Long>`
- Derived query methods (e.g. `findByCategoryId`, `existsByEmail`, `findByIdAndBuild_Id`)

### Exception Package
- `ApiError` record: `String message, String details, String timestamp`
- `GlobalExceptionHandler` with `@ControllerAdvice`, `@Value("${app.environment:production}")` for stack trace control
- Required HTTP codes per **RNF-02**: 200, 201, 400, 401, 403, 404, 409, 500
- Current handlers: `IllegalArgumentException` (400), `MethodArgumentNotValidException` (400), `EntityNotFoundException` (404), `EntityExistsException` (409), `NoResourceFoundException` (404), generic `Exception` (500)
- **Missing:** 401 (BadCredentialsException) and 403 (AccessDeniedException) — both are commented out stubs

### Application files pattern
```yaml
spring:
  application:
    name: <service-name>
  profiles:
    active: ${SPRING_PROFILES_ACTIVE:h2}
server:
  port: <port>
```

- `application-h2.yaml` — `jdbc:h2:mem:testdb`, `ddl-auto: create-drop`
- `application-mysql.yaml` — `jdbc:mysql://...`, `ddl-auto: update`
- `data.sql` — seed data (user/category/build services)

### pom.xml Pattern (same for every service module)
```xml
<parent>
    <groupId>cl.tarrobuild</groupId>
    <artifactId>tarrobuild</artifactId>
    <version>1.0</version>
    <relativePath>../../pom.xml</relativePath>
</parent>
<artifactId><service-name></artifactId>
<!-- deps: spring-boot-starter-webmvc, data-jpa, validation, h2, mysql-connector-j, h2console, test -->
```

---

## Fully Implemented Services

### category-service (`/api/categories`, port 8084)

**Endpoints:**
```
POST   /api/categories                          -> CategoryResponse (201)
GET    /api/categories                          -> List<CategoryResponse>
GET    /api/categories/{id}                     -> CategoryResponse
POST   /api/categories/{categoryId}/attributes  -> AttributeDefinitionResponse (201)
GET    /api/categories/{categoryId}/attributes  -> List<AttributeDefinitionResponse>
```

**Repository methods:** `findBySlug`, `existsBySlug`, `existsByName`, `findByIsActive` / `findByCategoryId`, `findByCategoryIdAndIsRequired`, `findByIdAndCategoryId`, `existsByAttributeNameAndCategoryId`

---

### build-service (`/api/builds`, port 8087)

**Endpoints:**
```
GET    /api/builds                          -> List<BuildResponse>
GET    /api/builds/{id}                     -> BuildResponse
GET    /api/builds/user/{userId}            -> List<BuildResponse>
GET    /api/builds/user/{userId}/{id}       -> BuildResponse
POST   /api/builds                          -> BuildResponse (201)
PUT    /api/builds/{id}                     -> BuildResponse
DELETE /api/builds/{id}                     -> 204
GET    /api/builds/{buildId}/items           -> List<BuildItemResponse>
GET    /api/builds/{buildId}/items/{itemId} -> BuildItemResponse
POST   /api/builds/{buildId}/items           -> BuildItemResponse (201)
DELETE /api/builds/{buildId}/items/{itemId} -> 204
```

**Repository methods:** `findByUserId`, `findByIdAndUserId` / `findByBuild_Id`, `findByIdAndBuild_Id`

---

### user-service (`/api/users`, port 8082)

**Endpoints:**
```
GET    /api/users?name=&last_name=      -> List<UserResponse>
GET    /api/users/{id}                  -> UserResponse
GET    /api/users/email/{email}         -> UserResponse
GET    /api/users/phone/{phone}         -> UserResponse
POST   /api/users                       -> UserResponse (201)
PUT    /api/users/{id}                  -> UserResponse
DELETE /api/users/{id}                  -> 204
```

**Repository methods:** `findByName`, `findByLastName`, `findByNameAndLastName`, `findByEmail`, `findByPhone`, `existsByEmail`

---

### product-service (incomplete — entities + DTOs done)

**DTOs:**
- `ProductRequest(name, description, price, categoryId, brand, isActive)` — `@NotBlank @Size @NotNull @Min(0)`
- `ProductResponse(id, name, description, price, categoryId, brand, isActive, List<ProductAttributeResponse> attributes)`
- `ProductAttributeRequest(attributeName, attributeValue)` — `@NotBlank @Size`
- `ProductAttributeResponse(id, attributeName, attributeValue, productId)`

**Still needed:** controller/, service/, repository/, exception/, data.sql

---

## Seed Data (data.sql)

- **users:** 20 users (Lucas Vargas through Benjamín Aguilar)
- **categories:** 8 PC component categories (CPU, GPU, RAM, Motherboard, Storage, PSU, Case, Cooling)
- **attribute_definitions:** 3-5 per category (Socket, Cores, Threads, VRAM, Capacity, Speed, etc.)
- **builds:** 5 builds (Gaming Beast RTX, Budget Office PC, Streaming Ryzen Setup, Midrange Editing Build, Test Bench Intel)
- **build_items:** multiple items per build referencing product IDs (101-124 range)
- **products:** no seed data yet
