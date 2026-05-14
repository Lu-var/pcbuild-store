# PROGRESS.md

---

## In Progress

- **provider-service** :8086

## Done

- Consolidated GlobalExceptionHandler pattern (EntityExistsException + NoResourceFoundException) across build-service, user-service, and product-service
- Merged AttributeDefinitionController/Service into CategoryController/Service + added duplicate attributeName check
- Merged BuildItemController/Service into BuildController/Service
- Removed @AllArgsConstructor from BuildItem
- Fixed deleteBuild to return boolean
- Added @Slf4j to CategoryService
- Removed JPA/H2/MySQL deps from notification-service (in-memory, no JPA needed)


## Pending

### product-service :8083
- [ ] Wire Feign client to category-service

## Not Started

- **compatibility-service** :8085 — blocked on product-service Feign wiring

- **estimate-service** :8088

- **hardware-advisor-service** :8089

- **notification-service** :8090

- **auth-service** :8081

- **api-gateway** :8080 — scaffolded only