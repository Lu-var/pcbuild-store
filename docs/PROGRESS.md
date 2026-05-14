# PROGRESS.md

---

## In Progress

### provider-service :8086 — leaf (no outbound calls)
- scaffolded (Application + test class)

## Pending

### Inter-service wiring (per service)

#### build-service :8087 — Feign
- [ ] Wire to product-service
- [ ] Wire to compatibility-service
- [ ] Wire to provider-service

#### hardware-advisor :8089 — Feign
- [ ] Wire to build-service
- [ ] Wire to product-service
- [ ] Wire to compatibility-service
- [ ] Wire to notification-service

#### estimate-service :8088 — RestClient
- [ ] Wire to build-service
- [ ] Wire to product-service
- [ ] Wire to notification-service

#### auth-service :8081 — RestClient
- [ ] Wire to user-service

#### api-gateway :8080 — RestClient
- [ ] Wire to auth-service

## Done

- Consolidated GlobalExceptionHandler (EntityExistsException + NoResourceFoundException) across build-service, user-service, product-service

- Merged AttributeDefinitionController + BuildItemController into parent controllers, duplicate attributeName check

- Cleaned up BuildItem (removed @AllArgsConstructor, deleteBuild returns boolean, @Slf4j on CategoryService)

- Removed JPA/H2/MySQL deps from notification-service (in-memory, no JPA)

- Realigned inter-service wiring: RestClient for single-endpoint calls, Feign for multi-endpoint orchestration

- Wired product-service → category-service via RestClient (`CategoryRestClient`, `CategoryValidationService`, `RestClientConfig`, env var config) — endpoint tests 66/66 pass

## Not Started

- **compatibility-service** :8085 — leaf (no outbound calls)
- **estimate-service** :8088 — RestClient
- **hardware-advisor-service** :8089 — Feign
- **notification-service** :8090 — leaf (no outbound calls)
- **auth-service** :8081 — RestClient
- **api-gateway** :8080 — RestClient