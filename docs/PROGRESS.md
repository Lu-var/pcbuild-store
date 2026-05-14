# PROGRESS.md

---

## Done

### Services fully implemented (Controller + Service + Repository + Model + DTOs + ExceptionHandler + seed data)

| Service | Port | Files |
|---------|------|-------|
| **user-service** | 8082 | Full CRUD — 20 seed users |
| **category-service** | 8084 | Full CRUD — 8 categories, ~30 attribute definitions |
| **product-service** | 8083 | Full CRUD + product attributes + inter-service client (→ category) — 32 seed products, ~100 attributes |
| **build-service** | 8087 | Full CRUD + build items + status enum — 5 builds, ~25 items |

### Newly scaffolded (basic 5-layer CSR, no inter-service wiring yet)

| Service | Port | Files Created | Notes |
|---------|------|---------------|-------|
| **compatibility-service** | 8085 | 2 entities, 2 repos, 4 DTOs, 1 service, 1 controller, 2 exceptions, data.sql (5 rules) | `POST /api/compatibility/check`, CRUD `/api/compatibility/rules` |
| **notification-service** | 8090 | 1 model (POJO), 1 enum, 1 in-memory repo, 2 DTOs, 1 service, 1 controller, 2 exceptions | `POST /api/notifications/send`, `GET /api/notifications/logs`, `GET /api/notifications/logs/user/{userId}`. In-memory — no JPA. Dead h2/mysql yamls deleted. |
| **estimate-service** | 8088 | 1 entity, 1 repo, 2 DTOs, 1 service, 1 controller, 2 exceptions | `POST /api/estimate/calculate` (stub, totalPrice=0), `GET /api/estimate/{buildId}` |
| **hardware-advisor-service** | 8089 | 1 entity, 1 repo, 2 DTOs, 1 service, 1 controller, 2 exceptions | `POST /api/recommendations/generate` (stub, empty list), `GET /api/recommendations/{buildId}` |

### Inter-service wiring

- Wired product-service → category-service via RestClient (`CategoryRestClient`, `CategoryValidationService`, `RestClientConfig`, env var config)

### Infrastructure

- Consolidated GlobalExceptionHandler (EntityExistsException + NoResourceFoundException) across build-service, user-service, product-service
- Merged AttributeDefinitionController + BuildItemController into parent controllers, duplicate attributeName check
- Cleaned up BuildItem (removed @AllArgsConstructor, deleteBuild returns boolean, @Slf4j on CategoryService)
- Removed JPA/H2/MySQL deps from notification-service (in-memory, no JPA)
- Deleted notification-service/src/main/resources/application-h2.yaml and application-mysql.yaml (dead configs — no JPA on classpath)

---

## Pending — Inter-service wiring

| Origin | → | Destination | Method | Needed for |
|--------|---|------------|--------|-----------|
| **build-service** | → | product-service | Feign | Get component technical info |
| **build-service** | → | compatibility-service | Feign | Validate component compatibility |
| **build-service** | → | provider-service | Feign | Query external references |
| **estimate-service** | → | build-service | RestClient | Get full build configuration |
| **estimate-service** | → | product-service | RestClient | Get updated prices for sum |
| **estimate-service** | → | notification-service | RestClient | Notify user of estimate |
| **hardware-advisor** | → | build-service | Feign | Analyze current user build |
| **hardware-advisor** | → | product-service | Feign | Get catalog for suggestions |
| **hardware-advisor** | → | compatibility-service | Feign | Validate recommended components |
| **hardware-advisor** | → | notification-service | Feign | Notify recommendations |

---

## Not Started

- **provider-service** :8086 — scaffolded (Application + test only), needs full implementation
- **auth-service** :8081 — advanced (JWT, Spring Security, bcrypt)
- **api-gateway** :8080 — advanced (route proxying, JWT auth filter)
