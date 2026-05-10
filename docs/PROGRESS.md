# PROGRESS.md

---

## Monorepo

- [ ] autoconfigure exclusions for api-gateway and notification-service (no JPA needed)
- [x] Parent pom multi-module setup
- [x] 11 service modules scaffolded
- [x] CVE-2026-0636 Bouncy Castle fix
- [x] spring-dotenv + .env setup
- [x] Profile pattern established (h2/mysql)
- [x] pluginManagement in parent pom
- [x] Standardize application.yaml profile split across all services
- [x] rename db_recommendations → db_advisor in hardware-advisor-service
- [x] Fix naming inconsistency in spec doc (hardware-advisor → hardware-advisor-service)

## Technical Debt

- [ ] GlobalExceptionHandler: build-service missing EntityExistsException and NoResourceFoundException handlers, user-service missing NoResourceFoundException handler
- [ ] Fix db ambiguity in spec doc (clarify H2=dev, MySQL=prod)

## Cross-Service Dependencies

- product-service → category-service (category validation)
- build-service → product-service (future item validation)
- compatibility-service → product-service (attribute lookup)
- estimate-service → build-service + product-service (pricing)
- hardware-advisor-service → compatibility + product + build
- notification-service ← estimate-service + hardware-advisor-service
- api-gateway → auth-service (JWT filter)

---

## Services

### api-gateway :8080
STATUS: scaffolded only
Notes: routing config + JWT filter, implement last

---

### auth-service :8081
STATUS: not started
Notes: Spring Security + JWT + BCrypt, late stage

---

### user-service :8082
STATUS: functional

- [x] CRUD endpoints
- [x] DTO records
- [x] GlobalExceptionHandler + ApiError (EntityNotFound, validation, generic)
- [x] Validation annotations
- [x] existsByEmail duplicate check
- [x] deleteUser returns boolean
- [x] Seed data
- [x] Split application.yaml into profiles
- [x] @Slf4j logging in UserService
- [x] Phone nullable
- [ ] Add NoResourceFoundException handler to GlobalExceptionHandler

---

### product-service :8083
STATUS: functional
Notes: depends on category-service (placeholder always throws until Feign wiring)

- [x] JPA entities (Product, ProductAttribute) — @NoArgsConstructor only, @PrePersist for defaults
- [x] DTOs (Request/Response records)
- [x] Repository layer
- [x] ProductService with CRUD + attribute management
- [x] ProductController
- [x] GlobalExceptionHandler + ApiError (EntityNotFound, EntityExists, NoResourceFound, validation)
- [x] @Slf4j logging
- [x] Category validation placeholder (always throws)
- [x] Product attribute ownership checks (update and delete use findByIdAndProductId)
- [x] Seed data
- [x] Profile split (h2/mysql)

---

### category-service :8084
STATUS: functional
Notes: pure CRUD, no inter-service calls

- [x] JPA entities (Category, AttributeDefinition, AttributeValueType enum)
- [x] DTOs (Request/Response records)
- [x] Repository layer
- [x] CategoryService + CategoryController
- [x] AttributeDefinitionService + AttributeDefinitionController
- [x] GlobalExceptionHandler + ApiError (EntityNotFound, EntityExists, NoResourceFound, validation)
- [x] Profile split (h2/mysql)
- [x] Seed data
- [ ] Merge AttributeDefinitionController + AttributeDefinitionService into CategoryController + CategoryService
- [ ] Fix Category.isActive: move field initializer to @PrePersist (inconsistent with Product pattern)
- [ ] Add @Slf4j to CategoryService
- [ ] Add duplicate attributeName check in createAttribute

---

### compatibility-service :8085
STATUS: not started
Notes: depends on product attributes model being defined first

---

### provider-service :8086
STATUS: not started
Notes: pure CRUD, no inter-service calls, fast win

---

### build-service :8087
STATUS: functional

- [x] Build CRUD
- [x] BuildItem nested CRUD (/api/builds/{buildId}/items)
- [x] @OneToMany / @ManyToOne with orphanRemoval
- [x] BuildStatus enum (DRAFT/VALIDATED/INCOMPATIBLE)
- [x] DTO records with toResponse helpers
- [x] Seed data
- [x] Cascade delete
- [x] @Min(1) on BuildItemRequest.quantity
- [x] GlobalExceptionHandler + ApiError (EntityNotFound, validation, generic)
- [x] @Slf4j on BuildService
- [x] Profile split (h2/mysql)
- [ ] Remove @AllArgsConstructor from Build and BuildItem (no callers, bypasses field initializers)
- [ ] Move BuildStatus.DRAFT from field initializer to @PrePersist (defensive for any constructor)
- [ ] Merge BuildItemController + BuildItemService into BuildController + BuildService
- [ ] Fix deleteBuild to return boolean instead of void (currently throws EntityNotFoundException)
- [ ] Add EntityExistsException handler (→ 409) to GlobalExceptionHandler
- [ ] Add NoResourceFoundException handler (→ 404) to GlobalExceptionHandler

---

### estimate-service :8088
STATUS: not started
Notes: depends on build-service + product-service

---

### hardware-advisor-service :8089
STATUS: not started
Notes: depends on compatibility + product + build, needs concrete rule logic prepared for defense

---

### notification-service :8090
STATUS: not started
Notes: thin service, in-memory ConcurrentHashMap, no JPA needed
