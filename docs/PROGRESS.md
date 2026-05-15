# PROGRESS.md

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
- [ ] JWT auth filter
- [ ] Route proxying setup
- [ ] Tests

### auth-service :8081

- [ ] Model / Entity (Credential)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests
- [ ] BCrypt password hashing
- [ ] JWT token generation / validation

### user-service :8082

- [ ] Model / Entity (User)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### category-service :8084

- [ ] Model / Entity (Category, AttributeDefinition)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### product-service :8083

- [ ] Model / Entity (Product, ProductAttribute)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests
- [ ] RestClient → category-service

### compatibility-service :8085

- [ ] Model / Entity (CompatibilityRule, CompatibilityCheck)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### provider-service :8086

- [ ] Model / Entity (Provider, ProviderProduct)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### build-service :8087

- [ ] Model / Entity (Build, BuildItem)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### estimate-service :8088

- [ ] Model / Entity (Estimate)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### hardware-advisor :8089

- [ ] Model / Entity (Recommendation)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests

### notification-service :8090

- [ ] Model / Entity (NotificationLog)
- [ ] Repository
- [ ] DTOs (Request / Response)
- [ ] Service
- [ ] Controller
- [ ] Exception handling
- [ ] Seed data (data.sql)
- [ ] Config (application.yaml + profiles)
- [ ] Application main class
- [ ] Tests
