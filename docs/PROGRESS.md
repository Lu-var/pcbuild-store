# PROGRESS.md

---

## Monorepo Structure

- [ ] autoconfigure exclusions for api-gateway and notification-service (no JPA needed)

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

- [ ] Add handleNoResource to GlobalExceptionHandler

---

### product-service :8083
STATUS: not started
Notes: depends on category-service, needs @OneToMany for ProductAttribute

---

### category-service :8084
STATUS: functional
Notes: pure CRUD, no inter-service calls

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

- [ ] Set BuildStatus.DRAFT in @PrePersist, remove field initializer
- [ ] Fix deleteBuild to return boolean instead of void
- [ ] Add handleConflict (EntityExistsException → 409) to GlobalExceptionHandler
- [ ] Add handleNoResource (NoResourceFoundException → 404) to GlobalExceptionHandler

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

---

## Cross-Service Dependencies

- product-service → category-service (category validation)
- build-service → product-service (future item validation)
- compatibility-service → product-service (attribute lookup)
- estimate-service → build-service + product-service (pricing)
- hardware-advisor-service → compatibility + product + build
- notification-service ← estimate-service + hardware-advisor-service
- api-gateway → auth-service (JWT filter)

---

## Technical Debt

- [ ] Standardize GlobalExceptionHandler across all services (missing handlers in build-service, user-service)
- [ ] Add @Slf4j logging to all service layers
- [ ] Fix db ambiguity in spec doc (clarify H2=dev, MySQL=prod)

---

# DONE

## Monorepo Structure

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

- [x] Generate Postman collections per service
- [x] Fix hardware-advisor-service db name (db_recommendations → db_advisor)

## user-service :8082

- [x] CRUD endpoints
- [x] DTO records
- [x] GlobalExceptionHandler + ApiError
- [x] Validation annotations
- [x] existsByEmail duplicate check
- [x] deleteUser returns boolean
- [x] Seed data
- [x] Split application.yaml into profiles
- [x] Add @Slf4j logging to UserService
- [x] Make phone nullable in entity and UserRequest

## build-service :8087

- [x] Build CRUD
- [x] BuildItem nested CRUD (/api/builds/{buildId}/items)
- [x] @OneToMany / @ManyToOne relationship
- [x] BuildStatus enum (DRAFT/VALIDATED/INCOMPATIBLE)
- [x] DTO mapping with toResponse helpers
- [x] Seed data
- [x] Cascade delete via orphanRemoval
- [x] existsById check on delete
- [x] @Min(1) on BuildItemRequest.quantity
- [x] GlobalExceptionHandler + ApiError
- [x] @Slf4j on BuildService
- [x] Profile split (h2/mysql)
- [x] @NoArgsConstructor on Build and BuildItem

## category-service :8084

- [x] Define JPA entities (Category, AttributeDefinition, AttributeValueType enum)
- [x] Define DTOs (CategoryRequest, CategoryResponse, AttributeDefinitionRequest, AttributeDefinitionResponse)
- [x] Implement repository methods
- [x] Create service methods (CategoryService, AttributeDefinitionService)
- [x] Create controllers (CategoryController, AttributeDefinitionController)
- [x] GlobalExceptionHandler + ApiError
- [x] Split application.yaml into profiles
- [x] Seed data
