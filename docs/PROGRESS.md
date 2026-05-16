# PROGRESS.md

> Course module checklist: [`docs/guides/COURSE-MODULES.md`](./guides/COURSE-MODULES.md)

---

## Functional requirements (RF)

- [ ] **RF-01** — Register user with bcrypt
- [ ] **RF-02** — Authenticate user (JWT)
- [ ] **RF-03** — List catalog components
- [ ] **RF-04** — Component detail
- [ ] **RF-05** — Filter by category/brand/price
- [ ] **RF-06** — Create build
- [ ] **RF-07** — Manage build items
- [ ] **RF-08** — Compatibility check
- [ ] **RF-09** — Power consumption estimate
- [ ] **RF-10** — Reference prices from providers
- [ ] **RF-11** — Consolidated build analysis
- [ ] **RF-12** — Save favorite builds
- [ ] **RF-13** — Upgrade recommendations
- [ ] **RF-14** — CRUD components/attributes
- [ ] **RF-15** — CRUD compatibility rules
- [ ] **RF-16** — CRUD price references
- [ ] **RF-17** — Price/availability alerts
- [ ] **RF-18** — Auto-notifications

## Non-functional requirements (RNF)

- [ ] **RNF-01** — Response < 500ms
- [ ] **RNF-02** — Validation + semantic HTTP codes
- [ ] **RNF-03** — Structured logs with correlation ID
- [ ] **RNF-04** — Independent DB per service
- [ ] **RNF-05** — REST-only inter-service communication
- [ ] **RNF-06** — BCrypt password encryption

## User stories (HU)

- [ ] **HU-01** — User registration
- [ ] **HU-02** — Authentication
- [ ] **HU-03** — Catalog exploration
- [ ] **HU-04** — Build creation
- [ ] **HU-05** — Compatibility validation
- [ ] **HU-06** — Cost estimation
- [ ] **HU-07** — Component recommendations
- [ ] **HU-08** — Build history
- [ ] **HU-09** — System notifications
- [ ] **HU-10** — Admin catalog management

---

## Services

### api-gateway :8080

- [ ] Config (application.yml routes)
- [ ] JWT auth filter (Module 7)
- [ ] Route proxying setup (Module 7)
- [ ] Logging with `@Slf4j` (Module 8)
- [ ] GlobalExceptionHandler (Module 9)
- [ ] Tests

### auth-service :8081

- [ ] Model / Entity (Credential) (Module 2)
- [ ] Repository (Module 2)
- [ ] DTOs (Request / Response) (Module 1)
- [ ] Service (Module 1)
- [ ] Controller (Module 1)
- [ ] Exception handling (Module 1)
- [ ] Seed data (admin + test users) (Module 2)
- [ ] `@OneToMany` User -> Credential (Module 3)
- [ ] BCrypt password hashing (Module 7)
- [ ] JWT token generation / validation (Module 7)
- [ ] Roles: USER / ADMIN (Module 7)
- [ ] Flyway migrations (Module 6)
- [ ] Logging with `@Slf4j` (Module 8)
- [ ] GlobalExceptionHandler (Module 9)
- [ ] Tests

### user-service :8082

- [x] Model / Entity (User) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (20 users) (Module 2)
- [x] User with unique email (Module 3)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### category-service :8084

- [x] Model / Entity (Category, AttributeDefinition) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (8 categories, ~30 attributes) (Module 2)
- [x] `@OneToMany` Category -> AttributeDefinition (Module 3)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### product-service :8083

- [x] Model / Entity (Product, ProductAttribute) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (32 products, ~100 attributes) (Module 2)
- [x] `@OneToMany` Product -> ProductAttribute (Module 3)
- [x] RestClient → category-service (Module 5)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### compatibility-service :8085

- [x] Model / Entity (CompatibilityRule, CompatibilityCheck) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (5 rules) (Module 2)
- [ ] FeignClient → product-service (Module 5)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### provider-service :8086

- [x] Model / Entity (Provider, ProviderProduct) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (4 providers) (Module 2)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### build-service :8087

- [x] Model / Entity (Build, BuildItem) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [x] Seed data (5 builds, ~25 items) (Module 2)
- [x] `@OneToMany` Build -> BuildItem (Module 3)
- [ ] PATCH /api/builds/{id}/status for partial updates (Module 3)
- [ ] FeignClient → product-service (Module 5)
- [ ] FeignClient → compatibility-service (Module 5)
- [ ] FeignClient → provider-service (Module 5)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### estimate-service :8088

- [x] Model / Entity (Estimate) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [ ] Seed data (Module 2)
- [ ] RestClient → build-service (Module 5)
- [ ] RestClient → product-service (Module 5)
- [ ] RestClient → notification-service (Module 5)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### hardware-advisor :8089

- [x] Model / Entity (Recommendation) (Module 2)
- [x] Repository (Module 2)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [ ] Seed data (Module 2)
- [ ] FeignClient → build-service (Module 5)
- [ ] FeignClient → product-service (Module 5)
- [ ] FeignClient → compatibility-service (Module 5)
- [ ] FeignClient → notification-service (Module 5)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests

### notification-service :8090

- [x] Model / Entity (NotificationLog) (Module 2)
- [x] Repository (in-memory, pre-JPA) (Module 1)
- [x] DTOs (Request / Response) (Module 1)
- [x] Service (Module 1)
- [x] Controller (Module 1)
- [x] Exception handling (Module 1)
- [ ] Migrate to JPA + database (Module 2)
- [ ] Seed data (Module 2)
- [ ] Flyway migrations (Module 6)
- [x] Logging with `@Slf4j` (Module 8)
- [x] GlobalExceptionHandler (Module 9)
- [ ] Tests
