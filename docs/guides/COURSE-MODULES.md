# Course Modules — DSY1103 Fullstack I Backend

> Módulos del curso alineados al proyecto TarroBuild.
> Cada checkbox representa un concepto/deliverable que debe estar presente en los microservicios donde aplica.

---

### Module 1: Foundation (Lessons 1–9)

CSR layers, REST endpoints, DTOs, validation, error handling, HashMap repository.

- [ ] CSR: Controller / Service / Repository / Model
- [ ] REST endpoints with semantic HTTP codes (200, 201, 204, 400, 404, 409, 500)
- [ ] DTOs as Java records (Request with `@Valid`, Response without)
- [ ] Local `@ExceptionHandler` per service
- [ ] Declarative validation (`@NotBlank`, `@Size`, `@NotNull`)
- [ ] `HashMap<Long, Entity>` repository (pre-JPA)

### Module 2: JPA & Persistence (Lessons 10–11)

- [ ] JPA entities (`@Entity`, `@Id`, `@GeneratedValue`)
- [ ] `JpaRepository<T, Long>` with derived queries
- [ ] H2 in-memory database (h2 profile)
- [ ] Spring profiles: h2 / mysql with `application-{profile}.yaml`
- [ ] `.env` with `spring-dotenv`
- [ ] `DataInitializer`, `data.sql` or Flyway `V2__seed_data.sql` for seed data

### Module 3: JPA Relations (Lesson 12)

- [ ] `@ManyToOne(fetch = FetchType.LAZY)` + `@JoinColumn`
- [ ] `@OneToMany(mappedBy = ...)` with `cascade = ALL`
- [ ] PATCH endpoints for partial updates
- [ ] User entity with unique email

### Module 5: Inter-service Communication (Lesson 14)

- [ ] RestClient
- [ ] FeignClient with `@EnableFeignClients`
- [ ] Fallbacks for fault tolerance
- [ ] Configurable timeouts (connect + read)
- [ ] Fire-and-forget for notifications

### Module 6: Flyway Migrations (Lesson 15)

- [ ] `flyway-core` + `flyway-mysql` dependencies
- [ ] Versioned migrations (`V1__`, `V2__`, etc.)
- [ ] Per-profile migration directories
- [ ] `ddl-auto: validate` in production

### Module 7: Spring Security (Lesson 16)

- [ ] `spring-boot-starter-security`
- [ ] Authentication with STATELESS sessions (JWT)
- [ ] BCryptPasswordEncoder
- [ ] Roles: USER / ADMIN
- [ ] `@PreAuthorize` with custom permission logic
- [ ] Public vs. protected vs. admin-only endpoints

### Module 8: Logging (Lesson 17)

- [ ] `@Slf4j` from Lombok on Services
- [ ] `log.info()` on create / update / delete
- [ ] Log levels per profile
- [ ] Correlation ID for request tracing

### Module 9: Global Exception Handling (Lesson 18)

- [ ] `@ControllerAdvice` with `GlobalExceptionHandler`
- [ ] `IllegalArgumentException` → 400
- [ ] `MethodArgumentNotValidException` → 400
- [ ] `EntityNotFoundException` → 404
- [ ] `BadCredentialsException` → 401
- [ ] `AccessDeniedException` → 403
- [ ] Generic `Exception` → 500
- [ ] Dev (stack trace) vs. prod (message only) responses
