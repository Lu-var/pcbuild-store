<!-- START OF FILE: docs_lessons_INDICE_COMPLETO.md -->
# Documento: docs lessons INDICE COMPLETO
---
# 📚 Índice Completo del Curso — 19 Lecciones

## 🎓 Estructura del Curso

### ⚫ Pre-requisitos (Lección 0)
Herramientas y versionado

| # | Título | Estado |
|---|--------|--------|
| 00 | Git & GitHub | ✅ Completada |

---

### 🟢 Fundamentos (Lecciones 1-4)
Conceptos básicos de web, HTTP y REST

| # | Título | Estado |
|---|--------|--------|
| 01 | Web y HTTP | ✅ Completada |
| 02 | APIs y REST | ✅ Completada |
| 03 | Tu Primera API | ✅ Completada |
| 04 | Responsabilidades | ✅ Completada |

---

### 🟡 Desarrollo Backend (Lecciones 5-10)
Construcción de aplicación completa

| # | Título | Status |
|---|--------|--------|
| 05 | POST y Validación | ✅ Completada |
| 06 | CRUD Completo | ✅ Completada |
| 07 | Manejo de Errores | ✅ Completada |
| 08 | DTOs y Mapeo | ✅ Completada |
| 09 | Repositorio Customizado | ✅ Completada |
| 10 | Introducción a JPA | ✅ Completada |

---

### 🔵 Bases de Datos y Relaciones (Lecciones 11-13)
Persistencia avanzada

| # | Título | Status | Destacado |
|---|--------|--------|-----------|
| 11 | Configuración de BD | ✅ Completada | **Perfiles Spring Boot + Variables de Entorno** |
| 12 | Relaciones JPA | ✅ Completada | **One-to-Many, Many-to-Many** |
| 13 | Historial y Auditoría | ✅ Completada | **Tracking de cambios** |

---

### 🟣 Producción I (Lecciones 14-15)
Migraciones y comunicación entre servicios

| # | Título | Status | Destacado |
|---|--------|--------|-----------|
| 14 | Migraciones Flyway | ✅ Completada | **SQL Versionado (H2=JPA, MySQL/Supabase=Flyway)** |
| 15 | Microservicios | ✅ Completada | **RestTemplate y FeignClient** |

---

### 🔴 Producción II (Lecciones 16-18)
Seguridad, auditoría y manejo de errores

| # | Título | Status | Destacado |
|---|--------|--------|-----------|
| 16 | Spring Security | ✅ Completada | **Autenticación + Autorización, Roles ADMIN/USER** |
| 17 | Logging | ✅ Completada | **SLF4J + Logback, Niveles DEBUG/INFO/WARN/ERROR** |
| 18 | Exception Handling Global | ✅ Completada | **@ControllerAdvice, Respuestas Uniformes** |

---

## 📖 Navegación Recomendada

```
Pre-requisitos
├─ Lección 0 (Git)

Principiante
├─ Lecciones 1-4  (Conceptos básicos)
└─ Lecciones 5-6  (Primera API funcional)

Intermedio
├─ Lecciones 7-10 (Backend completo)
├─ Lección 11     (Múltiples BD)
├─ Lección 12     (Relaciones JPA)
└─ Lección 13     (Auditoría)

Avanzado
├─ Lección 14     (Migraciones profesionales)
├─ Lección 15     (Microservicios)
├─ Lección 16     (Seguridad)
├─ Lección 17     (Logging)
└─ Lección 18     (Manejo global de errores)
```

---

## 🎯 Lección 11 — Configuración de Bases de Datos

**Tema:** Perfiles de Spring Boot + Variables de Entorno

- ✅ 3 perfiles: H2, MySQL, Supabase
- ✅ Configuración segura con `.env`
- ✅ Carga de variables en IntelliJ IDEA
- ✅ No hardcodear credenciales

**Documentos:** 11 archivos (README, índice, guía paso a paso, ejemplos, cheat sheet, etc)

**Habilidades:**
- [ ] Usar perfiles de Spring Boot
- [ ] Gestionar variables de entorno
- [ ] Cambiar BD sin modificar código Java
- [ ] Proteger credenciales

---

## 🎯 Lección 12 — Relaciones JPA

**Tema:** Modelar relaciones entre entidades

**Habilidades:**
- [ ] One-to-Many y Many-to-One
- [ ] Many-to-Many
- [ ] Lazy vs Eager loading
- [ ] Cascade operations

---

## 🎯 Lección 13 — Historial y Auditoría

**Tema:** Tracking de cambios en la BD

**Habilidades:**
- [ ] Registrar cambios automáticamente
- [ ] Auditoría de datos
- [ ] Versionado de entidades

---

## 🎯 Lección 14 — Migraciones con Flyway

**Tema:** Versionado profesional de cambios de BD

- ✅ Flyway para MySQL y Supabase
- ✅ JPA automático para H2
- ✅ SQL versionado (V1, V2, V3...)
- ✅ Tabla de control `flyway_schema_history`

**Documentos:** 9 archivos (guión, configuración, ejemplos SQL, JPA vs Flyway, troubleshooting)

**Habilidades:**
- [ ] Crear migraciones SQL versionadas
- [ ] Entender diferencia JPA vs Flyway
- [ ] Aplicar migraciones automáticamente
- [ ] Manejar errores de migración

---

## 🎯 Lección 15 — Comunicación entre Microservicios

**Tema:** HTTP entre servicios independientes

- ✅ RestTemplate (simple y flexible)
- ✅ FeignClient (automático y elegante)
- ✅ Manejo de errores y timeouts
- ✅ Fallbacks y resilencia

**Documentos:** 9 archivos (guión, comparación, ejemplos, manejo de errores, debugging)

**Habilidades:**
- [ ] Implementar comunicación HTTP entre servicios
- [ ] Usar RestTemplate y FeignClient
- [ ] Configurar timeouts y reintentos
- [ ] Implementar fallbacks
- [ ] Debuggear problemas de comunicación

---

## 🛠️ Stack Tecnológico (Completo)

```
Spring Boot 4.0.3
├─ Spring Web MVC (HTTP, REST)
├─ Spring Data JPA (ORM)
├─ Hibernate (JPA implementation)
├─ Flyway (Migraciones)
├─ Lombok (Boilerplate reduction)
├─ Jakarta Validation (@Valid, @NotBlank)
├─ Spring Cloud OpenFeign (Microservicios)
└─ Spring Boot DevTools (Hot reload)

Databases
├─ H2 (En memoria, tests)
├─ MySQL 8.0 (Local vía XAMPP)
└─ PostgreSQL (Supabase en la nube)

Tools
├─ Maven (Builds)
├─ Git (Versionado)
├─ IntelliJ IDEA (IDE)
└─ Docker (Opcional)
```

---

## 📊 Progresión de Complejidad

```
Lección 1-4:    Fundamentos         ░░░░░░░░░░ (7%)
Lección 5-6:    API simple          ░░░░░░░░░░░░░░░ (20%)
Lección 7-10:   Backend práctico    ░░░░░░░░░░░░░░░░░░░░░░░░░░░ (47%)
Lección 11:     BD múltiples        ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ (60%)
Lección 12-13:  Relaciones/Auditría ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ (73%)
Lección 14:     Migraciones Flyway  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ (87%)
Lección 15:     Microservicios      ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ (100%)
```

---

## ✅ Requisitos Mínimos por Lección

### Lección 11
- ✅ 4 archivos YAML configurados (application + h2/mysql/supabase)
- ✅ `.env.example` creado
- ✅ Variables de entorno funcionales
- ✅ App arranca con todos los perfiles

### Lección 12-13
- ✅ (Relaciones y auditoría - según lecciones originales)

### Lección 14
- ✅ Flyway en `pom.xml`
- ✅ Migraciones V1, V2, V3 creadas (mysql y supabase)
- ✅ Tabla `flyway_schema_history` con 3+ registros
- ✅ Logs muestran "Successfully applied N migrations"

### Lección 15
- ✅ Cliente HTTP implementado (RestTemplate o FeignClient)
- ✅ Comunicación entre 2 servicios funcional
- ✅ Manejo de errores y fallback
- ✅ Timeouts configurados
- ✅ Tests con mocks

---

## 🚀 Próximos Pasos (Opcional)

Después de las 13 lecciones, puedes explorar:

- 🔐 **Autenticación:** JWT, OAuth, Spring Security
- 📊 **Logging:** SLF4J, Logback
- 🔍 **Monitoreo:** Prometheus, Grafana
- 🐳 **Containerización:** Docker, Docker Compose
- ☸️ **Orquestación:** Kubernetes
- 📈 **CI/CD:** GitHub Actions, GitLab CI
- 🔄 **Message Queues:** RabbitMQ, Kafka
- 📚 **API Documentation:** Swagger/OpenAPI

---

## 📞 Soporte

- 📖 Documentación oficial: https://spring.io/projects/spring-boot
- 🔧 Maven Central: https://mvnrepository.com
- 💬 Stack Overflow: Tag `spring-boot`
- 🤝 Comunidad: r/SpringBoot, Spring Community

---

**Última actualización:** Abril 2026  
**Versión:** 2.0 (15 lecciones completas)  
**Estado:** ✅ Listo para producción

---

*[← Volver a Lecciones](../)*



<!-- START OF FILE: docs_lessons_00_enunciado_proyecto.md -->
# Documento: docs lessons 00 enunciado proyecto
---
# El proyecto: Sistema de Soporte Técnico — Tickets

> Documento de requerimientos del proyecto para las lecciones 01-18

---

## 1. Identificación del problema

Un equipo de soporte técnico recibe solicitudes de ayuda todos los días: equipos que no funcionan, accesos bloqueados, sistemas caídos. Hoy gestionan todo por correo y por teléfono.

El problema es evidente: no hay registro, no hay seguimiento, no hay forma de saber qué está pendiente y qué ya fue resuelto. Cuando alguien pregunta *"¿en qué quedó mi problema?"*, nadie tiene una respuesta clara.

El sistema debe permitir a los usuarios **registrar, consultar, actualizar y cerrar** solicitudes de soporte (tickets), con trazabilidad completa de cada cambio y comunicación automática con servicios externos.

---

## 2. Actores del sistema

| Actor | Descripción |
|-------|------------|
| **USER** | Usuario final que reporta problemas y hace seguimiento a sus tickets |
| **AGENT** | Técnico de soporte que recibe, trabaja y resuelve tickets asignados |
| **ADMIN** | Administrador que gestiona usuarios, categorías, etiquetas y supervisa el sistema |

---

## 3. Requerimientos del sistema

### Scope 1: Lecciones 01-09 — CRUD de Tickets

Solo existe la entidad Ticket.

| ID | Descripción |
|----|------------|
| RF-01 | Consultar tickets con filtro opcional por estado y orden por fecha |
| RF-02 | Registrar nuevo ticket con título, descripción, estado NEW, fecha de creación y fecha estimada (5 días) |
| RF-03 | Actualizar título o descripción de un ticket |
| RF-04 | Eliminar un ticket |
| RF-05 | Consultar ticket por identificador |

**Req. No Funcionales:**

| ID | Descripción |
|----|------------|
| RNF-01 | Persistir tickets en memoria (sobreviven reinicio de la aplicación) |

### Scope 2: Lecciones 10-18 — Sistema Extendido

Se agregan User, Category, Tag, relaciones, TicketHistory, Notification, Audit y seguridad.

| ID | Descripción |
|----|------------|
| RF-07 | Gestionar usuarios (crear, modificar, desactivar) con roles |
| RF-08 | Gestionar categorías (crear, listar) |
| RF-09 | Gestionar etiquetas (crear, listar) |
| RF-10 | Asignar ticket a agente (creador y asignado no pueden ser el mismo) |
| RF-11 | Ver tickets asignados a un agente |
| RF-12 | Registrar historial automático de cambios de estado |
| RF-13 | Enviar notificaciones al crear, asignar o cambiar estado de ticket |
| RF-14 | Registrar eventos de auditoría por ticket |
| RF-15 | Consultar auditoría por ticket |
| RF-16 | Autenticar usuarios y controlar acceso por roles |

---

## 4. Solución Propuesta

El sistema utiliza una arquitectura de microservicios donde cada servicio tiene su propia base de datos y se comunica vía HTTP.

```mermaid
flowchart TB
    TS[Ticket Service<br/>:8080]
    NS[Notification Service<br/>:8081]
    AS[Audit Service<br/>:8082]
    
    TS -->|"HTTP POST"| NS
    TS -->|"HTTP POST"| AS
```

**Justificación:** La separación permite escalar servicios independientemente, mantener bases de datos propias y desarrollar funcionalidades de notificación y auditoría de forma independiente al core de tickets.

---

## 5. Casos de Uso

### Scope 1: Lecciones 01-09 — CRUD de Tickets

| Caso | Descripción |
|------|-------------|
| CU-01 | Crear un ticket con título y descripción |
| CU-02 | Listar todos los tickets |
| CU-03 | Ver detalle de un ticket |
| CU-04 | Actualizar título o descripción de un ticket |
| CU-05 | Eliminar un ticket |
| CU-06 | Filtrar tickets por estado |

### Scope 2: Lecciones 10-18 — Sistema Extendido

| Caso | Descripción |
|------|-------------|
| CU-07 | Crear categoría |
| CU-08 | Crear etiqueta |
| CU-09 | Crear usuario con rol |
| CU-10 | Asignar ticket a un agente |
| CU-11 | Ver tickets asignados |
| CU-12 | Registrar cambio de estado en historial |
| CU-13 | Enviar notificación al crear ticket |
| CU-14 | Enviar notificación al asignar agente |
| CU-15 | Registrar evento de auditoría |
| CU-16 | Iniciar sesión con credenciales |
| CU-17 | Validar permisos por rol |

---

## 6. Microservicios

> En este proyecto, solo **Notification Service** y **Audit Service** son microservicios separados.
> **Ticket Service** extiende sus funcionalidades con User, Category, Tag y TicketHistory en el mismo proyecto.

### 6.1 Ticket Service (Core + Extensiones)

| Campo | Descripción |
|-------|------------|
| **Puerto** | 8080 |
| **Responsabilidad** | Gestionar tickets, usuarios, categorías, etiquetas y su historial |
| **Entidades** | Ticket, User, Category, Tag, TicketHistory |
| **Endpoints** | /tickets, /users, /categories, /tags |

### 6.2 Notification Service

| Campo | Descripción |
|-------|------------|
| **Puerto** | 8081 |
| **Responsabilidad** | Enviar y almacenar notificaciones |
| **Entidades** | Notification |
| **Endpoints** | POST/GET /api/notifications |
| **Comunicación** | Llamado por Ticket Service |

### 6.3 Audit Service

| Campo | Descripción |
|-------|------------|
| **Puerto** | 8082 |
| **Responsabilidad** | Registrar y consultar eventos de auditoría |
| **Entidades** | AuditLog |
| **Endpoints** | POST/GET /api/audit |
| **Comunicación** | Llamado por Ticket Service |

---

## 7. Modelo de Datos

> **Scope 1 (01-09):** Solo Ticket

### Ticket

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único |
| title | String | Título del ticket |
| description | String | Descripción del problema |
| status | String | Estado: NEW, IN_PROGRESS, RESOLVED, CLOSED |
| createdAt | LocalDateTime | Fecha de creación |
| estimatedResolutionDate | LocalDate | Fecha estimada (5 días) |
| effectiveResolutionDate | LocalDateTime | Fecha de resolución |

> **Scope 2 (10-18):** Entidades adicionales

### User

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único |
| name | String | Nombre |
| email | String | Correo electrónico |
| role | Enum | USER, AGENT, ADMIN |
| active | Boolean | Estado activo |

### Category

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único |
| name | String | Nombre |
| description | String | Descripción |

### Tag

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único |
| name | String | Nombre |
| color | String | Color visualize |

### TicketHistory

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único |
| ticketId | Long | ID del ticket |
| oldStatus | String | Estado anterior |
| newStatus | String | Estado nuevo |
| changedAt | LocalDateTime | Fecha del cambio |

---

## 8. Endpoints del Sistema

### Scope 1 (01-09): Ticket Service

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| GET | /tickets | Listar tickets |
| GET | /tickets/{id} | Ver ticket |
| POST | /tickets | Crear ticket |
| PUT | /tickets/{id} | Actualizar ticket |
| DELETE | /tickets/{id} | Eliminar ticket |
| GET | /tickets?status= | Filtrar por estado |

### Scope 2 (10-18): Servicios Extendidos

**Ticket Service (extendido)**

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| GET | /categories | Listar categorías |
| POST | /categories | Crear categoría |
| GET | /tags | Listar etiquetas |
| POST | /tags | Crear etiqueta |
| GET | /tickets/{id}/history | Ver historial |

**User Service**

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| GET | /users | Listar usuarios |
| GET | /users/{id} | Ver usuario |
| POST | /users | Crear usuario |
| PUT | /users/{id} | Actualizar usuario |
| DELETE | /users/{id} | Desactivar usuario |
| POST | /tickets/{id}/assign/{userId} | Asignar ticket |
| GET | /tickets/assigned-to-me | Tickets asignados |

**Notification Service**

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| POST | /api/notifications | Crear notificación |
| GET | /api/notifications | Listar notificaciones |

**Audit Service**

| Método | Endpoint | Descripción |
|--------|---------|-------------|
| POST | /api/audit | Registrar evento |
| GET | /api/audit | Listar eventos |
| GET | /api/audit/ticket/{id} | Eventos por ticket |

---

## 9. Mapa de Implementación por Lección

### Scope 1: Lecciones 01-09 — CRUD de Tickets

| Lección | Funcionalidad |
|--------|--------------|
| 01-04 | Estructura proyecto + GET /tickets |
| 05 | POST /tickets + validaciones |
| 06 | GET /tickets/{id} + PUT /tickets |
| 07 | DELETE + errores |
| 08 | DTOs + filtros |
| 09 | Persistencia H2 |

### Scope 2: Lecciones 10-18 — Sistema Extendido

| Lección | Funcionalidad |
|--------|--------------|
| 10 | User entity con roles + relaciones Ticket-User |
| 11 | Perfiles H2/MySQL/PostgreSQL |
| 12 | Category (One-to-Many) + Tag (Many-to-Many) |
| 13 | TicketHistory automático |
| 14 | Flyway migrations |
| 15 | Microservicios: Notification + Audit |
| 16 | Spring Security |
| 17 | Logging |
| 18 | Exception handling global |

---

## 10. Tecnologías

- **Framework:** Spring Boot 4.0.5
- **Lenguaje:** Java 21
- **ORM:** JPA/Hibernate
- **BD:** H2, MySQL, PostgreSQL
- **Comunicación:** OpenFeign, RestClient
- **Migraciones:** Flyway

---

**Última actualización:** Abril 2026


<!-- START OF FILE: docs_lessons_00-git-github_01_objetivo_y_alcance.md -->
# Documento: docs lessons 00-git-github 01 objetivo y alcance
---
# Lección 00 - Git & GitHub: ¿Qué vas a aprender?

## ¿De dónde venimos?

Eres nuevo en programación profesional. Hasta ahora trabajaste solo en tu computadora.

Problema: sin versionado, cuando colaboras con otros:
- No sabes qué cambió
- No puedes revertir errores
- Los cambios se pierden
- No hay historial

---

## ¿Qué vas a construir?

Al terminar esta lección:

1. **Crear un repositorio Git local**
2. **Hacer commits** (fotos del código)
3. **Subir a GitHub** (servidor)
4. **Trabajar con branches** (paralelo a main)
5. **Hacer pull requests** (colaboración)

### Flujo real en equipo

```
Tú creas rama "feature-x"
    ↓
Haces 3 commits con cambios
    ↓
Subes a GitHub (git push)
    ↓
Creas Pull Request
    ↓
Compañero revisa código
    ↓
Si está bien → "Merge a main"
    ↓
main se actualiza automáticamente
```

---

## Requerimientos

| ID | Requerimiento |
|----|---------------|
| **REQ-G01** | Repo local funcional con `.git/` |
| **REQ-G02** | Mínimo 5 commits con mensajes descriptivos |
| **REQ-G03** | Repo público en GitHub |
| **REQ-G04** | Branch secundaria + pull request |
| **REQ-G05** | Entender `.gitignore` |

---

## Estructura

```
Antes:
└── Código local sin historial

Después:
├── .git/                    (historial)
├── .gitignore              (qué ignorar)
├── README.md               (documentación)
└── Tu código               (rastreado)

Servidor (GitHub):
└── Tu repositorio público (código + historial)
```

---

## No cubre esta lección

- Git avanzado (rebase, cherry-pick)
- CI/CD (automatización)
- Git hooks

Foco: **flujo básico para trabajo en equipo**.



<!-- START OF FILE: docs_lessons_00-git-github_02_guion_paso_a_paso.md -->
# Documento: docs lessons 00-git-github 02 guion paso a paso
---
# Lección 00 - Tutorial paso a paso: Git & GitHub

## Paso 1: Instalar Git

**Windows:**
```bash
choco install git
# o descargar de https://git-scm.com
```

**Verificar:**
```bash
git --version
```

## Paso 2: Configuración global

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
git config --global core.autocrlf true  # Windows
```

## Paso 3: Crear repositorio local

En tu carpeta del proyecto:

```bash
cd C:\Users\tu\IdeaProjects\DSY1103-FULLSTACK-I-BACKEND\Tickets
git init
```

Resultado: aparece carpeta `.git/` (oculta).

## Paso 4: Crear .gitignore

Archivo `Tickets/.gitignore`:

```
target/
.idea/
*.class
*.jar
.env
.DS_Store
node_modules/
```

## Paso 5: Primer commit

```bash
git add .                    # Preparar todos los cambios
git commit -m "Setup inicial"   # Primer snapshot
```

## Paso 6: Crear cuenta GitHub

1. Ir a https://github.com/signup
2. Crear cuenta
3. Verificar email

## Paso 7: Crear repo en GitHub

1. Click "+New repository"
2. Nombre: `DSY1103-FULLSTACK-I-BACKEND`
3. Descripción: `Curso Spring Boot - Sistema de Tickets`
4. Public (para que vea profesor)
5. Crear

GitHub te da comandos. Ejecuta:

```bash
git remote add origin https://github.com/tu-usuario/DSY1103-FULLSTACK-I-BACKEND.git
git branch -M main
git push -u origin main
```

## Paso 8: Hacer cambios y push

```bash
# Editas algo...
git add .
git commit -m "Agregar endpoint /health"
git push
```

En GitHub verás los cambios automáticamente.

## Paso 9: Crear rama de feature

```bash
git checkout -b feature/nuevaFuncion
# Haces cambios...
git add .
git commit -m "Implementar login"
git push origin feature/nuevaFuncion
```

## Paso 10: Pull Request

En GitHub:
1. Click "Compare & pull request"
2. Escribe descripción
3. Click "Create pull request"
4. Revisor aprueba
5. Click "Merge pull request"

main ahora incluye tus cambios.



<!-- START OF FILE: docs_lessons_00-git-github_03_flujo_completo.md -->
# Documento: docs lessons 00-git-github 03 flujo completo
---
# Lección 00 - Flujo completo: Local → GitHub

## Scenario: Trabajar en equipo

```
Tú: trabajas en "feature-security"
Compañero: trabaja en "feature-logging"
Main: siempre estable

    main (v1.0)
     |
     +--- feature-security  (tú)
     |     └─ commit: agregar @PreAuthorize
     |     └─ commit: BCrypt password
     |     └─ push origin feature-security
     |
     +--- feature-logging   (compañero)
           └─ commit: agregar @Slf4j
           └─ push origin feature-logging

    Cuando ambos terminen:
    feature-security → PR → Review → Merge a main
    feature-logging  → PR → Review → Merge a main
    
    main tiene ambas features
```

## Comandos esenciales

```bash
# Ver estado
git status

# Ver historial
git log --oneline

# Ver cambios no commiteados
git diff

# Deshacer cambio (cuidado!)
git checkout -- archivo.java

# Cambiar entre ramas
git checkout main
git checkout feature-x

# Traer cambios del servidor
git pull

# Revertir último commit (sin borrar cambios)
git reset --soft HEAD~1
```

## Buenas prácticas

✅ **DO:**
- Commits pequeños y con propósito
- Mensajes claros: "Agregar validación de email"
- Push al menos 1x por día
- PR antes de merge a main
- Revisar código de otros

❌ **DON'T:**
- Commits gigantes (10 cambios distintos)
- Mensaje vacío: "."
- Trabajar solo en main
- Merge sin revisar
- Commitear .class, .jar, .env

## Conflictos (cuando pasa)

```
Tú cambias línea 10 de UserService.java
Compañero también cambia línea 10

Result: CONFLICT
Solution:
1. Abre archivo
2. Ve <<< CONFLICT >>> y ===
3. Elige cuál quieres (o ambos)
4. git add .
5. git commit -m "Resolver conflicto"
6. git push
```



<!-- START OF FILE: docs_lessons_00-git-github_04_troubleshooting.md -->
# Documento: docs lessons 00-git-github 04 troubleshooting
---
# Lección 00 - Troubleshooting

## Problema 1: "fatal: not a git repository"

**Causa:** Ejecutaste `git status` en carpeta sin `.git/`

**Solución:**
```bash
cd Tickets/
git init
```

## Problema 2: "error: src refspec main does not match any"

**Causa:** No hay commits aún

**Solución:**
```bash
git add .
git commit -m "Setup inicial"
git push -u origin main
```

## Problema 3: Cambios perdidos

**Causa:** Editaste archivo pero no commiteaste, cambio de rama

**Solución:**
```bash
git reflog                    # Ver historial
git checkout <commit-hash>    # Recuperar
```

## Problema 4: Quiero deshacer último commit

**Opción 1:** Sin borrar cambios
```bash
git reset --soft HEAD~1
```

**Opción 2:** Borrando cambios
```bash
git reset --hard HEAD~1
```

## Problema 5: Conflicto en merge

**Síntoma:** Archivos con `<<<<<<< HEAD`

**Solución:**
1. Abre el archivo
2. Resuelve manualmente (elige cuál código mantener)
3. `git add .`
4. `git commit -m "Resolver conflicto"`

## Problema 6: Acidental commit de .env

**Prevención:**
```bash
echo ".env" >> .gitignore
```

**Arreglo (si ya lo commitiste):**
```bash
git rm --cached .env
git commit -m "Remove .env from tracking"
```



<!-- START OF FILE: docs_lessons_00-git-github_05_actividad_individual.md -->
# Documento: docs lessons 00-git-github 05 actividad individual
---
# Lección 00 - Actividad individual

## Objetivo

Dominar Git y GitHub para trabajar en equipo profesionalmente.

---

## Requisitos

1. **Repo local funcional**
   - [ ] `git init` ejecutado
   - [ ] `.gitignore` creado
   - [ ] Mínimo 5 commits

2. **Repo en GitHub**
   - [ ] Cuenta creada
   - [ ] Repositorio público
   - [ ] Push exitoso a main

3. **Branch de feature**
   - [ ] Rama creada desde main
   - [ ] Pull request hecha
   - [ ] Mergeado a main

4. **Buenas prácticas**
   - [ ] Mensajes de commit descriptivos
   - [ ] `.env` no committeado
   - [ ] README.md con descripción

---

## Pasos

### Paso 1: Setup local (10 min)

```bash
cd Tickets
git init
git config user.name "Tu Nombre"
git config user.email "tu@email.com"

# Crear .gitignore con:
# target/, .idea/, *.class, .env, etc

git add .
git commit -m "Setup inicial del proyecto"
```

### Paso 2: GitHub (10 min)

1. Crear repo en GitHub
2. Ejecutar:
```bash
git remote add origin https://github.com/tu-usuario/repo.git
git branch -M main
git push -u origin main
```

### Paso 3: Feature branch (15 min)

```bash
git checkout -b feature/mejora-seguridad
# Haces cambios
git add .
git commit -m "Agregar validación de email"
git push origin feature/mejora-seguridad
```

### Paso 4: Pull request (10 min)

En GitHub:
- Click "Compare & pull request"
- Escribe descripción
- Merge a main

---

## Checklist entrega

- [ ] Repo local con `.git/`
- [ ] Mínimo 5 commits con mensajes claros
- [ ] Repositorio público en GitHub
- [ ] Branch secundaria creada
- [ ] Pull request mergeada
- [ ] `.env` en `.gitignore`
- [ ] README.md presente

---

## Desafío extra

- Crear 3 branches diferentes de features
- Hacer 2 PRs simultáneas
- Resolver un conflicto de merge manualmente



<!-- START OF FILE: docs_lessons_00-git-github_README.md -->
# Documento: docs lessons 00-git-github README
---
# Lección 00 - Git & GitHub: Control de Versiones

## ¿Qué es Git?

Sistema de control de versiones que registra cambios en tu código. Sin Git:

```
proyecto.zip
proyecto_v2.zip
proyecto_v2_final.zip
proyecto_v3_REAL_FINAL.zip  ← ¿Cuál es la verdadera?
```

Con Git:

```
commit 1: Setup inicial
commit 2: Agregar funcionalidad X
commit 3: Bugfix en X
commit 4: Revertir cambios de X

Todo rastreable, reversible, colaborativo.
```

---

## Quick Start

### Instalación

```bash
# Windows
choco install git
# o descargar: https://git-scm.com

# Linux/macOS
brew install git
```

### Configuración inicial

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@email.com"
```

---

## Conceptos clave

- **Repository:** Carpeta con historial de cambios
- **Commit:** Foto del código en un momento específico
- **Branch:** Línea paralela de desarrollo
- **Push:** Enviar cambios a servidor (GitHub)
- **Pull:** Traer cambios del servidor

---

## Flujo básico

```
1. git init          ← Inicializar repo local
2. git add .         ← Preparar cambios
3. git commit -m "msg"  ← Grabar cambios
4. git push          ← Enviar a GitHub
```

---

## Próxima: Lección 1

**L01 - Web y HTTP:** Conceptos fundamentales de la web



<!-- START OF FILE: docs_lessons_01-web-and-http_01_objetivo_y_alcance.md -->
# Documento: docs lessons 01-web-and-http 01 objetivo y alcance
---
# Lección 01 - La Web y HTTP: ¿qué vas a aprender?

## ¿De dónde venimos?

Esta es la primera lección del curso. Llegas sin conocimientos previos de desarrollo backend, o quizás con algo de experiencia en frontend, pero sin claridad sobre qué pasa "del otro lado". Este es el punto de partida.

Antes de escribir una sola línea de código de servidor, necesitas entender el terreno en el que vas a trabajar: **cómo funciona la web** y **cómo se comunican los programas a través de internet**.

---

## ¿Qué vas a aprender?

Al terminar esta lección serás capaz de explicar:

- Qué es la Web y cómo se diferencia de Internet
- Qué rol cumplen el **cliente** y el **servidor** en una comunicación web
- Qué hace el **DNS** y para qué sirve
- Cómo funciona el protocolo **HTTP**: qué es, por qué existe y qué problema resuelve
- Qué partes tiene una **petición HTTP** (request)
- Qué partes tiene una **respuesta HTTP** (response)
- Qué son los **métodos HTTP** y cuándo se usa cada uno
- Qué son los **códigos de estado HTTP** y cómo interpretarlos

Esta lección es 100% teórica. No vas a escribir código. Pero al terminarla tendrás el vocabulario y el modelo mental que necesitas para que todo lo que venga después tenga sentido.

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| APIs REST | Primero necesitas entender HTTP; la API es una capa que se construye sobre él |
| Backend vs Frontend | Lo veremos en la lección siguiente, cuando ya tengas el protocolo claro |
| Microservicios | Es un concepto arquitectónico que requiere entender primero qué es un servidor |
| Código Java o Spring Boot | El código viene después; primero el modelo mental |
| HTTPS y seguridad | Es la versión segura de HTTP; se aborda después de entender HTTP básico |

---

## La idea central de esta lección

> "No puedes construir una API sin entender qué hay debajo. HTTP es el idioma; antes de hablar, hay que aprenderlo."

El protocolo HTTP no es magia. Es un conjunto de reglas que todos los programas siguen para poder entenderse. Una vez que lo comprendes, puedes leer cualquier petición o respuesta web como si fuera texto plano, porque en realidad **es** texto plano.

---

## Estructura de esta lección

| Archivo | Contenido |
|---|---|
| `01_objetivo_y_alcance.md` | Este archivo: qué aprenderás y por qué |
| `02_la_web_y_http.md` | La Web, el modelo cliente-servidor, DNS y HTTP |
| `03_request_response_y_codigos.md` | Anatomía de una petición, de una respuesta, métodos y códigos de estado |
| `04_checklist_rubrica_minima.md` | Criterios mínimos de evaluación |
| `05_actividad_individual.md` | Actividades investigativas y reflexivas |




<!-- START OF FILE: docs_lessons_01-web-and-http_02_la_web_y_http.md -->
# Documento: docs lessons 01-web-and-http 02 la web y http
---
# Lección 01 - La Web y HTTP: cómo funciona todo

Esta sección no es un glosario para memorizar. Es la explicación del mecanismo real detrás de cada sitio web que has usado en tu vida. Léela con calma, más de una vez si es necesario.

---

## Internet vs. la Web: no son lo mismo

Un error muy común es usar "Internet" y "Web" como sinónimos. No lo son.

- **Internet** es la infraestructura: la red física global de cables, routers, fibra óptica y antenas que conecta dispositivos entre sí. Es como la red de carreteras del país.
- **La Web** (World Wide Web) es un *servicio* que corre sobre esa infraestructura. Es el sistema que permite acceder a páginas y recursos usando el protocolo HTTP. Es como el sistema de transporte que usa esas carreteras.

Existen otros servicios que también usan Internet pero no son la Web: el correo electrónico (protocolo SMTP/IMAP), la transferencia de archivos (FTP), los videojuegos en línea, etc.

> **En este curso trabajamos con la Web**: construimos servidores que hablan HTTP y responden peticiones que llegan desde navegadores, aplicaciones móviles u otros servicios.

---

## El modelo cliente-servidor

Toda comunicación en la Web sigue el mismo patrón básico:

```mermaid
sequenceDiagram
    participant Client as Cliente
    participant Server as Servidor
    Client->>Server: petición (request)
    Server-->>Client: respuesta (response)
```

### ¿Qué es un cliente?

Un **cliente** es cualquier programa que *inicia* una comunicación y *solicita* algo. Ejemplos:

- Un navegador web (Chrome, Firefox, Safari)
- Una aplicación móvil que consulta datos de un servidor
- Postman o Insomnia (herramientas para probar APIs)
- Otro servidor que consume servicios de un tercero

El cliente **siempre inicia** la comunicación. El servidor *espera* y *responde*.

### ¿Qué es un servidor?

Un **servidor** es un programa (no necesariamente una máquina física especial) que *escucha* peticiones y *devuelve* respuestas. Ejemplos:

- Un servidor web como Apache o Nginx que sirve archivos HTML
- Una aplicación Spring Boot que devuelve datos en JSON
- Un servidor de base de datos que responde consultas SQL

La diferencia clave no está en el hardware, sino en el rol: el servidor escucha y responde; el cliente pregunta y espera.

> **Importante:** un mismo programa puede ser cliente y servidor al mismo tiempo. Por ejemplo, tu aplicación Spring Boot es un servidor para el navegador, pero actúa como cliente si consulta una base de datos o llama a otra API.

---

## ¿Cómo sabe el cliente dónde encontrar al servidor?

Cuando escribes `https://www.duoc.cl` en el navegador, no escribes una dirección IP como `200.27.240.10`. Escribes un nombre legible para humanos. Alguien tiene que traducir ese nombre a una dirección real de red. Ese "alguien" es el **DNS**.

### DNS: el directorio telefónico de Internet

**DNS** (Domain Name System) es un sistema distribuido que traduce nombres de dominio legibles (`www.duoc.cl`) a direcciones IP (`200.27.240.10`) que las computadoras usan para encontrarse.

El proceso ocurre automáticamente y en milisegundos, pero los pasos son:

```
1. Escribes "www.duoc.cl" en el navegador
2. Tu computadora pregunta al servidor DNS configurado (usualmente el de tu proveedor de internet o Google 8.8.8.8): "¿Cuál es la IP de www.duoc.cl?"
3. El DNS responde: "200.27.240.10"
4. Tu navegador se conecta directamente a esa IP
5. El servidor en esa IP responde con el contenido
```

> **Analogía:** el DNS es como la agenda de contactos de tu teléfono. Buscas "Mamá" y el teléfono sabe que eso corresponde al número `+56 9 XXXX XXXX`. No tienes que memorizar el número; solo el nombre.

---

## ¿Qué es HTTP?

Una vez que el cliente sabe la dirección IP del servidor, necesita un **lenguaje común** para comunicarse con él. Ese lenguaje es **HTTP**.

**HTTP** (HyperText Transfer Protocol) es el protocolo de comunicación de la Web. Define las reglas sobre:

- **Cómo formatear una petición** para que el servidor la entienda
- **Cómo formatear una respuesta** para que el cliente la entienda
- **Qué tipos de operaciones existen** (obtener, crear, modificar, eliminar)
- **Cómo indicar si algo salió bien o mal**

HTTP es un protocolo **de texto**: las peticiones y respuestas son cadenas de texto con un formato muy específico. No hay magia ni binario. Si pudieras interceptar la comunicación entre tu navegador y un servidor, verías texto plano que cualquier humano puede leer.

### Características fundamentales de HTTP

#### Sin estado (stateless)

HTTP no tiene memoria entre peticiones. Cada petición es completamente independiente de la anterior. El servidor no sabe quién eres ni qué pediste antes, a menos que el cliente le envíe esa información explícitamente (por ejemplo, usando cookies o tokens de autenticación).

> **Implicación práctica:** si quieres que el servidor te "recuerde" entre peticiones (por ejemplo, para mantener una sesión de usuario), tú eres responsable de enviar esa información en cada petición.

#### Basado en texto

Todas las peticiones y respuestas HTTP son texto. Esto las hace fáciles de leer, depurar y entender sin herramientas especiales.

#### Sin conexión persistente por defecto (en HTTP/1.0)

En HTTP/1.0, cada petición abría una nueva conexión TCP y la cerraba al terminar. HTTP/1.1 introdujo las conexiones persistentes (keep-alive) para reutilizar la misma conexión. HTTP/2 y HTTP/3 mejoran esto aún más con multiplexación, pero el modelo básico de petición-respuesta no cambia.

---

## Versiones de HTTP

| Versión | Año | Lo más importante |
|---|---|---|
| HTTP/1.0 | 1996 | El original. Una conexión por petición. |
| HTTP/1.1 | 1997 | Conexiones persistentes. El más usado durante décadas. |
| HTTP/2 | 2015 | Múltiples peticiones en paralelo sobre una sola conexión (multiplexación). Más rápido. |
| HTTP/3 | 2022 | Basado en UDP en lugar de TCP. Más eficiente en redes inestables. |

> **Para este curso** trabajamos con HTTP/1.1. Es el que todos los navegadores, herramientas y servidores soportan sin configuración especial. Los principios que aprenderás aplican igual a HTTP/2 y HTTP/3.

---

## ¿Qué es una URL?

Antes de hablar de peticiones, necesitas entender el formato de una URL (Uniform Resource Locator), que es la dirección que identifica un recurso en la Web.

```
https://api.ejemplo.com:8080/usuarios/42?formato=json#seccion
  │         │              │      │      │              │
  │         │              │      │      │              └─ Fragmento (solo en navegador)
  │         │              │      │      └─ Query string (parámetros)
  │         │              │      └─ Ruta del recurso
  │         │              └─ Puerto (8080)
  │         └─ Dominio (host)
  └─ Protocolo (scheme)
```

| Parte | Nombre | Descripción |
|---|---|---|
| `https` | Protocolo | Cómo se comunican. `http` o `https` (la versión segura) |
| `api.ejemplo.com` | Host / Dominio | Dónde está el servidor |
| `:8080` | Puerto | Por cuál "puerta" entrar. Por defecto es 80 para HTTP y 443 para HTTPS |
| `/usuarios/42` | Ruta (path) | Qué recurso específico se solicita |
| `?formato=json` | Query string | Parámetros opcionales para filtrar o modificar la petición |
| `#seccion` | Fragmento | Posición dentro de la página. Solo lo usa el navegador; no llega al servidor |

> **Para el desarrollo de APIs**, lo que más te interesa es la **ruta** y el **query string**. El protocolo y el host los configura el servidor. Los fragmentos no son relevantes en APIs.

---

## Puertos: las puertas del servidor

Un servidor puede tener muchos servicios corriendo al mismo tiempo. Los **puertos** son la forma de distinguirlos: cada servicio escucha en un puerto diferente, como distintas puertas de un edificio.

Algunos puertos relevantes:

| Puerto | Uso común |
|---|---|
| 80 | HTTP (web sin cifrar) |
| 443 | HTTPS (web con cifrado TLS) |
| 8080 | HTTP alternativo (muy usado en desarrollo) |
| 3306 | MySQL |
| 5432 | PostgreSQL |
| 6379 | Redis |

Cuando desarrollas con Spring Boot, por defecto usa el **puerto 8080**. Por eso accedes a tu aplicación con `http://localhost:8080`.

> **`localhost`** es el nombre de dominio especial que siempre apunta a tu propia máquina. Su IP equivalente es `127.0.0.1`. Cuando dices "abrir `localhost:8080`", estás diciendo "conectarme al servicio que está corriendo en el puerto 8080 de mi propia computadora".

---

## Resumen del flujo completo

Juntando todo lo que vimos, el flujo completo desde que escribes una URL hasta que ves el resultado es:

```
1. Escribes https://www.duoc.cl/noticias en el navegador

2. [DNS] El navegador consulta al DNS: "¿Cuál es la IP de www.duoc.cl?"
         DNS responde: "200.27.240.10"

3. [TCP] El navegador establece una conexión TCP con 200.27.240.10 en el puerto 443 (HTTPS)

4. [TLS] Se negocia el cifrado (porque es HTTPS)

5. [HTTP] El navegador envía una petición HTTP:
         GET /noticias HTTP/1.1
         Host: www.duoc.cl
         ...

6. [Servidor] El servidor procesa la petición y devuelve una respuesta HTTP:
         HTTP/1.1 200 OK
         Content-Type: text/html
         ...
         <html>...</html>

7. [Navegador] El navegador recibe la respuesta y muestra la página
```

Este mismo flujo ocurre, con pequeñas variaciones, en cada petición que hace tu aplicación a un servidor. Cuando construyes una API con Spring Boot, **tu aplicación es el paso 6** de este flujo: espera peticiones y devuelve respuestas.




<!-- START OF FILE: docs_lessons_01-web-and-http_03_request_response_y_codigos.md -->
# Documento: docs lessons 01-web-and-http 03 request response y codigos
---
# Lección 01 - Request, Response, Métodos y Códigos HTTP

Ahora que sabes qué es HTTP y cómo funciona la Web, es hora de ver el contenido de las peticiones y respuestas. Esta sección es especialmente importante porque vas a leer y escribir estas estructuras constantemente cuando trabajes con APIs.

---

## Anatomía de una petición HTTP (Request)

Una petición HTTP tiene siempre la misma estructura: tres partes en un orden específico, separadas por líneas en blanco.

```http
POST /usuarios HTTP/1.1
Host: api.ejemplo.com
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
Accept: application/json

{
  "nombre": "Ana Torres",
  "email": "ana@ejemplo.com"
}
```

### Parte 1: Línea de inicio (Request Line)

```
POST /usuarios HTTP/1.1
```

Contiene exactamente tres elementos:

| Elemento | Qué es | En el ejemplo |
|---|---|---|
| Método | Qué tipo de operación se solicita | `POST` |
| Ruta (path) | Qué recurso se solicita | `/usuarios` |
| Versión HTTP | Qué versión del protocolo se usa | `HTTP/1.1` |

Esta línea es **obligatoria** en toda petición HTTP. Sin ella, el servidor no sabe qué se le está pidiendo.

### Parte 2: Cabeceras (Headers)

```
Host: api.ejemplo.com
Content-Type: application/json
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
Accept: application/json
```

Las cabeceras son **metadatos** de la petición: información adicional que le da contexto al servidor sobre quién hace la petición, qué formato tiene el cuerpo, qué formato se espera en la respuesta, etc.

Son pares `Clave: Valor`, uno por línea. Algunas cabeceras comunes:

| Cabecera | Qué informa |
|---|---|
| `Host` | El dominio del servidor al que va la petición. **Obligatoria en HTTP/1.1** |
| `Content-Type` | El formato del cuerpo que se envía (ej: `application/json`, `text/plain`) |
| `Accept` | El formato que el cliente puede recibir en la respuesta |
| `Authorization` | Credenciales o token de autenticación |
| `User-Agent` | Información del cliente (navegador, sistema operativo) |
| `Content-Length` | Tamaño en bytes del cuerpo de la petición |

El cliente puede incluir tantas cabeceras como necesite. El servidor también puede ignorar las que no entiende.

### Parte 3: Cuerpo (Body)

```json
{
  "nombre": "Ana Torres",
  "email": "ana@ejemplo.com"
}
```

El cuerpo contiene **los datos que el cliente envía al servidor**. Es la "carga útil" de la petición. No siempre existe: las peticiones `GET` y `DELETE` generalmente no tienen cuerpo, porque solo piden información o solicitan eliminar algo identificado por la URL, sin necesidad de enviar datos adicionales.

Cuando el cuerpo existe, la cabecera `Content-Type` le indica al servidor cómo interpretarlo.

> **Separador importante:** entre las cabeceras y el cuerpo siempre hay **una línea en blanco**. Esta línea vacía es parte del protocolo; sin ella el servidor no sabe dónde terminan las cabeceras y dónde empieza el cuerpo.

---

## Anatomía de una respuesta HTTP (Response)

La respuesta tiene la misma estructura de tres partes, con una diferencia: la primera línea no es una línea de método sino una **línea de estado**.

```http
HTTP/1.1 201 Created
Content-Type: application/json
Location: /usuarios/98

{
  "id": 98,
  "nombre": "Ana Torres",
  "email": "ana@ejemplo.com",
  "creadoEn": "2026-03-19T10:30:00Z"
}
```

### Parte 1: Línea de estado (Status Line)

```
HTTP/1.1 201 Created
```

| Elemento | Qué es | En el ejemplo |
|---|---|---|
| Versión HTTP | Qué versión usa el servidor | `HTTP/1.1` |
| Código de estado | Un número que resume el resultado | `201` |
| Texto de estado | Una descripción legible del código | `Created` |

### Parte 2: Cabeceras de respuesta

```
Content-Type: application/json
Location: /usuarios/98
```

El servidor también usa cabeceras para dar contexto sobre la respuesta:

| Cabecera | Qué informa |
|---|---|
| `Content-Type` | El formato del cuerpo de la respuesta |
| `Content-Length` | Tamaño del cuerpo en bytes |
| `Location` | La URL del recurso recién creado (útil en respuestas `201 Created`) |
| `Cache-Control` | Instrucciones sobre caching |
| `Set-Cookie` | Solicita al cliente que guarde una cookie |

### Parte 3: Cuerpo de la respuesta

```json
{
  "id": 98,
  "nombre": "Ana Torres",
  "email": "ana@ejemplo.com",
  "creadoEn": "2026-03-19T10:30:00Z"
}
```

El cuerpo contiene la **respuesta real**: el recurso solicitado, el mensaje de error, la confirmación de la operación, etc. En las APIs modernas el formato más común es **JSON** (JavaScript Object Notation).

---

## Los métodos HTTP

Los métodos HTTP (también llamados "verbos HTTP") indican **qué tipo de operación** quiere realizar el cliente. Cada método tiene una semántica específica y convenciones sobre si puede tener cuerpo, si es seguro y si es idempotente.

### Los métodos principales

| Método | Operación | ¿Tiene cuerpo? | Uso típico |
|---|---|---|---|
| `GET` | Obtener un recurso | No | Leer datos. No modifica nada. |
| `POST` | Crear un recurso | Sí | Crear un nuevo registro |
| `PUT` | Reemplazar un recurso completo | Sí | Actualizar completamente un recurso existente |
| `PATCH` | Modificar parcialmente un recurso | Sí | Actualizar solo algunos campos |
| `DELETE` | Eliminar un recurso | No (usualmente) | Borrar un registro |

### ¿Qué significa "seguro" e "idempotente"?

Dos propiedades importantes de los métodos HTTP:

**Seguro (safe):** el método no modifica el estado del servidor. Solo *lee*. `GET` es seguro. `POST` no lo es.

**Idempotente (idempotent):** hacer la misma petición una vez o diez veces produce el mismo resultado. `PUT` es idempotente: si envías los mismos datos cinco veces, el recurso queda igual que si lo enviaste una. `POST` no es idempotente: enviarlo cinco veces crea cinco recursos distintos.

| Método | ¿Seguro? | ¿Idempotente? |
|---|---|---|
| `GET` | ✅ Sí | ✅ Sí |
| `POST` | ❌ No | ❌ No |
| `PUT` | ❌ No | ✅ Sí |
| `PATCH` | ❌ No | ❌ No (puede serlo según implementación) |
| `DELETE` | ❌ No | ✅ Sí (eliminar algo que ya no existe sigue siendo el mismo resultado) |

> Estas propiedades no las hace cumplir el protocolo automáticamente. Las cumple o viola **el código que escribes**. Si haces un `GET` que modifica la base de datos, estás violando la semántica del protocolo aunque técnicamente funcione.

### Métodos menos comunes pero útiles

| Método | Uso |
|---|---|
| `HEAD` | Igual que `GET` pero sin cuerpo en la respuesta. Útil para verificar si un recurso existe o revisar sus cabeceras |
| `OPTIONS` | Pregunta qué métodos acepta el servidor para una URL. Lo usan los navegadores en peticiones CORS |

---

## Códigos de estado HTTP

Los códigos de estado son números de tres dígitos que el servidor incluye en cada respuesta para indicar **qué pasó con la petición**. El primer dígito define la categoría.

### Las cinco categorías

| Rango | Categoría | Significado general |
|---|---|---|
| `1xx` | Informativos | La petición fue recibida; el proceso continúa |
| `2xx` | Éxito | La petición fue recibida, entendida y procesada correctamente |
| `3xx` | Redirección | Se necesita una acción adicional para completar la petición |
| `4xx` | Error del cliente | La petición tiene un problema del lado del cliente |
| `5xx` | Error del servidor | El servidor falló al procesar una petición válida |

### Los códigos más importantes para APIs

#### Éxito (2xx)

| Código | Texto | Cuándo usarlo |
|---|---|---|
| `200 OK` | OK | La petición fue exitosa. El cuerpo contiene el resultado. |
| `201 Created` | Created | Se creó un recurso nuevo exitosamente. Incluir cabecera `Location` con la URL del nuevo recurso. |
| `204 No Content` | No Content | La operación fue exitosa pero no hay contenido que devolver (ej: DELETE exitoso). |

#### Error del cliente (4xx)

| Código | Texto | Cuándo usarlo |
|---|---|---|
| `400 Bad Request` | Bad Request | La petición tiene errores de formato o datos inválidos. |
| `401 Unauthorized` | Unauthorized | El cliente no está autenticado. Falta el token o es inválido. |
| `403 Forbidden` | Forbidden | El cliente está autenticado pero no tiene permiso para esta operación. |
| `404 Not Found` | Not Found | El recurso solicitado no existe. |
| `405 Method Not Allowed` | Method Not Allowed | El método HTTP no está permitido para esta URL. |
| `409 Conflict` | Conflict | Hay un conflicto con el estado actual del recurso (ej: email duplicado). |
| `422 Unprocessable Entity` | Unprocessable Entity | Los datos tienen formato correcto pero fallan la validación de negocio. |

#### Error del servidor (5xx)

| Código | Texto | Cuándo usarlo |
|---|---|---|
| `500 Internal Server Error` | Internal Server Error | Error inesperado en el servidor. Nunca debería llegar al cliente en producción. |
| `502 Bad Gateway` | Bad Gateway | El servidor actuó como proxy y recibió una respuesta inválida del servidor de origen. |
| `503 Service Unavailable` | Service Unavailable | El servidor está temporalmente no disponible (mantenimiento o sobrecarga). |

### Cómo leer un código de estado

Un truco simple: si el primer dígito es `2`, algo salió bien. Si es `4`, el problema está en la petición que envió el cliente. Si es `5`, el servidor tiene un problema.

```
200 → éxito, hay contenido
201 → éxito, se creó algo
204 → éxito, no hay contenido

400 → la petición tiene errores
401 → no sé quién eres (falta autenticación)
403 → sé quién eres, pero no tienes permiso
404 → lo que buscas no existe
405 → ese método no está permitido aquí

500 → me rompí por dentro (error del servidor)
```

---

## El flujo completo de una interacción HTTP

Veamos un ejemplo concreto de principio a fin: un cliente que consulta el perfil de un usuario.

**Petición:**
```http
GET /usuarios/42 HTTP/1.1
Host: api.ejemplo.com
Accept: application/json
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```

**Respuesta exitosa (el usuario existe):**
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "id": 42,
  "nombre": "Carlos Martínez",
  "email": "carlos@ejemplo.com"
}
```

**Respuesta si el usuario no existe:**
```http
HTTP/1.1 404 Not Found
Content-Type: application/json

{
  "error": "Usuario no encontrado",
  "codigo": 404
}
```

**Respuesta si el token es inválido:**
```http
HTTP/1.1 401 Unauthorized
Content-Type: application/json
WWW-Authenticate: Bearer realm="api.ejemplo.com"

{
  "error": "Token inválido o expirado"
}
```

Esta interacción, con sus variantes, es el patrón que repetirás cientos de veces al construir y consumir APIs.

---

## Herramientas para inspeccionar HTTP

Para trabajar con APIs necesitas herramientas que te permitan construir y enviar peticiones HTTP arbitrarias (no solo `GET` desde el navegador):

| Herramienta | Tipo | Cuándo usarla |
|---|---|---|
| **Postman** | GUI de escritorio | Probar APIs visualmente. La más usada en equipos de desarrollo. |
| **Insomnia** | GUI de escritorio | Alternativa a Postman, más liviana. |
| **curl** | Línea de comandos | Probar APIs desde la terminal. Disponible en cualquier sistema. |
| **DevTools del navegador** | Integrado en el navegador | Ver las peticiones que hace una página web (pestaña "Network") |

> **Recomendación:** instala Postman ahora. Lo usarás desde la lección 03 en adelante para probar todos los endpoints que construyas.

Ejemplo de una petición con `curl`:
```bash
curl -X GET "http://localhost:8080/greetings" \
     -H "Accept: text/plain"
```

Este comando hace exactamente lo mismo que escribir `http://localhost:8080/greetings` en el navegador, pero desde la terminal y con control total sobre las cabeceras.




<!-- START OF FILE: docs_lessons_01-web-and-http_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 01-web-and-http 04 checklist rubrica minima
---
# Lección 01 - Lista de verificación: ¿llegué al mínimo requerido?

Usa esta lista para revisar tu comprensión antes de avanzar a la lección siguiente. Esta lección es teórica: el criterio de evaluación no es código que funcione, sino conceptos que puedas explicar con tus propias palabras.

---

## ¿Qué significa "entender" en esta lección?

Memorizar definiciones no es suficiente. Entender un concepto significa que puedes:

1. **Explicarlo** sin leer este documento
2. **Aplicarlo** a un ejemplo nuevo (no el mismo del tutorial)
3. **Relacionarlo** con otros conceptos de la lección

Cada ítem de la lista tiene una pregunta de verificación. Si no puedes responderla sin mirar, vuelve a leer la sección correspondiente.

---

## IE 1.0.1 - Distinguir Internet de la Web

Checklist:

- [ ] Puedo explicar qué es Internet en una oración
- [ ] Puedo explicar qué es la Web en una oración
- [ ] Puedo dar un ejemplo de un servicio de Internet que NO sea la Web

**Pregunta de verificación:** Un amigo te dice "la web y el internet son lo mismo". ¿Qué le respondes y qué ejemplo le darías para ilustrar la diferencia?

---

## IE 1.0.2 - Modelo cliente-servidor

Checklist:

- [ ] Puedo explicar qué es un cliente y qué es un servidor
- [ ] Puedo describir el flujo petición-respuesta
- [ ] Entiendo que el cliente siempre inicia la comunicación
- [ ] Entiendo que un mismo programa puede actuar como cliente y como servidor

**Pregunta de verificación:** Cuando usas la aplicación de Instagram en tu teléfono, ¿quién es el cliente y quién es el servidor? ¿Qué pasa si ese servidor necesita pedirle datos a otro servidor?

---

## IE 1.0.3 - DNS y URL

Checklist:

- [ ] Puedo explicar para qué sirve el DNS con una analogía
- [ ] Puedo identificar las partes de una URL: protocolo, host, puerto, ruta, query string
- [ ] Sé qué significa `localhost` y por qué lo usamos en desarrollo
- [ ] Sé por qué el puerto por defecto para HTTP es 80 y para el desarrollo con Spring Boot es 8080

**Pregunta de verificación:** Analiza esta URL: `http://localhost:8080/api/productos?categoria=electronica&pagina=2`. Identifica cada parte y explica qué representa.

---

## IE 1.0.4 - Protocolo HTTP y sus características

Checklist:

- [ ] Puedo explicar qué es HTTP y para qué existe
- [ ] Entiendo qué significa que HTTP es "sin estado" (stateless)
- [ ] Puedo explicar la implicación práctica del stateless en el desarrollo de APIs
- [ ] Conozco las diferencias principales entre HTTP/1.1 y HTTP/2

**Pregunta de verificación:** ¿Por qué si cierras el navegador y lo vuelves a abrir, la mayoría de los sitios te piden que inicies sesión de nuevo? ¿Qué característica de HTTP explica este comportamiento?

---

## IE 1.0.5 - Anatomía del Request y Response

Checklist:

- [ ] Puedo nombrar las tres partes de una petición HTTP: línea de inicio, cabeceras, cuerpo
- [ ] Puedo nombrar las tres partes de una respuesta HTTP: línea de estado, cabeceras, cuerpo
- [ ] Sé qué hace la cabecera `Content-Type` y por qué es importante
- [ ] Entiendo cuándo una petición tiene cuerpo y cuándo no

**Pregunta de verificación:** Escribe (de memoria, sin copiar) el esqueleto de una petición HTTP que crea un usuario. ¿Qué método usarías? ¿Qué cabeceras incluirías? ¿Qué iría en el cuerpo?

---

## IE 1.0.6 - Métodos HTTP

Checklist:

- [ ] Puedo asociar cada método HTTP (`GET`, `POST`, `PUT`, `PATCH`, `DELETE`) con su operación
- [ ] Entiendo qué significa que un método es "seguro" y qué implica
- [ ] Entiendo qué significa que un método es "idempotente" y qué implica
- [ ] Puedo decir cuál método usar dado un requerimiento específico

**Pregunta de verificación:** Un sistema de inventario necesita las siguientes operaciones. ¿Qué método HTTP usarías para cada una?
- Consultar todos los productos disponibles
- Registrar un producto nuevo
- Actualizar el precio de un producto existente
- Marcar un producto como descontinuado (cambiar solo el campo `estado`)
- Eliminar un producto del catálogo

---

## IE 1.0.7 - Códigos de estado HTTP

Checklist:

- [ ] Puedo explicar qué significa cada categoría (2xx, 4xx, 5xx)
- [ ] Puedo distinguir cuándo usar `200`, `201` y `204`
- [ ] Puedo distinguir la diferencia entre `401` y `403`
- [ ] Sé por qué un `500` nunca debería ver el usuario en producción
- [ ] Puedo interpretar un código de estado que no conocía previamente, solo por su primer dígito

**Pregunta de verificación:** Recibes estas respuestas al probar una API. ¿Qué problema indica cada una y dónde buscarías la causa?
- `404 Not Found`
- `401 Unauthorized`
- `500 Internal Server Error`
- `405 Method Not Allowed`




<!-- START OF FILE: docs_lessons_01-web-and-http_05_actividad_individual.md -->
# Documento: docs lessons 01-web-and-http 05 actividad individual
---
# Lección 01 - Actividad individual: investigación y reflexión

Esta actividad no tiene código. Tiene preguntas que requieren que investigues, pienses y escribas tus propias conclusiones. El objetivo es que construyas criterio propio, no que copies definiciones de Wikipedia.

> **Formato de entrega:** un documento Markdown (`.md`) con tus respuestas. Cada sección debe tener título y respuesta redactada en tus propias palabras. El largo mínimo por respuesta es el necesario para que se entienda tu razonamiento; no hay máximo.

---

## Parte 1: Actividades investigativas

Estas actividades requieren que busques información y la sintetices con tus propias palabras.

---

### 🔍 Investigación 1.1 — Inspecciona una petición HTTP real

**Objetivo:** ver HTTP en acción con tus propios ojos, no solo en ejemplos del curso.

**Instrucciones:**

1. Abre el navegador (Chrome o Firefox)
2. Ve a cualquier sitio web que uses regularmente (ej: `reddit.com`, `github.com`, `emol.com`)
3. Abre las DevTools con `F12` o clic derecho → "Inspeccionar"
4. Ve a la pestaña **"Network"** (o "Red" si está en español)
5. Recarga la página con `F5`
6. Haz clic en cualquiera de las peticiones que aparecen en la lista

**Responde en tu documento:**

a) ¿Qué URL visitaste? ¿Cuántas peticiones HTTP se generaron al cargar la página?

b) Selecciona UNA de las peticiones y copia su método HTTP, URL completa y código de respuesta. ¿Qué crees que hace esa petición específica?

c) Mira las cabeceras de respuesta (`Response Headers`). Lista al menos tres cabeceras que encuentres y explica, en tus propias palabras, qué podrían significar (aunque no las hayas visto antes, usa el nombre como pista).

d) ¿Hay peticiones con código `3xx`? ¿A qué URL redirigen? ¿Por qué crees que existen esas redirecciones?

---

### 🔍 Investigación 1.2 — HTTP vs HTTPS

**Objetivo:** entender por qué HTTPS importa y qué problema resuelve.

**Instrucciones:** investiga en fuentes confiables (documentación oficial, MDN Web Docs, artículos técnicos). No uses resúmenes de IA como fuente única; contrasta al menos dos fuentes.

**Responde en tu documento:**

a) ¿Qué diferencia hay entre HTTP y HTTPS a nivel técnico? ¿Qué agrega HTTPS que HTTP no tiene?

b) ¿Qué es TLS? ¿Cuál es su relación con HTTPS?

c) Si alguien interceptara el tráfico de red de un sitio HTTP, ¿qué podría ver? ¿Y si fuera HTTPS?

d) ¿Por qué los navegadores modernos marcan los sitios HTTP como "No seguros"? ¿Qué riesgo concreto existe al usar HTTP para enviar, por ejemplo, una contraseña en un formulario de login?

e) Para el desarrollo local (`localhost`), ¿por qué generalmente se usa HTTP sin problema? ¿Qué hace diferente a `localhost` de un dominio en internet?

---

### 🔍 Investigación 1.3 — Evolución de HTTP

**Objetivo:** entender por qué HTTP sigue evolucionando y qué problemas concretos resuelve cada versión.

**Instrucciones:** investiga las diferencias entre HTTP/1.1, HTTP/2 y HTTP/3.

**Responde en tu documento:**

a) ¿Qué problema concreto de HTTP/1.1 resolvió HTTP/2? ¿Qué es la "multiplexación" y por qué es importante?

b) HTTP/3 usa un protocolo de transporte diferente a HTTP/2. ¿Cuál es y por qué se eligió?

c) ¿Cómo puedes saber qué versión de HTTP usa una página web que visitas? (Pista: las DevTools del navegador te lo dicen.) Inspecciona un sitio grande como `google.com` o `cloudflare.com` y reporta qué versión encontraste.

d) ¿Afecta la versión de HTTP al código que escribirías en Spring Boot? ¿Por qué?

---

## Parte 2: Actividades reflexivas

Estas actividades no tienen una respuesta correcta única. Requieren que analices, compares y defiendas tu posición con argumentos.

---

### 💭 Reflexión 1.4 — Stateless: ¿ventaja o limitación?

HTTP es sin estado (stateless): el servidor no recuerda peticiones anteriores.

**Responde en tu documento:**

a) Piensa en tres aplicaciones web que usas frecuentemente. Para cada una, identifica una funcionalidad que claramente requiere "recordar" al usuario entre peticiones (ej: el carrito de compras de un e-commerce). ¿Cómo crees que esas aplicaciones logran ese "recuerdo" si HTTP es stateless?

b) Imagina que HTTP fuera stateful (con estado): cada conexión se mantendría abierta y el servidor recordaría todo sobre cada usuario. ¿Qué ventajas tendría? ¿Qué problemas crearía si el servidor tiene miles de usuarios simultáneos?

c) ¿Por qué crees que los diseñadores de HTTP eligieron el modelo stateless? ¿Fue una buena decisión?

---

### 💭 Reflexión 1.5 — Semántica de los métodos HTTP

El protocolo HTTP define la semántica de los métodos, pero no la hace cumplir técnicamente. Un servidor podría recibir un `DELETE` y crear un registro, y HTTP no lo impediría.

**Responde en tu documento:**

a) ¿Por qué es importante respetar la semántica de los métodos HTTP aunque el protocolo no lo exija? Piensa en qué pasaría si un equipo de desarrollo decide usar siempre `POST` para todo.

b) Algunos desarrolladores argumentan que `PATCH` es innecesario y que `PUT` podría reemplazarlo siempre. ¿Estás de acuerdo? ¿En qué caso concreto `PATCH` es claramente mejor que `PUT`?

c) Busca en internet algún ejemplo real de una API pública (Twitter/X, GitHub, Spotify, etc.) que use métodos HTTP de forma incorrecta o no convencional. ¿Encontraste alguno? ¿Cómo lo justifican?

---

### 💭 Reflexión 1.6 — Códigos de estado y experiencia de usuario

Los códigos de estado HTTP están pensados para la comunicación entre máquinas. Pero el usuario final también los ve a veces.

**Responde en tu documento:**

a) Cuando un usuario ve un `500 Internal Server Error` en su pantalla, ¿qué significa eso desde la perspectiva técnica? ¿Y desde la perspectiva del usuario? ¿Qué debería mostrar una aplicación bien diseñada en lugar del código crudo?

b) ¿Cuál es la diferencia entre un `404` real (el recurso genuinamente no existe) y un `404` de privacidad (el servidor sabe que el recurso existe pero no quiere revelarlo)? ¿En qué situaciones tiene sentido usar el segundo?

c) Hay un debate en la comunidad sobre si las APIs deberían devolver siempre `200 OK` con información de error en el cuerpo, o si deben usar los códigos de estado correctamente. ¿Cuál enfoque prefieres y por qué?

---

## Criterios de evaluación de la actividad

| Criterio | Descripción |
|---|---|
| **Comprensión** | Las respuestas demuestran entendimiento del concepto, no solo copia de definiciones |
| **Evidencia** | Las investigaciones citan fuentes o evidencia observada (capturas, URLs, etc.) |
| **Argumento** | Las reflexiones presentan una posición clara con al menos un argumento de respaldo |
| **Redacción** | Las respuestas están escritas con claridad y en español correcto |
| **Formato** | El documento está en Markdown, con títulos y estructura legible |

---

## Recursos sugeridos para investigar

- [MDN Web Docs - HTTP](https://developer.mozilla.org/es/docs/Web/HTTP) — La referencia más completa y confiable de HTTP en español
- [HTTP Status Codes](https://httpstatuses.com/) — Referencia rápida de todos los códigos de estado
- [How HTTPS works](https://howhttpsworks.com/) — Explicación visual e interactiva de HTTPS
- [HTTP/3 explained](https://http3-explained.haxx.se/en/) — El libro gratuito sobre HTTP/3 del creador de curl
- [DevTools Network panel](https://developer.chrome.com/docs/devtools/network/) — Guía oficial de Chrome DevTools para el panel Network




<!-- START OF FILE: docs_lessons_02-apis-and-rest_01_objetivo_y_alcance.md -->
# Documento: docs lessons 02-apis-and-rest 01 objetivo y alcance
---
# Lección 02 - Arquitecturas, APIs y REST: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior aprendiste los fundamentos de la comunicación web: qué es HTTP, cómo funciona el intercambio de peticiones y respuestas, qué significan los métodos y los códigos de estado. Tienes el vocabulario del protocolo.

Ahora vamos a subir un nivel de abstracción. Vamos a hablar de **cómo se organizan los sistemas** que usan ese protocolo: quién hace qué, cómo se dividen las responsabilidades, cómo los sistemas se comunican entre sí, y qué convenciones seguimos para que esa comunicación sea predecible y mantenible.

Esta lección te lleva desde "entiendo HTTP" hasta "entiendo cómo se diseña un sistema web moderno". Y eso es exactamente lo que necesitas para que la lección 03 —donde construirás tu primera API— tenga sentido completo.

---

## ¿Qué vas a aprender?

Al terminar esta lección serás capaz de explicar:

- Qué es el **frontend** y qué es el **backend**, y cómo se comunican
- Qué es una arquitectura **monolítica** y cuáles son sus ventajas y desventajas
- Qué son los **microservicios** y en qué contextos tiene sentido usarlos
- Qué es una **API** y para qué sirve
- Qué es **REST** y qué lo diferencia de otros estilos de arquitectura
- Cuáles son las **restricciones de REST** (los 6 principios de Fielding)
- Cuáles son las **buenas prácticas de diseño de APIs REST**: nombres de recursos, uso de métodos, versionado, respuestas consistentes

Esta lección es 100% teórica. No escribirás código, pero al terminarla tendrás los criterios para evaluar si una API está bien o mal diseñada, incluso antes de haber construido la tuya.

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| Implementación en Spring Boot | La lección 03 se encarga de eso |
| Autenticación y autorización (JWT, OAuth) | Requiere entender primero qué es una API y cómo funciona |
| GraphQL o gRPC | Son alternativas a REST; primero dominas REST, luego comparas |
| Documentación de APIs (OpenAPI/Swagger) | Se aborda cuando ya tienes endpoints reales que documentar |
| CORS (Cross-Origin Resource Sharing) | Es un problema que aparece cuando el frontend y el backend están en dominios distintos; lo resolvemos cuando lo encontremos |

---

## La idea central de esta lección

> "Una API REST no es solo un servidor que responde JSON. Es un contrato de comunicación con reglas claras. Aprende las reglas antes de romperlas."

Muchos desarrolladores crean APIs que "funcionan" pero que no siguen las convenciones REST. Eso no importa mientras trabajan solos, pero se convierte en un problema cuando el equipo crece, cuando hay que mantener el sistema o cuando otro servicio necesita consumir esa API sin documentación.

Aprender las convenciones desde el principio te ahorra deuda técnica en el futuro.

---

## Estructura de esta lección

| Archivo | Contenido |
|---|---|
| `01_objetivo_y_alcance.md` | Este archivo: qué aprenderás y por qué |
| `02_arquitecturas_y_roles.md` | Frontend vs Backend, monolito vs microservicios |
| `03_apis_rest_y_buenas_practicas.md` | Qué es una API, qué es REST, principios y buenas prácticas |
| `04_checklist_rubrica_minima.md` | Criterios mínimos de evaluación |
| `05_actividad_individual.md` | Actividades investigativas y reflexivas |




<!-- START OF FILE: docs_lessons_02-apis-and-rest_02_arquitecturas_y_roles.md -->
# Documento: docs lessons 02-apis-and-rest 02 arquitecturas y roles
---
# Lección 02 - Arquitecturas y roles: Frontend, Backend, Monolito y Microservicios

Esta sección explora cómo se organizan los sistemas modernos. Antes de construir una API, necesitas entender el contexto en el que vivirá.

---

## Frontend y Backend: dos mundos que se comunican

Cuando usas una aplicación web, hay dos mundos trabajando juntos aunque nunca los ves al mismo tiempo.

### ¿Qué es el Frontend?

El **frontend** es todo lo que el usuario ve e interactúa directamente. Se ejecuta en el dispositivo del usuario (el navegador, el teléfono), no en el servidor.

Tecnologías típicas de frontend:
- **HTML** → la estructura del contenido
- **CSS** → el estilo visual
- **JavaScript** → la interactividad y lógica del lado del cliente
- **Frameworks:** React, Angular, Vue.js, Svelte

El frontend tiene una limitación fundamental: **no puede guardar datos de forma permanente ni segura**. Puede guardar cosas temporalmente en el navegador (localStorage, cookies), pero esos datos son accesibles y manipulables por el usuario. Para cualquier operación que requiera datos persistentes, lógica de negocio protegida o comunicación con una base de datos, el frontend necesita hablar con el backend.

### ¿Qué es el Backend?

El **backend** es todo lo que corre en el servidor: la lógica de negocio, el acceso a la base de datos, la autenticación, el procesamiento de datos. El usuario nunca lo ve directamente.

Tecnologías típicas de backend:
- **Java + Spring Boot** (lo que usarás en este curso)
- Node.js + Express / NestJS
- Python + Django / FastAPI
- C# + ASP.NET Core
- Go, Rust, Ruby on Rails, PHP Laravel, etc.

El backend tiene acceso a recursos que el frontend no puede tener:
- La base de datos (con credenciales que nunca deben llegar al cliente)
- Servicios externos (APIs de pago, correo, etc.)
- El sistema de archivos del servidor
- Claves y secretos de configuración

### ¿Cómo se comunican?

A través de HTTP, usando el patrón que aprendiste en la lección anterior:

```mermaid
sequenceDiagram
    participant FE as Navegador / App móvil<br/>(Frontend)
    participant BE as Servidor Backend<br/>(Spring Boot)
    participant DB as Base de datos
    
    FE->>BE: GET /productos
    BE->>DB: SELECT * FROM...
    DB-->>BE: [{id:1,...}, ...]
    BE-->>FE: 200 OK [{...}, ...]
```

El frontend envía peticiones HTTP al backend. El backend consulta lo que necesita (base de datos, otros servicios) y devuelve una respuesta, generalmente en formato JSON. El frontend usa esa respuesta para mostrar información al usuario.

### El contrato: la API

La "interfaz" entre el frontend y el backend se llama **API**. Es el conjunto de URLs, métodos y formatos de datos que el backend expone para que el frontend (u otros clientes) los consuman. Lo veremos en detalle en la siguiente sección.

---

## Separación de responsabilidades: ¿por qué no todo en uno?

En los primeros días de la Web, existía el concepto de **aplicaciones "full page"**: el servidor generaba el HTML completo y lo enviaba al navegador. No había separación: el backend generaba la presentación.

Hoy ese modelo todavía existe (se llama **Server-Side Rendering** o SSR), pero la tendencia dominante en aplicaciones modernas es la separación clara entre frontend y backend, con un API como contrato entre ellos.

**Ventajas de separar frontend y backend:**

| Ventaja | Descripción |
|---|---|
| **Un backend, múltiples clientes** | El mismo API puede ser consumido por una app web, una app móvil iOS, una app Android y un bot, todos al mismo tiempo |
| **Equipos independientes** | El equipo de frontend y el de backend pueden trabajar en paralelo mientras respeten el contrato del API |
| **Escalabilidad diferenciada** | Puedes escalar el backend sin tocar el frontend y viceversa |
| **Tecnología independiente** | El frontend puede ser React mientras el backend es Spring Boot; no importa |

---

## Arquitecturas de sistema: Monolito vs Microservicios

Una vez que tienes claro que el backend existe, surge la pregunta: ¿cómo se organiza internamente?

### Arquitectura monolítica

En una arquitectura **monolítica**, toda la lógica del backend vive en **una sola aplicación** que se despliega como una unidad.

```mermaid
flowchart TB
    subgraph Monolito[Monolito]
        direction LR
        M1[Módulo<br/>Usuarios]
        M2[Módulo<br/>Productos]
        M3[Módulo<br/>Pedidos]
    end
    DB[(Base de datos<br/>únida)]
    M1 --- DB
    M2 --- DB
    M3 --- DB
```

**Ventajas del monolito:**

- Más simple de desarrollar al principio
- Más fácil de depurar (todo está en un lugar)
- Una sola base de código para mantener
- No hay latencia de red entre módulos
- Despliegue simple: una sola aplicación

**Desventajas del monolito:**

- A medida que crece, se vuelve difícil de entender y modificar
- Un fallo en un módulo puede tumbar toda la aplicación
- Escalar implica escalar todo, aunque solo un módulo lo necesite
- Los equipos grandes se pisan entre sí en la misma base de código
- El ciclo de despliegue se ralentiza cuando el código crece

> **Para este curso:** construirás monolitos. Es el punto de partida correcto. Entender un monolito bien estructurado es prerequisito para entender por qué y cuándo se migra a microservicios.

### Arquitectura de microservicios

En una arquitectura de **microservicios**, el sistema se divide en **muchos servicios pequeños e independientes**, cada uno responsable de una capacidad de negocio específica.

```mermaid
flowchart TB
    S1[Servicio<br/>Usuarios]
    S2[Servicio<br/>Productos]
    S3[Servicio<br/>Pedidos]
    DB1[(DB propia)]
    DB2[(DB propia)]
    DB3[(DB propia)]
    S1 --- DB1
    S2 --- DB2
    S3 --- DB3
    
    S1 -.-> S2
    S2 -.-> S3
    S3 -.-> S1
    note right: se comunican por HTTP
```

**Ventajas de los microservicios:**

- Cada servicio puede desplegarse de forma independiente
- Un fallo en un servicio no necesariamente afecta a los otros
- Escalabilidad granular: escala solo lo que necesita más recursos
- Equipos autónomos: cada equipo es dueño de su servicio
- Libertad tecnológica: cada servicio puede usar el lenguaje que mejor le convenga

**Desventajas de los microservicios:**

- Mucho más complejo de desarrollar, depurar y operar
- Latencia de red entre servicios (lo que antes era una llamada a función ahora es una petición HTTP)
- Necesitas infraestructura adicional: service discovery, API gateway, monitoreo distribuido, etc.
- Los datos distribuidos hacen que las transacciones sean difíciles
- Requiere un equipo maduro con experiencia en operaciones

### ¿Cuándo usar cada uno?

No existe una respuesta única. La decisión depende del contexto:

| Criterio | Monolito | Microservicios |
|---|---|---|
| Tamaño del equipo | Pequeño (1-10 personas) | Grande (muchos equipos) |
| Madurez del producto | Producto nuevo / explorando | Producto establecido con dominio claro |
| Velocidad de desarrollo inicial | Alta | Baja (overhead de infraestructura) |
| Necesidad de escalabilidad | Moderada | Alta y diferenciada por módulo |
| Complejidad operacional tolerable | Baja | Alta |

> **Una opinión respaldada por la industria:** Martin Fowler (autor de "Refactoring" y "Patterns of Enterprise Application Architecture") recomienda empezar con un monolito bien diseñado y migrar a microservicios solo cuando el monolito se convierte en un problema real. Esto se llama el enfoque **"Monolith First"**.

---

## Los tres niveles de un sistema web moderno

Ahora tienes el cuadro completo. Un sistema web moderno típico tiene tres niveles o "capas":

```mermaid
flowchart TB
    subgraph "Nivel 1: Presentación (Frontend)"
        FE[Navegador / App móvil<br/>React, Angular, Vue]
    end
    subgraph "Nivel 2: Aplicación (Backend)"
        BE[Servidor de aplicación<br/>Spring Boot, Node.js<br/>Lógica de negocio, API]
    end
    subgraph "Nivel 3: Datos (Persistencia)"
        DB[(Base de datos<br/>PostgreSQL, MySQL, MongoDB)]
    end
    
    FE -->|HTTP / JSON| BE
    BE -->|SQL| DB
```
Nivel 1: Presentación (Frontend)
         ┌────────────────────────────┐
         │  Navegador / App móvil     │
         │  React, Angular, Vue       │
         └────────────┬───────────────┘
                      │ HTTP / JSON
Nivel 2: Aplicación (Backend)
         ┌────────────▼───────────────┐
         │   Servidor de aplicación   │
         │   Spring Boot, Node.js...  │
         │   Lógica de negocio, API   │
         └────────────┬───────────────┘
                      │ SQL / protocolo propio
Nivel 3: Datos (Persistencia)
         ┌────────────▼───────────────┐
         │        Base de datos       │
         │  PostgreSQL, MySQL, MongoDB│
         └────────────────────────────┘
```

Este curso se enfoca en el **nivel 2**: el backend. Aprenderás a construir el servidor que recibe peticiones HTTP del frontend (nivel 1), aplica lógica de negocio, y consulta o modifica datos en la base de datos (nivel 3).




<!-- START OF FILE: docs_lessons_02-apis-and-rest_03_apis_rest_y_buenas_practicas.md -->
# Documento: docs lessons 02-apis-and-rest 03 apis rest y buenas practicas
---
# Lección 02 - APIs, REST y buenas prácticas de diseño

Esta sección te enseña qué es una API, qué es REST, y cómo diseñar una API que sea intuitiva, predecible y mantenible.

---

## ¿Qué es una API?

**API** significa *Application Programming Interface* (Interfaz de Programación de Aplicaciones). Es un **contrato** que define cómo dos programas pueden comunicarse entre sí.

Una API especifica:
- Qué operaciones están disponibles
- Cómo pedirlas (formato de la petición)
- Qué esperar como resultado (formato de la respuesta)
- Qué errores pueden ocurrir

### La analogía del menú de restaurante

Imagina un restaurante:

- El **cliente** (tú) no entra a la cocina a preparar su comida directamente
- El **menú** define qué puedes pedir, cómo pedirlo (nombre del plato) y qué recibirás
- El **mozo** actúa como intermediario entre el cliente y la cocina
- La **cocina** (el servidor) procesa el pedido y devuelve el resultado

La API es el menú: define las opciones disponibles sin exponer cómo se prepara cada plato internamente. Puedes cambiar completamente la receta (la implementación) sin que el cliente note la diferencia, siempre que el resultado en el plato (la respuesta) sea el mismo.

### Tipos de APIs

| Tipo | Descripción | Ejemplo |
|---|---|---|
| **API Web / HTTP** | Se accede por HTTP. Es la más común en sistemas modernos. | La API de GitHub, Twitter, Google Maps |
| **API de biblioteca** | Funciones que ofrece una librería para ser usadas en el mismo proceso | `java.util.List`, el SDK de AWS |
| **API del sistema operativo** | Interfaz para acceder a recursos del SO | Llamadas del sistema en Linux |

> **En este curso**, cuando decimos "API", nos referimos siempre a una **API Web HTTP**: un servidor que expone URLs y responde peticiones HTTP.

---

## ¿Qué es REST?

**REST** (Representational State Transfer) es un **estilo arquitectónico** para diseñar APIs web. No es un protocolo ni un estándar; es un conjunto de principios y restricciones propuesto por Roy Fielding en su tesis doctoral del año 2000.

Una API que sigue los principios de REST se llama **API RESTful** o simplemente **API REST**.

> **Importante:** REST usa HTTP, pero no toda API que usa HTTP es REST. Una API es REST cuando sigue los principios de Fielding, no simplemente porque use el protocolo.

---

## Los 6 principios (restricciones) de REST

Fielding definió seis restricciones que una arquitectura debe cumplir para ser considerada REST. Vamos a verlas con ejemplos prácticos.

### 1. Interfaz uniforme (Uniform Interface)

Este es el principio más importante. La interfaz entre cliente y servidor debe ser uniforme y consistente. Se descompone en cuatro sub-restricciones:

**a) Identificación de recursos:** cada recurso tiene una URL única que lo identifica.
```
/usuarios/42        → el usuario con ID 42
/productos/15       → el producto con ID 15
/pedidos/7/items    → los ítems del pedido 7
```

**b) Manipulación a través de representaciones:** el cliente interactúa con los recursos a través de representaciones (JSON, XML), no con los datos internos del servidor.

**c) Mensajes auto-descriptivos:** cada mensaje contiene toda la información necesaria para procesarlo (método HTTP, cabeceras, cuerpo con tipo de contenido declarado).

**d) HATEOAS:** Hypermedia As The Engine Of Application State. Las respuestas incluyen enlaces a acciones relacionadas. Es el principio más avanzado y el menos implementado en la práctica.

### 2. Sin estado (Stateless)

Ya lo viste en la lección anterior: cada petición debe contener toda la información necesaria para ser procesada. El servidor no guarda estado de sesión entre peticiones.

```http
GET /pedidos/123 HTTP/1.1
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```

El token de autorización viaja en CADA petición. El servidor no "recuerda" que ya te identificaste en la petición anterior.

**Consecuencia:** la escalabilidad horizontal es trivial. Puedes agregar más servidores porque ninguno guarda estado; cualquier servidor puede atender cualquier petición.

### 3. Caché (Cacheable)

Las respuestas deben indicar si pueden ser cacheadas o no. Si una respuesta puede cachearse, el cliente puede reutilizarla sin hacer una nueva petición al servidor.

```http
HTTP/1.1 200 OK
Cache-Control: max-age=3600
```

Esto le dice al cliente que puede guardar esta respuesta y reutilizarla durante 1 hora sin volver a pedirla.

**Beneficio:** reduce la carga del servidor y mejora el rendimiento del cliente.

### 4. Sistema de capas (Layered System)

El cliente no necesita saber si está hablando directamente con el servidor final o con un intermediario (proxy, load balancer, CDN, gateway). Cada capa solo conoce la capa inmediatamente adyacente.

```
[Cliente] → [CDN / Cache] → [Load Balancer] → [Servidor A]
                                             → [Servidor B]
```

El cliente envía sus peticiones al mismo endpoint sin importar cuántas capas hay en el medio. Esto permite agregar infraestructura sin cambiar el contrato.

### 5. Code on Demand (opcional)

El servidor puede enviar código ejecutable al cliente (ej: JavaScript). Esta es la única restricción opcional de REST. En la práctica, cuando accedes a un sitio web, el servidor envía HTML, CSS y JavaScript que el navegador ejecuta.

### 6. Cliente-Servidor (Client-Server)

El cliente y el servidor deben estar separados y comunicarse solo a través de la interfaz. El cliente no conoce la implementación interna del servidor; el servidor no conoce la implementación interna del cliente.

**Consecuencia:** pueden evolucionar de forma independiente.

---

## REST en la práctica: diseñando una API

Los principios de Fielding son abstractos. En la práctica diaria, "diseñar una API REST" significa tomar decisiones concretas sobre URLs, métodos y respuestas. Estas son las convenciones más importantes.

---

### Regla 1: Los recursos son sustantivos, no verbos

La URL identifica **qué** se está manipulando, no **qué acción** se realiza. La acción la indica el método HTTP.

```
❌ Mal diseño (verbos en la URL)
GET  /getUsuarios
POST /crearUsuario
POST /eliminarUsuario/42
GET  /buscarProductosPorCategoria?cat=ropa

✅ Buen diseño (sustantivos en la URL)
GET    /usuarios
POST   /usuarios
DELETE /usuarios/42
GET    /productos?categoria=ropa
```

> Si sientes la necesidad de poner un verbo en la URL, casi siempre es señal de que el método HTTP no está siendo usado correctamente.

### Regla 2: Usa sustantivos en plural para las colecciones

Las URLs de colecciones (todos los elementos de un tipo) usan el plural. Las URLs de recursos individuales identifican el elemento con un ID.

```
/usuarios          → colección de todos los usuarios
/usuarios/42       → el usuario con ID 42

/productos         → colección de todos los productos
/productos/15      → el producto con ID 15
```

### Regla 3: Jerarquía para recursos relacionados

Cuando un recurso pertenece a otro, la URL refleja esa jerarquía:

```
/pedidos/7/items         → todos los ítems del pedido 7
/pedidos/7/items/3       → el ítem 3 del pedido 7
/usuarios/42/direcciones → las direcciones del usuario 42
```

**Cuidado:** no anides más de 2-3 niveles. Las URLs demasiado largas se vuelven difíciles de manejar.

```
❌ Demasiada jerarquía
/paises/1/regiones/5/comunas/22/direcciones/8/usuarios
```

Si necesitas más contexto, usa query parameters o rediseña el modelo de datos.

### Regla 4: Los métodos HTTP definen la operación

Aplica consistentemente la semántica de los métodos:

| Operación | Método | URL | Respuesta |
|---|---|---|---|
| Listar todos | `GET` | `/usuarios` | `200 OK` + array |
| Ver uno | `GET` | `/usuarios/42` | `200 OK` + objeto |
| Crear | `POST` | `/usuarios` | `201 Created` + objeto creado |
| Reemplazar completo | `PUT` | `/usuarios/42` | `200 OK` + objeto actualizado |
| Actualizar parcial | `PATCH` | `/usuarios/42` | `200 OK` + objeto actualizado |
| Eliminar | `DELETE` | `/usuarios/42` | `204 No Content` |

### Regla 5: Usa los códigos de estado correctamente

No devuelvas siempre `200 OK`. El código de estado es parte del contrato.

```
❌ Mal: devolver 200 con mensaje de error en el cuerpo
HTTP/1.1 200 OK
{ "status": "error", "message": "Usuario no encontrado" }

✅ Bien: usar el código correcto
HTTP/1.1 404 Not Found
{ "error": "Usuario no encontrado" }
```

El cliente (y las herramientas de monitoreo) toman decisiones basadas en el código de estado. Si siempre devuelves `200`, esas herramientas no pueden distinguir éxito de error.

### Regla 6: Consistencia en los nombres

Elige una convención y aplícala en toda la API:

| Aspecto | Opciones | Recomendación |
|---|---|---|
| Caso de URLs | `camelCase`, `kebab-case`, `snake_case` | `kebab-case` (ej: `/mis-pedidos`) |
| Caso de campos JSON | `camelCase`, `snake_case` | `camelCase` en Java/JS (ej: `fechaCreacion`) |
| Idioma | Español, inglés | Elige uno y no lo mezcles |

```
❌ Inconsistente
/usuarios/{userId}/mis_pedidos
{ "fecha_Creacion": "2026-03-19", "Total": 15000 }

✅ Consistente
/usuarios/{userId}/pedidos
{ "fechaCreacion": "2026-03-19", "total": 15000 }
```

### Regla 7: Versionado de la API

Cuando evoluciona una API, hay que gestionar los cambios sin romper a los clientes que ya la usan. El versionado es la estrategia para esto.

Estrategias comunes:

**a) Versión en la URL (más común y explícita):**
```
/v1/usuarios
/v2/usuarios
```

**b) Versión en la cabecera:**
```http
GET /usuarios HTTP/1.1
Accept: application/vnd.miapp.v2+json
```

**c) Versión como query parameter:**
```
/usuarios?version=2
```

> **Recomendación para este curso:** usa versión en la URL (`/v1/...`). Es la más visible, la más fácil de entender y la más fácil de probar.

### Regla 8: Respuestas de error consistentes

Define una estructura de error uniforme para toda la API y úsala siempre:

```json
{
  "timestamp": "2026-03-19T10:30:00Z",
  "status": 404,
  "error": "Not Found",
  "message": "No existe un usuario con ID 42",
  "path": "/v1/usuarios/42"
}
```

Si tu API siempre devuelve errores en el mismo formato, el frontend puede manejarlos de forma genérica sin casos especiales.

### Regla 9: Filtrado, paginación y ordenamiento

Para colecciones grandes, no devuelvas todos los registros en una sola respuesta. Usa query parameters:

```
/productos?categoria=ropa                  → filtrar
/productos?pagina=2&tamano=20              → paginar
/productos?orden=precio&direccion=asc      → ordenar
/productos?categoria=ropa&pagina=1&orden=precio  → combinar
```

La respuesta debe incluir metadata sobre la paginación:

```json
{
  "datos": [{...}, {...}],
  "pagina": 2,
  "tamano": 20,
  "total": 347,
  "paginas": 18
}
```

---

## REST vs otras alternativas

REST no es la única forma de diseñar APIs. Existen otras que vale conocer:

| Tecnología | Descripción | Cuándo usarla |
|---|---|---|
| **REST** | Basada en HTTP y recursos. Simple y ampliamente soportada. | La mayoría de los casos: APIs públicas, servicios web generales |
| **GraphQL** | El cliente define exactamente qué datos quiere. Un solo endpoint. | Cuando el cliente necesita mucha flexibilidad en los datos (ej: apps móviles con datos variables) |
| **gRPC** | Basado en Protocol Buffers (binario, eficiente). Tipado estricto. | Comunicación interna entre microservicios que necesitan alto rendimiento |
| **WebSocket** | Conexión bidireccional persistente. El servidor puede enviar datos sin que el cliente pregunte. | Aplicaciones en tiempo real: chat, notificaciones en vivo, juegos |

> **Para este curso:** REST es suficiente para todo lo que haremos. GraphQL y gRPC son temas avanzados que encontrarás en proyectos más complejos.

---

## El Modelo de Madurez de Richardson

Leonard Richardson propuso un modelo para medir qué tan "RESTful" es una API, con cuatro niveles:

| Nivel | Nombre | Descripción |
|---|---|---|
| **Nivel 0** | The Swamp of POX | Un solo endpoint, todo vía POST. (Ej: SOAP, XML-RPC) |
| **Nivel 1** | Resources | Múltiples URLs, una por recurso. Pero un solo método HTTP para todo. |
| **Nivel 2** | HTTP Verbs | Usa correctamente los métodos HTTP y los códigos de estado. |
| **Nivel 3** | Hypermedia Controls (HATEOAS) | Las respuestas incluyen enlaces a acciones relacionadas. |

La mayoría de las APIs "REST" reales están en el **Nivel 2**. El Nivel 3 (HATEOAS) es el verdadero REST según Fielding, pero rara vez se implementa completamente en la práctica.

> **En este curso:** construirás APIs de Nivel 2. Es el estándar de la industria. Conocer el Nivel 3 es importante conceptualmente, pero no es el foco práctico.

---

## Resumen: checklist de diseño de una API REST

Antes de implementar un endpoint, hazte estas preguntas:

- [ ] ¿La URL usa sustantivos (no verbos)?
- [ ] ¿Las colecciones están en plural?
- [ ] ¿El método HTTP refleja correctamente la operación?
- [ ] ¿El código de estado HTTP refleja correctamente el resultado?
- [ ] ¿Los nombres de campos son consistentes con el resto de la API?
- [ ] ¿Las respuestas de error tienen el mismo formato en toda la API?
- [ ] ¿Las colecciones grandes están paginadas?
- [ ] ¿La URL incluye un número de versión?

Si puedes marcar todos estos ítems, tienes una API bien diseñada.




<!-- START OF FILE: docs_lessons_02-apis-and-rest_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 02-apis-and-rest 04 checklist rubrica minima
---
# Lección 02 - Lista de verificación: ¿llegué al mínimo requerido?

Usa esta lista para revisar tu comprensión antes de avanzar a la lección 03, donde vas a construir tu primera API. Si no puedes responder las preguntas de verificación sin releer el material, vuelve a la sección correspondiente.

---

## IE 2.0.1 - Frontend vs Backend

Checklist:

- [ ] Puedo explicar qué es el frontend con un ejemplo concreto
- [ ] Puedo explicar qué es el backend con un ejemplo concreto
- [ ] Entiendo por qué el frontend no puede guardar datos sensibles de forma segura
- [ ] Puedo describir cómo el frontend y el backend se comunican

**Pregunta de verificación:** Un amigo te dice que quiere construir una aplicación de notas con login de usuario. ¿Qué partes serían frontend y qué partes serían backend? ¿Por qué el login debe procesarse en el backend y no en el frontend?

---

## IE 2.0.2 - Arquitectura monolítica

Checklist:

- [ ] Puedo definir qué es una arquitectura monolítica
- [ ] Puedo mencionar al menos 3 ventajas del monolito
- [ ] Puedo mencionar al menos 3 desventajas del monolito
- [ ] Entiendo por qué es el punto de partida correcto para proyectos nuevos

**Pregunta de verificación:** Una startup con 3 desarrolladores está construyendo su primer producto. ¿Le recomendarías una arquitectura monolítica o de microservicios? Justifica tu respuesta con al menos dos argumentos.

---

## IE 2.0.3 - Microservicios

Checklist:

- [ ] Puedo definir qué es una arquitectura de microservicios
- [ ] Puedo comparar microservicios con monolito en al menos 3 dimensiones
- [ ] Entiendo qué problemas resuelven los microservicios y cuáles crean
- [ ] Entiendo en qué contexto tiene sentido migrar de monolito a microservicios

**Pregunta de verificación:** Una empresa grande tiene un monolito que procesa pagos, gestiona inventario y envía emails de notificación. El módulo de pagos necesita escalarse 10 veces más que los otros. ¿Por qué en este caso los microservicios podrían justificarse? ¿Qué nuevo problema aparecería al separarlos?

---

## IE 2.0.4 - Qué es una API

Checklist:

- [ ] Puedo definir qué es una API en términos generales
- [ ] Puedo explicar la analogía del menú de restaurante y qué representa cada parte
- [ ] Entiendo por qué la implementación interna puede cambiar sin afectar al cliente
- [ ] Puedo diferenciar entre una API web/HTTP y otros tipos de API

**Pregunta de verificación:** Cuando usas Google Maps en tu aplicación de delivery, ¿qué rol cumple la API de Google Maps? ¿Qué pasa si Google cambia internamente cómo calcula las rutas? ¿Afecta a tu aplicación?

---

## IE 2.0.5 - Qué es REST y sus principios

Checklist:

- [ ] Puedo explicar qué es REST con mis propias palabras (sin copiar la definición)
- [ ] Puedo nombrar al menos 4 de los 6 principios de REST
- [ ] Entiendo qué significa "interfaz uniforme" y por qué es el principio más importante
- [ ] Entiendo la relación entre REST y HTTP (REST usa HTTP pero no toda API HTTP es REST)

**Pregunta de verificación:** Un colega dice "nuestra API es REST porque usa HTTP y devuelve JSON". ¿Estás de acuerdo? ¿Qué criterios adicionales debería cumplir para ser genuinamente REST?

---

## IE 2.0.6 - Buenas prácticas de diseño de APIs REST

Checklist:

- [ ] Entiendo por qué las URLs deben tener sustantivos, no verbos
- [ ] Puedo diseñar las URLs para un CRUD completo dado un recurso
- [ ] Puedo elegir el método HTTP y código de estado correcto para cada operación
- [ ] Entiendo qué es el versionado de API y por qué existe
- [ ] Entiendo cómo implementar filtrado y paginación con query parameters

**Pregunta de verificación:** Diseña las URLs y métodos HTTP para una API de gestión de libros de una biblioteca. Debe permitir: listar todos los libros, ver un libro específico, agregar un libro nuevo, actualizar la cantidad de ejemplares disponibles, y eliminar un libro del catálogo. ¿Qué código de estado devuelves en cada caso?

---

## IE 2.0.7 - El Modelo de Madurez de Richardson

Checklist:

- [ ] Puedo describir los 4 niveles del Modelo de Madurez de Richardson
- [ ] Puedo identificar en qué nivel está una API dado un ejemplo
- [ ] Entiendo en qué nivel se trabaja en la industria habitualmente
- [ ] Entiendo qué es HATEOAS aunque no lo implementes en este curso

**Pregunta de verificación:** Una API tiene un único endpoint `POST /api` que recibe en el cuerpo un campo `accion` con valores como `"listar_usuarios"`, `"crear_usuario"`, `"eliminar_usuario"`. ¿En qué nivel de Richardson está? ¿Cómo la mejorarías para llevarla al Nivel 2?




<!-- START OF FILE: docs_lessons_02-apis-and-rest_05_actividad_individual.md -->
# Documento: docs lessons 02-apis-and-rest 05 actividad individual
---
# Lección 02 - Actividad individual: investigación y reflexión

Esta actividad no tiene código. Requiere que investigues, analices sistemas reales y defiendas tus propias conclusiones. Las actividades de investigación buscan que salgas de los ejemplos del curso; las reflexivas buscan que desarrolles criterio propio.

> **Formato de entrega:** un documento Markdown (`.md`) con tus respuestas. Cada sección debe tener título y respuesta redactada en tus propias palabras. No copies definiciones de Wikipedia o ChatGPT sin reelaborarlas.

---

## Parte 1: Actividades investigativas

---

### 🔍 Investigación 2.1 — Analiza una API pública real

**Objetivo:** aplicar los conceptos de diseño REST a una API del mundo real.

**Instrucciones:**

Elige UNA de las siguientes APIs públicas y gratuitas:
- [GitHub REST API](https://docs.github.com/en/rest)
- [The Dog API](https://thedogapi.com/)
- [Open-Meteo (meteorología)](https://open-meteo.com/)
- [PokéAPI](https://pokeapi.co/)
- [JSONPlaceholder (API de prueba)](https://jsonplaceholder.typicode.com/)

**Responde en tu documento:**

a) ¿Qué API elegiste? ¿Cuál es su propósito?

b) Encuentra al menos 3 endpoints diferentes en su documentación. Para cada uno, indica:
   - URL completa
   - Método HTTP
   - Qué hace
   - Qué código de estado devuelve en caso de éxito

c) Usando curl o el navegador, haz una petición real a uno de esos endpoints y copia la respuesta completa (URL, código de estado, y primeras líneas del cuerpo JSON).

d) ¿Qué nivel del Modelo de Madurez de Richardson tiene esta API? Justifica con evidencia de su documentación o comportamiento.

e) Identifica al menos UN aspecto de diseño que te parezca bueno y explica por qué. Identifica al menos UN aspecto que mejorarías y explica cómo.

---

### 🔍 Investigación 2.2 — Monolito vs Microservicios: casos reales

**Objetivo:** entender las decisiones arquitectónicas reales y sus consecuencias.

**Instrucciones:** investiga los siguientes casos documentados públicamente:

- **Amazon** pasó de monolito a microservicios alrededor de 2001-2002
- **Netflix** migró de DVD-por-correo a streaming y restructuró completamente su arquitectura
- **Shopify** es una empresa grande que todavía defiende el monolito (busca "Shopify monolith")
- **Stack Overflow** sirve millones de páginas con muy pocos servidores y arquitectura simple

**Responde en tu documento:**

a) Elige DOS de estos casos. Para cada uno, explica:
   - ¿Cuál era el problema que tenían con su arquitectura anterior?
   - ¿Qué decisión arquitectónica tomaron?
   - ¿Qué resultado obtuvieron?

b) ¿Por qué crees que empresas tan grandes como Shopify o Stack Overflow defienden el monolito si tienen los recursos para hacer microservicios?

c) Un desarrollador junior te dice "voy a usar microservicios para mi proyecto de portafolio personal". ¿Qué le respondes?

---

### 🔍 Investigación 2.3 — Tesis doctoral de Roy Fielding

**Objetivo:** conocer el origen de REST desde la fuente primaria.

**Instrucciones:** Lee el capítulo 5 de la tesis de Fielding, disponible gratuitamente en inglés en: [https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm)

No tienes que entenderla completamente. Es un documento académico denso. Lee con el objetivo de responder las siguientes preguntas.

**Responde en tu documento:**

a) Según Fielding, ¿qué motivó el diseño de REST? ¿Qué problema intentaba resolver?

b) Fielding escribió REST específicamente pensando en la Web (HTTP). ¿Crees que REST sigue siendo relevante en 2026? ¿Por qué?

c) Muchas APIs que se llaman a sí mismas "REST" no implementan HATEOAS (el nivel 3 de Richardson). Fielding ha criticado esto públicamente varias veces. ¿Quién tiene razón: la industria que ignora HATEOAS o Fielding que lo considera obligatorio? Defiende tu posición.

---

## Parte 2: Actividades reflexivas

---

### 💭 Reflexión 2.4 — Diseña una API desde cero

**Objetivo:** aplicar las buenas prácticas de diseño REST a un problema real.

**Escenario:** estás diseñando la API backend para una aplicación de gestión de tareas (como Trello o Todoist). Los usuarios pueden crear proyectos, y dentro de cada proyecto pueden crear tareas. Las tareas tienen estado (pendiente, en progreso, completada) y pueden tener comentarios.

**Responde en tu documento:**

a) Define todos los recursos del sistema (mínimo 3).

b) Diseña las URLs para el CRUD completo de cada recurso. Incluye método HTTP y código de estado esperado para cada operación.

c) Diseña la estructura JSON de respuesta para al menos uno de los recursos (incluye todos los campos que tendría).

d) ¿Cómo implementarías filtrado? (ej: "solo tareas completadas", "tareas del proyecto X"). Muestra ejemplos de URLs.

e) Si un usuario intenta crear una tarea en un proyecto que no existe, ¿qué código de estado devuelves? ¿Qué cuerpo de respuesta?

---

### 💭 Reflexión 2.5 — Los límites de REST

REST es la arquitectura dominante para APIs web, pero no es perfecta para todos los casos.

**Responde en tu documento:**

a) Imagina una aplicación de chat en tiempo real (como Slack o WhatsApp Web). ¿Por qué el modelo petición-respuesta de REST no es ideal para este caso? ¿Qué alternativa usarías?

b) Imagina una aplicación móvil que necesita mostrar el perfil de un usuario, sus últimas 5 publicaciones y sus 3 amigos más recientes, todo en una sola pantalla. Con REST, ¿cuántas peticiones HTTP necesitarías mínimo? ¿Qué problema crea esto en redes lentas? ¿Cómo lo resolverías?

c) GraphQL fue diseñado explícitamente para resolver algunos de estos problemas. ¿Qué problema concreto del punto anterior resuelve GraphQL? ¿Significa eso que GraphQL es "mejor" que REST? ¿En qué contexto elegiría cada uno?

---

### 💭 Reflexión 2.6 — APIs como producto

Las APIs no son solo código técnico: son interfaces que otros equipos o empresas dependen. Un mal diseño de API puede generar meses de trabajo adicional para quienes la consumen.

**Responde en tu documento:**

a) Si construyes una API que usa rutas como `/getUsers`, `/createUser` y `/deleteUser`, ¿qué problemas concretos le causas a un desarrollador frontend que la consume?

b) Imagina que lanzas la versión 1 de tu API con el campo `nombre_completo` en los usuarios. Seis meses después quieres cambiar ese campo a `nombreCompleto` (camelCase). ¿Cómo manejarías este cambio sin romper a los clientes que ya usan la v1?

c) Stripe es conocida en la industria por tener una de las mejores APIs del mundo. Investiga brevemente por qué la comunidad de desarrolladores la considera tan buena. ¿Qué principios de diseño aplica que la hacen destacar?

---

## Preparación para la lección 03

Al terminar esta actividad, ya tienes todo el modelo mental necesario para la lección siguiente. Como preparación adicional:

**Haz esto antes de la lección 03:**

- [ ] Descarga e instala [IntelliJ IDEA Community o Ultimate](https://www.jetbrains.com/idea/download/)
- [ ] Descarga e instala [Java 21 (JDK)](https://adoptium.net/) si no lo tienes
- [ ] Instala [Postman](https://www.postman.com/downloads/) para probar endpoints
- [ ] Verifica que Java está instalado ejecutando `java -version` en la terminal (debe mostrar versión 21)

**Pregunta para traer respondida a clase:**

> "¿Qué crees que hace Spring Boot que hace que crear un servidor HTTP sea tan simple?" Busca una respuesta de no más de 3 oraciones. La verificaremos y profundizaremos en la lección 03.

---

## Criterios de evaluación de la actividad

| Criterio | Descripción |
|---|---|
| **Profundidad** | Las respuestas van más allá de la definición superficial; demuestran comprensión real |
| **Evidencia** | Las investigaciones citan fuentes, muestran URLs probadas o capturas de respuestas reales |
| **Argumento** | Las reflexiones defienden una posición con argumentos concretos, no solo opiniones |
| **Aplicación** | El diseño de la API del ejercicio 2.4 aplica correctamente las buenas prácticas vistas |
| **Formato** | El documento está en Markdown con estructura clara, títulos y secciones bien organizadas |

---

## Recursos sugeridos para investigar

- [Roy Fielding's Dissertation - Chapter 5 REST](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm) — La fuente original de REST
- [Richardson Maturity Model - Martin Fowler](https://martinfowler.com/articles/richardsonMaturityModel.html) — Explicación clara del modelo de madurez
- [REST API Design Best Practices - Microsoft](https://learn.microsoft.com/en-us/azure/architecture/best-practices/api-design) — Guía práctica de Microsoft
- [Stripe API Reference](https://stripe.com/docs/api) — Ejemplo de API bien diseñada
- [GitHub REST API](https://docs.github.com/en/rest) — Otra API pública bien diseñada para estudiar
- [Microservices - Martin Fowler](https://martinfowler.com/articles/microservices.html) — El artículo que popularizó el término microservicios
- [Monolith First - Martin Fowler](https://martinfowler.com/bliki/MonolithFirst.html) — El argumento a favor de empezar con monolito




<!-- START OF FILE: docs_lessons_03-first-api_01_objetivo_y_alcance.md -->
# Documento: docs lessons 03-first-api 01 objetivo y alcance
---
# Lección 03 - Tu primera API: ¿qué vas a aprender?

## ¿De dónde venimos?

En las lecciones anteriores exploraste los conceptos teóricos de las APIs REST y el protocolo HTTP. Sabes qué es un recurso, qué es un verbo HTTP y qué significa un código de estado. Pero todavía no has escrito una sola línea de código que funcione en un servidor real.

Esta lección cambia eso. Vamos a pasar de la teoría a la práctica por primera vez.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás un servidor HTTP real, corriendo en tu máquina, que responde peticiones. Concretamente:

- Un proyecto **Spring Boot** creado desde cero con IntelliJ IDEA
- Un único endpoint que escucha en:

```
GET /greetings
```

- Que devuelve la siguiente respuesta con código `200 OK`:

```
Hola
```

Es simple. Intencionalmente simple. El objetivo no es el endpoint en sí, sino entender **cada pieza que lo hace funcionar**.

---

## ¿Qué vas a ser capaz de explicar?

Más importante que escribir el código es que entiendas el razonamiento detrás de cada parte. Al terminar esta lección deberías poder responder:

- ¿Qué hace Spring Boot y por qué lo usamos?
- ¿Qué es un controlador y cuál es su responsabilidad?
- ¿Por qué la clase tiene la anotación `@RestController`?
- ¿Qué hace `@RequestMapping` y cómo le dice a Spring en qué URL escuchar?
- ¿Cómo sabe Spring que ese método responde a una petición `GET`?
- ¿Qué ocurre entre que escribes `localhost:8080/greetings` en el navegador y ves "Hola"?

---

## ¿Qué NO cubre esta lección? (y por qué)

Esta lección se limita intencionalmente a lo esencial. Los siguientes temas se abordarán más adelante:

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| Separación en capas (Controller / Service / Repository) | Primero entendemos el Controller; las demás capas se agregan una a una |
| Responder con JSON (objetos, listas) | Antes de responder objetos, hay que entender cómo funciona una respuesta básica |
| Recibir parámetros en la URL o en el cuerpo | Primero el caso más simple: un GET sin parámetros |
| Base de datos | Todavía no hay datos que persistir |
| `ResponseEntity` | Lo incorporamos cuando necesitemos controlar el código de respuesta explícitamente |
| Validaciones | No hay datos de entrada que validar aún |

El objetivo es hacer **una cosa, bien hecha y completamente entendida**. Nada más.

---

## La herramienta: IntelliJ IDEA con Spring Initializr

Vas a crear el proyecto usando el asistente integrado de IntelliJ IDEA, que conecta con **Spring Initializr** (start.spring.io). Este asistente genera automáticamente la estructura base del proyecto con las dependencias que tú elijas.

Lo que seleccionarás:
- **Lenguaje:** Java
- **Gestor de dependencias:** Maven
- **Versión de Spring Boot:** la estable más reciente (4.x)
- **Java:** 21
- **Dependencias:** Spring Web, Lombok, Spring Boot DevTools

Cada una de esas decisiones tiene un por qué, y lo explicaremos en el tutorial paso a paso.

---

## La idea central de esta lección

> "Antes de agregar capas, entiende qué hace cada una."

El patrón que vas a aprender en lecciones siguientes (Controller → Service → Repository) solo tiene sentido si primero entiendes qué es un controlador, cómo recibe una petición HTTP y cómo devuelve una respuesta. Esta lección construye esa base.




<!-- START OF FILE: docs_lessons_03-first-api_02_guion_paso_a_paso.md -->
# Documento: docs lessons 03-first-api 02 guion paso a paso
---
# Lección 03 - Tutorial paso a paso: tu primera API con Spring Boot

Sigue esta guía en orden. Cada paso explica qué vas a hacer y **por qué lo hacemos así**. No copies y pegues sin leer: el objetivo es que entiendas cada decisión.

---

## Paso 1: crear el proyecto con IntelliJ IDEA

Abre IntelliJ IDEA y sigue estos pasos:

1. Ve a **File → New → Project...**
2. En el panel izquierdo selecciona **Spring Boot** (o "Spring Initializr")
3. Configura el proyecto con los siguientes valores:

| Campo | Valor |
|---|---|
| Name | `Greetings` |
| Location | La carpeta donde quieras guardar el proyecto |
| Language | Java |
| Type | Maven |
| Group | `cl.duoc.fullstack` |
| Artifact | `greetings` |
| Package name | `cl.duoc.fullstack.greetings` |
| Java | 21 |

4. Haz clic en **Next**
5. Selecciona las siguientes dependencias:
   - ✅ **Spring Web** (en la categoría "Web")
   - ✅ **Lombok** (en la categoría "Developer Tools")
   - ✅ **Spring Boot DevTools** (en la categoría "Developer Tools")
6. Haz clic en **Create**

IntelliJ descargará la estructura base del proyecto y lo abrirá automáticamente.

> **¿Qué acaba de pasar?** IntelliJ se conectó a [start.spring.io](https://start.spring.io) y generó por ti una estructura de proyecto Maven con Spring Boot preconfigurado. Antes de esta herramienta, configurar todo eso manualmente tomaba horas.

---

## Paso 2: entender la estructura del proyecto

Antes de escribir código, dedica unos minutos a explorar lo que se generó. Abre el panel de archivos de IntelliJ y verás algo así:

```
Greetings/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cl/duoc/fullstack/greetings/
│   │   │       └── GreetingsApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── cl/duoc/fullstack/greetings/
│               └── GreetingsApplicationTests.java
├── pom.xml
└── mvnw
```

### `pom.xml` — el contrato del proyecto

Este archivo le dice a Maven (el gestor de dependencias de Java):
- Qué librerías necesita el proyecto (`<dependencies>`)
- Con qué versión de Java compilar (`<java.version>21</java.version>`)
- Qué plugins usar al construir el proyecto

Cada vez que agregas una dependencia, la declaras aquí. Maven la descarga automáticamente de internet la primera vez.

> **Analogía:** el `pom.xml` cumple el mismo rol que el `package.json` en proyectos Node.js: describe el proyecto y sus dependencias.

### `GreetingsApplication.java` — el punto de entrada

```java
@SpringBootApplication
public class GreetingsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GreetingsApplication.class, args);
    }
}
```

Esta clase es el punto de arranque de toda la aplicación. Cuando ejecutas el proyecto, Java busca el método `main` y lo llama. Ese `main` arranca Spring Boot, que a su vez:

1. Escanea todos los paquetes en busca de clases anotadas (`@RestController`, `@Service`, `@Repository`, etc.)
2. Configura el servidor HTTP embebido (Tomcat, por defecto)
3. Levanta el servidor en el puerto `8080`

La anotación `@SpringBootApplication` es un atajo que combina tres anotaciones:
- `@SpringBootConfiguration` — marca esta clase como fuente de configuración
- `@EnableAutoConfiguration` — activa la configuración automática de Spring
- `@ComponentScan` — le dice a Spring que escanee el paquete actual y todos sus subpaquetes

> **Importante:** nunca borres ni muevas esta clase. Si la mueves a otro paquete, Spring podría dejar de encontrar tus controllers.

### `application.properties` — la configuración de la aplicación

Este archivo controla el comportamiento de Spring Boot sin tocar el código Java. Por ahora solo tiene:

```properties
spring.application.name=Greetings
```

Aquí podrías, por ejemplo, cambiar el puerto:

```properties
server.port=8081
```

O agregar un prefijo global a todas las rutas:

```properties
server.servlet.context-path=/api
```

> **Regla de oro:** cualquier valor que pueda cambiar entre entornos (desarrollo, producción) vive aquí, nunca hardcodeado en el código Java.

### `mvnw` — el wrapper de Maven

Es un script que permite ejecutar Maven sin tenerlo instalado globalmente. Desde la terminal puedes usar:

```bash
./mvnw spring-boot:run    # levanta la aplicación
./mvnw test               # ejecuta los tests
./mvnw package            # compila y empaqueta en un .jar
```

---

## Paso 3: crear el paquete `controller`

Antes de escribir el controlador, crea el paquete donde va a vivir.

En IntelliJ:
1. Haz clic derecho sobre el paquete `cl.duoc.fullstack.greetings`
2. Selecciona **New → Package**
3. Escribe `controller` y presiona Enter

Verás que se crea la carpeta `controller/` dentro del paquete principal.

> **¿Por qué un paquete separado?** En Java, los paquetes son más que carpetas: comunican intención. Al poner tu controlador en un paquete llamado `controller`, cualquier desarrollador que abra el proyecto sabe inmediatamente qué hace esa clase. Es un lenguaje común del ecosistema Java.

---

## Paso 4: crear la clase `GreetingsController`

Haz clic derecho sobre el paquete `controller` recién creado:
1. Selecciona **New → Java Class**
2. Escribe `GreetingsController` y presiona Enter

Escribe el siguiente código:

```java
package cl.duoc.fullstack.greetings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public String greet() {
        return "Hola";
    }
}
```

Eso es todo el código que necesitas. Vamos parte por parte.

---

## Paso 5: entender cada parte del controlador

### La clase: `GreetingsController`

```java
public class GreetingsController { ... }
```

Una clase Java normal. El nombre no tiene ningún significado especial para Spring: podría llamarse de cualquier forma. La convención es terminar con `Controller` para que la intención quede clara.

---

### `@RestController`

```java
@RestController
public class GreetingsController { ... }
```

Esta anotación le dice a Spring dos cosas al mismo tiempo:

1. **Esta clase es un controlador HTTP** — Spring la registrará y comenzará a escuchar peticiones a través de ella
2. **Las respuestas se serializan directamente** — lo que retorne cada método se convierte automáticamente en el cuerpo de la respuesta HTTP

Internamente, `@RestController` es la combinación de:
- `@Controller` — registra la clase como manejador de peticiones web
- `@ResponseBody` — hace que el valor de retorno del método sea el cuerpo de la respuesta, no el nombre de una vista HTML

> **¿Por qué existe `@RestController` y no solo `@Controller`?** El `@Controller` original de Spring fue diseñado para aplicaciones que devuelven páginas HTML (vistas). Con `@RestController`, en cambio, lo que el método retorna va directo al cuerpo de la respuesta HTTP. Para una API REST, siempre usarás `@RestController`.

---

### `@RequestMapping("/greetings")`

```java
@RequestMapping("/greetings")
public class GreetingsController { ... }
```

Esta anotación define el **prefijo de URL** para todos los endpoints de esta clase. En este caso, todos los métodos de `GreetingsController` responderán bajo la ruta `/greetings`.

Cuando Spring arranca, lee esta anotación y registra internamente: _"cualquier petición HTTP que llegue a una URL que comience con `/greetings` debe ser manejada por esta clase"_.

> **¿Se puede poner `@RequestMapping` solo en el método y no en la clase?** Sí. Pero ponerlo en la clase permite agrupar todos los endpoints relacionados bajo una misma raíz de URL. Si mañana decides cambiar `/greetings` a `/saludos`, solo cambias una línea (la anotación de la clase) y todos los endpoints se actualizan automáticamente.

---

### El método: `greet()`

```java
public String greet() {
    return "Hola";
}
```

Un método Java normal que retorna un `String`. El nombre `greet` es una convención descriptiva: podría llamarse `hello`, `sayHi` o cualquier cosa, pero debe comunicar lo que hace.

Lo que este método retorna (`"Hola"`) se convierte en el **cuerpo de la respuesta HTTP**. Gracias a `@RestController`, Spring toma ese `String` y lo escribe directamente en la respuesta.

---

### `@GetMapping`

```java
@GetMapping
public String greet() { ... }
```

Esta anotación le dice a Spring que este método responde a peticiones HTTP con el método `GET`.

Combinado con el `@RequestMapping("/greetings")` de la clase, el resultado es:

```
GET /greetings → greet()
```

Cuando alguien hace una petición `GET` a la URL `/greetings`, Spring ejecuta este método y envía `"Hola"` como respuesta.

> **¿Por qué `@GetMapping` y no `@RequestMapping(method = RequestMethod.GET)`?** Ambas hacen exactamente lo mismo. `@GetMapping` es un atajo más conciso introducido en Spring 4.3. Lo mismo aplica para `@PostMapping`, `@PutMapping`, `@DeleteMapping`, etc.

---

## Paso 6: levantar la aplicación

Tienes dos formas de ejecutar el proyecto:

**Opción A — desde IntelliJ:**
Haz clic en el botón ▶ (play) verde que aparece junto al método `main` en `GreetingsApplication.java`, o usa el botón de run en la barra de herramientas.

**Opción B — desde la terminal:**
```bash
./mvnw spring-boot:run
```

En ambos casos verás en la consola un mensaje similar a este:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.3)

Started GreetingsApplication in 1.823 seconds (process running for 2.1)
```

Esa última línea confirma que el servidor está corriendo. El tiempo varía, pero debería ser menos de 5 segundos.

> **DevTools en acción:** gracias a la dependencia `spring-boot-devtools` que agregaste, si modificas y guardas cualquier archivo Java, Spring reinicia automáticamente la aplicación. No necesitas detenerla y volver a levantarla manualmente cada vez que cambias código.

---

## Paso 7: probar el endpoint

Tienes tres formas de probar el endpoint:

### Opción A — navegador web

Abre tu navegador y escribe en la barra de direcciones:

```
http://localhost:8080/greetings
```

Verás la palabra `Hola` en la pantalla. El navegador hace automáticamente una petición `GET` a esa URL.

### Opción B — Postman o Insomnia

1. Crea una nueva petición
2. Selecciona el método `GET`
3. Ingresa la URL: `http://localhost:8080/greetings`
4. Haz clic en **Send**

Deberías ver:
- **Status:** `200 OK`
- **Body:** `Hola`

### Opción C — curl desde la terminal

```bash
curl http://localhost:8080/greetings
```

Salida esperada:

```
Hola
```

---

## Paso 8: entender el flujo completo

Cuando escribes `http://localhost:8080/greetings` y presionas Enter, esto es lo que ocurre:

```
1. Tu navegador arma una petición HTTP:
   GET /greetings HTTP/1.1
   Host: localhost:8080

2. La petición viaja por la red (en este caso, en tu misma máquina)
   hasta el puerto 8080.

3. Tomcat (el servidor HTTP embebido de Spring Boot) la recibe.

4. Spring busca en su registro interno qué clase/método maneja
   "GET /greetings" → encuentra GreetingsController.greet()

5. Spring llama al método greet()

6. El método retorna el String "Hola"

7. Spring convierte ese String en el cuerpo de la respuesta HTTP:
   HTTP/1.1 200 OK
   Content-Type: text/plain;charset=UTF-8
   Content-Length: 4

   Hola

8. La respuesta viaja de vuelta a tu navegador, que muestra "Hola".
```

Este flujo —petición → servidor → controller → respuesta— es la base de todo lo que construirás en el curso.

---

## Paso 9: reflexiona antes de cerrar

Antes de pasar a la siguiente sección, respóndete estas preguntas:

1. ¿Qué pasaría si cambias `@GetMapping` por `@PostMapping` y vuelves a probar desde el navegador? ¿Por qué?
2. ¿Qué pasa si cambias `"/greetings"` en `@RequestMapping` por `"/hello"` y vuelves a probar la URL anterior?
3. ¿Qué rol cumple la clase `GreetingsApplication` en todo el proceso? ¿Qué pasaría si la borraras?

Si puedes responder estas tres preguntas con seguridad, entendiste el objetivo de este paso.




<!-- START OF FILE: docs_lessons_03-first-api_03_como_funciona_http.md -->
# Documento: docs lessons 03-first-api 03 como funciona http
---
# Lección 03 - Cómo funciona HTTP y por qué tu endpoint responde

Esta sección no es una lista de reglas para memorizar. Es la explicación del mecanismo real detrás de lo que acabas de construir. Un buen desarrollador no solo sabe *cómo* hacer algo, sino *por qué* funciona.

---

## ¿Qué es HTTP?

**HTTP** (HyperText Transfer Protocol) es el protocolo de comunicación que usan el navegador y el servidor para entenderse. Es un protocolo de texto, sin estado, basado en el modelo **petición → respuesta**:

- El **cliente** (navegador, Postman, aplicación frontend) envía una **petición**
- El **servidor** (tu aplicación Spring Boot) procesa esa petición y devuelve una **respuesta**

Cada petición es independiente: el servidor no recuerda peticiones anteriores a menos que uses mecanismos como cookies o tokens. Eso es lo que significa "sin estado" (stateless).

---

## Anatomía de una petición HTTP

Cuando escribes `http://localhost:8080/greetings` en el navegador, este construye y envía una petición que tiene esta forma:

```http
GET /greetings HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 ...
Accept: text/html,application/xhtml+xml,...
```

Vamos parte por parte:

### Línea de inicio: método + ruta + versión

```
GET /greetings HTTP/1.1
```

| Parte | Qué es | En nuestro caso |
|---|---|---|
| `GET` | El **método HTTP** — qué tipo de operación se pide | Leer / obtener información |
| `/greetings` | La **ruta** — qué recurso se solicita | El saludo |
| `HTTP/1.1` | La **versión del protocolo** | La más común hoy en día |

### Cabeceras (headers)

```
Host: localhost:8080
```

Las cabeceras son metadatos de la petición: quién la hace, qué formato acepta como respuesta, qué idioma prefiere, etc. Son pares `Clave: Valor`. Algunas las pone el navegador automáticamente; otras las agrega el desarrollador.

### Cuerpo (body)

En una petición `GET` **no hay cuerpo**. El `GET` solo pide información; no envía datos. El cuerpo es relevante en métodos como `POST` o `PUT`, donde el cliente envía datos al servidor (por ejemplo, los datos de un formulario o un objeto JSON).

---

## Anatomía de una respuesta HTTP

El servidor recibe la petición, la procesa y devuelve una respuesta:

```http
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8
Content-Length: 4

Hola
```

### Línea de estado: versión + código + descripción

```
HTTP/1.1 200 OK
```

| Parte | Qué es |
|---|---|
| `HTTP/1.1` | Versión del protocolo |
| `200` | **Código de estado** — indica si la operación fue exitosa o no |
| `OK` | Descripción textual del código (para humanos) |

### Cabeceras de respuesta

```
Content-Type: text/plain;charset=UTF-8
Content-Length: 4
```

Le dicen al cliente cómo interpretar el cuerpo:
- `Content-Type`: qué tipo de dato viene en el cuerpo (`text/plain` = texto plano, `application/json` = JSON)
- `Content-Length`: cuántos bytes tiene el cuerpo

Spring Boot agrega estas cabeceras automáticamente según el tipo de dato que retorna el método.

### Cuerpo de la respuesta

```
Hola
```

Lo que el método `greet()` retornó. Para un `String` de Java, Spring lo escribe directamente como texto plano.

---

## Los códigos de estado HTTP más importantes

El código de estado es la forma en que el servidor le dice al cliente si todo salió bien y, si no, qué pasó.

| Rango | Categoría | Significado |
|---|---|---|
| `2xx` | ✅ Éxito | La petición fue procesada correctamente |
| `3xx` | ↪️ Redirección | El recurso se movió a otra URL |
| `4xx` | ❌ Error del cliente | La petición tiene algún problema |
| `5xx` | 💥 Error del servidor | El servidor falló al procesar una petición válida |

Los que más vas a usar en este curso:

| Código | Nombre | Cuándo se usa |
|---|---|---|
| `200 OK` | Éxito | La operación funcionó correctamente |
| `201 Created` | Creado | Se creó un nuevo recurso (`POST`) |
| `400 Bad Request` | Petición inválida | El cliente envió datos incorrectos |
| `404 Not Found` | No encontrado | El recurso solicitado no existe |
| `500 Internal Server Error` | Error del servidor | Algo falló en el código del servidor |

> **¿Por qué importan los códigos?** Un cliente bien implementado (una app frontend, un script, un servicio externo) toma decisiones basadas en el código de estado. Si tu API siempre devuelve `200 OK` aunque haya un error, el cliente no puede saber qué pasó realmente.

---

## Los métodos HTTP y su significado

HTTP define varios métodos (también llamados verbos), cada uno con un propósito específico:

| Método | Propósito | Ejemplo |
|---|---|---|
| `GET` | **Leer** un recurso o una colección | `GET /greetings` — obtener el saludo |
| `POST` | **Crear** un nuevo recurso | `POST /tickets` — crear un ticket |
| `PUT` | **Reemplazar** un recurso completo | `PUT /tickets/1` — reemplazar el ticket 1 |
| `PATCH` | **Modificar** parte de un recurso | `PATCH /tickets/1` — actualizar solo el estado |
| `DELETE` | **Eliminar** un recurso | `DELETE /tickets/1` — eliminar el ticket 1 |

En esta lección solo usamos `GET`. Es el más simple y el más seguro: solo lee, nunca modifica nada.

> **Seguro e idempotente:** `GET` es *seguro* (no tiene efectos secundarios en el servidor) e *idempotente* (hacer la misma petición 10 veces produce el mismo resultado que hacerla una sola vez). Estas propiedades son importantes para cachés y reintentos automáticos.

---

## ¿Cómo sabe Spring qué método ejecutar?

Cuando Spring Boot arranca, escanea todas las clases anotadas con `@RestController`. Para cada una, lee las anotaciones `@RequestMapping`, `@GetMapping`, `@PostMapping`, etc. y construye una **tabla de rutas** interna:

```
GET  /greetings  →  GreetingsController.greet()
```

Cuando llega una petición HTTP, Spring consulta esa tabla y ejecuta el método correspondiente. Si no encuentra ningún método que coincida con el método HTTP y la ruta, Spring devuelve automáticamente un `404 Not Found`.

Este mecanismo se llama **routing** o **mapeo de URLs**.

### ¿Qué pasa si la ruta no existe?

Prueba esto: levanta la aplicación y accede a:

```
http://localhost:8080/hola
```

Spring devuelve `404 Not Found` porque no hay ningún método registrado para `GET /hola`. Eso es correcto: la API solo conoce lo que tú le enseñas.

### ¿Qué pasa si usas el método HTTP incorrecto?

Prueba hacer un `POST /greetings` desde Postman. Spring devuelve `405 Method Not Allowed`, porque hay un método registrado para esa ruta, pero no acepta el verbo `POST`.

---

## ¿Cómo mapea Spring la URL con tu código?

El mapeo funciona en dos niveles, uno en la clase y otro en el método:

```java
@RestController
@RequestMapping("/greetings")   ← nivel 1: prefijo de la clase
public class GreetingsController {

    @GetMapping                  ← nivel 2: método HTTP (GET) + ruta adicional (ninguna)
    public String greet() {
        return "Hola";
    }
}
```

La URL final resulta de **concatenar** el `@RequestMapping` de la clase con la ruta del método:

```
/greetings  +  (vacío)  =  GET /greetings
```

Si el método tuviera `@GetMapping("/formal")`, la URL sería `GET /greetings/formal`.

Esto permite organizar múltiples endpoints relacionados bajo un mismo prefijo:

```java
@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping               // GET /greetings
    public String greet() { return "Hola"; }

    @GetMapping("/formal")    // GET /greetings/formal
    public String formal() { return "Buenos días"; }
}
```

---

## ¿Por qué el puerto es 8080?

Spring Boot incluye un servidor HTTP embebido (**Tomcat** por defecto) que arranca junto con la aplicación. El puerto `8080` es su valor predeterminado.

El número de puerto identifica qué servicio dentro de una máquina debe recibir la conexión. Algunos puertos tienen usos estándar:

| Puerto | Uso estándar |
|---|---|
| `80` | HTTP en producción |
| `443` | HTTPS en producción |
| `8080` | Servidores de desarrollo (convención) |
| `5432` | PostgreSQL |
| `3306` | MySQL |

Para cambiar el puerto de tu aplicación, agrega esto en `application.properties`:

```properties
server.port=9090
```

Después de reiniciar, tu endpoint estaría en `http://localhost:9090/greetings`.

---

## ¿Qué significa `localhost`?

`localhost` es un nombre especial que siempre apunta a **tu propia máquina**. Es equivalente a la dirección IP `127.0.0.1`. Cuando el servidor y el cliente están en la misma máquina (como en desarrollo), usas `localhost` para conectarte al servidor que levantaste tú mismo.

En producción, en lugar de `localhost` usarías el nombre de dominio real del servidor (por ejemplo, `api.miempresa.com`).

---

## El ciclo completo en una imagen

```mermaid
sequenceDiagram
    participant Client as Navegador / Postman
    participant Server as Spring Boot (Tomcat :8080)
    participant Ctrl as GreetingsController

    Client->>Server: GET /greetings
    Server->>Ctrl: busca ruta → greet()
    Ctrl-->>Server: "Hola"
    Server-->>Client: 200 OK / "Hola"
```
```
┌─────────────────────────────────────────────────────────┐
│                     TU MÁQUINA                          │
│                                                         │
│  ┌─────────────┐    GET /greetings    ┌───────────────┐ │
│  │  Navegador  │ ───────────────────▶ │  Spring Boot  │ │
│  │  o Postman  │                      │  (puerto 8080)│ │
│  │             │ ◀─────────────────── │               │ │
│  └─────────────┘    200 OK / "Hola"   │  Tomcat       │ │
│                                       │  GreetingsCtrl│ │
│                                       └───────────────┘ │
└─────────────────────────────────────────────────────────┘
```

1. El cliente construye y envía la petición HTTP
2. Tomcat recibe la petición en el puerto 8080
3. Spring busca en su tabla de rutas: `GET /greetings → GreetingsController.greet()`
4. Ejecuta el método y obtiene `"Hola"`
5. Construye la respuesta HTTP con código `200 OK` y cuerpo `Hola`
6. Envía la respuesta al cliente




<!-- START OF FILE: docs_lessons_03-first-api_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 03-first-api 04 checklist rubrica minima
---
# Lección 03 - Lista de verificación: ¿llegué al mínimo requerido?

Usa esta lista para revisar tu propio trabajo antes de presentarlo. Cada ítem explica qué significa y cómo verificarlo.

---

## ¿Qué es un indicador de evaluación (IE)?

Los indicadores de evaluación son los criterios concretos con los que se mide tu aprendizaje. En esta lección el foco está en que **el endpoint funcione y puedas explicar cada parte**, no en la cantidad de código que escribiste.

---

## IE 1.1.1 - Proyecto Spring Boot creado y ejecutable

Este indicador verifica que puedes crear un proyecto Spring Boot desde cero y levantarlo correctamente.

Checklist:

- [ ] El proyecto fue creado con IntelliJ IDEA usando Spring Initializr
- [ ] Las dependencias están declaradas en `pom.xml`: `spring-boot-starter-web`, `lombok`, `spring-boot-devtools`
- [ ] La aplicación levanta sin errores (no hay excepciones en la consola al iniciar)
- [ ] La consola muestra el mensaje `Started GreetingsApplication in X seconds`

**Cómo verificarlo:** ejecuta el proyecto y revisa la consola. Si ves el mensaje de inicio sin líneas en rojo (`ERROR`), el proyecto está correcto.

> **Problema común:** si la aplicación no levanta y ves un error como `Port 8080 was already in use`, significa que ya hay otro proceso usando ese puerto. Puedes detenerlo o cambiar el puerto en `application.properties` con `server.port=8081`.

---

## IE 1.1.2 - Endpoint `GET /greetings` funcionando

Este indicador verifica que el endpoint existe, responde al método HTTP correcto y devuelve el valor esperado.

Checklist:

- [ ] La URL `GET http://localhost:8080/greetings` responde con código `200 OK`
- [ ] El cuerpo de la respuesta contiene exactamente `Hola`
- [ ] La URL `POST http://localhost:8080/greetings` responde con `405 Method Not Allowed`
- [ ] La URL `GET http://localhost:8080/hola` responde con `404 Not Found`

**Cómo verificarlo:** usa Postman, Insomnia o el navegador para probar el endpoint. En Postman verás el código de estado en la parte superior derecha de la respuesta.

---

## IE 1.1.3 - Uso correcto de las anotaciones de Spring

Este indicador verifica que sabes qué hace cada anotación y la estás usando correctamente.

Checklist:

- [ ] La clase `GreetingsController` está anotada con `@RestController`
- [ ] La clase tiene `@RequestMapping("/greetings")` con la URL en minúsculas
- [ ] El método `greet()` está anotado con `@GetMapping`
- [ ] Las tres anotaciones están importadas desde `org.springframework.web.bind.annotation`
- [ ] No hay lógica de negocio en el controlador (solo retorna el saludo directamente)

**Cómo verificarlo:** abre `GreetingsController.java` y revisa que cada anotación esté presente. IntelliJ subraya en rojo las anotaciones que no reconoce o que faltan imports.

> **Importante:** si copias una anotación sin el import, IntelliJ no la reconocerá. Usa `Alt+Enter` sobre la anotación subrayada para que IntelliJ agregue el import automáticamente.

---

## IE 1.1.4 - Comprensión del flujo HTTP

Este indicador no se verifica con código: se verifica con tu capacidad de explicar lo que ocurre.

Checklist (para responderte mentalmente o en voz alta):

- [ ] Puedo explicar qué es una petición HTTP y qué contiene (método, ruta, cabeceras, cuerpo)
- [ ] Puedo explicar qué es una respuesta HTTP y qué contiene (código de estado, cabeceras, cuerpo)
- [ ] Puedo explicar por qué la URL es `localhost:8080` y no otra cosa
- [ ] Puedo explicar cómo Spring sabe que `GET /greetings` debe ejecutar `GreetingsController.greet()`
- [ ] Puedo decir qué pasa si hago `GET /hola` (404) y por qué
- [ ] Puedo decir qué pasa si hago `POST /greetings` (405) y por qué

**Cómo verificarlo:** explícalo a un compañero o escríbelo en tus propias palabras. Si no puedes explicarlo sin leer el código, necesitas repasar la sección `03_como_funciona_http.md`.

---

## Estructura mínima esperada del proyecto

```
src/
└── main/
    ├── java/cl/duoc/fullstack/greetings/
    │   ├── GreetingsApplication.java      ← no se modifica
    │   └── controller/
    │       └── GreetingsController.java   ← lo que creaste
    └── resources/
        └── application.properties
```

Si tu `GreetingsController` está directamente en el paquete raíz (sin la carpeta `controller`), el código puede funcionar, pero no sigue las convenciones del ecosistema Java. Mueve la clase al paquete correcto.

---

## Indicadores que se trabajan en lecciones siguientes

Los siguientes indicadores están en el horizonte del curso. No se evalúan en esta lección, pero es útil saber hacia dónde vamos:

| Indicador | Qué cubre |
|---|---|
| IE 1.2.1 | Separación de responsabilidades (Controller / Service / Repository) |
| IE 1.2.2 | Modelo de datos y persistencia en memoria |
| IE 1.1.2 | Diseño de endpoints REST (sustantivos, plural, verbos HTTP correctos) |
| IE 1.1.3 | Respuestas JSON y control de códigos HTTP con `ResponseEntity` |

---

## ¿Completé el mínimo de esta lección?

Puedes decir que completaste esta lección si:

- ✅ El proyecto levanta sin errores
- ✅ `GET http://localhost:8080/greetings` devuelve `200 OK` con cuerpo `Hola`
- ✅ Puedes explicar en tus propias palabras qué hace cada anotación (`@RestController`, `@RequestMapping`, `@GetMapping`)
- ✅ Puedes describir el flujo desde que el navegador envía la petición hasta que recibe la respuesta




<!-- START OF FILE: docs_lessons_03-first-api_05_actividad_individual_greetings.md -->
# Documento: docs lessons 03-first-api 05 actividad individual greetings
---
# Lección 03 - Actividad individual: agrega tu propio saludo

Ahora es tu turno. Esta actividad extiende lo que construiste en clase con `GET /greetings`, pero ahora tomas tus propias decisiones de diseño.

> Si no estuviste en clase, lee primero el tutorial paso a paso (`02_guion_paso_a_paso.md`) y la explicación de HTTP (`03_como_funciona_http.md`) antes de comenzar.

---

## ¿Qué vas a construir?

Vas a agregar un segundo endpoint al mismo controlador `GreetingsController`. El endpoint debe responder a:

```
GET /greetings/formal
```

Y retornar la cadena:

```
Buenos días
```

---

## Restricciones de la actividad

| Restricción | Por qué |
|---|---|
| Usar el mismo `GreetingsController`, no crear otro | Un controlador agrupa los endpoints del mismo recurso |
| Solo `@GetMapping` con una ruta (`"/formal"`) | Practica la combinación de `@RequestMapping` de clase + `@GetMapping` de método |
| El método debe llamarse `formalGreet()` | Los nombres de métodos deben ser descriptivos |
| No modificar el endpoint `GET /greetings` existente | El nuevo endpoint es una adición, no un reemplazo |

---

## Guía de implementación

### 1. Abre `GreetingsController.java`

El archivo está en:
```
src/main/java/cl/duoc/fullstack/greetings/controller/GreetingsController.java
```

### 2. Agrega el nuevo método

Dentro de la clase, junto al método `greet()` existente, escribe:

```java
@GetMapping("/formal")
public String formalGreet() {
    return "Buenos días";
}
```

La clase completa debería verse así:

```java
@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public String greet() {
        return "Hola";
    }

    @GetMapping("/formal")
    public String formalGreet() {
        return "Buenos días";
    }
}
```

### 3. Levanta (o recarga) la aplicación

Si DevTools está activo, la aplicación se recargará sola al guardar. Si no, detén y vuelve a levantar el servidor.

### 4. Prueba ambos endpoints

Verifica que **ambos endpoints** funcionen correctamente:

| Petición | Respuesta esperada | Código esperado |
|---|---|---|
| `GET http://localhost:8080/greetings` | `Hola` | `200 OK` |
| `GET http://localhost:8080/greetings/formal` | `Buenos días` | `200 OK` |

---

## ¿Cómo sé si lo hice bien?

### Logro alto

- Ambos endpoints responden correctamente
- Puedes explicar por qué `@GetMapping("/formal")` genera la URL `/greetings/formal` (y no solo `/formal`)
- Puedes explicar qué pasaría si moverías el método a una clase diferente sin `@RequestMapping("/greetings")`
- El código del controlador es limpio: sin lógica extra, sin comentarios innecesarios, sin código duplicado

### Logro medio

- Ambos endpoints responden correctamente
- La URL del nuevo endpoint funciona pero no puedes explicar el mecanismo de combinación de rutas
- Creaste una segunda clase controller en lugar de agregar el método a la existente

### Logro inicial

- Solo uno de los dos endpoints funciona
- La URL del endpoint no es correcta (por ejemplo, responde en `/formal` en vez de `/greetings/formal`)
- El código tiene errores de compilación o la aplicación no levanta

---

## Extensión opcional: si terminas antes

Si completaste la actividad principal y quieres un desafío adicional, prueba una o más de estas opciones:

### Opción A: cambiar el puerto

Sin tocar el código Java, haz que la aplicación corra en el puerto `9090` en lugar del `8080`. Verifica que el endpoint sigue funcionando en la nueva URL.

### Opción B: agregar un `context-path`

Configura un prefijo global `/api` para todas las rutas. Después de hacerlo, el endpoint debe responder en:

```
GET http://localhost:8080/api/greetings
```

> Pista: busca `server.servlet.context-path` en la documentación de Spring Boot.

---

## Antes de entregar: pregúntate esto

1. Si mañana necesitas agregar un saludo en otro idioma, ¿dónde agregarías el código? ¿Por qué?
2. Si el controlador tuviera `@RequestMapping("/api/greetings")`, ¿qué URL tendría el método `formalGreet()`?
3. ¿Cuál es la diferencia entre `@RequestMapping` en la clase y `@GetMapping` en el método? ¿Pueden intercambiarse?

Si puedes responder estas tres preguntas, completaste el objetivo de esta actividad.







<!-- START OF FILE: docs_lessons_04-responsabilities_01_objetivo_y_alcance.md -->
# Documento: docs lessons 04-responsabilities 01 objetivo y alcance
---
# Lección 04 - Separación de responsabilidades: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior construiste tu primer endpoint con Spring Boot: algo como `GET /greetings` que devolvía un texto plano. Funcionaba, pero todo el código estaba en un solo lugar: el controlador hacía absolutamente todo.

Eso está bien para empezar, pero en la práctica real ese enfoque genera problemas muy rápido. Imagina que mañana tu jefe te pide cambiar cómo se buscan los datos, o agregar una regla de negocio, o hacer pruebas automáticas. Con todo en un solo archivo, cualquier cambio pequeño puede romper todo lo demás.

Esta lección existe para resolver ese problema desde el principio.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás un microservicio real y ejecutable que:

- Expone el endpoint `GET /tickets` y devuelve una lista de tickets en formato JSON
- Está organizado en **cuatro capas separadas**, cada una con una responsabilidad clara
- Usa datos en memoria (sin base de datos aún) para que podamos concentrarnos en la arquitectura

### Lo que vas a ser capaz de explicar

Más importante que el código es que entiendas el **por qué** detrás de cada decisión. Al terminar deberías poder responder:

- ¿Qué hace el `Controller` y qué NO debería hacer?
- ¿Por qué existe el `Service` como capa separada?
- ¿Por qué el `Repository` no debería tener lógica de negocio?
- ¿Qué ventaja tiene retornar `ResponseEntity` en lugar de un objeto directo?
- ¿Por qué las URLs REST usan sustantivos en plural en lugar de verbos?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).
> Ahí encontrarás el escenario, los actores y la lista completa de requerimientos numerados.

De esa lista, esta lección implementa **uno**:

| Requerimiento | Lo que construimos |
|---------------|--------------------|
| **REQ-01** — Consultar todos los tickets | El endpoint `GET /tickets` que devuelve la lista completa en JSON |

Solo uno. Pero ese uno lo construimos con una arquitectura que soportará todo lo demás sin necesidad de reescribir nada.

Los REQ-02 al REQ-10 (crear, actualizar, eliminar, validar) **necesitan** esta base bien puesta para poder agregarse lección a lección sin romper lo que ya existe. Si construyes el `GET` de cualquier forma, el costo lo pagas después. Si lo construyes con capas, los siguientes pasos son naturales.

---

## ¿Qué NO cubre esta lección? (y por qué)

Es importante que sepas lo que intencionalmente dejamos para más adelante, para que no te preocupes si no lo ves aquí:

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| CRUD completo (crear, editar, eliminar) | Primero necesitas dominar la estructura antes de multiplicar endpoints |
| Validaciones (`@Valid`, `@NotNull`) | Agregamos complejidad solo cuando la base esté sólida |
| Manejo de errores global (`@ControllerAdvice`) | Es el paso siguiente natural después de tener un endpoint funcionando |
| Base de datos real (JPA, PostgreSQL) | Usamos memoria para que el foco sea la arquitectura, no la infraestructura |

El objetivo de esta lección no es hacer mucho: es hacer **una cosa bien hecha y con forma profesional**.

---

## Configuración del proyecto

El proyecto ya tiene una configuración mínima en `src/main/resources/application.properties`:

```properties
spring.application.name=Tickets
```

Esto le dice a Spring Boot cómo se llama tu aplicación. Es el único parámetro configurado hasta ahora.

En el futuro vas a aprender a personalizar más cosas desde ahí, como:

- **Cambiar el puerto** donde corre la aplicación (`server.port`)
- **Agregar un prefijo global** a todas tus rutas (`server.servlet.context-path`)
- **Personalizar el banner** que aparece en consola al iniciar (`banner.txt`)

Por ahora esos temas están pendientes. Lo importante es que entiendas que esa personalización **vive en el archivo de configuración**, no dentro del código Java de tus capas.

---

## La idea central de esta lección

> "No buscamos cantidad de endpoints. Buscamos escribir un endpoint pequeño, pero con forma profesional desde el inicio."

Un código bien estructurado hoy te ahorra horas de depuración mañana. La separación de responsabilidades no es un trámite burocrático: es la diferencia entre un proyecto que escala y uno que se convierte en un problema.



<!-- START OF FILE: docs_lessons_04-responsabilities_02_guion_paso_a_paso.md -->
# Documento: docs lessons 04-responsabilities 02 guion paso a paso
---
# Lección 04 - Tutorial paso a paso: construyendo tu primera API con capas

Sigue esta guía en orden. Cada sección te explica qué vas a hacer y **por qué lo hacemos así**, para que no solo copies código sino que entiendas la lógica detrás.

---

## Paso 1: el problema del "controlador que hace todo"

Antes de escribir código, piensa en esto:

Imagina que tienes un restaurante donde el mismo mesero toma el pedido, lo cocina, lo sirve y también lleva la contabilidad. Cuando el restaurante es pequeño quizás funciona, pero cuando creces ese modelo colapsa: si el mesero se enferma, todo falla; si quieres cambiar el menú, tienes que reentrenar a toda la persona.

En programación ocurre exactamente lo mismo. Si tu `Controller` valida datos, contiene la lógica de negocio, accede directamente a la colección de datos y formatea la respuesta, estás ante el mismo problema:

- Es difícil de probar: no puedes testear la lógica sin levantar el servidor HTTP completo
- Es frágil: cambiar una regla de negocio puede romper el manejo HTTP
- No escala: cuando el proyecto crece, ese archivo se vuelve imposible de mantener

La solución es **separar responsabilidades**: cada parte del sistema hace una sola cosa y la hace bien. Eso es exactamente lo que vas a construir hoy.

---

## Paso 2: crear la estructura de paquetes (CSR)

El patrón que vamos a usar se llama **CSR** (Controller - Service - Repository). Antes de escribir ninguna clase, crea los siguientes paquetes dentro de `cl.duoc.fullstack.tickets`:

```
controller/    → recibe y responde peticiones HTTP
service/       → contiene la lógica de negocio
respository/   → accede y almacena los datos (nota: el nombre conserva la errata intencionalmente)
model/         → define la forma de los datos (las "entidades")
```

> **¿Por qué paquetes separados?** En Java, los paquetes son más que carpetas: comunican intención. Cuando alguien abre tu proyecto y ve estos cuatro paquetes, inmediatamente sabe que sigues una arquitectura por capas. Es un lenguaje común entre desarrolladores.

El flujo de una petición siempre sigue este camino:

```
HTTP → Controller → Service → Repository → Service → Controller → HTTP
```

Nunca al revés, nunca saltando capas. El `Controller` nunca llama directamente al `Repository`. Si algún día ves eso en tu código, es una señal de que algo está mal ubicado.

---

## Paso 3: el Modelo (`Ticket.java`)

El modelo es la clase que representa los datos de tu dominio. En este caso, un `Ticket` tiene cuatro atributos: un identificador, un título, una descripción y un estado.

Crea la clase `Ticket` en el paquete `model`:

```java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private Long id;
    private String title;
    private String description;
    private String status;
}
```

> **¿Qué es Lombok y por qué lo usamos?**
> Lombok es una librería que genera código repetitivo automáticamente durante la compilación. Las tres anotaciones hacen lo siguiente:
> - `@Getter`: genera un método `getId()`, `getTitle()`, etc. por cada campo
> - `@Setter`: genera un método `setId()`, `setTitle()`, etc. por cada campo
> - `@AllArgsConstructor`: genera un constructor con todos los campos como parámetros
>
> Sin Lombok tendrías que escribir todo eso a mano. Con Lombok, tu clase queda limpia y legible.

> **¿Por qué los campos están en inglés?**
> Es una convención del sector. Los identificadores de código (clases, métodos, variables) se escriben en inglés para que el proyecto sea entendible por cualquier desarrollador del mundo, independientemente de su idioma. Los textos que el usuario ve sí pueden estar en el idioma local.

---

## Paso 4: el Repository (`TicketRepository.java`)

El `Repository` es la capa que se encarga de **almacenar y recuperar datos**. Hoy usamos una `List` en memoria para simular una base de datos. Cuando en lecciones futuras conectemos una base de datos real, solo tendrás que cambiar esta capa: el resto del código no sabrá la diferencia.

Crea la clase `TicketRepository` en el paquete `respository`:

```java
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {

    List<Ticket> tickets;

    public TicketRepository() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket(1L, "Ticket 1", "Ticket 1", "NEW"));
        tickets.add(new Ticket(2L, "Ticket 2", "Ticket 2", "NEW"));
    }

    public List<Ticket> getAll() {
        return tickets;
    }
}
```

> **¿Qué hace `@Repository`?**
> Le dice a Spring que esta clase es un componente de acceso a datos. Spring la registra automáticamente en su contenedor y la tiene disponible para inyectarla donde sea necesaria. Sin esta anotación, Spring no sabría que esta clase existe.

> **¿Por qué los datos iniciales se cargan en el constructor?**
> El constructor se ejecuta una sola vez cuando Spring crea el objeto. Esos datos iniciales (llamados "seed data" o "datos semilla") nos permiten probar el endpoint de inmediato sin tener que crear datos manualmente. Son datos de prueba, no datos reales.

> **Importante:** como los datos viven en memoria, si reinicias la aplicación vuelven al estado inicial. Eso está bien por ahora: todavía no necesitamos persistencia real.

---

## Paso 5: el Service (`TicketService.java`)

El `Service` es la capa que contiene la **lógica de negocio**. Hoy nuestra lógica es simple (solo devolver la lista), pero esta capa existe porque en el mundo real aquí es donde irían las reglas: filtrar tickets por estado, calcular prioridades, validar que el usuario tenga permisos, etc.

Crea la clase `TicketService` en el paquete `service`:

```java
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {

    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> getTickets() {
        return this.repository.getAll();
    }
}
```

> **¿Qué hace `@Service`?**
> Similar a `@Repository`, le dice a Spring que este es un componente de lógica de negocio. Spring lo registra y lo tiene disponible para inyectarlo.

> **¿Por qué el `Service` recibe el `Repository` por constructor?**
> Esto se llama **inyección de dependencias por constructor**. En lugar de que `TicketService` cree él mismo su `TicketRepository` (con `new`), se lo pedimos a Spring a través del constructor. Las ventajas son claras:
> - Spring gestiona el ciclo de vida de los objetos, no tú
> - En pruebas unitarias puedes pasar un `Repository` falso (mock) sin levantar todo el sistema
> - Las dependencias son explícitas y visibles: cualquiera que lea el constructor sabe exactamente qué necesita esta clase para funcionar

---

## Paso 6: el Controller (`TicketController.java`)

El `Controller` es la única capa que "habla HTTP". Su único trabajo es:
1. Recibir la petición HTTP
2. Llamar al `Service` para que haga el trabajo
3. Devolver la respuesta HTTP

Nada más. Si ves lógica de negocio en el `Controller`, es una señal de que algo está en el lugar equivocado.

Crea la clase `TicketController` en el paquete `controller`:

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return this.service.getTickets();
    }
}
```

> **¿Qué hace cada anotación?**
> - `@RestController`: combina `@Controller` y `@ResponseBody`. Le dice a Spring que esta clase maneja peticiones HTTP y que los objetos que retorne deben convertirse automáticamente a JSON.
> - `@RequestMapping("/tickets")`: define la URL base para todos los endpoints de este controlador. Todos los métodos de esta clase responderán bajo `/tickets`.
> - `@GetMapping`: mapea el método `getAllTickets()` a las peticiones `GET /tickets`. Si el cliente hace `GET /tickets`, Spring ejecuta este método.

> **¿Por qué el método se llama `getAllTickets()` y no solo `get()`?**
> Los nombres de los métodos en el `Controller` deben ser descriptivos. `getAllTickets` deja claro a cualquier desarrollador que ese método obtiene todos los tickets. Recuerda: el nombre del método no aparece en la URL; la URL la define `@GetMapping`.

> **Mejora pendiente:** actualmente el método devuelve `List<Ticket>` directamente. El siguiente paso (próximas lecciones) es envolverlo en `ResponseEntity<List<Ticket>>`, lo que nos dará control explícito sobre el código HTTP de la respuesta. Por ahora, Spring retorna automáticamente `200 OK` cuando el método termina sin errores.

---

## Paso 7: verificar que todo funciona

Levanta la aplicación con el botón de play en IntelliJ (o con `./mvnw spring-boot:run` en la terminal) y abre Postman o Insomnia.

Haz una petición `GET` a:

```
http://localhost:8080/tickets
```

Deberías recibir una respuesta `200 OK` con este cuerpo JSON:

```json
[
  {
    "id": 1,
    "title": "Ticket 1",
    "description": "Ticket 1",
    "status": "NEW"
  },
  {
    "id": 2,
    "title": "Ticket 2",
    "description": "Ticket 2",
    "status": "NEW"
  }
]
```

Si ves eso, ¡felicitaciones! Acabas de construir tu primera API con arquitectura por capas.

---

## Paso 8: configuración del proyecto (pendiente)

Por ahora la aplicación corre con la configuración predeterminada de Spring Boot (puerto `8080`, sin prefijo de ruta). El único parámetro configurado explícitamente es el nombre de la aplicación, en `src/main/resources/application.properties`:

```properties
spring.application.name=Tickets
```

En una próxima iteración aprenderás a personalizar la aplicación migrando a `application.yaml` y agregando:

### Cambiar el puerto

Por defecto Spring Boot usa el puerto `8080`. Si necesitas cambiar eso (por ejemplo, porque tienes otro servicio corriendo en ese puerto):

```yaml
server:
  port: 8081
```

Con esto, tu endpoint quedaría en `http://localhost:8081/tickets`.

### Agregar un prefijo global (context path)

En un entorno real, es común que todas las rutas de tu API tengan un prefijo que la identifique. Por ejemplo, si tu API se llama "tickets-app":

```yaml
server:
  servlet:
    context-path: /tickets-app
```

Con esto, el endpoint quedaría en `http://localhost:8080/tickets-app/tickets`.

> **¿Por qué esto se configura en el archivo YAML y no en el código Java?**
> Porque el puerto y el prefijo son **configuración de entorno**, no lógica de negocio. En desarrollo puedes usar el puerto 8080; en producción, el 443. Si eso estuviera hardcodeado en el `Controller`, tendrías que cambiar el código fuente cada vez que cambia el entorno. El archivo de configuración separa esas decisiones del código.

### Personalizar el banner de inicio

Cuando Spring Boot arranca, muestra un banner en la consola. Puedes personalizarlo creando el archivo `src/main/resources/banner.txt`:

```text
=== TICKETS API - CSR CLASS ===
```

Es un detalle pequeño, pero útil para identificar rápidamente qué aplicación está corriendo cuando tienes varias en tu máquina.

---

## Paso 9: reflexiona antes de cerrar

Antes de pasar a la actividad, respóndete estas preguntas mentalmente (o en voz alta):

1. Si mañana necesitas conectar una base de datos real en lugar de la `List`, ¿qué archivo modificarías? ¿Por qué solo ese?
2. Si el cliente pide que un ticket solo sea visible si está en estado `"NEW"`, ¿en qué capa agregarías ese filtro? ¿Por qué no en el `Controller`?
3. Si otro equipo quiere consumir los mismos datos de tickets pero desde una interfaz gráfica diferente, ¿tendrías que cambiar algo del `Service` o del `Repository`? ¿Por qué?

Si puedes responder estas tres preguntas con seguridad, entendiste el objetivo de esta lección.

---

## Extensión opcional

Si terminaste todo lo anterior y quieres ir un paso más, agrega un segundo endpoint que filtre por estado:

```
GET /tickets/status/{status}
```

Por ejemplo, `GET /tickets/status/NEW` debería devolver solo los tickets con `status = "NEW"`. Piensa en qué capa va la lógica de filtrado antes de escribir el código.



<!-- START OF FILE: docs_lessons_04-responsabilities_03_decisiones_rest_y_csr.md -->
# Documento: docs lessons 04-responsabilities 03 decisiones rest y csr
---
# Lección 04 - Por qué hacemos las cosas así: decisiones de diseño explicadas

Esta sección no es un listado de reglas para memorizar. Es una explicación de las decisiones que tomamos al construir la API, para que entiendas el razonamiento detrás de cada una. En el mundo real, un buen desarrollador no solo sabe *qué* hacer, sino *por qué* lo hace.

---

## Decisión 1: la URL es un sustantivo, no un verbo

Cuando defines una URL en una API REST, la URL debe representar un **recurso** (una "cosa"), no una acción. Por eso usamos:

```
GET /tickets
```

Y no:

```
GET /getTickets        ← MAL: el verbo ya está en el método HTTP (GET)
GET /getAllTickets      ← MAL: la URL no es un nombre de función Java
GET /ticket-list       ← MAL: no describe un recurso, describe una estructura
```

El método HTTP (`GET`, `POST`, `PUT`, `DELETE`) es quien expresa la acción. La URL expresa *sobre qué recurso* se realiza esa acción. Separar ambas responsabilidades hace que tu API sea predecible: cualquier desarrollador que la consuma puede intuir qué hace cada endpoint sin leer documentación.

> **¿Por qué el recurso va en plural (`/tickets` y no `/ticket`)?**
> Porque el endpoint devuelve una colección. Cuando dices `/tickets`, estás describiendo "el conjunto de tickets del sistema". Es una convención ampliamente adoptada en APIs REST del mundo real.

> **Diseño objetivo (pendiente):** en una API de producción, además agregaríamos un prefijo `/api` para separar la API del resto de rutas, y `/v1` para indicar la versión, quedando `GET /api/v1/tickets`. Eso permite que en el futuro exista una `v2` sin romper a los clientes que ya consumen la `v1`. Lo incorporaremos en lecciones futuras.

---

## Decisión 2: devolver `ResponseEntity` en lugar del objeto directo

Actualmente el controlador devuelve `List<Ticket>` directamente:

```java
public List<Ticket> getAllTickets() {
    return this.service.getTickets();
}
```

Spring Boot detecta que el método retornó sin error y envía automáticamente un `200 OK`. Eso funciona, pero oculta algo importante: **el código de estado HTTP es parte de la respuesta** y debería ser explícito en tu código.

La forma profesional es usar `ResponseEntity`:

```java
public ResponseEntity<List<Ticket>> getAllTickets() {
    return ResponseEntity.ok(this.service.getTickets());
}
```

¿Por qué es mejor? Porque cuando más adelante necesites devolver un `404 Not Found` (ticket no existe) o un `201 Created` (ticket creado exitosamente), ya tendrás la estructura lista. Si empiezas devolviendo el objeto directo, después tendrás que refactorizar todos tus endpoints.

> **Estado actual:** aún retornamos `List<Ticket>` directamente. Incorporar `ResponseEntity` es el siguiente paso planificado.

---

## Decisión 3: inyección de dependencias por constructor

En el proyecto usamos este patrón en todas las capas:

```java
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }
}
```

La pregunta natural es: ¿por qué no hacemos simplemente `new TicketService()` dentro del constructor? La respuesta es que estaríamos violando un principio clave: **la clase que necesita una dependencia no debería ser responsable de crearla**.

Cuando inyectas por constructor:

- **Spring gestiona los objetos por ti.** No tienes que preocuparte de cuándo crear o destruir instancias.
- **Las dependencias son visibles.** Cualquiera que lea el constructor sabe exactamente qué necesita esa clase para funcionar. No hay dependencias ocultas.
- **Las pruebas unitarias se simplifican.** Puedes pasar un objeto falso (`mock`) en lugar del real sin modificar el código de producción.

Esto contrasta con la inyección por campo (usando `@Autowired` directamente sobre el atributo), que aunque es más corta, esconde las dependencias y hace las pruebas más difíciles.

---

## Decisión 4: cada capa tiene una sola pregunta que responder

Una forma práctica de recordar para qué sirve cada capa es asociarla con una pregunta:

| Capa | Su única pregunta |
|---|---|
| `Controller` | ¿Cómo entra y sale la petición HTTP? |
| `Service` | ¿Qué regla de negocio aplica aquí? |
| `Repository` | ¿Dónde y cómo se almacenan o recuperan los datos? |
| `Model` | ¿Cómo se ve la estructura del dato? |

Cuando revisas tu código, puedes hacer la siguiente prueba de cordura:

- ¿Hay `ResponseEntity` fuera del `Controller`? → Probablemente algo del HTTP se está filtrando hacia capas que no deberían saber de HTTP.
- ¿Hay lógica de negocio (`if`, cálculos, reglas) en el `Controller`? → Moverla al `Service`.
- ¿Hay reglas de negocio en el `Repository`? → Moverlas al `Service`. El `Repository` solo debe saber cómo guardar y recuperar datos, no qué hacer con ellos.

Seguir estas reglas hace que tu código sea predecible: siempre sabes dónde buscar cuando algo falla.

---

## Decisión 5: datos en memoria en lugar de base de datos real

Para esta lección usamos una `List<Ticket>` en el `TicketRepository` como almacenamiento:

```java
List<Ticket> tickets = new ArrayList<>();
tickets.add(new Ticket(1L, "Ticket 1", "Ticket 1", "NEW"));
```

Esto no es una limitación técnica: es una decisión pedagógica intencional.

Si conectáramos una base de datos desde el primer día, el 80% del tiempo lo pasaríamos configurando drivers, credenciales, esquemas y conexiones, en lugar de aprender la arquitectura en sí. Al usar memoria, el foco es completamente la separación de responsabilidades.

Además, la decisión tiene una ventaja arquitectónica: cuando más adelante conectes JPA y PostgreSQL, **solo modificarás el `TicketRepository`**. El `TicketService` y el `TicketController` no necesitarán cambiar, porque no saben (ni deben saber) dónde viven los datos.

> **Importante:** los datos en memoria se pierden al reiniciar la aplicación. Eso es esperado por ahora.

---

## Decisión 6: la configuración vive en archivos de configuración, no en el código

Actualmente el único parámetro configurado es:

```properties
spring.application.name=Tickets
```

La regla es simple: cualquier valor que pueda cambiar entre entornos (desarrollo, staging, producción) debe vivir en el archivo de configuración, **nunca hardcodeado en el código Java**.

Por ejemplo, el puerto de la aplicación puede ser diferente en cada ambiente. La forma correcta de cambiarlo es en `application.yaml`:

```yaml
server:
  port: 8081
  servlet:
    context-path: /tickets-app
```

Si ese valor estuviera escrito directamente en el `Controller`, tendrías que modificar y recompilar el código fuente cada vez que cambias de ambiente. Eso es un error grave en cualquier proyecto profesional.

> **Pendiente:** migrar a `application.yaml` y agregar configuraciones de puerto, context path y banner personalizado.

---

## Criterio de calidad que te acompaña en el curso

> "Poco alcance, buena forma."

En este curso preferimos que construyas un único endpoint perfectamente estructurado antes que cinco endpoints desorganizados. La forma profesional se aprende desde el primer día, no "cuando el proyecto crezca".



<!-- START OF FILE: docs_lessons_04-responsabilities_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 04-responsabilities 04 checklist rubrica minima
---
# Lección 04 - Lista de verificación: ¿llegué al mínimo requerido?

Usa esta lista para revisar tu propio trabajo antes de presentarlo. Cada ítem tiene una breve explicación de qué significa y cómo verificarlo, para que no sea solo un tick en una casilla.

---

## ¿Qué es un indicador de evaluación (IE)?

Los indicadores de evaluación son los criterios concretos con los que se mide tu aprendizaje. Esta lección no busca cubrir todos los indicadores de la unidad, sino construir una base sólida sobre la que se apoyarán las siguientes.

---

## IE 1.2.1 - Estructura CSR con separación real

Este indicador mide si tu código está organizado por responsabilidades o si todo está mezclado en un mismo lugar.

Checklist:

- [x] Existen los paquetes `controller`, `service`, `repository`, `model`
- [x] `TicketController` no accede directamente a la lista de tickets
- [x] `TicketService` llama a `TicketRepository.getAll()` a través de `getTickets()`
- [x] `TicketRepository` es el único lugar donde vive y se accede a la lista

**Cómo verificarlo:** abre cada clase y pregúntate "¿esta clase hace algo que no le corresponde?". Si `TicketController` tiene un `ArrayList` o un `new TicketRepository()`, algo está mal. El flujo correcto es:

```
GET /tickets → TicketController.getAllTickets()
             → TicketService.getTickets()
             → TicketRepository.getAll()
             → [ lista de tickets ]
```

---

## IE 1.1.2 - Diseño de endpoints REST

Este indicador mide si tus URLs siguen las convenciones de REST. Una API bien diseñada es predecible: alguien que nunca la vio puede intuir cómo usarla.

Checklist:

- [x] El recurso está en plural: `/tickets`
- [x] El método HTTP es el correcto para listar: `GET`
- [x] La URL no contiene verbos: no hay `/getTickets` ni `/listar`
- [ ] Base path versionado: `/api/v1` *(pendiente para próximas lecciones)*

**Cómo verificarlo:** haz la petición `GET http://localhost:8080/tickets` en Postman o Insomnia y confirma que recibes `200 OK` con un arreglo JSON.

---

## IE 1.1.3 - Respuestas REST y códigos HTTP

Este indicador mide si tu API comunica correctamente el resultado de cada operación a través de los códigos de estado HTTP. Los códigos no son un detalle menor: le dicen al cliente si su petición fue exitosa, si el recurso no existe, o si cometió un error.

Checklist:

- [x] La petición `GET /tickets` responde con `200 OK`
- [x] El cuerpo de la respuesta es JSON válido (arreglo de objetos `Ticket`)
- [ ] Uso de `ResponseEntity` para control explícito del código HTTP *(pendiente)*

> **¿Por qué está pendiente `ResponseEntity`?** Actualmente Spring retorna `200 OK` automáticamente porque el método no lanza ninguna excepción. Eso funciona para el caso feliz, pero no nos da control cuando las cosas salen mal. En las próximas lecciones usaremos `ResponseEntity` para poder retornar `404`, `400`, `201`, etc. según el caso.

**Cómo verificarlo:** en Postman, observa el código de estado en la esquina superior derecha de la respuesta. Debe decir `200 OK`.

---

## IE 1.2.2 - Modelo y persistencia en memoria

Este indicador mide si tu entidad de dominio está bien definida y si el mecanismo de almacenamiento temporal funciona correctamente.

Checklist:

- [x] La clase `Ticket` tiene campos coherentes: `id` (`Long`), `title`, `description`, `status`
- [x] `TicketRepository` usa `List<Ticket>` para almacenamiento temporal
- [x] El campo `id` está definido y se ve en la respuesta JSON

**Cómo verificarlo:** en la respuesta JSON del endpoint, cada objeto ticket debe tener los cuatro campos. Si falta alguno, revisa que Lombok esté instalado y que `@Getter` esté en la clase `Ticket`.

> **Pista sobre Lombok:** si los campos no aparecen en el JSON, probablemente Lombok no está generando los getters. Verifica que la dependencia esté en el `pom.xml` y que el plugin de Lombok esté habilitado en IntelliJ (Preferences → Plugins → Lombok).

---

## Configuración mínima Spring Boot

Este ítem no es un indicador de evaluación formal, pero es parte de las buenas prácticas que debes incorporar desde el inicio.

Checklist:

- [x] Existe `src/main/resources/application.properties` con `spring.application.name=Tickets`
- [ ] Migrar configuración a `application.yaml` *(pendiente)*
- [ ] Configurar `server.port` con un puerto personalizado *(pendiente)*
- [ ] Configurar `server.servlet.context-path` con un prefijo global *(pendiente)*
- [ ] Crear `src/main/resources/banner.txt` con un texto personalizado *(pendiente)*

**¿Por qué esto importa?** Un proyecto real siempre tiene configuración externa. Aprender a usarla desde el principio te evita el mal hábito de hardcodear valores en el código.

---

## Indicadores que se trabajan en lecciones siguientes

Los siguientes indicadores están en el horizonte del curso. No se evalúan en esta lección, pero es útil que sepas hacia dónde vamos:

| Indicador | Qué cubre |
|---|---|
| IE 1.2.3 | CRUD completo: crear, leer, actualizar y eliminar tickets |
| IE 1.3.1 | Validaciones de entrada con `@Valid`, `@NotNull`, `@NotBlank` |
| IE 1.3.2 | Manejo global de excepciones con `@ControllerAdvice` |
| IE 1.3.3 | Pruebas automáticas de los endpoints REST |

---

## ¿Completé el mínimo de esta lección?

Marcaste todo lo que corresponde si:

- ✅ Tu proyecto tiene los cuatro paquetes con sus clases (`TicketController`, `TicketService`, `TicketRepository`, `Ticket`)
- ✅ Puedes hacer `GET http://localhost:8080/tickets` y recibir un arreglo JSON con los dos tickets semilla
- ✅ Puedes explicar en tus propias palabras qué hace cada clase y por qué está en su paquete correspondiente



<!-- START OF FILE: docs_lessons_04-responsabilities_05_actividad_individual_users.md -->
# Documento: docs lessons 04-responsabilities 05 actividad individual users
---
# Lección 04 - Actividad individual: recurso `users`

Ahora es tu turno. Esta actividad replica lo que construiste con `Ticket`, pero esta vez para un recurso `User`. El objetivo es que apliques el patrón CSR de forma autónoma, tomando las mismas decisiones de diseño que aprendiste.

> Si no estuviste en clase, lee primero el tutorial paso a paso (`02_guion_paso_a_paso.md`) y el documento de decisiones de diseño (`03_decisiones_rest_y_csr.md`) antes de comenzar esta actividad.

---

## ¿Qué vas a construir?

Un microservicio independiente para gestionar usuarios, con la misma estructura por capas que el proyecto `Tickets`. El entregable mínimo es un único endpoint:

```
GET /users
```

Que devuelve una lista JSON de usuarios cargados en memoria.

---

## Restricciones de la actividad

Estas restricciones no son caprichosas: están pensadas para que practiques exactamente lo que se evaluará.

| Restricción | Por qué |
|---|---|
| Usar el patrón CSR con paquetes separados | Es el núcleo de esta lección |
| Usar `List` para persistencia temporal | No usamos BD todavía; el foco es la arquitectura |
| No implementar CRUD completo | Primero estructura, después alcance |
| No hardcodear el puerto en el código Java | La configuración vive en archivos de configuración, nunca en el código |

---

## Modelo sugerido

Crea la clase `User` en el paquete `model`. Usa Lombok para no escribir getters, setters ni constructores manualmente:

```java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
```

> **¿Por qué `name` y `email` en inglés?** Seguimos la misma convención que en `Ticket`: los identificadores de código en inglés. Si los datos que el usuario ve en pantalla deben estar en español, eso se maneja en la capa de presentación, no en el modelo.

---

## Guía de implementación

Sigue exactamente el mismo orden que en el tutorial de tickets:

### 1. Crea el paquete y la clase `User`

Campos: `id` (`Long`), `name` (`String`), `email` (`String`) con las anotaciones Lombok.

### 2. Crea `UserRepository`

- Anótala con `@Repository`
- Inicializa una `List<User>` en el constructor con al menos 2 usuarios de prueba
- Crea el método `getAll()` que retorne la lista

### 3. Crea `UserService`

- Anótala con `@Service`
- Recibe `UserRepository` por constructor (inyección de dependencias)
- Crea el método `getUsers()` que llame a `repository.getAll()`

### 4. Crea `UserController`

- Anótalo con `@RestController` y `@RequestMapping("/users")`
- Recibe `UserService` por constructor
- Crea el método `getAllUsers()` con `@GetMapping` que retorne `this.service.getUsers()`

### 5. Prueba el endpoint

Levanta la aplicación y haz una petición `GET http://localhost:8080/users` en Postman o Insomnia. Deberías recibir:

```json
[
  { "id": 1, "name": "...", "email": "..." },
  { "id": 2, "name": "...", "email": "..." }
]
```

---

## ¿Cómo sé si lo hice bien?

### Logro alto

- Los cuatro paquetes existen: `controller`, `service`, `repository`, `model`
- `UserController` no tiene ninguna lista ni lógica de negocio: solo llama al `service`
- El endpoint `GET /users` responde `200 OK` con JSON válido
- El método del controlador se llama `getAllUsers()` y la URL es `/users` (sin verbos)
- Puedes explicar en voz alta por qué cada clase está en su paquete

### Logro medio

- La estructura CSR existe pero hay alguna mezcla menor (por ejemplo, lógica simple en el `Controller`)
- El endpoint funciona pero el nombre de la URL o del método no sigue las convenciones
- La respuesta JSON es correcta, pero no puedes justificar las decisiones tomadas

### Logro inicial

- El endpoint funciona, pero todo (o casi todo) está en una sola clase
- La URL contiene verbos o no sigue convenciones REST
- No hay separación clara entre lo que hace cada capa

---

## Extensión opcional: si terminas antes

Si completaste todo lo anterior y quieres un desafío adicional:

### Opción A: buscar por ID

Agrega un endpoint que devuelva un usuario por su `id`:

```
GET /users/{id}
```

- Si el usuario existe, devuelve `200 OK` con el objeto JSON
- Si el usuario **no** existe, devuelve `404 Not Found`

Piensa en qué capa va la lógica de búsqueda antes de escribir el código. Pista: `Optional<User>` puede ser útil aquí.

### Opción B: configurar la aplicación

Aunque es una tarea pendiente, puedes practicar creando un `application.yaml` con:

```yaml
server:
  port: 8082
  servlet:
    context-path: /users-app
```

Y creando `src/main/resources/banner.txt` con el nombre de tu proyecto. Recuerda que si agregas el `context-path`, tu endpoint quedaría en `GET /users-app/users`.

---

## Antes de entregar: pregúntate esto

1. ¿Puedo tocar solo `UserRepository` para cambiar la fuente de datos (de `List` a base de datos) sin modificar `UserService` ni `UserController`?
2. Si un compañero abre mi proyecto, ¿entiende a simple vista dónde vive cada responsabilidad?
3. ¿Mi URL (`/users`) describe un recurso o una acción?

Si las tres respuestas son "sí", completaste el objetivo de esta actividad.



<!-- START OF FILE: docs_lessons_05-post_01_objetivo_y_alcance.md -->
# Documento: docs lessons 05-post 01 objetivo y alcance
---
# Lección 05 - POST y creación de recursos: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior construiste una API con arquitectura por capas: `Controller`, `Service`, `Repository` y `Model`. El endpoint que expusiste fue `GET /tickets`, que devolvía una lista de tickets almacenados en memoria.

Era una API que solo sabía leer. Funciona, y la estructura era correcta, pero en la práctica una API que solo lee sirve de muy poco: los datos tienen que entrar desde algún lugar.

Esta lección existe para resolver eso.

---

## ¿Qué vas a construir?

Al terminar esta lección habrás extendido tu API de tickets para que también sea capaz de **recibir y guardar información nueva**. Concretamente:

- Agregarás el endpoint `POST /tickets` al controlador existente
- Recibirás datos JSON desde el cliente usando `@RequestBody`
- Asignarás IDs de forma automática dentro del `Repository`
- Devolverás el ticket creado con el código de estado correcto: `201 Created`

### Lo que vas a ser capaz de explicar

Más que ejecutar el código, el objetivo es que entiendas cada decisión. Al terminar deberías poder responder:

- ¿Para qué sirve `@RequestBody` y qué problema resuelve?
- ¿Por qué el servidor asigna el ID y no el cliente?
- ¿Por qué una creación exitosa responde `201` y no `200`?
- ¿Qué diferencia hay entre devolver un objeto directamente y usar `ResponseEntity`?
- ¿Por qué el modelo necesita un constructor vacío para que `@RequestBody` funcione?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).
> Ahí encontrarás el escenario, los actores y la lista completa de requerimientos numerados.

De esa lista, esta lección implementa **cinco**:

| Requerimiento | Lo que construimos |
|---------------|--------------------|
| **REQ-02** — Registrar un nuevo ticket con título y descripción | El endpoint `POST /tickets` con `@RequestBody` |
| **REQ-03** — Estado inicial `NEW` automático | El `Service` asigna `status = "NEW"` al crear |
| **REQ-04** — Sin títulos duplicados | El `Service` valida con `existsByTitle()` antes de guardar |
| **REQ-05** — Fecha y hora de creación automática | El `Service` asigna `createdAt = LocalDateTime.now()` |
| **REQ-06** — Fecha estimada de resolución | El `Service` calcula `estimatedResolutionDate = hoy + 5 días` |

Nota que REQ-03 a REQ-06 **no los envía el cliente** en el body del `POST`. Los calcula y asigna el servidor. Eso no es un detalle técnico: es una regla de negocio, y el lugar correcto para esa lógica es el `Service`.

---

## ¿Qué NO cubre esta lección? (y por qué)

Hay cosas que intencionalmente dejamos para más adelante:

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| Validaciones (`@Valid`, `@NotNull`, `@NotBlank`) | Primero entendemos el flujo básico de creación; las validaciones son una capa adicional |
| Manejo global de errores (`@ControllerAdvice`) | Requiere conocer las excepciones que puede lanzar una API; lo trabajaremos cuando tengamos más endpoints |
| IDs auto-generados por la base de datos | Aún no usamos JPA ni PostgreSQL; la estrategia manual es suficiente para esta etapa |
| `PUT`, `PATCH` y `DELETE` | Completaremos el CRUD una vez que `POST` esté dominado |
| UUID como identificador | Agrega complejidad sin aportar valor en esta etapa del aprendizaje |

El foco de esta lección es uno solo: **entender cómo entra información a la API y cómo se responde correctamente cuando algo se crea**.

---

## El problema que resuelve `POST`

Hasta ahora, los datos de tu API estaban cargados de forma fija en el constructor del `TicketRepository`. Eso funcionaba para probar el `GET`, pero tiene un problema obvio: nadie puede agregar tickets nuevos mientras la aplicación está corriendo.

El método `POST` es la solución. Cuando un cliente quiere crear un recurso nuevo, envía los datos en el cuerpo de la petición HTTP y tu API los recibe, los procesa y los persiste (en memoria por ahora).

El flujo completo de una petición `POST` es:

```
Cliente → POST /tickets (con body JSON)
       → TicketController.create()
       → TicketService.create()
       → TicketRepository.save()
       → [ ticket con ID asignado ]
       → 201 Created (con el ticket creado en el body)
```

Cada capa sigue haciendo exactamente lo mismo que en la lección anterior, con la diferencia de que ahora el dato entra desde afuera en lugar de estar hardcodeado.

---

## La idea central de esta lección

> "El código de estado HTTP no es un detalle de implementación. Es parte del contrato de tu API."

Devolver `200 OK` cuando el usuario espera `201 Created` no es solo incorrecto semánticamente: es un error de comunicación. Tu API le está mintiendo al cliente sobre lo que acaba de ocurrir. Desde esta lección, el código de respuesta siempre será explícito y correcto.




<!-- START OF FILE: docs_lessons_05-post_02_guion_paso_a_paso.md -->
# Documento: docs lessons 05-post 02 guion paso a paso
---
# Lección 05 - Tutorial paso a paso: agregando POST a tu API

Sigue esta guía en orden. Vas a extender el proyecto de tickets que construiste en la lección anterior, agregando la capacidad de crear nuevos tickets a través de una petición `POST`.

---

## Paso 1: entender qué cambios necesitamos

Antes de tocar el código, piensa en lo que falta. Tu API actualmente tiene esto:

```
GET /tickets → devuelve la lista completa
```

Y lo que necesita tener:

```
GET  /tickets → devuelve la lista completa         (ya existe)
POST /tickets → recibe un ticket nuevo y lo guarda (lo que vamos a construir)
```

Para que el `POST` funcione, necesitas modificar **cuatro capas**:

1. **`Ticket` (Model):** agregar un constructor vacío y tres nuevos campos de fecha
2. **`TicketRepository`:** agregar `existsByTitle()` para validar duplicados y el método `save()` con ID incremental
3. **`TicketService`:** agregar `create()` con toda la lógica de negocio (validación, estado, fechas)
4. **`TicketController`:** agregar el endpoint `@PostMapping` con `@RequestBody` y `ResponseEntity`

La separación de capas hace que los cambios estén bien localizados: cada capa se modifica por su propia razón, no por razones de otra capa.

---

## Paso 2: preparar el Modelo (`Ticket.java`)

Abre la clase `Ticket` en el paquete `model`. Necesita dos cambios: un constructor vacío para que Jackson pueda deserializar el JSON entrante, y tres nuevos campos para representar el ciclo de vida del ticket en el tiempo.

```java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDate estimatedResolutionDate;
    private LocalDateTime effectiveResolutionDate;
}
```

> **¿Por qué `@NoArgsConstructor`?**
> Spring usa Jackson para convertir el JSON del cliente en un objeto Java. El proceso es: Jackson crea una instancia vacía (`new Ticket()`) y luego llama a los setters campo por campo. Sin `@NoArgsConstructor`, ese primer paso falla y la petición devuelve un error `400 Bad Request` confuso sobre deserialización.

> **¿Por qué conservamos `@AllArgsConstructor`?**
> Porque el `TicketRepository` lo sigue usando para construir los tickets semilla con todos sus campos. Ambas anotaciones coexisten sin problema: Java permite múltiples constructores con diferentes firmas.

> **¿Por qué `LocalDate` para la estimada y `LocalDateTime` para las otras?**
> La fecha de creación y de resolución efectiva necesitan precisión de hora y minuto: importa saber a qué hora exacta ocurrió cada evento. La fecha estimada, en cambio, es una fecha de vencimiento: no importa la hora, solo el día. `LocalDate` comunica esa intención con más precisión que un `LocalDateTime` donde la hora sería siempre `00:00`.

> **¿El cliente manda estos campos en el POST?**
> No. El cliente solo manda `title` y `description`. Los campos `status`, `createdAt`, `estimatedResolutionDate` y `effectiveResolutionDate` los asigna exclusivamente el servidor. Si el cliente los incluye en el JSON, el servidor los ignora y los sobreescribe. Esa es la lógica de negocio que vive en el `Service`.

---

## Paso 3: agregar `existsByTitle()` y `save()` al Repository (`TicketRepository.java`)

El `Repository` cumple dos responsabilidades nuevas: verificar si un título ya existe, y persistir un ticket nuevo con un ID generado automáticamente.

Reemplaza el contenido de `TicketRepository` con lo siguiente:

```java
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {

    private List<Ticket> tickets;
    private Long currentId = 3L;

    public TicketRepository() {
        tickets = new ArrayList<>();
        tickets.add(new Ticket(
            1L, "Ticket 1", "Descripción del ticket 1", "NEW",
            LocalDateTime.of(2026, 3, 15, 9, 0),
            LocalDate.of(2026, 3, 22),
            null
        ));
        tickets.add(new Ticket(
            2L, "Ticket 2", "Descripción del ticket 2", "RESOLVED",
            LocalDateTime.of(2026, 3, 10, 14, 30),
            LocalDate.of(2026, 3, 17),
            LocalDateTime.of(2026, 3, 16, 11, 0)
        ));
    }

    public List<Ticket> getAll() {
        return tickets;
    }

    public boolean existsByTitle(String title) {
        return tickets.stream()
            .anyMatch(t -> t.getTitle().equalsIgnoreCase(title));
    }

    public Ticket save(Ticket ticket) {
        ticket.setId(currentId++);
        tickets.add(ticket);
        return ticket;
    }
}
```

> **¿Por qué `currentId` empieza en `3L`?**
> Los tickets semilla ya ocupan los IDs `1` y `2`. Empezar en `3` garantiza que no haya colisión de IDs.

> **¿Por qué `existsByTitle()` usa `equalsIgnoreCase()`?**
> Para que `"login falla"`, `"Login Falla"` y `"LOGIN FALLA"` sean considerados el mismo título. Un usuario que comete un error de capitalización no debería poder crear un ticket duplicado. La comparación sin distinción de mayúsculas es más robusta y más amigable.

**Código equivalente sin expresiones lambda:**

```java
public boolean existsByTitle(String title) {
    for (Ticket ticket : tickets) {
        if (ticket.getTitle().equalsIgnoreCase(title)) {
            return true;
        }
    }
    return false;
}
```

El `for` recorre cada ticket y retorna `true` en cuanto encuentra un título coincidente. Si termina el recorrido sin encontrar ninguno, retorna `false`. El stream con `anyMatch` hace exactamente lo mismo con menos líneas.

> **¿Por qué esta validación vive en el `Repository` y no en el `Service`?**
> La consulta de si algo existe en el almacenamiento es responsabilidad del `Repository`: es quien sabe dónde y cómo están guardados los datos. Pero la *decisión* de qué hacer si existe un duplicado (lanzar una excepción, ignorar, etc.) es responsabilidad del `Service`. El `Repository` solo responde la pregunta; el `Service` toma la acción.

> **Los datos semilla ahora tienen fechas realistas:** el Ticket 1 está abierto (`effectiveResolutionDate: null`), el Ticket 2 ya fue resuelto antes de su fecha estimada. Esto permite probar el `GET` con datos que reflejan ambos estados posibles de un ticket.

---

## Paso 4: agregar `create()` al Service (`TicketService.java`)

El `Service` es donde vive toda la lógica de negocio de la creación. Esta es la capa más importante de este paso: aquí se concentra todo lo que el servidor decide de forma autónoma, sin depender de lo que el cliente mande.

Abre `TicketService` y agrega el método `create()`:

```java
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketService {

    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> getTickets() {
        return this.repository.getAll();
    }

    public Ticket create(Ticket ticket) {
        if (repository.existsByTitle(ticket.getTitle())) {
            throw new IllegalArgumentException(
                "Ya existe un ticket con el título: \"" + ticket.getTitle() + "\""
            );
        }

        ticket.setStatus("NEW");
        ticket.setCreatedAt(LocalDateTime.now());
        ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));
        ticket.setEffectiveResolutionDate(null);

        return this.repository.save(ticket);
    }
}
```

> **¿Por qué el `Service` lanza una excepción en lugar de devolver `null` o `false`?**
> Porque una excepción comunica explícitamente que ocurrió algo inesperado e impide que el flujo continúe. Si devolviéramos `null`, el controlador tendría que verificar si el resultado es nulo y tomar la decisión, lo que mezcla lógica de negocio con lógica de presentación HTTP. La excepción fuerza al controlador a manejar el error de forma explícita.

> **¿Por qué el `Service` asigna el `status` en lugar de recibirlo del cliente?**
> Porque "un ticket recién creado siempre empieza como `NEW`" es una **regla de negocio**. Si el cliente pudiera mandar `"status": "RESOLVED"` y el servidor lo aceptara, cualquier usuario podría resolver un ticket sin haberlo trabajado. El servidor tiene la autoridad sobre su propio estado interno.

> **¿Por qué el `Service` calcula la fecha estimada (y no el cliente)?**
> Por el mismo principio: la regla "la resolución estimada es 5 días después de la creación" es lógica de negocio. Si el cliente calculara esa fecha, cada cliente podría mandar una fecha diferente. Centralizar el cálculo en el `Service` garantiza que la regla se aplique de forma consistente sin importar desde dónde se cree el ticket.

> **¿Por qué `effectiveResolutionDate` se asigna como `null`?**
> Porque en el momento de la creación el ticket aún no está resuelto. Esta fecha se asignará en el futuro, cuando se implemente el endpoint de actualización de estado (`PUT /tickets/{id}`). Por ahora, dejarla como `null` es el estado correcto para un ticket nuevo.

---

## Paso 5: agregar el endpoint `POST` al Controller (`TicketController.java`)

El controlador recibe la petición, llama al `Service` y devuelve la respuesta apropiada. Incluye manejo de la excepción de duplicado porque, mientras no tengamos `@ControllerAdvice`, esta es la única forma de interceptarla antes de que Spring devuelva un `500 Internal Server Error`.

Reemplaza el contenido de `TicketController` con lo siguiente:

```java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return this.service.getTickets();
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Ticket ticket) {
        try {
            service.create(ticket);
            return ResponseEntity.status(HttpStatus.CREATED).body("Ticket Creado");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}
```

> **¿Por qué `ResponseEntity<Object>` y no `ResponseEntity<Ticket>`?**
> Porque el método puede retornar dos tipos distintos: un `Ticket` (cuando todo sale bien) o un `String` con el mensaje de error (cuando hay duplicado). Java no permite que un método genérico retorne dos tipos diferentes, así que usamos `Object` como tipo común. Esta es una limitación temporal: cuando implementemos `@ControllerAdvice` en lecciones futuras, el controlador volverá a tener `ResponseEntity<Ticket>` y el manejo de errores vivirá en una clase dedicada.

> **¿Por qué `409 Conflict` para el duplicado?**
> El estándar HTTP define `409 Conflict` para situaciones donde la petición no puede completarse por un conflicto con el estado actual del recurso. Crear un ticket con un título que ya existe es exactamente eso: la petición entra en conflicto con un dato que ya existe. Es más preciso que `400 Bad Request` (que indica que el formato del request está mal) o `422 Unprocessable Entity` (que indica que la entidad no puede procesarse).

> **¿Por qué el `try/catch` está en el `Controller` y no en el `Service`?**
> Porque la decisión de qué código HTTP devolver es responsabilidad del controlador. El `Service` solo sabe que algo salió mal (por eso lanza la excepción). El `Controller` es quien sabe cómo traducir ese error a un código HTTP. Cada capa hace lo que le corresponde.

---

## Paso 6: verificar que todo funciona

Levanta la aplicación y abre Postman, Insomnia o Thunder Client.

### Prueba 1: crear un ticket nuevo

Haz una petición `POST` a:

```
POST http://localhost:8080/tickets
Content-Type: application/json
```

Con el siguiente body. **Nota:** solo mandas `title` y `description`. El servidor se encarga de todo lo demás.

```json
{
  "title": "Login falla con usuario especial",
  "description": "El sistema no permite el acceso con caracteres especiales en el nombre de usuario"
}
```

Resultado esperado (`201 Created`):

```
Ticket Creado
```

Observa que:
- La respuesta es un texto plano confirmando la creación, no el objeto completo
- Internamente, el servidor asignó `id`, `status = "NEW"`, `createdAt` y `estimatedResolutionDate` (5 días después)
- Puedes verificar el ticket creado con `GET /tickets`

### Prueba 2: intentar crear un ticket con el mismo título

Vuelve a mandar el mismo POST con el mismo título:

```json
{
  "title": "Login falla con usuario especial",
  "description": "Otro intento con el mismo título"
}
```

Resultado esperado (`409 Conflict`):

```
Ya existe un ticket con el título: "Login falla con usuario especial"
```

El servidor rechaza la creación porque ya existe un ticket con ese título. El mensaje viene directamente de la excepción lanzada en el `Service`.

### Prueba 3: verificar que el GET refleja el estado correcto

```
GET http://localhost:8080/tickets
```

Deberías ver los 3 tickets: los 2 semilla más el que acabas de crear. Los semilla tienen `status = "NEW"` y el nuevo también.

---

## Paso 7: reflexiona antes de cerrar

Antes de pasar a la actividad, respóndete estas preguntas:

1. El cliente mandó un JSON sin el campo `status`. ¿Qué valor tiene `status` en el objeto `Ticket` cuando llega al `Service`? ¿Qué pasa si el cliente sí lo manda con `"status": "RESOLVED"`?
2. Si mañana la regla de negocio cambia y la fecha estimada pasa de 5 días a 10 días hábiles, ¿qué archivo modificarías? ¿Tendrías que tocar el `Controller` o el `Repository`?
3. ¿Por qué el `try/catch` está en el `Controller` y no en el `Service`? ¿Qué pasaría si lo pusieras en el `Service`?

---

## Extensión opcional

Si terminaste todo lo anterior y quieres ir un paso más, implementa el endpoint de resolución de un ticket:

```
PUT /tickets/by-id/{id}/resolve
```

- Busca el ticket por `id` en el `Repository`
- Si no existe, devuelve `404 Not Found`
- Si ya está `"RESOLVED"`, devuelve `409 Conflict` con un mensaje claro
- Si existe y está `"NEW"`, cambia el `status` a `"RESOLVED"` y asigna `effectiveResolutionDate = LocalDateTime.now()`
- Devuelve `200 OK` con el ticket actualizado

Este es el momento en que `effectiveResolutionDate` deja de ser `null`. Toda la lógica de ese cambio de estado vive en el `Service`.



<!-- START OF FILE: docs_lessons_05-post_03_decisiones_post_y_http.md -->
# Documento: docs lessons 05-post 03 decisiones post y http
---
# Lección 05 - Por qué hacemos las cosas así: decisiones de diseño explicadas

Esta sección no es un listado de reglas. Es la explicación del razonamiento detrás de cada decisión que tomamos al agregar el `POST` a nuestra API. Un buen desarrollador no solo sabe *qué* hacer, sino *por qué* lo hace así y no de otra manera.

---

## Decisión 1: `201 Created` en lugar de `200 OK`

Esta es la decisión más visible de la lección y la que más errores comete la gente al principio.

El protocolo HTTP define los códigos de estado con precisión. No son sugerencias: son un contrato entre el servidor y el cliente. La diferencia entre `200` y `201` no es cosmética:

| Código | Nombre | Significado |
|---|---|---|
| `200 OK` | OK | La petición fue exitosa. Se usa para consultas (`GET`) o actualizaciones genéricas. |
| `201 Created` | Created | La petición fue exitosa **y** como resultado se creó un nuevo recurso. |

Cuando tu `POST /tickets` devuelve `200 OK`, le estás diciendo al cliente: "todo salió bien, pero no sé bien qué pasó". Cuando devuelves `201 Created`, le estás diciendo: "todo salió bien y se creó exactamente un recurso nuevo".

Los clientes automatizados (otras APIs, aplicaciones frontend, scripts) toman decisiones basadas en el código de estado. Un frontend que espera `201` para mostrar un mensaje de "recurso creado" no funcionará correctamente si recibe `200`.

> **La regla práctica:**
> - Operación que solo consulta → `200 OK`
> - Operación que crea un recurso nuevo → `201 Created`
> - Operación que actualiza un recurso existente → `200 OK`
> - Operación que elimina → `204 No Content`

---

## Decisión 2: el servidor asigna el ID, no el cliente

En el endpoint `POST /tickets`, el cliente manda esto:

```json
{
  "title": "Bug en login",
  "description": "...",
  "status": "NEW"
}
```

Y el servidor responde con:

```json
{
  "id": 3,
  "title": "Bug en login",
  "description": "...",
  "status": "NEW"
}
```

El cliente no mandó el `id`. El servidor lo asignó. Esto no es accidental: es una decisión de diseño deliberada.

**¿Por qué no dejar que el cliente elija su propio ID?**

Imagina que dos clientes (dos usuarios distintos usando la aplicación al mismo tiempo) envían simultáneamente un ticket con `"id": 5`. ¿Cuál de los dos tiene razón? ¿Quién gana? El sistema quedaría en un estado inconsistente.

El servidor tiene una visión centralizada del estado: sabe qué IDs ya existen. Por eso la autoridad para generar IDs siempre recae en el servidor, nunca en el cliente.

**¿Qué pasa si el cliente manda un `id` en el JSON de todas formas?**

Jackson lo leerá y lo asignará al campo `id` del objeto `Ticket`. Pero inmediatamente después, el `Repository` lo sobreescribirá con `ticket.setId(currentId++)`. El valor que mandó el cliente se descarta. El servidor siempre tiene la última palabra sobre el ID.

---

## Decisión 3: ID incremental manual en lugar de UUID

El raw material de esta lección menciona que no usamos UUID aún. Aquí está el razonamiento completo.

Un UUID se ve así: `550e8400-e29b-41d4-a716-446655440000`. Es un identificador globalmente único, generado de forma aleatoria, que prácticamente nunca colisiona con otro UUID aunque lo generes en otra máquina.

¿Por qué no usarlo desde el principio?

| Criterio | ID incremental (`Long`) | UUID (`String`) |
|---|---|---|
| Legibilidad en pruebas | Fácil: `1`, `2`, `3` | Difícil: `550e8400-...` |
| Complejidad de implementación | Mínima | Requiere `UUID.randomUUID()` y tipo `String` |
| URLs amigables | `GET /tickets/3` | `GET /tickets/550e8400-...` |
| Valor pedagógico en esta etapa | Alto: foco en el flujo | Bajo: distrae con detalles |
| Cuándo tiene sentido | APIs internas con BD relacional | APIs públicas, microservicios distribuidos |

La regla es sencilla: no agregues complejidad antes de necesitarla. En esta etapa, el contador incremental es la herramienta correcta. Cuando conectemos una base de datos real, JPA o PostgreSQL manejarán la generación de IDs automáticamente, y el contador manual desaparecerá.

---

## Decisión 4: `@NoArgsConstructor` en el modelo

Antes de esta lección, `Ticket` solo tenía `@AllArgsConstructor`. Ahora agregamos `@NoArgsConstructor`. ¿Por qué?

Cuando Spring recibe una petición con `@RequestBody`, le pide a Jackson que convierta el JSON en un objeto Java. Jackson hace esto en dos pasos:

1. Crea una instancia vacía del objeto: `new Ticket()` → necesita constructor sin argumentos
2. Llama a cada setter para asignar los valores del JSON: `ticket.setTitle("Bug en login")` → necesita setters (`@Setter`)

Sin `@NoArgsConstructor`, el paso 1 falla y Spring devuelve un error `400 Bad Request` con un mensaje confuso sobre deserialización. El error real no es que el JSON sea inválido: es que Jackson no puede construir el objeto.

> **¿No rompe esto algo?**
> No. `@NoArgsConstructor` y `@AllArgsConstructor` pueden coexistir sin problema. Java permite múltiples constructores con diferentes firmas. El código existente (los tickets semilla con `new Ticket(1L, "Ticket 1", ...)`) sigue usando `@AllArgsConstructor`. El nuevo flujo de `@RequestBody` usa `@NoArgsConstructor`.

---

## Decisión 5: `ResponseEntity` como estándar en el Controller

En la lección anterior, el `TicketController` devolvía `List<Ticket>` directamente:

```java
@GetMapping
public List<Ticket> getAllTickets() {
    return this.service.getTickets();
}
```

En esta lección, el nuevo endpoint devuelve `ResponseEntity<Ticket>`:

```java
@PostMapping
public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
    Ticket saved = service.create(ticket);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
}
```

¿Por qué el cambio? Porque `ResponseEntity` nos da control completo sobre tres aspectos de la respuesta HTTP:

1. **El código de estado**: `200`, `201`, `404`, `400`, etc.
2. **Los headers**: `Content-Type`, `Location`, cabeceras personalizadas
3. **El body**: el objeto serializado como JSON

Devolver el objeto directamente le delega ese control a Spring, que simplemente asume `200 OK` siempre que no haya excepción. Eso es conveniente, pero nos quita expresividad.

A partir de esta lección, todos los endpoints nuevos usarán `ResponseEntity`. El `GET /tickets` existente se migra en la próxima iteración.

> **Criterio de calidad que te acompaña en el curso:**
> Poco alcance, buena forma. Una API con dos endpoints perfectamente estructurados es mejor que cinco endpoints que no comunican correctamente su estado HTTP.

---

## Decisión 6: el body de la respuesta incluye el objeto creado completo

Cuando el `POST` es exitoso, la respuesta incluye el ticket tal como quedó guardado:

```json
{
  "id": 3,
  "title": "Bug en login",
  "description": "...",
  "status": "NEW"
}
```

Hay APIs que responden al `POST` con el body vacío y solo el código `201`. Técnicamente es válido. Pero incluir el objeto creado en la respuesta tiene una ventaja concreta para el cliente: **no necesita hacer un GET adicional** para obtener el ID que le asignó el servidor.

Si el cliente necesita saber el ID del ticket que acaba de crear (por ejemplo, para redirigir al usuario a la pantalla de detalle), la respuesta ya lo tiene. Sin una segunda petición. Sin estado compartido. Sin condiciones de carrera.

Esta es la práctica recomendada en APIs REST modernas y es la que usaremos a lo largo del curso.




<!-- START OF FILE: docs_lessons_05-post_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 05-post 04 checklist rubrica minima
---
# Lección 05 - Lista de verificación: ¿llegué al mínimo requerido?

Usa esta lista para revisar tu propio trabajo antes de presentarlo. Cada ítem tiene una breve explicación de qué significa y cómo verificarlo.

---

## ¿Qué es un indicador de evaluación (IE)?

Los indicadores de evaluación son los criterios concretos con los que se mide tu aprendizaje. Esta lección construye directamente sobre la anterior: los mismos indicadores de la lección 04 siguen vigentes, y ahora se agrega uno nuevo relacionado con la creación de recursos.

---

## IE 1.2.3 - Creación de recursos con POST

Este indicador mide si eres capaz de extender una API existente para que pueda recibir datos del cliente y persistirlos correctamente.

Checklist:

- [ ] El endpoint `POST /tickets` existe en `TicketController`
- [ ] El método del controlador usa `@PostMapping` sin argumentos adicionales
- [ ] El parámetro recibe el body con `@RequestBody Ticket ticket`
- [ ] El método retorna `ResponseEntity<Ticket>`, no `Ticket` directamente
- [ ] El código de respuesta es `201 Created`, no `200 OK`
- [ ] El body de la respuesta incluye el ticket con el `id` asignado por el servidor
- [ ] El `id` es asignado en el `Repository`, no en el `Controller` ni en el `Service`

**Cómo verificarlo:** haz una petición `POST http://localhost:8080/tickets` en Postman con un body JSON. Observa el código de estado en la esquina superior derecha: debe decir `201 Created`. El body de la respuesta debe incluir el objeto con un campo `id` con valor `3` (o el siguiente en la secuencia).

**Flujo correcto:**

```
POST /tickets (body JSON) → TicketController.create(@RequestBody)
                          → TicketService.create(ticket)
                          → TicketRepository.save(ticket)
                          → ticket.setId(currentId++)
                          → ResponseEntity 201 Created + body
```

---

## IE 1.1.3 - Respuestas REST y códigos HTTP

Este indicador ahora incluye el manejo explícito de `ResponseEntity`, que en la lección anterior estaba marcado como pendiente.

Checklist:

- [ ] `POST /tickets` responde con `201 Created`
- [ ] `GET /tickets` responde con `200 OK`
- [ ] El body de la respuesta en ambos casos es JSON válido
- [ ] `ResponseEntity` se usa en el método `create()` del controlador
- [ ] El método `getAllTickets()` existente no fue modificado ni roto por los cambios

**Cómo verificarlo:**
- Postman `POST /tickets` → `201 Created` con body
- Postman `GET /tickets` → `200 OK` con arreglo de tickets (incluyendo el recién creado)

> **¿Por qué el GET sigue sin `ResponseEntity`?**
> Porque aún no lo hemos migrado. Está planificado para la próxima iteración. Lo importante es que el nuevo endpoint `POST` ya lo usa correctamente desde el inicio.

---

## IE 1.2.1 - Estructura CSR preservada

Este indicador viene de la lección anterior y sigue vigente. Agregar un nuevo endpoint no debería romper la separación de responsabilidades que ya tenías.

Checklist:

- [ ] `TicketController` no accede directamente a la lista de tickets
- [ ] `TicketController` no tiene `setId()` ni lógica de generación de IDs
- [ ] `TicketService` tiene el método `create()` que llama a `repository.save()`
- [ ] `TicketRepository` tiene el método `save()` con el contador `currentId`
- [ ] El contador `currentId` arranca en `3L` para no colisionar con los tickets semilla

**Cómo verificarlo:** abre cada clase y pregúntate si tiene código que no le corresponde. El `Controller` solo debería tener anotaciones HTTP y llamadas al `Service`. El `Service` solo debería contener lógica de negocio. El `Repository` solo debería manejar la lista.

---

## IE 1.2.2 - Modelo actualizado correctamente

El modelo `Ticket` necesita una modificación específica para que `@RequestBody` funcione.

Checklist:

- [ ] La clase `Ticket` tiene `@NoArgsConstructor`
- [ ] La clase `Ticket` conserva `@AllArgsConstructor` (los tickets semilla lo necesitan)
- [ ] La clase `Ticket` tiene `@Getter` y `@Setter` (Jackson los necesita para la deserialización)
- [ ] Los tickets semilla en el constructor de `TicketRepository` siguen funcionando

**Cómo verificarlo:** si el JSON llega correctamente al servidor (el ticket se crea con los datos que mandaste), significa que `@NoArgsConstructor` está en su lugar. Si recibes un error `400 Bad Request` con mención a "deserialization" o "no suitable constructor", falta `@NoArgsConstructor`.

---

## IE 1.1.2 - Diseño de endpoints REST

Este indicador también viene de la lección anterior. El nuevo endpoint debe seguir las mismas convenciones.

Checklist:

- [ ] El recurso sigue en plural: `/tickets`
- [ ] El método HTTP es el correcto para crear: `POST`
- [ ] La URL no contiene verbos: no hay `/createTicket` ni `/nuevo`
- [ ] Un solo `@RequestMapping("/tickets")` a nivel de clase cubre ambos métodos

**Cómo verificarlo:** el `@PostMapping` del método no necesita argumentos porque hereda el path `/tickets` de `@RequestMapping`. Si ves `@PostMapping("/tickets")` en el método, hay duplicación innecesaria.

---

## Indicadores que se trabajan en lecciones siguientes

| Indicador | Qué cubre |
|---|---|
| IE 1.3.1 | Validaciones de entrada: `@Valid`, `@NotNull`, `@NotBlank` para evitar nombres vacíos en `POST` |
| IE 1.3.2 | Manejo global de excepciones con `@ControllerAdvice` |
| IE 1.3.3 | Pruebas automáticas de los endpoints REST |
| IE 1.2.3 (extensión) | `PUT` para actualizar y `DELETE` para eliminar: CRUD completo |

---

## ¿Completé el mínimo de esta lección?

Completaste el mínimo si:

- ✅ `POST http://localhost:8080/tickets` con un body JSON devuelve `201 Created` con el ticket creado (incluyendo un `id` asignado por el servidor)
- ✅ `GET http://localhost:8080/tickets` después del POST incluye el ticket recién creado en la lista
- ✅ El `id` del nuevo ticket es `3` (o mayor), nunca `null` ni el valor que el cliente intentara mandar
- ✅ Puedes explicar en tus propias palabras por qué `201` y no `200`, y por qué el servidor asigna el ID




<!-- START OF FILE: docs_lessons_05-post_05_actividad_individual_categories.md -->
# Documento: docs lessons 05-post 05 actividad individual categories
---
# Lección 05 - Actividad individual: recurso `categories`

Ahora es tu turno. Esta actividad replica lo que hiciste con `Ticket` en clase, pero esta vez para un recurso `Category` que crearás desde cero. El objetivo es que apliques el patrón CSR con `POST` de forma autónoma, tomando las mismas decisiones de diseño que aprendiste.

> Si no estuviste en clase, lee primero el tutorial paso a paso (`02_guion_paso_a_paso.md`) y el documento de decisiones de diseño (`03_decisiones_post_y_http.md`) antes de comenzar esta actividad.

---

## ¿Qué vas a construir?

Un recurso `Category` completamente nuevo dentro del mismo proyecto `Tickets`, con la arquitectura por capas que ya conoces. El entregable incluye dos endpoints:

```
GET  /api/categories       → devuelve la lista de categorías (con datos semilla)
POST /api/categories       → recibe una categoría nueva y la guarda
```

Nota el prefijo `/api` en la ruta. A partir de esta actividad empezamos a incorporarlo como práctica profesional para separar semánticamente la API del resto del servidor.

---

## Restricciones de la actividad

| Restricción | Por qué |
|---|---|
| Usar el patrón CSR con paquetes separados | Es el núcleo de la arquitectura que se evalúa |
| Usar `List` para persistencia temporal | No usamos BD todavía |
| El servidor asigna el ID, no el cliente | Regla de diseño REST explicada en clase |
| `POST` debe responder `201 Created` | Semántica correcta de HTTP |
| `GET` debe responder `200 OK` | Semántica correcta de HTTP |
| Usar `ResponseEntity` en ambos endpoints | Estándar que adoptamos a partir de esta lección |
| La URL debe usar el prefijo `/api` | Práctica profesional para identificar la API |

---

## Modelo sugerido

Crea la clase `Category` en el paquete `model`. Una categoría de ticket tiene un identificador, un nombre y una descripción:

```java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String description;
}
```

> **¿Por qué necesitas `@NoArgsConstructor` desde el inicio?**
> Porque este recurso tendrá un endpoint `POST` con `@RequestBody`. Jackson necesita el constructor vacío para deserializar el JSON entrante. Si no lo pones desde el principio, tendrás un `400 Bad Request` confuso cuando pruebes el endpoint.

> **¿Qué significa cada campo?**
> - `id`: identificador único asignado por el servidor
> - `name`: nombre corto de la categoría (por ejemplo, `"Bug"`, `"Feature"`, `"Mejora"`)
> - `description`: explicación más detallada de qué tickets entran en esta categoría

---

## Guía de implementación

Sigue este orden. Cada paso construye sobre el anterior.

### 1. Crea el paquete y la clase `Category`

La clase va en el paquete `model`, junto a `Ticket.java`. Usa las cuatro anotaciones Lombok: `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`.

### 2. Crea `CategoryRepository`

- Anótala con `@Repository`
- Declara `private List<Category> categories` y `private Long currentId = 3L`
- En el constructor, inicializa la lista con al menos 2 categorías de prueba:
  - `Bug` / `"Problema o error que afecta el funcionamiento esperado"`
  - `Feature` / `"Nueva funcionalidad solicitada por el usuario"`
- Crea el método `getAll()` que retorne la lista completa
- Crea el método `save(Category category)` que asigne el ID, agregue a la lista y retorne la categoría

### 3. Crea `CategoryService`

- Anótala con `@Service`
- Recibe `CategoryRepository` por constructor (inyección de dependencias)
- Crea el método `getCategories()` que llame a `repository.getAll()`
- Crea el método `create(Category category)` que llame a `repository.save(category)`

### 4. Crea `CategoryController`

- Anótalo con `@RestController` y `@RequestMapping("/api/categories")`
- Recibe `CategoryService` por constructor
- Crea el método `getAllCategories()` con `@GetMapping` que retorne `ResponseEntity.ok(service.getCategories())`
- Crea el método `create()` con `@PostMapping` y `@RequestBody Category category` que retorne `ResponseEntity.status(HttpStatus.CREATED).body(service.create(category))`

### 5. Prueba ambos endpoints

**Prueba GET:**

```
GET http://localhost:8080/api/categories
```

Resultado esperado (`200 OK`):

```json
[
  { "id": 1, "name": "Bug", "description": "Problema o error que afecta el funcionamiento esperado" },
  { "id": 2, "name": "Feature", "description": "Nueva funcionalidad solicitada por el usuario" }
]
```

**Prueba POST:**

```
POST http://localhost:8080/api/categories
Content-Type: application/json

{
  "name": "Mejora",
  "description": "Cambio menor que optimiza una funcionalidad existente"
}
```

Resultado esperado (`201 Created`):

```json
{
  "id": 3,
  "name": "Mejora",
  "description": "Cambio menor que optimiza una funcionalidad existente"
}
```

**Prueba de integridad (GET después del POST):**

Después del POST, vuelve a hacer `GET /api/categories`. Deberías ver las 3 categorías: las 2 semilla más la que acabas de crear.

---

## ¿Cómo sé si lo hice bien?

### Logro alto

- Los cuatro paquetes existen con sus clases: `Category`, `CategoryRepository`, `CategoryService`, `CategoryController`
- `GET /api/categories` responde `200 OK` con un arreglo JSON de categorías
- `POST /api/categories` responde `201 Created` con la categoría creada (incluyendo `id`)
- El `id` es asignado por el servidor, nunca viene `null` en la respuesta
- `CategoryController` usa `ResponseEntity` en ambos métodos
- Puedes explicar en voz alta por qué cada clase está en su paquete y por qué `201` en el POST

### Logro medio

- La estructura CSR existe pero algún método está en la capa equivocada (por ejemplo, la asignación de ID en el `Service` o en el `Controller`)
- El POST funciona pero devuelve `200` en lugar de `201`
- El GET funciona pero no usa `ResponseEntity`
- El endpoint responde correctamente pero no puedes justificar las decisiones

### Logro inicial

- El endpoint funciona, pero todo está en el `Controller` sin separación de capas
- La URL contiene verbos (`/crearCategoria`, `/nuevaCategoria`)
- El campo `id` llega `null` en la respuesta (el servidor no lo está asignando)
- No hay datos semilla y el GET devuelve un arreglo vacío

---

## Extensión opcional: si terminas antes

### Opción A: validación manual de campo vacío

Antes de guardar la categoría, verifica que el campo `name` no sea `null` ni una cadena vacía. Si el nombre está vacío, devuelve `400 Bad Request` con un mensaje claro:

```json
{
  "error": "El nombre de la categoría no puede estar vacío"
}
```

Piensa en qué capa va esa validación. ¿En el `Controller`? ¿En el `Service`? ¿En el `Repository`? Justifica tu decisión antes de escribir el código.

### Opción B: buscar categoría por ID

Agrega el endpoint:

```
GET /api/categories/{id}
```

- Si la categoría existe: `200 OK` con el objeto
- Si no existe: `404 Not Found`

Usa `Optional<Category>` en el `Repository` para manejar el caso donde el ID no se encuentra.

### Opción C: prefijo `/api` en Tickets también

Ahora que `CategoryController` usa `/api/categories`, es consistente migrar `TicketController` para que también use `/api/tickets`. Hazlo y verifica que ambos endpoints siguen funcionando.

---

## Antes de entregar: pregúntate esto

1. Si alguien hace `POST /api/categories` con `{ "id": 99, "name": "Test" }`, ¿qué `id` aparece en la respuesta? ¿Por qué?
2. ¿Qué código de estado devuelve tu `POST` cuando todo sale bien? ¿Y tu `GET`?
3. Si mañana necesitas que las categorías se guarden en una base de datos, ¿qué archivo modificarías? ¿Qué archivos **no** necesitarías tocar?

Si las tres respuestas son claras para ti, completaste el objetivo de esta actividad.




<!-- START OF FILE: docs_lessons_06-crud_01_objetivo_y_alcance.md -->
# Documento: docs lessons 06-crud 01 objetivo y alcance
---
# Lección 06 - CRUD completo: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior extendiste la API de tickets para que también pudiera **crear** recursos. Ahora tienes dos endpoints funcionando:

```
GET  /tickets → devuelve todos los tickets
POST /tickets → recibe un ticket nuevo y lo guarda
```

Eso está bien. Pero una API que solo sabe leer y crear tiene una limitación evidente: no puede buscar un ticket específico, no puede actualizarlo y no puede eliminarlo.

Esta lección existe para resolver eso.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás un **CRUD completo** sobre el recurso `Ticket`. Concretamente, agregarás:

- `GET /tickets/{id}` → buscar un ticket por su ID
- `PUT /tickets/{id}` → actualizar un ticket existente
- `DELETE /tickets/{id}` → eliminar un ticket

Con esto el CRUD queda completo:

| Operación | Método HTTP | Endpoint          |
|-----------|-------------|-------------------|
| Create    | POST        | `/tickets`        |
| Read all  | GET         | `/tickets`        |
| Read one  | GET         | `/tickets/{id}`   |
| Update    | PUT         | `/tickets/{id}`   |
| Delete    | DELETE      | `/tickets/{id}`   |

### Lo que vas a ser capaz de explicar

Más que ejecutar el código, el objetivo es que entiendas cada decisión. Al terminar deberías poder responder:

- ¿Para qué sirve `@PathVariable` y en qué se diferencia de `@RequestBody`?
- ¿Por qué `GET /tickets/{id}` devuelve `404` cuando el ticket no existe?
- ¿Por qué un `DELETE` exitoso devuelve `204 No Content` y no `200 OK`?
- ¿Qué significa que una operación sea **idempotente**?
- ¿Por qué el ID correcto para una actualización viene de la URL y no del body?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).
> Ahí encontrarás el escenario, los actores y la lista completa de requerimientos numerados.

De esa lista, esta lección implementa los **cuatro restantes**:

| Requerimiento | Lo que construimos |
|---------------|--------------------|
| **REQ-07** — Consultar un ticket por ID | El endpoint `GET /tickets/{id}` con `@PathVariable` |
| **REQ-08** — Actualizar título o descripción | El endpoint `PUT /tickets/{id}` |
| **REQ-09** — Eliminar un ticket | El endpoint `DELETE /tickets/{id}` |
| **REQ-10** — Error claro cuando el ticket no existe | `Optional<T>` en las capas internas + respuesta `404 Not Found` en el controlador |

Con esta lección el sistema cumple **todos** los requerimientos del enunciado. El proyecto Tickets tiene un CRUD completo y funcional.

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| Manejo global de errores (`@ControllerAdvice`) | Requiere conocer las excepciones típicas de una API; lo trabajaremos con más endpoints disponibles |
| Validaciones (`@Valid`, `@NotBlank`) | Son una capa adicional; primero el flujo básico |
| `PATCH` para actualizaciones parciales | Más complejo que `PUT`; cubrirlo ahora distrae del CRUD básico |
| Base de datos real (JPA + PostgreSQL) | Aún trabajamos en memoria; el salto a persistencia real viene después |
| Paginación y filtros en el `GET /tickets` | Requiere comprender primero los endpoints individuales |

El foco de esta lección es uno solo: **completar el ciclo de vida de un recurso REST con los cuatro verbos HTTP fundamentales**.

---


## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← solo GET y POST
├── model/
│   └── Ticket.java
├── respository/
│   └── TicketRepository.java   ← solo getAll(), existsByTitle(), save()
├── service/
│   └── TicketService.java      ← solo getTickets(), create()
└── TicketsApplication.java
```

Y la estructura que tendrás al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← GET, GET/{id}, POST, PUT/{id}, DELETE/{id}
├── model/
│   └── Ticket.java
├── respository/
│   └── TicketRepository.java   ← getAll(), findById(), existsByTitle(), save(), update(), delete()
├── service/
│   └── TicketService.java      ← getTickets(), findById(), create(), update(), delete()
└── TicketsApplication.java
```

Los cambios son incrementales: cada nueva operación agrega un método a cada capa, sin romper lo que ya existe.




<!-- START OF FILE: docs_lessons_06-crud_02_guion_paso_a_paso.md -->
# Documento: docs lessons 06-crud 02 guion paso a paso
---
# Lección 06 - Tutorial paso a paso: CRUD completo de tickets

Sigue esta guía en orden. Vas a extender el proyecto de tickets para que pueda buscar, actualizar y eliminar un ticket por su ID.

---

## Paso 1: entender qué cambios necesitamos

Antes de tocar el código, piensa en lo que falta. Tu API actualmente tiene esto:

```
GET  /tickets        → devuelve la lista completa  (ya existe)
POST /tickets        → crea un ticket nuevo        (ya existe)
```

Y lo que necesita tener al final de esta lección:

```
GET    /tickets             → devuelve la lista completa    (ya existe)
POST   /tickets             → crea un ticket nuevo          (ya existe)
GET    /tickets/by-id/{id}  → busca un ticket por ID        (lo que vamos a construir)
PUT    /tickets/by-id/{id}  → actualiza un ticket           (lo que vamos a construir)
DELETE /tickets/by-id/{id}  → elimina un ticket             (lo que vamos a construir)
```

Para que los tres nuevos endpoints funcionen, necesitas modificar **tres capas**:

1. **`TicketRepository`:** agregar `findById()`, `update()` y `delete()`
2. **`TicketService`:** agregar `findById()`, `update()` y `delete()`
3. **`TicketController`:** agregar los tres nuevos endpoints con `@PathVariable`

El `Model` (`Ticket.java`) **no cambia**: los campos que ya tiene son suficientes para todas estas operaciones.

---

## Paso 2: `Optional<T>` — por qué no retornamos `null`

Antes de escribir el primer método nuevo, hay una decisión de diseño que atraviesa **toda** esta lección: ningún método devolverá `null` para representar "no encontré nada".

### El problema con `null`

Cuando un método devuelve `null`, el código que lo llama **puede olvidar verificarlo**. Si lo olvida, el programa explota en tiempo de ejecución con un `NullPointerException`. Tony Hoare, el inventor del `null`, lo llamó su *"error de mil millones de dólares"*.

```java
// Peligroso: el compilador NO te avisa si olvidas el null check
Ticket ticket = repository.findById(id);
System.out.println(ticket.getTitle()); // NullPointerException si ticket == null
```

### La solución: `Optional<T>`

`Optional<T>` es un contenedor que **puede o no** tener un valor adentro. Lo que lo hace valioso no es el contenedor en sí, sino que **obliga al código que lo recibe a manejar explícitamente el caso "no existe"**. El compilador y el tipo mismo te lo recuerdan.

```java
// Seguro: Optional hace visible la posibilidad de ausencia
Optional<Ticket> ticket = repository.findById(id);
ticket.map(Ticket::getTitle).ifPresent(System.out::println); // nunca explota
```

### Las operaciones clave de Optional

| Operación                | ¿Qué hace?                                                    |
|--------------------------|---------------------------------------------------------------|
| `Optional.of(valor)`     | Crea un Optional con valor (lanza excepción si es null)       |
| `Optional.empty()`       | Crea un Optional vacío                                        |
| `optional.map(fn)`       | Si tiene valor, transforma; si está vacío, devuelve vacío     |
| `optional.orElse(otro)`  | Devuelve el valor si existe, u `otro` si está vacío           |
| `optional.ifPresent(fn)` | Ejecuta la función solo si hay valor                          |
| `optional.isPresent()`   | `true` si tiene valor (evitar: es casi igual a un null check) |

> **¿Cuándo usar `Optional` y cuándo no?**
> `Optional` está diseñado para **valores de retorno** de métodos que pueden no encontrar algo. No debe usarse como parámetro de método ni como campo de una clase: para esos casos hay mejores alternativas. En esta lección lo usarás exactamente donde corresponde: en los retornos de `findById()` y `update()`.

---

## Paso 3: agregar `findById()` al Repository

El `Repository` es quien sabe dónde están guardados los tickets. Abre `TicketRepository` y agrega el método `findById()`:

```java
public Optional<Ticket> findById(Long id) {
    return tickets.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst();
}
```

El stream de `findFirst()` ya devuelve un `Optional<T>` de forma nativa: si encuentra un elemento que pasa el filtro, devuelve `Optional.of(ese elemento)`; si no, devuelve `Optional.empty()`. No hay que hacer nada más.

**Código equivalente sin expresiones lambda:**

```java
public Optional<Ticket> findById(Long id) {
    for (Ticket ticket : tickets) {
        if (ticket.getId().equals(id)) {
            return Optional.of(ticket);
        }
    }
    return Optional.empty();
}
```

Ambas versiones son correctas y producen exactamente el mismo resultado. La versión con stream es más concisa; la versión con `for` es más explícita paso a paso. Cuando trabajes con JPA, `findById()` ya vendrá implementado por el framework y no tendrás que escribir ninguna de las dos.

> **¿Por qué usamos stream aquí y no un `for`?**
> Porque `findFirst()` devuelve `Optional<T>` de forma natural. Escribir el mismo comportamiento con un `for` obligaría a retornar `Optional.of(ticket)` o `Optional.empty()` manualmente al final, que es más verboso sin ningún beneficio. Cada herramienta en su lugar.

> **¿Qué pasa si hay dos tickets con el mismo ID?**
> En nuestro almacenamiento en memoria eso no puede ocurrir porque el ID se asigna con un contador incremental. Pero si ocurriera, `findFirst()` devolvería el primero que encuentre. Cuando migremos a JPA, el motor de base de datos garantiza unicidad con una restricción `PRIMARY KEY`.

---

## Paso 4: agregar `getById()` al Service

El `Service` delega al `Repository` y propaga el `Optional` hacia arriba, sin desnudarlo. No hay reglas de negocio que aplicar en una simple búsqueda por ID.

Abre `TicketService` y agrega:

```java
public Optional<Ticket> getById(Long id) {
    return this.repository.findById(id);
}
```

> **¿Por qué el `Service` no "abre" el Optional aquí?**
> Porque "abrir" el Optional (llamar a `.get()` o `.orElse(null)`) en el `Service` descargaría la responsabilidad de manejar el caso vacío en el `Controller`. Propagar el `Optional` hacia arriba preserva la información de "puede no existir" hasta la capa que sabe qué respuesta HTTP dar. Cada capa hace lo que le corresponde.

---

## Paso 5: agregar `GET /tickets/by-id/{id}` al Controller

Abre `TicketController` y agrega el endpoint:

```java
@GetMapping("/by-id/{id}")
public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
    return service.getById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
}
```

**Código equivalente sin expresiones lambda:**

```java
@GetMapping("/by-id/{id}")
public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
    Optional<Ticket> found = service.getById(id);
    if (found.isPresent()) {
        return ResponseEntity.ok(found.get());
    }
    return ResponseEntity.notFound().build();
}
```

Ambas versiones hacen exactamente lo mismo. El `.get()` es seguro aquí porque está protegido por `isPresent()` en la línea anterior.

> **¿Qué hace `@PathVariable`?**
> Captura el valor dinámico que viene en la URL. Si el cliente llama a `GET /tickets/by-id/3`, Spring extrae el `3` de la URL y lo asigna a la variable `id`. Sin `@PathVariable`, el controlador no sabría qué ID está buscando el cliente.

> **¿En qué se diferencia `@PathVariable` de `@RequestParam`?**
> `@PathVariable` extrae valores que forman parte de la estructura de la URL: `/tickets/3`. `@RequestParam` extrae parámetros del query string: `/tickets?id=3`. En REST, los identificadores de recursos van en la URL, no en el query string. Por eso usamos `@PathVariable`.

> **¿Qué hace `.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build())`?**
> Si el `Optional` tiene un ticket adentro, `.map()` lo transforma en `ResponseEntity.ok(ticket)` → `200 OK`. Si está vacío, `.orElse()` devuelve `ResponseEntity.notFound().build()` → `404 Not Found`. Todo sin un solo `if` ni riesgo de `NullPointerException`.

> **¿Por qué `ResponseEntity.notFound().build()` y no `ResponseEntity.notFound().body(...)`?**
> Porque un 404 no lleva cuerpo en esta API: solo comunica que el recurso no existe. El `.build()` construye la respuesta sin body.

---

## Paso 6: agregar `update()` al Repository

El `Repository` necesita saber cómo actualizar un ticket existente. Reutilizamos `findById()` para no duplicar la lógica de búsqueda, y usamos `ifPresent()` para modificar el ticket solo si existe.

Abre `TicketRepository` y agrega:

```java
public Optional<Ticket> update(Long id, Ticket updatedTicket) {
    Optional<Ticket> found = findById(id);
    found.ifPresent(ticket -> {
        ticket.setTitle(updatedTicket.getTitle());
        ticket.setDescription(updatedTicket.getDescription());
        ticket.setStatus(updatedTicket.getStatus());
    });
    return found;
}
```

**Código equivalente sin expresiones lambda:**

```java
public Optional<Ticket> update(Long id, Ticket updatedTicket) {
    Optional<Ticket> found = findById(id);
    if (found.isPresent()) {
        Ticket ticket = found.get();
        ticket.setTitle(updatedTicket.getTitle());
        ticket.setDescription(updatedTicket.getDescription());
        ticket.setStatus(updatedTicket.getStatus());
    }
    return found;
}
```

Nuevamente el `.get()` es seguro porque está dentro del bloque `if (found.isPresent())`.

> **¿Por qué reutilizamos `findById()` en lugar de iterar de nuevo con un `for`?**
> Porque `findById()` ya resuelve el problema de búsqueda y devuelve un `Optional`. Duplicar la lógica de iteración sería una violación del principio DRY (*Don't Repeat Yourself*). Si mañana cambia cómo se busca un ticket (por ejemplo, en una base de datos), solo hay que cambiar `findById()`.

> **¿Qué hace `ifPresent()`?**
> Ejecuta el bloque de código solo si el `Optional` tiene un valor adentro. Si está vacío, no hace nada. Es el equivalente seguro de `if (found != null) { ... }`, pero sin null.

> **¿Por qué no actualizamos el ID?**
> El ID es el identificador único e inmutable del recurso. En REST, el recurso se identifica por su URL: `PUT /tickets/by-id/1` siempre modifica el ticket con ID `1`, independientemente de lo que el body diga sobre el ID.

---

## Paso 7: agregar `updateById()` al Service

```java
public Optional<Ticket> updateById(Long id, Ticket updatedTicket) {
    return this.repository.update(id, updatedTicket);
}
```

En esta lección el `Service` delega directamente al `Repository`. El desafío opcional al final de esta guía propone agregar validaciones aquí.

---

## Paso 8: agregar `PUT /tickets/by-id/{id}` al Controller

```java
@PutMapping("/by-id/{id}")
public ResponseEntity<Ticket> updateTicketById(@PathVariable Long id, @RequestBody Ticket ticket) {
    return service.updateById(id, ticket)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
}
```

**Código equivalente sin expresiones lambda:**

```java
@PutMapping("/by-id/{id}")
public ResponseEntity<Ticket> updateTicketById(@PathVariable Long id, @RequestBody Ticket ticket) {
    Optional<Ticket> updated = service.updateById(id, ticket);
    if (updated.isPresent()) {
        return ResponseEntity.ok(updated.get());
    }
    return ResponseEntity.notFound().build();
}
```

> **¿Por qué usamos el `id` de la URL y no el que pudiera venir en el body?**
> Porque la URL identifica el recurso de forma autoritativa. Si el cliente manda `PUT /tickets/by-id/1` con un body que tiene `"id": 99`, eso es una inconsistencia. La URL dice claramente cuál recurso se está modificando. El `id` del body se ignora: el `Repository` actualiza el ticket cuyo `id` coincide con el de la URL.

> **¿Por qué `PUT` devuelve `200 OK` con el ticket actualizado y no `204 No Content`?**
> Porque devolver el recurso actualizado le permite al cliente confirmar que los cambios se aplicaron correctamente, sin necesidad de hacer un `GET` adicional. Aunque la especificación HTTP permite `204` en un `PUT`, devolver `200` con el cuerpo actualizado es más útil en la práctica.

---

## Paso 9: agregar `delete()` al Repository

Para el borrado, el resultado es binario: o se eliminó o no existía. `boolean` es el tipo correcto aquí — no `Optional`, porque no hay ningún valor de retorno significativo si la operación fue exitosa.

Abre `TicketRepository` y agrega:

```java
public boolean delete(Long id) {
    return tickets.removeIf(t -> t.getId().equals(id));
}
```

**Código equivalente sin expresiones lambda:**

```java
public boolean delete(Long id) {
    for (Ticket ticket : tickets) {
        if (ticket.getId().equals(id)) {
            tickets.remove(ticket);
            return true;
        }
    }
    return false;
}
```

`removeIf()` elimina todos los elementos que satisfacen la condición y devuelve `true` si eliminó al menos uno, `false` si la colección no cambió (el ticket no existía).

> **¿Por qué devolvemos `boolean` y no `Optional<Ticket>`?**
> Porque `Optional` está diseñado para "puede haber un valor útil que necesitas". Después de un borrado, el ticket ya no existe: no hay nada que envolver en un `Optional`. `boolean` comunica exactamente lo que importa: ¿se eliminó algo? Usar `Optional` aquí sería forzar el patrón donde no corresponde.

> **¿Por qué `removeIf()` y no el `for` + `remove()` del paso de update?**
> Porque aquí no necesitamos el objeto después de borrarlo. `removeIf()` es la herramienta correcta cuando solo nos interesa la eliminación, no el valor eliminado. Elegir la herramienta correcta para cada caso hace el código más claro e intencional.

---

## Paso 10: agregar `deleteById()` al Service

```java
public boolean deleteById(Long id) {
    return this.repository.delete(id);
}
```

---

## Paso 11: agregar `DELETE /tickets/by-id/{id}` al Controller

```java
@DeleteMapping("/by-id/{id}")
public ResponseEntity<Void> deleteTicketById(@PathVariable Long id) {
    if (!service.deleteById(id)) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.noContent().build();
}
```

> **¿Por qué el tipo de retorno es `ResponseEntity<Void>`?**
> Porque una eliminación exitosa no devuelve contenido: solo el código `204 No Content`. `Void` expresa esa intención con claridad: este endpoint nunca tendrá un cuerpo en la respuesta exitosa.

> **¿Por qué `204 No Content` y no `200 OK`?**
> `200 OK` implica que hay un cuerpo con información útil. `204 No Content` dice exactamente lo contrario: la operación fue exitosa, pero no hay nada que devolver. En una eliminación, el recurso ya no existe, por lo que devolver su estado anterior sería incoherente.

---

## Paso 12: el controlador completo

Este es el estado final de `TicketController` al terminar la lección:

```java
package cl.duoc.fullstack.tickets.controller;

import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.service.TicketService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        return ResponseEntity.ok(this.service.getTickets());
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
        return service.getById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Ticket ticket) {
        try {
            service.create(ticket);
            return ResponseEntity.status(HttpStatus.CREATED).body("Ticket Creado");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @PutMapping("/by-id/{id}")
    public ResponseEntity<Ticket> updateTicketById(@PathVariable Long id, @RequestBody Ticket ticket) {
        return service.updateById(id, ticket)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/by-id/{id}")
    public ResponseEntity<Void> deleteTicketById(@PathVariable Long id) {
        if (!service.deleteById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
```

Observa el patrón: donde el recurso puede no existir, el `Optional` del `Service` se convierte directamente en la `ResponseEntity` correcta con `.map().orElse()`. No hay un solo `null` ni un solo `if (x == null)` en el controlador.

---

## Paso 13: verificar que todo funciona

Levanta la aplicación y abre Postman, Insomnia o Thunder Client.

### Prueba 1: obtener todos los tickets

```
GET http://localhost:8080/tickets
```

Resultado esperado: `200 OK` con la lista de 2 tickets semilla.

---

### Prueba 2: obtener un ticket existente

```
GET http://localhost:8080/tickets/by-id/1
```

Resultado esperado (`200 OK`):

```json
{
  "id": 1,
  "title": "Ticket 1",
  "description": "Descripción del ticket 1",
  "status": "NEW",
  "createdAt": "2026-03-15T09:00:00",
  "estimatedResolutionDate": "2026-03-22",
  "effectiveResolutionDate": null
}
```

---

### Prueba 3: obtener un ticket inexistente

```
GET http://localhost:8080/tickets/by-id/999
```

Resultado esperado: `404 Not Found` (sin cuerpo).

---

### Prueba 4: crear un ticket

```
POST http://localhost:8080/tickets
Content-Type: application/json
```

Body:

```json
{
  "title": "Error en dashboard",
  "description": "El gráfico de ventas no carga al filtrar por semana"
}
```

Resultado esperado: `201 Created` con el ticket creado (ID 3, status NEW, fechas asignadas por el servidor).

---

### Prueba 5: actualizar un ticket existente

```
PUT http://localhost:8080/tickets/by-id/1
Content-Type: application/json
```

Body:

```json
{
  "title": "Ticket 1 - Revisado",
  "description": "Descripción actualizada después de la revisión",
  "status": "IN_PROGRESS"
}
```

Resultado esperado: `200 OK` con el ticket actualizado. Observa que `createdAt` y `estimatedResolutionDate` **no cambiaron**.

---

### Prueba 6: actualizar un ticket inexistente

```
PUT http://localhost:8080/tickets/by-id/999
Content-Type: application/json
```

Body:

```json
{
  "title": "Ticket fantasma",
  "description": "Este ticket no existe",
  "status": "NEW"
}
```

Resultado esperado: `404 Not Found`.

---

### Prueba 7: eliminar un ticket existente

```
DELETE http://localhost:8080/tickets/by-id/2
```

Resultado esperado: `204 No Content` (sin cuerpo).

Verifica con un `GET /tickets` que el ticket 2 ya no aparece en la lista.

---

### Prueba 8: eliminar un ticket inexistente

```
DELETE http://localhost:8080/tickets/by-id/999
```

Resultado esperado: `404 Not Found`.

---

## Paso 14: reflexiona antes de cerrar

Antes de pasar a la actividad, respóndete estas preguntas:

1. Si un cliente manda `PUT /tickets/by-id/1` con el body `{"id": 99, "title": "Nuevo título", ...}`, ¿qué ID usa el servidor para buscar el ticket a actualizar? ¿Por qué?
2. Si ejecutas `DELETE /tickets/by-id/1` cinco veces seguidas, ¿qué responde el servidor la segunda, tercera, cuarta y quinta vez? ¿Eso lo hace idempotente?
3. ¿Por qué `findById()` y `update()` devuelven `Optional<Ticket>` mientras que `delete()` devuelve `boolean`? ¿Qué comunica cada tipo de retorno al código que lo llama?
4. ¿Qué pasaría si el `Service` llamara a `repository.findById(id).get()` sin verificar si el `Optional` está vacío? ¿Cuándo y cómo fallaría?

---

## Extensión opcional

Si terminaste todo lo anterior y quieres ir un paso más, agrega validaciones en el `Service` para el `update()`:

- Si el título está vacío o en blanco, que el controlador responda `400 Bad Request`
- Si el estado no es `NEW`, `IN_PROGRESS` o `RESOLVED`, que el controlador responda `400 Bad Request`

Por ahora sin `@Valid` ni Bean Validation. Solo con `if` simples en el `Service` y una excepción propia (o `IllegalArgumentException`) que el controlador capture.




<!-- START OF FILE: docs_lessons_06-crud_03_reglas_rest_e_idempotencia.md -->
# Documento: docs lessons 06-crud 03 reglas rest e idempotencia
---
# Lección 06 - Reglas REST e idempotencia

## Reglas REST que estamos aplicando

Esta lección consolida las reglas REST que hemos venido aplicando desde la lección 03. Ahora que tienes el CRUD completo es un buen momento para revisarlas en conjunto.

---

### Regla 1: URLs en plural y sin verbos

El recurso se llama `Ticket` (singular), pero la URL usa el plural:

```
/tickets
```

Esto se hace porque la URL representa una **colección** de recursos. Usar el singular `/ticket` puede generar ambigüedad: ¿es la colección o un elemento?

**Correcto:**

```
GET    /tickets
GET    /tickets/1
POST   /tickets
PUT    /tickets/1
DELETE /tickets/1
```

**Incorrecto:**

```
GET  /getTickets
POST /createTicket
PUT  /updateTicket/1
GET  /obtenerTicketPorId/1
```

La **acción** la indica el verbo HTTP, no la URL. La URL solo identifica el recurso.

---

### Regla 2: la acción la define el método HTTP

El mismo endpoint `/tickets/1` puede hacer cosas diferentes dependiendo del método:

| Método | Endpoint        | Acción                       |
|--------|-----------------|------------------------------|
| GET    | `/tickets/1`    | Obtener el ticket con ID 1   |
| PUT    | `/tickets/1`    | Actualizar el ticket con ID 1|
| DELETE | `/tickets/1`    | Eliminar el ticket con ID 1  |

Si pusieras la acción en la URL, tendrías que crear una URL diferente por cada operación. Eso rompe el diseño REST.

---

### Regla 3: el código de estado debe reflejar lo que ocurrió

Una API no debe responder siempre `200 OK`. El código de estado le dice al cliente exactamente qué pasó.

| Situación                            | Código HTTP         |
|--------------------------------------|---------------------|
| Consulta o actualización exitosa     | `200 OK`            |
| Ticket creado correctamente          | `201 Created`       |
| Eliminación exitosa                  | `204 No Content`    |
| Ticket no encontrado                 | `404 Not Found`     |
| Título duplicado al crear            | `409 Conflict`      |

Si tu API devuelve `200 OK` para todo, el cliente no puede saber si algo falló. Un cliente bien diseñado (o un desarrollador que usa Postman) depende de estos códigos para saber cómo actuar.

---

### Regla 4: el ID del recurso va en la URL, no en el body

Cuando haces `PUT /tickets/1`, el ID `1` identifica **qué recurso estás modificando**. Es parte de la URL.

Si el body también trae un `id`, el servidor debe ignorarlo (o asumir que el de la URL es el correcto). No debes confiar en el `id` del body para decidir qué ticket actualizar.

```java
// Correcto: usas el id de la URL
@PutMapping("/{id}")
public ResponseEntity<Ticket> update(@PathVariable Long id, @RequestBody Ticket ticket) {
    Ticket updatedTicket = service.update(id, ticket); // el id viene de la URL
    ...
}
```

---

## Idempotencia explicada con tickets

### ¿Qué significa idempotente?

Una operación es **idempotente** si ejecutarla una vez produce el mismo resultado que ejecutarla múltiples veces.

En otras palabras: no importa cuántas veces repitas la operación, el **estado final** del sistema siempre es el mismo.

---

### `PUT` es idempotente

Supón que haces esta petición:

```
PUT /tickets/1
Content-Type: application/json

{
  "title": "Ticket 1 - Revisado",
  "description": "Descripción actualizada",
  "status": "IN_PROGRESS"
}
```

Si la ejecutas una vez, el ticket 1 queda con ese título, descripción y estado.

Si la ejecutas cinco veces más, el ticket 1 **sigue quedando exactamente igual**: mismo título, misma descripción, mismo estado.

El resultado final no cambia sin importar cuántas veces repitas la petición. Por eso `PUT` es idempotente.

**Idea clave:** `PUT` reemplaza el estado del recurso hacia un valor definido. No acumula cambios: reemplaza.

---

### `DELETE` también es idempotente

```
DELETE /tickets/2
```

La primera vez: el ticket 2 se elimina → `204 No Content`.

La segunda vez: el ticket 2 ya no existe → `404 Not Found`.

Aunque el código de respuesta cambia, el **estado del sistema** es el mismo en ambos casos: el ticket 2 no existe. Por eso `DELETE` se considera idempotente.

---

### `POST` **no** es idempotente

```
POST /tickets
{
  "title": "Error en login",
  "description": "..."
}
```

Cada vez que ejecutas esta petición, se crea un ticket nuevo (si el título no existía) o se rechaza con `409` (si ya existe). El resultado puede variar, y si el título es distinto cada vez, crearás múltiples tickets nuevos.

Por eso `POST` normalmente no es idempotente.

---

### Resumen de idempotencia

| Método | ¿Idempotente? | Razón                                                  |
|--------|---------------|--------------------------------------------------------|
| GET    | ✅ Sí          | Solo lee, nunca modifica el estado                     |
| PUT    | ✅ Sí          | Reemplaza el recurso hacia un estado definido          |
| DELETE | ✅ Sí          | El resultado final es siempre "el recurso no existe"   |
| POST   | ❌ No          | Puede crear múltiples recursos si se repite            |

---

## Códigos HTTP de esta lección: resumen visual

```
GET /tickets          → 200 OK         (lista de tickets)
GET /tickets/1        → 200 OK         (ticket encontrado)
GET /tickets/999      → 404 Not Found  (ticket no existe)

POST /tickets         → 201 Created    (ticket creado)
POST /tickets         → 409 Conflict   (título duplicado)

PUT /tickets/1        → 200 OK         (ticket actualizado)
PUT /tickets/999      → 404 Not Found  (ticket no existe)

DELETE /tickets/2     → 204 No Content (ticket eliminado)
DELETE /tickets/999   → 404 Not Found  (ticket no existe)
```




<!-- START OF FILE: docs_lessons_06-crud_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 06-crud 04 checklist rubrica minima
---
# Lección 06 - Checklist y rúbrica mínima

Usa esta lista para verificar que implementaste correctamente el CRUD completo de tickets antes de dar la lección por terminada.

---

## Checklist de endpoints

| Endpoint             | Método | ¿Implementado? | Código exitoso | Código de error |
|----------------------|--------|----------------|----------------|-----------------|
| `/tickets`           | GET    | ☐              | 200 OK         | —               |
| `/tickets/{id}`      | GET    | ☐              | 200 OK         | 404 Not Found   |
| `/tickets`           | POST   | ☐              | 201 Created    | 409 Conflict    |
| `/tickets/{id}`      | PUT    | ☐              | 200 OK         | 404 Not Found   |
| `/tickets/{id}`      | DELETE | ☐              | 204 No Content | 404 Not Found   |

---

## Checklist de código

### Model (`Ticket.java`)

- ☐ Tiene `@NoArgsConstructor` para que Jackson pueda deserializar el body del POST y PUT
- ☐ Tiene los campos: `id`, `title`, `description`, `status`, `createdAt`, `estimatedResolutionDate`, `effectiveResolutionDate`

### Repository (`TicketRepository.java`)

- ☐ Tiene `findById(Long id)` que devuelve `Optional<Ticket>` (usa stream + `findFirst()`, no retorna `null`)
- ☐ Tiene `update(Long id, Ticket updatedTicket)` que devuelve `Optional<Ticket>` (reutiliza `findById()` + `ifPresent()`)
- ☐ Tiene `delete(Long id)` que devuelve `boolean` (usa `removeIf()`)
- ☐ El contador de IDs (`currentId`) empieza en `3L` para no colisionar con los tickets semilla

### Service (`TicketService.java`)

- ☐ Tiene `findById(Long id)` que devuelve `Optional<Ticket>` y propaga el Optional del Repository hacia arriba
- ☐ Tiene `update(Long id, Ticket updatedTicket)` que devuelve `Optional<Ticket>`
- ☐ Tiene `delete(Long id)` que devuelve `boolean`
- ☐ Ningún método llama a `.get()` ni a `.orElse(null)` en el Optional (eso se hace en el Controller)
- ☐ El método `create()` sigue asignando `status`, `createdAt`, `estimatedResolutionDate` y `effectiveResolutionDate` en el servidor

### Controller (`TicketController.java`)

- ☐ `GET /tickets/{id}` usa `@GetMapping("/{id}")` y `@PathVariable Long id`
- ☐ `PUT /tickets/{id}` usa `@PutMapping("/{id}")` con `@PathVariable` y `@RequestBody`
- ☐ `DELETE /tickets/{id}` usa `@DeleteMapping("/{id}")` y devuelve `ResponseEntity<Void>`
- ☐ Todos los endpoints usan `ResponseEntity` con el código correcto
- ☐ Los endpoints de GET y PUT usan `.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build())` (sin `if (x == null)`)
- ☐ El DELETE exitoso devuelve `ResponseEntity.noContent().build()`
- ☐ No hay ningún `null` explícito en el controlador

---

## Checklist de reglas REST

- ☐ La URL del recurso es `/tickets` (plural, sin verbos)
- ☐ No hay rutas con verbos como `/getTicket`, `/deleteTicket`, `/updateTicket`
- ☐ El ID del recurso en PUT viene de la URL (`@PathVariable`), no del body
- ☐ Los códigos de estado son correctos para cada situación

---

## Checklist de pruebas

Hiciste las siguientes pruebas en Postman/Thunder Client:

- ☐ `GET /tickets` devuelve los 2 tickets semilla → `200 OK`
- ☐ `GET /tickets/by-id/1` devuelve el primer ticket → `200 OK`
- ☐ `GET /tickets/by-id/999` → `404 Not Found`
- ☐ `POST /tickets` con título nuevo → `201 Created` (el servidor asignó ID, status y fechas)
- ☐ `POST /tickets` con el mismo título → `409 Conflict`
- ☐ `PUT /tickets/by-id/1` con datos nuevos → `200 OK` (fechas no cambiaron)
- ☐ `PUT /tickets/by-id/999` → `404 Not Found`
- ☐ `DELETE /tickets/by-id/2` → `204 No Content`
- ☐ `DELETE /tickets/by-id/999` → `404 Not Found`
- ☐ `GET /tickets` después del DELETE → el ticket eliminado ya no aparece

---

## Errores comunes a evitar

| Error | Por qué está mal | Cómo corregirlo |
|---|---|---|
| Devolver `null` desde Repository o Service | Puede causar `NullPointerException` si el llamador olvida verificar | Usa `Optional.empty()` o `Optional.of(valor)` |
| Llamar a `optional.get()` sin verificar | Si el Optional está vacío, lanza `NoSuchElementException` | Usa `.map()`, `.orElse()` o `.ifPresent()` |
| Usar el `id` del body en el PUT | El ID autoritativo es el de la URL | Usa solo `@PathVariable Long id` para buscar el ticket |
| Devolver `200` en el DELETE | Una eliminación exitosa no devuelve contenido | Usa `ResponseEntity.noContent().build()` (`204`) |
| Devolver `200` cuando no existe el recurso | `200` indica éxito; un recurso inexistente es un error | Usa `ResponseEntity.notFound().build()` (`404`) |
| Poner verbos en la URL | El verbo HTTP ya indica la acción | Usa `DELETE /tickets/1` en vez de `GET /deleteTicket/1` |
| No probar casos negativos | La API debe responder correctamente a errores también | Prueba siempre con IDs que no existen |




<!-- START OF FILE: docs_lessons_06-crud_05_actividad_individual.md -->
# Documento: docs lessons 06-crud 05 actividad individual
---
# Lección 06 - Actividad individual: CRUD de categorías

## Contexto

En la lección anterior (POST) ya tenías una actividad sobre `Category`. En esta lección vas a completar ese trabajo implementando el **CRUD completo** para ese mismo recurso.

Si en la lección anterior implementaste `Category` con sus propios atributos, adapta la actividad a lo que ya tienes. Si no la implementaste, esta es tu oportunidad.

---

## ¿Qué vas a construir?

Una API REST para gestionar categorías de tickets. Cada categoría agrupa tickets por tipo de problema: `"Hardware"`, `"Software"`, `"Acceso"`, etc.

### Atributos mínimos del recurso `Category`

| Campo         | Tipo     | Descripción                                         |
|---------------|----------|-----------------------------------------------------|
| `id`          | `Long`   | Identificador único asignado por el servidor        |
| `name`        | `String` | Nombre de la categoría (ej: `"Hardware"`)           |
| `description` | `String` | Descripción breve del tipo de problemas que agrupa  |

---

## Endpoints requeridos

| Método | Endpoint           | Descripción                              | Código exitoso | Código de error |
|--------|--------------------|------------------------------------------|----------------|-----------------|
| GET    | `/categories`      | Devuelve todas las categorías            | 200 OK         | —               |
| GET    | `/categories/{id}` | Devuelve una categoría por ID            | 200 OK         | 404 Not Found   |
| POST   | `/categories`      | Crea una nueva categoría                 | 201 Created    | 409 Conflict    |
| PUT    | `/categories/{id}` | Actualiza una categoría existente        | 200 OK         | 404 Not Found   |
| DELETE | `/categories/{id}` | Elimina una categoría existente          | 204 No Content | 404 Not Found   |

---

## Estructura de archivos esperada

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   ├── TicketController.java      (ya existe)
│   └── CategoryController.java    (nuevo)
├── model/
│   ├── Ticket.java                (ya existe)
│   └── Category.java              (nuevo)
├── respository/
│   ├── TicketRepository.java      (ya existe)
│   └── CategoryRepository.java    (nuevo)
├── service/
│   ├── TicketService.java         (ya existe)
│   └── CategoryService.java       (nuevo)
└── TicketsApplication.java
```

---

## Reglas de negocio mínimas

Implementa estas reglas **en el `Service`**, igual que hiciste con los tickets:

1. **No se pueden crear dos categorías con el mismo nombre** (comparación sin distinguir mayúsculas/minúsculas) → `409 Conflict`
2. **El ID lo asigna el servidor**, nunca el cliente
3. **Los datos semilla:** crea al menos 2 categorías de ejemplo en el constructor del `Repository`

---

## Guía de implementación

Sigue exactamente el mismo patrón que usaste para `Ticket`:

### 1. `Category.java`
- Usa Lombok: `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`
- Campos: `id`, `name`, `description`

### 2. `CategoryRepository.java`
- Lista en memoria como almacenamiento
- Contador incremental para los IDs
- Métodos:
  - `getAll()` → `List<Category>`
  - `findById(Long id)` → `Optional<Category>` (usa stream + `findFirst()`, sin `null`)
  - `existsByName(String name)` → `boolean`
  - `save(Category category)` → `Category`
  - `update(Long id, Category category)` → `Optional<Category>` (reutiliza `findById()` + `ifPresent()`)
  - `delete(Long id)` → `boolean` (usa `removeIf()`)

### 3. `CategoryService.java`
- Validación de nombre duplicado en `create()`
- `findById()` devuelve `Optional<Category>` sin llamar a `.get()` ni `.orElse(null)`
- `update()` devuelve `Optional<Category>` y delega al Repository
- `delete()` devuelve `boolean` y delega al Repository

### 4. `CategoryController.java`
- `@RestController` + `@RequestMapping("/categories")`
- Un método por endpoint
- `ResponseEntity` en todos los métodos con los códigos correctos
- GET y PUT usan `.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build())`
- No hay ningún `null` explícito en el controlador

---

## Ejemplos de prueba

### Crear una categoría

```
POST http://localhost:8080/categories
Content-Type: application/json

{
  "name": "Hardware",
  "description": "Problemas relacionados con componentes físicos"
}
```

Resultado esperado: `201 Created`

```json
{
  "id": 3,
  "name": "Hardware",
  "description": "Problemas relacionados con componentes físicos"
}
```

### Actualizar una categoría

```
PUT http://localhost:8080/categories/1
Content-Type: application/json

{
  "name": "Hardware y periféricos",
  "description": "Problemas con hardware, teclados, monitores y otros periféricos"
}
```

Resultado esperado: `200 OK` con la categoría actualizada.

### Eliminar una categoría

```
DELETE http://localhost:8080/categories/2
```

Resultado esperado: `204 No Content`

---

## Desafío opcional

Si terminaste antes, agrega una validación para impedir:

- Nombres vacíos o en blanco → `400 Bad Request`
- Descripciones de menos de 10 caracteres → `400 Bad Request`

Impleméntalas como `if` simples en el `Service`, lanzando `IllegalArgumentException`. El `Controller` las captura y devuelve `ResponseEntity.badRequest().build()`.

---

## Criterios de evaluación

| Criterio                                                         | Puntaje |
|------------------------------------------------------------------|---------|
| Los 5 endpoints están implementados y responden correctamente    | 40%     |
| Los códigos HTTP son correctos para éxito y error               | 20%     |
| La estructura de capas es correcta (no hay lógica de negocio en el Controller) | 20%     |
| Las URLs siguen las reglas REST (plural, sin verbos)             | 10%     |
| Se probaron los casos negativos (IDs inexistentes, nombre duplicado) | 10%  |




<!-- START OF FILE: docs_lessons_07-errors_01_objetivo_y_alcance.md -->
# Documento: docs lessons 07-errors 01 objetivo y alcance
---
# Lección 07 - Errores bien hechos: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior completaste el CRUD de tickets. Tu API ya puede crear, leer, actualizar y eliminar recursos. Pero hay un problema silencioso que se esconde en cada endpoint: los errores no tienen una forma consistente.

Observa lo que ocurre ahora cuando algo falla:

| Situación | Respuesta actual |
|---|---|
| `POST /tickets` con título duplicado | `409 Conflict` + body: `"Ya existe un ticket con el título..."` (texto plano) |
| `GET /tickets/999` (no existe) | `404 Not Found` + **sin body** |
| `PUT /tickets/999` (no existe) | `404 Not Found` + **sin body** |
| `DELETE /tickets/999` (no existe) | `404 Not Found` + **sin body** |

El problema es doble:

1. **Inconsistencia:** el `POST` devuelve algo (aunque sea texto plano), los demás no devuelven nada.
2. **Inutilidad para el cliente:** cuando un cliente recibe un `404` vacío, no sabe qué estaba buscando ni por qué falló. Tiene que adivinar.

Una API profesional tiene un contrato de errores claro. El cliente siempre sabe qué esperar cuando algo sale mal.

---

## ¿Qué vas a construir?

Al terminar esta lección, **todos** los errores de tu API tendrán la misma estructura JSON:

```json
{
  "message": "Ticket con ID 999 no encontrado"
}
```

Concretamente, vas a:

1. Crear una clase `ErrorResponse` que representa esa estructura
2. Actualizar el controlador para que todos los errores devuelvan esta estructura con cuerpo
3. Garantizar que el `Service` lanza excepciones con mensajes claros

### Lo que vas a ser capaz de explicar

Al terminar deberías poder responder:

- ¿Por qué una API devuelve `text/plain` cuando el body es un `String` y `application/json` cuando es un objeto?
- ¿Qué ventaja tiene `{"message": "..."}` sobre devolver un `String` directamente?
- ¿Por qué un `404` sin body es problemático para el cliente que consume la API?
- ¿Qué es un "contrato de errores" y por qué importa?
- ¿En qué se diferencia manejar errores localmente (try/catch por método) del manejo global (`@ControllerAdvice`)?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).

| Requerimiento | Lo que construimos |
|---|---|
| **REQ-11** — Error con cuerpo JSON `{"message":"..."}` | La clase `ErrorResponse` + actualización de todos los endpoints para usarla |
| **REQ-12** — El creador y asignado no pueden ser el mismo usuario | Validación en `create()` y `updateById()` del Service |

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| `@ControllerAdvice` | Requiere comprender el ciclo de errores de Spring; lo presentamos como debate hoy sin implementarlo |
| Validación de entrada (`@NotBlank`, `@Valid`) | Es una capa adicional; primero consolidamos la estructura de errores |
| Jerarquía de excepciones propias | `IllegalArgumentException` es suficiente por ahora; las excepciones de dominio llegan con más contexto |
| Códigos de error de la base de datos | Aún trabajamos en memoria |

El foco de esta lección es uno solo: **que todos los errores hablen el mismo idioma JSON**.

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← CRUD completo, errores inconsistentes
├── model/
│   └── Ticket.java
├── respository/
│   └── TicketRepository.java   ← List-based, findById/update/delete con Optional
├── service/
│   └── TicketService.java      ← create() lanza IllegalArgumentException
└── TicketsApplication.java
```

Y la estructura que tendrás al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← todos los errores devuelven ErrorResponse
├── model/
│   ├── Ticket.java
│   └── ErrorResponse.java      ← nueva: estructura estándar de error
├── respository/
│   └── TicketRepository.java   (sin cambios)
├── service/
│   └── TicketService.java      (sin cambios)
└── TicketsApplication.java
```




<!-- START OF FILE: docs_lessons_07-errors_02_guion_paso_a_paso.md -->
# Documento: docs lessons 07-errors 02 guion paso a paso
---
# Lección 07 - Tutorial paso a paso: validaciones y errores

Sigue esta guía en orden. Vas a agregar validaciones de negocio en `TicketService` y manejo de excepciones en `TicketController`.

---

## Paso 0: agregar la dependencia de validación

Para usar `@NotBlank`, `@Valid` y otras anotaciones de Bean Validation necesitas la dependencia en `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

---

## Paso 1: agregar campos `createdBy` y `assignedTo` al modelo

Abre `model/Ticket.java` y añade dos campos nuevos:

```java
@NotBlank(message = "El creador es requerido")
private String createdBy;

private String assignedTo;
```

El modelo completo debe quedar así:

```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
  @Min(5) @Max(100)
  private Long id;
  @NotBlank(message = "El titulo es requerido")
  @Size(min = 1, max = 50)
  private String title;
  @NotBlank
  private String description;
  private String status;
  private LocalDateTime createdAt;
  private LocalDate estimatedResolutionDate;
  private LocalDateTime effectiveResolutionDate;
  @NotBlank(message = "El creador es requerido")
  private String createdBy;
  private String assignedTo;
}
```

---

## Paso 2: agregar validación en `TicketService.create()`

Abre `service/TicketService.java` y actualiza el método `create()`:

```java
public Ticket create(Ticket ticket) {
    // Validación 1: Título duplicado
    boolean exists = this.repository.existsByTitle(ticket.getTitle());
    if (exists) {
        throw new IllegalArgumentException("Ya existe un ticket con el título '" + ticket.getTitle() + "'");
    }

    // Validación 2: Creador ≠ Asignado
    if (ticket.getAssignedTo() != null && 
        ticket.getAssignedTo().equals(ticket.getCreatedBy())) {
        throw new IllegalArgumentException("El creador y el asignado no pueden ser el mismo usuario");
    }

    LocalDateTime now = LocalDateTime.now();
    LocalDate ldNow = LocalDate.now();
    LocalDate estimated = ldNow.plusDays(5L);

    ticket.setStatus("NEW");
    ticket.setCreatedAt(now);
    ticket.setEstimatedResolutionDate(estimated);
    return this.repository.save(ticket);
}
```

**¿Por qué lanzar excepción?** El Service valida reglas de negocio. Si falla, lanza `IllegalArgumentException`. El Controller la capturará y convertirá a respuesta HTTP.

---

## Paso 3: agregar validación en `TicketService.updateById()`

Actualiza el método `updateById()` para usar `Optional`:

```java
public Optional<Ticket> updateById(Long id, Ticket ticket) {
    Optional<Ticket> found = this.repository.findById(id);
    if (found.isEmpty()) {
        return Optional.empty();
    }

    Ticket toUpdate = found.get();

    // Validación: Si se intenta cambiar el asignado, verifica que ≠ creador
    if (ticket.getAssignedTo() != null && 
        ticket.getAssignedTo().equals(toUpdate.getCreatedBy())) {
        throw new IllegalArgumentException("El creador y el asignado no pueden ser el mismo usuario");
    }

    toUpdate.setTitle(ticket.getTitle());
    toUpdate.setDescription(ticket.getDescription());
    toUpdate.setStatus(ticket.getStatus());
    toUpdate.setEffectiveResolutionDate(ticket.getEffectiveResolutionDate());
    if (ticket.getAssignedTo() != null) {
        toUpdate.setAssignedTo(ticket.getAssignedTo());
    }
    this.repository.update(toUpdate);
    return Optional.of(toUpdate);
}
```

---

## Paso 4: actualizar `TicketController.create()`

Envuelve el `service.create()` en try/catch para capturar la excepción:

```java
@PostMapping
public ResponseEntity<Object> create(@Valid @RequestBody Ticket ticket) {
    try {
        this.service.create(ticket);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ticket Creado");
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(e.getMessage()));
    }
}
```

> **¿Por qué `409 Conflict` y no `400 Bad Request`?**
> El estándar HTTP define `409 Conflict` para situaciones donde la petición entra en conflicto con el estado actual del recurso (por ejemplo, un título duplicado o un creador que es el mismo que el asignado). `400 Bad Request` se reserva para problemas de formato o validación del request en sí.

---

## Paso 5: actualizar `TicketController.updateTicketById()`

Envuelve el `service.updateById()` en try/catch y usa `Optional`:

```java
@PutMapping("/by-id/{id}")
public ResponseEntity<Object> updateTicketById(
        @PathVariable Long id,
        @Valid @RequestBody Ticket ticket) {
    try {
        Optional<Ticket> updated = this.service.updateById(id, ticket);
        if (updated.isPresent()) {
            return ResponseEntity.ok(updated.get());
        }
        return ResponseEntity.notFound().build();
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(e.getMessage()));
    }
}
```

---

## Paso 6: crear `ErrorResponse`

Crea el archivo `model/ErrorResponse.java`:

```java
package cl.duoc.fullstack.tickets.model;

public record ErrorResponse(String message) {}
```

Jackson convierte automáticamente a JSON: `{"message": "..."}`

---

## Paso 7: verificar que todo funciona

### Prueba 1: crear ticket sin asignar (válido)

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Ticket A",
  "description": "Descripción",
  "createdBy": "juan"
}
```

**Resultado:** `201 Created` con `"Ticket Creado"`

### Prueba 2: crear ticket con creador = asignado (inválido)

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Ticket B",
  "description": "Descripción",
  "createdBy": "juan",
  "assignedTo": "juan"
}
```

**Resultado:** `409 Conflict` con:

```json
{
  "message": "El creador y el asignado no pueden ser el mismo usuario"
}
```

### Prueba 3: crear ticket con creador ≠ asignado (válido)

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Ticket C",
  "description": "Descripción",
  "createdBy": "juan",
  "assignedTo": "maria"
}
```

**Resultado:** `201 Created`

### Prueba 4: modificar ticket a asignado = creador (inválido)

```
PUT http://localhost:8080/ticket-app/tickets/by-id/1
Content-Type: application/json

{
  "title": "Ticket C",
  "description": "Nueva descripción",
  "status": "IN_PROGRESS",
  "assignedTo": "juan"
}
```

**Resultado:** `409 Conflict` con el mismo error.




<!-- START OF FILE: docs_lessons_07-errors_03_manejo_global_vs_local.md -->
# Documento: docs lessons 07-errors 03 manejo global vs local
---
# Lección 07 - El debate: manejo local vs. manejo global de errores

## El problema que aparece cuando creces

Después de esta lección tu controlador maneja errores así:

```java
// En create():
} catch (IllegalArgumentException e) {
    return ResponseEntity.status(HttpStatus.CONFLICT)
        .body(new ErrorResponse(e.getMessage()));
}

// En getById():
.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
    .body(new ErrorResponse("Ticket con ID " + id + " no encontrado")));
```

Ahora imagina que tu API crece. Tienes `TicketController`, `CategoryController`, `UserController`, `ProjectController`. Cada uno tiene los mismos bloques try/catch y `.orElse(...)` con `new ErrorResponse(...)`.

Si decides cambiar la estructura del error — agregar un campo `timestamp`, cambiar el nombre de `message` a `error`, o agregar un código numérico — tendrías que editar **cada uno** de esos bloques en **cada controlador**.

Eso viola el principio DRY (*Don't Repeat Yourself*).

---

## La solución: `@ControllerAdvice`

Spring ofrece `@ControllerAdvice`, una anotación que marca una clase como **manejador global de excepciones**. Cualquier excepción que no sea capturada en el controlador sube hacia esta clase, que decide qué respuesta devolver.

```java
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(e.getMessage()));
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(NoSuchElementException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse(e.getMessage()));
    }
}
```

Con este enfoque, los controladores **no tienen try/catch**. Si el service lanza una `IllegalArgumentException`, esta clase la intercepta automáticamente.

---

## Comparación directa

| Criterio | Manejo local (try/catch) | Manejo global (`@ControllerAdvice`) |
|---|---|---|
| **Dónde vive el código de error** | En cada método del controlador | En una sola clase centralizada |
| **DRY** | ❌ Repite lógica en cada método | ✅ Un solo lugar |
| **Claridad del controlador** | El flujo feliz y los errores están mezclados | Solo el flujo feliz; errores en otro lado |
| **Cambiar la estructura del error** | Hay que tocar cada método | Solo hay que tocar el `@ControllerAdvice` |
| **Facilidad de entendimiento inicial** | ✅ Fácil de razonar paso a paso | Requiere conocer el ciclo de vida de Spring MVC |
| **Errores específicos por endpoint** | ✅ Fácil de personalizar por caso | Posible, pero más elaborado |

---

## ¿Por qué no lo implementamos ya?

Tres razones pedagógicas:

1. **El try/catch local hace visible el flujo.** Cuando ves `try { ... } catch (IllegalArgumentException e)` en el método, entiendes exactamente qué puede salir mal y qué responde el servidor. `@ControllerAdvice` esconde ese enlace.

2. **`@ControllerAdvice` requiere conocer el ciclo de vida de Spring MVC.** Cuando una excepción no es capturada localmente, sube por el stack y Spring la intercepta. Entender eso bien — incluyendo cuándo aplica, cuándo no, y cómo interactúa con `@ResponseStatus` — merece su propio espacio.

3. **El problema de DRY no duele con un solo controlador.** Cuando tengas tres o cuatro controladores con la misma lógica de error, el dolor será concreto y la solución será obvia. Aprender la solución antes de sentir el problema dificulta recordarla.

---

## El `@ExceptionHandler` local: un punto medio

Hay una opción intermedia que usarás en la lección 08: `@ExceptionHandler` dentro del propio controlador. No es global como `@ControllerAdvice`, pero tampoco repite el mismo bloque en cada método.

```java
@RestController
@RequestMapping("/tickets")
public class TicketController {

    // ... endpoints ...

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldErrors().stream()
            .map(err -> err.getField() + ": " + err.getDefaultMessage())
            .collect(Collectors.joining(", "));
        return ResponseEntity.badRequest().body(new ErrorResponse(message));
    }
}
```

Este `@ExceptionHandler` aplica **solo** a las excepciones que lanzan los métodos de ese controlador. Es útil para validaciones que son específicas de un recurso y no necesitan ser globales.

---

## El mapa de evolución

```
Lección 07: try/catch por método + orElse con body
                ↓
Lección 08: @ExceptionHandler local (por validación)
                ↓
Futuro:     @ControllerAdvice global (cuando escale)
```

Cada paso tiene su momento correcto. Lo importante ahora es que entiendas **por qué** existe cada nivel, no solo cómo implementarlo.




<!-- START OF FILE: docs_lessons_07-errors_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 07-errors 04 checklist rubrica minima
---
# Lección 07 - Checklist y rúbrica mínima

Usa esta lista para verificar que implementaste correctamente la estructura de error antes de dar la lección por terminada.

---

## Checklist de la clase `ErrorResponse`

- ☐ Existe el archivo `model/ErrorResponse.java`
- ☐ Está declarada como `record`: `public record ErrorResponse(String message) {}`
- ☐ No tiene dependencias externas ni anotaciones adicionales
- ☐ Está en el paquete `cl.duoc.fullstack.tickets.model`

---

## Checklist de endpoints

| Endpoint | Código exitoso | Error + body `{"message":"..."}` |
|---|---|---|
| `GET /tickets` | 200 + lista | — |
| `GET /tickets/{id}` existente | 200 + ticket | — |
| `GET /tickets/{id}` inexistente | — | ☐ 404 + `{"message": "Ticket con ID X no encontrado"}` |
| `POST /tickets` título nuevo | 201 + ticket | — |
| `POST /tickets` título duplicado | — | ☐ 409 + `{"message": "Ya existe un ticket..."}` |
| `PUT /tickets/{id}` existente | 200 + ticket | — |
| `PUT /tickets/{id}` inexistente | — | ☐ 404 + `{"message": "Ticket con ID X no encontrado"}` |
| `DELETE /tickets/{id}` existente | 204 sin body | — |
| `DELETE /tickets/{id}` inexistente | — | ☐ 404 + `{"message": "Ticket con ID X no encontrado"}` |

---

## Checklist de código

### `TicketController.java`

- ☐ Todos los métodos de error devuelven `ResponseEntity<?>` (no `ResponseEntity<Object>`, no `ResponseEntity<Void>` en los que pueden fallar)
- ☐ El método `create()` usa `body(new ErrorResponse(e.getMessage()))`, **no** `body(e.getMessage())`
- ☐ Los métodos `getById()`, `update()` y `delete()` usan `body(new ErrorResponse("..."))` en el caso 404, **no** `.notFound().build()`
- ☐ El tipo en `.map()` está anotado: `.<ResponseEntity<?>>map(ResponseEntity::ok)` en `getById()` y `update()`
- ☐ No hay `null` explícito en el controlador

### `ErrorResponse.java`

- ☐ Jackson puede serializarla: al incluirla en el body de una `ResponseEntity`, Spring devuelve `Content-Type: application/json`
- ☐ El campo se llama `message` (sin prefijo `get`, es un record)

### `TicketService.java`

- ☐ El método `create()` lanza `IllegalArgumentException` con un mensaje descriptivo cuando el título ya existe
- ☐ No hay `return null` en ningún método del service

---

## Checklist de pruebas

Hiciste las siguientes pruebas en Postman / Thunder Client:

- ☐ `POST /tickets` con título existente → `409 Conflict` + `Content-Type: application/json` + `{"message": "..."}`
- ☐ `GET /tickets/by-id/999` → `404 Not Found`
- ☐ `PUT /tickets/by-id/999` → `404 Not Found`
- ☐ `DELETE /tickets/by-id/999` → `404 Not Found`
- ☐ `GET /tickets/by-id/1` → `200 OK` + ticket completo (el body exitoso no se rompió)
- ☐ `POST /tickets` con título nuevo → `201 Created` + `"Ticket Creado"` (el flujo feliz no se rompió)

---

## Errores comunes a evitar

| Error | Por qué está mal | Cómo corregirlo |
|---|---|---|
| `body(e.getMessage())` | Devuelve `text/plain`, no JSON | Usar `body(new ErrorResponse(e.getMessage()))` |
| `ResponseEntity.notFound().build()` en error | Sin cuerpo; el cliente no sabe qué falló | Usar `.status(NOT_FOUND).body(new ErrorResponse("..."))` |
| `ResponseEntity<Object>` cuando el tipo varía | Funciona, pero oculta la intención | Usar `ResponseEntity<?>` para tipos mixtos |
| Olvidar `.<ResponseEntity<?>>map(...)` | Error de compilación por tipos incompatibles | Anotar el tipo antes del `.map()` |
| Mensaje de error genérico ("Error") | El cliente no puede actuar sobre él | Incluir el valor que causó el error en el mensaje |




<!-- START OF FILE: docs_lessons_07-errors_05_actividad_individual.md -->
# Documento: docs lessons 07-errors 05 actividad individual
---
# Lección 07 - Actividad individual: errores estructurados en categorías

## Contexto

En las lecciones anteriores implementaste el CRUD de `Category`. En este momento, sus errores siguen el mismo patrón deficiente que tenía `Ticket` antes de esta lección: cuerpos de texto plano o respuestas 404 vacías.

Esta actividad es aplicar exactamente lo que aprendiste hoy, pero sobre el recurso que tú construiste.

---

## ¿Qué vas a construir?

Vas a actualizar `CategoryController` y `CategoryService` para que todos los errores devuelvan una estructura JSON consistente:

```json
{
  "message": "Categoría con ID 999 no encontrada"
}
```

---

## Requerimientos

### 1. Reutiliza `ErrorResponse`

**No** crees una segunda clase de error. La clase `ErrorResponse` que creaste hoy existe en el paquete `model` y está disponible para todos los controladores. Impórtala y úsala directamente en `CategoryController`.

### 2. Actualiza `CategoryService`

Verifica que `create()` lanza `IllegalArgumentException` con un mensaje descriptivo cuando el nombre ya existe:

```java
throw new IllegalArgumentException("Ya existe una categoría con el nombre '" + request.getName() + "'");
```

Si ya lo hiciste en la lección 06, no hay nada que cambiar aquí.

### 3. Actualiza `CategoryController`

Aplica exactamente el mismo patrón que `TicketController`:

| Endpoint | Código exitoso | Error con body |
|---|---|---|
| `GET /categories` | 200 + lista | — |
| `GET /categories/{id}` | 200 + categoría | 404 + `{"message": "Categoría con ID X no encontrada"}` |
| `POST /categories` | 201 + categoría | 409 + `{"message": "Ya existe una categoría con el nombre '...'"}` |
| `PUT /categories/{id}` | 200 + categoría | 404 + `{"message": "Categoría con ID X no encontrada"}` |
| `DELETE /categories/{id}` | 204 sin body | 404 + `{"message": "Categoría con ID X no encontrada"}` |

---

## Guía de implementación

### `CategoryController.java`

```java
// Todos los métodos con posible error devuelven ResponseEntity<?>

@GetMapping("/{id}")
public ResponseEntity<?> getById(@PathVariable Long id) {
    return service.findById(id)
        .<ResponseEntity<?>>map(ResponseEntity::ok)
        .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse("Categoría con ID " + id + " no encontrada")));
}

@PostMapping
public ResponseEntity<?> create(@RequestBody Category category) {
    try {
        Category saved = service.create(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(e.getMessage()));
    }
}
```

Replica el mismo patrón para `PUT` y `DELETE`.

---

## Ejemplos de prueba

### Crear categoría duplicada

```
POST http://localhost:8080/categories
Content-Type: application/json

{ "name": "Hardware", "description": "Ya existe" }
```

Resultado esperado:

```json
{
  "message": "Ya existe una categoría con el nombre 'Hardware'"
}
```

Código: `409 Conflict`, `Content-Type: application/json`.

### Buscar categoría inexistente

```
GET http://localhost:8080/categories/999
```

Resultado esperado:

```json
{
  "message": "Categoría con ID 999 no encontrada"
}
```

Código: `404 Not Found`.

---

## Extensión opcional

Si terminaste antes, agrega mensajes de error más detallados al `DELETE`:

- Si la categoría tiene tickets asociados, que el servidor responda `409 Conflict` con el mensaje: `"No se puede eliminar la categoría 'Hardware' porque tiene tickets asociados"`

Por ahora no hay una relación real entre categorías y tickets, así que puedes simularlo con un contador fijo: si el ID de la categoría a eliminar es `1`, asume que tiene tickets asociados.

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| Todos los errores de `CategoryController` devuelven `Content-Type: application/json` | 30% |
| Los códigos HTTP son correctos (404 para no encontrado, 409 para conflicto) | 25% |
| Se reutiliza `ErrorResponse` del paquete `model` sin duplicarla | 25% |
| El mensaje incluye el valor que causó el error (ID o nombre) | 20% |




<!-- START OF FILE: docs_lessons_08-dto_01_objetivo_y_alcance.md -->
# Documento: docs lessons 08-dto 01 objetivo y alcance
---
# Lección 08 - Validaciones y DTO: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior conseguiste que todos los errores de tu API devuelvan el mismo formato JSON: `{"message": "..."}`. Ahora el contrato de errores es claro y consistente.

Pero hay un problema diferente que aún existe: el cliente puede enviarte **campos que no debería poder enviar**.

Observa el body que acepta tu `POST /tickets` ahora mismo:

```json
{
  "id": 99,
  "title": "Bug en login",
  "description": "No puedo iniciar sesión",
  "status": "RESOLVED",
  "createdAt": "2020-01-01T00:00:00",
  "estimatedResolutionDate": "2020-01-06"
}
```

Tu API acepta este body sin quejarse. El campo `id` se ignora porque el `Repository` lo sobreescribe, y `createdAt` se ignora porque el `Service` asigna su propio valor. Pero `status` **sí podría ser tomado** si no tienes cuidado.

El problema no es solo este caso concreto. El problema de fondo es que estás usando `Ticket` — tu modelo de dominio — como la entrada directa de la API. Eso mezcla dos responsabilidades que deben estar separadas:

- **Lo que el cliente puede enviar** (campos de entrada)
- **Lo que el sistema almacena y procesa** (modelo de dominio)

Esta lección existe para resolver eso.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás:

1. Un **DTO de entrada** (`TicketRequest`) implementado como un **Java `record`** — una característica de Java 21 que genera automáticamente constructor, getters, `equals()`, `hashCode()` y `toString()`
2. **Validación automática** del título con `@NotBlank`: si viene vacío, la API responde `400 Bad Request` con `{"message": "título: El titulo es requerido"}`
3. Un `@ExceptionHandler` en el controlador que convierte los errores de validación al formato `ErrorResponse`

### Lo que vas a ser capaz de explicar

Al terminar deberías poder responder:

- ¿Qué es un DTO y para qué sirve?
- ¿Por qué el modelo de dominio no debería ser la forma de entrada de la API?
- ¿Qué es un `record` en Java y por qué es ideal para DTOs?
- ¿Qué hace `@NotBlank` y en qué se diferencia de `@NotNull` y `@NotEmpty`?
- ¿Qué hace `@Valid` en el parámetro del controlador?
- ¿Qué excepción lanza Spring cuando la validación falla y cómo se captura?
- ¿Por qué el `@ExceptionHandler` local es preferible al try/catch por cada método para errores de validación?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).

| Requerimiento | Lo que construimos |
|---|---|
| **REQ-12** — Título no puede estar vacío | La anotación `@NotBlank` en `TicketRequest.title` + respuesta `400` |
| **REQ-13** — DTO separado del modelo | El `record TicketRequest` en el paquete `dto` |

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| `@ControllerAdvice` global para validaciones | Requiere entender bien la jerarquía de excepciones; el `@ExceptionHandler` local es suficiente por ahora |
| Validaciones complejas (`@Min`, `@Max`, `@Pattern`, `@Size`) | Primero entiende el flujo básico; agregarlas es trivial una vez que entiendes `@NotBlank` |
| MapStruct u otras librerías de mapeo DTO → modelo | El mapeo manual hace visible la transformación; una librería lo oculta |
| DTO de respuesta (Response DTO) | Ahora solo controlamos la **entrada**; los DTOs de salida son un tema separado |
| Validaciones de negocio en el DTO | Las reglas de negocio (como "no duplicados") pertenecen al Service, no al DTO |

El foco de esta lección es uno: **separar la entrada del modelo y validarla antes de que llegue al Service**.

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← acepta @RequestBody Ticket (modelo directo)
├── model/
│   ├── Ticket.java
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java
├── service/
│   └── TicketService.java      ← create(Ticket ticket)
└── TicketsApplication.java
```

Y la estructura que tendrás al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← acepta @Valid @RequestBody TicketRequest + @ExceptionHandler
├── dto/
│   └── TicketRequest.java      ← nueva: record de entrada con @NotBlank
├── model/
│   ├── Ticket.java             ← sin anotaciones de validación (modelo puro)
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java
├── service/
│   └── TicketService.java      ← create(TicketRequest request), updateById(Long id, TicketRequest request)
└── TicketsApplication.java
```



<!-- START OF FILE: docs_lessons_08-dto_02_guion_paso_a_paso.md -->
# Documento: docs lessons 08-dto 02 guion paso a paso
---
# Lección 08 - Tutorial paso a paso: DTO y validaciones

Sigue esta guía en orden. Vas a separar la entrada de la API del modelo de dominio e introducir validación automática.

---

## Paso 1: verificar la dependencia de validación

En la lección anterior ya agregaste la dependencia de Bean Validation en `pom.xml`. Verifica que esté presente:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

Esta dependencia trae Hibernate Validator (la implementación de referencia de Bean Validation / JSR-380), que provee anotaciones como `@NotBlank`, `@NotNull`, `@Size`, `@Min`, `@Max` y `@Pattern`.

---

## Paso 2: entender por qué necesitamos un DTO

Antes de crear `TicketRequest`, entiende el problema que resuelve.

Tu endpoint actual acepta esto:

```java
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) { ... }
```

El cliente puede enviar un JSON con **cualquier campo** de `Ticket`:

```json
{
  "id": 999,
  "title": "Bug crítico",
  "status": "RESOLVED",
  "createdAt": "2020-01-01T00:00:00",
  "estimatedResolutionDate": "2020-01-06"
}
```

Algunos de esos campos se ignoran en el `Service` (el `id`, `createdAt`, `estimatedResolutionDate`), pero `status` **podría ser leído** en una versión futura del código. El modelo expuesto como entrada es una bomba de tiempo.

La solución: un DTO que declara **solo** lo que el cliente puede enviar.

---

## Paso 3: crear el paquete `dto` y el `record TicketRequest`

Crea el directorio `dto` dentro de `cl/duoc/fullstack/tickets/` y luego el archivo:

```
src/main/java/cl/duoc/fullstack/tickets/dto/TicketRequest.java
```

```java
package cl.duoc.fullstack.tickets.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public record TicketRequest(
    @NotBlank(message = "El titulo es requerido")
    @Size(min = 1, max = 50)
    String title,
    @NotBlank(message = "La descripción es requerida")
    String description,
    @NotBlank(message = "El creador es requerido")
    String createdBy,
    String assignedTo,
    String status,
    LocalDateTime effectiveResolutionDate
) {}
```

> **¿Qué es un `record` en Java?**
> Un `record` es una clase especial introducida en Java 16 que genera automáticamente:
> - Un constructor con todos los campos como parámetros
> - Métodos de acceso por nombre de campo (ej: `title()`, `description()`)
> - `equals()`, `hashCode()` y `toString()` basados en todos los campos
>
> Los records son **inmutables**: una vez creados, sus valores no pueden cambiar. Esto los hace ideales para DTOs, donde solo necesitas transportar datos de un lugar a otro sin modificarlos.

> **¿Por qué un `record` y no una clase con Lombok?**
> Para el modelo `Ticket` usamos Lombok porque necesitamos setters (mutabilidad) — el `Service` modifica campos como `status`, `createdAt`, etc. Pero un DTO de entrada no necesita setters: Jackson lo crea una vez a partir del JSON y nadie lo modifica después. El `record` expresa esa intención con menos código y sin dependencias externas.
>
> Jackson (la librería de serialización que usa Spring) soporta records de forma nativa desde la versión 2.12 — no necesitas `@JsonCreator` ni configuración adicional.

> **¿Por qué `@NotBlank` y no `@NotNull`?**
> `@NotNull` solo verifica que el campo no sea `null`. `@NotBlank` es más estricto: verifica que no sea null, no sea una cadena vacía `""`, y no sea solo espacios en blanco `"   "`. Para un título de ticket, `"   "` es tan inválido como `null`, por eso usamos `@NotBlank`.
>
> **Diferencias resumidas:**
> - `@NotNull` → `null` falla; `""` y `"   "` pasan
> - `@NotEmpty` → `null` y `""` fallan; `"   "` pasa
> - `@NotBlank` → `null`, `""` y `"   "` fallan

> **¿Por qué incluir `status` y `effectiveResolutionDate` en el DTO si el servidor los controla en el `create`?**
> Porque el mismo `TicketRequest` se reutiliza para el `PUT /tickets/by-id/{id}`, donde el cliente sí puede actualizar el estado y la fecha de resolución. Un campo opcional en el DTO es válido: simplemente se ignora si no viene.

---

## Paso 4: quitar las anotaciones de validación del modelo `Ticket`

Ahora que la validación vive en el DTO, el modelo `Ticket` queda como un POJO puro de Lombok — sin anotaciones de Jakarta Validation:

```java
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
  private Long id;
  private String title;
  private String description;
  private String status;
  private LocalDateTime createdAt;
  private LocalDate estimatedResolutionDate;
  private LocalDateTime effectiveResolutionDate;
  private String createdBy;
  private String assignedTo;
}
```

> **¿Por qué quitamos las anotaciones del modelo?**
> Porque la validación de entrada es responsabilidad del DTO, no del modelo de dominio. El `Ticket` representa lo que el sistema almacena internamente — el `TicketRequest` representa lo que el cliente puede enviar. Mezclar ambas responsabilidades en la misma clase fue exactamente el problema que identificamos al principio.

---

## Paso 5: actualizar `TicketService.create()` para aceptar `TicketRequest`

El `Service` recibe el DTO y construye el `Ticket` internamente. Esta transformación es responsabilidad del `Service`: es el puente entre la capa de entrada y el modelo de dominio.

**Antes:**

```java
public Ticket create(Ticket ticket) {
    // validaciones...
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));
    return this.repository.save(ticket);
}
```

**Después:**

```java
public Ticket create(TicketRequest request) {
    if (this.repository.existsByTitle(request.title())) {
        throw new IllegalArgumentException(
            "Ya existe un ticket con el título: \"" + request.title() + "\"");
    }

    if (request.assignedTo() != null
        && request.assignedTo().equals(request.createdBy())) {
        throw new IllegalArgumentException("El creador y el asignado no pueden ser el mismo usuario");
    }

    Ticket ticket = new Ticket();
    ticket.setTitle(request.title());
    ticket.setDescription(request.description());
    ticket.setCreatedBy(request.createdBy());
    ticket.setAssignedTo(request.assignedTo());
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));

    return this.repository.save(ticket);
}
```

La diferencia clave: el `Service` **construye** el `Ticket` a partir del DTO. El cliente nunca puede inyectar un `Ticket` preformado con campos no permitidos.

> **¿Por qué se accede a los campos con `request.title()` y no `request.getTitle()`?**
> Los records en Java generan métodos de acceso con el mismo nombre que el campo, sin el prefijo `get`. Es una convención del lenguaje para records.

> **¿Por qué crear `new Ticket()` en el Service y no en el Repository?**
> El `Service` tiene la responsabilidad de aplicar las reglas de negocio: qué campos asigna el servidor, cuáles vienen del cliente, cuáles se calculan. El `Repository` solo guarda. Si el `Repository` construyera el `Ticket`, mezclaría lógica de negocio con lógica de persistencia.

---

## Paso 6: actualizar `TicketService.updateById()` para aceptar `TicketRequest`

```java
public Optional<Ticket> updateById(Long id, TicketRequest request) {
    Optional<Ticket> found = this.repository.findById(id);
    if (found.isEmpty()) {
        return Optional.empty();
    }

    Ticket toUpdate = found.get();

    if (request.assignedTo() != null
        && request.assignedTo().equals(toUpdate.getCreatedBy())) {
        throw new IllegalArgumentException("El creador y el asignado no pueden ser el mismo usuario");
    }

    toUpdate.setTitle(request.title());
    toUpdate.setDescription(request.description());
    if (request.status() != null && !request.status().isBlank()) {
        toUpdate.setStatus(request.status());
    }
    toUpdate.setEffectiveResolutionDate(request.effectiveResolutionDate());
    if (request.assignedTo() != null) {
        toUpdate.setAssignedTo(request.assignedTo());
    }
    this.repository.update(toUpdate);
    return Optional.of(toUpdate);
}
```

El `status` en el `PUT` es opcional: si el cliente no lo envía (llega como `null`), el status del ticket no cambia. Si lo envía, sí se actualiza.

---

## Paso 7: actualizar el controlador para usar `@Valid` y `TicketRequest`

**POST — antes y después:**

```java
// Antes:
public ResponseEntity<Object> create(@RequestBody Ticket ticket) { ... }

// Después:
public ResponseEntity<Object> create(@Valid @RequestBody TicketRequest request) { ... }
```

**PUT — antes y después:**

```java
// Antes:
public ResponseEntity<Object> updateTicketById(@PathVariable Long id, @RequestBody Ticket ticket) { ... }

// Después:
public ResponseEntity<Object> updateTicketById(@PathVariable Long id, @Valid @RequestBody TicketRequest request) { ... }
```

> **¿Qué hace `@Valid`?**
> Le indica a Spring que debe validar el objeto anotado con las restricciones de Bean Validation (`@NotBlank`, etc.) antes de ejecutar el método. Si la validación falla, Spring lanza `MethodArgumentNotValidException` **antes** de entrar al cuerpo del método. El método nunca se ejecuta.
>
> Si olvidaras `@Valid`, las anotaciones `@NotBlank` estarían en el DTO pero nunca se evaluarían. El `@RequestBody` deserializa el JSON independientemente de si `@Valid` está presente o no.

---

## Paso 8: agregar el `@ExceptionHandler` para errores de validación

Cuando `@Valid` falla, Spring lanza `MethodArgumentNotValidException`. Si no capturas esa excepción, Spring devuelve su propio formato de error por defecto — que no coincide con tu `ErrorResponse`.

Agrega este método en `TicketController`:

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException e) {
    String message = e.getBindingResult().getFieldErrors().stream()
        .map(err -> err.getField() + ": " + err.getDefaultMessage())
        .collect(Collectors.joining(", "));
    return ResponseEntity.badRequest().body(new ErrorResponse(message));
}
```

**Código equivalente sin expresiones lambda:**

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException e) {
    List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < fieldErrors.size(); i++) {
        FieldError err = fieldErrors.get(i);
        sb.append(err.getField()).append(": ").append(err.getDefaultMessage());
        if (i < fieldErrors.size() - 1) {
            sb.append(", ");
        }
    }
    return ResponseEntity.badRequest().body(new ErrorResponse(sb.toString()));
}
```

> **¿Por qué `@ExceptionHandler` y no try/catch dentro del método?**
> Con `@Valid`, la excepción se lanza **antes** de entrar al método — no puedes capturarla con try/catch porque el método nunca empieza. `@ExceptionHandler` es el mecanismo correcto: intercepta la excepción en la capa del controlador y devuelve la respuesta adecuada. Es el primer nivel de centralización de errores, antes de `@ControllerAdvice`.

> **¿Este `@ExceptionHandler` aplica a todos los controladores?**
> No. Un `@ExceptionHandler` dentro de un `@RestController` aplica **solo** a las excepciones que lanza ese controlador. Para que aplique globalmente, necesitarías moverlo a una clase con `@ControllerAdvice` — exactamente lo que discutimos en la lección 07.

---

## Paso 9: probar la validación

### Prueba 1: título vacío

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "title": "", "description": "Descripción", "createdBy": "juan" }
```

Resultado esperado (`400 Bad Request`):

```json
{
  "message": "title: El titulo es requerido"
}
```

### Prueba 2: título con solo espacios

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "title": "   ", "description": "Descripción", "createdBy": "juan" }
```

Resultado esperado: `400 Bad Request` con el mismo mensaje de error.

### Prueba 3: título ausente (null)

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "description": "Sin título", "createdBy": "juan" }
```

Resultado esperado: `400 Bad Request` con mensaje de validación.

### Prueba 4: creación válida (el flujo feliz no se rompió)

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "title": "Bug en facturación", "description": "El sistema falla al generar PDF", "createdBy": "juan" }
```

Resultado esperado: `201 Created` con `"Ticket Creado"`.

### Prueba 5: validación en PUT también funciona

```
PUT http://localhost:8080/ticket-app/tickets/by-id/1
Content-Type: application/json

{ "title": "", "description": "Descripción", "createdBy": "juan" }
```

Resultado esperado: `400 Bad Request` con mensaje de validación.

---

## Paso 10: reflexiona antes de cerrar

1. Si el cliente envía `{"id": 99, "title": "Test", "status": "RESOLVED", "createdBy": "juan"}` al `POST /tickets`, ¿qué ocurre con el `id` y el `status` que envió? ¿El servidor los usa o los descarta?
2. ¿Por qué el `Service` construye el `Ticket` a partir del `TicketRequest` en lugar de recibirlo directamente? ¿Qué pasaría si un futuro desarrollador agrega `ticket.setStatus(request.status())` al service?
3. Si agregas `@NotBlank` en `description` también, ¿qué cambiaría en la respuesta de error si ambos campos son inválidos?
4. ¿Qué diferencia hay entre un `record` de Java y una clase con Lombok? ¿Cuándo preferirías uno sobre otro?



<!-- START OF FILE: docs_lessons_08-dto_03_por_que_dto.md -->
# Documento: docs lessons 08-dto 03 por que dto
---
# Lección 08 - Por qué necesitas un DTO

## El problema con exponer el modelo directamente

Una API que usa su modelo de dominio como entrada directa tiene un problema fundamental: el **modelo está diseñado para el sistema**, no para el cliente.

```java
// Mal: el modelo de dominio es la entrada
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) { ... }
```

Esto tiene tres consecuencias:

---

## Razón 1: Seguridad — el cliente no debería poder controlar todo

El modelo `Ticket` tiene campos que el servidor asigna: `id`, `status`, `createdAt`, `estimatedResolutionDate`. Si expones el modelo directamente, el cliente puede intentar enviar esos campos.

**Ejemplo de ataque (mass assignment):**

```json
{
  "title": "Bug legítimo",
  "description": "...",
  "status": "RESOLVED",
  "createdAt": "2020-01-01T00:00:00"
}
```

Si el código del `Service` no tiene cuidado (o alguien lo modifica inadvertidamente), esos campos podrían ser tomados tal cual. Con un DTO, ese peligro desaparece: el objeto de entrada solo tiene los campos que declaraste explícitamente.

```java
// Seguro: TicketRequest no tiene id, status, createdAt, estimatedResolutionDate
public class TicketRequest {
    @NotBlank
    private String title;
    private String description;
}
```

---

## Razón 2: Control — el servidor decide qué calcula

Algunos campos del `Ticket` son **calculados por el servidor** según reglas de negocio:

- `id` → asignado automáticamente
- `status` → siempre empieza en `NEW`
- `createdAt` → momento exacto del servidor
- `estimatedResolutionDate` → 5 días después de la creación

Si el modelo fuera la entrada, el `Service` tendría que **ignorar activamente** lo que el cliente mandó. Con un DTO, estos campos simplemente no existen en la entrada — no hay nada que ignorar.

```java
// El Service construye el Ticket con sus propias reglas
Ticket ticket = new Ticket();
ticket.setTitle(request.getTitle());     // del cliente
ticket.setDescription(request.getDescription()); // del cliente
ticket.setStatus("NEW");                 // servidor
ticket.setCreatedAt(LocalDateTime.now()); // servidor
ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5)); // servidor
```

---

## Razón 3: Desacoplamiento — el modelo puede evolucionar sin romper la API

Si en el futuro agregas un campo `priority` al modelo `Ticket` (con base de datos real), el contrato de entrada de tu API **no necesita cambiar**. El DTO sigue siendo el mismo. Solo el `Service` sabe cómo mapear `request → ticket` con el campo nuevo.

Si expusieras el modelo directamente, cualquier cambio en el modelo rompería el contrato con los clientes que ya consumen tu API.

---

## Razón 4: Validación — dónde poner las restricciones

Las anotaciones `@NotBlank`, `@Size`, `@Min` pertenecen a la entrada, no al modelo de dominio.

¿Por qué? Porque la misma regla puede ser diferente según de dónde viene el dato:

- El `title` puede ser obligatorio cuando lo envía el cliente por HTTP
- Pero puede ser `null` legítimamente si se genera internamente (por ej., un sistema de importación)

Si pones `@NotBlank` en el modelo, aplica en **todos los contextos**. Si lo pones en el DTO, aplica solo cuando el cliente envía datos por la API.

```java
// DTO: @NotBlank aplica a la entrada de la API
public class TicketRequest {
    @NotBlank(message = "El título no puede estar vacío")
    private String title;
}

// Modelo: sin @NotBlank, libre para otros contextos
public class Ticket {
    private String title; // puede ser generado internamente sin restricción
}
```

---

## Los tres tipos de DTO que existen

Esta lección introduce solo uno de ellos, pero es útil conocer el panorama:

| Tipo | Nombre convencional | ¿Cuándo se usa? |
|---|---|---|
| **DTO de entrada** (lo que implementamos hoy) | `XxxRequest`, `XxxDto`, `CreateXxxCommand` | Para recibir datos del cliente: `@RequestBody` |
| **DTO de salida** | `XxxResponse`, `XxxView` | Para controlar qué campos devuelve la API al cliente |
| **DTO de capa** | `XxxDto` (interno) | Para pasar datos entre capas sin exponer el modelo |

Por ahora usamos el modelo `Ticket` directamente como respuesta (`200 OK` devuelve el `Ticket` completo). En una API más madura, tendrías un `TicketResponse` que oculta campos internos y puede transformar formatos.

---

## El patrón completo con DTO

```
Cliente
    ↓ envía JSON
    ↓
TicketRequest (DTO de entrada)
    ↓ @Valid lo valida
    ↓
TicketController.create(TicketRequest)
    ↓ llama al service
    ↓
TicketService.create(TicketRequest)
    ↓ valida reglas de negocio
    ↓ construye Ticket
    ↓
TicketRepository.save(Ticket)
    ↓
Ticket (modelo de dominio, persiste en memoria)
    ↓ devuelve al controller
    ↓
ResponseEntity con Ticket como body
    ↓ Jackson serializa a JSON
    ↓
Cliente recibe { id, title, description, status, createdAt, ... }
```

Cada capa trabaja con lo que necesita. El cliente nunca ve el código interno ni puede manipular campos que no le corresponden.




<!-- START OF FILE: docs_lessons_08-dto_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 08-dto 04 checklist rubrica minima
---
# Lección 08 - Checklist y rúbrica mínima

Usa esta lista para verificar que implementaste correctamente el DTO y las validaciones antes de dar la lección por terminada.

---

## Checklist de dependencia

- ☐ `pom.xml` incluye `spring-boot-starter-validation` como dependencia
- ☐ La aplicación compila y levanta correctamente después de agregar la dependencia

---

## Checklist del DTO `TicketRequest`

- ☐ Existe el archivo `dto/TicketRequest.java`
- ☐ Está en el paquete `cl.duoc.fullstack.tickets.dto`
- ☐ Tiene `@Getter`, `@NoArgsConstructor`, `@AllArgsConstructor` de Lombok
- ☐ El campo `title` tiene `@NotBlank(message = "El título no puede estar vacío")`
- ☐ **No tiene** los campos `id`, `createdAt`, `estimatedResolutionDate` (esos los asigna el servidor)
- ☐ Tiene `description` (String, sin validación obligatoria)
- ☐ Tiene `status` (String, opcional, para el caso del PUT)

---

## Checklist del Service

- ☐ `create(TicketRequest request)` recibe el DTO, **no** `Ticket` directamente
- ☐ Dentro de `create()` se construye un `new Ticket()` y se asignan sus campos manualmente
- ☐ Los campos `status`, `createdAt`, `estimatedResolutionDate` son asignados por el Service, **no** tomados del request
- ☐ `update(Long id, TicketRequest request)` también recibe el DTO
- ☐ No hay `return null` en ningún método del Service

---

## Checklist del Repository

- ☐ `update(Long id, TicketRequest request)` acepta el DTO
- ☐ El `status` del update solo se aplica si `request.getStatus()` no es `null` ni blank

---

## Checklist del Controller

### Endpoints con `@Valid`

- ☐ `POST /tickets` usa `@Valid @RequestBody TicketRequest request`
- ☐ `PUT /tickets/{id}` usa `@Valid @RequestBody TicketRequest request`
- ☐ Los endpoints `GET` y `DELETE` **no** necesitan `@Valid` (no tienen body de entrada)

### `@ExceptionHandler`

- ☐ Existe un método con `@ExceptionHandler(MethodArgumentNotValidException.class)` en el controlador
- ☐ Extrae el mensaje de los `FieldErrors` con `.getBindingResult().getFieldErrors()`
- ☐ Devuelve `ResponseEntity.badRequest().body(new ErrorResponse(message))` → `400 Bad Request`
- ☐ El formato del mensaje incluye el campo y su error: `"title: El título no puede estar vacío"`

---

## Checklist de pruebas

- ☐ `POST /tickets` con `"title": ""` → `400 Bad Request` + `{"message": "title: El titulo es requerido"}`
- ☐ `POST /tickets` con `"title": "   "` → `400 Bad Request` (blanco)
- ☐ `POST /tickets` sin campo `title` → `400 Bad Request`
- ☐ `PUT /tickets/by-id/1` con `"title": ""` → `400 Bad Request`
- ☐ `POST /tickets` válido → `201 Created` + `"Ticket Creado"` (flujo feliz no se rompió)
- ☐ `GET /tickets`, `GET /tickets/by-id/1`, `DELETE /tickets/by-id/1` siguen funcionando correctamente (no se rompió nada)

---

## Errores comunes a evitar

| Error | Por qué está mal | Cómo corregirlo |
|---|---|---|
| Olvidar `@Valid` en el parámetro del controller | Las anotaciones del DTO nunca se evalúan | Agregar `@Valid` antes de `@RequestBody TicketRequest` |
| Olvidar la dependencia `spring-boot-starter-validation` | `@NotBlank` compila pero no hace nada | Agregar la dependencia al `pom.xml` |
| Poner `@NotBlank` en el modelo `Ticket` | Aplica en todos los contextos, no solo en la entrada de la API | Poner las validaciones en el DTO |
| No agregar `@ExceptionHandler` | Spring devuelve su propio error en un formato diferente al `ErrorResponse` | Agregar el handler en el controller |
| Usar `ticket.setStatus(request.getStatus())` en `create()` | El cliente puede establecer el status inicial del ticket | El Service siempre asigna `"NEW"` independientemente del request |
| No tener `@NoArgsConstructor` en el DTO | Jackson no puede deserializar el JSON | Agregar `@NoArgsConstructor` con Lombok |




<!-- START OF FILE: docs_lessons_08-dto_05_actividad_individual.md -->
# Documento: docs lessons 08-dto 05 actividad individual
---
# Lección 08 - Actividad individual: DTO y validación para categorías

## Contexto

Tu `CategoryController` actualmente recibe `@RequestBody Category` directamente. Esto tiene los mismos problemas que tuvo `TicketController` antes de esta lección: el cliente puede enviar campos que no le corresponden, y no hay validación automática.

---

## ¿Qué vas a construir?

Vas a crear un DTO de entrada para categorías y agregar validación, siguiendo el mismo patrón que usaste con `TicketRequest`.

---

## Paso 1: crear `CategoryRequest`

Crea el archivo `dto/CategoryRequest.java`:

| Campo | Tipo | Validación |
|---|---|---|
| `name` | `String` | `@NotBlank(message = "El nombre no puede estar vacío")` |
| `description` | `String` | Sin validación obligatoria |

```java
package cl.duoc.fullstack.tickets.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {

    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    private String description;
}
```

---

## Paso 2: actualizar `CategoryService`

Modifica los métodos `create()` y `update()` para que acepten `CategoryRequest` en lugar de `Category`:

```java
public Category create(CategoryRequest request) {
    if (this.repository.existsByName(request.getName())) {
        throw new IllegalArgumentException(
            "Ya existe una categoría con el nombre '" + request.getName() + "'");
    }
    Category category = new Category();
    category.setName(request.getName());
    category.setDescription(request.getDescription());
    return this.repository.save(category);
}

public Optional<Category> update(Long id, CategoryRequest request) {
    return this.repository.update(id, request);
}
```

---

## Paso 3: actualizar `CategoryRepository.update()`

```java
public Optional<Category> update(Long id, CategoryRequest request) {
    Optional<Category> found = findById(id);
    found.ifPresent(category -> {
        category.setName(request.getName());
        category.setDescription(request.getDescription());
    });
    return found;
}
```

---

## Paso 4: actualizar `CategoryController`

```java
@PostMapping
public ResponseEntity<?> create(@Valid @RequestBody CategoryRequest request) {
    try {
        Category saved = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(new ErrorResponse(e.getMessage()));
    }
}

@PutMapping("/{id}")
public ResponseEntity<?> update(@PathVariable Long id,
                                @Valid @RequestBody CategoryRequest request) {
    return service.update(id, request)
        .<ResponseEntity<?>>map(ResponseEntity::ok)
        .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse("Categoría con ID " + id + " no encontrada")));
}

@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException e) {
    String message = e.getBindingResult().getFieldErrors().stream()
        .map(err -> err.getField() + ": " + err.getDefaultMessage())
        .collect(java.util.stream.Collectors.joining(", "));
    return ResponseEntity.badRequest().body(new ErrorResponse(message));
}
```

---

## Pruebas requeridas

| Prueba | Resultado esperado |
|---|---|
| `POST /categories` con `"name": ""` | `400 Bad Request` + `{"message": "name: El nombre no puede estar vacío"}` |
| `POST /categories` con `"name": "   "` | `400 Bad Request` |
| `POST /categories` con nombre válido | `201 Created` con categoría |
| `POST /categories` con nombre duplicado | `409 Conflict` + `{"message": "..."}` |
| `PUT /categories/1` con `"name": ""` | `400 Bad Request` |
| `PUT /categories/999` | `404 Not Found` + `{"message": "..."}` |
| `GET /categories` | `200 OK` (no se rompió) |

---

## Desafío opcional

Agrega validación de longitud mínima en el nombre:

```java
@NotBlank(message = "El nombre no puede estar vacío")
@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
private String name;
```

Prueba con `"name": "AB"` y verifica que el mensaje de error refleja la nueva validación.

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| `CategoryRequest` en paquete `dto` con `@NotBlank` en `name` | 25% |
| `CategoryService.create()` y `update()` aceptan `CategoryRequest` y construyen `Category` internamente | 25% |
| `@Valid` en los endpoints `POST` y `PUT` del controller | 20% |
| `@ExceptionHandler` en `CategoryController` devuelve `ErrorResponse` con `400` | 20% |
| El cliente no puede fijar campos como `id` desde el body | 10% |




<!-- START OF FILE: docs_lessons_09-map-repository_01_objetivo_y_alcance.md -->
# Documento: docs lessons 09-map-repository 01 objetivo y alcance
---
# Lección 09 - Repository con Map: ¿qué vas a aprender?

## ¿De dónde venimos?

En la lección anterior separaste la entrada de la API del modelo de dominio con `TicketRequest`, y agregaste validación automática con `@NotBlank` y `@Valid`. Tu API ahora:

- Rechaza datos inválidos antes de llegar al Service
- Devuelve errores estructurados en todos los casos
- Protege los campos del modelo que el cliente no debería controlar

Todo eso funciona sobre un `Repository` que guarda tickets en una `List<Ticket>`. Y ahí está el próximo problema.

---

## El problema con la `List`

Cuando buscas un ticket por ID con la implementación actual, el Repository recorre **todos los tickets** uno por uno hasta encontrar el que coincide:

```java
// Con List: O(n) — en el peor caso recorre toda la lista
public Optional<Ticket> findById(Long id) {
    return tickets.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst();
}
```

Si tienes 10 tickets, recorre hasta 10. Si tienes 10.000, recorre hasta 10.000. El tiempo de búsqueda crece de forma **lineal** con la cantidad de datos: eso se llama complejidad O(n).

Para una API de soporte técnico pequeña, esto no es un problema. Pero el patrón importa: aprenderlo mal ahora crea hábitos malos para cuando trabajen con bases de datos reales.

Hay una estructura de datos diseñada específicamente para acceso por clave: el `HashMap`.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás:

1. Un `TicketRepository` que usa `Map<Long, Ticket>` como almacenamiento: acceso O(1) por ID
2. Todos los métodos del repository refactorizados para aprovechar el Map
3. Soporte para filtrar tickets por estado con `GET /tickets?status=NEW`
4. La lista de tickets devuelta siempre ordenada por fecha de creación

### Lo que vas a ser capaz de explicar

Al terminar deberías poder responder:

- ¿Qué significa O(n) vs O(1) en el contexto de una búsqueda?
- ¿Por qué `HashMap.get(key)` es O(1) y `List.stream().filter(...)` es O(n)?
- ¿Cómo se usa `Map<Long, Ticket>` en lugar de `List<Ticket>` para almacenar y buscar tickets?
- ¿Por qué `Optional.ofNullable(db.get(id))` es el patrón correcto para `findById`?
- ¿Cómo se agrega un parámetro de query opcional con `@RequestParam(required = false)`?

---

## ¿Qué requerimientos implementamos en esta lección?

> El proyecto completo está descrito en [`00_enunciado_proyecto.md`](../00_enunciado_proyecto.md).

| Requerimiento | Lo que construimos |
|---|---|
| **REQ-14** — Filtro por estado `?status=` | El parámetro `@RequestParam(required = false) String status` en el controlador + `getAll(String status)` en el repository |

La refactorización a `Map` no agrega un requerimiento funcional nuevo — el comportamiento de los endpoints no cambia para el cliente. Pero el código interno es más correcto, más eficiente y más cercano a cómo funciona JPA con bases de datos reales.

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | ¿Por qué lo dejamos después? |
|---|---|
| Paginación (`page`, `size`) | Requiere colecciones grandes y criterios de ordenamiento múltiples; lo abordamos con JPA |
| Filtros compuestos (estado + fecha + texto) | Complejidad adicional sin valor pedagógico adicional en esta etapa |
| Ordenamiento dinámico por campo | El orden por `createdAt` es suficiente; otros campos los manejará la base de datos |
| `ConcurrentHashMap` para concurrencia | La aplicación es de un solo hilo en esta etapa |
| JPA / `@Entity` / bases de datos reales | El siguiente gran paso; este Map es el puente conceptual |

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← getAllTickets() sin filtro
├── dto/
│   └── TicketRequest.java
├── model/
│   ├── Ticket.java
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java   ← usa List<Ticket>, O(n) en findById
├── service/
│   └── TicketService.java      ← getTickets() sin parámetro de filtro
└── TicketsApplication.java
```

Y la estructura que tendrás al terminar (misma, pero con comportamiento diferente internamente):

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java   ← getAllTickets(@RequestParam status)
├── dto/
│   └── TicketRequest.java
├── model/
│   ├── Ticket.java
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java   ← usa Map<Long, Ticket>, O(1) en findById + filter
├── service/
│   └── TicketService.java      ← getTickets(String status)
└── TicketsApplication.java
```




<!-- START OF FILE: docs_lessons_09-map-repository_02_guion_paso_a_paso.md -->
# Documento: docs lessons 09-map-repository 02 guion paso a paso
---
# Lección 09 - Tutorial paso a paso: Repository con Map y filtro por estado

Sigue esta guía en orden. Vas a refactorizar el almacenamiento en memoria de `List` a `Map` y agregar soporte para filtrar tickets por estado.

---

## Paso 1: entender O(n) vs O(1)

Antes de tocar código, entiende el problema que vamos a resolver.

### Complejidad O(n) — lo que tienes ahora

Con una `List`, buscar un elemento por ID requiere recorrer la lista entera en el peor caso:

```java
// O(n): si hay n tickets, en el peor caso compara n veces
public Optional<Ticket> findById(Long id) {
    return tickets.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst();
}
```

| Tickets en memoria | Comparaciones en el peor caso |
|---|---|
| 10 | 10 |
| 1.000 | 1.000 |
| 1.000.000 | 1.000.000 |

La búsqueda crece proporcionalmente con los datos.

### Complejidad O(1) — lo que vas a construir

Con un `HashMap<Long, Ticket>`, el acceso por clave es prácticamente instantáneo, sin importar cuántos elementos haya:

```java
// O(1): accede directamente por clave, sin recorrer nada
public Optional<Ticket> findById(Long id) {
    return Optional.ofNullable(db.get(id));
}
```

| Tickets en memoria | Operaciones de acceso |
|---|---|
| 10 | ~1 |
| 1.000 | ~1 |
| 1.000.000 | ~1 |

> **¿Por qué `HashMap.get()` es O(1)?**
> Un `HashMap` convierte la clave (el ID) en una posición de memoria mediante una función `hash`. Para buscar por clave, calcula el hash y va directo a esa posición — sin recorrer nada. El tiempo de acceso no depende de cuántos elementos haya en el mapa.
>
> Hay casos extremos (colisiones de hash) donde el acceso puede degradarse a O(n), pero son infrecuentes y se resuelven internamente. Para todos los efectos prácticos, `HashMap.get()` es O(1).

---

## Paso 2: refactorizar `TicketRepository` — el almacenamiento

Abre `TicketRepository` y cambia la estructura de almacenamiento.

**Antes:**

```java
List<Ticket> tickets;
long currentId = 0L;

public TicketRepository() {
    tickets = new ArrayList<>();
    tickets.add(new Ticket(currentId++, "Ticket 1", "Ticket 1", "NEW", LocalDateTime.now(), null, null, "admin", null));
    tickets.add(new Ticket(currentId++, "Ticket 2", "Ticket 2", "NEW", LocalDateTime.now(), null, null, "admin", null));
}
```

**Después:**

```java
private final Map<Long, Ticket> db = new HashMap<>();
private long currentId = 1L;

public TicketRepository() {
    LocalDateTime now = LocalDateTime.now();
    LocalDate estimated = LocalDate.now().plusDays(5);

    Ticket t1 = new Ticket(currentId, "Ticket 1", "Descripción del ticket 1", "NEW", now, estimated, null, "admin", null);
    db.put(currentId++, t1);

    Ticket t2 = new Ticket(currentId, "Ticket 2", "Descripción del ticket 2", "NEW", now, estimated, null, "admin", null);
    db.put(currentId++, t2);
    // currentId queda en 3, listo para el siguiente ticket nuevo
}
```

> **¿Por qué `currentId` empieza en `1L` y no en `0L`?**
> Los IDs que empiezan en cero son inusuales y confusos: cuando el cliente recibe `"id": 0`, puede asumir que es un estado nulo o por defecto. Empezar en `1` es el estándar: bases de datos, frameworks y APIs del mundo real usan IDs que parten desde 1.

> **¿Por qué `Map<Long, Ticket>` y no `Map<Integer, Ticket>`?**
> El campo `id` del `Ticket` es `Long`. Si usáramos `Integer`, habría que convertir constantemente entre tipos, lo que añade ruido sin valor. La clave del Map debe ser del mismo tipo que el ID del modelo.

> **¿Por qué `final` en la declaración del mapa?**
> `private final Map<Long, Ticket> db` no significa que el mapa sea inmutable — puedes seguir agregando y eliminando entradas. Significa que la referencia `db` no se puede reasignar a otro objeto. Es una buena práctica en Java: si la referencia no necesita cambiar, márcala como `final`.

---

## Paso 3: refactorizar `getAll()` y agregar `getAll(String statusFilter)`

```java
public List<Ticket> getAll() {
    return db.values().stream()
        .sorted(Comparator.comparing(Ticket::getCreatedAt))
        .toList();
}

public List<Ticket> getAll(String statusFilter) {
    if (statusFilter == null || statusFilter.isBlank()) {
        return getAll();
    }
    return db.values().stream()
        .filter(t -> t.getStatus().equalsIgnoreCase(statusFilter))
        .sorted(Comparator.comparing(Ticket::getCreatedAt))
        .toList();
}
```

**Código equivalente sin expresiones lambda:**

```java
public List<Ticket> getAll(String statusFilter) {
    List<Ticket> all = new ArrayList<>(db.values());
    all.sort(Comparator.comparing(Ticket::getCreatedAt));

    if (statusFilter == null || statusFilter.isBlank()) {
        return all;
    }

    List<Ticket> filtered = new ArrayList<>();
    for (Ticket ticket : all) {
        if (ticket.getStatus().equalsIgnoreCase(statusFilter)) {
            filtered.add(ticket);
        }
    }
    return filtered;
}
```

> **¿Por qué `equalsIgnoreCase` y no `equals`?**
> Para que `?status=new`, `?status=NEW` y `?status=New` funcionen igual. Las APIs bien diseñadas son flexibles con los parámetros de consulta: el cliente no debería tener que saber si el estado es en mayúsculas o minúsculas.

> **¿Por qué `.toList()` y no `.collect(Collectors.toList())`?**
> `.toList()` es un método disponible desde Java 16 que devuelve una lista inmodificable. Es más conciso que `collect(Collectors.toList())` y comunica la intención más claramente. La lista devuelta no necesita ser modificable: solo se usa para serializar a JSON en la respuesta.

> **¿Por qué ordenamos por `createdAt`?**
> `db.values()` devuelve los valores del mapa en un orden no garantizado (depende de la implementación interna del `HashMap`). Ordenar por `createdAt` asegura que el cliente siempre reciba los tickets en un orden consistente y predecible.

---

## Paso 4: refactorizar `findById()`

**Antes:**

```java
public Optional<Ticket> findById(Long id) {
    return tickets.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst();
}
```

**Después:**

```java
public Optional<Ticket> findById(Long id) {
    return Optional.ofNullable(db.get(id));
}
```

`db.get(id)` devuelve el `Ticket` si existe, o `null` si no. `Optional.ofNullable()` convierte ese resultado en un `Optional` — si es `null`, devuelve `Optional.empty()`.

> **¿Por qué `Optional.ofNullable()` y no `Optional.of()`?**
> `Optional.of(valor)` lanza una excepción si el valor es `null`. `Optional.ofNullable(valor)` maneja el `null` silenciosamente, devolviendo `Optional.empty()`. Como `db.get(id)` puede devolver `null` (cuando el ID no existe), debemos usar `ofNullable`.

---

## Paso 5: refactorizar `save()`

**Antes:**

```java
public Ticket save(Ticket newTicket) {
    newTicket.setId(currentId++);
    tickets.add(newTicket);
    return newTicket;
}
```

**Después:**

```java
public Ticket save(Ticket newTicket) {
    newTicket.setId(currentId);
    db.put(currentId++, newTicket);
    return newTicket;
}
```

Primero asignamos el ID al ticket (para que el objeto devuelto ya tenga su ID), luego lo guardamos en el mapa con ese mismo ID como clave, y finalmente incrementamos el contador.

---

## Paso 6: refactorizar `update()`

**Antes (con List):**

```java
public Optional<Ticket> update(Long id, TicketRequest request) {
    Optional<Ticket> found = findById(id); // O(n)
    found.ifPresent(ticket -> {
        ticket.setTitle(request.title());
        // ...
    });
    return found;
}
```

**Después (con Map):**

La lógica de actualización se mueve al `Service` (donde pertenece según CSR), y el `Repository` solo se encarga de persistir:

```java
public void update(Ticket toUpdate) {
    db.put(toUpdate.getId(), toUpdate);
}
```

> **¿Por qué la lógica de mapeo se mueve al Service?**
> En la versión anterior, el `Repository` aplicaba los campos del DTO al ticket. Eso mezclaba lógica de transformación (responsabilidad del `Service`) con lógica de persistencia (responsabilidad del `Repository`). Con el `Map`, el `Service` ya tiene el ticket (obtenido con `findById`), lo modifica, y llama a `repository.update(toUpdate)` solo para persistir.

---

## Paso 7: refactorizar `deleteById()`

**Antes:**

```java
public boolean delete(Long id) {
    return tickets.removeIf(t -> t.getId().equals(id));
}
```

**Después:**

```java
public boolean deleteById(Long id) {
    return db.remove(id) != null;
}
```

`Map.remove(key)` elimina la entrada con esa clave y devuelve el valor eliminado (el `Ticket`), o `null` si la clave no existía. Si el resultado es `!= null`, significa que se eliminó algo.

> **¿Por qué `db.remove(id) != null` y no guardar el resultado en una variable?**
> Porque solo nos interesa si se eliminó algo, no qué se eliminó. Si necesitáramos el ticket eliminado (por ejemplo, para devolverlo en la respuesta), usaríamos `Ticket removed = db.remove(id)` y luego `Optional.ofNullable(removed)`.

---

## Paso 8: actualizar `existsByTitle()`

```java
public boolean existsByTitle(String title) {
    return db.values().stream()
        .anyMatch(t -> t.getTitle().equalsIgnoreCase(title));
}
```

**Código equivalente sin expresiones lambda:**

```java
public boolean existsByTitle(String title) {
    for (Ticket ticket : db.values()) {
        if (ticket.getTitle().equalsIgnoreCase(title)) {
            return true;
        }
    }
    return false;
}
```

`existsByTitle` sigue siendo O(n) porque no hay otra forma de buscar por título sin recorrer todos los valores. Para hacerlo O(1) necesitaríamos un segundo Map<String, Ticket> indexado por título. En esta etapa, O(n) para esta búsqueda es aceptable.

---

## Paso 9: actualizar `TicketService` para pasar el filtro

Agrega el método sobrecargado en el `Service`:

```java
public List<Ticket> getTickets(String status) {
    return this.repository.getAll(status);
}
```

El `Service` delega directamente al `Repository`. No hay lógica de negocio en un simple filtro de lectura.

---

## Paso 10: actualizar `TicketController` para aceptar `?status=`

Modifica el endpoint `GET /tickets`:

**Antes:**

```java
@GetMapping
public ResponseEntity<List<Ticket>> getAllTickets() {
    return ResponseEntity.ok(service.getTickets());
}
```

**Después:**

```java
@GetMapping
public ResponseEntity<List<Ticket>> getAllTickets(
        @RequestParam(required = false) String status) {
    List<Ticket> tickets = status != null
        ? this.service.getTickets(status)
        : this.service.getTickets();
    return ResponseEntity.ok(tickets);
}
```

> **¿Qué hace `@RequestParam(required = false)`?**
> Le indica a Spring que el parámetro `status` en el query string es **opcional**. Si el cliente llama a `GET /tickets`, `status` llega como `null` y se devuelven todos los tickets. Si llama a `GET /tickets?status=NEW`, `status` llega como `"NEW"` y se filtran.
>
> Sin `required = false`, Spring lanzaría un error si el cliente no incluye el parámetro en la URL.

---

## Paso 11: verificar que todo funciona

### Prueba 1: filtrar por estado existente

```
GET http://localhost:8080/ticket-app/tickets?status=NEW
```

Resultado esperado: `200 OK` con la lista de tickets cuyo status es `NEW`, ordenados por `createdAt`.

### Prueba 2: filtrar insensible a mayúsculas

```
GET http://localhost:8080/ticket-app/tickets?status=new
```

Resultado esperado: el mismo que `?status=NEW`.

### Prueba 3: sin parámetro — todos los tickets

```
GET http://localhost:8080/ticket-app/tickets
```

Resultado esperado: `200 OK` con todos los tickets, ordenados por `createdAt`.

### Prueba 4: estado que no existe

```
GET http://localhost:8080/ticket-app/tickets?status=UNKNOWN
```

Resultado esperado: `200 OK` con lista vacía `[]`. No es un error — simplemente no hay tickets con ese estado.

### Prueba 5: operaciones CRUD siguen funcionando

Confirma que `POST`, `GET /by-id/{id}`, `PUT /by-id/{id}` y `DELETE /by-id/{id}` siguen respondiendo igual que antes. La refactorización interna no debe cambiar el comportamiento observable de la API.

---

## Paso 12: reflexiona antes de cerrar

1. ¿Qué hace `Optional.ofNullable(db.get(id))` cuando el ID no existe en el mapa? ¿Y cuando sí existe?
2. Después de llamar a `db.get(id)` y obtener un `Ticket`, ¿por qué modificar ese objeto con `ticket.setTitle(...)` también modifica lo que está guardado en el mapa?
3. Si agregas 1.000.000 de tickets al mapa, ¿cuánto tarda `findById(id)`? ¿Eso cambiaría si fuera una `List`?
4. ¿Por qué `existsByTitle()` sigue siendo O(n) incluso con el mapa? ¿Qué cambio harías para que fuera O(1)?
5. ¿Qué ventaja tiene `.toList()` sobre `.collect(Collectors.toList())`?



<!-- START OF FILE: docs_lessons_09-map-repository_03_map_vs_list_y_csr.md -->
# Documento: docs lessons 09-map-repository 03 map vs list y csr
---
# Lección 09 - Map vs List, y el refinamiento del patrón CSR

## ¿Por qué importa la estructura de datos?

El código que tu API ejecuta se puede medir en términos de eficiencia. No toda solución que "funciona" es igualmente buena: el número de operaciones que realiza importa, especialmente cuando los datos crecen.

---

## La diferencia entre List y Map

| Operación | `List<Ticket>` | `Map<Long, Ticket>` |
|---|---|---|
| Buscar por ID | O(n) — recorre hasta encontrarlo | O(1) — va directo por hash |
| Insertar | O(1) — agrega al final | O(1) — inserta por clave |
| Actualizar por ID | O(n) — primero busca, luego modifica | O(1) — `get(id)` + modificación |
| Eliminar por ID | O(n) — `removeIf` recorre la lista | O(1) — `remove(id)` |
| Recorrer todos | O(n) — inevitable | O(n) — inevitable |
| Filtrar | O(n) — inevitable | O(n) — inevitable |

La conclusión: cuando el acceso por ID es la operación más frecuente (como en un API REST con `GET /tickets/{id}`, `PUT /tickets/{id}`, `DELETE /tickets/{id}`), el `Map` gana claramente.

---

## Cómo funciona un `HashMap` internamente (simplificado)

Un `HashMap` mantiene internamente un arreglo de "cubetas" (buckets). Cuando guardas un par clave-valor:

1. Java calcula el `hashCode()` de la clave (en nuestro caso, el `Long id`)
2. Ese hash determina en qué cubeta del arreglo se almacena
3. Al buscar con `get(id)`, Java recalcula el hash y va directamente a esa cubeta

```mermaid
flowchart LR
    subgraph Mapa[HashMap]
        B0["cubeta 0<br/>[id=5 → Ticket]"]
        B1["cubeta 1<br/>[id=1 → Ticket]"]
        B2["cubeta 2<br/>[id=2 → Ticket]"]
        B3["cubeta 3<br/>(vacía)"]
    end
    get1["db.get(1L)"] -->|"hash → 1"| B1
    get2["db.get(2L)"] -->|"hash → 2"| B2
```

No hay recorrido. No hay comparaciones. Un cálculo de hash y una posición de memoria.

---

## El puente hacia JPA

Cuando en el futuro migres tu aplicación a una base de datos real con JPA, no escribirás `findById()` a mano. Spring Data JPA lo provee directamente:

```java
// Con JPA, el repositorio es solo una interfaz:
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // findById ya viene incluido → SELECT * FROM tickets WHERE id = ?
    // La base de datos tiene un índice PRIMARY KEY → O(log n) o O(1) según el motor
}
```

El Map de esta lección te enseña el **concepto** de acceso por clave que JPA aplica con índices de base de datos. El puente es directo.

---

## El patrón CSR bien aplicado: análisis del estado final

Después de las lecciones 07, 08 y 09, tu aplicación tiene una arquitectura CSR madura. Veamos qué hace cada capa y por qué:

### Controller — la capa de presentación

**Responsabilidades:**
- Recibir la petición HTTP y extraer parámetros (`@PathVariable`, `@RequestParam`, `@RequestBody`)
- Validar la entrada con `@Valid`
- Transformar el resultado del Service en una `ResponseEntity` con el código HTTP correcto
- Manejar las excepciones que el Service lanza y convertirlas en respuestas de error

**Lo que NO hace:**
- No tiene `if` de reglas de negocio ("¿el título está duplicado?")
- No accede al Repository directamente
- No construye objetos de dominio (`new Ticket()` no aparece en el Controller)

```java
// Controller limpio: solo HTTP → Service → HTTP
@PostMapping
public ResponseEntity<?> create(@Valid @RequestBody TicketRequest request) {
    try {
        return ResponseEntity.status(CREATED).body(service.create(request));
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(CONFLICT).body(new ErrorResponse(e.getMessage()));
    }
}
```

### Service — la capa de negocio

**Responsabilidades:**
- Aplicar las reglas de negocio (no duplicar títulos, asignar estado inicial, calcular fechas)
- Coordinar entre Repository y otras fuentes de datos si las hay
- Decidir qué datos construye el servidor vs qué llega del cliente
- Lanzar excepciones con mensajes claros cuando algo viola una regla

**Lo que NO hace:**
- No sabe que existe HTTP (no usa `HttpStatus`, no maneja `ResponseEntity`)
- No construye respuestas JSON
- No accede a la base de datos directamente

```java
// Service: solo lógica de negocio
public Ticket create(TicketRequest request) {
    if (repository.existsByTitle(request.getTitle())) {
        throw new IllegalArgumentException("Ya existe un ticket con el título '" + request.getTitle() + "'");
    }
    Ticket ticket = new Ticket();
    ticket.setTitle(request.getTitle());
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    return repository.save(ticket);
}
```

### Repository — la capa de datos

**Responsabilidades:**
- Almacenar y recuperar datos
- Proveer operaciones básicas de acceso: `save`, `findById`, `getAll`, `update`, `delete`
- Implementar la estrategia de acceso más eficiente para cada operación

**Lo que NO hace:**
- No tiene reglas de negocio ("no duplicados" no va aquí)
- No sabe que existe HTTP
- No decide qué campos asigna el servidor (eso es el Service)

```java
// Repository: solo gestión del almacenamiento
public Optional<Ticket> findById(Long id) {
    return Optional.ofNullable(db.get(id)); // O(1), sin lógica de negocio
}
```

---

## Señales de que algo está en la capa equivocada

| Si ves esto... | Está en la capa equivocada | Debería estar en... |
|---|---|---|
| `if (ticket.getTitle() == null)` en el Controller | Controller | Service o DTO (@NotBlank) |
| `HttpStatus.CONFLICT` en el Service | Service | Controller |
| `db.get(id)` directamente en el Controller | Controller | Repository |
| `LocalDateTime.now()` en el Repository | Repository | Service |
| `new Ticket()` en el Controller | Controller | Service |
| `throw new IllegalArgumentException` en el Repository (por regla de negocio) | Repository | Service |

---

## El flujo completo de una petición `POST /tickets` con todo lo aprendido

```mermaid
sequenceDiagram
    participant Client as Cliente
    participant Ctrl as TicketController
    participant Svc as TicketService
    participant Repo as TicketRepository
    
    Client->>Ctrl: POST /tickets {"title": "Bug en login", "description": "..."}
    
    rect rgb(240, 248, 255)
        Note over Ctrl: @Valid valida title no vacío
        alt título vacío
            Ctrl-->>Client: 400 Bad Request + ErrorResponse
        end
    end
    
    Ctrl->>Svc: create(TicketRequest)
    
    rect rgb(255, 240, 240)
        Note over Svc: ¿Ya existe el título?
        alt título duplicado
            Svc-->>Ctrl: throw IllegalArgumentException
            Ctrl-->>Client: 409 Conflict + ErrorResponse
        end
    end
    
    Svc-->>Repo: save(Ticket)<br/>Asigna id (currentId++)
    Repo-->>Svc: Ticket guardado
    
    Svc-->>Ctrl: Ticket
    Ctrl-->>Client: 201 Created + JSON {"id":3,"title":"Bug en login","status":"NEW","createdAt":"..."}
```

Cada capa hace exactamente lo que le corresponde. Ninguna hace más.




<!-- START OF FILE: docs_lessons_09-map-repository_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 09-map-repository 04 checklist rubrica minima
---
# Lección 09 - Checklist y rúbrica mínima

Usa esta lista para verificar que implementaste correctamente el Repository con Map y el filtro por estado antes de dar la lección por terminada.

---

## Checklist del `TicketRepository`

### Almacenamiento

- ☐ El campo de almacenamiento es `Map<Long, Ticket> db = new HashMap<>()`
- ☐ **No existe** `List<Ticket> tickets` (fue reemplazada)
- ☐ `currentId` empieza en `1L`
- ☐ Los datos semilla tienen IDs `1` y `2` con descripciones y `estimatedResolutionDate` correctos

### Método `getAll()`

- ☐ Devuelve `new ArrayList<>(db.values())` ordenado por `createdAt`
- ☐ No devuelve `db.values()` directamente (esa es una vista no ordenable)

### Método `getAll(String statusFilter)` (sobrecarga)

- ☐ Si `statusFilter` es `null` o blank, devuelve todos los tickets ordenados
- ☐ Si `statusFilter` tiene valor, filtra usando `equalsIgnoreCase`
- ☐ La lista resultante está ordenada por `createdAt` antes de filtrar

### Método `findById(Long id)`

- ☐ Usa `Optional.ofNullable(db.get(id))`
- ☐ **No** usa `stream().filter()` (eso era la versión List con O(n))
- ☐ El acceso es O(1)

### Método `save(Ticket ticket)`

- ☐ Asigna `ticket.setId(currentId)` **antes** de guardarlo
- ☐ Usa `db.put(currentId++, ticket)`
- ☐ Devuelve el `ticket` con el ID ya asignado

### Método `update(Long id, TicketRequest request)`

- ☐ Llama a `findById(id)` que ahora es O(1)
- ☐ Usa `found.ifPresent(ticket -> {...})` para modificar
- ☐ El `status` solo se actualiza si `request.getStatus()` no es null ni blank
- ☐ **No** necesita `db.put()` al final (el objeto se modifica por referencia)

### Método `delete(Long id)`

- ☐ Usa `db.remove(id) != null`
- ☐ **No** usa `removeIf` (eso era la versión List)
- ☐ Devuelve `true` si se eliminó, `false` si no existía

### Método `existsByTitle(String title)`

- ☐ Usa `db.values().stream().anyMatch(t -> t.getTitle().equalsIgnoreCase(title))`
- ☐ Se acepta que sea O(n) (no hay índice por título)

---

## Checklist del `TicketService`

- ☐ Tiene `getTickets()` sin parámetro que llama a `repository.getAll()`
- ☐ Tiene `getTickets(String status)` que llama a `repository.getAll(status)`
- ☐ El resto de los métodos (`findById`, `create`, `update`, `delete`) no cambian su firma

---

## Checklist del `TicketController`

- ☐ `getAllTickets(@RequestParam(required = false) String status)` — el parámetro `required = false` está presente
- ☐ Llama a `service.getTickets(status)`, no a `service.getTickets()` (sin parámetro)
- ☐ Los demás endpoints no cambian

---

## Checklist de pruebas

- ☐ `GET /tickets` (sin parámetro) → `200 OK` con todos los tickets, ordenados por `createdAt`
- ☐ `GET /tickets?status=NEW` → `200 OK` con solo los tickets en estado `NEW`
- ☐ `GET /tickets?status=new` (minúsculas) → mismo resultado que `?status=NEW`
- ☐ `GET /tickets?status=RESOLVED` cuando no hay tickets resueltos → `200 OK` con `[]`
- ☐ `GET /tickets/by-id/1` → `200 OK` + ticket 1 (findById O(1) funciona)
- ☐ `GET /tickets/by-id/999` → `404 Not Found`
- ☐ `POST /tickets` + `PUT /tickets/by-id/{id}` + `DELETE /tickets/by-id/{id}` siguen funcionando igual
- ☐ `POST /tickets` con título vacío → `400 Bad Request` (validaciones de lección 08 no se rompieron)
- ☐ `POST /tickets` con título duplicado → `409 Conflict` (errores de lección 07 no se rompieron)

---

## Errores comunes a evitar

| Error | Por qué está mal | Cómo corregirlo |
|---|---|---|
| Devolver `db.values()` directamente en `getAll()` | La colección no tiene orden garantizado y no es modificable | Convertir a `new ArrayList<>(db.values())` antes de ordenar |
| Olvidar `required = false` en `@RequestParam` | Spring lanza error si el cliente no manda el parámetro | Agregar `@RequestParam(required = false)` |
| `currentId` empieza en `0L` | IDs que parten de cero son confusos y atípicos | Inicializar en `1L` |
| `db.put(currentId++, ticket)` sin setear el ID al ticket primero | El ticket devuelto tendrá `id = null` | `ticket.setId(currentId); db.put(currentId++, ticket)` |
| `db.get(id)` sin `Optional.ofNullable()` | Si el ID no existe, devuelve `null` — riesgo de NullPointerException | Usar `Optional.ofNullable(db.get(id))` |
| Dejar `List<Ticket>` junto con `Map<Long, Ticket>` | Doble almacenamiento, inconsistencia de datos | Eliminar completamente la List |




<!-- START OF FILE: docs_lessons_09-map-repository_05_actividad_individual.md -->
# Documento: docs lessons 09-map-repository 05 actividad individual
---
# Lección 09 - Actividad individual: Map y filtro en categorías

## Contexto

Tu `CategoryRepository` todavía usa `List<Category>`. Esta actividad aplica el mismo patrón de refactorización que usaste con `TicketRepository`.

Adicionalmente, vas a agregar un filtro de búsqueda por nombre al endpoint `GET /categories`.

---

## Parte 1: refactorizar `CategoryRepository` a Map

### Qué debes cambiar

1. **Almacenamiento:** de `List<Category>` a `Map<Long, Category> db = new HashMap<>()`
2. **`currentId`:** empieza en `1L`
3. **Constructor:** datos semilla con `db.put(currentId++, category)`
4. **`getAll()`:** devuelve `new ArrayList<>(db.values())` ordenado por `name`
5. **`findById(Long id)`:** `Optional.ofNullable(db.get(id))`
6. **`save(Category category)`:** `category.setId(currentId); db.put(currentId++, category); return category`
7. **`update(Long id, CategoryRequest request)`:** `findById(id)` (ahora O(1)) + `ifPresent`
8. **`delete(Long id)`:** `db.remove(id) != null`

### Código de referencia

```java
@Repository
public class CategoryRepository {

    private Map<Long, Category> db = new HashMap<>();
    private long currentId = 1L;

    public CategoryRepository() {
        Category c1 = new Category(currentId, "Hardware", "Problemas con equipos físicos");
        db.put(currentId++, c1);

        Category c2 = new Category(currentId, "Software", "Problemas con aplicaciones");
        db.put(currentId++, c2);
    }

    public List<Category> getAll() {
        List<Category> all = new ArrayList<>(db.values());
        all.sort(Comparator.comparing(Category::getName));
        return all;
    }

    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(db.get(id));
    }

    public boolean existsByName(String name) {
        return db.values().stream()
            .anyMatch(c -> c.getName().equalsIgnoreCase(name));
    }

    public Category save(Category category) {
        category.setId(currentId);
        db.put(currentId++, category);
        return category;
    }

    public Optional<Category> update(Long id, CategoryRequest request) {
        Optional<Category> found = findById(id);
        found.ifPresent(category -> {
            category.setName(request.getName());
            category.setDescription(request.getDescription());
        });
        return found;
    }

    public boolean delete(Long id) {
        return db.remove(id) != null;
    }
}
```

---

## Parte 2: agregar filtro por nombre en `GET /categories`

A diferencia de `Ticket` (donde filtramos por estado), en categorías el filtro útil es por **nombre parcial**: encontrar categorías cuyo nombre contenga una palabra clave.

### Lo que vas a implementar

```
GET /categories?name=hard  → devuelve categorías cuyo nombre contiene "hard" (insensible a mayúsculas)
GET /categories             → devuelve todas las categorías
```

### Cambios en `CategoryRepository`

Agrega el método sobrecargado:

```java
public List<Category> getAll(String nameFilter) {
    List<Category> all = new ArrayList<>(db.values());
    all.sort(Comparator.comparing(Category::getName));
    if (nameFilter != null && !nameFilter.isBlank()) {
        return all.stream()
            .filter(c -> c.getName().toLowerCase().contains(nameFilter.toLowerCase()))
            .collect(Collectors.toList());
    }
    return all;
}
```

### Cambios en `CategoryService`

```java
public List<Category> getCategories() {
    return repository.getAll();
}

public List<Category> getCategories(String name) {
    return repository.getAll(name);
}
```

### Cambios en `CategoryController`

```java
@GetMapping
public ResponseEntity<List<Category>> getAllCategories(
        @RequestParam(required = false) String name) {
    return ResponseEntity.ok(service.getCategories(name));
}
```

---

## Pruebas requeridas

| Prueba | Resultado esperado |
|---|---|
| `GET /categories` | `200 OK` con todas las categorías, ordenadas por nombre |
| `GET /categories?name=hard` | Solo categorías con "hard" en el nombre |
| `GET /categories?name=HARD` | Mismo resultado (insensible a mayúsculas) |
| `GET /categories?name=xyz` | `200 OK` con `[]` |
| `GET /categories/1` | `200 OK` con la categoría (findById O(1)) |
| `GET /categories/999` | `404 Not Found` + `{"message": "..."}` |
| `DELETE /categories/1` | `204 No Content` |
| `DELETE /categories/999` | `404 Not Found` + `{"message": "..."}` |

---

## Desafío opcional

Agrega un segundo parámetro de filtro: `?hasDescription=true` devuelve solo categorías que tienen una descripción no vacía, `?hasDescription=false` devuelve las que tienen descripción vacía o nula.

```
GET /categories?hasDescription=true
```

Implementa la lógica en `CategoryRepository.getAll(String nameFilter, Boolean hasDescription)`.

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| `CategoryRepository` usa `Map<Long, Category>` correctamente (findById, save, update, delete O(1)) | 35% |
| `GET /categories?name=` filtra por nombre parcial insensible a mayúsculas | 25% |
| `GET /categories` sin parámetro sigue devolviendo todas ordenadas | 20% |
| Los errores 404 y 409 siguen devolviendo `ErrorResponse` correctamente | 10% |
| Las validaciones de `CategoryRequest` siguen funcionando (`@NotBlank`) | 10% |




<!-- START OF FILE: docs_lessons_10-jpa-intro_01_objetivo_y_alcance.md -->
# Documento: docs lessons 10-jpa-intro 01 objetivo y alcance
---
# Lección 10 — JPA y ORM: del Map a la base de datos

## ¿De dónde venimos?

En la lección 09 refactorizaste el repositorio para usar `Map<Long, Ticket>` con acceso O(1). Tu API:

- Almacena tickets en memoria con búsqueda eficiente por clave
- Filtra por estado con `?status=`
- Sigue el patrón CSR con responsabilidades bien delimitadas

Pero hay un problema crítico: **cuando la aplicación se reinicia, todos los datos desaparecen**. El `HashMap` vive en la memoria del proceso y muere con él.

Para que los datos sobrevivan reinicios necesitas una base de datos real. Eso es exactamente lo que esta lección resuelve.

---

## ¿Qué es JPA y qué problema resuelve?

**JPA** (Jakarta Persistence API) es la especificación de Java para mapear objetos a tablas de base de datos.

**Hibernate** es la implementación más usada de JPA. Spring Boot lo incluye automáticamente cuando agregas la dependencia correspondiente.

El problema que resuelve se llama "desajuste de impedancia": el código Java trabaja con **objetos**, las bases de datos almacenan **filas en tablas**. JPA actúa como **traductor automático**:

```mermaid
flowchart LR
    subgraph java["☕ Java (objeto)"]
        j1["clase Ticket"]
        j2["campo title"]
        j3["repository.save(t)"]
        j4["repository.findById(1)"]
    end
    subgraph db["🗄️ Base de datos (tabla)"]
        d1["tabla tickets"]
        d2["columna title VARCHAR(50)"]
        d3["INSERT → nueva fila en disco"]
        d4["SELECT → fila recuperada"]
    end

    j1 -->|"CREATE TABLE"| d1
    j2 -->|"columna"| d2
    j3 -->|"INSERT INTO tickets"| d3
    j4 -->|"SELECT WHERE id=?"| d4
```

No escribes SQL. JPA lo genera por ti según las anotaciones que agregas a tus clases.

---

## ¿Por qué no retornar entidades directamente?

En una aplicación con capas (Controller → Service → Repository → Model), existe una regla de oro: **nunca exponer entidades JPA fuera del Service**.

```mermaid
flowchart TD
    Cliente(["👤 Cliente"])
    Controller["🌐 Controller"]
    Service["⚙️ Service"]
    Repository["📦 Repository"]
    Entity["🏷️ Entidad JPA\n@Entity"]
    DB[("🗄️ Base de datos")]

    Cliente -->|"TicketRequest"| Controller
    Controller -->|"TicketCommand"| Service
    Service -->|"usa"| Repository
    Repository <-->|"mapea"| Entity
    Repository <-->|"SQL"| DB
    Service -->|"TicketResult"| Controller
    Controller -->|"TicketResponse"| Cliente
```

**¿Por qué?**

| Problema | Solución |
|----------|----------|
| Ciclos en JSON (A→B→A) | DTOs rompemos la cadena |
| Datos sensibles expuestos | DTO filtra qué se retorna |
| Acoplamiento con BD | La entidad solo existe en repository |
| Cambios en BD rompen API | DTOs son contracts estables |

---

## DTOs: los cuatro roles del flujo de datos

Para resolver esto, usamos **DTOs** (Data Transfer Objects). En una API con JPA hay cuatro roles bien diferenciados:

| DTO | Nombre | Dirección | Quién lo usa |
|-----|--------|-----------|--------------|
| `*Request` | Input HTTP | Cliente → Controller | Controller: valida con `@Valid` |
| `*Command` | Input Service | Controller → Service | Service: recibe para operar |
| `*Result` | Output Service | Service → Controller | Service: retorna datos planos |
| `*Response` | Output HTTP | Controller → Cliente | Controller: serializa a JSON |

```mermaid
sequenceDiagram
    participant C as 👤 Cliente
    participant Ctrl as 🌐 Controller
    participant Svc as ⚙️ TicketService

    C->>Ctrl: TicketRequest (HTTP body · @Valid)
    Note over Ctrl: toCommand()
    Ctrl->>Svc: TicketCommand
    Note over Svc: lógica de negocio + JPA
    Svc-->>Ctrl: TicketResult
    Note over Ctrl: toResponse()
    Ctrl-->>C: TicketResponse (JSON)
```

| Capa | Input | Output |
|------|-------|--------|
| Controller | Recibe `*Request` del cliente | Retorna `*Response` al cliente |
| Service | Recibe `*Command` | Retorna `*Result` |
| Repository | Entidad JPA | Entidad JPA |

**Regla:**
- Cliente → Controller: `*Request`
- Controller → Service: `*Command`
- Service → Controller: `*Result`
- Controller → Cliente: `*Response`

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás:

1. La dependencia `spring-boot-starter-data-jpa` agregada al `pom.xml`
2. La clase `Ticket` anotada como entidad JPA (`@Entity`, `@Id`, `@GeneratedValue`, `@Column`)
3. `TicketRepository` convertido de **clase** a **interfaz** que extiende `JpaRepository`
4. `TicketService` actualizado para usar los métodos que Spring Data JPA provee automáticamente
5. La aplicación funcionando con base de datos H2 (en memoria)
6. DTOs bien estructurados: `TicketCommand` (input al Service), `TicketResult` (output del Service) y `TicketResponse` (output HTTP)
7. Un `DataInitializer` que siembra tickets iniciales usando JPA al arrancar la aplicación

### Lo que vas a poder explicar

- ¿Qué hace `@Entity` en una clase?
- ¿Qué es `@Id` y por qué no puede faltar en una entidad?
- ¿Qué genera `@GeneratedValue(strategy = GenerationType.IDENTITY)`?
- ¿Qué métodos vienen incluidos en `JpaRepository<Ticket, Long>`?
- ¿Por qué el repositorio ahora es una **interfaz** y no una clase?
- ¿Por qué no retornar entidades JPA directamente?
- ¿Cuál es la diferencia entre `*Command`, `*Result` y `*Response`?

---

## Nuevo requerimiento

| Requerimiento | Descripción |
|---|---|
| **REQ-15** | Los tickets deben persistirse en base de datos real: los datos sobreviven reinicios de la aplicación |

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── controller/
│   └── TicketController.java
├── dto/
│   └── TicketRequest.java
├── model/
│   ├── Ticket.java              ← POJO Lombok, sin anotaciones JPA
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java   ← clase con Map<Long, Ticket>
├── service/
│   └── TicketService.java
└── TicketsApplication.java
```

La estructura al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── config/
│   └── DataInitializer.java    ← siembra datos iniciales con JPA
├── controller/
│   └── TicketController.java   ← recibe Request, retorna Response
├── dto/
│   ├── TicketCommand.java      ← input al Service
│   ├── TicketRequest.java      ← input HTTP (sin cambios, @Valid)
│   ├── TicketResponse.java     ← output HTTP al cliente
│   └── TicketResult.java       ← output del Service
├── model/
│   ├── Ticket.java             ← @Entity, solo vive en repository
│   └── ErrorResponse.java
├── respository/
│   └── TicketRepository.java   ← interfaz JpaRepository
├── service/
│   └── TicketService.java      ← recibe Command, retorna Result
└── TicketsApplication.java
```

---

## ¿Qué NO cubre esta lección?

| Tema | ¿Cuándo se ve? |
|---|---|
| MySQL (XAMPP) | Lección 11 |
| Configurar Supabase (PostgreSQL en la nube) | Lección 11 |
| Relaciones entre tablas (`@ManyToOne`, `@OneToMany`) | Lección 12 |
| Tabla de historial de cambios | Lección 13 |
| Paginación (`Pageable`) | Fuera del alcance del curso |
| JPQL para consultas complejas (subconsultas, JOINs, agregaciones) | Fuera del alcance del curso |
| `@Modifying` + `@Query` para bulk update/delete básico | **Sí se ve** — en `03_jpa_y_orm.md` |



<!-- START OF FILE: docs_lessons_10-jpa-intro_02_guion_paso_a_paso.md -->
# Documento: docs lessons 10-jpa-intro 02 guion paso a paso
---
# Lección 10 — Tutorial paso a paso: migrar a JPA con H2

Sigue esta guía en orden. Al finalizar, tu aplicación guardará los tickets en una base de datos H2 (en memoria para desarrollo) en lugar de un `HashMap` en memoria.

---

## Paso 1: agregar las dependencias en `pom.xml`

Abre `pom.xml` y agrega dentro de `<dependencies>`:

```xml
<!-- Spring Data JPA: incluye Hibernate como implementación -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- Driver H2 (base de datos en memoria) -->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

> **¿Por qué H2?**
> H2 es una base de datos en memoria escrita en Java. No requiere instalación externa, es ideales para desarrollo y testing. Los datos se pierden al cerrar la aplicación (a menos que uses modo archivo).

---

## Paso 2: configurar `application.yml`

Reemplaza el contenido de `src/main/resources/application.yml`:

```yaml
spring:
  application:
    name: Tickets

  datasource:
    url: jdbc:h2:mem:tickets_db
    driver-class-name: org.h2.Driver
    username: sa
    password:

  h2:
    console:
      enabled: true
      path: /h2-console

  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
    properties:
      hibernate:
        format_sql: true

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"
```

> **¿Qué es `ddl-auto: create-drop`?**
> - `create`: crea las tablas al iniciar
> - `drop`: las borra al cerrar
> Es útil para desarrollo. Los datos no persisten entre ejecuciones (se pierden al cerrar la app).
>
> Para datos persistentes usa `jdbc:h2:file:./data/tickets_db`

> **¿Para qué sirve la consola H2?**
> Accede en `http://localhost:8080/ticket-app/h2-console` para ver la base de datos desde el navegador.Útil para debugging.

---

## Paso 3: anotar `Ticket` como entidad JPA

Abre `Ticket.java` y modifícala así:

```java
package cl.duoc.fullstack.tickets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "El titulo es requerido")
  @Size(max = 50)
  @Column(nullable = false, length = 50)
  private String title;

  @NotBlank
  @Column(nullable = false, columnDefinition = "TEXT")
  private String description;

  @Column(nullable = false, length = 20)
  private String status;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "estimated_resolution_date")
  private LocalDate estimatedResolutionDate;

  @Column(name = "effective_resolution_date")
  private LocalDateTime effectiveResolutionDate;
}
```

**Cambios respecto a la versión anterior:**

| Qué cambió | Por qué |
|---|---|
| Se eliminó `@Min(5) @Max(100)` del id | El id lo asigna la base de datos; no tiene sentido validar su valor antes de guardarlo |
| Se agregó `@Entity` | Le dice a JPA "esta clase es una tabla" |
| Se agregó `@Table(name = "tickets")` | Define el nombre exacto de la tabla en la base de datos |
| Se agregó `@Id` | Marca cuál campo es la clave primaria |
| Se agregó `@GeneratedValue(strategy = GenerationType.IDENTITY)` | La base de datos genera el ID automáticamente (AUTO_INCREMENT en MySQL) |
| Se agregaron `@Column(...)` | Personalizan las columnas: nombre, si acepta nulo, longitud máxima |

> **¿Por qué `@NoArgsConstructor` es obligatorio con JPA?**
> Hibernate necesita crear instancias de la entidad usando el constructor sin argumentos para poder poblarla con los datos de la base de datos. Sin `@NoArgsConstructor`, JPA lanzará un error al arrancar.

---

## Paso 4: crear los DTOs del flujo de datos

En esta lección el Controller ya no pasa `TicketRequest` directamente al Service ni el Service retorna entidades JPA. Necesitas tres nuevas clases en el paquete `dto/`.

### `TicketCommand.java` — input del Service

```java
package cl.duoc.fullstack.tickets.dto;

import java.time.LocalDateTime;

public record TicketCommand(
    String title,
    String description,
    String status,
    LocalDateTime effectiveResolutionDate
) {}
```

### `TicketResult.java` — output del Service

```java
package cl.duoc.fullstack.tickets.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TicketResult(
    Long id,
    String title,
    String description,
    String status,
    LocalDateTime createdAt,
    LocalDate estimatedResolutionDate,
    LocalDateTime effectiveResolutionDate
) {}
```

### `TicketResponse.java` — output HTTP al cliente

```java
package cl.duoc.fullstack.tickets.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TicketResponse(
    Long id,
    String title,
    String description,
    String status,
    LocalDateTime createdAt,
    LocalDate estimatedResolutionDate,
    LocalDateTime effectiveResolutionDate
) {}
```

> **¿Por qué `TicketResult` y `TicketResponse` son iguales aquí?**
> En esta lección sí son iguales porque `Ticket` aún no tiene relaciones JPA. Cuando en L12 agregues `User` como relación, `TicketResult` expondrá el nombre del usuario como `String` mientras que `TicketResponse` puede formatear o agregar campos calculados. Tenerlos separados desde ahora evita romper la API cuando ocurra ese cambio.

---

## Paso 5: convertir `TicketRepository` a interfaz

Reemplaza completamente el contenido de `TicketRepository.java`:

```java
package cl.duoc.fullstack.tickets.respository;

import cl.duoc.fullstack.tickets.model.Ticket;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

  // Spring Data JPA genera el SQL automáticamente a partir del nombre del método
  boolean existsByTitleIgnoreCase(String title);

  List<Ticket> findByStatusIgnoreCase(String status);

  List<Ticket> findAllByOrderByCreatedAtAsc();
}
```

> **¿Por qué ahora es una interfaz y no una clase?**
> Spring Data JPA genera en tiempo de ejecución una implementación completa de esta interfaz. Tú defines **qué** quieres hacer (los métodos), Spring Data JPA decide **cómo** hacerlo (el SQL). No necesitas escribir ni una línea de acceso a datos.

> **¿De dónde vienen los métodos `findById`, `save`, `deleteById`, `existsById`?**
> Los hereda `JpaRepository<Ticket, Long>`. El primer tipo (`Ticket`) es la entidad; el segundo (`Long`) es el tipo del ID. Todos estos métodos ya vienen implementados.

> **¿Cómo sabe Spring Data que `findByStatusIgnoreCase` busca por el campo `status`?**
> Interpreta el nombre del método: `findBy` + `Status` (campo) + `IgnoreCase` (modificador). Es una convención que el framework entiende y traduce a `SELECT * FROM tickets WHERE LOWER(status) = LOWER(?)`.

> **`existsByTitleIgnoreCase` vs `existsByTitle`**
> Agregar `IgnoreCase` hace la verificación de duplicados insensible a mayúsculas: "Error en login" y "ERROR EN LOGIN" se consideran el mismo título. Siempre que uses `findBy` o `existsBy`, puedes agregar `IgnoreCase` al final del campo.

---

## Paso 6: actualizar `TicketService`

Actualiza `TicketService.java` para recibir `TicketCommand`, usar los métodos de JPA y retornar `TicketResult`:

```java
package cl.duoc.fullstack.tickets.service;

import cl.duoc.fullstack.tickets.dto.TicketCommand;
import cl.duoc.fullstack.tickets.dto.TicketResult;
import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.respository.TicketRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

  private final TicketRepository repository;

  public TicketService(TicketRepository repository) {
    this.repository = repository;
  }

  public List<TicketResult> getTickets() {
    return this.repository.findAllByOrderByCreatedAtAsc().stream()
        .map(this::toResult)
        .toList();
  }

  public List<TicketResult> getTickets(String statusFilter) {
    if (statusFilter == null || statusFilter.isBlank()) {
      return getTickets();
    }
    return this.repository.findByStatusIgnoreCase(statusFilter).stream()
        .map(this::toResult)
        .toList();
  }

  public TicketResult create(TicketCommand command) {
    if (this.repository.existsByTitleIgnoreCase(command.title())) {
      throw new IllegalArgumentException(
          "Ya existe un ticket con el título: \"" + command.title() + "\"");
    }
    Ticket ticket = new Ticket();
    ticket.setTitle(command.title());
    ticket.setDescription(command.description());
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));
    Ticket saved = this.repository.save(ticket);  // ← persiste en H2
    return toResult(saved);
  }

  public Optional<TicketResult> getById(Long id) {
    return this.repository.findById(id).map(this::toResult);
  }

  public boolean deleteById(Long id) {
    if (this.repository.existsById(id)) {
      this.repository.deleteById(id);
      return true;
    }
    return false;
  }

  public Optional<TicketResult> updateById(Long id, TicketCommand command) {
    Optional<Ticket> found = this.repository.findById(id);
    if (found.isEmpty()) {
      return Optional.empty();
    }
    Ticket toUpdate = found.get();
    toUpdate.setTitle(command.title());
    toUpdate.setDescription(command.description());
    if (command.status() != null && !command.status().isBlank()) {
      toUpdate.setStatus(command.status());
    }
    toUpdate.setEffectiveResolutionDate(command.effectiveResolutionDate());
    Ticket saved = this.repository.save(toUpdate);
    return Optional.of(toResult(saved));
  }

  private TicketResult toResult(Ticket ticket) {
    return new TicketResult(
        ticket.getId(),
        ticket.getTitle(),
        ticket.getDescription(),
        ticket.getStatus(),
        ticket.getCreatedAt(),
        ticket.getEstimatedResolutionDate(),
        ticket.getEffectiveResolutionDate()
    );
  }
}
```

**Cambios clave respecto a la versión anterior:**

| Método | Antes (Map) | Ahora (JPA) |
|---|---|---|
| `getTickets` | `db.values()` + sort manual | `findAllByOrderByCreatedAtAsc()` |
| `create` | `db.put(currentId++, ticket)` | `repository.save(ticket)` |
| `getById` | `Optional.ofNullable(db.get(id))` | `repository.findById(id)` |
| `deleteById` | `db.remove(id) != null` | `existsById(id)` + `deleteById(id)` |
| `updateById` | busca + modifica en Map | `findById(id).map(...)` + `save(ticket)` |

> **¿Por qué `repository.save(ticket)` sirve tanto para crear como para actualizar?**
> `save()` revisa si el objeto tiene ID asignado:
> - Sin ID (null): ejecuta `INSERT` → crea un registro nuevo
> - Con ID: ejecuta `UPDATE` → actualiza el registro existente

---

## Paso 7: actualizar `TicketController`

El Controller convierte `TicketRequest` → `TicketCommand` antes de llamar al Service, y convierte `TicketResult` → `TicketResponse` antes de retornar al cliente:

```java
@PostMapping
public ResponseEntity<Object> create(@Valid @RequestBody TicketRequest request) {
  try {
    TicketCommand command = toCommand(request);
    TicketResult result = this.service.create(command);
    return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(result));
  } catch (IllegalArgumentException e) {
    return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(e.getMessage()));
  }
}

// Conversión Request → Command
private TicketCommand toCommand(TicketRequest request) {
  return new TicketCommand(
      request.title(),
      request.description(),
      request.status(),
      request.effectiveResolutionDate()
  );
}

// Conversión Result → Response
private TicketResponse toResponse(TicketResult result) {
  return new TicketResponse(
      result.id(),
      result.title(),
      result.description(),
      result.status(),
      result.createdAt(),
      result.estimatedResolutionDate(),
      result.effectiveResolutionDate()
  );
}
```

Los endpoints GET y PUT siguen el mismo patrón: reciben `TicketRequest`, convierten a `TicketCommand`, llaman al Service, convierten `TicketResult` a `TicketResponse`.

---

## Paso 8: sembrar datos iniciales con `DataInitializer`

Para que la aplicación arranque con tickets de ejemplo, crea la clase `DataInitializer` en el paquete `config/`:

```java
package cl.duoc.fullstack.tickets.config;

import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.respository.TicketRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

  private final TicketRepository ticketRepository;

  public DataInitializer(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    if (ticketRepository.count() == 0) {
      LocalDateTime now = LocalDateTime.now();
      LocalDate estimated = LocalDate.now().plusDays(5);

      Ticket t1 = new Ticket();
      t1.setTitle("Error en login");
      t1.setDescription("No se puede iniciar sesión con Google");
      t1.setStatus("NEW");
      t1.setCreatedAt(now);
      t1.setEstimatedResolutionDate(estimated);
      ticketRepository.save(t1);

      Ticket t2 = new Ticket();
      t2.setTitle("Mejora en dashboard");
      t2.setDescription("Agregar gráficos de estadísticas");
      t2.setStatus("IN_PROGRESS");
      t2.setCreatedAt(now);
      t2.setEstimatedResolutionDate(estimated);
      ticketRepository.save(t2);
    }
  }
}
```

> **¿Qué hace `CommandLineRunner`?**
> Es una interfaz de Spring Boot. El método `run()` se ejecuta automáticamente una vez que la aplicación arranca y el contexto está listo. Es el lugar ideal para sembrar datos iniciales.

> **¿Por qué el `if (count() == 0)`?**
> Evita duplicar los datos si usas `ddl-auto: update` (que no borra la tabla al reiniciar). Con `create-drop` no es estrictamente necesario, pero es buena práctica defensiva.

---

## Paso 9: verificar que la aplicación arranca

Ejecuta:

```bash
./mvnw spring-boot:run
```

En la consola deberías ver:

1. Mensajes de Hibernate creando la tabla:
   ```sql
   create table tickets (
       id bigint generated by default as identity,
       created_at timestamp(6),
       description text not null,
       ...
       primary key (id)
   )
   ```
2. Los `INSERT` del `DataInitializer` (gracias a `show-sql: true`)
3. El banner de la aplicación y el mensaje `Started TicketsApplication`

---

## Paso 10: probar que los datos persisten con H2

Con `ddl-auto: create-drop` los datos **no** persisten entre reinicios (H2 borra la tabla al cerrar). Esto es esperado en desarrollo.

### Consultar los tickets (datos sembrados)

```
GET http://localhost:8080/ticket-app/tickets
```

Resultado esperado: los dos tickets del `DataInitializer` aparecen en la lista.

### Crear un ticket nuevo

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Nuevo ticket de prueba",
  "description": "Verifica que JPA persiste correctamente"
}
```

Resultado esperado: `201 Created` con el ticket en el body (con `id` asignado por la base de datos).

### Ver la base de datos en el navegador

Accede a `http://localhost:8080/ticket-app/h2-console` con:
- JDBC URL: `jdbc:h2:mem:tickets_db`
- User: `sa`
- Password: (vacío)

Ejecuta `SELECT * FROM TICKETS;` para ver los datos directamente en la tabla.

---

## Paso 11: reflexiona antes de cerrar

1. ¿Qué diferencia hay entre `ddl-auto: create-drop` y `ddl-auto: update`? ¿Cuál usarías en producción?
2. Antes, `TicketRepository` era una clase con 150 líneas. Ahora es una interfaz con 3 métodos. ¿Quién escribe el código que falta?
3. ¿Qué pasa si quitas `@NoArgsConstructor` de `Ticket` y reinicias la aplicación?
4. ¿Cómo sabe Spring Data JPA que `findByStatusIgnoreCase` busca por el campo `status` y no por `title`?

---

## ¿Qué sigue?

| Lección | Contenido |
|---------|----------|
| 11 | MySQL (XAMPP) y PostgreSQL (Supabase) con perfiles |
| 12 | User entity y relaciones ManyToOne |
| 13 | TicketHistory para historial de cambios |



<!-- START OF FILE: docs_lessons_10-jpa-intro_03_jpa_y_orm.md -->
# Documento: docs lessons 10-jpa-intro 03 jpa y orm
---
# Lección 10 — JPA, ORM y anotaciones esenciales

## ¿Qué es un ORM?

**ORM** significa *Object-Relational Mapping* (Mapeo Objeto-Relacional). Es la técnica de traducir automáticamente entre dos mundos que hablan idiomas distintos:

| Mundo Java (orientado a objetos) | Mundo SQL (relacional) |
|---|---|
| Clase | Tabla |
| Objeto (instancia) | Fila |
| Campo / atributo | Columna |
| Tipo `String` | `VARCHAR` |
| Tipo `Long` | `BIGINT` |
| Tipo `LocalDateTime` | `DATETIME` |
| Referencia entre objetos (`ticket.user`) | Clave foránea (`ticket.user_id`) |

Sin ORM, escribirías SQL a mano para cada operación. Con JPA + Hibernate, describes tus clases con anotaciones y el framework genera el SQL por ti.

---

## Las anotaciones que debes conocer

### `@Entity`

```java
@Entity
public class Ticket { ... }
```

Le dice a JPA: "esta clase representa una tabla en la base de datos". Cada instancia del objeto corresponde a una fila en esa tabla.

**Regla:** toda clase anotada con `@Entity` debe tener un constructor sin argumentos (lo provee `@NoArgsConstructor` de Lombok).

---

### `@Table`

```java
@Entity
@Table(name = "tickets")
public class Ticket { ... }
```

Define el nombre exacto de la tabla en la base de datos. Si omites `@Table`, JPA usa el nombre de la clase en minúsculas (`ticket`). Es buena práctica explicitarlo siempre para evitar sorpresas.

---

### `@Id`

```java
@Id
private Long id;
```

Marca el campo que es la **clave primaria** de la tabla. Toda entidad JPA debe tener exactamente un `@Id`. Sin él, JPA lanza una excepción al arrancar.

---

### `@GeneratedValue`

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

Le dice a JPA que la base de datos genera el valor del ID automáticamente. `IDENTITY` usa el mecanismo nativo de la base de datos:

- **MySQL**: `AUTO_INCREMENT`
- **PostgreSQL**: `SERIAL` o `GENERATED ALWAYS AS IDENTITY`

Con esto, nunca asignas el ID manualmente. Cuando llamas a `repository.save(ticket)`, la base de datos asigna el próximo ID disponible y JPA lo inyecta de vuelta en el objeto.

**Estrategias disponibles:**

| Estrategia | Cómo funciona |
|---|---|
| `IDENTITY` | Usa AUTO_INCREMENT / SERIAL de la base de datos. La más simple, la más usada |
| `SEQUENCE` | Usa una secuencia de la base de datos (PostgreSQL lo soporta nativamente) |
| `AUTO` | JPA elige la estrategia según la base de datos. Menos predecible |

Para este curso, siempre usa `IDENTITY`.

---

### `@Column`

```java
@Column(name = "created_at", nullable = false, length = 50)
private String title;
```

Personaliza la columna en la base de datos. Los atributos más usados:

| Atributo | Qué hace | Valor por defecto |
|---|---|---|
| `name` | Nombre de la columna en SQL | Nombre del campo en Java |
| `nullable` | Si la columna acepta `NULL` | `true` |
| `length` | Longitud máxima para `VARCHAR` | `255` |
| `unique` | Si los valores deben ser únicos | `false` |
| `columnDefinition` | Define el tipo SQL exacto | (lo elige Hibernate) |

Si omites `@Column`, JPA crea la columna con el nombre del campo y valores por defecto.

---

## Qué viene incluido en `JpaRepository`

Cuando tu repositorio extiende `JpaRepository<Ticket, Long>`, obtienes estos métodos sin escribir nada:

| Método | SQL equivalente |
|---|---|
| `save(ticket)` | `INSERT` o `UPDATE` según si tiene ID |
| `findById(id)` | `SELECT * FROM tickets WHERE id = ?` |
| `findAll()` | `SELECT * FROM tickets` |
| `existsById(id)` | `SELECT COUNT(*) WHERE id = ?` |
| `deleteById(id)` | `DELETE FROM tickets WHERE id = ?` |
| `count()` | `SELECT COUNT(*) FROM tickets` |

Además, puedes agregar métodos propios siguiendo una convención de nombres que Spring Data interpreta automáticamente:

```java
// Spring Data genera: SELECT * FROM tickets WHERE status = ? (insensible a mayúsculas)
List<Ticket> findByStatusIgnoreCase(String status);

// Spring Data genera: SELECT COUNT(*) WHERE LOWER(title) = LOWER(?)
boolean existsByTitleIgnoreCase(String title);

// Spring Data genera: SELECT * FROM tickets ORDER BY created_at ASC
List<Ticket> findAllByOrderByCreatedAtAsc();

// Spring Data genera: SELECT * FROM tickets WHERE status = ? ORDER BY created_at DESC
List<Ticket> findByStatusOrderByCreatedAtDesc(String status);
```

La convención es: `findBy` + `NombreDeCampo` + (modificadores opcionales como `IgnoreCase`, `OrderBy`, etc.). A continuación se explica en detalle cómo funciona esta convención.

---

## Derived Query Methods — cómo Spring Data lee el nombre del método

Cuando la aplicación arranca, Spring Data escanea cada método de cada repositorio y los que no están en `JpaRepository` los pasa por un **analizador de nombres**. Este analizador descompone el nombre en partes, valida que los campos existan en la entidad y genera el SQL. Si algo no cuadra, la aplicación **no arranca** — el error aparece antes de que llegue la primera petición HTTP. Eso es una ventaja: los errores de consulta se detectan en compilación/arranque, no en producción.

### La anatomía de un nombre derivado

Un nombre de método tiene hasta cuatro partes:

```mermaid
flowchart LR
    A(["find\n① sujeto"])
    B(["All\n② alcance"])
    C(["By\n③ separador"])
    D(["Status\n④ campo"])
    E(["IgnoreCase\n⑤ modificador"])
    F(["OrderBy CreatedAt Asc\n⑥ ordenamiento"])

    A --- B --- C --- D --- E --- F
```

**`findAllByStatusIgnoreCaseOrderByCreatedAtAsc`**
→ `SELECT * FROM tickets WHERE LOWER(status) = LOWER(?) ORDER BY created_at ASC`

Cada parte es opcional excepto el sujeto y el separador `By` (cuando hay condición).

---

### ① Los sujetos — qué retorna el método

El sujeto define el tipo de operación y el tipo de retorno.

| Sujeto | Tipo de retorno | SQL generado |
|--------|----------------|--------------|
| `find...By` | `List<T>` o `Optional<T>` | `SELECT ...` |
| `read...By` | igual que `find` | alias de `find` |
| `get...By` | igual que `find` | alias de `find` |
| `count...By` | `long` | `SELECT COUNT(*)` |
| `exists...By` | `boolean` | `SELECT COUNT(*) > 0` |
| `delete...By` | `void` o `long` | `DELETE FROM ...` |

```java
List<Ticket> findByStatus(String status);         // SELECT ...
long         countByStatus(String status);        // SELECT COUNT(*)
boolean      existsByTitleIgnoreCase(String t);   // SELECT COUNT(*) > 0
long         deleteByStatus(String status);       // DELETE FROM ...
```

---

### ② El alcance (opcional) — cuántos registros

Entre el sujeto y `By` puedes agregar un alcance. El más común es nada (retorna todos los que coinciden) o `Top`/`First` para limitar:

```java
// Todos los que coinciden
List<Ticket> findByStatus(String status);

// Solo el primero (el más reciente)
Optional<Ticket> findFirstByStatusOrderByCreatedAtDesc(String status);

// Solo los 3 primeros
List<Ticket> findTop3ByStatusOrderByCreatedAtAsc(String status);
```

`Top` y `First` son equivalentes — ambos agregan `LIMIT N` al SQL. El número va pegado: `Top3`, `Top10`, `First1`.

---

### ③ El separador `By`

`By` es el pivote: todo lo que va antes define **qué** y **cuánto** retorna; todo lo que va después define el `WHERE`. Sin predicado después del `By`, Spring Data no agrega condición (equivale a `findAll()`).

```java
// sin condición — equivale a findAll() con orden
List<Ticket> findAllByOrderByCreatedAtAsc();
//           ↑ By sin campo antes del OrderBy = sin WHERE
```

---

### ④ Los campos — el nombre Java, no el SQL

El nombre del campo en el método **debe coincidir exactamente** con el nombre del campo en la clase Java (con la primera letra en mayúscula). Spring Data usa reflexión sobre la entidad para validar esto al arrancar.

```java
// Entidad: private LocalDateTime createdAt;

findAllByOrderByCreatedAtAsc()     // ✅ "createdAt" → "CreatedAt"
findAllByOrderByCreationDateAsc()  // ❌ no existe "creationDate" en Ticket
// → No property 'creationDate' found for type 'Ticket'
```

> El nombre de la **columna SQL** (`created_at`) es irrelevante aquí. Spring Data trabaja con el nombre del **campo Java** (`createdAt`).

---

### ⑤ Los modificadores de condición

Después del nombre del campo puedes agregar uno o más modificadores:

| Modificador | SQL generado | Ejemplo |
|---|---|---|
| *(ninguno)* | `= ?` | `findByStatus(String s)` |
| `IgnoreCase` | `LOWER(campo) = LOWER(?)` | `findByStatusIgnoreCase(String s)` |
| `Not` | `!= ?` | `findByStatusNot(String s)` |
| `Containing` | `LIKE '%?%'` | `findByTitleContaining(String t)` |
| `StartingWith` | `LIKE '?%'` | `findByTitleStartingWith(String t)` |
| `EndingWith` | `LIKE '%?'` | `findByTitleEndingWith(String t)` |
| `In` | `IN (?, ?, ...)` | `findByStatusIn(List<String> l)` |
| `IsNull` | `IS NULL` | `findByEffectiveResolutionDateIsNull()` |
| `IsNotNull` | `IS NOT NULL` | `findByEffectiveResolutionDateIsNotNull()` |
| `LessThan` | `< ?` | `findByCreatedAtLessThan(LocalDateTime dt)` |
| `GreaterThan` | `> ?` | `findByCreatedAtGreaterThan(LocalDateTime dt)` |
| `Between` | `BETWEEN ? AND ?` | `findByCreatedAtBetween(LocalDateTime a, LocalDateTime b)` |

Los modificadores se **apilan**: `ContainingIgnoreCase` combina `Containing` con `IgnoreCase`:

```java
// WHERE LOWER(title) LIKE LOWER('%?%')
List<Ticket> findByTitleContainingIgnoreCase(String keyword);
```

---

### Combinar condiciones: `And` y `Or`

Puedes encadenar múltiples campos con `And` u `Or`. Los parámetros del método van en el **mismo orden** que los campos en el nombre:

```java
// WHERE status = ? AND created_at > ?
List<Ticket> findByStatusAndCreatedAtGreaterThan(
    String status, LocalDateTime from);

// WHERE status = ? OR LOWER(title) LIKE LOWER('%?%')
List<Ticket> findByStatusOrTitleContainingIgnoreCase(
    String status, String keyword);

// WHERE status = ? AND effective_resolution_date IS NULL
List<Ticket> findByStatusAndEffectiveResolutionDateIsNull(String status);
```

> **Regla:** los parámetros se asignan por **posición**, no por nombre. Si el método tiene `AndCreatedAtBetween`, necesitas dos parámetros `LocalDateTime` en ese orden.

---

### ⑥ El ordenamiento

`OrderBy` + campo + `Asc`/`Desc` al final del nombre agrega `ORDER BY` al SQL. Puedes encadenar varios campos de orden:

```java
// ORDER BY created_at ASC
List<Ticket> findAllByOrderByCreatedAtAsc();

// WHERE status = ? ORDER BY created_at DESC
List<Ticket> findByStatusOrderByCreatedAtDesc(String status);

// ORDER BY status ASC, THEN created_at DESC
List<Ticket> findAllByOrderByStatusAscCreatedAtDesc();
```

---

### Cómo Spring Data valida todo esto al arrancar

```mermaid
flowchart TD
    A["Spring Boot arranca"]
    B["Spring Data escanea\ninterfaces @Repository"]
    C["Por cada método no heredado\nparsea el nombre"]
    D{{"¿El campo existe\nen la entidad?"}}
    E["Genera el SQL\ny lo compila"]
    F["🔴 Lanza excepción\nNo property 'X' found"]
    G["✅ App lista\npara recibir peticiones"]

    A --> B --> C --> D
    D -->|"Sí"| E --> G
    D -->|"No"| F

    style F fill:#fff0f0,stroke:#cc0000
    style G fill:#f0fff0,stroke:#00aa00
```

Esto convierte los errores de consulta en **errores de arranque**, no en errores de producción. Si escribiste mal el nombre de un campo, lo sabes antes de que llegue la primera petición.

---

### Cuándo los derived methods no son suficientes

Los derived methods cubren la mayoría de los casos. Hay dos situaciones donde no alcanzan:

1. **El nombre se vuelve ilegible** — más de ~60 caracteres es señal de que necesitas `@Query` con JPQL.
2. **Operaciones masivas con condición** — `save()` siempre trabaja de a un registro; para actualizar o eliminar muchos registros a la vez con una sola sentencia SQL se necesita `@Modifying`. Ambos casos se explican en la siguiente sección.

```java
// 🟡 Límite razonable de derived method — todavía legible
List<Ticket> findByStatusAndEffectiveResolutionDateIsNullOrderByCreatedAtAsc(String s);

// 🔴 Demasiado largo — mejor usar @Query (lección posterior)
List<Ticket> findByStatusAndTitleContainingIgnoreCaseAndCreatedAtBetweenOrderByCreatedAtDesc(
    String status, String keyword, LocalDateTime from, LocalDateTime to);
```

---

## Operaciones masivas — `saveAll`, `@Modifying` y bulk update

`save()` trabaja de a un registro. La pregunta natural es: ¿qué pasa si necesito insertar 500 tickets de una importación, o cerrar todos los tickets con estado `NEW` de una vez?

### `saveAll()` — insertar o actualizar muchos registros

`JpaRepository` ya incluye `saveAll(Iterable<T>)`. La diferencia con un bucle de `save()` no es solo sintáctica: con la configuración correcta Hibernate agrupa los `INSERT` en lotes, reduciendo drásticamente las idas a la base de datos.

```mermaid
flowchart LR
    subgraph loop["❌ save() en bucle — N viajes a la BD"]
        direction TB
        a1["save(t1)"] --> db1[("INSERT")]
        a2["save(t2)"] --> db2[("INSERT")]
        a3["save(t3)"] --> db3[("INSERT")]
        an["... x N"] --> dbn[("INSERT × N")]
    end
    subgraph batch["✅ saveAll() con batch — pocos viajes a la BD"]
        direction TB
        b1["saveAll(lista)"] --> db4[("INSERT lote 1\nINSERT lote 2\n...")]
    end
```

```java
// ❌ N llamadas individuales — N round-trips a la BD
for (Ticket t : ticketsImportados) {
    repository.save(t);
}

// ✅ Una sola llamada — Hibernate puede agrupar los INSERTs
repository.saveAll(ticketsImportados);
```

Para activar el batching real de Hibernate, agrega a `application.yml`:

```yaml
jpa:
  properties:
    hibernate:
      jdbc:
        batch_size: 50        # agrupa hasta 50 INSERTs por viaje
      order_inserts: true     # reordena para que el batch sea efectivo
      order_updates: true
```

> **¿Por qué `batch_size` no activa solo?**
> `GenerationType.IDENTITY` (AUTO_INCREMENT) desactiva el batching en Hibernate porque la BD asigna el ID después de cada INSERT y Hibernate necesita ese ID para construir el objeto. Si el rendimiento de inserciones masivas es crítico, existe `GenerationType.SEQUENCE` (PostgreSQL), que permite batching nativo. Fuera del alcance de este curso, pero es útil saberlo.

---

### `@Modifying` — actualizar o eliminar muchos registros con una condición

Ni `save()` ni los derived methods permiten ejecutar un `UPDATE ... WHERE` o `DELETE ... WHERE` en una sola sentencia SQL sin cargar las entidades primero. Para eso existe la combinación `@Query` + `@Modifying`.

```java
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

  // Cierra todos los tickets NEW de un golpe
  @Modifying
  @Transactional
  @Query("UPDATE Ticket t SET t.status = :newStatus WHERE t.status = :oldStatus")
  int updateStatusBulk(@Param("oldStatus") String oldStatus,
                       @Param("newStatus") String newStatus);

  // Elimina todos los tickets cerrados de un golpe
  @Modifying
  @Transactional
  @Query("DELETE FROM Ticket t WHERE t.status = :status")
  int deleteBulkByStatus(@Param("status") String status);
}
```

Retorna `int` = número de filas afectadas.

> **JPQL vs SQL:** la `@Query` de arriba usa **JPQL** (Java Persistence Query Language). Escribe el nombre de la **clase Java** (`Ticket`, `t.status`) no el nombre de la **tabla SQL** (`tickets`, `status`). JPA traduce a SQL según el dialecto de la base de datos.

---

### Por qué `@Modifying` es necesario

Sin `@Modifying`, Spring Data asume que cualquier `@Query` es un SELECT y lanza una excepción al intentar ejecutar un UPDATE o DELETE. Las tres anotaciones trabajan juntas:

| Anotación | Qué hace |
|---|---|
| `@Query("UPDATE ...")` | Define el JPQL a ejecutar |
| `@Modifying` | Le dice a Spring Data que es una operación de escritura, no lectura |
| `@Transactional` | Envuelve la operación en una transacción; sin ella Hibernate lanza `TransactionRequiredException` |

---

### El problema invisible: la caché de Hibernate

Aquí viene el punto que más confunde. Cuando ejecutas una operación masiva con `@Modifying`, la base de datos se actualiza correctamente. Pero Hibernate mantiene en memoria una **caché de primer nivel** (el contexto de persistencia) con las entidades que ya cargó en esa sesión. Esas entidades **no se actualizan automáticamente** con el resultado del bulk update.

```mermaid
sequenceDiagram
    participant Svc as TicketService
    participant Repo as TicketRepository
    participant Cache as Caché Hibernate
    participant DB as Base de datos

    Svc->>Repo: findByStatus("NEW")
    Repo->>DB: SELECT * WHERE status='NEW'
    DB-->>Cache: 42 entidades cargadas en memoria
    Cache-->>Svc: List(42 tickets con status="NEW")

    Svc->>Repo: updateStatusBulk("NEW", "CLOSED")
    Repo->>DB: UPDATE tickets SET status='CLOSED' WHERE status='NEW'
    DB-->>Repo: 42 rows affected

    Note over Cache: ⚠️ Las 42 entidades en memoria<br/>todavía dicen status="NEW"<br/>La BD ya dice "CLOSED"
```

Para resolverlo, agrega `clearAutomatically = true` en `@Modifying`:

```java
@Modifying(clearAutomatically = true)
@Transactional
@Query("UPDATE Ticket t SET t.status = :newStatus WHERE t.status = :oldStatus")
int updateStatusBulk(@Param("oldStatus") String old, @Param("newStatus") String nuevo);
```

`clearAutomatically = true` vacía la caché de primer nivel después del UPDATE. Las siguientes consultas van a la BD y obtienen los datos actualizados.

> **Regla práctica:** si después de un bulk update vas a hacer un `findBy...` en el mismo contexto de transacción, usa `clearAutomatically = true`. Si son operaciones independientes (peticiones HTTP distintas), no es necesario.

---

### El problema del `deleteBy` derivado: carga antes de borrar

Los derived methods de tipo `deleteBy...` tienen un comportamiento que sorprende:

```java
// Parece un DELETE simple...
long deleteByStatus(String status);
```

Pero lo que Hibernate hace internamente es:
1. `SELECT * FROM tickets WHERE status = ?` — carga todas las entidades
2. Para cada entidad: `DELETE FROM tickets WHERE id = ?` — N deletes individuales

Para datasets grandes, esto es un problema de rendimiento (N+1 de eliminación). La alternativa es el bulk delete con `@Modifying`:

```java
// Un único DELETE en la BD — sin cargar entidades
@Modifying(clearAutomatically = true)
@Transactional
@Query("DELETE FROM Ticket t WHERE t.status = :status")
int deleteBulkByStatus(@Param("status") String status);
```

---

### Resumen: cuándo usar cada enfoque

```mermaid
flowchart TD
    Q{"¿Cuántos registros\nmanipulas?"}
    Q -->|"Uno"| A["save() / deleteById()\nfindById()"]
    Q -->|"Varios con una\ncondición WHERE"| B{"¿Lees o escribes?"}
    B -->|"Solo leer"| C["Derived method\nfindBy...()"]
    B -->|"Insertar/actualizar\nlista"| D["saveAll(lista)"]
    B -->|"UPDATE con condición"| E["@Modifying + @Query\nUPDATE ... WHERE"]
    B -->|"DELETE con condición\nmuchos registros"| F["@Modifying + @Query\nDELETE ... WHERE"]
    B -->|"DELETE con condición\npocos registros"| G["deleteBy...()\n(derived method)"]

    style E fill:#fff8e1,stroke:#f0a000
    style F fill:#fff8e1,stroke:#f0a000
```

| Operación | Herramienta | Retorna |
|---|---|---|
| Guardar uno | `save(entity)` | `T` (la entidad guardada) |
| Guardar muchos | `saveAll(list)` | `List<T>` |
| Buscar con condición | `findBy...()` | `List<T>` / `Optional<T>` |
| Contar con condición | `countBy...()` | `long` |
| Eliminar uno | `deleteById(id)` | `void` |
| Eliminar con condición (pocos) | `deleteBy...()` | `long` |
| Eliminar con condición (muchos) | `@Modifying @Query DELETE` | `int` (filas afectadas) |
| Actualizar con condición | `@Modifying @Query UPDATE` | `int` (filas afectadas) |

---

## `show-sql: true` — aprende leyendo el SQL generado

En `application.yml` configuraste:

```yaml
jpa:
  show-sql: true
  properties:
    hibernate:
      format_sql: true
```

Esto muestra en consola el SQL que JPA genera para cada operación. Es invaluable para aprender:

```sql
-- Al llamar a repository.save(ticket) con un ticket nuevo:
insert
into
    tickets
    (created_at, description, effective_resolution_date, estimated_resolution_date, status, title)
values
    (?, ?, ?, ?, ?, ?)

-- Al llamar a repository.findById(1L):
select
    t1_0.id,
    t1_0.created_at,
    ...
from
    tickets t1_0
where
    t1_0.id=?
```

En producción desactivarías `show-sql` para no exponer la estructura de la base de datos en los logs.

---

## El puente desde el Map al JPA

El Map que usabas antes y JPA comparten el mismo concepto fundamental: acceso por clave primaria.

| Concepto | Con `Map<Long, Ticket>` | Con JPA |
|---|---|---|
| Guardar | `db.put(id, ticket)` | `repository.save(ticket)` |
| Buscar por ID | `db.get(id)` | `repository.findById(id)` |
| Eliminar | `db.remove(id)` | `repository.deleteById(id)` |
| ¿Existe? | `db.containsKey(id)` | `repository.existsById(id)` |
| Listar todos | `new ArrayList<>(db.values())` | `repository.findAll()` |
| Dónde viven los datos | RAM (se pierden al reiniciar) | Disco (persisten para siempre) |

El cambio conceptual es mínimo. El beneficio es enorme.

---

## El patrón DTO — "profe, es otra clase con los mismos datos... ¿para qué?"

Esta es la pregunta más frecuente cuando se introduce el patrón. La respuesta corta es: **hoy se ven iguales, pero no son lo mismo, y en cuanto el proyecto crece dejan de parecerse**.

### Dos mundos, dos contratos

Una entidad JPA (`Ticket`) es el **reflejo de la base de datos**. Su forma la dictan las tablas, las relaciones, los índices. Cambia cuando la base de datos cambia.

Un DTO (`TicketResponse`) es el **contrato con el cliente de la API**. Su forma la dictan los consumidores: el frontend, la app móvil, los integradores. Cambia cuando ellos necesitan algo diferente.

Son dos contratos distintos que hoy coinciden, pero que divergen con el tiempo. Mezclarlos es juntar dos mundos que hablan idiomas diferentes.

---

### El momento en que dejan de ser iguales

Supongamos que en la lección 12 agregas el campo `createdBy` al ticket (quién lo creó). En la entidad, ese campo es un objeto `User` completo:

```java
// Entidad JPA — lo que vive en la base de datos
@Entity
public class Ticket {
  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private User createdBy;  // objeto completo con id, email, password, roles...
}
```

Pero al cliente de la API no le interesa el objeto `User` completo — solo quiere un nombre para mostrarlo en pantalla:

```java
// DTO — lo que el cliente necesita ver
public record TicketResponse(
    Long id,
    String title,
    String status,
    String createdByName  // solo el nombre, no el User completo
) {}
```

Si hubieras retornado la entidad directamente, el cliente recibiría el objeto `User` entero (incluyendo datos que no debería ver), o peor: un error de serialización porque `User` tiene una lista de tickets que apunta de vuelta a `Ticket` → ciclo infinito → `StackOverflowError`.

El DTO corta ese problema en su raíz.

---

### Las cuatro razones reales

| Pregunta | Sin DTO | Con DTO |
|---|---|---|
| ¿Qué pasa si agrego una relación JPA? | La serialización se rompe o expone datos no deseados | El DTO no cambia: el Service extrae solo lo necesario |
| ¿Qué pasa si hay un campo sensible en la entidad (contraseña, token)? | Se expone al cliente | El DTO simplemente no lo incluye |
| ¿Qué pasa si el cliente necesita un campo calculado? | La entidad no puede tenerlo sin contaminar la capa de persistencia | El Service lo calcula y lo pone en el DTO |
| ¿Qué pasa si cambio el nombre de una columna en la BD? | Rompe la API pública | Solo cambia la entidad y el `toResult()` en el Service; el DTO no cambia |

---

### La regla de diseño

> **La entidad pertenece al repositorio. Nadie fuera del Service debería conocerla.**

Si el Controller importa `Ticket`, algo está mal. Si el Controller importa `TicketResponse`, todo está bien.

```mermaid
flowchart TD
    A["TicketRequest\n(input HTTP)"]
    B["TicketCommand\n(input del Service)"]
    C["⚙️ TicketService\ntrabaja con Ticket internamente"]
    D["TicketResult\n(output del Service)"]
    E["TicketResponse\n(output HTTP)"]
    F["🏷️ Ticket @Entity\nnunca cruza esta frontera"]

    A -->|"Controller recibe"| B
    B -->|"Controller envía"| C
    C -->|"Service retorna"| D
    D -->|"Controller convierte"| E
    F -.-|"solo visible\ndentro del Service"| C

    style F fill:#fff0f0,stroke:#cc0000,color:#cc0000
    style C fill:#f0f4ff,stroke:#3366cc
```

---

### ¿Y si de verdad son iguales para siempre?

En proyectos simples o prototipos, puede pasar. Pero el costo de tener el DTO es mínimo (una clase de pocas líneas), mientras que el costo de *no tenerlo* cuando la entidad crece es refactorizar toda la API. La separación de capas se paga sola en el primer cambio de schema.

---

## El patrón `*Result` — por qué no retornamos entidades JPA

Cuando desarrollas una API REST, el Service retorna datos al Controller, quien los pone en `ResponseEntity`. **NUNCA retorno una entidad JPA directamente**. ¿Por qué?

### El problema: entidad JPA vs mundo exterior

Una entidad JPA como `Ticket` tiene muchas responsabilidades que no queremos exponer:

```java
@Entity
public class Ticket {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;           // 🔴 JPA internals

  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "created_by_id")
  private User createdBy;     // 🔴 Relación JPA — serialization circular

  @Entity
  public class User {
    @OneToMany(mappedBy = "createdBy")
    private List<Ticket> ticketsCreated; // 🔴 Relación inversa
  }
}
```

| Problema | Qué pasa |
|---|---|
| Proxies JPA lazy | Al serializar a JSON, falla si el proxy no está inicializado |
| Serialización circular | `Ticket` → `User` → `Ticket` → ... → `StackOverflowError` |
| Exposición de internals | El cliente ve campos como `hibernateLazyInitializer` |
| Acoplamiento con BD | Cambiar la entidad rompe la API pública |

### La solución: transformar a `*Result`

Creamos un DTO de salida (data transfer object) que solo contiene datos:

```java
public record TicketResult(
    Long id,
    String title,
    String description,
    String status,
    // Solo datos planos, sin relaciones JPA
    String createdBy,
    String assignedTo
) {}
```

El Service transforma la entidad a Result:

```java
public List<TicketResult> getTickets() {
  return repository.findAll().stream()
      .map(ticket -> new TicketResult(
          ticket.getId(),
          ticket.getTitle(),
          ticket.getDescription(),
          ticket.getStatus(),
          ticket.getCreatedBy(),   // String, no User
          ticket.getAssignedTo()      // String, no User
      ))
      .toList();
}
```

### El flujo completo

```mermaid
flowchart LR
    R["📥 Command\n(DTO input)"]
    S["⚙️ Service\ntransforma"]
    E[("📦 Repository\nEntidad JPA")]
    Re["📤 Result\n(DTO output)"]
    J["🌐 Response\n(JSON al cliente)"]

    R -->|"recibe"| S
    S <-->|"save / findAll..."| E
    S -->|"retorna"| Re
    Re -->|"serializa"| J
```

| Capa | Qué usa | Por qué |
|---|---|---|
| Controller | Recibe `*Request` del cliente | Valida input con `@Valid` |
| Controller | Convierte a `*Command` | Desacopla HTTP del Service |
| Service | Recibe `*Command`, retorna `*Result` | Trabaja con datos planos, sin HTTP |
| Controller | Convierte `*Result` a `*Response` | Formatea la salida HTTP |
| HTTP Response | Serializa `*Response` a JSON | El cliente recibe datos limpios |

### ¿Cuándo usar el patrón completo?

A partir de esta lección, el flujo completo por endpoint es:

```
Request → Command → Service → Result → Response
```

- `GET /tickets` → `List<TicketResult>` en Service → `List<TicketResponse>` al cliente
- `GET /tickets/{id}` → `Optional<TicketResult>` en Service → `TicketResponse` al cliente
- `POST /tickets` → `TicketCommand` al Service → `TicketResult` → `TicketResponse` al cliente
- `PUT /tickets/{id}` → `TicketCommand` al Service → `TicketResult` → `TicketResponse` al cliente

El `*Request` y `*Response` son los bordes HTTP; el `*Command` y `*Result` son el contrato interno con el Service.



<!-- START OF FILE: docs_lessons_10-jpa-intro_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 10-jpa-intro 04 checklist rubrica minima
---
# Lección 10 — Checklist y rúbrica mínima

Usa esta lista para verificar que la migración a JPA está completa antes de continuar.

---

## Checklist del `pom.xml`

- ☐ Tiene la dependencia `spring-boot-starter-data-jpa`
- ☐ Tiene la dependencia `h2` con `scope runtime`

---

## Checklist de `application.yml`

- ☐ `spring.datasource.url` apunta a `jdbc:h2:mem:tickets_db`
- ☐ `spring.datasource.driver-class-name` es `org.h2.Driver`
- ☐ `spring.jpa.hibernate.ddl-auto` está configurado como `create-drop`
- ☐ `spring.jpa.show-sql` es `true` (para aprendizaje)
- ☐ `spring.h2.console.enabled` es `true`

---

## Checklist de `Ticket.java`

- ☐ La clase tiene `@Entity` y `@Table(name = "tickets")`
- ☐ El campo `id` tiene `@Id` y `@GeneratedValue(strategy = GenerationType.IDENTITY)`
- ☐ **No** hay `@Min` ni `@Max` sobre el campo `id` (el ID lo asigna la base de datos)
- ☐ El campo `title` tiene `@Column(nullable = false, length = 50)`
- ☐ El campo `description` tiene `@Column(nullable = false, columnDefinition = "TEXT")`
- ☐ El campo `status` tiene `@Column(nullable = false, length = 20)`
- ☐ Los campos de fecha tienen `@Column(name = "...")` con nombre en snake_case
- ☐ La clase sigue teniendo `@NoArgsConstructor` (requerido por JPA)
- ☐ Las importaciones son de `jakarta.persistence.*` (no `javax.persistence.*`)

---

## Checklist de `TicketRepository.java`

- ☐ Es una **interfaz** (no una clase)
- ☐ Extiende `JpaRepository<Ticket, Long>`
- ☐ Tiene el método `boolean existsByTitleIgnoreCase(String title)`
- ☐ Tiene el método `List<Ticket> findByStatusIgnoreCase(String status)`
- ☐ Tiene el método `List<Ticket> findAllByOrderByCreatedAtAsc()`
- ☐ **No** tiene campos como `Map<Long, Ticket> db` ni `long currentId` (eso era la versión manual)

---

## Checklist de DTOs

- ☐ Existe `TicketCommand.java` — `record` con `title`, `description`, `status`, `effectiveResolutionDate`
- ☐ Existe `TicketResult.java` — `record` con todos los campos de `Ticket` (output del Service)
- ☐ Existe `TicketResponse.java` — `record` con todos los campos (output HTTP al cliente)
- ☐ `TicketRequest.java` sigue existiendo con `@NotBlank` y `@Size` (input HTTP del cliente)
- ☐ Ningún DTO importa clases de `jakarta.persistence.*`

---

## Checklist de `TicketService.java`

- ☐ Los métodos reciben `TicketCommand` (no `TicketRequest`)
- ☐ Los métodos retornan `TicketResult` o `List<TicketResult>` (no entidades `Ticket`)
- ☐ `getTickets()` usa `findAllByOrderByCreatedAtAsc()` cuando no hay filtro
- ☐ `getTickets(String statusFilter)` usa `findByStatusIgnoreCase(status)` cuando hay filtro
- ☐ `create(TicketCommand command)` verifica duplicados con `existsByTitleIgnoreCase()` y llama a `save()`
- ☐ `getById(Long id)` retorna `repository.findById(id).map(toResult)` (devuelve `Optional<TicketResult>`)
- ☐ `deleteById(Long id)` usa `existsById()` + `deleteById()`
- ☐ `updateById(Long id, TicketCommand command)` usa `findById()` + `save(ticket)` y retorna `Optional<TicketResult>`
- ☐ El Service **no** asigna el `id` manualmente (eso lo hace la base de datos)
- ☐ Existe el método privado `toResult(Ticket)` que convierte entidad → `TicketResult`

---

## Checklist de `TicketController.java`

- ☐ Recibe `TicketRequest` en los endpoints (body HTTP)
- ☐ Convierte `TicketRequest` → `TicketCommand` antes de llamar al Service (`toCommand()`)
- ☐ Convierte `TicketResult` → `TicketResponse` antes de retornar al cliente (`toResponse()`)
- ☐ **No** retorna entidades `Ticket` ni `TicketResult` directamente al cliente

---

## Checklist de `DataInitializer.java`

- ☐ Existe la clase `DataInitializer` en el paquete `config/`
- ☐ Implementa `CommandLineRunner`
- ☐ El método `run()` usa `ticketRepository.count()` para evitar duplicar datos
- ☐ Siembra tickets con `ticketRepository.save(ticket)`

---

## Checklist de pruebas

- ☐ La aplicación arrêté sin errores (`./mvnw spring-boot:run`)
- ☐ En la consola se ve el SQL de creación de la tabla `tickets`
- ☐ `POST /ticket-app/tickets` crea un ticket
- ☐ `GET /ticket-app/tickets` devuelve los tickets
- ☐ Al reiniciar la aplicación (con `ddl-auto: create-drop`), los datos se pierden (comportamiento esperado)

---

## Errores comunes

| Error | Causa probable | Solución |
|---|---|---|
| `Unable to create bean 'entityManagerFactory'` | Anotaciones JPA incorrectas o falta `@NoArgsConstructor` | Revisar la clase `Ticket` |
| `No property 'status' found for type 'Ticket'` | El nombre del campo en el método del repositorio no coincide con el campo de la clase | Verificar que el campo en `Ticket` se llame exactamente `status` |
| Importaciones de `javax.persistence.*` | Versión incorrecta del paquete | Cambiar a `jakarta.persistence.*` |



<!-- START OF FILE: docs_lessons_10-jpa-intro_05_actividad_individual.md -->
# Documento: docs lessons 10-jpa-intro 05 actividad individual
---
# Lección 10 — Actividad individual: migrar Category a JPA

## Contexto

Tu entidad `Category` (creada en la lección 05) todavía usa un repositorio en memoria. Esta actividad aplica exactamente la misma migración que hiciste con `Ticket`.

---

## Lo que debes entregar

### Parte 1: anotar `Category` como entidad JPA

Modifica `Category.java` con las anotaciones JPA correspondientes:

| Campo | Tipo Java | Anotaciones requeridas |
|---|---|---|
| `id` | `Long` | `@Id`, `@GeneratedValue(strategy = GenerationType.IDENTITY)` |
| `name` | `String` | `@Column(nullable = false, unique = true, length = 100)` |
| `description` | `String` | `@Column(columnDefinition = "TEXT")` |

La clase debe seguir teniendo `@Entity`, `@Table(name = "categories")`, y `@NoArgsConstructor`.

### Parte 2: convertir `CategoryRepository` a interfaz JPA

```java
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  boolean existsByName(String name);

  List<Category> findAllByOrderByNameAsc();

  List<Category> findByNameContainingIgnoreCase(String name);
}
```

> **¿Qué hace `findByNameContainingIgnoreCase`?**
> Genera `SELECT * FROM categories WHERE LOWER(name) LIKE LOWER('%?%')`. Es el equivalente JPA al filtro de nombre parcial que implementaste en L09 manualmente.

### Parte 3: actualizar `CategoryService`

Adapta los métodos del servicio para usar `JpaRepository`:

- `getCategories(String nameFilter)`: usa `findAllByOrderByNameAsc()` o `findByNameContainingIgnoreCase(nameFilter)` según corresponda
- `create(CategoryRequest request)`: usa `existsByName()` + `save()`
- `getById(Long id)`: usa `findById(id)` — devuelve `Optional<Category>`
- `deleteById(Long id)`: usa `existsById()` + `deleteById()`
- `updateById(Long id, CategoryRequest request)`: usa `findById().map(...)` + `save()`

---

## Pruebas requeridas

| Prueba | Resultado esperado |
|---|---|
| Aplicación arranca sin errores | Tabla `categories` creada en MySQL automáticamente |
| `POST /categories` | Crea y persiste la categoría en MySQL |
| `GET /categories` | Devuelve todas las categorías ordenadas por nombre |
| `GET /categories?name=hard` | Filtra por nombre parcial |
| `GET /categories/{id}` | Devuelve la categoría o `404` |
| `DELETE /categories/{id}` | Elimina el registro de MySQL |
| Reiniciar la app | Las categorías persisten |

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| `Category` tiene `@Entity`, `@Id`, `@GeneratedValue`, `@Column` correctos | 30% |
| `CategoryRepository` es interfaz y extiende `JpaRepository<Category, Long>` | 25% |
| `CategoryService` usa los métodos de JPA correctamente | 25% |
| Las pruebas pasan y los datos persisten tras reiniciar | 20% |

---

## Desafío opcional

Agrega el siguiente método al repositorio y úsalo en el servicio:

```java
// Devuelve categorías que tienen al menos un ticket asociado
// (lo implementaremos cuando tengamos la relación en L12, por ahora solo decláralo)
long countByNameContainingIgnoreCase(String name);
```

Este método retorna cuántas categorías contienen el texto buscado. Úsalo en el servicio para loguear el resultado: `log.info("Encontradas {} categorías", count)`.



<!-- START OF FILE: docs_lessons_11-database-config_01_objetivo_y_alcance.md -->
# Documento: docs lessons 11-database-config 01 objetivo y alcance
---
# Lección 11 — Configurar bases de datos reales: H2, MySQL y Supabase

## ¿De dónde venimos?

En la lección 10 migraste el proyecto a JPA con H2 (base de datos en memoria). Tu aplicación ahora persiste tickets, pero los datos se pierden al cerrar la aplicación.

Hay dos escenarios que necesitas manejar:

1. **Persistencia real:** necesitas que los datos sobrevivan entre ejecuciones (MySQL, PostgreSQL)
2. **Entornos distintos:** necesitas poder cambiar de base de datos sin modificar el código

Esta lección resuelve ambos con **perfiles de Spring Boot** y **variables de entorno**.

---

## Los tres caminos

| Opción | Dónde corre | Cuándo usarla |
|---|---|---|
| **H2 (en memoria)** | Tu computador local | Tests, desarrollo rápido, sin persistencia |
| **MySQL + XAMPP** | Tu computador local | Desarrollo diario, pruebas con datos persistentes |
| **Supabase** | Nube (PostgreSQL) | Entrega de actividades, demos, trabajo colaborativo |

Los tres usan SQL estándar y funcionan perfectamente con JPA/Hibernate. La única diferencia está en los archivos de configuración.

**Nota:** Aunque usamos la misma base de datos (Supabase) para test y prod, los entornos son diferentes (distinto proyecto, distintas credenciales).

---

## ¿Qué vas a construir?

Al terminar esta lección podrás:

1. Entender cómo usar **perfiles de Spring Boot** para manejar múltiples configuraciones
2. Configurar **entornos** con diferentes valores de variables para cada perfil
3. Configurar variables de entorno para no hardcodear credenciales
3. Conectar la aplicación a **H2** (desarrollo rápido)
4. Conectar la aplicación a **MySQL local** (XAMPP) con la configuración correcta
5. Crear un proyecto en **Supabase** y obtener la URL de conexión
6. Conectar la aplicación a **Supabase** (PostgreSQL en la nube)
7. Cambiar entre las tres bases de datos con un solo argumento (sin modificar código)

### Lo que vas a poder explicar

- ¿Cuál es la diferencia entre MySQL, PostgreSQL y H2 para este proyecto?
- ¿Qué son los **perfiles de Spring Boot** y cómo se usan?
- ¿Cómo protejo mis credenciales usando variables de entorno?
- ¿Qué información necesita Spring Boot para conectarse a una base de datos?
- ¿Qué hace `ddl-auto: create` vs `ddl-auto: update` y cuándo usar cada uno?
- ¿Por qué cambiar de base de datos no requiere cambiar el código Java?
- ¿Cómo configuro variables de entorno desde el sistema operativo y desde IntelliJ?

---

## Documentación por secciones

1. **[Guión paso a paso](02_guion_paso_a_paso.md)** — Instrucciones detalladas para configurar cada perfil
2. **[Resumen de archivos](07_resumen_archivos.md)** — Referencia rápida de qué va en cada archivo
3. **[Guía IntelliJ](06_guia_intellij_env.md)** — Cómo cargar `.env` en IntelliJ IDEA
4. **[MySQL vs PostgreSQL](03_mysql_vs_postgresql.md)** — Comparación técnica

---

## ¿Qué NO cubre esta lección?

| Tema | ¿Por qué queda afuera? |
|---|---|
| Migraciones con Flyway o Liquibase | Herramientas de nivel producción, fuera del alcance del curso |
| Conexión con SSL/TLS forzado | Configuración avanzada de red |
| Connection pooling avanzado | Configuración por defecto de Hikari es suficiente |



<!-- START OF FILE: docs_lessons_11-database-config_02_guion_paso_a_paso.md -->
# Documento: docs lessons 11-database-config 02 guion paso a paso
---
# Lección 11 — Tutorial paso a paso: Perfiles de base de datos

---

## Configuración con Perfiles de Spring Boot

Spring Boot permite gestionar múltiples configuraciones de base de datos usando **perfiles** (profiles). Esto evita cambiar manualmente `application.yml` cada vez que cambias de entorno.

### Archivos de perfil (configuración)

| Archivo | Perfil | Base de Datos |
|--------|-------|--------------|
| `application-h2.yml` | `h2` | H2 (memoria) |
| `application-mysql.yml` | `mysql` | MySQL (XAMPP) |
| `application-supabase.yml` | `supabase` | Supabase (PostgreSQL) |

### Archivos de entorno (valores)

| Archivo | Perfil | Entorno | Cuándo usarlo |
|--------|-------|--------|--------|-------------|
| `.env.local` | `h2` | local | Desarrollo rápido |
| `.env.dev` | `mysql` | dev | Desarrollo con MySQL |
| `.env.test` | `supabase` | test | Pruebas en Supabase |
| `.env.prod` | `supabase` | prod | Producción |

**Nota:** Los entornos `test` y `prod` comparten el perfil `supabase` (misma configuración), pero tienen diferentes valores de conexión.

### Activar un perfil

**Opción 1: Copiar archivo de entorno**
```bash
# Desarrollo rápido (H2)
copy .env.local .env
./mvnw.cmd spring-boot:run

# Desarrollo con MySQL
copy .env.dev .env
./mvnw.cmd spring-boot:run

# Pruebas en Supabase
copy .env.test .env
./mvnw.cmd spring-boot:run

# Producción
copy .env.prod .env
./mvnw.cmd spring-boot:run
```

**Opción 2: Perfil por línea de comandos**
```bash
# H2
./mvnw.cmd spring-boot:run -Dspring.profiles.active=h2

# MySQL
./mvnw.cmd spring-boot:run -Dspring.profiles.active=mysql

# Supabase
./mvnw.cmd spring-boot:run -Dspring.profiles.active=supabase
```

**Opción 3: Variable de entorno**
```bash
# Windows (PowerShell)
$env:SPRING_PROFILES_ACTIVE="mysql"
./mvnw spring-boot:run

# Linux/macOS
export SPRING_PROFILES_ACTIVE=mysql
./mvnw spring-boot:run
```

**Opción 4: Desde IntelliJ IDEA**
1. Abre **Run** → **Edit Configurations**
2. Busca la configuración de Maven (Spring Boot)
3. En el campo **Program arguments**, agrega: `spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=mysql"`
4. O en **VM options**, agrega: `-Dspring.profiles.active=mysql`
5. Guarda y ejecuta

---

## Variables de Entorno y Archivo `.env`

Para **no hardcodear credenciales** en el código, usamos variables de entorno. Spring Boot las inyecta automáticamente usando la sintaxis `${variable}`.

### Paso 1: Crear el archivo `.env`

En la raíz del proyecto `Tickets/`, copia `.env.example` a `.env`:

```bash
# Windows
copy .env.example .env

# Linux/macOS
cp .env.example .env
```

**Contenido de `.env`:**
```env
# Perfil activo (h2, mysql, supabase)
SPRING_PROFILES_ACTIVE=mysql

# MySQL Configuration (usado por el perfil mysql)
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=

# Supabase Configuration (usado por el perfil supabase)
# DB_HOST=db.xxxxxxxxxxxx.supabase.co
# DB_PORT=5432
# DB_NAME=postgres
# DB_USER=postgres
# DB_PASSWORD=your-supabase-password
```

### Paso 2: Cargar `.env` en los archivos YAML

**`application.yml`:**
```yaml
spring:
  application:
    name: Tickets
  profiles:
    active: h2
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"
```

**`application-mysql.yml`:**
```yaml
spring:
  datasource:
    url: jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:tickets_db}?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: ${DB_USER:root}
    password: ${DB_PASSWORD:}
  jpa:
    database-platform: org.hibernate.dialect.MySQLDialect
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true
```

**`application-supabase.yml`:**
```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
    driver-class-name: org.postgresql.Driver
    username: ${DB_USER}
    password: ${DB_PASSWORD}
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
    properties:
      hibernate:
        format_sql: true
```

> **¿Qué significa `${VAR:valor-por-defecto}`?**
> Si la variable de entorno `VAR` no existe, Spring usa `valor-por-defecto`. Es útil para desarrollo local.

### Paso 3: Cargar variables de entorno

#### Opción A: Sistema Operativo (SO)

**Windows (PowerShell):**
```powershell
# Ver una variable
$env:MYSQL_USERNAME

# Establecer (solo en sesión actual)
$env:MYSQL_USERNAME="root"
$env:SPRING_PROFILES_ACTIVE="mysql"

# Establecer permanentemente (requiere admin)
[Environment]::SetEnvironmentVariable("MYSQL_USERNAME", "root", "User")
```

**Linux/macOS:**
```bash
# Ver una variable
echo $MYSQL_USERNAME

# Establecer en sesión actual
export MYSQL_USERNAME="root"
export SPRING_PROFILES_ACTIVE="mysql"

# Establecer permanentemente (agregar a ~/.bashrc, ~/.zshrc, etc.)
echo 'export MYSQL_USERNAME="root"' >> ~/.bashrc
source ~/.bashrc
```

#### Opción B: IntelliJ IDEA

1. **Abre Run → Edit Configurations**
2. Selecciona la configuración de Spring Boot
3. En **Environment variables**, agrega las variables:
   ```
   SPRING_PROFILES_ACTIVE=mysql;DB_HOST=localhost;DB_PORT=3306;DB_NAME=tickets_db;DB_USER=root;DB_PASSWORD=
   ```
   (usa `;` para separar en Windows, `:` en Linux/macOS)
4. Guarda y ejecuta

**O con un archivo `.env` en IntelliJ:**
1. Instala el plugin **EnvFile** desde Preferences → Plugins
2. En **Edit Configurations**, habilita **Use env file** y selecciona tu `.env`
3. IntelliJ cargará automáticamente las variables

#### Opción C: Spring Boot con `dotenv` (Maven)

Agrega la dependencia en `pom.xml`:
```xml
<dependency>
    <groupId>me.paulschwarz</groupId>
    <artifactId>spring-dotenv</artifactId>
    <version>4.0.0</version>
</dependency>
```

Spring cargará automáticamente `Tickets/.env` al arrancar.

### Paso 4: Verificar que funcionó

```bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=mysql"
```

Deberías ver en los logs:
```
The following profiles are active: mysql
```

Y luego:
```
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

---

## Checklist de Seguridad

✅ **Siempre:**
- Crea `.env.example` con valores de ejemplo (sin credenciales reales)
- Agrega `.env` a `.gitignore` para que no se comitee

❌ **Nunca:**
- Hagas commit de `.env` con credenciales reales
- Escribas contraseñas directamente en `application.yml` versionado
- Compartas credenciales por chat o email

---

## Opción A: MySQL con XAMPP (base de datos local)

### Paso A1: verificar que XAMPP está listo

1. Abre el panel de control de XAMPP
2. Inicia los servicios **Apache** y **MySQL** (botón "Start" en cada uno)
3. Verifica que el estado muestre "Running" en verde

### Paso A2: crear la base de datos

1. Abre `http://localhost/phpmyadmin` en el navegador
2. En el panel izquierdo, haz clic en **Nueva**
3. Nombre: `tickets_db`
4. Cotejamiento: `utf8mb4_unicode_ci`
5. Haz clic en **Crear**

> **¿Qué es el cotejamiento?**
> Define cómo se comparan y ordenan los textos. `utf8mb4_unicode_ci` soporta todos los caracteres del español (tildes, ñ) y es insensible a mayúsculas en las comparaciones (`ci` = case-insensitive). Es el estándar para aplicaciones en español.

### Paso A3: verificar `application-mysql.yml`

Este archivo ya existe en `src/main/resources/`. Confírmalo:

```yaml
spring:
  datasource:
    url: jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:tickets_db}?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: ${DB_USER:root}
    password: ${DB_PASSWORD:}
  jpa:
    database-platform: org.hibernate.dialect.MySQLDialect
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true
```

> **¿Qué hace `?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC` en la URL?**
> - `useSSL=false`: desactiva SSL para conexiones locales (XAMPP no tiene certificado)
> - `allowPublicKeyRetrieval=true`: necesario con versiones recientes de MySQL para autenticación sin SSL
> - `serverTimezone=UTC`: sincroniza la zona horaria entre Java y MySQL para que los `LocalDateTime` se guarden y lean correctamente

Luego copia el archivo de entorno y arranca con el perfil mysql:

```bash
copy .env.dev .env
./mvnw.cmd spring-boot:run
```

### Paso A4: arrancar y verificar

```bash
./mvnw spring-boot:run
```

Revisa en phpMyAdmin: debería aparecer la tabla `tickets` creada automáticamente.

---

## Opción B: Supabase (PostgreSQL en la nube)

### Paso B1: crear una cuenta en Supabase

1. Ve a `https://supabase.com`
2. Haz clic en **Start your project**
3. Regístrate con GitHub o con correo electrónico

### Paso B2: crear un proyecto

1. En el dashboard, haz clic en **New project**
2. Nombre del proyecto: `tickets-app` (o el nombre que prefieras)
3. Contraseña de la base de datos: crea una contraseña fuerte y **guárdala** — la necesitarás
4. Región: elige la más cercana (por ejemplo, `South America (São Paulo)`)
5. Haz clic en **Create new project**

Supabase tarda 1-2 minutos en aprovisionar el proyecto.

### Paso B3: obtener la cadena de conexión

1. En tu proyecto de Supabase, ve a **Project Settings** (ícono de engranaje)
2. Haz clic en **Database** en el menú lateral
3. Baja hasta la sección **Connection string**
4. Selecciona la pestaña **JDBC**
5. Copia la cadena. Tendrá este formato:

```
jdbc:postgresql://db.xxxxxxxxxxxx.supabase.co:5432/postgres
```

### Paso B4: agregar el driver de PostgreSQL al `pom.xml`

```xml
<!-- Agrega esto, comenta o elimina el de MySQL mientras uses Supabase -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### Paso B5: configurar `.env` con tus credenciales de Supabase

Edita tu `.env` (o `.env.test`) con los valores obtenidos en el paso anterior:

```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.xxxxxxxxxxxx.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=tu-contraseña-de-supabase
```

El archivo `application-supabase.yml` ya existe en `src/main/resources/` y leerá estas variables automáticamente:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
    driver-class-name: org.postgresql.Driver
    username: ${DB_USER}
    password: ${DB_PASSWORD}
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true
```

Luego arranca con el perfil supabase:

```bash
copy .env.test .env
./mvnw.cmd spring-boot:run
```

### Paso B6: arrancar y verificar

```bash
./mvnw spring-boot:run
```

En el dashboard de Supabase, ve a **Table Editor** — deberías ver la tabla `tickets` creada automáticamente.

---

## Cómo cambiar entre MySQL y Supabase

El código Java no cambia. Solo cambias el archivo `.env` activo:

```bash
# Para usar MySQL local (XAMPP):
copy .env.dev .env
./mvnw.cmd spring-boot:run

# Para usar Supabase:
copy .env.test .env
./mvnw.cmd spring-boot:run
```

O bien pasa el perfil directamente por línea de comandos:
```bash
./mvnw.cmd spring-boot:run -Dspring.profiles.active=mysql
./mvnw.cmd spring-boot:run -Dspring.profiles.active=supabase
```

> **¿Por qué funciona esto?**
> JPA es una **especificación** (un contrato). Hibernate la implementa para cualquier base de datos que tenga un driver JDBC. El código Java no sabe si está hablando con MySQL o PostgreSQL — eso es responsabilidad de Hibernate y el driver. Cambias la configuración, no el código.

---

## Opciones de `ddl-auto` — cuándo usar cada una

| Valor | Comportamiento | Cuándo usarlo |
|---|---|---|
| `create` | Borra y recrea todas las tablas al arrancar | Primera vez que configuras la BD; **pierde todos los datos** |
| `create-drop` | Crea al arrancar, borra al apagar | Tests automatizados |
| `update` | Agrega columnas y tablas nuevas, no borra datos | Desarrollo activo (el más común) |
| `validate` | Verifica que el esquema coincide, no modifica nada | Producción |
| `none` | No hace nada con el esquema | Cuando el esquema lo controla otra herramienta (Flyway) |

**Para este curso:** usa `update` siempre, excepto cuando necesites partir con datos limpios, en cuyo caso usa `create` una vez y luego vuelve a `update`.

---

## Verificar la conexión sin arrancar la app

Si quieres comprobar que las credenciales son correctas antes de arrancar Spring Boot, puedes probar la conexión directamente con un cliente como **DBeaver** o **TablePlus**:

- **MySQL (XAMPP):** host `localhost`, puerto `3306`, usuario `root`, password vacío
- **Supabase:** usa la cadena de conexión de la sección "Database" → "Connection string" → pestaña "URI"

---

## El patrón `*Command` / `*Response` — Referencia

A partir de esta lección, el código usa el patrón de DTOs de entrada y salida. El motivo está documentado en **Lección 10 — JPA y ORM, sección "Por qué no retornamos entidades directamente"**.

| DTO | Uso |
|---|---|
| `*Command` | Input: el Controller lo recibe y el Service lo procesa |
| `*Response` | Output: el Service transforma la entidad y el Controller la retorna |

**Regla de oro:** Una entidad JPA (`@Entity`) nunca sale del Service. Siempre se convierte a `*Response` primero.



<!-- START OF FILE: docs_lessons_11-database-config_03_mysql_vs_postgresql.md -->
# Documento: docs lessons 11-database-config 03 mysql vs postgresql
---
# Lección 11 — MySQL vs PostgreSQL, y la cadena de conexión JDBC

## MySQL y PostgreSQL: lo que necesitas saber

Ambos son motores de base de datos relacionales que hablan SQL estándar. Para este curso son casi intercambiables. Estas son las diferencias que sí te afectan:

| Aspecto | MySQL (XAMPP) | PostgreSQL (Supabase) |
|---|---|---|
| `AUTO_INCREMENT` | `AUTO_INCREMENT` | `SERIAL` o `GENERATED ALWAYS AS IDENTITY` |
| Palabra reservada `user` | Problemática como nombre de tabla | También problemática |
| Tipos de texto | `VARCHAR`, `TEXT`, `LONGTEXT` | `VARCHAR`, `TEXT` (más flexible) |
| Insensibilidad a mayúsculas | Depende del cotejamiento | Requiere `ILIKE` o `LOWER()` |
| Driver JDBC | `com.mysql.cj.jdbc.Driver` | `org.postgresql.Driver` |
| Puerto por defecto | `3306` | `5432` |

**Para JPA con `GenerationType.IDENTITY`:** ambas bases de datos lo soportan. Hibernate genera el SQL correcto para cada motor automáticamente según el dialecto configurado.

---

## Anatomía de una cadena de conexión JDBC

```
jdbc:mysql://localhost:3306/tickets_db?useSSL=false&serverTimezone=America/Santiago
│    │      │         │    │           │
│    │      │         │    │           └─ parámetros adicionales
│    │      │         │    └─ nombre de la base de datos
│    │      │         └─ puerto
│    │      └─ host (servidor)
│    └─ tipo de base de datos
└─ protocolo JDBC
```

```
jdbc:postgresql://db.xxxxxxxxxxxx.supabase.co:5432/postgres
│    │           │                             │    │
│    │           │                             │    └─ nombre de la BD en Supabase (siempre "postgres")
│    │           │                             └─ puerto PostgreSQL estándar
│    │           └─ host de Supabase (único por proyecto)
│    └─ tipo de base de datos
└─ protocolo JDBC
```

---

## ¿Por qué "user" es una palabra reservada?

Tanto en MySQL como en PostgreSQL, `USER` es una función del sistema (devuelve el usuario conectado). Si creas una tabla llamada `user`, el motor SQL se confunde.

**Solución:** siempre usa `@Table(name = "users")` (en plural) para la entidad de usuarios. Lo aplicarás en la lección 12.

```java
@Entity
@Table(name = "users")  // ← "users", nunca "user"
public class User { ... }
```

---

## ¿Dónde guarda los datos cada opción?

**MySQL / XAMPP:**
Los datos se guardan en archivos del sistema de archivos de tu computador:
```
C:\xampp\mysql\data\tickets_db\
├── tickets.ibd       ← datos de la tabla tickets
└── db.opt            ← configuración de la base de datos
```
Si desinstalaras XAMPP sin respaldar, perderías los datos.

**Supabase:**
Los datos se guardan en servidores de AWS en la región que elegiste. Supabase ofrece backups automáticos diarios en el plan gratuito.

---

## El dialecto de Hibernate

El `dialect` le dice a Hibernate qué "sabor" de SQL debe generar:

```yaml
# MySQL:
properties:
  hibernate:
    dialect: org.hibernate.dialect.MySQLDialect

# PostgreSQL:
properties:
  hibernate:
    dialect: org.hibernate.dialect.PostgreSQLDialect
```

Con Spring Boot 4 y Hibernate 6, el dialecto se detecta automáticamente la mayoría de las veces. Igual es buena práctica explicitarlo para evitar advertencias en la consola.

---

## Buenas prácticas con contraseñas

Nunca subas credenciales reales al repositorio de Git. El `application.yml` que tienes en el repo debería tener contraseñas vacías o de ejemplo:

```yaml
# application.yml (lo que va a Git)
datasource:
  url: jdbc:mysql://localhost:3306/tickets_db
  username: root
  password:          # contraseña vacía para XAMPP local
```

Para Supabase, usa variables de entorno:

```yaml
# application.yml con variable de entorno
datasource:
  url: ${DB_URL}
  username: ${DB_USERNAME}
  password: ${DB_PASSWORD}
```

Y defines las variables en tu entorno antes de arrancar la app. La [Guía IntelliJ](06_guia_intellij_env.md) explica cómo cargarlo desde el IDE, y el [Guión paso a paso](02_guion_paso_a_paso.md) cubre las opciones por terminal y sistema operativo.



<!-- START OF FILE: docs_lessons_11-database-config_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 11-database-config 04 checklist rubrica minima
---
# Lección 11 — Checklist y rúbrica mínima

---

## Prerrequisito (Lección 10)

- ☐ La lección 10 está completa: JPA con H2 funciona

---

## Checklist de configuración de perfiles

- ☐ `application.yml` tiene la configuración base
- ☐ `application-h2.yml` existe con H2 en memoria
- ☐ `application-mysql.yml` existe con MySQL (XAMPP)
- ☐ `application-supabase.yml` existe con PostgreSQL (Supabase)
- ☐ `.env.example` existe con plantilla de variables
- ☐ `spring-dotenv` en `pom.xml` para cargar `.env`

---

## Checklist para MySQL (XAMPP)

- ☐ XAMPP tiene Apache y MySQL corriendo
- ☐ La base de datos `tickets_db` existe en phpMyAdmin
- ☐ `application-mysql.yml` tiene `url: jdbc:mysql://localhost:3306/tickets_db`
- ☐ `application-mysql.yml` tiene `driver-class-name: com.mysql.cj.jdbc.Driver`
- ☐ `pom.xml` tiene la dependencia `mysql-connector-j` con `scope: runtime`
- ☐ La aplicación arranca sin errores de conexión

---

## Checklist para Supabase (PostgreSQL)

- ☐ El proyecto en Supabase fue creado correctamente
- ☐ La contraseña de la base de datos está guardada
- ☐ `application-supabase.yml` tiene la URL JDBC de Supabase
- ☐ `application-supabase.yml` tiene `driver-class-name: org.postgresql.Driver`
- ☐ `pom.xml` tiene la dependencia `postgresql` con `scope: runtime`

---

## Checklist de pruebas

- ☐ `./mvnw spring-boot:run` funciona con H2 (perfil por defecto)
- ☐ `./mvnw spring-boot:run -Dspring.profiles.active=mysql` funciona con MySQL
- ☐ `./mvnw spring-boot:run -Dspring.profiles.active=supabase` funciona con Supabase
- ☐ `POST /ticket-app/tickets` persiste en la base de datos activa
- ☐ Los datos persisten tras reiniciar (excepto H2 con create-drop)

---

## Errores comunes

| Error | Causa probable | Solución |
|---|---|---|
| `Communications link failure` | MySQL no está corriendo | Iniciar MySQL en XAMPP |
| `Access denied for user 'root'` | Contraseña incorrecta | Dejar `password:` vacío en local |
| `Connection to db.xxx.supabase.co refused` | URL incorrecta | Copiar URL desde Supabase → Settings → Database |
| `No suitable driver found` | Driver faltante | Verificar dependencia en `pom.xml` |



<!-- START OF FILE: docs_lessons_11-database-config_05_actividad_individual.md -->
# Documento: docs lessons 11-database-config 05 actividad individual
---
# Lección 11 — Actividad individual: conectar Tickets a Supabase

## Contexto

Tu aplicación ya corre con H2 (perfil por defecto) o MySQL local (XAMPP). Esta actividad te pide conectarla a Supabase (PostgreSQL en la nube) y verificar que los tickets persisten correctamente.

---

## Parte 1: crear el proyecto en Supabase

1. Crea una cuenta en `https://supabase.com` si aún no tienes una
2. Crea un nuevo proyecto llamado `dsy1103-tickets`
3. Elige la región más cercana (São Paulo es la más cercana de Chile)
4. Anota la contraseña de la base de datos — no se puede recuperar después

---

## Parte 2: configurar el entorno para Supabase

Edita `.env.test` con los valores de tu proyecto en Supabase:

```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.TU_HOST.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=TU_CONTRASEÑA
```

> **¿Dónde encuentro el host?**
> En Supabase → **Project Settings** → **Database** → **Connection string** → pestaña **JDBC**. El host es la parte `db.xxxx.supabase.co`.

Luego copia ese archivo como `.env` activo:

```bash
copy .env.test .env
```

---

## Parte 3: arrancar con el perfil Supabase

```bash
./mvnw.cmd spring-boot:run
```

Verifica en los logs:
```
The following profiles are active: supabase
HikariPool-1 - Start completed.
```

---

## Parte 4: verificar la tabla en Supabase

En el **Table Editor** de Supabase, verifica que la tabla `tickets` fue creada automáticamente por Hibernate.

Luego prueba desde tu cliente HTTP:

| Prueba | Endpoint | Resultado esperado |
|---|---|---|
| Crear ticket | `POST /ticket-app/tickets` | `201 Created`, ticket guardado en Supabase |
| Listar tickets | `GET /ticket-app/tickets` | Datos en la nube |
| Reiniciar app | — | Los tickets siguen presentes |

---

## Parte 5: volver a MySQL local

Cambia el entorno activo a MySQL:

```bash
copy .env.dev .env
./mvnw.cmd spring-boot:run
```

Verifica que la aplicación vuelve a usar MySQL local sin modificar ningún archivo Java.

El objetivo es que puedas cambiar entre bases de datos en menos de un minuto, cambiando solo el `.env`.

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| `.env.test` configurado correctamente con credenciales de Supabase | 25% |
| Aplicación arranca con perfil `supabase` y logs confirman conexión | 25% |
| Tabla `tickets` visible en Supabase Table Editor | 20% |
| `POST` y `GET` funcionan con datos persistidos en la nube | 20% |
| La aplicación vuelve a MySQL cambiando solo el `.env` | 10% |



<!-- START OF FILE: docs_lessons_11-database-config_06_guia_intellij_env.md -->
# Documento: docs lessons 11-database-config 06 guia intellij env
---
# 🚀 Guía: Cargar Variables de Entorno en IntelliJ IDEA

## El Problema

Cuando ejecutas tu aplicación desde IntelliJ, Spring Boot no carga automáticamente el archivo `.env`. Las credenciales de base de datos se quedan vacías y la conexión falla.

---

## Conceptos Clave

| Concepto | Descripción |
|----------|-------------|
| **Perfil** | Archivo YAML (`application-{profile}.yml`) con configuración |
| **Entorno** | Valores de variables para ese perfil |

### Relación Perfil-Entorno

| Entorno | Perfil | Archivo |
|--------|-------|---------|
| local | h2 | `.env.local` |
| dev | mysql | `.env.dev` |
| test | supabase | `.env.test` |
| prod | supabase | `.env.prod` |

---

## Solución: Plugin EnvFile

### Paso 1: Instala el plugin

1. **File** → **Settings** → **Plugins**
2. Busca "EnvFile" e instala
3. Reinicia IntelliJ

### Paso 2: Configura Run Configuration

1. **Run** → **Edit Configurations...**
2. Selecciona la configuración de Spring Boot
3. En la pestaña **"EnvFile"**, habilita **"Enable EnvFile"**
4. Selecciona el archivo `.env` que corresponda:
   - `.env.local` → desarrollo rápido
   - `.env.dev` → MySQL
   - `.env.test` → Supabase (pruebas)
   - `.env.prod` → Supabase (producción)
5. **Apply** → **OK**

### Paso 3: Ejecuta

Usa el botón ▶ o Shift+F10

Verifica en los logs:
```
The following profiles are active: mysql
HikariPool-1 - Start completed.
```

---

## Solución Alternativa: Variables Manuales

1. **Run** → **Edit Configurations...**
2. En **Environment variables**, agrega:
   ```
   SPRING_PROFILES_ACTIVE=mysql;DB_HOST=localhost;DB_PORT=3306;DB_NAME=tickets_db;DB_USER=root;DB_PASSWORD=
   ```
   (Windows usa `;`, Linux/macOS usa `:`)
3. **Apply** → **OK**

---

## Referencia de Variables por Entorno

### LOCAL (.env.local)
```env
SPRING_PROFILES_ACTIVE=h2
```
Sin variables adicionales.

### DEV (.env.dev)
```env
SPRING_PROFILES_ACTIVE=mysql
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=
```

### TEST (.env.test)
```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.xxx.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=your-password
```

### PROD (.env.prod)
```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.yyy.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=prod-password
```

---

## Solución Automática: spring-dotenv

Agrega al `pom.xml`:
```xml
<dependency>
    <groupId>me.paulschwarz</groupId>
    <artifactId>spring-dotenv</artifactId>
    <version>4.0.0</version>
</dependency>
```

Spring cargará `.env` automáticamente.

---

## Troubleshooting

| Error | Solución |
|-------|----------|
| "Connection refused" | Verifica que la BD esté corriendo |
| "No profile active" | Define `SPRING_PROFILES_ACTIVE` |
| "Credential errors" | Verifica usuario y password en `.env` |

---

*[← Volver a Lección 11](01_objetivo_y_alcance.md)*


<!-- START OF FILE: docs_lessons_11-database-config_07_resumen_archivos.md -->
# Documento: docs lessons 11-database-config 07 resumen archivos
---
# 📋 Resumen: Archivos de Configuración

## Perfiles vs Entornos

| Concepto | Descripción |
|----------|-------------|
| **Perfil** | Archivo de configuración (`application-{profile}.yml`) |
| **Entorno** | Valores de las variables para ese perfil |

### Relación Perfil-Entorno

| Perfil | Archivo | Entornos que lo usan |
|--------|---------|---------------------|
| `h2` | `application-h2.yml` | local |
| `mysql` | `application-mysql.yml` | dev |
| `supabase` | `application-supabase.yml` | test, prod |

---

## Estructura de Archivos

```
Tickets-11/
├── src/main/resources/
│   ├── application.yml              ← Configuración base (todos los perfiles)
│   ├── application-h2.yml           ← Perfil: H2 (memoria)
│   ├── application-mysql.yml        ← Perfil: MySQL (XAMPP)
│   └── application-supabase.yml     ← Perfil: Supabase (PostgreSQL)
├── .env.example                     ← Plantilla de variables (commitear)
├── .env.local                      ← Entorno local (perfil: h2)
├── .env.dev                        ← Entorno dev (perfil: mysql)
├── .env.test                       ← Entorno test (perfil: supabase)
├── .env.prod                       ← Entorno prod (perfil: supabase)
└── .gitignore                     ← Contiene .env
```

---

## 1. `application.yml` — Base

**Uso:** Configuración común a todos los perfiles.

```yaml
spring:
  application:
    name: Tickets
  jpa:
    show-sql: false
    properties:
      hibernate:
        format_sql: true

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"

logging:
  level:
    root: INFO
    cl.duoc.fullstack: DEBUG
```

---

## 2. `application-h2.yml` — Perfil H2

**Uso:** Desarrollo rápido, tests. La BD se reinicia cada vez que arranca la app.

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:tickets_db;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
    driver-class-name: org.h2.Driver
    username: sa
    password: ''
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: create-drop
    show-sql: true
```

**Activar:** Perfil `h2` (usado por entorno `local`)

---

## 3. `application-mysql.yml` — Perfil MySQL

**Uso:** Base de datos persistente local (XAMPP).

```yaml
spring:
  datasource:
    url: jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:tickets_db}?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: ${DB_USER:root}
    password: ${DB_PASSWORD:}
  jpa:
    database-platform: org.hibernate.dialect.MySQLDialect
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true
```

**Variables de entorno (para entorno dev):**
```env
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=
```

**Activar:** Perfil `mysql` (usado por entorno `dev`)

---

## 4. `application-supabase.yml` — Perfil Supabase

**Uso:** Base de datos PostgreSQL en la nube (Supabase).

```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:postgres}
    driver-class-name: org.postgresql.Driver
    username: ${DB_USER:postgres}
    password: ${DB_PASSWORD}
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        format_sql: true

logging:
  level:
    root: WARN
    cl.duoc.fullstack: INFO
```

**Variables de entorno:**
```env
DB_HOST=db.xxxxxxxxxxxx.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=tu-contraseña
```

**Activar:** Perfil `supabase` (usado por entornos `test` y `prod`)

---

## 5. Archivos de Entorno

### `.env.local` (Perfil: h2)
```env
SPRING_PROFILES_ACTIVE=h2
```
Ningún valor adicional necesario.

### `.env.dev` (Perfil: mysql)
```env
SPRING_PROFILES_ACTIVE=mysql
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=
```

### `.env.test` (Perfil: supabase)
```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.test.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=test-password
```

### `.env.prod` (Perfil: supabase)
```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.prod.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=prod-password
```

---

## 6. `.env.example` — Plantilla

**Uso:** Referencia pública. Se sube al repositorio.

```env
# Environment variables for Tickets application
# Copy this file to .env and configure your values

# Perfil activo (h2, mysql, supabase)
SPRING_PROFILES_ACTIVE=h2

# MySQL Configuration (used by perfil: mysql)
# DB_HOST=localhost
# DB_PORT=3306
# DB_NAME=tickets_db
# DB_USER=root
# DB_PASSWORD=

# Supabase Configuration (used by perfil: supabase)
# DB_HOST=db.xxxxxxxxxxxx.supabase.co
# DB_PORT=5432
# DB_NAME=postgres
# DB_USER=postgres
# DB_PASSWORD=your-password
```

---

## Matriz: Cuándo Usar Cada Entorno

| Entorno | Perfil | Variables | Cuándo Usar |
|--------|-------|----------|-------------|
| **local** | `h2` | - | Desarrollo rápido, tests |
| **dev** | `mysql` | `DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USER`, `DB_PASSWORD` | Desarrollo con MySQL/XAMPP |
| **test** | `supabase` | Supabase test credentials | Pruebas en la nube |
| **prod** | `supabase` | Supabase prod credentials | Entrega final |

---

## Cómo Activar un Entorno

### Opción 1: Copiar archivo .env
```bash
copy .env.local .env    # Perfil: h2
copy .env.dev .env      # Perfil: mysql
copy .env.test .env     # Perfil: supabase
copy .env.prod .env     # Perfil: supabase

./mvnw spring-boot:run
```

### Opción 2: Variable de entorno
```bash
# PowerShell
$env:SPRING_PROFILES_ACTIVE="mysql"
./mvnw.cmd spring-boot:run

# bash
SPRING_PROFILES_ACTIVE=mysql ./mvnw spring-boot:run
```

### Opción 3: Línea de comandos
```bash
./mvnw spring-boot:run -Dspring.profiles.active=mysql
```

---

## Checklist de Configuración

- ✅ Creaste `.env` copiando `.env.local`, `.env.dev`, `.env.test` o `.env.prod`
- ✅ Llenaste las credenciales en `.env` (excepto en local)
- ✅ `.env` está en `.gitignore`
- ✅ Tienes la base de datos corriendo (XAMPP o Supabase)
- ✅ Ejecutaste la app y verificaste los logs

---

## Flujo de Carga

```
1. application.yml (base)
        ↓
2. application-{perfil}.yml (perfil activo)
        ↓
3. Variables de entorno (.env o sistema)
        ↓
App configurada y corriendo
```

---

*[← Volver a Lección 11](01_objetivo_y_alcance.md)*


<!-- START OF FILE: docs_lessons_11-database-config_08_mapa_de_decisiones.md -->
# Documento: docs lessons 11-database-config 08 mapa de decisiones
---
# 🗺️ Mapa de Decisiones: Qué Perfil Usar

```mermaid
flowchart TD
    q{"¿Cuál es tu<br/>caso de uso?"}
    q -->|"Desarrollo<br/>ultra rápido"| h2[H2 MEMORY<br/>en memoria]
    q -->|"Desarrollo local<br/>datos persiste" | mysql[MYSQL<br/>XAMPP]
    q -->|"Producción /<br/>Entrega final" | supabase[SUPABASE<br/>PostgreSQL]
    h2 --> perf_h2[Perfil: h2]
    mysql --> perf_mysql[Perfil: mysql]
    supabase --> perf_supabase[Perfil: supabase]
    perf_h2 --> res_h2[BD se reinicia<br/>cada ejecución<br/>Requiere: nada]
    perf_mysql --> res_mysql[BD persistente<br/>en tu PC<br/>Requiere: XAMPP]
    perf_supabase --> res_supabase[BD en nube<br/>accesible siempre<br/>Requiere: cuenta]
```

---

## 🎯 Por Etapa del Proyecto

```mermaid
flowchart LR
    subgraph "Semana 1-2: Aprendizaje"
        step1[./mvnw spring-boot:run<br/>H2 por defecto]
        step2[./mvnw spring-boot:run<br/>--spring.profiles.active=mysql]
    end
    step1 -->|"o bien"| step2
    step2 --> semana3[Semana 3: Entrega Final]
    semana3 --> f1[Copia .env.example a .env]
    f1--> f2[Rellena credenciales]
    f2--> f3[export SPRING_PROFILES_ACTIVE=supabase]
    f3--> f4[./mvnw spring-boot:run]
```

---

## 🔀 Cambiar de Perfil en 3 Formas

### Forma 1️⃣: Línea de Comandos
```bash
./mvnw spring-boot:run \
  -Dspring-boot.run.arguments="--spring.profiles.active=mysql"
```

### Forma 2️⃣: Variable de Entorno (Recomendado)
```bash
# Windows (PowerShell)
$env:SPRING_PROFILES_ACTIVE="mysql"
./mvnw spring-boot:run

# Linux/macOS
export SPRING_PROFILES_ACTIVE=mysql
./mvnw spring-boot:run
```

### Forma 3️⃣: Archivo `.env` + IntelliJ
1. Crea `.env` con `SPRING_PROFILES_ACTIVE=mysql`
2. Instala plugin **EnvFile** en IntelliJ
3. Configura Run Configuration para cargar `.env`
4. Ejecuta (botón ▶)

---

## 📊 Matriz de Compatibilidad

| Característica | H2 | MySQL | Supabase |
|---|:---:|:---:|:---:|
| BD en memoria | ✅ | ❌ | ❌ |
| Datos persistentes | ❌ | ✅ | ✅ |
| Requiere software adicional | ❌ | XAMPP | Cuenta online |
| Acceso desde otro PC | ❌ | ❌ | ✅ |
| Gratis | ✅ | ✅ | ✅ (limits) |
| Para producción | ❌ | ❌ | ✅ |
| Requiere variables de entorno | ❌ | ❌ | ✅ |

---

## 🛠️ Troubleshooting Rápido

### "No puedo conectarme a MySQL"
```bash
# Verifica que XAMPP está corriendo
# Verifica que la BD "tickets_db" existe en phpMyAdmin
# Verifica application-mysql.yml tiene URL correcta
```

### "Variables de entorno no cargan"
```bash
# En IntelliJ: Instala plugin EnvFile
# O define manualmente en Edit Configurations → Environment variables
# O usa: spring-dotenv (ver pom.xml)
```

### "Supabase connection refused"
```bash
# Verifica que DB_HOST, DB_USER, DB_PASSWORD son correctos
# Verifica que la IP de tu PC está en IP whitelist de Supabase (Settings)
```

---

*Para más detalles, ve a [Guión Paso a Paso](02_guion_paso_a_paso.md)*



<!-- START OF FILE: docs_lessons_11-database-config_09_ejemplo_env_completo.md -->
# Documento: docs lessons 11-database-config 09 ejemplo env completo
---
# 📝 Ejemplo: Archivos de Entorno

## Conceptos Clave

| Concepto | Descripción |
|----------|-------------|
| **Perfil** | Archivo YAML (`application-{profile}.yml`) con configuración de BD |
| **Entorno** | Valores de las variables para un perfil específico |

### Relación Perfil-Entorno

| Entorno | Perfil | Base de Datos |
|--------|-------|-------------|
| local | h2 | H2 (memoria) |
| dev | mysql | MySQL (XAMPP) |
| test | supabase | Supabase (PostgreSQL) |
| prod | supabase | Supabase (PostgreSQL) |

---

## Entorno 1: LOCAL (Perfil: h2)

**Cuándo usarlo:** Desarrollo rápido, tests, sin persistencia de datos.

### Archivo: `.env.local`
```env
# Ambiente LOCAL - desarrollo rápido
# Perfil: h2
SPRING_PROFILES_ACTIVE=h2
```

**Sin variables adicionales** — el perfil h2 no necesita credenciales.

### Cómo ejecutarlo
```bash
# Opción A: Copiar .env.local a .env
copy .env.local .env
./mvnw spring-boot:run

# Opción B: Variable de entorno
$env:SPRING_PROFILES_ACTIVE="h2"
./mvnw.cmd spring-boot:run
```

### Resultado esperado en logs
```
The following profiles are active: h2
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

---

## Entorno 2: DEV (Perfil: mysql)

**Cuándo usarlo:** Desarrollo diario con datos persistentes (XAMPP).

### Archivo: `.env.dev`
```env
# Ambiente DEV - MySQL local
# Perfil: mysql
SPRING_PROFILES_ACTIVE=mysql

# MySQL Configuration
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=
```

### Prerequisites
1. XAMPP instalado y MySQL corriendo
2. Base de datos `tickets_db` creada en phpMyAdmin

### Cómo ejecutarlo
```bash
# Opción A: Copiar .env.dev a .env
copy .env.dev .env
./mvnw spring-boot:run

# Opción B: Variable de entorno
$env:SPRING_PROFILES_ACTIVE="mysql"
./mvnw.cmd spring-boot:run
```

### Resultado esperado en logs
```
The following profiles are active: mysql
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

---

## Entorno 3: TEST (Perfil: supabase)

**Cuándo usarlo:** Pruebas con base de datos en la nube (Supabase).

### Archivo: `.env.test`
```env
# Ambiente TEST - Supabase (pruebas)
# Perfil: supabase
SPRING_PROFILES_ACTIVE=supabase

# Supabase Configuration
DB_HOST=db.xxxxxxxxxxxx.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=your-test-password
```

### Dónde obtener los valores

1. **DB_HOST**: Supabase → Settings → Database → Connection string
2. **DB_PORT**: Siempre `5432`
3. **DB_NAME**: Siempre `postgres`
4. **DB_USER**: Siempre `postgres`
5. **DB_PASSWORD**: La que creaste en Supabase

### Cómo ejecutarlo
```bash
# Opción A: Copiar .env.test a .env
copy .env.test .env
./mvnw spring-boot:run

# Opción B: Variable de entorno
$env:SPRING_PROFILES_ACTIVE="supabase"
./mvnw.cmd spring-boot:run
```

### Resultado esperado en logs
```
The following profiles are active: supabase
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

---

## Entorno 4: PROD (Perfil: supabase)

**Cuándo usarlo:** Entrega final, producción.

### Archivo: `.env.prod`
```env
# Ambiente PROD - Supabase (producción)
# Perfil: supabase (mismo que test, valores diferentes)
SPRING_PROFILES_ACTIVE=supabase

# Supabase Configuration
DB_HOST=db.yyyyyyyyyyyy.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=your-prod-password
```

**Nota:** Usa el mismo perfil `supabase` que test, pero con diferentes valores de conexión.

### Cómo ejecutarlo
```bash
# Opción A: Copiar .env.prod a .env
copy .env.prod .env
./mvnw spring-boot:run

# Opción B: Variable de entorno
$env:SPRING_PROFILES_ACTIVE="supabase"
./mvnw.cmd spring-boot:run
```

---

## 🎯 Cómo Cambiar de Entorno

### Cambiar solo el archivo .env
```bash
# Desarrollo rápido
copy .env.local .env

# Desarrollo con MySQL
copy .env.dev .env

# Pruebas en Supabase
copy .env.test .env

# Producción
copy .env.prod .env

./mvnw spring-boot:run
```

### Cambiar perfil sin editar .env
Edita la línea `SPRING_PROFILES_ACTIVE`:
```env
# Perfil: h2
SPRING_PROFILES_ACTIVE=h2

# Perfil: mysql
SPRING_PROFILES_ACTIVE=mysql

# Perfil: supabase
SPRING_PROFILES_ACTIVE=supabase
```

---

## 🔒 Seguridad: Checklist Final

**Antes de hacer commit:**

- ✅ `.env` **no está** en el repositorio (verificar `.gitignore`)
- ✅ `.env.example` **sí está** en el repositorio
- ✅ `.env.local`, `.env.dev`, `.env.test`, `.env.prod` están en `.gitignore`
- ✅ Nunca subas credenciales reales

**Comando para verificar:**
```bash
git status .env
# Debería mostrar: .env (not tracked)
```

---

*[← Volver a Lección 11](01_objetivo_y_alcance.md)*


<!-- START OF FILE: docs_lessons_11-database-config_10_cheat_sheet.md -->
# Documento: docs lessons 11-database-config 10 cheat sheet
---
# 🚀 Cheat Sheet — Referencia Rápida Lección 11

## Perfiles vs Entornos

| Concepto | Descripción |
|----------|-------------|
| **Perfil** | Archivo YAML (`application-{profile}.yml`) |
| **Entorno** | Valores de variables para ese perfil |

### Relación Perfil-Entorno

| Entorno | Perfil | Base de Datos |
|--------|-------|-------------|
| local | h2 | H2 (memoria) |
| dev | mysql | MySQL (XAMPP) |
| test | supabase | Supabase (PostgreSQL) |
| prod | supabase | Supabase (PostgreSQL) |

---

## Cuatro Comandos para Arrancar

```bash
# Entorno LOCAL (H2)
copy .env.local .env
./mvnw.cmd spring-boot:run

# Entorno DEV (MySQL/XAMPP)
copy .env.dev .env
./mvnw.cmd spring-boot:run

# Entorno TEST (Supabase)
copy .env.test .env
./mvnw.cmd spring-boot:run

# Entorno PROD (Supabase)
copy .env.prod .env
./mvnw.cmd spring-boot:run
```

O directamente con perfil:
```bash
./mvnw.cmd spring-boot:run -Dspring.profiles.active=h2
./mvnw.cmd spring-boot:run -Dspring.profiles.active=mysql
./mvnw.cmd spring-boot:run -Dspring.profiles.active=supabase
```

---

## Estructura de Archivos

```
src/main/resources/
├── application.yml              ← Base (común a todos)
├── application-h2.yml        ← Perfil: h2
├── application-mysql.yml     ← Perfil: mysql
└── application-supabase.yml ← Perfil: supabase

.env.local                  ← Entorno: local (perfil: h2)
.env.dev                  ← Entorno: dev (perfil: mysql)
.env.test                 ← Entorno: test (perfil: supabase)
.env.prod                 ← Entorno: prod (perfil: supabase)
.env.example               ← Plantilla
```

---

## Variables por Entorno

### LOCAL (no necesita variables)
```env
SPRING_PROFILES_ACTIVE=h2
```

### DEV
```env
SPRING_PROFILES_ACTIVE=mysql
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=
```

### TEST / PROD
```env
SPRING_PROFILES_ACTIVE=supabase
DB_HOST=db.xxx.supabase.co
DB_PORT=5432
DB_NAME=postgres
DB_USER=postgres
DB_PASSWORD=tu-password
```

---

## Matriz de Decisión

| Caso | Entorno | Perfil | Cuándo |
|------|--------|-------|--------|
| Tests rápidos | local | h2 | Sin persistencia |
| Desarrollo diario | dev | mysql | Con XAMPP |
| Pruebas en nube | test | supabase | Supabase test |
| Entrega final | prod | supabase | Supabase prod |

---

## Cómo Sé que Funcionó?

Busca en los logs:
```
The following profiles are active: [tu-perfil]
HikariPool-1 - Start completed.
```

Luego prueba: http://localhost:8080/ticket-app/tickets

---

## Seguridad

- ✅ `.env.example` → commitear
- ❌ `.env`, `.env.local`, `.env.dev`, `.env.test`, `.env.prod` → NO commitear
- 🔒 Credenciales reales → solo en `.env` local

---

## Troubleshooting

**"Connection refused"**
→ Verifica que la base de datos esté corriendo y credenciales sean correctas

**"No profile is active"**
→ Define `SPRING_PROFILES_ACTIVE` en variable de entorno o `.env`

**"¿Cuál perfil estoy usando?"**
→ Mira los logs: `The following profile is active: ...`

---

*[← Volver a Lección 11](01_objetivo_y_alcance.md)*


<!-- START OF FILE: docs_lessons_11-database-config_11_flujo_completo.md -->
# Documento: docs lessons 11-database-config 11 flujo completo
---
# 🔗 Flujo Completo: Cómo Todo se Conecta

## 1️⃣ Flujo de Carga al Arrancar Spring Boot

```mermaid
flowchart TD
    start[./mvnw spring-boot:run] --> config[Lee application.yml<br/>Puerto: 8080<br/>Perfil: h2]
    config --> env{"¿Hay .env<br/>cargado?"}
    env -->|"Sí"| load_env[Lee SPRING_PROFILES_ACTIVE]
    env -->|"No"| use_default[Usa valores por defecto]
    load_env --> use_default
    use_default --> profile{"¿Perfil activo?"}
    profile -->|h2| h2[application-h2.yml]
    profile -->|mysql| mysql[application-mysql.yml]
    profile -->|supabase| supabase[application-supabase.yml]
    h2 --> var1{"¿Tiene ${VAR}?"}
    mysql --> var2{"¿Tiene ${VAR}?"}
    supabase --> var3{"¿Tiene ${VAR}?"}
    var1 -->|"Sí"| resolve[Busca en .env]
    var2 --> resolve
    var3 --> resolve
    resolve --> final[Configuración FINAL]
    var1 -->|"No"| final
    var2 -->|"No"| final
    var3 -->|"No"| final
    final --> hikari[Hikari Connection Pool]
    hikari --> connect{Connection?}
    connect -->|"Éxito"| ok[App arrancada]
    connect -->|"Fallo"| fail[Error: Connection refused]
```

---

## 2️⃣ Ejemplo Práctico: Cambiar de MySQL a Supabase

```mermaid
flowchart LR
    subgraph Antes["ANTES (MySQL local)"]
        E1[.env<br/>SPRING_PROFILES_ACTIVE=mysql<br/>MYSQL_USERNAME=root]
    end
    subgraph Después["DESPUÉS (Supabase)"]
        E2[.env MODIFICADO<br/>SPRING_PROFILES_ACTIVE=supabase<br/>DB_HOST=db.xxxx.supabase.co]
    end
    E1 --> Y1[application-mysql.yml] --> Conn1[jdbc:mysql://localhost:3306]
    E2 --> Y2[application-supabase.yml] --> Conn2[jdbc:postgresql://db.xxxx.supabase.co:5432]
```

---

## 3️⃣ Dónde Entra cada Concepto

```mermaid
flowchart TB
    subgraph Java["Tu código Java (Controller, Service, Repository, Model)"]
        code[NO CAMBIA]
    end
    
    subgraph Config["Spring Boot Configuration<br/>application-{profile}.yml + .env"]
        conf[AQUÍ CAMBIA<br/>DB URL, User, Password]
    end
    
    subgraph Hibernate["Hibernate + Driver JDBC"]
        hib[MySQL Driver<br/>PostgreSQL Driver<br/>H2 Driver]
    end
    
    subgraph DB["Base de Datos Real"]
        dbs["H2 | MySQL | PostgreSQL<br/>Solo una activa a la vez"]
    end
    
    code --> conf
    conf --> hib
    hib --> dbs
```

---

## 4️⃣ Checklist: Verificación en Cada Paso

| Paso | Verificación |
|------|----------------|
| 1 | `application.yml`, `-h2.yml`, `-mysql.yml`, `-supabase.yml` existen |
| 2 | `.env.example` existe, `.env` local NO en Git, `.gitignore` protege `.env*` |
| 3 | Plugin EnvFile instalado o variables de entorno definidas |
| 4 | Logs muestran perfil activo y `HikariPool-1 - Start completed.` |
| 5 | `.env` NO en repositorio, `.env.example` SÍ |

---

## 5️⃣ Traducción: De Concepto a Acción

```mermaid
flowchart TD
    C["CONCEPTO: MySQL sin credenciales hardcodeadas"] --> A1["Crea application-mysql.yml<br/>spring.datasource.username: ${DB_USER}"]
    A1 --> A2["Crea .env.dev con valores reales:<br/>DB_USER=root"]
    A2 --> A3["copy .env.dev .env"]
    A3 --> A4[Spring Boot lee las variables al arrancar]
    A4 --> R[Conecta a MySQL sin exponer credenciales]
```

---

## 6️⃣ Flujo de Diagnóstico: Si Algo No Funciona

```
🔴 Error: "Connection refused"
• ¿Verificaste que la BD está corriendo? (XAMPP, Supabase, H2)
• ¿Verificaste las credenciales? (Host, Puerto, User/Password)
• ¿Verificaste que cargó el perfil? (busca en logs)

🔴 Error: "Variables vacías"
• ¿Instalaste plugin EnvFile?
• ¿Configuraste Run Configuration para usar .env?
• O define manualmente en Environment variables

🔴 Logs dicen "The following profiles are active: []"
• Verifica application.yml tiene spring.profiles.active
• O pasa --spring.profiles.active=mysql

✅ Logs dicen "HikariPool-1 - Connection is working..."
→ TODO FUNCIONA
```

## 6️⃣ Flujo de Diagnóstico: Si Algo No Funciona

```
🔴 Error: "Connection refused"
├─ ¿Verificaste que la BD está corriendo?
│  ├─ MySQL: XAMPP iniciado ✓
│  ├─ Supabase: Accesible desde Internet ✓
│  └─ H2: Siempre está disponible ✓
│
├─ ¿Verificaste las credenciales?
│  ├─ Host: correcto
│  ├─ Puerto: 3306 (MySQL), 5432 (Supabase)
│  └─ Usuario/password: sin typos
│
└─ ¿Verificaste que cargó el perfil?
   └─ Busca en logs: "The following profiles are active: ..."

🔴 Error: "Variables vacías"
├─ ¿Instalaste plugin EnvFile?
├─ ¿Configuraste tu Run Configuration para usar .env?
├─ O define manualmente en Edit Configurations → Environment variables
└─ O usa librería spring-dotenv en pom.xml

🔴 Logs dicen "The following profiles are active: []"
├─ Verifica application.yml tiene spring.profiles.active
└─ O pasa -Dspring-boot.run.arguments="--spring.profiles.active=mysql"

✅ Logs dicen "HikariPool-1 - Start completed."
└─ ¡TODO FUNCIONA! Accede a http://localhost:8080/ticket-app/tickets
```

---

*[← Volver a Lección 11](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_11-database-config_README.md -->
# Documento: docs lessons 11-database-config README
---
# 📚 Lección 11 — Configurar Bases de Datos Reales con Perfiles de Spring Boot

> Aprende a usar **perfiles de Spring Boot** para manejar múltiples configuraciones de base de datos (H2, MySQL, Supabase) y **variables de entorno** para proteger credenciales.

---

## 🎯 ¿Qué Aprenderás?

✅ Configurar múltiples bases de datos con perfiles de Spring Boot  
✅ Manejar variables de entorno de forma segura con `.env`  
✅ Conectar a H2 (en memoria), MySQL (local) y Supabase (en la nube)  
✅ Cambiar entre perfiles sin modificar el código Java  
✅ Cargar variables de entorno desde IntelliJ IDEA  

---

## 📖 Documentos

| Documento | Duración | Para |
|-----------|----------|------|
| **[01. Objetivo y Alcance](01_objetivo_y_alcance.md)** | 5 min | Entender qué aprenderás |
| **[02. Guión Paso a Paso](02_guion_paso_a_paso.md)** ⭐ | 30 min | Instrucciones prácticas |
| **[03. MySQL vs PostgreSQL](03_mysql_vs_postgresql.md)** | 10 min | Entender diferencias |
| **[06. Guía IntelliJ](06_guia_intellij_env.md)** | 5 min | Cargar `.env` en IDE |
| **[07. Resumen de Archivos](07_resumen_archivos.md)** | 5 min | Referencia rápida |
| **[08. Mapa de Decisiones](08_mapa_de_decisiones.md)** | 5 min | Decisiones visuales |
| **[04. Checklist](04_checklist_rubrica_minima.md)** | 5 min | Verificar completitud |
| **[05. Actividad Individual](05_actividad_individual.md)** | - | Tu tarea |

---

## 🚀 Quick Start (2 min)

### Opción 1: H2 (el más fácil, sin instalar nada)
```bash
cd Tickets
./mvnw spring-boot:run
```
✅ Accede a http://localhost:8080/ticket-app/tickets

### Opción 2: MySQL Local
```bash
cd Tickets
./mvnw spring-boot:run \
  -Dspring-boot.run.arguments="--spring.profiles.active=mysql"
```

### Opción 3: Supabase (en la nube)
```bash
cd Tickets
# 1. Copia .env.example a .env
cp .env.example .env
# 2. Edita .env con tus credenciales de Supabase
# 3. Ejecuta:
export SPRING_PROFILES_ACTIVE=supabase
./mvnw spring-boot:run
```

---

## 📂 Estructura de Archivos

```
Tickets/
├── src/main/resources/
│   ├── application.yml              ← Base común (todos los perfiles)
│   ├── application-h2.yml           ← H2 en memoria
│   ├── application-mysql.yml        ← MySQL local
│   └── application-supabase.yml     ← Supabase PostgreSQL
│
├── .env.example                     ← Plantilla (subir a Git ✅)
├── .env.local                      ← Ambiente local (H2)
├── .env.dev                        ← Ambiente dev (MySQL)
├── .env.test                       ← Ambiente test (Supabase)
├── .env.prod                       ← Ambiente prod (Supabase)
└── .gitignore                     ← Incluye .env
```

---

## 🎯 Los Tres Perfiles

| Perfil | BD | Dónde | Cuándo Usar | Arranca | Requiere |
|--------|-----|-------|------------|---------|----------|
| **h2** | H2 (memoria) | Tu PC | Desarrollo rápido | `./mvnw spring-boot:run` | - |
| **mysql** | MySQL | Tu PC | Desarrollo con datos | `-Dspring.profiles.active=mysql` | XAMPP |
| **supabase** | PostgreSQL | Nube | Test/Producción | `-Dspring.profiles.active=supabase` | Variables de entorno |

---

## 🏠 Ambientes (Environments)

Cada ambiente usa un perfil diferente y tiene su propio archivo `.env`:

| Ambiente | Perfil | BD | Archivo .env |
|----------|--------|-----|--------------|
| **local** | h2 | H2 (memoria) | `.env.local` |
| **dev** | mysql | MySQL (XAMPP) | `.env.dev` |
| **test** | supabase | Supabase | `.env.test` |
| **prod** | supabase | Supabase | `.env.prod` |

### Cómo usar

```bash
# Copiar el archivo de ambiente que necesites
cp .env.local .env    # Para desarrollo rápido
cp .env.dev .env       # Para desarrollo con MySQL
cp .env.test .env     # Para pruebas
cp .env.prod .env     # Para producción

# Ejecutar la aplicación
./mvnw spring-boot:run
```

---

## 🔐 Variables de Entorno

Cada archivo `.env` incluye el perfil a usar:

```bash
# .env.local (desarrollo rápido)
SPRING_PROFILES_ACTIVE=h2

# .env.dev (desarrollo con MySQL)
SPRING_PROFILES_ACTIVE=mysql
DB_URL=jdbc:mysql://localhost:3306/tickets_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
DB_USER=root
DB_PASSWORD=

# .env.test / .env.prod (Supabase)
SPRING_PROFILES_ACTIVE=supabase
DB_URL=jdbc:postgresql://[HOST]:5432/postgres
DB_USER=postgres
DB_PASSWORD=[TU_PASSWORD]
```

**Protección:**
- ✅ `.env.*` → NO commitear (contienen credenciales)
- ✅ `.gitignore` → incluye `.env*`
- ✅ Solo `.env.example` → commitear (plantilla sin datos reales)

---

## 💡 Cómo Funcionan los Perfiles

```mermaid
flowchart TD
    base[application.yml<br/>Puerto: 8080<br/>Perfil: h2] --> q{Cuál perfil?}
    q -->|"spring.profiles.active=h2"| h2[h2 → application-h2.yml]
    q -->|"spring.profiles.active=mysql"| mysql[mysql → application-mysql.yml]
    q -->|"spring.profiles.active=supabase"| supabase[supabase → application-supabase.yml]
    h2 --> boot1[Spring Boot]
    mysql --> boot2[Spring Boot + .env]
    supabase --> boot3[Spring Boot + .env]
    boot1 --> run[App iniciada]
    boot2 --> run
    boot3 --> run
```

---

## 🧪 Verificación

Después de arrancar, deberías ver en los logs:

```
The following profiles are active: mysql
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
```

Luego accede a: **http://localhost:8080/ticket-app/tickets**

---

## 🛠️ Para IntelliJ IDEA

1. Instala plugin **EnvFile**
2. Ve a **[Guía IntelliJ](06_guia_intellij_env.md)**
3. Configura tu Run Configuration
4. Ejecuta (botón ▶)

---

## 📝 Tu Actividad

Ve a **[Actividad Individual](05_actividad_individual.md)** para tu tarea.

---

## 🤔 Dudas Frecuentes

**P: ¿Cuál perfil debo usar en desarrollo?**  
R: H2 para empezar (rápido), luego MySQL si necesitas datos persistentes.

**P: ¿Y si no puedo conectar a Supabase?**  
R: Ve a **[Mapa de Decisiones](08_mapa_de_decisiones.md)** → Troubleshooting

**P: ¿Debo commitear `.env`?**  
R: **Nunca.** Commitea `.env.example`, protege `.env` en `.gitignore`.

**P: ¿Puedo usar esta configuración en producción?**  
R: Sí, Supabase está listo para producción. Para más control, usa Docker/Kubernetes.

---

**[← Volver a Lecciones](../)**



<!-- START OF FILE: docs_lessons_12-relations_01_objetivo_y_alcance.md -->
# Documento: docs lessons 12-relations 01 objetivo y alcance
---
# Lección 12 — Relaciones entre entidades: usuario creador y usuario asignado

## ¿De dónde venimos?

Tu aplicación persiste tickets en base de datos real. Pero todos los tickets son anónimos: nadie sabe quién los creó ni quién está trabajando en ellos.

En un sistema de soporte real, eso no es aceptable.

---

## El problema que resolvemos

Un ticket tiene dos relaciones con personas:

- **Creador:** quién reportó el problema. Se asigna al crear el ticket y no cambia.
- **Asignado:** el técnico que está trabajando en él. Puede cambiar mientras el ticket está abierto.

En la base de datos, esto se representa con **claves foráneas** (foreign keys):

```
tabla tickets                tabla users
─────────────                ────────────
id                           id
title                        name
description                  email
status
created_by_id  ──────────►  id   (FK: quién lo creó)
assigned_to_id ──────────►  id   (FK: quién está asignado)
```

En Java, JPA traduce estas claves foráneas en referencias directas entre objetos.

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás:

1. Una nueva entidad `User` con su repositorio, servicio y controlador
2. La entidad `Ticket` con dos relaciones `@ManyToOne` a `User`
   - `createdBy`: el usuario que creó el ticket (requerido, se vincula por email)
   - `assignedTo`: el usuario asignado al ticket (opcional, se asigna con PATCH)
3. La entidad `User` con dos relaciones `@OneToMany` (el lado inverso de `@ManyToOne`):
   - `createdTickets`: tickets que el usuario ha creado
   - `assignedTickets`: tickets asignados al usuario
4. `@Column` con personalización de nombres y restricciones
5. `@JoinColumn` para nombrar explícitamente las claves foráneas
6. Endpoints para crear usuarios (`POST /users`) y crear/asignar tickets (`POST /tickets`, `PATCH /tickets/{id}`)
7. DTOs de respuesta (`TicketResult`, `UserResult`) para exponer datos anidados sin serialización circular
8. Excepción personalizada `BadRequestException` para distinguir errores de negocio (409) de errores de cliente (400)

### Lo que vas a poder explicar

- ¿Qué es el "lado dueño" de una relación JPA?
- ¿Qué significa `@ManyToOne` y en qué lado de la relación va?
- ¿Qué significa `@OneToMany` y por qué usa `mappedBy`?
- ¿Qué hace `@JoinColumn` y por qué se necesita?
- ¿Por qué `@Table(name = "users")` y no `@Table(name = "user")`?
- ¿Cuál es la diferencia entre el lado "uno" y el lado "muchos" de una relación?
- ¿Cuándo usar `@OneToOne` en lugar de `@ManyToOne`?
- ¿Por qué `@ManyToMany` casi nunca se usa si la base de datos está normalizada (3FN)?

---

## Nuevos requerimientos

| Requerimiento | Descripción |
|---|---|
| **REQ-16** | Cada ticket debe registrar qué usuario lo creó |
| **REQ-17** | Cada ticket puede ser asignado a un usuario; la asignación puede cambiar |

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── model/
│   └── Ticket.java              ← entidad JPA sin relaciones
├── respository/
│   └── TicketRepository.java
├── service/
│   └── TicketService.java
└── controller/
    └── TicketController.java
```

La estructura al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── exception/
│   └── BadRequestException.java     ← nueva excepción personalizada
├── model/
│   ├── Ticket.java              ← con @ManyToOne a User (createdBy, assignedTo)
│   └── User.java                ← nueva entidad con @OneToMany (createdTickets, assignedTickets)
├── respository/
│   ├── TicketRepository.java
│   └── UserRepository.java      ← nuevo, incluye findByEmail()
├── service/
│   ├── TicketService.java       ← actualizado: busca usuario por email, nuevo assignTicket()
│   └── UserService.java         ← nuevo
├── controller/
│   ├── TicketController.java    ← actualizado: POST acepta email, nuevo PATCH /tickets/{id}
│   └── UserController.java      ← nuevo
└── dto/
    ├── TicketRequest.java       ← actualizado con createdByEmail
    ├── TicketResult.java        ← nuevo DTO de respuesta con UserResult anidado
    ├── AssignTicketRequest.java ← nuevo DTO para PATCH
    ├── UserRequest.java         ← nuevo
    └── UserResult.java          ← nuevo DTO de respuesta de usuario
```

---

## ¿Qué NO cubre esta lección?

| Tema | ¿Cuándo se ve? |
|---|---|
| Tabla de historial de cambios | Lección 13 |
| `@ManyToMany` en profundidad | Se menciona en esta lección junto a la razón por la que no la usamos (3FN) |
| `fetch = LAZY` vs `EAGER` y el problema N+1 | Se explica en el archivo conceptual de esta lección |
| DTOs de respuesta con datos anidados | Cubierto en esta lección con `TicketResult` y `UserResult` |



<!-- START OF FILE: docs_lessons_12-relations_02_guion_paso_a_paso.md -->
# Documento: docs lessons 12-relations 02 guion paso a paso
---
# Lección 12 — Tutorial paso a paso: relaciones entre entidades

---

## Paso 1: crear la entidad `User`

Crea el archivo `src/main/java/cl/duoc/fullstack/tickets/model/User.java`:

```java
package cl.duoc.fullstack.tickets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "El nombre es requerido")
  @Column(nullable = false, length = 100)
  private String name;

  @NotBlank(message = "El email es requerido")
  @Email(message = "El email no tiene un formato válido")
  @Column(nullable = false, unique = true, length = 150)
  private String email;
}
```

> **¿Por qué `@Table(name = "users")` y no `@Table(name = "user")`?**
> `USER` es una función reservada en SQL (tanto MySQL como PostgreSQL la usan para obtener el usuario conectado). Si nombras la tabla `user`, el motor de base de datos puede confundirse al parsear las consultas. Usar `users` (plural) evita el conflicto y sigue la convención de nombrar tablas en plural.

> **¿Qué hace `@Email`?**
> Es una anotación de validación de Jakarta Bean Validation que verifica que el valor tenga formato de correo electrónico (`algo@dominio.com`). Funciona junto con `@Valid` en el controlador, igual que `@NotBlank`.

---

## Paso 2: crear `UserRequest` (DTO de entrada)

Crea `src/main/java/cl/duoc/fullstack/tickets/dto/UserRequest.java`:

```java
package cl.duoc.fullstack.tickets.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

  @NotBlank(message = "El nombre es requerido")
  private String name;

  @NotBlank(message = "El email es requerido")
  @Email(message = "El email no tiene un formato válido")
  private String email;
}
```

---

## Paso 3: crear `UserRepository`

Crea `src/main/java/cl/duoc/fullstack/tickets/respository/UserRepository.java`:

```java
package cl.duoc.fullstack.tickets.respository;

import cl.duoc.fullstack.tickets.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  boolean existsByEmail(String email);

  Optional<User> findByEmail(String email);
}
```

---

## Paso 4: crear `UserService`

Crea `src/main/java/cl/duoc/fullstack/tickets/service/UserService.java`:

```java
package cl.duoc.fullstack.tickets.service;

import cl.duoc.fullstack.tickets.dto.UserRequest;
import cl.duoc.fullstack.tickets.model.User;
import cl.duoc.fullstack.tickets.respository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository repository;

  public UserService(UserRepository repository) {
    this.repository = repository;
  }

  public List<User> getAll() {
    return repository.findAll();
  }

  public User create(UserRequest request) {
    if (repository.existsByEmail(request.getEmail())) {
      throw new IllegalArgumentException(
          "Ya existe un usuario con el email '" + request.getEmail() + "'");
    }
    User user = new User();
    user.setName(request.getName());
    user.setEmail(request.getEmail());
    return repository.save(user);
  }

  public Optional<User> getById(Long id) {
    return repository.findById(id);
  }
}
```

---

## Paso 5: crear `UserController`

Crea `src/main/java/cl/duoc/fullstack/tickets/controller/UserController.java`:

```java
package cl.duoc.fullstack.tickets.controller;

import cl.duoc.fullstack.tickets.dto.UserRequest;
import cl.duoc.fullstack.tickets.model.User;
import cl.duoc.fullstack.tickets.service.UserService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping
  public List<User> getAll() {
    return service.getAll();
  }

  @PostMapping
  public ResponseEntity<?> create(@Valid @RequestBody UserRequest request) {
    try {
      User created = service.create(request);
      return ResponseEntity.status(HttpStatus.CREATED).body(created);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.status(HttpStatus.CONFLICT)
          .body(new cl.duoc.fullstack.tickets.model.ErrorResponse(e.getMessage()));
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id) {
    return service.getById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
}
```

---

## Paso 6: agregar las relaciones a `Ticket`

Abre `Ticket.java` y agrega los dos campos de relación. Primero las importaciones necesarias:

```java
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
```

Luego los campos dentro de la clase, después de `effectiveResolutionDate`:

```java
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "created_by_id")
  private User createdBy;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "assigned_to_id")
  private User assignedTo;
```

**¿Qué hace cada anotación?**

| Anotación | Qué hace |
|---|---|
| `@ManyToOne` | Define la relación: muchos tickets pueden pertenecer a un mismo usuario |
| `fetch = FetchType.LAZY` | No carga el `User` de la base de datos hasta que se accede al campo |
| `@JoinColumn(name = "created_by_id")` | Nombra la columna FK en la tabla `tickets` |

> **¿Por qué no se necesita `@JsonIgnoreProperties`?**
> El entity `Ticket` nunca sale directamente del controlador — `TicketService` lo convierte a `TicketResult` antes de retornarlo. Como Jackson nunca serializa el entity, no hay riesgo de error con objetos LAZY.

> **¿Qué es `FetchType.LAZY`?**
> Cuando cargas un `Ticket`, JPA no carga automáticamente el `User` asociado. Lo carga solo si accedes a `ticket.getCreatedBy()`. Esto mejora el rendimiento: si listas 100 tickets, no haces 100 consultas adicionales a la tabla `users`.
>
> El alternativo `FetchType.EAGER` carga el `User` siempre junto con el `Ticket`. Para relaciones `@ManyToOne` el defecto es `EAGER`, por eso lo especificamos explícitamente como `LAZY`.

---

## Paso 7: actualizar `TicketRequest`

Agrega el campo `createdByEmail` (requerido) a `TicketRequest.java`:

```java
  // Campos ya existentes:
  @NotBlank(message = "El titulo es requerido")
  private String title;

  @NotBlank
  private String description;

  // Campo nuevo — requerido para POST:
  @NotBlank(message = "El email del creador es requerido")
  @Email(message = "El email no tiene un formato válido")
  private String createdByEmail;
```

> **Nota:** La asignación a un usuario (`assignedToEmail`) se realiza por separado mediante `PATCH /tickets/{id}`. No se incluye en el POST.

---

## Paso 8: actualizar `TicketService`

Antes de actualizar el servicio, crea la excepción personalizada que usaremos para distinguir errores de cliente (400) de errores de negocio (409).

Crea `src/main/java/cl/duoc/fullstack/tickets/exception/BadRequestException.java`:

```java
package cl.duoc.fullstack.tickets.exception;

public class BadRequestException extends RuntimeException {
  public BadRequestException(String message) {
    super(message);
  }
}
```

Ahora actualiza `TicketService.java`. El método `create()` busca el usuario **por email** antes de crear el ticket:

```java
@Service
public class TicketService {

  private TicketRepository repository;
  private UserRepository userRepository;

  public TicketService(TicketRepository repository, UserRepository userRepository) {
    this.repository = repository;
    this.userRepository = userRepository;
  }

  public TicketResult create(TicketRequest request) {
    // 1. Validar título duplicado → 409 Conflict (regla de negocio)
    if (repository.existsByTitle(request.getTitle())) {
      throw new IllegalArgumentException(
          "Ya existe un ticket con el título '" + request.getTitle() + "'");
    }

    // 2. Buscar usuario creador por email → 400 Bad Request si no existe
    User creator = userRepository.findByEmail(request.getCreatedByEmail())
        .orElseThrow(() -> new BadRequestException(
            "El email '" + request.getCreatedByEmail() + "' no existe en el sistema"));

    // 3. Crear el ticket
    Ticket ticket = new Ticket();
    ticket.setTitle(request.getTitle());
    ticket.setDescription(request.getDescription());
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));
    ticket.setCreatedBy(creator);

    return toResult(repository.save(ticket));
  }

  public TicketResult updateById(Long id, TicketRequest request) {
    Ticket ticket = repository.findById(id)
        .orElseThrow(() -> new NoSuchElementException("Ticket con id " + id + " no encontrado"));
    ticket.setTitle(request.getTitle());
    ticket.setDescription(request.getDescription());
    if (request.getStatus() != null && !request.getStatus().isBlank()) {
      ticket.setStatus(request.getStatus());
    }
    return toResult(repository.save(ticket));
  }

  // ... getById(), deleteById(), getTickets() sin cambios

  private TicketResult toResult(Ticket ticket) {
    UserResult createdBy = ticket.getCreatedBy() != null
        ? new UserResult(ticket.getCreatedBy().getId(),
                         ticket.getCreatedBy().getName(),
                         ticket.getCreatedBy().getEmail())
        : null;
    UserResult assignedTo = ticket.getAssignedTo() != null
        ? new UserResult(ticket.getAssignedTo().getId(),
                         ticket.getAssignedTo().getName(),
                         ticket.getAssignedTo().getEmail())
        : null;
    return new TicketResult(
        ticket.getId(), ticket.getTitle(), ticket.getDescription(),
        ticket.getStatus(), ticket.getCreatedAt(), ticket.getEstimatedResolutionDate(),
        ticket.getEffectiveResolutionDate(), createdBy, assignedTo);
  }
}
```

> **¿Por qué `BadRequestException` (400) y no `IllegalArgumentException` (409)?**
> - `IllegalArgumentException` → **409 Conflict**: el cliente rompe una regla de negocio (título duplicado que ya existe en el sistema).
> - `BadRequestException` → **400 Bad Request**: el cliente envió datos inválidos (un email que no corresponde a ningún usuario).
> La distinción es semántica: 409 es "colisión", 400 es "dato incorrecto".

> **¿Por qué el Service usa `UserRepository` directamente?**
> Porque el Service coordina entre repositorios. Crear un ticket implica verificar que el usuario existe — esa es lógica de negocio que pertenece al Service, no al Controller.

---

## Paso 8.5: agregar `assignTicket()` a `TicketService`

La asignación de usuario es una operación separada del POST. Agrega este método al servicio:

```java
public Optional<TicketResult> assignTicket(Long ticketId, String assignedToEmail) {
  // 1. Si email vacío o null → desasignar
  if (assignedToEmail == null || assignedToEmail.isBlank()) {
    Optional<Ticket> ticketOpt = repository.findById(ticketId);
    if (!ticketOpt.isPresent()) {
      return Optional.empty();
    }
    Ticket ticket = ticketOpt.get();
    ticket.setAssignedTo(null);
    return Optional.of(toResult(repository.save(ticket)));
  }

  // 2. Validar que el usuario existe ANTES de buscar el ticket (400 Bad Request)
  User assignee = userRepository.findByEmail(assignedToEmail)
      .orElseThrow(() -> new BadRequestException(
          "El email '" + assignedToEmail + "' no existe en el sistema"));

  // 3. Buscar el ticket (404 si no existe)
  Optional<Ticket> ticketOpt = repository.findById(ticketId);
  if (!ticketOpt.isPresent()) {
    return Optional.empty();
  }

  // 4. Asignar y guardar
  Ticket ticket = ticketOpt.get();
  ticket.setAssignedTo(assignee);
  return Optional.of(toResult(repository.save(ticket)));
}
```

> **¿Por qué validar el email ANTES de buscar el ticket?**
> Principio de "fallo rápido": si el email es inválido, retornamos 400 inmediatamente sin hacer la consulta del ticket. Es más eficiente y da mejor feedback al cliente.

---

## Paso 8.6: crear `AssignTicketRequest` DTO

Crea `src/main/java/cl/duoc/fullstack/tickets/dto/AssignTicketRequest.java`:

```java
package cl.duoc.fullstack.tickets.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssignTicketRequest {

  @Email(message = "El email no tiene un formato válido")
  private String assignedToEmail;  // Opcional — null o vacío desasigna el ticket
}
```

> **¿Por qué solo `@Email` y no `@NotBlank`?**
> `@Email` valida el formato solo si el campo tiene un valor. Un campo `null` o vacío pasa la validación — eso es exactamente lo que queremos, porque vacío significa "desasignar".

---

## Paso 8.7: crear `TicketResult` y `UserResult` DTOs

Estos DTOs permiten que el JSON de respuesta incluya los datos completos del usuario (id, nombre, email) en lugar de solo el ID de la FK.

Crea `src/main/java/cl/duoc/fullstack/tickets/dto/UserResult.java`:

```java
package cl.duoc.fullstack.tickets.dto;

public record UserResult(
    Long id,
    String name,
    String email
) {}
```

Crea `src/main/java/cl/duoc/fullstack/tickets/dto/TicketResult.java`:

```java
package cl.duoc.fullstack.tickets.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TicketResult(
    Long id,
    String title,
    String description,
    String status,
    LocalDateTime createdAt,
    LocalDate estimatedResolutionDate,
    LocalDateTime effectiveResolutionDate,
    UserResult createdBy,
    UserResult assignedTo
) {}
```

El JSON de respuesta resultante tendrá esta forma:

```json
{
  "id": 1,
  "title": "Teclado no funciona",
  "status": "NEW",
  "createdBy": {
    "id": 1,
    "name": "Ana García",
    "email": "ana.garcia@empresa.com"
  },
  "assignedTo": null
}
```

---

## Paso 8.8: agregar `PATCH /tickets/{id}` al controlador

En `TicketController.java`, agrega el endpoint de asignación y actualiza el POST para capturar `BadRequestException`:

```java
@PostMapping
public ResponseEntity<?> create(@Valid @RequestBody TicketRequest request) {
  try {
    TicketResult result = service.create(request);
    return ResponseEntity.status(HttpStatus.CREATED).body(result);
  } catch (IllegalArgumentException e) {
    return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(e.getMessage()));
  } catch (BadRequestException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(e.getMessage()));
  }
}

@PatchMapping("/{id}")
public ResponseEntity<?> assignTicket(
    @PathVariable Long id,
    @Valid @RequestBody AssignTicketRequest request) {
  try {
    return service.assignTicket(id, request.getAssignedToEmail())
        .map(result -> ResponseEntity.ok(result))
        .orElse(ResponseEntity.notFound().build());
  } catch (BadRequestException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ErrorResponse(e.getMessage()));
  }
}
```

| Caso | HTTP |
|---|---|
| Email no existe en el sistema | `400 Bad Request` |
| Ticket no encontrado | `404 Not Found` |
| Asignación/desasignación exitosa | `200 OK` |

---

## Paso 9: Agregar @OneToMany en User

En `User.java`, agrega los imports necesarios:

```java
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;
```

Luego, dentro de la clase User después del campo email, agrega:

```java
@OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY)
private List<Ticket> createdTickets = new ArrayList<>();

@OneToMany(mappedBy = "assignedTo", fetch = FetchType.LAZY)
private List<Ticket> assignedTickets = new ArrayList<>();
```

**¿Qué hace cada parte?**

| Elemento | Propósito |
|----------|-----------|
| `@OneToMany` | Un User tiene muchos Tickets |
| `mappedBy = "createdBy"` | Apunta al campo @ManyToOne en Ticket |
| `fetch = FetchType.LAZY` | No carga tickets al obtener User (eficiente) |
| `new ArrayList<>()` | Inicializar vacía |

> **¿Por qué no se necesita `@JsonIgnore`?**
> `User` tampoco se serializa directamente — el servicio lo convierte a `UserResult` antes de retornarlo. Las listas `createdTickets` / `assignedTickets` nunca son expuestas al JSON de respuesta.

**Trade-off: LAZY vs EAGER**

Usamos `LAZY` porque:
- Si un User tiene 1000 tickets, no cargarlos todos es mucho más eficiente
- Cargamos solo cuando el cliente los necesita
- Por defecto `@OneToMany` es LAZY

Si un User tenía pocos tickets (< 10) y los necesitabas siempre: usarías `EAGER`

**Alternativa si el User tiene MÁS DE 100 tickets:**

En lugar de `@OneToMany`, usa función en TicketRepository:

```java
List<Ticket> findByCreatedById(Long userId);
List<Ticket> findByAssignedToId(Long userId);
```

El cliente controla cuándo cargarlos con paginación.

---

## Paso 10: probar la funcionalidad completa

### Crear un usuario

```
POST http://localhost:8080/ticket-app/users
Content-Type: application/json

{
  "name": "Ana García",
  "email": "ana.garcia@empresa.com"
}
```

Respuesta esperada: `201 Created` con el usuario incluyendo su `id`.

### Crear un segundo usuario

```
POST http://localhost:8080/ticket-app/users
Content-Type: application/json

{
  "name": "Carlos López",
  "email": "carlos.lopez@empresa.com"
}
```

### Crear un ticket con creador por email

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Teclado no funciona",
  "description": "Las teclas F1-F4 no responden",
  "createdByEmail": "ana.garcia@empresa.com"
}
```

Respuesta esperada: `201 Created`. El campo `createdBy` incluirá el objeto `User` completo. El campo `assignedTo` será `null`.

### Crear un ticket con email inexistente

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{
  "title": "Monitor parpadeante",
  "description": "El monitor parpadea al encender",
  "createdByEmail": "no-existe@empresa.com"
}
```

Respuesta esperada: `400 Bad Request` — el email no existe en el sistema.

### Asignar un ticket a un usuario (PATCH)

```
PATCH http://localhost:8080/ticket-app/tickets/1
Content-Type: application/json

{
  "assignedToEmail": "carlos.lopez@empresa.com"
}
```

Respuesta esperada: `200 OK` con el ticket actualizado y `assignedTo` con los datos de Carlos.

### Desasignar un ticket

```
PATCH http://localhost:8080/ticket-app/tickets/1
Content-Type: application/json

{
  "assignedToEmail": ""
}
```

Respuesta esperada: `200 OK` con `assignedTo: null`.

### Verificar en la base de datos

En phpMyAdmin o el Table Editor de Supabase, la tabla `tickets` debería mostrar las columnas `created_by_id` y `assigned_to_id` con los IDs correspondientes.

---

> Los DTOs `TicketResult` y `UserResult` se implementaron en **Paso 8.7**. Son requeridos en esta lección para exponer datos de usuario anidados en la respuesta JSON sin serialización circular.



<!-- START OF FILE: docs_lessons_12-relations_03_relaciones_jpa.md -->
# Documento: docs lessons 12-relations 03 relaciones jpa
---
# Lección 12 — Relaciones JPA: @ManyToOne, @OneToMany, @OneToOne y @ManyToMany

## Las dos caras de una relación

En una relación entre dos tablas hay siempre dos perspectivas:

```
Un User puede tener muchos Tickets   →  @OneToMany  (perspectiva del User)
Un Ticket pertenece a un solo User   →  @ManyToOne  (perspectiva del Ticket)
```

Son la misma relación vista desde cada extremo. JPA necesita que definas **al menos una de las dos perspectivas**. La otra es opcional y se llama "lado inverso".

---

## `@ManyToOne` — el lado dueño de la relación

```java
// En la clase Ticket:
@ManyToOne
@JoinColumn(name = "created_by_id")
private User createdBy;
```

`@ManyToOne` significa: "muchos `Ticket` pueden apuntar a un mismo `User`".

Este lado se llama **dueño** (*owner side*) de la relación porque es el que tiene la clave foránea en la tabla. La columna `created_by_id` existe en la tabla `tickets`, no en la tabla `users`.

```
tabla tickets              tabla users
──────────────             ────────────
id                         id
title                      name
created_by_id  ──────►    id     ← la FK vive en tickets
```

---

## `@JoinColumn` — el nombre de la clave foránea

```java
@ManyToOne
@JoinColumn(name = "created_by_id")
private User createdBy;
```

`@JoinColumn(name = "created_by_id")` define el nombre exacto de la columna FK en la tabla. Si omites `@JoinColumn`, Hibernate genera un nombre automático (generalmente `fieldname_id`). Es buena práctica siempre explicitarlo.

| Atributo | Qué hace | Ejemplo |
|---|---|---|
| `name` | Nombre de la columna FK | `created_by_id` |
| `nullable` | Si la FK puede ser NULL | `nullable = false` |
| `referencedColumnName` | Columna referenciada en la tabla destino (por defecto: PK) | Raramente se usa |

---

## `@OneToMany` — el lado inverso (opcional)

Si además quieres navegar desde un `User` hacia sus tickets:

```java
// En la clase User (lado inverso — no tiene FK propia):
@OneToMany(mappedBy = "createdBy")
private List<Ticket> createdTickets = new ArrayList<>();
```

`mappedBy = "createdBy"` le dice a JPA: "la FK está en el campo `createdBy` de la clase `Ticket`". El lado `@OneToMany` no crea columna propia — apunta al `@ManyToOne` que ya tiene la FK.

> **Sobre serialización circular:** `@OneToMany` puede causar bucle infinito si el entity se serializa directamente a JSON (`User` → `createdTickets` → `Ticket.createdBy` → `User` → ...). La solución correcta — y la que usa esta lección — es **no exponer el entity**: el Service convierte `Ticket` a `TicketResult` y `User` a `UserResult` antes de retornarlos. Jackson nunca ve el entity directamente.

**En esta lección, `@OneToMany` en `User` ES REQUERIDO.** Lo implementaremos en Paso 9 del tutorial.

---

## Trade-off: @OneToMany con LAZY vs EAGER

`@OneToMany` por defecto es `LAZY` (no carga automáticamente todos los tickets).

| Estrategia | Comportamiento | Cuándo usar |
|-----------|----------------|------------|
| **LAZY** (defecto) | Carga tickets solo si llamas `user.getCreatedTickets()` | Usuario puede tener muchos tickets (100+, 1000+) |
| **EAGER** | Carga TODOS los tickets siempre | Usuario tiene pocos tickets típicamente (< 10) |

**Ejemplo LAZY (recomendado):**
```java
@OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY)
private List<Ticket> createdTickets = new ArrayList<>();
```
Cuando cargas un User, los tickets NO se cargan. Se cargan solo si accedes a `user.getCreatedTickets()`.

**Alternativa: Si el User puede tener > 100 tickets**

No uses `@OneToMany`. En su lugar, crea función en TicketRepository:

```java
public interface TicketRepository extends JpaRepository<Ticket, Long> {
  List<Ticket> findByCreatedById(Long userId);
  Page<Ticket> findByCreatedById(Long userId, Pageable pageable);
}
```

El cliente carga tickets ON-DEMAND con paginación. Mejor rendimiento.

---

## `@Column` — personalizar columnas

Atributos más usados y cuándo aplicarlos:

```java
// Texto obligatorio con longitud máxima
@Column(nullable = false, length = 100)
private String name;

// Texto largo sin límite de longitud
@Column(nullable = false, columnDefinition = "TEXT")
private String description;

// Valor único en toda la tabla (como un email)
@Column(nullable = false, unique = true, length = 150)
private String email;

// Nombre distinto al del campo Java (para seguir convención snake_case en SQL)
@Column(name = "created_at")
private LocalDateTime createdAt;

// Número con precisión exacta (para precios)
@Column(precision = 10, scale = 2)
private BigDecimal price;
```

Si omites `@Column`, Hibernate crea la columna con el nombre del campo, acepta NULL y usa el tipo por defecto para ese tipo Java.

---

## `FetchType.LAZY` vs `FetchType.EAGER`

Cuando cargas un `Ticket`, ¿cuándo se carga el `User` asociado?

| `FetchType` | Comportamiento | SQL generado |
|---|---|---|
| `LAZY` | Carga el `User` solo cuando accedes a `ticket.getCreatedBy()` | 1 query para `Ticket` + 1 query para `User` solo si se accede |
| `EAGER` | Carga el `User` siempre, junto con el `Ticket` | 1 query con JOIN que ya incluye el `User` |

**¿Cuál usar?**

- `@ManyToOne` tiene `EAGER` por defecto en JPA, pero conviene cambiarlo a `LAZY` para evitar cargas innecesarias
- `@OneToMany` tiene `LAZY` por defecto — es el comportamiento correcto

```java
@ManyToOne(fetch = FetchType.LAZY)   // ← especificar explícitamente
@JoinColumn(name = "created_by_id")
private User createdBy;
```

> **¿Qué es el problema N+1?**
> Si cargas N tickets con EAGER y cada uno tiene un User, JPA hace 1 query para los tickets + N queries para los usuarios = N+1 queries. Con LAZY + un JOIN cuando sea necesario, lo reduces a 1 o 2 queries. Para este curso, LAZY es suficiente. En producción, esto se gestiona con `@EntityGraph` o JPQL con `JOIN FETCH`.

---

## Resumen: las 4 anotaciones de relación

| Anotación | En qué clase va | Para qué sirve | FK |
|---|---|---|---|
| `@ManyToOne` | La que tiene la FK (ej: `Ticket`) | "Este Ticket apunta a un User" | En esta tabla |
| `@JoinColumn` | Junto con `@ManyToOne` o `@OneToOne` | Define el nombre de la columna FK | — |
| `@OneToMany(mappedBy=...)` | La que NO tiene la FK (ej: `User`) | "Un User tiene muchos Tickets" | En la otra tabla |
| `@OneToOne` | La que tiene la FK única | "Esta entidad pertenece a exactamente otra" | En esta tabla (`UNIQUE`) |
| `@ManyToMany` | Cualquiera de las dos | "Muchos A ↔ muchos B" (raro en producción, reemplazar con entidad intermedia) | Tabla intermedia |


---

## El esquema resultante en la base de datos

Después de agregar las relaciones, Hibernate crea este esquema:

```sql
CREATE TABLE users (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    email       VARCHAR(150) NOT NULL UNIQUE
);

CREATE TABLE tickets (
    id                        BIGINT AUTO_INCREMENT PRIMARY KEY,
    title                     VARCHAR(50) NOT NULL,
    description               TEXT NOT NULL,
    status                    VARCHAR(20) NOT NULL,
    created_at                DATETIME,
    estimated_resolution_date DATE,
    effective_resolution_date DATETIME,
    created_by_id             BIGINT,     -- FK → users.id
    assigned_to_id            BIGINT,     -- FK → users.id
    FOREIGN KEY (created_by_id)  REFERENCES users(id),
    FOREIGN KEY (assigned_to_id) REFERENCES users(id)
);
```

No escribes este SQL. Hibernate lo genera según las anotaciones.

---

## `@OneToOne` — Relación 1 a 1

Usa `@OneToOne` cuando **una entidad pertenece exactamente a otra, y viceversa**.

**Ejemplo en nuestro sistema:** un Ticket puede tener un `AuditLog` que registra exactamente cuándo fue creado y por quién, de forma única e irrepetible — un log por ticket, un ticket por log.

```java
// En la clase Ticket:
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "audit_log_id", unique = true)
private AuditLog auditLog;
```

La diferencia clave con `@ManyToOne` es que la FK tiene restricción `UNIQUE`: no puede haber dos tickets apuntando al mismo `AuditLog`.

```
tabla tickets              tabla audit_logs
──────────────             ─────────────────
id                         id
audit_log_id (UNIQUE) ──►  id
```

**Cuando elegir `@OneToOne` vs `@ManyToOne`:**

| Pregunta | `@OneToOne` | `@ManyToOne` |
|---|---|---|
| ¿Puede haber dos A apuntando a la misma B? | No | Sí |
| ¿La FK en la tabla tiene `UNIQUE`? | Sí | No |
| Ejemplo | Ticket → AuditLog | Ticket → User |

> **Consejo:** Si no estás seguro, pregúntate: "¿puede otro registro usar la misma entidad destino?". Si la respuesta es no → `@OneToOne`. Si es sí → `@ManyToOne`.

---

## `@ManyToMany` — Por qué casi nunca la usamos

`@ManyToMany` modela una relación donde muchos registros de A se relacionan con muchos de B.

**Ejemplo teórico:** un Ticket puede tener varias Etiquetas (`Tag`), y una etiqueta puede estar en varios tickets.

En JPA se vería así:

```java
// En Ticket:
@ManyToMany
@JoinTable(
    name = "ticket_tags",
    joinColumns = @JoinColumn(name = "ticket_id"),
    inverseJoinColumns = @JoinColumn(name = "tag_id")
)
private List<Tag> tags = new ArrayList<>();
```

JPA crea automáticamente una **tabla intermedia** (`ticket_tags`) con dos columnas FK.

**¿Por qué casi nunca la usamos en producción?**

La **Tercera Forma Normal (3FN)** establece que toda dependencia funcional debe pasar por la clave primaria. En una `@ManyToMany` pura, la tabla intermedia solo tiene dos FKs — no puede guardar atributos adicionales sobre la relación (¿cuándo se asignó el tag?, ¿quién lo asignó?).

En cuanto necesitas guardar datos SOBRE la relación, la tabla intermedia se convierte en una entidad propia:

```
❌ @ManyToMany puro (tabla intermedia sin atributos):
   ticket_tags(ticket_id, tag_id)

✅ Entidad intermedia normalizada (3FN):
   ticket_tags(id, ticket_id, tag_id, assigned_at, assigned_by_id)
   → Ahora es @ManyToOne desde TicketTag a Ticket y a Tag
```

**Regla práctica:** si la relación tiene o podría tener atributos propios en el futuro → usa dos `@ManyToOne` apuntando a una entidad intermedia. Es más flexible y cumple 3FN.

```java
// Entidad intermedia (la forma correcta normalizada):
@Entity
@Table(name = "ticket_tags")
public class TicketTag {

  @ManyToOne
  @JoinColumn(name = "ticket_id")
  private Ticket ticket;

  @ManyToOne
  @JoinColumn(name = "tag_id")
  private Tag tag;

  @Column(name = "assigned_at")
  private LocalDateTime assignedAt;
}
```

> **Resumen:** `@ManyToMany` existe en JPA pero, gracias a la normalización de bases de datos (3FN), en la práctica casi siempre la reemplazamos por una entidad intermedia con dos `@ManyToOne`. Esto es más mantenible, extensible y coherente con el modelo relacional.

---



<!-- START OF FILE: docs_lessons_12-relations_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 12-relations 04 checklist rubrica minima
---
# Lección 12 — Checklist y rúbrica mínima

---

## Checklist de `User.java`

- ☐ La clase tiene `@Entity` y `@Table(name = "users")` (plural, evita conflicto con palabra reservada SQL)
- ☐ El campo `id` tiene `@Id` y `@GeneratedValue(strategy = GenerationType.IDENTITY)`
- ☐ El campo `name` tiene `@Column(nullable = false, length = 100)`
- ☐ El campo `email` tiene `@Column(nullable = false, unique = true, length = 150)` y `@Email`
- ☐ La clase tiene `@NoArgsConstructor` (requerido por JPA)
- ☐ Todas las importaciones son de `jakarta.persistence.*`
- ☐ Tiene campo `createdTickets` con `@OneToMany(mappedBy = "createdBy", fetch = FetchType.LAZY)`
- ☐ Tiene campo `assignedTickets` con `@OneToMany(mappedBy = "assignedTo", fetch = FetchType.LAZY)`
- ☐ Ambas colecciones inicializadas con `new ArrayList<>()`

---

## Checklist de `UserRequest.java`

- ☐ Existe el archivo `UserRequest.java` en el paquete `dto`
- ☐ Tiene los campos `name` y `email` con sus validaciones (`@NotBlank`, `@Email`)

---

## Checklist de `UserRepository.java`

- ☐ Es una interfaz que extiende `JpaRepository<User, Long>`
- ☐ Tiene `boolean existsByEmail(String email)`
- ☐ Tiene `Optional<User> findByEmail(String email)`

---

## Checklist de `UserService.java`

- ☐ Tiene `getAll()` que retorna `repository.findAll()`
- ☐ Tiene `create(UserRequest request)` que verifica duplicado por email con `existsByEmail()` antes de guardar
- ☐ Tiene `getById(Long id)` que retorna `Optional<User>`
- ☐ Lanza `IllegalArgumentException` cuando el email ya existe

---

## Checklist de `UserController.java`

- ☐ Mapeado en `/users`
- ☐ `GET /users` → lista todos los usuarios
- ☐ `POST /users` → crea usuario con `@Valid`, devuelve `201 Created` o `409 Conflict`
- ☐ `GET /users/{id}` → devuelve `200 OK` o `404 Not Found`

---

## Checklist de `Ticket.java` (relaciones)

- ☐ Tiene el campo `createdBy` con `@ManyToOne(fetch = FetchType.LAZY)` y `@JoinColumn(name = "created_by_id")`
- ☐ Tiene el campo `assignedTo` con `@ManyToOne(fetch = FetchType.LAZY)` y `@JoinColumn(name = "assigned_to_id")`
- ☐ **No** hay `@OneToMany` en `Ticket` apuntando a `User` (la dirección es Ticket → User, no al revés)

---

## Checklist de `TicketRequest.java`

- ☐ Tiene el campo `createdByEmail` con `@NotBlank` y `@Email` — requerido para POST
- ☐ **No** tiene `assignedToId` ni `createdById` — la vinculación es por email, la asignación se hace con PATCH

---

## Checklist de `BadRequestException.java`

- ☐ Existe la clase `BadRequestException` en el paquete `exception`
- ☐ Extiende `RuntimeException`
- ☐ Tiene un constructor `BadRequestException(String message)` que llama `super(message)`

---

## Checklist de `AssignTicketRequest.java`

- ☐ Existe el archivo `AssignTicketRequest.java` en el paquete `dto`
- ☐ Tiene el campo `assignedToEmail` con `@Email` (sin `@NotBlank` — null/vacío desasigna)

---

## Checklist de `TicketResult.java` y `UserResult.java`

- ☐ Existen ambos archivos en el paquete `dto`
- ☐ `UserResult` es un record con campos `id`, `name`, `email`
- ☐ `TicketResult` es un record con campos `id`, `title`, `description`, `status`, `createdAt`, `estimatedResolutionDate`, `effectiveResolutionDate`, `createdBy` (UserResult), `assignedTo` (UserResult)

---

## Checklist de `TicketService.java`

- ☐ El constructor recibe tanto `TicketRepository` como `UserRepository`
- ☐ `create()` busca el usuario por email con `userRepository.findByEmail()` (requerido)
- ☐ `create()` lanza `BadRequestException` (400) si el email no existe en el sistema
- ☐ `create()` lanza `IllegalArgumentException` (409) si el título ya existe
- ☐ `create()` **no** asigna `assignedTo` — eso se hace exclusivamente con `assignTicket()`
- ☐ `assignTicket()` asigna o desasigna un usuario a un ticket por email
- ☐ `assignTicket()` lanza `BadRequestException` si el email no existe
- ☐ `assignTicket()` retorna `Optional.empty()` si el ticket no existe → controlador responde 404
- ☐ `updateById()` actualiza título, descripción y estado, pero **no** modifica `createdBy` ni `assignedTo`
- ☐ Existe un método privado `toResult(Ticket)` que convierte la entidad en `TicketResult` con `UserResult` anidado

---

## Checklist de `TicketController.java`

- ☐ `POST /tickets` captura tanto `IllegalArgumentException` (409) como `BadRequestException` (400)
- ☐ `PATCH /tickets/{id}` acepta `AssignTicketRequest` con `@Valid`
- ☐ `PATCH /tickets/{id}` retorna 400 si email inválido, 404 si ticket no existe, 200 si OK

---

## Checklist de pruebas

- ☐ `POST /users` → crea usuario, `201 Created` con el objeto `User` incluyendo `id`
- ☐ `POST /users` con email duplicado → `409 Conflict`
- ☐ `POST /users` con email inválido → `400 Bad Request`
- ☐ `POST /tickets` con `createdByEmail` válido → ticket creado con el objeto `createdBy` anidado
- ☐ `POST /tickets` con `createdByEmail` inexistente → `400 Bad Request`
- ☐ `POST /tickets` sin `createdByEmail` → `400 Bad Request` (campo requerido)
- ☐ `PATCH /tickets/{id}` con `assignedToEmail` válido → ticket actualizado con `assignedTo` anidado
- ☐ `PATCH /tickets/{id}` con `assignedToEmail` vacío → `assignedTo` queda `null`
- ☐ `PATCH /tickets/{id}` con `assignedToEmail` inexistente → `400 Bad Request`
- ☐ `PATCH /tickets/{id}` con id que no existe → `404 Not Found`
- ☐ En la base de datos, las columnas `created_by_id` y `assigned_to_id` tienen los IDs correctos
- ☐ La tabla `users` existe en phpMyAdmin / Supabase con las columnas correctas

---

## Errores comunes

| Error | Causa probable | Solución |
|---|---|---|
| `StackOverflowError` al hacer `GET /tickets` | Se está retornando el entity directamente en vez de un DTO | Verificar que el Service retorne `TicketResult` / `UserResult`, no el entity |
| `could not initialize proxy` | Objeto LAZY accedido fuera de sesión JPA | Asegurarse de acceder a los datos dentro de la transacción del servicio |
| `Column 'created_by_id' cannot be null` | La columna tiene `nullable = false` pero se pasa null | Cambiar `@JoinColumn(name=..., nullable = false)` a `nullable = true` (la FK es opcional) |
| `Table 'users' doesn't exist` | `ddl-auto` no creó la tabla | Verificar que `User` tiene `@Entity` y reiniciar con `ddl-auto: update` |



<!-- START OF FILE: docs_lessons_12-relations_05_actividad_individual.md -->
# Documento: docs lessons 12-relations 05 actividad individual
---
# Lección 12 — Actividad Personal: Extender con Category

## ¿Qué es esta actividad?

Esta es una **ACTIVIDAD PERSONAL** que complementa el tutorial base.

En `02_guion_paso_a_paso.md` cubrimos:
- ✓ User (Entity, DTO, Repository, Service, Controller)
- ✓ Ticket (relaciones @ManyToOne a User, búsqueda por email)
- ✓ User con @OneToMany (Paso 9)
- ✓ DTOs de respuesta TicketResult / UserResult (Paso 8.7)
- ✓ Asignación con PATCH /tickets/{id} (Paso 8.8)

**Category** no tiene guion paso-a-paso. En su lugar, tienes directrices para diseñarla e implementarla autónomamente.

Esto es tu oportunidad de practicar el patrón completo:
Entity → DTO → Repository → Service → Controller

---

## Directrices: Implementa Category Autónomamente

Sigue el mismo patrón que `User` del tutorial:

### 1. Crear la entidad `Category`

En `src/main/java/cl/duoc/fullstack/tickets/model/Category.java`:

- `@Entity` y `@Table(name = "categories")`
- Campo `id` con `@Id` y `@GeneratedValue`
- Campo `name` con `@Column(nullable = false, unique = true, length = 100)` y `@NotBlank`
- Campo `description` con `@Column(columnDefinition = "TEXT")` y `@NotBlank`
- Anotaciones Lombok: `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`

### 2. Crear `CategoryRequest` DTO

En `src/main/java/cl/duoc/fullstack/tickets/dto/CategoryRequest.java`:

- Campos: `name`, `description`
- Validaciones: `@NotBlank` en ambos
- Lombok: `@Getter`, `@Setter`

### 3. Crear `CategoryRepository`

En `src/main/java/cl/duoc/fullstack/tickets/respository/CategoryRepository.java`:

- Extiende `JpaRepository<Category, Long>`
- Métodos útiles: `existsByName()`, `findByName()`

### 4. Crear `CategoryService`

En `src/main/java/cl/duoc/fullstack/tickets/service/CategoryService.java`:

- `getAll()` lista todas
- `create(CategoryRequest)` valida duplicado por name
- `getById(Long id)` retorna Optional
- Excepciones: `IllegalArgumentException` si name duplicado

### 5. Crear `CategoryController`

En `src/main/java/cl/duoc/fullstack/tickets/controller/CategoryController.java`:

- `@RestController` en `/categories`
- `GET /categories` lista
- `POST /categories` crea con `@Valid`, `201 Created` o `409 Conflict`
- `GET /categories/{id}` por id

### 6. Agregar @ManyToOne a Ticket

En `Ticket.java`:

```java
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "category_id")
private Category category;
```

### 7. Agregar `categoryId` a `TicketRequest`

```java
private Long categoryId;  // opcional
```

### 8. Actualizar `TicketService`

En el método `create()`, resuelve la categoría si se proporciona `categoryId`
(análogo a `createdByEmail` — busca en repositorio y lanza excepción si no existe).

### 9. Pruebas

- POST /categories (crear categorías)
- GET /categories (listar)
- POST /tickets con categoryId válido
- GET /tickets (verificar vinculación)

### 10. Desafío Opcional

Implementa filtro por categoría:

```
GET /tickets?categoryId=1
```

Agrega a `TicketRepository`:
```java
List<Ticket> findByCategoryId(Long categoryId);
```

Agrega a `TicketController`:
```java
@GetMapping
public List<Ticket> list(@RequestParam(required = false) Long categoryId) {
  if (categoryId != null) {
    return ticketService.findByCategory(categoryId);
  }
  return ticketService.getAll();
}
```



<!-- START OF FILE: docs_lessons_13-history_01_objetivo_y_alcance.md -->
# Documento: docs lessons 13-history 01 objetivo y alcance
---
# Lección 13 — Tabla de historial: @OneToMany y registro automático de cambios

## ¿De dónde venimos?

Tu aplicación ahora:

- Persiste tickets en base de datos real (L10)
- Conecta a MySQL local o Supabase en la nube (L11)
- Relaciona tickets con usuarios creadores y asignados (L12)

Pero hay un vacío importante: **cuando el estado de un ticket cambia, esa información se pierde**. Si un ticket pasa de `NEW` a `IN_PROGRESS` y luego a `RESOLVED`, no hay registro de cuándo ocurrió cada cambio ni quién lo hizo.

En soporte técnico, esa trazabilidad es fundamental: permite auditar tiempos de respuesta, identificar cuellos de botella y cumplir con acuerdos de nivel de servicio (SLA).

---

## ¿Qué vas a construir?

Al terminar esta lección tendrás:

1. Una nueva entidad `TicketHistory` que registra cada cambio de estado Y de asignado de un ticket
2. La relación `@OneToMany` en `Ticket` → `TicketHistory`
3. Un DTO de respuesta `TicketHistoryResult` para exponer el historial sin exponer la entidad directamente
4. El `TicketService` actualizado para registrar historial automáticamente en `updateById()` y `assignTicket()`
5. Un endpoint `GET /tickets/by-id/{id}/history` en `TicketController` (no hay `TicketHistoryController`)

### Lo que vas a poder explicar

- ¿Qué hace `@OneToMany(mappedBy = "...", cascade = CascadeType.ALL)` en `Ticket`?
- ¿Qué hace `@ManyToOne` en `TicketHistory` apuntando a `Ticket`?
- ¿Qué significa `CascadeType.ALL` y cuándo usarlo?
- ¿Por qué el historial nunca se debe borrar?
- ¿Cómo registra el Service el historial sin que el Controller lo sepa?
- ¿Por qué `TicketHistory` no tiene un controller propio? ¿Qué es una entidad débil?
- ¿Por qué el historial de asignado guarda el email como String y no como FK a User?
- ¿Por qué no se necesita `@JsonIgnore` en las entities de historial?

---

## Nuevo requerimiento

| Requerimiento | Descripción |
|---|---|
| **REQ-18** | El sistema debe registrar automáticamente un historial de cambios de cada ticket: cambios de estado (con el estado anterior y el nuevo) y cambios de asignado (con el email del asignado anterior y el nuevo), incluyendo la fecha y hora de cada cambio |

---

## La estructura que tienes al comenzar

```
src/main/java/cl/duoc/fullstack/tickets/
├── model/
│   ├── Ticket.java
│   └── User.java
├── respository/
│   ├── TicketRepository.java
│   └── UserRepository.java
├── service/
│   ├── TicketService.java
│   └── UserService.java
└── controller/
    ├── TicketController.java
    └── UserController.java
```

La estructura al terminar:

```
src/main/java/cl/duoc/fullstack/tickets/
├── model/
│   ├── Ticket.java              ← con @OneToMany a TicketHistory
│   ├── User.java
│   └── TicketHistory.java       ← nueva entidad
├── dto/
│   ├── TicketRequest.java
│   ├── TicketCommand.java
│   ├── TicketResult.java
│   ├── TicketResponse.java
│   ├── UserRequest.java
│   ├── UserResult.java
│   ├── AssignTicketRequest.java
│   └── TicketHistoryResult.java  ← nuevo DTO de respuesta
├── respository/
│   ├── TicketRepository.java
│   ├── UserRepository.java
│   └── TicketHistoryRepository.java   ← nuevo
├── service/
│   ├── TicketService.java       ← registra historial en updateById() y assignTicket()
│   └── UserService.java
└── controller/
    ├── TicketController.java    ← nuevo endpoint GET /by-id/{id}/history
    └── UserController.java
```

---

## ¿Qué NO cubre esta lección?

| Tema | ¿Por qué queda afuera? |
|---|---|
| `@CreatedDate`, `@LastModifiedDate` (Spring Data Auditing) | Configuración adicional; el patrón manual es más claro para aprender |
| Quién realizó el cambio (`changedByEmail`) | Lo verás en la actividad individual |
| Notificaciones al cambiar estado | Fuera del alcance del curso |
| Paginación del historial | Requiere `Pageable`; el historial por ticket es pequeño en este contexto |


<!-- START OF FILE: docs_lessons_13-history_02_guion_paso_a_paso.md -->
# Documento: docs lessons 13-history 02 guion paso a paso
---
# Lección 13 — Tutorial paso a paso: tabla de historial

---

## Paso 1: crear la entidad `TicketHistory`

Crea `src/main/java/cl/duoc/fullstack/tickets/model/TicketHistory.java`:

```java
package cl.duoc.fullstack.tickets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ticket_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ticket_id", nullable = false)
  private Ticket ticket;

  @Column(name = "previous_status", length = 20)
  private String previousStatus;

  @Column(name = "new_status", length = 20)
  private String newStatus;

  @Column(name = "previous_assigned_email", length = 150)
  private String previousAssignedEmail;

  @Column(name = "new_assigned_email", length = 150)
  private String newAssignedEmail;

  @Column(name = "changed_at", nullable = false)
  private LocalDateTime changedAt;

  @Column(length = 255)
  private String comment;
}
```

**Notas importantes:**

- `previousStatus` y `newStatus` registran el cambio de estado. Ambos pueden ser `null` si el registro es solo de cambio de asignado.
- `previousAssignedEmail` y `newAssignedEmail` registran el email del asignado antes y después del cambio. Son `String`, no FK a `User`.
- `comment` es opcional — permite agregar una nota al cambio.
- **No hay `@JsonIgnore`**: esta entity nunca se expone directamente al cliente. El Service la convierte a `TicketHistoryResult` antes de retornar, por lo que Jackson no la serializa y no hay riesgo de bucle circular.

> **¿Por qué el asignado se guarda como email y no como FK a User?**
> El historial es un **log inmutable** que registra un snapshot del estado en el momento del cambio. Si usáramos FK a User y ese usuario fuera eliminado o modificado en el futuro, el historial quedaría inconsistente. El email es el dato identitario que existía en ese momento — autosuficiente y no referencial.

---

## Paso 2: agregar la relación `@OneToMany` en `Ticket`

Abre `Ticket.java` y agrega al final del cuerpo de la clase:

```java
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

// ... dentro de la clase Ticket:

  @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = false)
  private List<TicketHistory> history = new ArrayList<>();
```

> **¿Qué hace `mappedBy = "ticket"`?**
> Le dice a JPA que la clave foránea está en el campo `ticket` de la clase `TicketHistory`. JPA no crea una columna nueva en la tabla `tickets` — la FK ya existe en `ticket_history.ticket_id`.

> **¿Qué hace `cascade = CascadeType.ALL`?**
> Propaga las operaciones de persistencia desde `Ticket` hacia sus `TicketHistory`. Si guardas un `Ticket` que tiene entradas en `history`, JPA también guarda los `TicketHistory` automáticamente.

> **¿Por qué no hay `@JsonIgnore` en la lista `history`?**
> El historial se expone a través del endpoint `GET /tickets/by-id/{id}/history`, que retorna `List<TicketHistoryResult>` (un DTO record). Jackson nunca serializa el `Ticket` ni sus colecciones directamente — el Service convierte todo a DTOs antes de retornar al controller.

> **¿Por qué `orphanRemoval = false`?**
> El historial nunca debe borrarse, aunque se borre el ticket. Lo dejamos en `false` para que los registros históricos persistan incluso si el ticket es eliminado. (En producción se usaría borrado lógico, pero eso está fuera del alcance del curso.)

---

## Paso 3: crear `TicketHistoryRepository`

Crea `src/main/java/cl/duoc/fullstack/tickets/respository/TicketHistoryRepository.java`:

```java
package cl.duoc.fullstack.tickets.respository;

import cl.duoc.fullstack.tickets.model.TicketHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketHistoryRepository extends JpaRepository<TicketHistory, Long> {

  // Devuelve el historial de un ticket ordenado del más reciente al más antiguo
  List<TicketHistory> findByTicketIdOrderByChangedAtDesc(Long ticketId);
}
```

---

## Paso 4: crear el DTO `TicketHistoryResult`

Crea `src/main/java/cl/duoc/fullstack/tickets/dto/TicketHistoryResult.java`:

```java
package cl.duoc.fullstack.tickets.dto;

import java.time.LocalDateTime;

public record TicketHistoryResult(
    Long id,
    String previousStatus,
    String newStatus,
    String previousAssignedEmail,
    String newAssignedEmail,
    LocalDateTime changedAt,
    String comment
) {}
```

Este record es el contrato de respuesta del historial. El Service construye instancias de este record a partir de la entity `TicketHistory`, asegurando que Jackson solo serialice el DTO — nunca la entity.

---

## Paso 5: actualizar `TicketService` para registrar el historial

El historial debe registrarse automáticamente cuando el estado o el asignado cambian. El Controller no se entera — es responsabilidad del Service.

Inyecta `TicketHistoryRepository` en `TicketService`:

```java
@Service
public class TicketService {

  private TicketRepository repository;
  private UserRepository userRepository;
  private TicketHistoryRepository historyRepository;   // ← nuevo

  public TicketService(
      TicketRepository repository,
      UserRepository userRepository,
      TicketHistoryRepository historyRepository) {
    this.repository = repository;
    this.userRepository = userRepository;
    this.historyRepository = historyRepository;
  }
```

Agrega un método privado `recordChange` y otro de conversión a DTO:

```java
  private void recordChange(
      Ticket ticket,
      String previousStatus,
      String newStatus,
      String previousAssignedEmail,
      String newAssignedEmail,
      String comment) {

    boolean statusChanged = newStatus != null
        && !newStatus.equalsIgnoreCase(previousStatus == null ? "" : previousStatus);
    boolean assigneeChanged = !java.util.Objects.equals(previousAssignedEmail, newAssignedEmail);

    if (!statusChanged && !assigneeChanged) {
      return; // no hay cambio real → no registrar
    }

    TicketHistory entry = new TicketHistory();
    entry.setTicket(ticket);
    entry.setPreviousStatus(statusChanged ? previousStatus : null);
    entry.setNewStatus(statusChanged ? newStatus : null);
    entry.setPreviousAssignedEmail(assigneeChanged ? previousAssignedEmail : null);
    entry.setNewAssignedEmail(assigneeChanged ? newAssignedEmail : null);
    entry.setChangedAt(LocalDateTime.now());
    entry.setComment(comment);
    historyRepository.save(entry);
  }

  private TicketHistoryResult toHistoryResult(TicketHistory h) {
    return new TicketHistoryResult(
        h.getId(),
        h.getPreviousStatus(),
        h.getNewStatus(),
        h.getPreviousAssignedEmail(),
        h.getNewAssignedEmail(),
        h.getChangedAt(),
        h.getComment()
    );
  }
```

Actualiza `create()` para registrar el historial de creación:

```java
  public TicketResult create(TicketCommand command) {
    if (repository.existsByTitle(command.title())) {
      throw new IllegalArgumentException(
          "Ya existe un ticket con el título '" + command.title() + "'");
    }

    User createdBy = userRepository.findByEmail(command.createdByEmail())
        .orElseThrow(() -> new BadRequestException(
            "No existe un usuario con el email '" + command.createdByEmail() + "'"));

    Ticket ticket = new Ticket();
    ticket.setTitle(command.title());
    ticket.setDescription(command.description());
    ticket.setStatus("NEW");
    ticket.setCreatedAt(LocalDateTime.now());
    ticket.setEstimatedResolutionDate(LocalDate.now().plusDays(5));
    ticket.setCreatedBy(createdBy);

    Ticket saved = repository.save(ticket);

    // Registrar historial: el ticket nació en estado NEW (sin estado anterior)
    recordChange(saved, null, "NEW", null, null, "Ticket creado");

    return toResult(saved);
  }
```

Actualiza `updateById()` para registrar el historial cuando cambia el estado:

```java
  public TicketResult updateById(Long id, TicketCommand command) {
    Ticket ticket = repository.findById(id)
        .orElseThrow(() -> new NoSuchElementException("Ticket con id " + id + " no existe"));

    // Capturar valores anteriores para el historial
    String previousStatus = ticket.getStatus();
    String previousAssignedEmail = ticket.getAssignedTo() != null
        ? ticket.getAssignedTo().getEmail()
        : null;

    ticket.setTitle(command.title());
    ticket.setDescription(command.description());

    if (command.status() != null && !command.status().isBlank()) {
      ticket.setStatus(command.status());
    }

    Ticket saved = repository.save(ticket);

    recordChange(saved, previousStatus, saved.getStatus(), previousAssignedEmail, previousAssignedEmail, null);

    return toResult(saved);
  }
```

Actualiza `assignTicket()` para registrar el cambio de asignado:

```java
  public Optional<TicketResult> assignTicket(Long id, AssignTicketRequest request) {
    if (!repository.existsById(id)) {
      return Optional.empty();
    }

    Ticket ticket = repository.findById(id).orElseThrow();

    String previousAssignedEmail = ticket.getAssignedTo() != null
        ? ticket.getAssignedTo().getEmail()
        : null;
    String newAssignedEmail;

    if (request.getAssignedToEmail() == null || request.getAssignedToEmail().isBlank()) {
      ticket.setAssignedTo(null);
      newAssignedEmail = null;
    } else {
      User assignee = userRepository.findByEmail(request.getAssignedToEmail())
          .orElseThrow(() -> new BadRequestException(
              "No existe un usuario con el email '" + request.getAssignedToEmail() + "'"));
      ticket.setAssignedTo(assignee);
      newAssignedEmail = assignee.getEmail();
    }

    Ticket saved = repository.save(ticket);

    recordChange(saved, null, null, previousAssignedEmail, newAssignedEmail, null);

    return Optional.of(toResult(saved));
  }
```

Agrega el método `getHistory()` que el Controller usará:

```java
  public Optional<List<TicketHistoryResult>> getHistory(Long ticketId) {
    if (!repository.existsById(ticketId)) {
      return Optional.empty();
    }
    List<TicketHistoryResult> historial = historyRepository
        .findByTicketIdOrderByChangedAtDesc(ticketId)
        .stream()
        .map(this::toHistoryResult)
        .toList();
    return Optional.of(historial);
  }
```

> **¿Por qué el Controller no sabe que se está registrando historial?**
> `updateById()` y `assignTicket()` registran el historial internamente. Esto aplica el principio de **responsabilidad única**: el Service es dueño de la lógica de negocio, incluida la auditoría. El Controller solo orquesta la petición HTTP.

---

## Paso 6: agregar el endpoint de historial en `TicketController`

Agrega en `TicketController`:

```java
import cl.duoc.fullstack.tickets.dto.TicketHistoryResult;
import java.util.List;

// El constructor NO cambia — TicketController solo inyecta TicketService:
public TicketController(TicketService service) {
  this.service = service;
}

// Nuevo endpoint:
@GetMapping("/by-id/{id}/history")
public ResponseEntity<List<TicketHistoryResult>> getHistory(@PathVariable Long id) {
  return service.getHistory(id)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
}
```

> **¿Por qué el Controller no inyecta `TicketHistoryRepository`?**
> La arquitectura de 5 capas establece que el Controller nunca habla directamente con el Repository. La consulta del historial es responsabilidad del Service, que también se encarga de convertir las entities a DTOs.

> **¿Por qué la URL es `/by-id/{id}/history` y no `/{id}/history`?**
> Para ser coherente con el patrón existente en el mismo Controller: `GET /tickets/by-id/{id}`, `PUT /tickets/by-id/{id}`, etc. El historial es un subrecurso del ticket, representado como `/by-id/{id}/history`.

> **¿Por qué no hay `TicketHistoryController`?**
> `TicketHistory` es una **entidad débil** (weak entity): no puede existir ni tiene sentido sin su Ticket padre. Acceder al historial siempre requiere el ID del ticket. No hay caso de uso donde se consulte el historial sin saber a qué ticket pertenece, por lo que un controller dedicado añadiría complejidad sin valor.

---

## Paso 7: probar el flujo completo

### Crear un ticket

```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "title": "Red caída en piso 3", "description": "Sin internet desde las 9am", "createdByEmail": "admin@empresa.cl" }
```

Respuesta: `201 Created`, ticket con `id: 1` en estado `NEW`.

### Consultar historial inicial

```
GET http://localhost:8080/ticket-app/tickets/by-id/1/history
```

Respuesta esperada:
```json
[
  {
    "id": 1,
    "previousStatus": null,
    "newStatus": "NEW",
    "previousAssignedEmail": null,
    "newAssignedEmail": null,
    "changedAt": "2026-04-15T10:30:00",
    "comment": "Ticket creado"
  }
]
```

### Cambiar el estado del ticket

```
PUT http://localhost:8080/ticket-app/tickets/by-id/1
Content-Type: application/json

{
  "title": "Red caída en piso 3",
  "description": "Sin internet desde las 9am",
  "status": "IN_PROGRESS",
  "createdByEmail": "admin@empresa.cl"
}
```

### Asignar el ticket a un usuario

```
PATCH http://localhost:8080/ticket-app/tickets/by-id/1/assign
Content-Type: application/json

{ "assignedToEmail": "soporte@empresa.cl" }
```

### Consultar historial actualizado

```
GET http://localhost:8080/ticket-app/tickets/by-id/1/history
```

Respuesta esperada:
```json
[
  {
    "id": 3,
    "previousStatus": null,
    "newStatus": null,
    "previousAssignedEmail": null,
    "newAssignedEmail": "soporte@empresa.cl",
    "changedAt": "2026-04-15T10:40:00",
    "comment": null
  },
  {
    "id": 2,
    "previousStatus": "NEW",
    "newStatus": "IN_PROGRESS",
    "previousAssignedEmail": null,
    "newAssignedEmail": null,
    "changedAt": "2026-04-15T10:35:00",
    "comment": null
  },
  {
    "id": 1,
    "previousStatus": null,
    "newStatus": "NEW",
    "previousAssignedEmail": null,
    "newAssignedEmail": null,
    "changedAt": "2026-04-15T10:30:00",
    "comment": "Ticket creado"
  }
]
```

### Verificar en la base de datos

En phpMyAdmin o Supabase, la tabla `ticket_history` debe mostrar todos los registros con los estados, emails y fechas correctos.

---

## Paso 8: reflexiona antes de cerrar

1. ¿Qué pasaría si `orphanRemoval = true`? ¿El historial se borraría si se borra el ticket?
2. ¿Por qué el `Controller` no sabe que se está registrando historial cuando llama a `updateById()`?
3. Si el mismo estado se envía dos veces (`NEW` → `NEW`) y el asignado no cambia, ¿se crea un registro de historial? ¿Por qué?
4. ¿Por qué el email del asignado es más adecuado que el ID de usuario para un log de auditoría?
5. Si `TicketHistory` tuviera su propio Controller, ¿qué problemas aparecerían? ¿Podría alguien crear un historial falso via POST?


<!-- START OF FILE: docs_lessons_13-history_03_historial_y_auditoria.md -->
# Documento: docs lessons 13-history 03 historial y auditoria
---
# Lección 13 — Historial, auditoría y CascadeType

## ¿Por qué un historial en tabla separada?

Una alternativa ingenua sería guardar el historial como texto en el propio ticket:

```java
// Opción mala: historial como texto en el ticket
private String historial = "NEW → IN_PROGRESS (15/04/2026)\nIN_PROGRESS → RESOLVED (16/04/2026)";
```

Esto parece simple, pero tiene varios problemas:

| Problema | Consecuencia |
|---|---|
| No se puede consultar por fecha o estado | Imposible filtrar "todos los cambios de hoy" |
| No se puede indexar | Búsquedas lentas |
| No tiene estructura | Difícil de parsear desde el cliente |
| Crece sin límite | La columna se hace enorme |

Una tabla de historial resuelve todo esto: cada cambio es una **fila independiente** con sus propios campos indexables.

---

## El patrón de auditoría

El patrón que usaste en esta lección se llama **tabla de auditoría** o **tabla de historial**:

```
Acción en la entidad principal    →    Se registra en la tabla de historial
──────────────────────────────         ──────────────────────────────────────
Crear ticket (estado = NEW)       →    { previous: null, new: "NEW", fecha: ahora }
Actualizar estado a IN_PROGRESS   →    { previous: "NEW", new: "IN_PROGRESS", fecha: ahora }
Actualizar estado a RESOLVED      →    { previous: "IN_PROGRESS", new: "RESOLVED", fecha: ahora }
```

La regla fundamental de una tabla de auditoría es: **nunca se borran sus registros**. Es un log inmutable del ciclo de vida de la entidad.

---

## `CascadeType` — qué operaciones se propagan

`CascadeType` define qué operaciones de JPA sobre la entidad padre se propagan automáticamente a las entidades hijas:

```java
@OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
private List<TicketHistory> history = new ArrayList<>();
```

| Valor | Qué propaga |
|---|---|
| `PERSIST` | Si guardas el ticket, también guarda los `TicketHistory` en la lista |
| `MERGE` | Si actualizas el ticket con `merge()`, también actualiza los hijos |
| `REMOVE` | Si borras el ticket, también borra todos sus `TicketHistory` |
| `REFRESH` | Si recargas el ticket desde la BD, también recarga los hijos |
| `ALL` | Todos los anteriores combinados |

> **¿Por qué en este caso `CascadeType.ALL` puede ser riesgoso?**
> Porque incluye `REMOVE`: si alguien borra un ticket, todos sus registros históricos también se borran. En un sistema de auditoría real, eso no es aceptable.
>
> Para el contexto del curso (sin borrado de tickets en producción) es aceptable. Si quisieras proteger el historial, usarías solo `CascadeType.PERSIST` en lugar de `ALL`.

---

## `orphanRemoval` — qué pasa con los huérfanos

```java
@OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = false)
private List<TicketHistory> history = new ArrayList<>();
```

`orphanRemoval = true` elimina un `TicketHistory` si lo remueves de la lista `history` del `Ticket`. Como el historial no debe borrarse nunca, lo dejamos en `false`.

| Valor | Comportamiento |
|---|---|
| `orphanRemoval = true` | Si sacas un elemento de la lista, JPA lo borra de la BD |
| `orphanRemoval = false` | Si sacas un elemento de la lista, JPA no lo borra de la BD |

---

## La relación completa vista desde ambos lados

```
Ticket (id=1, status="RESOLVED", assignedTo=soporte@empresa.cl)
│
├── TicketHistory (id=1, prevStatus=null,         newStatus="NEW",        prevEmail=null,  newEmail=null,                changedAt=10:30)
├── TicketHistory (id=2, prevStatus="NEW",        newStatus="IN_PROGRESS",prevEmail=null,  newEmail=null,                changedAt=10:35)
├── TicketHistory (id=3, prevStatus=null,         newStatus=null,         prevEmail=null,  newEmail="soporte@empresa.cl",changedAt=10:40)
└── TicketHistory (id=4, prevStatus="IN_PROGRESS",newStatus="RESOLVED",  prevEmail=null,  newEmail=null,                changedAt=11:00)
```

En la base de datos:

```
tabla tickets:
id | title              | status
1  | Red caída piso 3   | RESOLVED

tabla ticket_history:
id | ticket_id | previous_status | new_status   | previous_assigned_email | new_assigned_email  | changed_at
1  | 1         | NULL            | NEW          | NULL                    | NULL                | 2026-04-15 10:30:00
2  | 1         | NEW             | IN_PROGRESS  | NULL                    | NULL                | 2026-04-15 10:35:00
3  | 1         | NULL            | NULL         | NULL                    | soporte@empresa.cl  | 2026-04-15 10:40:00
4  | 1         | IN_PROGRESS     | RESOLVED     | NULL                    | NULL                | 2026-04-15 11:00:00
```

La tabla `tickets` solo guarda el **estado actual**. La tabla `ticket_history` guarda **toda la evolución**.

---

## El flujo completo de un cambio de estado

```
[Cliente]
  │ PUT /tickets/1  {"status": "IN_PROGRESS"}
  ↓
[TicketController.updateById(id=1, request)]
  │ Llama a service.updateById(1, request)
  │ No sabe nada sobre historial
  ↓
[TicketService.updateById(id=1, request)]
  │ Carga el ticket de la BD → status actual = "NEW"
  │ request.getStatus() = "IN_PROGRESS" ≠ "NEW" → hay cambio
  │ Actualiza ticket.status = "IN_PROGRESS"
  │ Llama a recordChange(ticket, "NEW", "IN_PROGRESS", null, null, null)
  │   └─ crea TicketHistory y llama a historyRepository.save(entry)
  │ Llama a repository.save(ticket) → persiste el nuevo estado
  ↓
[Cliente]
  │ 200 OK con TicketResult (DTO)
```

El Controller es ajeno al historial. Toda la lógica de auditoría vive en el Service. Este es el principio de **responsabilidad única** aplicado a la capa de servicio.

El mismo principio aplica para el endpoint de historial: `TicketController` llama a `service.getHistory(id)`, que retorna `List<TicketHistoryResult>`. El Controller nunca toca el `TicketHistoryRepository` directamente.

---

## ¿Por qué no necesitamos `@JsonIgnore`?

En otros tutoriales verás `@JsonIgnore` en el campo `ticket` de `TicketHistory` y en la lista `history` de `Ticket`. Esto se hace para evitar el bucle de serialización:

```
Jackson serializa TicketHistory
  → intenta serializar Ticket
    → intenta serializar cada TicketHistory de la lista
      → intenta serializar Ticket (de nuevo)
        → bucle infinito → StackOverflowError
```

En este proyecto **no usamos `@JsonIgnore`** porque el Service nunca retorna entities directamente:

```
[TicketController] llama a service.getHistory(id)
     ↓
[TicketService] consulta el repository → obtiene List<TicketHistory>
     │ convierte cada entrada a TicketHistoryResult (record)
     ↓
[TicketController] retorna List<TicketHistoryResult>
     ↓
[Jackson] serializa TicketHistoryResult — un record plano, sin referencias circulares
```

`TicketHistoryResult` es un record con campos simples (Strings, LocalDateTime). Jackson lo serializa sin problema. La entity `TicketHistory` nunca llega a Jackson.

---

## ¿Por qué email y no FK a `User` para registrar el asignado?

Es tentador guardar el asignado como FK:

```java
// Tentación: FK a User
@ManyToOne
private User previousAssignedTo;

// Lo que usamos: email como String
private String previousAssignedEmail;
```

La tabla de historial es un **log inmutable**. Cada fila es un snapshot del estado en un momento dado. Hay varias razones para preferir el email:

| Razón | Explicación |
|---|---|
| **Independencia referencial** | Si el User se elimina, el historial no queda huérfano ni se borra en cascada |
| **Inmutabilidad real** | El email capturado en el momento del cambio no cambia aunque el usuario actualice su perfil |
| **Lectura directa** | En un log de auditoría, quieres ver el dato directamente, no hacer JOIN a otra tabla |
| **Coherencia con L12** | La asignación ya se hace por email en `AssignTicketRequest` — es natural mantener ese identificador en el historial |

Este patrón es común en sistemas de auditoría y Event Sourcing: guardar el valor en el momento del evento, no una referencia al objeto actual.

---

## ¿Por qué no hay `TicketHistoryController`?

`TicketHistory` es una **entidad débil** (weak entity): no tiene identidad propia ni puede existir sin un `Ticket` padre. Sus características:

- No tiene significado fuera del contexto de un Ticket
- Siempre se consulta en relación a un Ticket específico: "dame el historial del ticket N"
- No tiene operaciones de creación, actualización o borrado propias — su ciclo de vida está 100% gestionado por `TicketService`

Por eso el endpoint de historial vive en `TicketController`:

```
GET /tickets/by-id/{id}/history
```

Si tuviéramos un `TicketHistoryController` con `POST /ticket-history`, alguien podría insertar entradas falsas en el historial — violando la integridad del log de auditoría. Al no tener controller propio, la única forma de escribir en el historial es a través de las operaciones de negocio del Service.


<!-- START OF FILE: docs_lessons_13-history_04_checklist_rubrica_minima.md -->
# Documento: docs lessons 13-history 04 checklist rubrica minima
---
# Lección 13 — Checklist y rúbrica mínima

---

## Checklist de `TicketHistory.java`

- ☐ La clase tiene `@Entity` y `@Table(name = "ticket_history")`
- ☐ El campo `id` tiene `@Id` y `@GeneratedValue(strategy = GenerationType.IDENTITY)`
- ☐ El campo `ticket` tiene `@ManyToOne(fetch = FetchType.LAZY)` y `@JoinColumn(name = "ticket_id", nullable = false)` — **sin** `@JsonIgnore`
- ☐ El campo `previousStatus` tiene `@Column(name = "previous_status")` y **no** tiene `nullable = false` (puede ser null)
- ☐ El campo `newStatus` tiene `@Column(name = "new_status")` y **no** tiene `nullable = false` (puede ser null si el registro es solo de cambio de asignado)
- ☐ El campo `previousAssignedEmail` es `String` con `@Column(name = "previous_assigned_email")` — **no** es FK a User
- ☐ El campo `newAssignedEmail` es `String` con `@Column(name = "new_assigned_email")` — **no** es FK a User
- ☐ El campo `changedAt` tiene `@Column(name = "changed_at", nullable = false)`
- ☐ La clase tiene `@NoArgsConstructor` (requerido por JPA) y `@AllArgsConstructor`
- ☐ **No hay** `@JsonIgnore` ni imports de `com.fasterxml.jackson` en la clase

---

## Checklist de `Ticket.java` (relación OneToMany)

- ☐ Tiene el campo `history` con `@OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = false)`
- ☐ El campo `history` se inicializa con `new ArrayList<>()` (nunca debe ser null)
- ☐ El valor `mappedBy = "ticket"` coincide exactamente con el nombre del campo en `TicketHistory`
- ☐ **No hay** `@JsonIgnore` en el campo `history`

---

## Checklist de `TicketHistoryResult.java`

- ☐ Es un Java `record` en el paquete `dto/`
- ☐ Tiene los campos: `Long id`, `String previousStatus`, `String newStatus`, `String previousAssignedEmail`, `String newAssignedEmail`, `LocalDateTime changedAt`, `String comment`
- ☐ **No tiene** anotaciones JPA ni Jackson

---

## Checklist de `TicketHistoryRepository.java`

- ☐ Es una interfaz que extiende `JpaRepository<TicketHistory, Long>`
- ☐ Tiene el método `List<TicketHistory> findByTicketIdOrderByChangedAtDesc(Long ticketId)`
- ☐ Está en el paquete `respository/` (typo intencional)

---

## Checklist de `TicketService.java`

- ☐ El constructor recibe `TicketHistoryRepository` (además de los repositorios de L12)
- ☐ Existe el método privado `recordChange(Ticket, String, String, String, String, String)` que recibe: ticket, previousStatus, newStatus, previousAssignedEmail, newAssignedEmail, comment
- ☐ `recordChange()` solo guarda si hay cambio real (estado diferente O email diferente)
- ☐ `create()` llama a `recordChange()` después de guardar el ticket (con `previousStatus = null`, `newStatus = "NEW"`, emails = null)
- ☐ `updateById()` usa `orElseThrow` (no `.map()`), captura estado anterior, llama a `recordChange()` solo si el estado cambió
- ☐ `assignTicket()` captura email anterior, llama a `recordChange()` con el cambio de email
- ☐ Existe el método `getHistory(Long ticketId)` que retorna `Optional<List<TicketHistoryResult>>` (vacío si el ticket no existe)
- ☐ Existe el método privado `toHistoryResult(TicketHistory)` que convierte entity a DTO

---

## Checklist de `TicketController.java`

- ☐ El constructor **no** inyecta `TicketHistoryRepository` — solo `TicketService`
- ☐ Tiene el endpoint `GET /by-id/{id}/history` que devuelve `ResponseEntity<List<TicketHistoryResult>>`
- ☐ El endpoint llama a `service.getHistory(id)` (no al repository directamente)
- ☐ Si el ticket no existe, el endpoint devuelve `404 Not Found`
- ☐ Si el ticket existe, el endpoint devuelve `200 OK` con la lista (puede estar vacía)
- ☐ La lista viene ordenada de más reciente a más antiguo

---

## Checklist de pruebas

- ☐ Crear un ticket → `GET /tickets/by-id/{id}/history` muestra 1 entrada con `previousStatus: null`, `newStatus: "NEW"`, emails null
- ☐ Actualizar estado a `IN_PROGRESS` → historial muestra 2 entradas; la nueva con `previousStatus: "NEW"`, `newStatus: "IN_PROGRESS"`
- ☐ Asignar ticket a usuario por email → historial muestra nueva entrada con `previousAssignedEmail: null`, `newAssignedEmail: "email@..."`, status fields null
- ☐ Reasignar a otro usuario → historial muestra nueva entrada con `previousAssignedEmail: "anterior@..."`, `newAssignedEmail: "nuevo@..."`
- ☐ Enviar el mismo estado sin cambio real → historial **no** agrega una entrada nueva
- ☐ `GET /tickets/by-id/999/history` → `404 Not Found`
- ☐ En phpMyAdmin / Supabase, la tabla `ticket_history` tiene las filas correctas con los emails como strings

---

## Errores comunes

| Error | Causa probable | Solución |
|---|---|---|
| `StackOverflowError` al hacer `GET /history` | El endpoint retorna `List<TicketHistory>` (entity) en lugar de `List<TicketHistoryResult>` (DTO) | Verificar que `service.getHistory()` retorna DTOs y el controller los retorna directamente |
| Historial crea entrada aunque no hay cambio | `recordChange` no verifica si hay cambio real | Agregar la verificación `!statusChanged && !assigneeChanged → return` |
| `mappedBy` error al arrancar | El valor en `mappedBy` no coincide con el nombre del campo | Verificar que `mappedBy = "ticket"` coincida con `private Ticket ticket` en `TicketHistory` |
| La tabla `ticket_history` no se crea | `TicketHistory` no tiene `@Entity` o no está en el paquete escaneado | Verificar las anotaciones y el paquete de la clase |
| El primer registro de historial falla por `previousStatus NOT NULL` | La columna tiene `nullable = false` | Cambiar a `@Column(name = "previous_status")` sin `nullable = false` |
| Controller retorna 404 para ticket existente | `service.getHistory()` no está implementado correctamente | Verificar que retorna `Optional.of(lista)` (no `Optional.empty()`) cuando el ticket existe aunque no tenga historial |


<!-- START OF FILE: docs_lessons_13-history_05_actividad_individual.md -->
# Documento: docs lessons 13-history 05 actividad individual
---
# Lección 13 — Actividad individual: registrar quién hizo el cambio

## Contexto

Tu sistema ya registra qué cambió (estado y asignado) y cuándo. Esta actividad extiende el historial para registrar también **quién** realizó el cambio: el email del usuario que ejecutó la operación.

En sistemas con autenticación (Spring Security), este dato vendría automáticamente del usuario autenticado en el contexto de la petición. Por ahora, lo recibiremos explícitamente en el cuerpo de la petición.

---

## Parte 1: agregar `changedByEmail` a `TicketHistory`

Agrega este campo a `TicketHistory.java`:

```java
@Column(name = "changed_by_email", length = 150)
private String changedByEmail;
```

- Es `String`, no FK a `User` — mismo razonamiento que `previousAssignedEmail` y `newAssignedEmail`: el historial es inmutable, debe guardar snapshots, no referencias.
- Puede ser `null` si no se proporciona (por compatibilidad retroactiva).

---

## Parte 2: actualizar `TicketHistoryResult`

Agrega el campo al record:

```java
public record TicketHistoryResult(
    Long id,
    String previousStatus,
    String newStatus,
    String previousAssignedEmail,
    String newAssignedEmail,
    String changedByEmail,       // ← nuevo
    LocalDateTime changedAt,
    String comment
) {}
```

---

## Parte 3: actualizar `recordChange` en `TicketService`

Agrega el parámetro `changedByEmail` al método privado:

```java
private void recordChange(
    Ticket ticket,
    String previousStatus,
    String newStatus,
    String previousAssignedEmail,
    String newAssignedEmail,
    String changedByEmail,       // ← nuevo parámetro
    String comment) {

  boolean statusChanged = newStatus != null
      && !newStatus.equalsIgnoreCase(previousStatus == null ? "" : previousStatus);
  boolean assigneeChanged = !java.util.Objects.equals(previousAssignedEmail, newAssignedEmail);

  if (!statusChanged && !assigneeChanged) {
    return;
  }

  TicketHistory entry = new TicketHistory();
  entry.setTicket(ticket);
  entry.setPreviousStatus(statusChanged ? previousStatus : null);
  entry.setNewStatus(statusChanged ? newStatus : null);
  entry.setPreviousAssignedEmail(assigneeChanged ? previousAssignedEmail : null);
  entry.setNewAssignedEmail(assigneeChanged ? newAssignedEmail : null);
  entry.setChangedByEmail(changedByEmail);  // ← nuevo
  entry.setChangedAt(LocalDateTime.now());
  entry.setComment(comment);
  historyRepository.save(entry);
}
```

Actualiza también `toHistoryResult()`:

```java
private TicketHistoryResult toHistoryResult(TicketHistory h) {
  return new TicketHistoryResult(
      h.getId(),
      h.getPreviousStatus(),
      h.getNewStatus(),
      h.getPreviousAssignedEmail(),
      h.getNewAssignedEmail(),
      h.getChangedByEmail(),     // ← nuevo
      h.getChangedAt(),
      h.getComment()
  );
}
```

---

## Parte 4: recibir `changedByEmail` desde el cliente

Para que el cliente pueda informar quién realiza el cambio, agrega el campo a los DTOs de comando:

**`TicketCommand.java`** — agrega el campo:
```java
public record TicketCommand(
    String title,
    String description,
    String status,
    String createdByEmail,
    String changedByEmail       // ← nuevo (puede ser null)
) {}
```

**`AssignTicketRequest.java`** — agrega el campo:
```java
private String changedByEmail;   // ← nuevo (puede ser null)
```

Actualiza `updateById()` y `assignTicket()` en `TicketService` para pasar `changedByEmail` a `recordChange`:

```java
// En updateById():
recordChange(saved, previousStatus, saved.getStatus(),
    previousAssignedEmail, previousAssignedEmail,
    command.changedByEmail(), null);    // ← pasar changedByEmail

// En assignTicket():
recordChange(saved, null, null,
    previousAssignedEmail, newAssignedEmail,
    request.getChangedByEmail(), null); // ← pasar changedByEmail
```

---

## Pruebas requeridas

| Prueba | Resultado esperado |
|---|---|
| Actualizar estado enviando `changedByEmail` | La entrada de historial muestra el email en `changedByEmail` |
| Asignar ticket enviando `changedByEmail` | La entrada de historial muestra el email en `changedByEmail` |
| Actualizar sin enviar `changedByEmail` | La entrada de historial tiene `changedByEmail: null` (no falla) |
| `GET /tickets/by-id/{id}/history` | El campo `changedByEmail` aparece en todas las entradas (puede ser null en las anteriores) |

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| `TicketHistory` tiene el campo `changedByEmail` como `String` (no FK a User) | 20% |
| `TicketHistoryResult` incluye `changedByEmail` | 15% |
| `recordChange` acepta y registra `changedByEmail` | 25% |
| `updateById()` y `assignTicket()` pasan `changedByEmail` al método de registro | 25% |
| El campo es opcional (`null` cuando no se proporciona) y no provoca errores | 15% |

---

## Reflexión final

Cuando implementes Spring Security en un proyecto real, el `changedByEmail` no vendrá del cuerpo de la petición — vendrá del `SecurityContext`:

```java
String changedByEmail = SecurityContextHolder.getContext()
    .getAuthentication().getName();
```

El cliente ya no necesita enviarlo porque el servidor sabe quién es el usuario autenticado. El diseño con email como parámetro explícito que usaste aquí es la misma arquitectura — solo cambia de dónde viene el dato.


<!-- START OF FILE: docs_lessons_14-microservices_01_objetivo_y_alcance.md -->
# Documento: docs lessons 14-microservices 01 objetivo y alcance
---
# Lección 14 — Comunicación entre Microservicios

## ¿De dónde venimos?

En la lección 13 implementaste un historial persistente de cambios en el ticket. Tu aplicación Tickets funciona perfectamente como **monolito**: un único proyecto que gestiona tickets, usuarios e historial de cambios.

Pero en equipos grandes, surge una necesidad: **dividir la aplicación en microservicios independientes**. En esta lección usaremos dos servicios reales: **NotificationService** (envío de notificaciones, puerto 8081) y **AuditService** (registro de auditoría, puerto 8082). Por ejemplo:

```mermaid
flowchart LR
    tickets[Tickets Service 8080] -- RestClient --> notif[NotificationService 8081]
    tickets -- FeignClient --> audit[AuditService 8082]
```

Cada microservicio es una **aplicación independiente** en un puerto diferente. Se comunican vía HTTP/REST.

---

## Los enfoques de comunicación

| Enfoque | Tool | Ventajas | Desventajas | Cuándo |
|---------|------|----------|------------|--------|
| **RestClient** ✅ | Spring Web 6.1+ | Moderno, limpio, sin dependencias | Requiere Spring 6.1+ | Estándar recomendado |
| **FeignClient** | Spring Cloud | Automático, declarativo | Más dependencias | Múltiples llamadas |
| **RestTemplate** ⚠️ | Spring Web | Flexible, control total | Verboso, deprecado | Legacy/excepciones |

Esta lección cubre **todos**, pero con **RestClient como estándar moderno**.

---

## ¿Qué vas a construir?

Al terminar esta lección podrás:

1. Implementar comunicación HTTP entre dos aplicaciones Spring Boot
2. Usar **RestClient** (Spring 6.1+) para llamadas HTTP modernas
3. Usar **FeignClient** como alternativa para múltiples llamadas automáticas
4. Conocer **RestTemplate** (deprecado) para mantenimiento de código legacy
5. Manejar **timeouts y reintentos**
6. Implementar **fallbacks** (qué hacer si el servicio cae)
7. Debuggear problemas de comunicación

### Lo que vas a poder explicar

- ¿Cuándo usar RestClient vs FeignClient vs RestTemplate?
- ¿Qué son los microservicios y por qué importan?
- ¿Cómo manejar errores si un microservicio cae?
- ¿Qué es un circuit breaker y por qué es importante?
- ¿Cómo registrar logs de llamadas HTTP?

---

## Estructura de la Lección

1. **[Este documento](01_objetivo_y_alcance.md)** — Objetivo y alcance
2. **[Organización de Repositorios](02_organizacion_repositorios.md)** — Monorepo, polyrepo y Maven multi-módulo
3. **[Ejecución Local](03_ejecucion_local.md)** — Correr 10 servicios con poca RAM (JVM flags, Docker, nativo)
4. **[Despliegue Distribuido](04_despliegue_externo.md)** — Red local, PaaS/nube y comparativa de estrategias
5. **[Guión Paso a Paso](05_guion_paso_a_paso.md)** — Instrucciones prácticas
6. **[RestClient vs RestTemplate vs FeignClient](06_resttemplate_vs_feign.md)** — Comparación
7. **[Ejemplos Prácticos](07_ejemplos_practicos.md)** — Código listo
8. **[Manejo de Errores](08_manejo_errores.md)** — Timeouts, reintentos, fallbacks
9. **[Debugging](09_debugging.md)** — Logs y troubleshooting
10. **[Checklist](10_checklist_rubrica_minima.md)** — Verificación
11. **[Actividad Individual](11_actividad_individual.md)** — Tu tarea

---

## Requisitos Previos

- ✅ Lecciones 10-13 completadas
- ✅ Entiendes Spring Boot básico
- ✅ Conoces HTTP/REST
- ✅ Tienes **NotificationService** (puerto 8081) y **AuditService** (puerto 8082) corriendo
- ✅ Spring framework 6.1+ / Springboot 3.2+ (para RestClient)



<!-- START OF FILE: docs_lessons_14-microservices_02_organizacion_repositorios.md -->
# Documento: docs lessons 14-microservices 02 organizacion repositorios
---
# Lección 14 — Organización de Repositorios

Antes de escribir una sola línea de código de integración, hay una pregunta que casi todos los equipos se hacen: **¿cómo organizo mis microservicios?** ¿Un solo repositorio con todos? ¿Uno por servicio? ¿O los junto en un proyecto Maven multi-módulo?

---

## ¿Un repo o varios?

Hay tres patrones habituales:

```mermaid
flowchart TD
    subgraph A["1 · Monorepo (un solo repo)"]
        direction LR
        r1["ticket-system/"]
        r1 --> s1["tickets-service/"]
        r1 --> s2["notification-service/"]
        r1 --> s3["audit-service/"]
    end

    subgraph B["2 · Polyrepo (repo por servicio)"]
        direction LR
        r2["tickets-service/"] 
        r3["notification-service/"]
        r4["audit-service/"]
    end

    subgraph C["3 · Maven multi-módulo"]
        direction LR
        r5["ticket-system/  ← parent pom"]
        r5 --> m1[tickets-service/  pom hijo]
        r5 --> m2[notification-service/  pom hijo]
        r5 --> m3[audit-service/  pom hijo]
    end
```

### Comparativa

| Aspecto | Monorepo | Polyrepo | Multi-módulo Maven |
|---------|----------|----------|--------------------|
| **Configuración** | Mínima | Un repo por servicio | Media |
| **Versión compartida** | Manual | No existe | Desde el parent pom |
| **Dependencias comunes** | Copiadas en cada pom | Copiadas | Declaradas una vez |
| **CI/CD** | Un pipeline | Un pipeline por servicio | Un pipeline con perfiles |
| **Aislamiento de cambios** | Bajo | Alto | Medio |
| **Ideal para** | Aprender / evaluaciones | Producción real | Proyectos medianos |

> **En este curso** usamos el patrón **monorepo con proyectos independientes** (cada servicio tiene su propia carpeta con su propio `pom.xml`). Eso simplifica el trabajo pedagógico: clonas un solo repositorio y tienes todo.

---

## Maven Multi-módulo: qué es y cómo crearlo

Un proyecto multi-módulo tiene un **parent `pom.xml`** que agrupa varios módulos. Cada módulo hereda las versiones y dependencias del parent, eliminando duplicación.

### Estructura resultado

```
ticket-system/               ← parent (solo pom.xml, sin src/)
├── pom.xml
├── tickets-service/
│   └── pom.xml              ← hijo: hereda del parent
├── notification-service/
│   └── pom.xml
└── audit-service/
    └── pom.xml
```

### Opción A: A mano

**1. Crear el parent `pom.xml`** en la raíz del proyecto:

```xml
<!-- ticket-system/pom.xml -->
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>cl.duoc.fullstack</groupId>
    <artifactId>ticket-system</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>   <!-- ← obligatorio en el parent -->

    <!-- Lista de módulos que componen el sistema -->
    <modules>
        <module>tickets-service</module>
        <module>notification-service</module>
        <module>audit-service</module>
    </modules>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>4.0.5</version>
        <relativePath/>
    </parent>

    <properties>
        <java.version>21</java.version>
    </properties>
</project>
```

**2. En cada módulo hijo**, reemplazar el `<parent>` de Spring Boot por el parent propio:

```xml
<!-- ticket-system/tickets-service/pom.xml -->
<project>
    <modelVersion>4.0.0</modelVersion>

    <!-- Apunta al parent local, no a Spring Boot directamente -->
    <parent>
        <groupId>cl.duoc.fullstack</groupId>
        <artifactId>ticket-system</artifactId>
        <version>1.0.0</version>
        <relativePath>../pom.xml</relativePath>   <!-- ← ruta relativa al parent -->
    </parent>

    <artifactId>tickets-service</artifactId>
    <packaging>jar</packaging>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <!-- versión heredada del parent, no se repite -->
        </dependency>
    </dependencies>
</project>
```

**3. Compilar todo desde la raíz:**

```bash
cd ticket-system
mvnw.cmd package -DskipTests        # compila todos los módulos en orden
mvnw.cmd package -pl tickets-service -am   # solo un módulo y sus dependencias
```

### Opción B: Con IntelliJ IDEA

1. **Crear proyecto padre**: `File → New → Project → Maven` → marcar *Create from archetype: pom* o simplemente borrar el `<packaging>jar</packaging>` y agregar `<packaging>pom</packaging>`.
2. **Agregar módulos**: clic derecho sobre el proyecto raíz → `New → Module → Spring Initializr`.
3. IntelliJ agrega automáticamente el `<module>` en el parent y el `<parent>` en el hijo.

> **Ventaja de IntelliJ**: maneja la configuración del `<relativePath>` solo y sincroniza los cambios del parent automáticamente.

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md) · [Siguiente: Ejecución local →](03_ejecucion_local.md)*



<!-- START OF FILE: docs_lessons_14-microservices_03_ejecucion_local.md -->
# Documento: docs lessons 14-microservices 03 ejecucion local
---
# Lección 14 — Ejecución Local de Múltiples Servicios

Para la segunda evaluación debes levantar ~10 microservicios simultáneamente. Una JVM de Spring Boot en configuración por defecto consume entre **200 y 350 MB de RAM**. En el peor caso: `10 × 350 MB = 3.5 GB` solo para los servicios.

Esta sección cubre las estrategias para reducir ese consumo y poder correrlos todos en una sola PC.

---

## Solución 1: Limitar la RAM de cada JVM

Agrega estos flags al arrancar cada servicio. La forma más simple es en `application.yml` o como variable de entorno:

```bash
# Límite de heap: 128 MB por servicio (suficiente para servicios simples en memoria)
mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments="-Xms64m -Xmx128m"
```

O permanentemente en el `pom.xml` de cada servicio:

```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <jvmArguments>-Xms64m -Xmx128m</jvmArguments>
    </configuration>
</plugin>
```

---

## Solución 2: Reducir el overhead de Spring Boot

Agrega esto a cada `application.yml`:

```yaml
spring:
  main:
    lazy-initialization: true   # beans creados solo cuando se necesitan
  jmx:
    enabled: false              # deshabilita JMX (no lo usamos)

server:
  tomcat:
    threads:
      max: 10                   # menos hilos = menos memoria (dev only)
```

Con estas tres propiedades, un servicio simple puede arrancar usando **80-120 MB** en lugar de 300 MB.

---

## Solución 3: Docker Compose (Extra — no requerido por la asignatura)

> ⚠️ **Docker y Docker Compose no son parte del currículo oficial de DSY1103.** Esta solución se menciona como referencia para quienes ya lo conozcan o quieran explorarlo por su cuenta. Para más detalle, ver [`docs/extras/docker`](../../../docs/extras/docker/README.md).

Docker Compose levanta todos los servicios con un solo comando. Para que funcione, **cada proyecto Spring Boot necesita un `Dockerfile`** en su raíz. Sin ese archivo, `docker compose up --build` fallará.

**Sobre el nombre del archivo de configuración:** el estándar actual es `compose.yaml` (sin el prefijo `docker-`). Los nombres `docker-compose.yml` y `docker-compose.yaml` siguen siendo reconocidos por retro-compatibilidad, pero son el estilo antiguo (Compose V1).

**Sobre el comando:** usa siempre `docker compose` (con espacio), que es el plugin integrado en Docker Desktop moderno. El comando `docker-compose` (con guión) era la herramienta V1 independiente, deprecada desde 2023.

Estructura necesaria:
```
monorepo/
├── compose.yaml              ← nombre moderno (V2)
├── Tickets/
│   └── Dockerfile            ← requerido por cada servicio
├── NotificationService/
│   └── Dockerfile            ← requerido
└── ...
```

Ejemplo de `compose.yaml`:

```yaml
# compose.yaml — Compose V2 (no necesita campo "version:")
services:
  tickets:
    build: ./Tickets          # ← usa el Dockerfile de ./Tickets/
    ports: ["8080:8080"]
    environment:
      JAVA_TOOL_OPTIONS: "-Xmx128m"

  notification:
    build: ./NotificationService
    ports: ["8081:8081"]
    environment:
      JAVA_TOOL_OPTIONS: "-Xmx64m"

  audit:
    build: ./AuditService
    ports: ["8082:8082"]
    environment:
      JAVA_TOOL_OPTIONS: "-Xmx64m"
```

```bash
docker compose up --build    # construye imágenes y levanta todo
docker compose down          # detiene todo
docker compose logs -f       # ver logs en tiempo real
```

Ver [`docs/extras/docker`](../../../docs/extras/docker/README.md) para el `Dockerfile` mínimo requerido, la diferencia completa V1/V2 y más ejemplos.

---

## Solución 4: Compilación nativa con GraalVM (Extra)

> ⚠️ Esta opción es avanzada y no es requerida por la asignatura. Ver [`docs/extras/native-compilation`](../../../docs/extras/native-compilation/README.md) para el detalle completo.

En lugar de ejecutar un JAR sobre una JVM (que incluye el runtime completo), GraalVM compila la aplicación a un **ejecutable nativo** — código máquina que arranca directamente sin JVM.

| | JVM estándar | Ejecutable nativo |
|---|---|---|
| Startup | ~4 segundos | ~80 ms |
| RAM en reposo | ~250 MB | ~50 MB |
| Tiempo de build | ~10 segundos | 3–10 minutos |

Para 10 servicios: `10 × 50 MB ≈ 500 MB` de RAM total — una mejora enorme. El costo es el tiempo de compilación: cada cambio en el código requiere esperar varios minutos para volver a compilar. No es práctico para desarrollo activo, pero sí para el despliegue final.

```bash
# Requiere GraalVM instalado y JAVA_HOME apuntando a él
mvnw.cmd -Pnative native:compile -DskipTests
./target/mi-servicio     # ejecutable nativo, sin JVM
```

---

## Consejo rápido para empezar

Usa esta combinación como punto de partida — funciona con solo Java y Maven instalados:

```mermaid
flowchart LR
    A["Monorepo\n(un solo git clone)"] --> B["Cada servicio con\n-Xmx128m + lazy-init"]
    B --> C["Script de arranque\nbatch / shell"]
    C --> D["Todos los servicios\ncorriendo con ~1 GB RAM total"]
```

Crea un script `start-all.cmd` (Windows) en la raíz:

```bat
@echo off
echo Iniciando todos los microservicios...

start "NotificationService" cmd /k "cd NotificationService && mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments=-Xmx64m"
start "AuditService"        cmd /k "cd AuditService        && mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments=-Xmx64m"
start "SearchService"       cmd /k "cd SearchService       && mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments=-Xmx64m"
start "SLAService"          cmd /k "cd SLAService          && mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments=-Xmx64m"
start "Tickets"             cmd /k "cd Tickets             && mvnw.cmd spring-boot:run -Dspring-boot.run.jvmArguments=-Xmx128m"

echo Servicios iniciados. Revisa cada ventana.
```

Cada servicio abre en su propia ventana de terminal, por lo que puedes ver sus logs de forma independiente.

---

*[← Organización de repositorios](02_organizacion_repositorios.md) · [Siguiente: Despliegue distribuido y nube →](04_despliegue_externo.md)*



<!-- START OF FILE: docs_lessons_14-microservices_04_despliegue_externo.md -->
# Documento: docs lessons 14-microservices 04 despliegue externo
---
# Lección 14 — Despliegue Distribuido y en la Nube

Cuando una sola PC no es suficiente — o quieres acceder a los servicios desde cualquier lugar — hay dos opciones: repartir los servicios entre varias máquinas de la misma red, o desplegarlos en un proveedor de nube.

---

## Solución 5: Distribución en múltiples máquinas de la misma red

Si tienes compañeros disponibles o varias computadoras en la misma red WiFi o LAN, puedes **repartir los servicios entre máquinas**. Cada PC corre solo 2-3 servicios y los demás se comunican por la IP de red local.

```mermaid
flowchart TD
    subgraph PC1["PC 1 — 192.168.1.10"]
        T["Tickets :8080"]
        N["NotificationService :8081"]
    end
    subgraph PC2["PC 2 — 192.168.1.11"]
        A["AuditService :8082"]
        S["SearchService :8084"]
    end
    subgraph PC3["PC 3 — 192.168.1.12"]
        SLA["SLAService :8085"]
        R["...otros... :8086"]
    end

    T -->|"http://192.168.1.11:8082"| A
    T -->|"http://192.168.1.11:8084"| S
    T -->|"http://192.168.1.12:8085"| SLA
```

**Cómo configurarlo:**

1. Averigua la IP local de cada PC:
   ```bash
   # Windows
   ipconfig | findstr "IPv4"
   # Mac / Linux
   ip a | grep "inet "
   ```

2. Actualiza las URLs en `application.yml` de cada servicio para apuntar a la IP correcta:
   ```yaml
   # application.yml de Tickets (corre en PC1)
   services:
     audit:
       url: http://192.168.1.11:8082    # AuditService corre en PC2
     search:
       url: http://192.168.1.11:8084
     sla:
       url: http://192.168.1.12:8085
   ```

3. Verifica que el **firewall** del PC remoto permita conexiones entrantes en ese puerto. En Windows: `Configuración → Firewall → Reglas de entrada → Nuevo puerto`.

**Problema frecuente:** las IPs cambian al reconectar a la red. **Solución:** usa variables de entorno para las URLs en lugar de escribirlas fijas en el YAML:

```yaml
# application.yml — patrón con fallback a localhost
services:
  audit:
    url: ${AUDIT_SERVICE_URL:http://localhost:8082}
  search:
    url: ${SEARCH_SERVICE_URL:http://localhost:8084}
```

Cuando el servicio corre en la misma PC no hace falta configurar nada. Cuando corre en otra máquina, defines la variable de entorno antes de arrancar:

```bash
# Windows (CMD)
set AUDIT_SERVICE_URL=http://192.168.1.11:8082
mvnw.cmd spring-boot:run
```

> Esta distribución replica exactamente cómo funciona un entorno de producción real: microservicios desplegados en distintos servidores que se comunican por red.

---

## Solución 6: Despliegue en la nube / PaaS

Si tu PC tiene poca RAM o quieres acceder a los servicios desde cualquier lugar, puedes desplegar en un **PaaS** (*Platform as a Service*) — plataformas que administran la infraestructura y solo te piden el código o el contenedor.

```mermaid
flowchart LR
    Dev["Tu PC\n(solo navegador\no Postman)"]

    subgraph Cloud["Nube / PaaS"]
        T["tickets\n.railway.app"]
        N["notification\n.railway.app"]
        A["audit\n.railway.app"]
    end

    Dev -->|"HTTPS"| T
    T -->|"HTTPS"| N
    T -->|"HTTPS"| A
```

**Opciones con free tier para aplicaciones Spring Boot:**

| Plataforma | Free tier | Requiere Docker | Notas |
|---|---|---|---|
| [Railway](https://railway.app) | ✅ (con límites) | Opcional | Muy fácil, detecta Spring Boot automáticamente |
| [Render](https://render.com) | ✅ (duerme tras inactividad) | Opcional | Puede tardar en arrancar tras inactividad |
| [Fly.io](https://fly.io) | ✅ (3 VMs pequeñas) | ✅ Requerido | Control más fino, buen para microservicios |
| [DigitalOcean App Platform](https://www.digitalocean.com/products/app-platform) | ❌ (desde $5/mes) | Opcional | Sencillo y confiable |
| [Azure Container Apps](https://azure.microsoft.com/products/container-apps) | ✅ (créditos de estudiante) | ✅ Requerido | Alumnos DUOC pueden tener acceso via Azure for Students |

**Lo que cambia en tu código al pasar a la nube:**

Las URLs dejan de ser `http://localhost:XXXX` y pasan a ser `https://mi-servicio.railway.app`. La forma más limpia de manejarlo es con variables de entorno para no tocar el código:

```yaml
# application.yml — el mismo archivo funciona local y en la nube
services:
  audit:
    url: ${AUDIT_SERVICE_URL:http://localhost:8082}   # usa env var si existe, si no localhost
  notification:
    url: ${NOTIFICATION_SERVICE_URL:http://localhost:8081}
```

En el PaaS configuras la variable `AUDIT_SERVICE_URL=https://mi-audit.railway.app` desde el panel web del proveedor, y el código no cambia.

> **Para la evaluación:** no es necesario desplegar en la nube — los servicios corriendo localmente son suficientes. Esta opción es útil si quieres mostrar el trabajo funcionando desde cualquier dispositivo o si tu PC no tiene suficiente RAM.

---

## Comparativa de todas las estrategias

| Estrategia | RAM local estimada (10 servicios) | Complejidad | Requiere |
|------------|-----------------------------------|-------------|----------|
| Sin optimizar | ~3.5 GB | Ninguna | 16 GB+ de RAM |
| Flags JVM + lazy init | ~1 GB | Baja | Solo Java/Maven ✅ |
| Docker Compose | ~800 MB | Media | Docker instalado + Dockerfile por servicio |
| Compilación nativa | ~600 MB | Alta | GraalVM + build largo |
| Red local (varias PCs) | ~1 GB (distribuido) | Media | Red WiFi/LAN compartida |
| PaaS / nube | 0 MB local | Media–Alta | Cuenta en el proveedor |

**Recomendación para la segunda evaluación:** empieza con *Flags JVM + lazy init* — cero dependencias adicionales y reduce el consumo a ~1 GB. Solo si necesitas más, explora Docker o la distribución en red.

---

*[← Ejecución local](03_ejecucion_local.md) · [Siguiente: Guión paso a paso →](05_guion_paso_a_paso.md)*



<!-- START OF FILE: docs_lessons_14-microservices_05_guion_paso_a_paso.md -->
# Documento: docs lessons 14-microservices 05 guion paso a paso
---
# Lección 14 — Comunicación entre Microservicios: Guión Paso a Paso

---

## Parte 1: RestClient (Recomendado - Spring 6.1+)

### Paso 1: Crear el Cliente HTTP

El primer paso es crear una clase dedicada que encapsule toda la lógica de comunicación con el microservicio externo. Separar esta responsabilidad en su propio `@Service` mantiene al `TicketService` limpio de detalles de red y facilita reemplazar o mockear el cliente en pruebas.

> **¿Por qué inyectar `RestClient.Builder` y no `RestClient` directamente?**  
> Spring Boot auto-configura un bean `RestClient.Builder`. Cada cliente HTTP recibe ese builder, lo personaliza con su propia `baseUrl` y lo convierte en un `RestClient` inmutable. Si inyectáramos `RestClient` directamente, todos los clientes compartirían la misma instancia con la misma URL base.

```java
// NotificationClient.java
import org.springframework.web.client.RestClient;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NotificationClient {
    
    private final RestClient restClient;
    
    // Spring inyecta el RestClient.Builder preconfigurado (no lo instanciamos nosotros)
    public NotificationClient(RestClient.Builder builder) {
        this.restClient = builder
            .baseUrl("http://localhost:8081")  // URL base de NotificationService
            .build();                           // materializa el cliente inmutable para esta clase
    }
    
    // Patrón fire-and-forget: si falla, el llamador ya completó su operación principal
    public void send(String title, String message, String type, String recipient) {
        try {
            NotificationRequest request = new NotificationRequest(title, message, type, recipient);
            
            restClient.post()              // 1. Método HTTP: POST
                .uri("/api/notifications") // 2. Ruta en NotificationService
                .body(request)            // 3. Cuerpo: Java → JSON automáticamente (Jackson)
                .retrieve()               // 4. Ejecuta la solicitud HTTP
                .toBodilessEntity();      // 5. Descarta el cuerpo de respuesta (solo nos importa el éxito)
                
            log.info("Notificación enviada a '{}': {}", recipient, title);
        } catch (Exception e) {
            // Si la notificación falla, el ticket ya fue guardado: no revertimos nada.
            // Solo logueamos para monitoreo.
            log.error("Error enviando notificación a '{}': {}", recipient, e.getMessage());
        }
    }
}
```

### Paso 2: Configurar RestClient en Spring

Spring Boot ya registra un `RestClient.Builder` disponible para inyectar, por lo que esta configuración es **opcional**. Se vuelve útil cuando necesitas aplicar comportamiento transversal a todos los clientes: interceptores de logging, headers globales, o una `requestFactory` con timeouts personalizados.

> Si no defines este `@Bean`, Spring Boot usa su propio builder por defecto, que es suficiente para empezar.

```java
// RestClientConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import java.time.Duration;

@Configuration
public class RestClientConfig {
    
    @Bean
    public RestClient.Builder restClientBuilder() {
        // BufferingClientHttpRequestFactory permite leer el cuerpo de la respuesta
        // más de una vez (útil para interceptores de logging que también lo necesitan).
        return RestClient.builder()
            .requestFactory(new org.springframework.http.client.BufferingClientHttpRequestFactory(
                new org.springframework.http.client.SimpleClientHttpRequestFactory()
            ));
    }
}
```

### Paso 3: Integrar en el Servicio Existente

`NotificationClient` se inyecta en `TicketService` exactamente igual que un repositorio: como campo `final`, para que `@RequiredArgsConstructor` lo incluya en el constructor generado. No hay ninguna diferencia en la forma de inyectarlo respecto a un bean local.

```java
// TicketService.java
@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    
    private final TicketRepository ticketRepository;
    private final NotificationClient notificationClient;  // ← nuevo campo; Spring lo inyecta igual que el repositorio
    
    public TicketResult create(TicketRequest request) {
        // ... lógica existente de creación ...
        Ticket saved = ticketRepository.save(ticket);
        
        // Notificar al asignado si existe, via NotificationService (puerto 8081)
        if (saved.getAssignedTo() != null) {
            notificationClient.send(
                "Nuevo ticket asignado",
                "Se te ha asignado el ticket '" + saved.getTitle() + "'",
                "INFO",
                saved.getAssignedTo().getEmail()
            );
        }
        
        return toResult(saved);
    }
}
```

---

## Parte 2: FeignClient (Alternativa - Múltiples Llamadas)

FeignClient es un cliente HTTP **declarativo**: defines una interfaz Java con los métodos que quieres llamar, y Spring genera la implementación en tiempo de ejecución. Es ideal cuando tienes muchas llamadas distintas al mismo servicio, ya que centraliza todo el contrato en una sola interfaz sin escribir código HTTP repetitivo.

### Paso 1: Agregar Dependencias

```xml
<!-- pom.xml -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
    <version>4.0.3</version>
</dependency>
```

### Paso 2: Habilitar Feign en la App

```java
// TicketsApplication.java
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // ← AGREGAR esta anotación
public class TicketsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TicketsApplication.class, args);
    }
}
```

### Paso 3: Declarar el Contrato del Servicio Remoto

En lugar de escribir código HTTP, defines la interfaz del servicio remoto usando anotaciones familiares (`@GetMapping`, `@PathVariable`). Feign genera la implementación en tiempo de ejecución e inyecta el resultado como cualquier `@Bean`.

> **Atributos de `@FeignClient`:**
> - `name`: identificador lógico del servicio; se usa como clave en `application.yml` para configurar timeouts y nivel de log por cliente
> - `url`: URL base del microservicio remoto
> - `fallback`: clase que implementa esta misma interfaz y se ejecuta automáticamente cuando el servicio no responde

```java
// AuditServiceClient.java
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@FeignClient(
    name = "audit-service",                    // clave para configuración en application.yml
    url = "http://localhost:8082",             // URL base de AuditService
    fallback = AuditServiceClientFallback.class
)
public interface AuditServiceClient {
    
    @PostMapping("/api/audit")
    AuditEvent logEvent(@RequestBody AuditRequest request);
    
    @GetMapping("/api/audit/ticket/{ticketId}")
    List<AuditEvent> getAuditByTicket(@PathVariable Long ticketId);
}
```

### Paso 4: Implementar el Fallback

El fallback debe implementar la misma interfaz que el `@FeignClient`. Cuando el servicio remoto no responde (timeout, error 5xx, red caída), Feign llama automáticamente al método equivalente del fallback en lugar de lanzar una excepción, permitiendo que la aplicación continúe funcionando con datos parciales o valores por defecto.

```java
// AuditServiceClientFallback.java
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Component
@Slf4j
public class AuditServiceClientFallback implements AuditServiceClient {
    
    @Override
    public AuditEvent logEvent(AuditRequest request) {
        log.warn("AuditService no disponible, evento no registrado: {}", request.action());
        return null;  // el ticket ya fue guardado; solo se pierde el log de auditoría
    }
    
    @Override
    public List<AuditEvent> getAuditByTicket(Long ticketId) {
        log.warn("AuditService no disponible, sin historial de auditoría para ticket {}", ticketId);
        return List.of();  // retornar lista vacía en lugar de lanzar excepción
    }
}
```

### Paso 5: Integrar en el Servicio

La ventaja de Feign se aprecia al integrar en el servicio: el cliente se inyecta igual que cualquier `@Service` o repositorio, y las llamadas HTTP parecen llamadas a métodos locales.

```java
// TicketService.java
@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    
    private final TicketRepository ticketRepository;
    private final AuditServiceClient auditClient;  // ← Feign inyecta la implementación generada
    
    public TicketResult updateById(Long id, TicketRequest request) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        String previousStatus = ticket.getStatus();
        
        // ... actualizar campos ...
        Ticket saved = ticketRepository.save(ticket);
        
        // Registrar en AuditService (automático via Feign)
        auditClient.logEvent(new AuditRequest(
            "STATUS_CHANGE",
            "Ticket",
            saved.getId(),
            null,       // sin usuario autenticado en este ejemplo
            "system",
            previousStatus + " → " + saved.getStatus()
        ));
        
        return toResult(saved);
    }
    
    public List<AuditEvent> getAuditTrail(Long ticketId) {
        return auditClient.getAuditByTicket(ticketId);  // Feign hace el HTTP GET por detrás
    }
}
```

---

## Parte 3: Configuración de Timeouts y Reintentos

### RestClient con Timeouts

```java
// RestClientConfig.java
@Configuration
public class RestClientConfig {
    
    @Bean
    public RestClient.Builder restClientBuilder() {
        // Configuramos la request factory con timeouts para todos los clientes
        var factory = new org.springframework.http.client.SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(java.time.Duration.ofSeconds(5));   // máximo para establecer conexión
        factory.setReadTimeout(java.time.Duration.ofSeconds(10));     // máximo para recibir respuesta
        
        return RestClient.builder()
            .requestFactory(factory);  // NotificationClient (y cualquier otro) heredarán estos timeouts
    }
}
```

### FeignClient con Timeouts

```yaml
# application.yml
spring:
  cloud:
    openfeign:
      client:
        config:
          audit-service:
            connect-timeout: 5000      # 5 segundos para conectar
            read-timeout: 10000        # 10 segundos para leer
            logger-level: BASIC        # Log de requests/responses
          default:
            connect-timeout: 5000
            read-timeout: 10000
```

---

## Parte 4: RestTemplate (Legacy - No Recomendado)

⚠️ **RestTemplate está deprecado desde Spring 6.0. Solo usar si necesitas mantener código legacy.**

> El siguiente ejemplo usa **ReportsService** (puerto 8083), un servicio que se implementará en una lección posterior. Se incluye aquí únicamente para ilustrar el patrón RestTemplate en contraste con RestClient.

```java
// RestTemplateConfig.java (DEPRECADO)
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import java.time.Duration;

@Configuration
public class RestTemplateConfig {
    
    @Bean
    @Deprecated(since = "6.0", forRemoval = true)
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
            .setConnectTimeout(Duration.ofSeconds(5))
            .setReadTimeout(Duration.ofSeconds(10))
            .build();
    }
}
```

```java
// ReportsClient.java (DEPRECADO — usar RestClient en proyectos nuevos)
@Service
@Slf4j
public class ReportsClient {
    
    private final RestTemplate restTemplate;
    
    public ReportsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public void generateReport(Long ticketId, String type) {
        String url = "http://localhost:8083/api/reports";  // ReportsService (lección futura)
        ReportRequest req = new ReportRequest(ticketId, type);
        
        try {
            restTemplate.postForObject(url, req, Void.class);
            log.info("Reporte '{}' solicitado para ticket {}", type, ticketId);
        } catch (Exception e) {
            log.error("Error solicitando reporte: {}", e.getMessage());
        }
    }
}
```

---

## Resumen: ¿Cuál Usar?

| Situación | Recomendación |
|-----------|---------------|
| **Proyecto nuevo, Spring 6.1+** | ✅ **RestClient** |
| **Múltiples servicios, código limpio** | ✅ **FeignClient** |
| **Código legacy, Spring <6.0** | ⚠️ **RestTemplate** |
| **Una llamada simple** | ✅ **RestClient** |

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_06_resttemplate_vs_feign.md -->
# Documento: docs lessons 14-microservices 06 resttemplate vs feign
---
# Lección 14 — RestClient vs RestTemplate vs FeignClient

## Tabla Comparativa

| Aspecto | RestClient | RestTemplate | FeignClient |
|---------|-----------|-------------|-------------|
| **Complejidad** | Baja | Media | Baja |
| **Dependencias** | Spring Web 6.1+ | Spring Web (ya incluido) | Spring Cloud |
| **Configuración** | Mínima | Manual | Automática |
| **Código** | Moderno | Verboso | Declarativo |
| **Casos de Uso** | Estándar moderno | Legacy | Múltiples llamadas |
| **Timeout** | Fácil | Manual | Configuración |
| **Reintentos** | Integrado | Manual | Automático |
| **Fallback** | Manual | Manual | Anotación |
| **Estado** | ✅ Recomendado | ⚠️ Deprecated | ✅ Alternativa |

---

## Ejemplo 1: RestClient (Recomendado - Spring 6.1+)

```java
@Service
public class NotificationClient {
    private final RestClient restClient;
    
    // Constructor explícito: recibe el builder de Spring y lo personaliza con la URL del servicio.
    // No usar @RequiredArgsConstructor aquí porque ya tenemos constructor explícito.
    public NotificationClient(RestClient.Builder builder) {
        this.restClient = builder
            .baseUrl("http://localhost:8081")  // NotificationService
            .build();
    }
    
    // Enviar notificación a NotificationService (fire-and-forget)
    public void send(String title, String message, String type, String recipient) {
        NotificationRequest req = new NotificationRequest(title, message, type, recipient);
        
        try {
            restClient.post()
                .uri("/api/notifications")
                .body(req)
                .retrieve()
                .toBodilessEntity();
        } catch (Exception e) {
            log.error("Error enviando notificación", e);
        }
    }
}
```

---

## Ejemplo 2: RestTemplate (Legacy - No recomendado)

> Ilustra el patrón con **ReportsService** (puerto 8083, lección futura). No debe usarse en proyectos nuevos.

```java
@Service
@Slf4j
public class ReportsClient {
    private final RestTemplate restTemplate;
    
    public ReportsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    // Solicitar generación de reporte a ReportsService (puerto 8083)
    public void generateReport(Long ticketId, String type) {
        String url = "http://localhost:8083/api/reports";
        
        ReportRequest req = new ReportRequest(ticketId, type);
        
        try {
            restTemplate.postForObject(url, req, Void.class);
        } catch (Exception e) {
            log.error("Error solicitando reporte", e);
        }
    }
}
```

---

## Ejemplo 3: FeignClient (Alternativa - Múltiples Llamadas)

```java
@FeignClient(
    name = "audit-service",                    // clave para configuración en application.yml
    url = "http://localhost:8082",             // AuditService
    fallback = AuditServiceClientFallback.class
)
public interface AuditServiceClient {
    
    @PostMapping("/api/audit")
    AuditEvent logEvent(@RequestBody AuditRequest request);
    
    @GetMapping("/api/audit/ticket/{ticketId}")
    List<AuditEvent> getAuditByTicket(@PathVariable Long ticketId);
}
```

**Uso:**
```java
@Service
@RequiredArgsConstructor
public class TicketService {
    
    private final AuditServiceClient auditClient;
    
    public TicketResult updateById(Long id, TicketRequest request) {
        // ... actualizar ticket
        Ticket saved = ticketRepository.save(ticket);
        
        // Registrar auditoría en AuditService (limpio y automático via Feign)
        auditClient.logEvent(new AuditRequest(
            "STATUS_CHANGE", "Ticket", saved.getId(), null, "system",
            "Estado actualizado"
        ));
        
        return toResult(saved);
    }
    
    public List<AuditEvent> getAuditTrail(Long ticketId) {
        return auditClient.getAuditByTicket(ticketId);
    }
}
```

---

## Decisión: ¿Cuándo usar cada uno?

```mermaid
flowchart TD
    Q1{"¿Spring 6.1+?"}
    Q1 -->|SÍ| RestClient["✅ RestClient\nNotificationService :8081"]
    Q1 -->|NO| Q2{"¿Proyecto legacy?"}
    Q2 -->|SÍ| RestTemplate["⚠️ RestTemplate\nReportsService :8083\nlección futura"]
    Q2 -->|NO| Feign1["✅ FeignClient"]

    Q3{¿Múltiples endpoints\nal mismo servicio?}
    Q3 -->|SÍ| Feign2["✅ FeignClient\nAuditService :8082"]
    Q3 -->|NO| RestClient2["✅ RestClient\nsin dependencias extra"]
```

---

## Ventajas de Cada Uno

### RestClient ✅ RECOMENDADO
✅ Estándar moderno (Spring 6.1+)  
✅ API fluida y moderna  
✅ Sin dependencias adicionales  
✅ Máximo control  
✅ Debugging fácil  
✅ Timeouts y reintentos integrados  

### RestTemplate ⚠️ DEPRECATED
❌ Deprecado desde Spring 6.0  
❌ No usar en proyectos nuevos  
✅ Aún funciona en código legacy  
✅ Sin dependencias adicionales  
❌ Código repetitivo  
❌ Manejo manual de errores  

### FeignClient ✅ ALTERNATIVA
✅ Código muy limpio y declarativo  
✅ Automático (serialización, errores)  
✅ Fallbacks integrados  
✅ Ideal para múltiples servicios  
❌ Dependencia adicional (Spring Cloud)  
❌ Menos control  
❌ Mayor complejidad si no está acostumbrado  

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_07_ejemplos_practicos.md -->
# Documento: docs lessons 14-microservices 07 ejemplos practicos
---
# Lección 14 — Ejemplos Prácticos Completos

## Escenario: Tickets + NotificationService + AuditService

### Servicio 1: NotificationService (Puerto 8081)

```java
// NotificationController.java — endpoints relevantes para el cliente
@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody NotificationRequest body) {
        // body: { title, message, type (default "INFO"), recipient (default "all") }
        // response: { id, title, message, type, recipient, sent: false, timestamp }
        ...
    }
    
    @GetMapping
    public ResponseEntity<List<?>> getAll() { ... }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) { ... }
}
```

---

### Servicio 2: AuditService (Puerto 8082)

```java
// AuditController.java — endpoints relevantes para el cliente
@RestController
@RequestMapping("/api/audit")
public class AuditController {
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody AuditRequest body) {
        // body: { action, entityType (default "Ticket"), entityId, userId, username (default "system"), details }
        // response: { id, action, entityType, entityId, userId, username, details, timestamp }
        ...
    }
    
    @GetMapping
    public ResponseEntity<List<?>> getAll() { ... }
    
    @GetMapping("/ticket/{ticketId}")
    public ResponseEntity<List<?>> getByTicket(@PathVariable Long ticketId) { ... }
}
```

---

### Servicio 3: Tickets Service (Puerto 8080 — Cliente)

#### Opción A: Con RestClient (NotificationClient → NotificationService)

```java
// RestClientConfig.java
@Configuration
public class RestClientConfig {
    
    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder()
            .requestFactory(new org.springframework.http.client.BufferingClientHttpRequestFactory(
                new org.springframework.http.client.SimpleClientHttpRequestFactory()
            ));
    }
}

// NotificationClient.java
@Service
@Slf4j
public class NotificationClient {
    
    private final RestClient restClient;
    
    public NotificationClient(RestClient.Builder builder) {
        this.restClient = builder
            .baseUrl("http://localhost:8081")
            .build();
    }
    
    public void send(String title, String message, String type, String recipient) {
        try {
            NotificationRequest request = new NotificationRequest(title, message, type, recipient);
            restClient.post()
                .uri("/api/notifications")
                .body(request)
                .retrieve()
                .toBodilessEntity();
            log.info("Notificación enviada a '{}': {}", recipient, title);
        } catch (Exception e) {
            log.error("Error enviando notificación a '{}': {}", recipient, e.getMessage());
        }
    }
}

// TicketService.java (con RestClient)
@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    
    private final TicketRepository ticketRepository;
    private final NotificationClient notificationClient;
    
    public TicketResult create(TicketRequest request) {
        // ... lógica de creación ...
        Ticket saved = ticketRepository.save(ticket);
        
        if (saved.getAssignedTo() != null) {
            notificationClient.send(
                "Nuevo ticket asignado",
                "Se te ha asignado el ticket '" + saved.getTitle() + "'",
                "INFO",
                saved.getAssignedTo().getEmail()
            );
        }
        
        return toResult(saved);
    }
    
    public TicketResult assignTicket(Long id, Long userId) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        // ... lógica de asignación ...
        Ticket saved = ticketRepository.save(ticket);
        
        notificationClient.send(
            "Ticket asignado",
            "Se te ha asignado el ticket '" + saved.getTitle() + "'",
            "INFO",
            saved.getAssignedTo().getEmail()
        );
        
        return toResult(saved);
    }
}
```

#### Opción B: Con FeignClient (AuditServiceClient → AuditService)

```java
// TicketsApplication.java
@SpringBootApplication
@EnableFeignClients
public class TicketsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TicketsApplication.class, args);
    }
}

// AuditServiceClient.java (con Feign)
@FeignClient(
    name = "audit-service",
    url = "http://localhost:8082",
    fallback = AuditServiceClientFallback.class
)
public interface AuditServiceClient {
    
    @PostMapping("/api/audit")
    AuditEvent logEvent(@RequestBody AuditRequest request);
    
    @GetMapping("/api/audit/ticket/{ticketId}")
    List<AuditEvent> getAuditByTicket(@PathVariable Long ticketId);
}

// AuditServiceClientFallback.java
@Component
@Slf4j
public class AuditServiceClientFallback implements AuditServiceClient {
    
    @Override
    public AuditEvent logEvent(AuditRequest request) {
        log.warn("AuditService no disponible, evento no registrado: {}", request.action());
        return null;
    }
    
    @Override
    public List<AuditEvent> getAuditByTicket(Long ticketId) {
        log.warn("AuditService no disponible, sin historial para ticket {}", ticketId);
        return List.of();
    }
}

// TicketService.java (con FeignClient)
@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    
    private final TicketRepository ticketRepository;
    private final AuditServiceClient auditClient;
    
    public TicketResult updateById(Long id, TicketRequest request) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        String previousStatus = ticket.getStatus();
        
        // ... actualizar campos ...
        Ticket saved = ticketRepository.save(ticket);
        
        auditClient.logEvent(new AuditRequest(
            "STATUS_CHANGE",
            "Ticket",
            saved.getId(),
            null,
            "system",
            previousStatus + " → " + saved.getStatus()
        ));
        
        return toResult(saved);
    }
    
    public List<AuditEvent> getAuditTrail(Long ticketId) {
        return auditClient.getAuditByTicket(ticketId);
    }
}
```

#### Opción C: Con RestTemplate (Legacy — No recomendado)

> Ilustra el patrón con **ReportsService** (puerto 8083), un servicio que se implementará en una lección futura.

```java
// TicketsApplication.java (DEPRECADO)
@SpringBootApplication
public class TicketsApplication {
    
    @Bean
    @Deprecated(since = "6.0", forRemoval = true)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

// ReportsClient.java (con RestTemplate — DEPRECADO)
@Service
@RequiredArgsConstructor
@Slf4j
public class ReportsClient {
    
    private final RestTemplate restTemplate;
    
    public void generateReport(Long ticketId, String type) {
        String url = "http://localhost:8083/api/reports";  // ReportsService (lección futura)
        ReportRequest req = new ReportRequest(ticketId, type);
        
        try {
            restTemplate.postForObject(url, req, Void.class);
            log.info("Reporte '{}' solicitado para ticket {}", type, ticketId);
        } catch (Exception e) {
            log.error("Error solicitando reporte: {}", e.getMessage());
        }
    }
}
```

---

## Configuración en `application.yml`

### Con RestClient
```yaml
spring:
  application:
    name: tickets-service

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"

logging:
  level:
    org.springframework.web.client: DEBUG
```

### Con FeignClient
```yaml
spring:
  application:
    name: tickets-service
  
  cloud:
    openfeign:
      client:
        config:
          default:
            connect-timeout: 5000
            read-timeout: 10000
            logger-level: BASIC
          
          audit-service:
            connect-timeout: 3000
            read-timeout: 8000
            logger-level: FULL

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"

logging:
  level:
    org.springframework.cloud.openfeign: DEBUG
```

---

## DTOs

```java
// NotificationRequest.java — cuerpo enviado a NotificationService
public record NotificationRequest(String title, String message, String type, String recipient) {}

// AuditRequest.java — cuerpo enviado a AuditService
public record AuditRequest(String action, String entityType, Long entityId, Long userId, String username, String details) {}

// AuditEvent.java — respuesta de AuditService
public record AuditEvent(Long id, String action, String entityType, Long entityId, Long userId, String username, String details, Long timestamp) {}
```

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_08_manejo_errores.md -->
# Documento: docs lessons 14-microservices 08 manejo errores
---
# Lección 14 — Manejo de Errores y Resiliencia

## Timeouts

### RestClient (Recomendado)
```java
@Configuration
public class RestClientConfig {
    
    @Bean
    public RestClient.Builder restClientBuilder() {
        // Configuramos la request factory con timeouts para todos los clientes
        var factory = new org.springframework.http.client.SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(java.time.Duration.ofSeconds(5));   // tiempo máximo para establecer conexión
        factory.setReadTimeout(java.time.Duration.ofSeconds(10));     // tiempo máximo para recibir respuesta
        
        return RestClient.builder()
            .requestFactory(factory);  // todos los clientes construidos con este builder heredan los timeouts
    }
}
```

### FeignClient
```yaml
spring:
  cloud:
    openfeign:
      client:
        config:
          audit-service:
            connect-timeout: 5000     # 5 segundos
            read-timeout: 10000       # 10 segundos
```

### RestTemplate (Legacy - No recomendado)
```java
@Configuration
public class RestTemplateConfig {
    
    @Bean
    @Deprecated(since = "6.0", forRemoval = true)
    public RestTemplate restTemplate() {
        HttpComponentsClientHttpRequestFactory factory = 
            new HttpComponentsClientHttpRequestFactory();
        
        factory.setConnectTimeout(5000);    // 5 segundos
        factory.setReadTimeout(10000);      // 10 segundos
        
        return new RestTemplate(factory);
    }
}
```

---

## Reintentos Automáticos

### RestClient
```java
@Service
@Slf4j
public class NotificationClient {
    
    private final RestClient restClient;
    
    public void sendWithRetry(String title, String message, String type, String recipient) {
        retry(() -> {
            NotificationRequest req = new NotificationRequest(title, message, type, recipient);
            restClient.post()
                .uri("/api/notifications")
                .body(req)
                .retrieve()
                .toBodilessEntity();
            return null;
        }, 3);
    }
    
    private <T> T retry(Supplier<T> supplier, int maxAttempts) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                return supplier.get();
            } catch (Exception e) {
                if (attempt == maxAttempts) throw e;
                log.warn("Attempt {} failed, retrying...", attempt);
                try {
                    Thread.sleep(1000L * attempt);  // espera incremental: 1s, 2s, 3s… (backoff lineal)
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(ie);
                }
            }
        }
        throw new RuntimeException("Retries exhausted");
    }
}
```

### FeignClient
```yaml
spring:
  cloud:
    openfeign:
      client:
        config:
          audit-service:
            # Reintentos
            max-attempts: 3
            retry-delay: 1000  # 1 segundo entre intentos
```

---

## Circuit Breaker (Resilience4j)

```xml
<!-- pom.xml -->
<dependency>
    <groupId>io.github.resilience4j</groupId>
    <artifactId>resilience4j-spring-boot3</artifactId>
    <version>2.1.0</version>
</dependency>
```

```java
@Service
@RequiredArgsConstructor
@Slf4j
public class TicketService {
    
    private final AuditServiceClient auditClient;
    
    @CircuitBreaker(
        name = "audit-service",
        fallbackMethod = "getAuditFallback"
    )
    public List<AuditEvent> getAuditTrail(Long ticketId) {
        return auditClient.getAuditByTicket(ticketId);
    }
    
    // Fallback: ejecutarse si circuit abre
    private List<AuditEvent> getAuditFallback(Long ticketId, Exception e) {
        log.warn("Circuit abierto para AuditService, retornando lista vacía para ticket {}", ticketId);
        return List.of();
    }
}
```

```yaml
resilience4j:
  circuitbreaker:
    configs:
      default:
        failure-rate-threshold: 50         # Abrir si 50% de llamadas falla
        wait-duration-in-open-state: 10s   # Esperar 10s antes de reintentar
        permitted-number-of-calls-in-half-open-state: 3
    instances:
      audit-service:
        base-config: default
```

---

## Manejo de Excepciones

```java
@ExceptionHandler(HttpClientErrorException.class)
public ResponseEntity<?> handleHttpClientException(HttpClientErrorException e) {
    log.error("HTTP error: {}", e.getMessage());
    
    if (e.getStatusCode().value() == 404) {
        return ResponseEntity.notFound().build();
    }
    
    return ResponseEntity.status(e.getStatusCode())
        .body("Error en llamada a microservicio");
}

@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleGenericException(Exception e) {
    log.error("Error de comunicación: {}", e.getMessage());
    return ResponseEntity.status(503)
        .body("Servicio temporalmente no disponible");
}
```

---

## Logging Detallado

```yaml
logging:
  level:
    org.springframework.cloud.openfeign: DEBUG
    org.springframework.web.client.RestClient: DEBUG
    org.springframework.web.client.RestTemplate: DEBUG
    
    # Por cliente específico
    com.example.clients: TRACE
```

```java
// Logger personalizado para Feign
@Component
public class FeignLoggingConfiguration {
    
    @Bean
    public feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}

// Logger personalizado para RestClient
@Component
@Slf4j
public class RestClientInterceptor {
    
    public void logRequest(HttpRequest request, byte[] body) {
        log.debug("REST request: {} {}", request.getMethod(), request.getURI());
    }
    
    public void logResponse(HttpResponse response) {
        log.debug("REST response: {}", response.getStatusCode());
    }
}
```

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_09_debugging.md -->
# Documento: docs lessons 14-microservices 09 debugging
---
# Lección 14 — Debugging y Troubleshooting

## Error 1: "Connection refused"

**Síntoma:**
```
java.net.ConnectException: Connection refused
```

**Causas:**
- El otro microservicio no está corriendo
- URL incorrecta (puerto, host)
- Firewall bloqueando

**Solución:**
```bash
# Linux/macOS: verificar que los servicios están corriendo
lsof -i :8081  # NotificationService
lsof -i :8082  # AuditService

# Windows: equivalente
netstat -aon | findstr :8081
netstat -aon | findstr :8082

# Probar conexión manualmente
curl http://localhost:8081/api/notifications
curl http://localhost:8082/api/audit
```

---

## Error 2: "Read timed out"

**Síntoma:**
```
java.net.SocketTimeoutException: Read timed out
```

**Causa:** El servicio tarda más del timeout configurado.

**Solución:**

### Con RestClient
```java
// Configurar en RestClient builder
restClient = builder
    .baseUrl("http://localhost:8081")
    .build();
```

### Con FeignClient
```yaml
spring:
  cloud:
    openfeign:
      client:
        config:
          audit-service:
            read-timeout: 30000  # Aumentar a 30 segundos
```

### Con RestTemplate (Legacy)
```java
@Bean
public RestTemplate restTemplate() {
    HttpComponentsClientHttpRequestFactory factory = 
        new HttpComponentsClientHttpRequestFactory();
    factory.setReadTimeout(30000);
    return new RestTemplate(factory);
}
```

---

## Error 3: "Bean not found"

**Síntoma (RestClient):**
```
Error creating bean with name 'restClientBuilder'
```

**Síntoma (FeignClient):**
```
Error creating bean with name 'auditServiceClient'
No bean of type 'AuditServiceClient' found
```

**Causa FeignClient:** `@EnableFeignClients` no está en la app principal.

**Solución:**
```java
@SpringBootApplication
@EnableFeignClients  // ← AGREGAR solo para Feign
public class TicketsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TicketsApplication.class, args);
    }
}
```

---

## Error 4: "Invalid content-type"

**Síntoma:**
```
Content-Type: text/plain; charset=UTF-8
Could not deserialize response body of type [class UserDTO]
```

**Causa:** Respuesta no es JSON.

**Solución:**
1. Verificar que el servicio devuelve `Content-Type: application/json`
2. Probar manualmente:
```bash
curl -v http://localhost:8081/api/notifications
curl -v http://localhost:8082/api/audit
# Ver headers en respuesta
```

---

## Debugging: Logs Detallados

### RestClient
```yaml
logging:
  level:
    org.springframework.web.client.RestClient: DEBUG
```

### FeignClient
```yaml
logging:
  level:
    org.springframework.cloud.openfeign: DEBUG
    feign.Logger: DEBUG
```

### RestTemplate (Legacy)
```yaml
logging:
  level:
    org.springframework.web.client.RestTemplate: DEBUG
```

**Verás en logs:**
```
[AuditServiceClient#logEvent] ---> POST http://localhost:8082/api/audit HTTP/1.1
[AuditServiceClient#logEvent] Content-Type: application/json
[AuditServiceClient#logEvent] ---> END HTTP (87-byte body)
[AuditServiceClient#logEvent] <--- HTTP/1.1 200 OK (45ms)
[AuditServiceClient#logEvent] Content-Type: application/json
[AuditServiceClient#logEvent] {"id":1,"action":"STATUS_CHANGE","entityType":"Ticket"}
[AuditServiceClient#logEvent] <--- END HTTP (102-byte body)
```

---

## Testing: Mock de Microservicios

```java
@SpringBootTest
public class TicketServiceTest {
    
    @MockBean
    private AuditServiceClient auditClient;  // Funciona para FeignClient
    
    @MockBean
    private NotificationClient notificationClient;  // Funciona para RestClient
    
    @Autowired
    private TicketService ticketService;
    
    @Test
    public void testUpdateById_registersAuditEvent() {
        // Mock del servicio remoto
        AuditEvent mockEvent = new AuditEvent(1L, "STATUS_CHANGE", "Ticket", 1L, null, "system", "NEW → IN_PROGRESS", 0L);
        
        when(auditClient.logEvent(any()))
            .thenReturn(mockEvent);
        
        // Ejecutar
        ticketService.updateById(1L, request);
        
        // Verificar que se llamó a AuditService
        verify(auditClient).logEvent(any(AuditRequest.class));
    }
    
    @Test
    public void testGetAuditTrailWhenAuditServiceFails() {
        // Simular fallo — el fallback retorna lista vacía
        when(auditClient.getAuditByTicket(1L))
            .thenReturn(List.of());
        
        List<AuditEvent> result = ticketService.getAuditTrail(1L);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
```

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_10_checklist_rubrica_minima.md -->
# Documento: docs lessons 14-microservices 10 checklist rubrica minima
---
# Lección 14 — Checklist y Rúbrica Mínima

## ✅ Checklist de Completitud

### Dependencias

- [ ] Spring Cloud OpenFeign agregado a `pom.xml` (si usas Feign)
- [ ] Resilience4j agregado (opcional, para circuit breaker)
- [ ] RestClient disponible (Spring 6.1+)

### Código

- [ ] `@EnableFeignClients` en aplicación principal (si usas Feign)
- [ ] RestClient.Builder inyectado (si usas RestClient)
- [ ] Cliente HTTP creado (RestClient, Feign interface o RestTemplate)
- [ ] Fallback implementado (para Feign)
- [ ] Manejo de errores implementado

### Configuración

- [ ] Timeouts configurados en `application.yml`
- [ ] Logging configurado para ver requests/responses
- [ ] URLs correctas (host y puerto)
- [ ] Perfil seleccionado correctamente

### Testing

- [ ] Probaste comunicación entre servicios
- [ ] Tests con mocks de clientes HTTP
- [ ] Probaste fallback cuando servicio cae

### Documentación

- [ ] Entiendo cuándo usar RestClient vs FeignClient vs RestTemplate
- [ ] Puedo explicar qué son microservicios
- [ ] Sé cómo manejar timeouts y errores
- [ ] Entiendo circuit breaker

---

## 🎓 Rúbrica de Evaluación

### 1. Implementación HTTP (40%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Uso correcto | ❌ No funciona | ✅ Funciona | ✅ + optimizado |
| RestClient | ❌ No usa | ✅ Usa correctamente | ✅ + configurado |
| FeignClient | ❌ No comprende | ✅ Usa | ✅ + fallback |
| RestTemplate | ❌ Usa deprecated | ✅ Solo si legacy | ✅ N/A |
| Elección | ❌ Equivocada | ✅ Apropiada | ✅ + justificada |

### 2. Manejo de Errores (30%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Timeouts | ❌ No configurado | ✅ Configurado | ✅ + por cliente |
| Excepciones | ❌ No manejadas | ✅ Try/catch | ✅ + custom handlers |
| Fallback | ❌ No existe | ✅ Básico | ✅ + resiliente |
| Logging | ❌ No hay | ✅ Básico | ✅ + detallado |

### 3. Comunicación (20%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Entre servicios | ❌ No comunica | ✅ Comunica | ✅ + bidireccional |
| Modelos DTO | ❌ Mal formatos | ✅ Correcto | ✅ + documentados |
| Respuestas | ❌ Incompletas | ✅ Correctas | ✅ + validadas |

### 4. Conocimiento (10%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Microservicios | ❌ Confuso | ✅ Entiende | ✅ + ventajas/desventajas |
| RestClient vs Feign | ❌ No diferencia | ✅ Conoce diferencias | ✅ + cuándo usar cada uno |
| Debugging | ❌ No sabe | ✅ Puede debuggear | ✅ + logs avanzados |

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_14-microservices_11_actividad_individual.md -->
# Documento: docs lessons 14-microservices 11 actividad individual
---
# Lección 14 — Actividad Individual

## 🎯 Objetivo

Implementar comunicación HTTP entre tu aplicación Tickets y **dos servicios externos nuevos** que no se vieron en la lección. Debes aplicar de forma independiente los patrones aprendidos: RestClient, FeignClient o RestTemplate.

> ⚠️ Los servicios de esta actividad (**SearchService** y **SLAService**) aún no están implementados. Se desarrollarán en lecciones posteriores. Para esta actividad debes implementar los **clientes** en Tickets y verificar que el código compila correctamente. Puedes mockear las llamadas en tus tests.

---

## 📋 Servicios a Integrar

### SearchService (Puerto 8084)
Indexa tickets para permitir búsqueda full-text. Cada vez que se crea o actualiza un ticket, debe enviarse al índice.

```
POST /api/search/index
Body:  { ticketId: Long, title: String, description: String, status: String }
Response: 204 No Content
```

**Cliente sugerido:** RestClient (operación única, sin respuesta que procesar).

### SLAService (Puerto 8085)
Controla los tiempos de resolución (Service Level Agreement). Cuando se crea un ticket inicia el contador; también permite consultar el estado del SLA de un ticket.

```
POST /api/sla/start
Body:  { ticketId: Long, priority: String }
Response: { id: Long, ticketId: Long, priority: String, deadline: String, status: String }

GET /api/sla/{ticketId}
Response: { id: Long, ticketId: Long, priority: String, deadline: String, status: String }
```

**Cliente sugerido:** FeignClient (dos endpoints distintos → estilo declarativo más limpio).

---

## 📋 Requisitos Mínimos

### 1. Elegir Cliente HTTP

Para cada servicio decide cuál cliente usar y justifica:

| Servicio | Mi cliente elegido | Justificación |
|----------|--------------------|---------------|
| SearchService | | |
| SLAService | | |

**Guía de decisión:**
- **RestClient**: operación puntual, sin dependencias extras, Spring 6.1+
- **FeignClient**: múltiples endpoints al mismo servicio, estilo declarativo
- **RestTemplate**: solo si mantienes código legacy (Spring < 6.0)

### 2. Implementar DTOs

```java
// SearchIndexRequest.java
public record SearchIndexRequest(Long ticketId, String title, String description, String status) {}

// SlaStartRequest.java
public record SlaStartRequest(Long ticketId, String priority) {}

// SlaEvent.java
public record SlaEvent(Long id, Long ticketId, String priority, String deadline, String status) {}
```

### 3. Implementar Clientes

Crea los clientes en el paquete `clients/`:

**SearchClient** (RestClient):
- [ ] Constructor con `RestClient.Builder`, `baseUrl("http://localhost:8084")`
- [ ] Método `index(Long ticketId, String title, String description, String status)`
- [ ] Manejo de excepción (fire-and-forget, solo log si falla)

**SlaServiceClient** (FeignClient):
- [ ] Interface anotada con `@FeignClient(name = "sla-service", url = "http://localhost:8085")`
- [ ] Método `startSla(@RequestBody SlaStartRequest request)` → `SlaEvent`
- [ ] Método `getSla(@PathVariable Long ticketId)` → `SlaEvent`
- [ ] Clase fallback con respuestas vacías/nulas
- [ ] `@EnableFeignClients` en `TicketsApplication`

### 4. Integración en TicketService

- [ ] En `create()`: llama a `searchClient.index(...)` después de guardar el ticket
- [ ] En `create()`: llama a `slaClient.startSla(...)` con el `ticketId` y prioridad del ticket
- [ ] Nuevo endpoint `GET /tickets/{id}/sla` en el controller → delega en `slaClient.getSla(id)`

Ejemplo de integración esperada:
```java
public Ticket create(TicketRequest request) {
    Ticket saved = repository.save(/* ... */);
    
    searchClient.index(saved.getId(), saved.getTitle(), saved.getDescription(), saved.getStatus());
    slaClient.startSla(new SlaStartRequest(saved.getId(), /* priority */));
    
    return saved;
}
```

### 5. Manejo de Errores

- [ ] Timeout configurado (5s conexión, 10s lectura) para SearchClient
- [ ] Fallback implementado en SlaServiceClient
- [ ] Si SearchService cae, el ticket igual se crea (no debe fallar el flujo principal)
- [ ] Si SLAService cae, el fallback retorna `null` y se loguea el error

---

## 🚀 Pasos

1. **Crear DTOs** (`SearchIndexRequest`, `SlaStartRequest`, `SlaEvent`)

2. **Implementar clientes**
   ```java
   // SearchClient (RestClient)
   searchClient.index(saved.getId(), saved.getTitle(), saved.getDescription(), saved.getStatus());
   
   // SlaServiceClient (FeignClient, dos endpoints)
   SlaEvent sla = slaClient.startSla(new SlaStartRequest(ticketId, priority));
   SlaEvent current = slaClient.getSla(ticketId);
   ```

3. **Registrar `@EnableFeignClients`** en `TicketsApplication`

4. **Configurar timeout** para SearchClient en `RestClientConfig`
   ```java
   var factory = new SimpleClientHttpRequestFactory();
   factory.setConnectTimeout(Duration.ofSeconds(5));
   factory.setReadTimeout(Duration.ofSeconds(10));
   ```

5. **Implementar fallback** para SlaServiceClient
   ```java
   @Component
   public class SlaServiceClientFallback implements SlaServiceClient {
       public SlaEvent startSla(SlaStartRequest request) {
           log.warn("SLAService no disponible, ticket {} sin SLA", request.ticketId());
           return null;
       }
       public SlaEvent getSla(Long ticketId) { return null; }
   }
   ```

6. **Integrar en TicketService** y agregar endpoint `/tickets/{id}/sla` en el controller

7. **Probar que compila**
   ```bash
   cd Tickets-14
   mvnw.cmd package -DskipTests
   ```

8. **Escribir test con mock**
   ```java
   @MockBean
   private SlaServiceClient slaClient;
   @MockBean
   private SearchClient searchClient;
   
   @Test
   void create_callsSearchAndSla() {
       ticketService.create(request);
       verify(searchClient).index(anyLong(), anyString(), anyString(), anyString());
       verify(slaClient).startSla(any(SlaStartRequest.class));
   }
   ```

9. **Commit**
   ```bash
   git commit -m "feat: integración con SearchService y SLAService"
   ```

---

## ✅ Validación

Debes poder responder:

- [ ] "¿Por qué usé RestClient para SearchService y FeignClient para SLAService?"
- [ ] "¿Qué diferencia hay entre fire-and-forget y esperar respuesta?"
- [ ] "¿Qué pasa si SearchService o SLAService caen en producción?"
- [ ] "¿Cómo configuro timeout en RestClient?"
- [ ] "¿Por qué FeignClient es más limpio cuando hay múltiples endpoints?"
- [ ] "¿Qué hace el fallback de SlaServiceClient?"
- [ ] "¿Cómo verifico en un test que mi servicio llamó al cliente correcto?"

---

## 📦 Entrega

Sube tu código con:
- ✅ `SearchClient.java` con RestClient
- ✅ `SlaServiceClient.java` con FeignClient + fallback
- ✅ DTOs: `SearchIndexRequest`, `SlaStartRequest`, `SlaEvent`
- ✅ Integración en `TicketService.create()`
- ✅ Endpoint `GET /tickets/{id}/sla` en controller
- ✅ Timeout configurado
- ✅ Tests con mocks (verifican que se llama a ambos clientes)

---

## 🔥 Desafío Extra (Opcional)

- Implementar **circuit breaker** con Resilience4j sobre `SlaServiceClient`
- Agregar endpoint `PUT /tickets/{id}/sla/close` que cierra el SLA al resolver el ticket
- Implementar reintentos automáticos en `SearchClient`
- Comparar performance RestClient vs FeignClient con JMeter o similares

---

*[← Volver a Lección 14](01_objetivo_y_alcance.md)*




<!-- START OF FILE: docs_lessons_14-microservices_README.md -->
# Documento: docs lessons 14-microservices README
---
# Lección 14 — Comunicación entre Microservicios

**Aprende a comunicar dos microservicios independientes usando RestClient, FeignClient o RestTemplate. Implementa resilencia, timeouts y fallbacks.**

---

## 📚 Contenidos

| Documento | Duración | Para |
|-----------|----------|------|
| **01. Objetivo y Alcance** | 5 min | Entender qué aprenderás |
| **02. Organización de Repositorios** | 8 min | Monorepo, polyrepo y Maven multi-módulo |
| **03. Ejecución Local** | 8 min | Correr 10 servicios con poca RAM |
| **04. Despliegue Distribuido** | 8 min | Red local, PaaS y comparativa |
| **05. Guión Paso a Paso** ⭐ | 20 min | Instrucciones prácticas |
| **06. RestClient vs RestTemplate vs FeignClient** | 10 min | Comparación y decisión |
| **07. Ejemplos Prácticos** | 15 min | Código completo |
| **08. Manejo de Errores** | 10 min | Timeouts, fallbacks, resilencia |
| **09. Debugging** | 10 min | Logs y troubleshooting |
| **10. Checklist** | 5 min | Verificación |
| **11. Actividad Individual** | - | Tu tarea |

---

## 🎯 Quick Start (10 min)

### Con RestClient (Recomendado — NotificationService)

```java
// NotificationClient.java
@Service
public class NotificationClient {
    private final RestClient restClient;
    
    public NotificationClient(RestClient.Builder builder) {
        this.restClient = builder
            .baseUrl("http://localhost:8081")
            .build();
    }
    
    public void send(String title, String message, String type, String recipient) {
        restClient.post()
            .uri("/api/notifications")
            .body(new NotificationRequest(title, message, type, recipient))
            .retrieve()
            .toBodilessEntity();
    }
}
```

### Con FeignClient (Alternativa — AuditService)

```java
// 1. Habilitar
@SpringBootApplication
@EnableFeignClients
public class TicketsApplication {}

// 2. Crear cliente
@FeignClient(name = "audit-service", url = "http://localhost:8082",
             fallback = AuditServiceClientFallback.class)
public interface AuditServiceClient {
    @PostMapping("/api/audit")
    AuditEvent logEvent(@RequestBody AuditRequest request);
    
    @GetMapping("/api/audit/ticket/{ticketId}")
    List<AuditEvent> getAuditByTicket(@PathVariable Long ticketId);
}

// 3. Inyectar y usar
@Service
@RequiredArgsConstructor
public class TicketService {
    private final AuditServiceClient auditClient;
    
    public void afterCreate(Ticket saved) {
        auditClient.logEvent(new AuditRequest(
            "TICKET_CREATED", "Ticket", saved.getId(), null, "system", null
        ));
    }
}
```

### Con RestTemplate (Legacy — ReportsService, no recomendado)

> ⚠️ ReportsService aún no está implementado; se desarrollará en una lección posterior. Este ejemplo muestra el patrón legacy de RestTemplate.

```java
// 1. Registrar bean
@Bean
@Deprecated(since = "6.0", forRemoval = true)
public RestTemplate restTemplate() {
    return new RestTemplate();
}

// 2. ReportsClient.java
@Service
public class ReportsClient {
    private final RestTemplate restTemplate;
    
    public ReportsClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public void generateReport(Long ticketId, String type) {
        restTemplate.postForObject(
            "http://localhost:8083/api/reports",
            new ReportRequest(ticketId, type),
            Void.class
        );
    }
}
```

---

## 🔑 Conceptos Clave

### Microservicios

Arquitectura donde una aplicación se divide en múltiples servicios independientes:

```mermaid
flowchart TB
    subgraph Antes[Monolito]
        direction TB
        A[Tickets code]
        B[Notifications code]
        C[Audit code]
    end

    subgraph Después[Microservicios]
        direction LR
        D[Tickets :8080] -->|RestClient| E[NotificationService :8081]
        D -->|FeignClient| F[AuditService :8082]
    end
```

### RestClient vs RestTemplate vs FeignClient

| Aspecto | RestClient | RestTemplate | FeignClient |
|---------|-----------|-------------|-------------|
| **Líneas de código** | Pocas | Muchas | Pocas |
| **Aprendizaje** | Fácil | Fácil | Intermedio |
| **Automático** | Parcial | No | Sí |
| **Ideal para** | Estándar moderno | Legacy | Múltiples llamadas |
| **Estado** | ✅ Recomendado | ⚠️ Deprecated | ✅ Alternativa |

---

## 📂 Estructura

```
src/main/java/
├── clients/
│   ├── NotificationClient.java             (RestClient → NotificationService :8081)
│   ├── AuditServiceClient.java             (FeignClient → AuditService :8082)
│   ├── AuditServiceClientFallback.java     (Fallback para FeignClient)
│   └── ReportsClient.java                  (RestTemplate legacy → ReportsService :8083)
├── services/
│   └── TicketService.java                  (usa clientes)
└── TicketsApplication.java                 (@EnableFeignClients)
```

---

## ✅ Checklist

- [ ] Dependencia de cliente HTTP elegida (RestClient / RestTemplate / FeignClient)
- [ ] Cliente HTTP creado
- [ ] Fallback para errores (si aplica)
- [ ] Timeouts configurados
- [ ] Integrado en TicketService
- [ ] API responde con datos enriquecidos
- [ ] Tests con mocks

---

## 🚀 Sigue el Guión

Comienza con **[02. Guión Paso a Paso](02_guion_paso_a_paso.md)** para instrucciones detalladas.

---

*Lección 14 de 18 - [← Volver a Lecciones](../)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_01_objetivo_y_alcance.md -->
# Documento: docs lessons 15-flyway-migrations 01 objetivo y alcance
---
# Lección 15 — Migraciones de Base de Datos con Flyway

## ¿De dónde venimos?

En la lección 11 configuraste múltiples bases de datos (H2, MySQL, Supabase) con perfiles de Spring Boot. En la lección 14 implementaste comunicación entre microservicios usando RestClient y FeignClient. Tu aplicación crea las tablas automáticamente gracias a `ddl-auto: update` de JPA/Hibernate, pero a medida que crece y conecta con otros servicios, necesitas más control sobre los cambios de esquema.

Esto funciona en desarrollo, pero tiene problemas en producción:

- **Sin control de versiones:** Si cambias el esquema, ¿cómo lo sincronizas con la BD de otros desarrolladores?
- **Cambios irreversibles:** `ddl-auto: update` nunca borra columnas; si cometes un error, queda para siempre
- **Múltiples BDs:** En Supabase necesitas sincronizar cambios de esquema sin código Java
- **Auditoría:** No hay registro de quién cambió qué en la BD

Esta lección introduce **Flyway**, una herramienta profesional de migraciones que soluciona todo esto.

---

## Los dos enfoques

| Enfoque | Tool | Cuándo | Ventajas | Desventajas |
|---------|------|--------|----------|------------|
| **JPA Auto** | Hibernate + `ddl-auto` | Desarrollo local, H2 | Simple, automático | Sin versiones, sin reversión |
| **Migraciones** | Flyway | Desarrollo persistente, producción | Versionado, reversible, profesional | Requiere escribir SQL |

---

## ¿Qué vas a construir?

Al terminar esta lección podrás:

1. Entender cuándo usar JPA automático vs Flyway
2. Configurar Flyway para MySQL y Supabase
3. Escribir migraciones SQL versionadas
4. Aplicar migraciones automáticamente al arrancar
5. Revertir migraciones si cometes un error
6. Mantener múltiples BDs sincronizadas

### Lo que vas a poder explicar

- ¿Por qué Flyway es importante en producción?
- ¿Cómo funciona el versionado de Flyway?
- ¿Qué hace la carpeta `db/migration/` y cómo nombrar archivos?
- ¿Por qué H2 no necesita Flyway si usan JPA?
- ¿Cómo revertir una migración si sale mal?
- ¿Cuál es la diferencia entre Flyway y Liquibase?

---

## Estructura de la Lección

1. **[Este documento](01_objetivo_y_alcance.md)** — Objetivo y alcance
2. **[Guión Paso a Paso](02_guion_paso_a_paso.md)** — Instrucciones prácticas
3. **[Configuración por Perfil](03_configuracion_por_perfil.md)** — YAML + propiedades
4. **[Ejemplos de Migraciones](04_ejemplos_migraciones.md)** — Scripts SQL listos
5. **[Comparación: JPA vs Flyway](05_jpa_vs_flyway.md)** — Cuándo usar cada uno
6. **[Troubleshooting](06_troubleshooting.md)** — Errores y soluciones
7. **[Checklist](07_checklist_rubrica_minima.md)** — Verificación
8. **[Actividad Individual](08_actividad_individual.md)** — Tu tarea



<!-- START OF FILE: docs_lessons_15-flyway-migrations_02_guion_paso_a_paso.md -->
# Documento: docs lessons 15-flyway-migrations 02 guion paso a paso
---
# Lección 15 — Flyway: Guión Paso a Paso

---

## Paso 1: Entender qué es Flyway

Flyway es una herramienta que **versionea cambios de base de datos** como si fuera Git, pero para SQL:

```
Versión 1: V1__create_tickets_table.sql
           → CREATE TABLE tickets (id INT, title VARCHAR...)

Versión 2: V2__add_priority_column.sql
           → ALTER TABLE tickets ADD COLUMN priority VARCHAR

Versión 3: V3__create_users_table.sql
           → CREATE TABLE users (id INT, name VARCHAR...)
```

Cada migración se ejecuta **una sola vez**, en orden. Si la BD no tiene el cambio, Flyway lo aplica automáticamente.

---

## Paso 2: Agregar Flyway al `pom.xml`

```xml
<!-- pom.xml -->

<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
    <version>9.22.3</version>
</dependency>

<!-- Si usas Supabase o MySQL, también agrega el driver de PostgreSQL/MySQL -->
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-mysql</artifactId>
    <version>9.22.3</version>
</dependency>
```

Ejecuta:
```bash
./mvnw clean install
```

---

## Paso 3: Crear la Carpeta de Migraciones

En `src/main/resources/`, crea esta estructura:

```
Tickets/src/main/resources/
└── db/
    └── migration/
        ├── mysql/
        │   ├── V1__create_tickets_table.sql
        │   └── V2__add_status_column.sql
        └── supabase/
            ├── V1__create_tickets_table.sql
            └── V2__add_status_column.sql
```

> **¿Por qué dos carpetas?** Porque MySQL y PostgreSQL (Supabase) tienen pequeñas diferencias en SQL. H2 no necesita carpeta porque usa JPA automático.

---

## Paso 4: Configurar Flyway en YAML (Solo MySQL y Supabase)

**`application-mysql.yml`:**
```yaml
spring:
  datasource:
    url: jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:tickets_db}?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: ${DB_USER:root}
    password: ${DB_PASSWORD:}
  
  flyway:
    enabled: true
    locations: classpath:db/migration/mysql
    baseline-on-migrate: true
  
  jpa:
    hibernate:
      ddl-auto: validate  # ← CAMBIAR a 'validate' (no auto, Flyway controla el esquema)
    database-platform: org.hibernate.dialect.MySQL8Dialect
```

**`application-supabase.yml`:**
```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:postgres}
    username: ${DB_USER:postgres}
    password: ${DB_PASSWORD}
    driver-class-name: org.postgresql.Driver
  
  flyway:
    enabled: true
    locations: classpath:db/migration/supabase
    baseline-on-migrate: true
  
  jpa:
    hibernate:
      ddl-auto: validate  # ← CAMBIAR a 'validate' (no auto, Flyway controla el esquema)
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
```

**`application-h2.yml`:**
```yaml
spring:
  datasource:
    url: jdbc:h2:mem:ticketsdb
    driver-class-name: org.h2.Driver
  
  flyway:
    enabled: false  # ← Flyway DESHABILITADO para H2
  
  jpa:
    hibernate:
      ddl-auto: create-drop  # ← H2 sigue usando JPA automático
    database-platform: org.hibernate.dialect.H2Dialect
```

---

## Paso 5: Restringir DataInitializer al perfil H2

El proyecto base (`Tickets-14`) incluye un `DataInitializer` que inserta tickets y usuarios de prueba al arrancar. Como es un `@Component` sin condición de perfil, actualmente **se ejecuta en todos los perfiles** (H2, MySQL, Supabase).

En esta lección lo restringimos a H2 y delegamos el seed de MySQL/Supabase a una migración Flyway.

### 5.1 Agregar `@Profile("h2")` al DataInitializer

```java
// src/main/java/.../config/DataInitializer.java
@Component
@Profile("h2")          // ← solo corre cuando el perfil activo es h2
public class DataInitializer implements CommandLineRunner {
    // ... sin más cambios
}
```

### 5.2 Crear la migración de seed para MySQL/Supabase

Crea `V2__insert_initial_data.sql` (o el número que corresponda en tu secuencia):

**MySQL** — `src/main/resources/db/migration/mysql/V2__insert_initial_data.sql`
```sql
-- V2__insert_initial_data.sql
INSERT INTO users (name, email) VALUES
  ('Ana Garcia',    'ana.garcia@empresa.com'),
  ('Carlos Lopez',  'carlos.lopez@empresa.com');

INSERT INTO tickets (title, description, status, created_at, estimated_resolution_date, created_by_id) VALUES
  ('Error en login',      'No se puede iniciar sesion con Google',  'NEW',         NOW(), DATE_ADD(CURDATE(), INTERVAL 5 DAY), 1),
  ('Mejora en dashboard', 'Agregar graficos de estadisticas',        'IN_PROGRESS', NOW(), DATE_ADD(CURDATE(), INTERVAL 5 DAY), 2),
  ('Documentacion API',   'Falta documentacion de endpoints',        'NEW',         NOW(), DATE_ADD(CURDATE(), INTERVAL 5 DAY), 1);
```

**Supabase** — `src/main/resources/db/migration/supabase/V2__insert_initial_data.sql`
```sql
-- V2__insert_initial_data.sql
INSERT INTO users (name, email) VALUES
  ('Ana Garcia',    'ana.garcia@empresa.com'),
  ('Carlos Lopez',  'carlos.lopez@empresa.com');

INSERT INTO tickets (title, description, status, created_at, estimated_resolution_date, created_by_id) VALUES
  ('Error en login',      'No se puede iniciar sesion con Google',  'NEW',         NOW(), CURRENT_DATE + INTERVAL '5 days', 1),
  ('Mejora en dashboard', 'Agregar graficos de estadisticas',        'IN_PROGRESS', NOW(), CURRENT_DATE + INTERVAL '5 days', 2),
  ('Documentacion API',   'Falta documentacion de endpoints',        'NEW',         NOW(), CURRENT_DATE + INTERVAL '5 days', 1);
```

> **Resultado:** H2 sigue usando `DataInitializer` en memoria. MySQL y Supabase usan la migración Flyway, que se ejecuta una sola vez y queda registrada en `flyway_schema_history`.

---

## Paso 6: Crear tu Primera Migración

**Archivo:** `src/main/resources/db/migration/mysql/V1__create_tickets_table.sql`

```sql
-- V1__create_tickets_table.sql
-- Crea la tabla inicial de tickets

CREATE TABLE tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT 'NEW',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estimated_resolution_date DATE NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE INDEX idx_status ON tickets(status);
```

**Archivo:** `src/main/resources/db/migration/supabase/V1__create_tickets_table.sql`

```sql
-- V1__create_tickets_table.sql
-- Crea la tabla inicial de tickets (PostgreSQL)

CREATE TABLE tickets (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT 'NEW',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estimated_resolution_date DATE NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_status ON tickets(status);
```

---

## Paso 7: Ejecutar la App (Flyway Aplica Automáticamente)

```bash
cd Tickets

# Con MySQL
./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=mysql"

# Con Supabase
export SPRING_PROFILES_ACTIVE=supabase
./mvnw spring-boot:run
```

**Verifica en los logs:**
```
Successfully validated 1 migration (execution time 12ms)
Successfully applied 1 migration to schema public (execution time 123ms)
```

¡Migración aplicada! ✅

---

## Paso 8: Agregar una Segunda Migración

Cuando necesites cambiar el esquema (ej: agregar columna), crea un nuevo archivo **sin editar el anterior**:

**Archivo:** `src/main/resources/db/migration/mysql/V2__add_priority_column.sql`

```sql
-- V2__add_priority_column.sql
-- Agrega columna de prioridad a tickets

ALTER TABLE tickets ADD COLUMN priority VARCHAR(20) DEFAULT 'MEDIUM' AFTER status;
```

**Archivo:** `src/main/resources/db/migration/supabase/V2__add_priority_column.sql`

```sql
-- V2__add_priority_column.sql
-- Agrega columna de prioridad a tickets (PostgreSQL)

ALTER TABLE tickets ADD COLUMN priority VARCHAR(20) DEFAULT 'MEDIUM';
```

Ejecuta de nuevo: `./mvnw spring-boot:run`

Flyway detecta V2 y la aplica automáticamente. 🚀

---

## Paso 9: Convención de Nombres

Flyway busca archivos con este patrón exacto:

```
V{versión}__{verbo}_{sujeto}.sql
│           │        │
│           │        └─ Tabla o columna afectada (snake_case, en inglés)
│           └─ Acción que realiza la migración (en inglés)
└─ Número secuencial sin ceros a la izquierda (V1, V2, V10…)
```

> **La descripción siempre va en inglés y snake_case.** Esto es estándar en entornos profesionales y facilita la colaboración en equipos multilenguaje.

### Verbos comunes

| Verbo | Uso |
|-------|-----|
| `create_` | Crear tabla o vista: `V1__create_tickets_table.sql` |
| `add_` | Agregar columna o constraint: `V2__add_priority_column.sql` |
| `alter_` | Modificar columna existente: `V3__alter_status_column_type.sql` |
| `drop_` | Eliminar tabla o columna: `V4__drop_legacy_table.sql` |
| `insert_` | Datos iniciales (seed): `V5__insert_initial_data.sql` |
| `rename_` | Renombrar tabla o columna: `V6__rename_users_table.sql` |
| `remove_` | Quitar columna o index: `V7__remove_old_column.sql` |
| `create_idx_` | Crear índice: `V8__create_idx_status.sql` |

### ✅ Correcto

```
V1__create_tickets_table.sql
V2__add_priority_column.sql
V3__create_users_table.sql
V10__create_user_index.sql
```

### ❌ Incorrecto

```
v1_crear_tabla.sql          → minúscula en V, descripción en español
V1_create_table.sql         → un solo guión bajo (se ignora)
V1 create table.sql         → espacios no permitidos
V01__create_table.sql       → cero a la izquierda
V1__CreateTable.sql         → CamelCase en lugar de snake_case
```

---

## Paso 10: Control de Versiones (Git)

Agrupa tus migraciones por versión del proyecto:

```
v1.0:
  - V1__create_tickets_table.sql
  - V2__create_users_table.sql

v1.1:
  - V3__add_priority_column.sql

v2.0:
  - V4__refactor_users_table.sql
```

**Nunca borres una migración** del repositorio. Si necesitas revertir:

```sql
-- V5__revert_incorrect_change.sql
-- Revierte el cambio de V4

DROP COLUMN priority FROM tickets;
```

---

## Paso 11: Tabla de Control (Flyway Schema History)

Flyway crea automáticamente una tabla que registra todas las migraciones:

```
flyway_schema_history
┌────┬────────────────────────────────────┬─────────┬────────────────┐
│ id │ version                            │ success │ execution_time │
├────┼────────────────────────────────────┼─────────┼────────────────┤
│ 1  │ V1__create_tickets_table            │ TRUE    │ 123ms          │
│ 2  │ V2__add_priority_column      │ TRUE    │ 45ms           │
│ 3  │ V3__create_users_table           │ TRUE    │ 89ms           │
└────┴────────────────────────────────────┴─────────┴────────────────┘
```

Flyway consulta esta tabla antes de ejecutar migraciones. Si la migración ya está ahí, **no la ejecuta de nuevo**.

---

## Resumen de Pasos

```
1. Agregar Flyway al pom.xml
         ↓
2. Configurar locations en application-*.yml
         ↓
3. Cambiar ddl-auto a 'validate' (para MySQL/Supabase)
         ↓
4. Crear carpeta db/migration/{mysql,supabase}
         ↓
5. Agregar @Profile("h2") a DataInitializer
         ↓
6. Crear V1__create_tickets_table.sql (esquema)
         ↓
7. Crear V2__insert_initial_data.sql (seed)
         ↓
8. Ejecutar app (Flyway aplica automáticamente)
         ↓
9. Cuando necesites cambios, crear V3__... (sin editar anteriores)
         ↓
✅ Flyway aplica solo las migraciones nuevas
```

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_03_configuracion_por_perfil.md -->
# Documento: docs lessons 15-flyway-migrations 03 configuracion por perfil
---
# Lección 15 — Configuración por Perfil

## `application.yml` (Base Común)

```yaml
spring:
  application:
    name: Tickets
  jpa:
    show-sql: false
    properties:
      hibernate:
        format_sql: true
  cloud:
    openfeign:
      client:
        config:
          audit-service:
            connect-timeout: 5000
            read-timeout: 10000
            logger-level: BASIC
          default:
            connect-timeout: 5000
            read-timeout: 10000

server:
  port: 8080
  servlet:
    context-path: "/ticket-app"

logging:
  level:
    root: INFO
    cl.duoc.fullstack: DEBUG
```

---

## `application-h2.yml` (H2 — Sin Flyway)

H2 sigue usando JPA automático. **Flyway deshabilitado**.

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:tickets_db
    driverClassName: org.h2.Driver
    username: sa
    password: ''
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: create-drop  # ← H2 sigue con automático
  flyway:
    enabled: false  # ← H2 NO usa Flyway
```

> **Datos iniciales en H2:** el proyecto usa `DataInitializer.java` (`@Component CommandLineRunner`) que inserta tickets y usuarios de prueba al arrancar. En esta lección agrégale `@Profile("h2")` para que solo corra en H2. Para MySQL y Supabase usa una migración Flyway (`V2__insert_initial_data.sql`).

---

## `application-mysql.yml` (MySQL — Con Flyway)

```yaml
spring:
  datasource:
    url: jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:tickets_db}?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: ${DB_USER:root}
    password: ${DB_PASSWORD:}
  flyway:
    enabled: true                              # ← Flyway HABILITADO
    locations: classpath:db/migration/mysql    # ← Carpeta con migraciones
    baseline-on-migrate: true                  # ← Crea tabla de control si no existe
    out-of-order: false                        # ← Migraciones deben ser ordenadas
  jpa:
    database-platform: org.hibernate.dialect.MySQLDialect
    hibernate:
      ddl-auto: validate                       # ← VALIDAR SOLO (no auto)
    properties:
      hibernate:
        format_sql: true
```

---

## `application-supabase.yml` (Supabase/PostgreSQL — Con Flyway)

```yaml
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:postgres}
    driver-class-name: org.postgresql.Driver
    username: ${DB_USER:postgres}
    password: ${DB_PASSWORD}
  flyway:
    enabled: true                                # ← Flyway HABILITADO
    locations: classpath:db/migration/supabase   # ← Carpeta con migraciones
    baseline-on-migrate: true                    # ← Crea tabla de control si no existe
    out-of-order: false                          # ← Migraciones deben ser ordenadas
    schemas: public                              # ← Schema por defecto
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: validate                        # ← VALIDAR SOLO (no auto)
    properties:
      hibernate:
        format_sql: true
```

---

## Opciones Importantes de Flyway

| Propiedad | Valor | Descripción |
|-----------|-------|-------------|
| `enabled` | `true`/`false` | Habilita/deshabilita Flyway |
| `locations` | `classpath:db/migration/mysql` | Dónde buscar las migraciones |
| `baseline-on-migrate` | `true` | Crea tabla `flyway_schema_history` si no existe |
| `out-of-order` | `false` | Las migraciones deben aplicarse en orden (recomendado) |
| `schemas` | `public` | Schema de BD donde aplicar (PostgreSQL) |
| `validate-on-migrate` | `true` | Valida migraciones antes de ejecutar |

---

## Cambio Importante en `ddl-auto`

### ❌ Antes (Lección 14 - Sin Flyway)
```yaml
jpa:
  hibernate:
    ddl-auto: update  # Crea/modifica automáticamente
```

### ✅ Después (Lección 15 - Con Flyway)
```yaml
jpa:
  hibernate:
    ddl-auto: validate  # Solo valida, no modifica
```

**¿Por qué?** Porque Flyway **controla** el esquema. Si JPA también modifica, entra en conflicto.

- `update` = JPA puede cambiar la BD (riesgo)
- `validate` = JPA solo valida que todo coincida (seguro)

---

## Estructura de Carpetas en el Proyecto

```
Tickets/
├── src/main/resources/
│   ├── application.yml
│   ├── application-h2.yml
│   ├── application-mysql.yml
│   ├── application-supabase.yml
│   └── db/
│       └── migration/
│           ├── mysql/
│           │   ├── V1__create_tickets_table.sql
│           │   ├── V2__add_priority_column.sql
│           │   └── V3__...
│           └── supabase/
│               ├── V1__create_tickets_table.sql
│               ├── V2__add_priority_column.sql
│               └── V3__...
│
├── pom.xml (con Flyway agregado)
└── .env (con variables de BD)
```

---

## `.env` (Variables de Entorno — Igual que antes)

```env
# Perfil activo
SPRING_PROFILES_ACTIVE=mysql

# MySQL
DB_HOST=localhost
DB_PORT=3306
DB_NAME=tickets_db
DB_USER=root
DB_PASSWORD=

# Supabase (reemplaza los valores anteriores)
# DB_HOST=db.xxxx.supabase.co
# DB_PORT=5432
# DB_NAME=postgres
# DB_USER=postgres
# DB_PASSWORD=your-password
```

**Flyway usa automáticamente las mismas variables de datasource.**

---

## Verificación en Logs

Cuando ejecutas la app, deberías ver:

```
2026-04-16 14:23:45.123 INFO  o.f.c.i.database.DatabaseFactory - Database: MySQL 5.7.43-0-log (detected version 5.7.43-0-log)
2026-04-16 14:23:45.234 INFO  o.f.c.i.s.JdbcTableSchemaHistory - Schema history table "tickets_db"."flyway_schema_history" does not exist yet
2026-04-16 14:23:45.250 INFO  o.f.core.internal.command.DbMigrate - Creating Schema History table "tickets_db"."flyway_schema_history"
2026-04-16 14:23:45.315 INFO  o.f.core.internal.command.DbMigrate - Successfully validated 3 migrations (execution time 15ms)
2026-04-16 14:23:45.401 INFO  o.f.core.internal.command.DbMigrate - Successfully applied 3 migrations to schema "tickets_db" (execution time 198ms)
```

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_04_ejemplos_migraciones.md -->
# Documento: docs lessons 15-flyway-migrations 04 ejemplos migraciones
---
# Lección 15 — Ejemplos de Migraciones SQL

## Patrón de Nombres

```
V{versión}__lesson_{lección}_{verbo}_{sujeto}.sql
```

| Parte | Regla | Ejemplo |
|-------|-------|---------|
| `V` | Mayúscula obligatoria | `V1`, `V2`, `V10` |
| `{versión}` | Número secuencial global, sin ceros a la izquierda | `1` ✅ — `01` ❌ |
| `__` | Dos guiones bajos (separador obligatorio) | `V1__` ✅ — `V1_` ❌ |
| `lesson_` | Prefijo fijo que identifica el bloque de lección | `lesson_` ✅ |
| `{lección}` | Número de lección donde se introdujo el cambio | `10`, `12`, `13` |
| `{verbo}` | Acción en inglés, snake_case | `create_`, `add_`, `insert_` |
| `{sujeto}` | Tabla o columna afectada, en inglés | `tickets_table`, `initial_tickets` |
| `.sql` | Extensión en minúsculas | `.sql` ✅ — `.SQL` ❌ |

> **Siempre en inglés.** Es el estándar de la industria. Los nombres en español generan problemas en entornos donde el equipo o las herramientas CI/CD son multilenguaje.

### Progresión por lección

Cada lección agrupa una o más migraciones DDL seguidas obligatoriamente de un **seed** (INSERT y/o UPDATE) antes de continuar con la siguiente lección:

```
V1__lesson_10_create_tickets_table.sql      ← DDL
V2__lesson_10_insert_initial_tickets.sql    ← seed ✅ cierra lección 10

V3__lesson_12_create_users_table.sql        ← DDL
V4__lesson_12_add_user_relations_to_tickets.sql  ← DDL
V5__lesson_12_insert_users_and_link_tickets.sql  ← seed ✅ cierra lección 12

V6__lesson_13_create_ticket_history_table.sql    ← DDL
V7__lesson_13_insert_initial_history.sql    ← seed ✅ cierra lección 13
```

### Verbos más usados

```
create_   →  V1__lesson_10_create_tickets_table.sql
add_      →  V4__lesson_12_add_user_relations_to_tickets.sql
alter_    →  V{n}__lesson_{x}_alter_status_column_type.sql
insert_   →  V2__lesson_10_insert_initial_tickets.sql
update_   →  V{n}__lesson_{x}_update_ticket_priority.sql
drop_     →  V{n}__lesson_{x}_drop_legacy_column.sql
rename_   →  V{n}__lesson_{x}_rename_users_table.sql
```

---

## Migración 1: Tabla Inicial (Tickets)

### MySQL

```sql
-- V1__create_tickets_table.sql
CREATE TABLE tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT 'NEW',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estimated_resolution_date DATE NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
    CONSTRAINT unique_title UNIQUE (title),
    INDEX idx_status (status),
    INDEX idx_created_at (created_at)
);
```

### PostgreSQL (Supabase)

```sql
-- V1__create_tickets_table.sql
CREATE TABLE tickets (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    description TEXT,
    status VARCHAR(50) NOT NULL DEFAULT 'NEW',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estimated_resolution_date DATE NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    
    CONSTRAINT check_valid_status CHECK (status IN ('NEW', 'IN_PROGRESS', 'RESOLVED', 'CLOSED'))
);

CREATE INDEX idx_status ON tickets(status);
CREATE INDEX idx_created_at ON tickets(created_at);
```

---

## Migración 2: Agregar Columnas

### MySQL

```sql
-- V2__add_priority_column.sql
ALTER TABLE tickets 
ADD COLUMN priority VARCHAR(20) DEFAULT 'MEDIUM' AFTER status,
ADD COLUMN assigned_to VARCHAR(255);

CREATE INDEX idx_assigned_to ON tickets(assigned_to);
```

### PostgreSQL (Supabase)

```sql
-- V2__add_priority_column.sql
ALTER TABLE tickets
ADD COLUMN priority VARCHAR(20) DEFAULT 'MEDIUM',
ADD COLUMN assigned_to VARCHAR(255);

CREATE INDEX idx_assigned_to ON tickets(assigned_to);
```

---

## Migración 3: Crear Tabla Usuarios

### MySQL

```sql
-- V3__create_users_table.sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
    INDEX idx_email (email)
);
```

### PostgreSQL (Supabase)

```sql
-- V3__create_users_table.sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_email ON users(email);
```

---

## Migración 4: Agregar Foreign Key

### MySQL

```sql
-- V4__add_tickets_users_relation.sql
-- Vincula tickets con usuarios

ALTER TABLE tickets
ADD COLUMN created_by_id INT NOT NULL DEFAULT 1,
ADD COLUMN assigned_to_id INT;

ALTER TABLE tickets
ADD CONSTRAINT fk_tickets_created_by 
FOREIGN KEY (created_by_id) REFERENCES users(id) ON DELETE RESTRICT,
ADD CONSTRAINT fk_tickets_assigned_to 
FOREIGN KEY (assigned_to_id) REFERENCES users(id) ON DELETE SET NULL;

-- Agregar índice para performance
CREATE INDEX idx_created_by_id ON tickets(created_by_id);
CREATE INDEX idx_assigned_to_id ON tickets(assigned_to_id);
```

### PostgreSQL (Supabase)

```sql
-- V4__add_tickets_users_relation.sql
ALTER TABLE tickets
ADD COLUMN created_by_id INTEGER NOT NULL DEFAULT 1,
ADD COLUMN assigned_to_id INTEGER;

ALTER TABLE tickets
ADD CONSTRAINT fk_tickets_created_by 
FOREIGN KEY (created_by_id) REFERENCES users(id) ON DELETE RESTRICT,
ADD CONSTRAINT fk_tickets_assigned_to 
FOREIGN KEY (assigned_to_id) REFERENCES users(id) ON DELETE SET NULL;

CREATE INDEX idx_created_by_id ON tickets(created_by_id);
CREATE INDEX idx_assigned_to_id ON tickets(assigned_to_id);
```

---

## Migración de Seed: Datos Iniciales

Flyway también gestiona la inserción de datos iniciales (seed). Es el mecanismo correcto para MySQL y Supabase.

> ⚠️ **El `DataInitializer` actual corre en todos los perfiles**
>
> `Tickets-14` incluye `DataInitializer.java` (`@Component` + `CommandLineRunner`) que inserta datos de prueba al arrancar. Sin la anotación `@Profile`, se ejecuta en **todos** los perfiles (H2, MySQL, Supabase).
>
> En esta lección debes:
> 1. Agregar `@Profile("h2")` a `DataInitializer` → solo corre en H2
> 2. Crear `V2__insert_initial_data.sql` con los mismos datos para MySQL y Supabase
>
> | Mecanismo | H2 | MySQL | Supabase |
> |-----------|:--:|:-----:|:--------:|
> | `DataInitializer` (`@Profile("h2")`) | ✅ | ❌ | ❌ |
> | `V2__insert_initial_data.sql` (Flyway) | ❌ | ✅ | ✅ |

### MySQL

```sql
-- V5__insert_initial_data.sql
-- Inserta usuarios y tickets de ejemplo

INSERT INTO users (email, name, password_hash) VALUES
('admin@example.com', 'Admin User', '$2a$10$...'),
('developer@example.com', 'Developer User', '$2a$10$...');

INSERT INTO tickets (title, description, status, priority, created_by_id) VALUES
('Bug: Login no funciona', 'El login falla con email/password incorrectos', 'NEW', 'HIGH', 1),
('Feature: Dark mode', 'Agregar tema oscuro a la aplicación', 'IN_PROGRESS', 'MEDIUM', 2);
```

### PostgreSQL (Supabase)

```sql
-- V5__insert_initial_data.sql
INSERT INTO users (email, name, password_hash) VALUES
('admin@example.com', 'Admin User', '$2a$10$...'),
('developer@example.com', 'Developer User', '$2a$10$...');

INSERT INTO tickets (title, description, status, priority, created_by_id) VALUES
('Bug: Login no funciona', 'El login falla con email/password incorrectos', 'NEW', 'HIGH', 1),
('Feature: Dark mode', 'Agregar tema oscuro a la aplicación', 'IN_PROGRESS', 'MEDIUM', 2);
```

---

## Migración 6: Cambiar Tipo de Dato

### MySQL

```sql
-- V6__change_description_column_type.sql
-- Amplía la columna description de TEXT a LONGTEXT

ALTER TABLE tickets MODIFY COLUMN description LONGTEXT;
```

### PostgreSQL (Supabase)

```sql
-- V6__change_description_column_type.sql
ALTER TABLE tickets ALTER COLUMN description TYPE TEXT;
```

---

## Migración 7: Crear Vista (View)

### MySQL

```sql
-- V7__create_tickets_by_user_view.sql
-- Vista que muestra tickets agrupados por usuario

CREATE VIEW tickets_by_user AS
SELECT 
    u.id as user_id,
    u.name as user_name,
    COUNT(t.id) as total_tickets,
    SUM(CASE WHEN t.status = 'NEW' THEN 1 ELSE 0 END) as new_tickets
FROM users u
LEFT JOIN tickets t ON t.created_by_id = u.id
GROUP BY u.id, u.name;
```

### PostgreSQL (Supabase)

```sql
-- V7__create_tickets_by_user_view.sql
CREATE VIEW tickets_by_user AS
SELECT 
    u.id as user_id,
    u.name as user_name,
    COUNT(t.id) as total_tickets,
    SUM(CASE WHEN t.status = 'NEW' THEN 1 ELSE 0 END) as new_tickets
FROM users u
LEFT JOIN tickets t ON t.created_by_id = u.id
GROUP BY u.id, u.name;
```

---

## Migración 8: Revertir Cambio (Rollback Manual)

Si cometiste un error en V4 y necesitas revertirlo:

### MySQL

```sql
-- V8__revert_foreign_keys_v4.sql
-- Revierte los cambios de V4

ALTER TABLE tickets DROP FOREIGN KEY fk_tickets_assigned_to;
ALTER TABLE tickets DROP FOREIGN KEY fk_tickets_created_by;
ALTER TABLE tickets DROP COLUMN assigned_to_id;
ALTER TABLE tickets DROP COLUMN created_by_id;
```

### PostgreSQL (Supabase)

```sql
-- V8__revert_foreign_keys_v4.sql
ALTER TABLE tickets DROP CONSTRAINT fk_tickets_assigned_to;
ALTER TABLE tickets DROP CONSTRAINT fk_tickets_created_by;
ALTER TABLE tickets DROP COLUMN assigned_to_id;
ALTER TABLE tickets DROP COLUMN created_by_id;
```

---

## Diferencias Clave: MySQL vs PostgreSQL

| Aspecto | MySQL | PostgreSQL |
|---------|-------|-----------|
| Auto-increment | `AUTO_INCREMENT` | `SERIAL` |
| Timestamp actual | `DEFAULT CURRENT_TIMESTAMP` | `DEFAULT CURRENT_TIMESTAMP` |
| Alterar columna | `MODIFY COLUMN` | `ALTER COLUMN ... TYPE` |
| Foreign keys | `CONSTRAINT fk_... FOREIGN KEY` | `CONSTRAINT fk_... FOREIGN KEY` |
| Índices | `INDEX idx_name` | `CREATE INDEX idx_name` |
| Comentarios | `-- comentario` | `-- comentario` |
| Booleanos | `TINYINT(1)` | `BOOLEAN` |
| Strings ilimitados | `LONGTEXT` | `TEXT` |

---

## ✅ Checklist para Migraciones

Antes de crear una migración, verifica:

- ✅ El nombre sigue patrón `V[número]__[descripción].sql`
- ✅ Dos guiones bajos obligatorios `__`
- ✅ Número es secuencial (V1, V2, V3, no saltes)
- ✅ SQL sintácticamente correcto (prueba en tu BD)
- ✅ Existe para MySQL y PostgreSQL si ambos usan Flyway
- ✅ No editas migraciones viejas (solo creas nuevas)
- ✅ Commitas los archivos al repositorio
- ✅ Documentaste qué hace en un comentario al inicio

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_05_jpa_vs_flyway.md -->
# Documento: docs lessons 15-flyway-migrations 05 jpa vs flyway
---
# Lección 15 — JPA vs Flyway: Cuándo Usar Cada Uno

## Tabla Comparativa

| Aspecto | JPA (`ddl-auto`) | Flyway |
|---------|-----------------|--------|
| **Control de versión** | ❌ No | ✅ Sí (V1, V2, V3...) |
| **Reversión** | ❌ Complicada | ✅ Fácil (crear nueva migración) |
| **Ambiente** | Desarrollo | Producción |
| **Auditoría** | ❌ No hay registro | ✅ Tabla `flyway_schema_history` |
| **Equipo sincronización** | ❌ Problemático | ✅ Migraciones en Git |
| **SQL manual** | ❌ No | ✅ Sí |
| **Learning curve** | ✅ Fácil | ⚠️ Intermedio |
| **Seguridad** | ❌ Cambios automáticos | ✅ Cambios controlados |

---

## Decisión Rápida

```
¿Dónde está tu aplicación?
│
├─ Desarrollo local, solo tú
│  └─ Usa: JPA (ddl-auto: update)
│     Ventaja: Sin configuración extra
│
├─ Desarrollo local, múltiples desarrolladores
│  └─ Usa: Flyway
│     Ventaja: Sincronización en Git
│
├─ Staging / Producción
│  └─ Usa: Flyway
│     Ventaja: Auditoría y control
│
└─ Tests / H2
   └─ Usa: JPA (ddl-auto: create-drop)
      Ventaja: Limpieza automática
```

---

## Escenario 1: Solo Desarrollo Local (H2 o MySQL)

**Configuración:**
```yaml
jpa:
  hibernate:
    ddl-auto: update
```

**Flujo:**
1. Modificas tu entidad Java (`@Entity`)
2. Arrancar app
3. JPA **automáticamente** crea/modifica tablas
4. Listo, sin hacer nada más

✅ **Ventajas:**
- Desarrollo rápido
- No escribir SQL

❌ **Desventajas:**
- Sin versiones
- Cambios no reversibles
- Si hay error, queda en la BD

---

## Escenario 2: Múltiples Desarrolladores

**Problema sin Flyway:**
```
Dev A:          Modifica Ticket.java   (agrega columna)
Dev B:          Modifica Ticket.java   (agrega columna diferente)
                └─ CONFLICTO: ¿Qué cambios aplica JPA?
```

**Solución con Flyway:**
```
Dev A:          V1__add_priority_column.sql          (commitea)
                ├─ Los demás: git pull (reciben la migración)
Dev B:          V2__add_resolution_status_column.sql (commitea)
                ├─ Los demás: git pull (reciben V1 y V2)
                └─ Cuando arrancan: Flyway aplica ambas en orden
```

✅ **Ventajas:**
- Control de versiones (Git)
- Cada cambio es traceable
- Sincronización automática

❌ **Desventajas:**
- Deben escribir SQL

---

## Escenario 3: Producción

**SIN Flyway (PELIGROSO):**
```
Producción:  ddl-auto: update
             └─ ¿Quién cambió la BD? ¿Cuándo?
             └─ ¿Es reversible si falla?
             └─ RIESGO: Cambios no auditados
```

**CON Flyway (SEGURO):**
```
Producción:  V1, V2, V3 en DB
             └─ Tabla flyway_schema_history registra TODO
             └─ Cada cambio está en Git
             └─ Si falla: creas V4 para revertir
             └─ SEGURO: Auditado y reversible
```

---

## Comparación Técnica

### JPA automático

```java
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;           // JPA crea automáticamente
    private String status;          // JPA modifica automáticamente
}

// Cambias el código, arrancar app → JPA actualiza BD
```

### Flyway

```sql
-- V1__create_tickets_table.sql
CREATE TABLE tickets (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    status VARCHAR(50)
);

-- V2__add_priority_column.sql
ALTER TABLE tickets ADD COLUMN priority VARCHAR(20);
```

**Con Flyway, controlas exactamente qué SQL se ejecuta.**

---

## Recomendación por Etapa

| Etapa | Perfil | Herramienta | Configuración |
|-------|--------|-------------|---------------|
| **Aprendizaje (Semana 1-2)** | h2 | JPA | `ddl-auto: create-drop` |
| **Desarrollo Inicial** | h2 / mysql | JPA | `ddl-auto: update` |
| **Trabajo en Equipo** | mysql | Flyway | `locations: db/migration/mysql` |
| **Staging** | supabase | Flyway | `locations: db/migration/supabase` |
| **Producción** | supabase | Flyway | `ddl-auto: validate` |

---

## Migración: De JPA a Flyway

Si ya usabas JPA (`update`) y quieres pasar a Flyway:

### Paso 1: Exportar esquema actual

```bash
# MySQL
mysqldump -u root tickets_db --no-data > V1__current_schema.sql

# PostgreSQL (Supabase)
pg_dump -h $DB_HOST -U $DB_USER -d $DB_NAME --schema-only > V1__current_schema.sql
```

### Paso 2: Crear V1 en `db/migration/`

Copia el esquema exportado a:
- `src/main/resources/db/migration/mysql/V1__current_schema.sql`
- `src/main/resources/db/migration/supabase/V1__current_schema.sql`

### Paso 3: Cambiar configuración

```yaml
flyway:
  enabled: true
  locations: classpath:db/migration/mysql
  baseline-on-migrate: true

jpa:
  hibernate:
    ddl-auto: validate  # ← Cambiar a validate
```

### Paso 4: Ejecutar

```bash
./mvnw spring-boot:run
```

Flyway crea la tabla de historial y registra V1 como aplicada (sin re-ejecutar).

---

## ✅ Checklist de Decisión

Antes de elegir, pregúntate:

- ¿Trabajo en equipo? → Flyway
- ¿Múltiples BDs (dev, staging, prod)? → Flyway
- ¿Necesito auditoría de cambios? → Flyway
- ¿Solo desarrollo local de prueba? → JPA (update)
- ¿H2 para tests? → JPA (create-drop)
- ¿Es producción? → Flyway (SIEMPRE)

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_06_troubleshooting.md -->
# Documento: docs lessons 15-flyway-migrations 06 troubleshooting
---
# Lección 15 — Troubleshooting: Errores Comunes

## Error 1: "Migration checksum mismatch"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: Validate failed: 
Migration checksum mismatch for migration V1__create_tickets_table.sql
```

**Causa:** Modificaste un archivo de migración después de haberlo ejecutado.

**Solución:**
❌ **No hagas esto:**
```sql
-- V1__create_tickets_table.sql (ORIGINAL - ya ejecutado)
CREATE TABLE tickets (id INT, title VARCHAR);

-- Luego lo editaste (INCORRECTO)
CREATE TABLE tickets (id INT, title VARCHAR, description TEXT);
```

✅ **Haz esto:**
```sql
-- V1__create_tickets_table.sql (ORIGINAL - sin cambios)
CREATE TABLE tickets (id INT, title VARCHAR);

-- V2__add_description_column.sql (NUEVA migración)
ALTER TABLE tickets ADD COLUMN description TEXT;
```

**Pasos para recuperarse:**
1. Revert los cambios a V1
2. Crea V2 con los cambios
3. Ejecuta app de nuevo

---

## Error 2: "Failed to validate migration"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: Validate failed: 
Schema contains object 'flyway_schema_history' which is not found in migration
```

**Causa:** Conflicto entre Flyway y JPA.

**Solución:**
Asegúrate que `ddl-auto` sea `validate`, no `update`:

```yaml
jpa:
  hibernate:
    ddl-auto: validate  # ← DEBE ser validate, no update
```

Si ya cambió a `update`, cambia a `validate` y reinicia.

---

## Error 3: "No migrations found"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: 
No migrations found at location 'classpath:db/migration/mysql'
```

**Causa:** Carpeta de migraciones no existe o está mal nombrada.

**Solución:**
Verifica la estructura:

```
✅ Correcto:
src/main/resources/
└── db/
    └── migration/
        ├── mysql/
        │   └── V1__create_table.sql
        └── supabase/
            └── V1__create_table.sql

❌ Incorrecto:
src/main/resources/
└── migrations/         (mal nombre)
    └── V1__create_table.sql

❌ Incorrecto:
src/main/resources/
└── db/
    └── migration/
        └── V1__create_table.sql (sin subcarpeta mysql/supabase)
```

---

## Error 4: "Syntax Error in migration"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: 
Unable to parse statement in migration file 'V1__create_table.sql'
```

**Causa:** SQL sintácticamente incorrecto.

**Solución:**
1. Prueba el SQL directamente en tu BD (phpMyAdmin, DBeaver, etc)
2. Verifica que sea la sintaxis correcta para **MySQL** o **PostgreSQL**

**Errores comunes:**

MySQL vs PostgreSQL:
```sql
❌ MySQL: AUTO_INCREMENT (MySQL es específico)
✅ PostgreSQL: SERIAL

❌ PostgreSQL: CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP (MySQL específico)
✅ PostgreSQL: DEFAULT CURRENT_TIMESTAMP
```

---

## Error 5: "Foreign key constraint fails"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: 
Unable to execute migration: Syntax error or access violation: 
1064 Cannot delete or update a parent row: a foreign key constraint fails
```

**Causa:** Estás intentando crear o modificar un FK con datos incompatibles.

**Solución:**
Verifica el orden de las migraciones:

```sql
❌ Incorrecto (V1 intenta FK a tabla que no existe):
-- V1__add_users_fk.sql
ALTER TABLE tickets ADD CONSTRAINT fk_user
FOREIGN KEY (user_id) REFERENCES users(id);

✅ Correcto (crear tabla primero):
-- V1__create_users_table.sql
CREATE TABLE users (id INT PRIMARY KEY);

-- V2__create_tickets_table.sql
CREATE TABLE tickets (id INT, user_id INT);

-- V3__add_users_fk.sql
ALTER TABLE tickets ADD CONSTRAINT fk_user
FOREIGN KEY (user_id) REFERENCES users(id);
```

---

## Error 6: "Connection refused" durante migración

**Síntoma:**
```
java.sql.SQLException: Connection refused
```

**Causa:** Flyway intenta conectar a la BD pero no está disponible.

**Solución:**

Para MySQL:
```bash
# Verifica que XAMPP está corriendo
# Ve a: http://localhost/phpmyadmin
# Verifica que la BD "tickets_db" existe
```

Para Supabase:
```bash
# Verifica credenciales en .env
echo $DB_HOST
echo $DB_USER
echo $DB_PASSWORD

# Verifica que el IP está en IP whitelist (Supabase → Settings)
# Verifica conexión a internet
```

---

## Error 7: "Flyway schema history table is read-only"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: 
Schema history table is read-only
```

**Causa:** No tienes permisos para escribir en la tabla.

**Solución:**
Verifica permisos de usuario en la BD:

MySQL:
```sql
GRANT ALL PRIVILEGES ON tickets_db.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
```

PostgreSQL (Supabase):
- Asegúrate que usas el usuario correcto (`postgres`)
- Verifica en Supabase → Settings que el usuario tiene permisos

---

## Error 8: "Timeout waiting for migration"

**Síntoma:**
```
org.flywaydb.core.api.FlywayException: 
Timeout waiting for migration to complete
```

**Causa:** La migración tarda demasiado (probablemente por datos grandes).

**Solución:**
1. Aumenta el timeout en `application-*.yml`:
```yaml
spring:
  datasource:
    hikari:
      connection-timeout: 60000  # 60 segundos
      maximum-pool-size: 10
```

2. O optimiza tu SQL (agrega índices, etc)

---

## Error 9: "Cannot drop table/column in production"

**Síntoma:** No error específico, pero Flyway rechaza el cambio.

**Causa:** Por seguridad, algunos hosts bloquean DROP.

**Solución:**
Si realmente quieres borrar (después de auditar):

```sql
-- V10__remove_old_column.sql
-- Después de auditar que nada la usa

ALTER TABLE tickets DROP COLUMN deprecated_column;
```

En producción, mejor crear una migración de "soft delete":

```sql
-- V10__mark_column_deprecated.sql
ALTER TABLE tickets ADD COLUMN is_deprecated BOOLEAN DEFAULT false;

-- Luego en V11:
-- ALTER TABLE tickets DROP COLUMN old_column;  (después de confirmar)
```

---

## Verificación Rápida

```bash
# Ver todas las migraciones aplicadas
# En MySQL:
SELECT * FROM flyway_schema_history;

# En Supabase:
SELECT * FROM flyway_schema_history;
```

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_07_checklist_rubrica_minima.md -->
# Documento: docs lessons 15-flyway-migrations 07 checklist rubrica minima
---
# Lección 15 — Checklist y Rúbrica Mínima

## ✅ Checklist de Completitud

### Configuración

- [ ] `pom.xml` contiene dependencia Flyway (versión ≥ 9.0)
- [ ] Carpeta `src/main/resources/db/migration/mysql/` existe
- [ ] Carpeta `src/main/resources/db/migration/supabase/` existe
- [ ] `application-mysql.yml` tiene `flyway.enabled: true`
- [ ] `application-supabase.yml` tiene `flyway.enabled: true`
- [ ] `application-h2.yml` tiene `flyway.enabled: false`
- [ ] Todos los YAML tienen `ddl-auto: validate` (MySQL/Supabase) o `create-drop` (H2)

### Migraciones

- [ ] `V1__create_tickets_table.sql` existe en mysql/ y supabase/
- [ ] `V2__create_users_table.sql` existe en mysql/ y supabase/
- [ ] `V3__add_tickets_users_relation.sql` existe en mysql/ y supabase/
- [ ] Todos los nombres siguen patrón `V[número]__[descripción].sql`
- [ ] SQL es syntácticamente correcto (probado en BD)
- [ ] Diferencias MySQL vs PostgreSQL son correctas

### Ejecución

- [ ] App arranca sin errores con `SPRING_PROFILES_ACTIVE=mysql`
- [ ] App arranca sin errores con `SPRING_PROFILES_ACTIVE=supabase`
- [ ] App arranca sin errores con `SPRING_PROFILES_ACTIVE=h2` (JPA automático)
- [ ] Logs muestran: "Successfully applied 3 migrations"
- [ ] Tabla `flyway_schema_history` tiene 3 filas
- [ ] API `/ticket-app/tickets` responde correctamente

### Documentación

- [ ] Leí lección 15 completa
- [ ] Entiendo diferencia JPA vs Flyway
- [ ] Puedo explicar por qué H2 no usa Flyway
- [ ] Documenté en comentarios SQL qué hace cada migración

### Git

- [ ] Migraciones están en repositorio
- [ ] `.env` NO está en repositorio (está en `.gitignore`)
- [ ] Commit message es descriptivo: `feat: agregar Flyway migrations`

---

## 🎓 Rúbrica de Evaluación

### 1. Configuración Flyway (25%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Dependencia en pom.xml | ❌ Falta | ✅ Presente | ✅ + versión correcta |
| Configuración YAML | ❌ Incompleta | ✅ Correcta | ✅ + comentarios explicativos |
| Carpetas de migraciones | ❌ Estructura mal | ✅ Correcta | ✅ + bien organizadas |
| `ddl-auto` cambiado | ❌ Sigue `update` | ✅ Cambió a `validate` | ✅ + diferenciado por perfil |

### 2. Migraciones SQL (40%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Cantidad | ❌ < 2 migraciones | ✅ 3 migraciones | ✅ 4+ migraciones |
| Nombres | ❌ Incorrecto | ✅ `V[num]__[desc].sql` | ✅ + descriptivos |
| Sintaxis MySQL | ❌ Con errores | ✅ Correcta | ✅ + optimizada |
| Sintaxis PostgreSQL | ❌ No diferenciada | ✅ Correcta | ✅ + con índices |
| Relaciones | ❌ Sin FK | ✅ Con FK simples | ✅ + con constraints |

### 3. Ejecución (20%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| App arranca (MySQL) | ❌ Errores | ✅ Arranca | ✅ Sin warnings |
| App arranca (Supabase) | ❌ Errores | ✅ Arranca | ✅ Sin warnings |
| Logs Flyway | ❌ "Failed" | ✅ "Successfully applied" | ✅ + detallados |
| Tabla de historial | ❌ No existe | ✅ Existe | ✅ + 3+ filas |

### 4. Conocimiento (15%)

| Criterio | Insuficiente | Satisfactorio | Excelente |
|----------|-------------|--------------|-----------|
| Explica JPA vs Flyway | ❌ No sabe | ✅ Explica diferencias | ✅ + casos de uso |
| Entiende versionado | ❌ Confundido | ✅ Claro | ✅ + profundo |
| Conoce convenciones | ❌ Viola | ✅ Sigue | ✅ + explica por qué |
| Puede troubleshoot | ❌ Pierde | ✅ Resuelve básicos | ✅ + errores complejos |

---

## 📊 Cálculo de Nota

```
Configuración:  25% × (puntos / 4)
Migraciones:    40% × (puntos / 5)
Ejecución:      20% × (puntos / 4)
Conocimiento:   15% × (puntos / 4)
─────────────────────────────────
TOTAL:          100%
```

**Ejemplos:**
- 3/4 configuración + 5/5 migraciones + 3/4 ejecución + 4/4 conocimiento = 93%
- 2/4 configuración + 3/5 migraciones + 2/4 ejecución + 2/4 conocimiento = 58%

---

## 🚩 Red Flags (Falla Automática)

- ❌ Migraciones editadas después de ser ejecutadas
- ❌ `.env` con credenciales en repositorio
- ❌ `ddl-auto: update` en MySQL/Supabase
- ❌ Nombres de migración incorrectos (V01, v1, V1_, etc)
- ❌ App no arranca o logs muestran "Failed"
- ❌ SQL con errores de sintaxis

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*



<!-- START OF FILE: docs_lessons_15-flyway-migrations_08_actividad_individual.md -->
# Documento: docs lessons 15-flyway-migrations 08 actividad individual
---
# Lección 15 — Actividad Individual: Migración Flyway de `Category`

## Contexto

En la lección 05 creaste el recurso `Category` con persistencia en memoria. En la lección 10 lo migraste a JPA con `@Entity` y `JpaRepository`. Ahora que el proyecto usa Flyway para controlar el esquema, **JPA ya no puede crear ni modificar tablas automáticamente** en MySQL y Supabase (`ddl-auto: validate`).

Tu tarea es escribir las migraciones Flyway que crean la tabla `categories` y la vinculan con `tickets`, continuando la secuencia de versiones del proyecto.

---

## Lo que debes entregar

Las migraciones van dentro de `src/main/resources/db/migration/` y siguen la convención establecida en clase:

```
V{versión}__lesson_15_{verbo}_{sujeto}.sql
```

Las versiones deben continuar la secuencia existente (V7 es la última del guión), así que tu actividad parte desde **V8**.

---

## Parte 1: Crear la tabla `categories`

Crea los archivos para ambos motores:

- `db/migration/mysql/V8__lesson_15_create_categories_table.sql`
- `db/migration/supabase/V8__lesson_15_create_categories_table.sql`

La tabla debe reflejar exactamente la entidad `Category` que definiste en la lección 10:

| Campo | Tipo Java | Columna MySQL | Columna PostgreSQL |
|-------|-----------|---------------|--------------------|
| `id` | `Long` | `BIGINT AUTO_INCREMENT` | `BIGSERIAL` |
| `name` | `String` | `VARCHAR(100) NOT NULL UNIQUE` | `VARCHAR(100) NOT NULL UNIQUE` |
| `description` | `String` | `TEXT` | `TEXT` |

Incluye al menos un índice sobre `name`.

---

## Parte 2: Seed de categorías iniciales

Cada bloque de lección debe terminar con un seed. Crea:

- `db/migration/mysql/V9__lesson_15_insert_initial_categories.sql`
- `db/migration/supabase/V9__lesson_15_insert_initial_categories.sql`

Inserta las mismas categorías que usabas como datos de prueba en memoria desde la lección 05:

| name | description |
|------|-------------|
| `Bug` | `Problema o error que afecta el funcionamiento esperado` |
| `Feature` | `Nueva funcionalidad solicitada por el usuario` |
| `Mejora` | `Cambio menor que optimiza una funcionalidad existente` |

---

## Parte 3 (opcional): Vincular `Category` con `Ticket`

Si en la lección 12 ya agregaste `category_id` a `Ticket`, crea la migración que lo formaliza en la BD:

- `db/migration/mysql/V10__lesson_15_add_category_to_tickets.sql`
- `db/migration/supabase/V10__lesson_15_add_category_to_tickets.sql`

```sql
-- MySQL
ALTER TABLE tickets
    ADD COLUMN category_id BIGINT,
    ADD CONSTRAINT fk_tickets_category
        FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE SET NULL;
```

```sql
-- PostgreSQL
ALTER TABLE tickets
    ADD COLUMN category_id BIGINT,
    ADD CONSTRAINT fk_tickets_category
        FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE SET NULL;
```

---

## Verificación

Arranca la app con MySQL o Supabase y comprueba los logs:

```
Successfully applied 2 migrations to schema ... (V8, V9)
```

Luego verifica en tu cliente de BD:

| Verificación | Resultado esperado |
|---|---|
| `SELECT * FROM flyway_schema_history` | 9 filas (V1-V9) |
| `SELECT * FROM categories` | 3 filas (Bug, Feature, Mejora) |
| `DESCRIBE categories` / `\d categories` | columnas `id`, `name`, `description` |
| App arranca sin errores con `ddl-auto: validate` | Hibernate valida sin crear nada |

---

## Criterios de evaluación

| Criterio | Puntaje |
|---|---|
| V8 crea la tabla con columnas y tipos correctos (MySQL y Supabase) | 35% |
| V9 inserta las 3 categorías iniciales | 25% |
| Los nombres de archivo siguen el patrón `V{n}__lesson_15_{verbo}_{sujeto}.sql` | 20% |
| La app arranca sin errores en el perfil mysql o supabase | 20% |

---

## Desafío opcional

Si V10 (relación `category_id` en `tickets`) ya funciona, agrega el seed que vincula los tickets existentes a una categoría:

```sql
-- V11__lesson_15_update_ticket_categories.sql
UPDATE tickets SET category_id = 1 WHERE title = 'Error en login';
UPDATE tickets SET category_id = 3 WHERE title = 'Mejora en dashboard';
UPDATE tickets SET category_id = 2 WHERE title = 'Documentacion API';
```

> **¿Por qué UPDATE y no INSERT?** Los tickets ya existen (fueron insertados en V2 y vinculados a usuarios en V5). Aquí solo les asignamos su categoría, no los recreamos.

---

*[← Volver a Lección 15](01_objetivo_y_alcance.md)*




<!-- START OF FILE: docs_lessons_15-flyway-migrations_README.md -->
# Documento: docs lessons 15-flyway-migrations README
---
# Lección 15 — Migraciones de Base de Datos con Flyway

**Aprende a versionear cambios de base de datos como código con Flyway. Implementa migraciones profesionales que funcionan en MySQL, Supabase y H2.**

---

## 📚 Contenidos

| Documento | Duración | Para |
|-----------|----------|------|
| **01. Objetivo y Alcance** | 5 min | Entender qué aprenderás |
| **02. Guión Paso a Paso** ⭐ | 20 min | Instrucciones prácticas |
| **03. Configuración por Perfil** | 10 min | YAML + properties |
| **04. Ejemplos de Migraciones** | 15 min | Scripts SQL listos |
| **05. JPA vs Flyway** | 10 min | Cuándo usar cada uno |
| **06. Troubleshooting** | 10 min | Errores y soluciones |
| **07. Checklist** | 5 min | Verificación |
| **08. Actividad Individual** | - | Tu tarea |

---

## 🎯 Quick Start (5 min)

### 1. Agregar Flyway a `pom.xml`
```xml
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
    <version>9.22.3</version>
</dependency>
```

### 2. Configurar YAML (MySQL)
```yaml
spring:
  flyway:
    enabled: true
    locations: classpath:db/migration/mysql
  
  jpa:
    hibernate:
      ddl-auto: validate  # CAMBIAR a validate
```

### 3. Crear Migración
```sql
-- src/main/resources/db/migration/mysql/V1__create_tickets_table.sql
CREATE TABLE tickets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    status VARCHAR(50) DEFAULT 'NEW'
);
```

### 4. Ejecutar
```bash
export SPRING_PROFILES_ACTIVE=mysql
./mvnw spring-boot:run
```

✅ Flyway aplica automáticamente V1 y crea tabla `flyway_schema_history`

---

## 🔑 Conceptos Clave

### ¿Qué es Flyway?

Herramienta que **versionea cambios de BD como Git**:
- V1__create_table.sql
- V2__add_column.sql
- V3__create_index.sql

Cada migración se ejecuta **una sola vez**, en orden. Flyway registra el historial en `flyway_schema_history`.

### Diferencia: JPA vs Flyway

| Aspecto | JPA | Flyway |
|---------|-----|--------|
| Automático | ✅ | ❌ |
| Versionado | ❌ | ✅ |
| Reversible | ❌ | ✅ |
| Producción | ❌ | ✅ |
| H2 | ✅ | ❌ |

---

## 📂 Estructura

```
src/main/resources/
├── application.yml
├── application-h2.yml (Flyway disabled)
├── application-mysql.yml (Flyway enabled)
├── application-supabase.yml (Flyway enabled)
└── db/migration/
    ├── mysql/
    │   ├── V1__create_tickets_table.sql
    │   ├── V2__add_priority_column.sql
    │   └── V3__...
    └── supabase/
        ├── V1__create_tickets_table.sql
        ├── V2__add_priority_column.sql
        └── V3__...
```

---

## ✅ Checklist

- [ ] Flyway en `pom.xml`
- [ ] Carpetas `db/migration/{mysql,supabase}/` creadas
- [ ] `application-*.yml` configurado
- [ ] `ddl-auto: validate` en MySQL/Supabase
- [ ] V1, V2, V3 migraciones creadas
- [ ] App arranca sin errores
- [ ] Logs muestran "Successfully applied 3 migrations"
- [ ] Tabla `flyway_schema_history` con 3 filas

---

## 🚀 Sigue el Guión

Comienza con **[02. Guión Paso a Paso](02_guion_paso_a_paso.md)** para instrucciones detalladas.

---

*Lección 15 de 18 - [← Volver a Lecciones](../)*



<!-- START OF FILE: docs_lessons_16-spring-security_01_objetivo_y_alcance.md -->
# Documento: docs lessons 16-spring-security 01 objetivo y alcance
---
# Lección 16 — Spring Security: Objetivo y Alcance

## ¿De dónde venimos?

En la Lección 15 implementaste **migraciones de base de datos con Flyway**: tu esquema está versionado, controlado y reproducible en cualquier entorno.

El siguiente paso natural es proteger esa API: actualmente cualquiera puede crear, modificar o eliminar tickets sin identificarse. Un usuario malicioso podría sabotear todo el sistema con una sola petición HTTP.

> 💡 **Conexión con Flyway:** Los usuarios que se autenticarán existen en la tabla `users`. En esta lección agregarás el campo `password` con una nueva migración Flyway — exactamente como aprendiste en la lección anterior.

---

## ¿Qué vas a construir?

Al terminar esta lección tu API tendrá:

1. **Entidad `User` actualizada:** campo `password` (hash BCrypt) + enum `Role` con tres niveles
2. **Migración V5:** agrega columna `password` a la tabla `users`
3. **Migración V6:** seed de 3 usuarios con contraseñas hasheadas
4. **`CustomUserDetailsService`:** carga credenciales desde `UserRepository` en tiempo real
5. **Autenticación HTTP Basic:** credenciales en el header `Authorization`
6. **Sesión STATELESS:** la API no guarda estado de sesión — cada petición se autentica por sí sola
7. **Tres niveles de autorización:**
   - `GET` tickets/categories/tags/users → público (sin autenticación)
   - `POST` y `PUT` tickets → ROLE_USER, ROLE_AGENT o ROLE_ADMIN
   - `DELETE` tickets + gestión de categorías/tags/usuarios → solo ROLE_ADMIN

### Flujo completo

```
1. POST /tickets — sin Authorization
   → 401 Unauthorized

2. POST /tickets — Authorization: Basic (ana.garcia / user123 = rol USER)
   → 201 Created ✅

3. POST /tickets — Authorization: Basic (carlos.lopez / user123 = rol AGENT)
   → 201 Created ✅

4. DELETE /tickets/by-id/1 — Authorization: Basic (ana.garcia = USER)
   → 403 Forbidden ❌

5. DELETE /tickets/by-id/1 — Authorization: Basic (admin = ADMIN)
   → 204 No Content ✅
```

---

## Los tres roles del sistema

| Rol | Descripción | Puede crear tickets | Puede editar tickets | Puede eliminar tickets |
|-----|-------------|:-------------------:|:--------------------:|:----------------------:|
| `USER` | Usuario final que reporta problemas | ✅ | Solo tickets propios | ❌ |
| `AGENT` | Agente de soporte que gestiona tickets | ✅ | Solo tickets asignados | ❌ |
| `ADMIN` | Administrador del sistema | ✅ | ✅ | ✅ |

---

## ¿Qué NO cubre esta lección? (y por qué)

| Tema | Razón |
|------|-------|
| JWT (JSON Web Tokens) | Requiere entender primero sesiones y autenticación básica |
| OAuth 2.0 (Google, GitHub) | Autenticación externa — primero domina autenticación local |
| Refresh tokens | Nivel siguiente después de dominar los fundamentos |
| Two-Factor Authentication | Nivel avanzado |
| Registro de usuarios desde la API | Se cubre en lecciones posteriores |

El foco de esta lección: **HTTP Basic Auth + usuarios en base de datos + reglas por rol + autorización por recurso + sesión STATELESS**.

---

## Requerimientos que implementamos

| ID | Requerimiento |
|----|---------------|
| **REQ-16-01** | `GET /tickets` y `GET /tickets/by-id/{id}` son públicos |
| **REQ-16-02** | `POST /tickets` requiere ROLE_USER, ROLE_AGENT o ROLE_ADMIN |
| **REQ-16-03** | `DELETE /tickets/by-id/{id}` requiere ROLE_ADMIN |
| **REQ-16-04** | Sin autenticación → 401 Unauthorized |
| **REQ-16-05** | Autenticación con rol insuficiente → 403 Forbidden |
| **REQ-16-06** | Contraseñas almacenadas con BCrypt (cost 10) en la base de datos |
| **REQ-16-07** | `CustomUserDetailsService` carga usuarios desde `UserRepository` |
| **REQ-16-08** | Migración Flyway agrega columna `password` (V5) |
| **REQ-16-09** | Migración Flyway seed de usuarios con hashes (V6) |
| **REQ-16-10** | API STATELESS — sin cookies ni sesiones HTTP |
| **REQ-16-11** | `PUT /tickets/by-id/{id}` permite a USER editar solo tickets propios, a AGENT solo tickets asignados y a ADMIN cualquier ticket |

---

## Estructura inicial vs final

```
Antes (Lección 15):
├── model/User.java                     (sin campo password; role es String)
├── config/DataInitializer.java         (seed sin contraseñas)
└── resources/db/migration/
    └── V4__Add_audit_tables.sql

Después (Lección 16):
├── model/User.java                     ← MODIFICADO: +password, role como enum
├── config/
│   ├── SecurityConfig.java             ← NUEVO
│   ├── CustomUserDetailsService.java   ← NUEVO
│   └── TicketSecurity.java             ← NUEVO: autorización por ticket específico
├── config/DataInitializer.java         ← MODIFICADO: +PasswordEncoder, +passwords, @Profile("h2")
└── resources/db/migration/
    ├── V5__lesson_16_add_password_to_users.sql   ← NUEVO
    └── V6__lesson_16_seed_users_with_auth.sql    ← NUEVO
```

---

## Estructura de la Lección

1. **[Este documento](01_objetivo_y_alcance.md)** — Objetivo y alcance
2. **[Guión Paso a Paso](02_guion_paso_a_paso.md)** ⭐ — Instrucciones prácticas
3. **[Autenticación vs Autorización](03_autenticacion_vs_autorizacion.md)** — Conceptos y arquitectura
4. **[Ejemplos Avanzados](04_ejemplos_practicos.md)** — Código adicional listo para usar
5. **[Cifrado de Contraseñas](05_password_encoding.md)** — BCrypt en detalle
6. **[Troubleshooting](06_troubleshooting.md)** — Errores frecuentes y soluciones
7. **[Checklist](07_checklist_rubrica_minima.md)** — Verificación antes de entregar
8. **[Actividad Individual](08_actividad_individual.md)** — Tu tarea



<!-- START OF FILE: docs_lessons_16-spring-security_02_guion_paso_a_paso.md -->
# Documento: docs lessons 16-spring-security 02 guion paso a paso
---
# Lección 16 — Guion Paso a Paso: Spring Security con Base de Datos

Sigue esta guía en orden. El objetivo es proteger la API con HTTP Basic Auth, cargar usuarios desde la base de datos y autorizar endpoints por rol.

> **Idea central:** no crearás un endpoint `/login`. Spring Security intercepta cada petición, lee el header `Authorization: Basic ...`, autentica al usuario y luego decide si puede ejecutar el endpoint solicitado.

---

## Paso 1: Agregar la dependencia de Spring Security

En `pom.xml`, dentro de `<dependencies>`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

Ejecuta:

```bash
# Linux / macOS
./mvnw clean install

# Windows
mvnw.cmd clean install
```

---

## Paso 2: Observar el comportamiento por defecto

Después de agregar la dependencia y antes de crear `SecurityConfig`, Spring Boot protege todos los endpoints automáticamente.

Al arrancar la aplicación verás algo parecido a:

```text
Using generated security password: 3f2a1b4c-8d7e-4f3a-9c1b-2d6e8f0a4b5c
```

Si llamas a cualquier endpoint:

```http
GET http://localhost:8080/ticket-app/tickets
```

Resultado esperado en este momento:

```text
401 Unauthorized
```

Esto ocurre porque Spring Security encontró la dependencia y aplicó una configuración temporal. En los siguientes pasos crearás tu propia configuración.

---

## Paso 3: Preparar `User.java` para autenticación

La entidad `User` debe tener:

- `password`: hash BCrypt de la contraseña.
- `role`: enum con `USER`, `AGENT`, `ADMIN`.
- `active`: permite deshabilitar usuarios sin eliminarlos.

Código completo de `model/User.java`:

```java
package cl.duoc.fullstack.tickets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es requerido")
    @Column(nullable = false, length = 100)
    private String name;

    @NotBlank(message = "El email es requerido")
    @Email(message = "El email no tiene un formato válido")
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Role role = Role.USER;

    @Column(nullable = false)
    private boolean active = true;

    public enum Role {
        USER,
        AGENT,
        ADMIN
    }
}
```

Puntos clave:

- `@Enumerated(EnumType.STRING)` guarda `USER`, `AGENT` o `ADMIN` como texto, no como número.
- `password` guarda el hash BCrypt, no la contraseña en texto plano.
- Si `active=false`, el usuario existe, pero no debe poder autenticarse.

---

## Paso 4: Preparar la base de datos

### V5: agregar columna `password`

Archivo: `src/main/resources/db/migration/V5__lesson_16_add_password_to_users.sql`

```sql
ALTER TABLE users ADD COLUMN password VARCHAR(255);
```

> Si tu proyecto ya tiene más migraciones, usa el siguiente número disponible. Revisa `flyway_schema_history` si tienes dudas.

### V6: sembrar usuarios con hashes BCrypt

Archivo: `src/main/resources/db/migration/V6__lesson_16_seed_users_with_auth.sql`

```sql
INSERT INTO users (name, email, role, active, password) VALUES
  ('Administrador',  'admin@empresa.com',       'ADMIN', true, '$2a$10$gT.PsFi3xTq9xc3virQAfesYBesY5g53tQ5R7lgJGqgVdVMH0I8qa'),
  ('Ana Garcia',     'ana.garcia@empresa.com',  'USER',  true, '$2a$10$LAK58ME84bgotvy2eL.eWeobSCHMDsaD3BajXq/swyevMwfw8PW/m'),
  ('Carlos Lopez',   'carlos.lopez@empresa.com','AGENT', true, '$2a$10$LAK58ME84bgotvy2eL.eWeobSCHMDsaD3BajXq/swyevMwfw8PW/m');
```

Credenciales de prueba:

| Email | Contraseña | Rol |
|-------|------------|-----|
| `admin@empresa.com` | `pass123` | ADMIN |
| `ana.garcia@empresa.com` | `user123` | USER |
| `carlos.lopez@empresa.com` | `user123` | AGENT |

Nunca guardes contraseñas en texto plano en la base de datos. Spring Security comparará la contraseña enviada por el cliente contra estos hashes usando BCrypt.

### H2: actualizar `DataInitializer`

Si usas H2 con datos en memoria y Flyway está deshabilitado, `DataInitializer` debe insertar usuarios con `PasswordEncoder`.

Fragmento relevante:

```java
@Component
@Profile("h2")
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            User admin = new User();
            admin.setName("Administrador");
            admin.setEmail("admin@empresa.com");
            admin.setPassword(passwordEncoder.encode("pass123"));
            admin.setRole(Role.ADMIN);
            admin.setActive(true);
            userRepository.save(admin);

            User ana = new User();
            ana.setName("Ana Garcia");
            ana.setEmail("ana.garcia@empresa.com");
            ana.setPassword(passwordEncoder.encode("user123"));
            ana.setRole(Role.USER);
            ana.setActive(true);
            userRepository.save(ana);

            User carlos = new User();
            carlos.setName("Carlos Lopez");
            carlos.setEmail("carlos.lopez@empresa.com");
            carlos.setPassword(passwordEncoder.encode("user123"));
            carlos.setRole(Role.AGENT);
            carlos.setActive(true);
            userRepository.save(carlos);
        }
    }
}
```

Puntos clave:

- `@Profile("h2")` evita duplicar datos en MySQL/PostgreSQL/Supabase.
- `passwordEncoder.encode(...)` genera un hash BCrypt distinto en cada ejecución, y eso está bien.

---

## Paso 5: Completar `UserRepository`

Spring Security recibirá un username desde Basic Auth. En esta lección usaremos el email como username, por eso el repositorio debe poder buscar usuarios por email.

Código de `respository/UserRepository.java`:

```java
package cl.duoc.fullstack.tickets.respository;

import cl.duoc.fullstack.tickets.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
```

Spring Data JPA implementa automáticamente `findByEmail` por convención de nombre.

---

## Paso 6: Crear el `PasswordEncoder`

Spring Security necesita un `PasswordEncoder` para comparar la contraseña plana enviada por el cliente contra el hash BCrypt guardado en la base de datos.

Este bean irá en `SecurityConfig`, pero conviene entenderlo antes:

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
```

Qué hace:

- `encode("user123")`: genera un hash BCrypt para guardar o sembrar usuarios.
- `matches("user123", hashBCrypt)`: valida una contraseña plana contra un hash.
- Spring Security llama internamente a `matches(...)` durante la autenticación.

No hagas esto:

```java
password.equals(user.getPassword())
```

Eso compara texto plano contra hash y siempre fallará. Además, no es seguro.

---

## Paso 7: Crear `CustomUserDetailsService`

`UserDetailsService` es el puente entre Spring Security y tu tabla `users`.

Cuando llega este header:

```text
Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
```

Spring Security lo decodifica como:

```text
ana.garcia@empresa.com:user123
```

Luego llama a:

```java
loadUserByUsername("ana.garcia@empresa.com")
```

Crea `config/CustomUserDetailsService.java`:

```java
package cl.duoc.fullstack.tickets.config;

import cl.duoc.fullstack.tickets.model.User;
import cl.duoc.fullstack.tickets.respository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
            .filter(u -> u.getPassword() != null && !u.getPassword().isBlank())
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + email));

        return org.springframework.security.core.userdetails.User
            .withUsername(user.getEmail())
            .password(user.getPassword())
            .roles(user.getRole().name())
            .disabled(!user.isActive())
            .build();
    }
}
```

Qué hace cada parte:

```text
userRepository.findByEmail(email)
    Busca al usuario por email.

.filter(u -> u.getPassword() != null && !u.getPassword().isBlank())
    Rechaza usuarios que existen, pero no tienen contraseña configurada.

.password(user.getPassword())
    Entrega a Spring Security el hash BCrypt guardado en la BD.

.roles(user.getRole().name())
    Recibe USER, AGENT o ADMIN. Spring agrega el prefijo ROLE_ automáticamente.

.disabled(!user.isActive())
    Si active=false, la autenticación falla con 401.
```

> **Importante:** `.roles("ADMIN")` produce internamente `ROLE_ADMIN`. Por eso después puedes usar `.hasRole("ADMIN")` y `@PreAuthorize("hasRole('ADMIN')")`.

Alternativa válida, pero no la mezcles con `.roles(...)` en el código principal:

```java
.authorities("ROLE_" + user.getRole().name())
```

---

## Paso 8: Crear `SecurityConfig`

`SecurityConfig` define el `SecurityFilterChain`: la cadena de filtros que se ejecuta antes de los controladores.

Crea `config/SecurityConfig.java`:

```java
package cl.duoc.fullstack.tickets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET, "/tickets", "/tickets/by-id/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/categories", "/categories/by-id/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/tags", "/tags/by-id/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/users", "/users/by-id/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/tickets/{id}/history").hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/tickets").hasAnyRole("USER", "AGENT", "ADMIN")
                .requestMatchers(HttpMethod.PUT, "/tickets/by-id/**").hasAnyRole("USER", "AGENT", "ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/tickets/by-id/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/categories").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/categories/by-id/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/categories/by-id/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.POST, "/tags").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/tags/by-id/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/tags/by-id/**").hasRole("ADMIN")
                .requestMatchers("/users/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

Explicación por bloque:

```text
@EnableMethodSecurity
    Habilita @PreAuthorize en controladores y servicios.

csrf(csrf -> csrf.disable())
    Deshabilita CSRF. Es correcto para esta API REST stateless sin cookies de sesión.

SessionCreationPolicy.STATELESS
    Spring no crea sesión. Cada request debe traer Authorization: Basic ...

authorizeHttpRequests(...)
    Define autorización por método HTTP y ruta.

httpBasic(Customizer.withDefaults())
    Activa BasicAuthenticationFilter, el filtro que lee Authorization: Basic ...

PasswordEncoder
    Define BCrypt como algoritmo de comparación de contraseñas.
```

> **Rutas sin context-path:** en `SecurityConfig` se escribe `/tickets`, no `/ticket-app/tickets`. El context path `/ticket-app` ya fue procesado antes.

---

## Paso 9: Entender el flujo interno de autenticación

Este es el recorrido completo cuando un cliente envía una petición protegida:

```text
Cliente
  Authorization: Basic base64(email:password)
        |
        v
BasicAuthenticationFilter
        |
        v
AuthenticationManager
        |
        v
DaoAuthenticationProvider
        |
        v
CustomUserDetailsService.loadUserByUsername(email)
        |
        v
PasswordEncoder.matches(passwordPlano, hashBCrypt)
        |
        v
SecurityContext: Authentication autenticado con ROLE_...
        |
        v
AuthorizationFilter / @PreAuthorize
        |
        v
Controlador
```

Responsabilidades:

- `BasicAuthenticationFilter`: lee y decodifica el header Basic.
- `CustomUserDetailsService`: carga usuario, hash y rol desde la base de datos.
- `PasswordEncoder`: valida la contraseña enviada contra el hash.
- `AuthorizationFilter`: revisa reglas de `SecurityConfig`.
- `@PreAuthorize`: revisa reglas declaradas sobre métodos.

Respuestas esperadas:

- Sin header, header inválido, usuario inexistente, contraseña incorrecta o usuario inactivo: `401 Unauthorized`.
- Usuario autenticado, pero sin rol suficiente: `403 Forbidden`.
- Usuario autenticado y autorizado: se ejecuta el controlador.

---

## Paso 10: Autorizar con `@PreAuthorize`

Las reglas de `SecurityConfig` sirven bien para permisos generales por ruta. `@PreAuthorize` es útil cuando quieres que la regla quede cerca del caso de uso o dependa de parámetros del método.

Ejemplo para eliminar tickets solo con ADMIN:

```java
import org.springframework.security.access.prepost.PreAuthorize;

@DeleteMapping("/by-id/{id}")
@PreAuthorize("hasRole('ADMIN')")
public ResponseEntity<Void> deleteById(@PathVariable Long id) {
    ticketService.deleteById(id);
    return ResponseEntity.noContent().build();
}
```

Ejemplo para crear tickets con cualquier usuario autenticado de los roles permitidos:

```java
import org.springframework.security.access.prepost.PreAuthorize;

@PostMapping
@PreAuthorize("hasAnyRole('USER', 'AGENT', 'ADMIN')")
public ResponseEntity<TicketResponse> create(@Valid @RequestBody TicketRequest request) {
    return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.create(request));
}
```

Regla práctica:

- Usa `SecurityConfig` para reglas simples y globales por método HTTP y ruta.
- Usa `@PreAuthorize` para reglas específicas del caso de uso.
- No dupliques reglas contradictorias. Si `SecurityConfig` bloquea antes, el método anotado nunca se ejecuta.

Expresiones frecuentes:

| Expresión | Significado |
|-----------|-------------|
| `hasRole('ADMIN')` | Requiere `ROLE_ADMIN` |
| `hasAnyRole('USER', 'AGENT', 'ADMIN')` | Requiere cualquiera de esos roles |
| `isAuthenticated()` | Requiere cualquier usuario autenticado |
| `authentication.name == 'admin@empresa.com'` | Requiere un usuario específico |

---

## Paso 11: Autorizar edición según el ticket específico

La regla para editar tickets no depende solo del rol. También depende del ticket específico:

- `USER`: puede editar solo tickets que él creó (`ticket.createdBy.email == authentication.name`).
- `AGENT`: puede editar solo tickets que tiene asignados (`ticket.assignedTo.email == authentication.name`).
- `ADMIN`: puede editar cualquier ticket.

Esta regla no se puede expresar correctamente solo con `hasRole(...)`, porque `hasRole(...)` no sabe quién creó el ticket ni a quién está asignado. Para resolverlo, delegaremos la decisión a un bean de seguridad.

### Crear `TicketSecurity`

Crea `config/TicketSecurity.java`:

```java
package cl.duoc.fullstack.tickets.config;

import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.respository.TicketRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component("ticketSecurity")
public class TicketSecurity {

    private final TicketRepository ticketRepository;

    public TicketSecurity(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public boolean canEdit(Long ticketId, Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }

        if (hasRole(authentication, "ROLE_ADMIN")) {
            return true;
        }

        String email = authentication.getName();

        return ticketRepository.findById(ticketId)
            .map(ticket -> canEditTicket(ticket, email, authentication))
            .orElse(false);
    }

    private boolean canEditTicket(Ticket ticket, String email, Authentication authentication) {
        if (hasRole(authentication, "ROLE_USER")) {
            return ticket.getCreatedBy() != null
                && email.equals(ticket.getCreatedBy().getEmail());
        }

        if (hasRole(authentication, "ROLE_AGENT")) {
            return ticket.getAssignedTo() != null
                && email.equals(ticket.getAssignedTo().getEmail());
        }

        return false;
    }

    private boolean hasRole(Authentication authentication, String role) {
        return authentication.getAuthorities().stream()
            .anyMatch(authority -> authority.getAuthority().equals(role));
    }
}
```

Qué hace:

```text
@Component("ticketSecurity")
    Registra el bean con ese nombre para poder llamarlo desde @PreAuthorize.

canEdit(Long ticketId, Authentication authentication)
    Recibe el id del ticket y el usuario autenticado.

authentication.getName()
    Devuelve el username autenticado. En esta lección es el email.

ticketRepository.findById(ticketId)
    Carga el ticket para revisar createdBy y assignedTo.

ROLE_ADMIN
    Puede editar sin revisar propietario ni asignación.

ROLE_USER
    Solo puede editar si ticket.createdBy.email coincide con authentication.name.

ROLE_AGENT
    Solo puede editar si ticket.assignedTo.email coincide con authentication.name.
```

### Aplicar la regla en el controlador

Actualiza el método `PUT /tickets/by-id/{id}` en `TicketController`:

```java
import org.springframework.security.access.prepost.PreAuthorize;

@PutMapping("/by-id/{id}")
@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")
public ResponseEntity<Object> updateTicketById(
    @PathVariable Long id,
    @Valid @RequestBody TicketRequest request) {
    try {
        Optional<TicketResult> updated = this.service.updateById(id, request);
        if (updated.isPresent()) {
            return ResponseEntity.ok(updated.get());
        }
        return ResponseEntity.notFound().build();
    } catch (IllegalArgumentException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(e.getMessage()));
    }
}
```

La expresión SpEL se lee así:

```text
@ticketSecurity
    Bean llamado ticketSecurity.

canEdit(#id, authentication)
    Ejecuta el método canEdit usando el @PathVariable id y el usuario autenticado.

#id
    Parámetro id del método updateTicketById.

authentication
    Objeto Authentication actual creado por Spring Security después de validar Basic Auth.
```

### Mantener la regla general en `SecurityConfig`

Deja esta regla en `SecurityConfig`:

```java
.requestMatchers(HttpMethod.PUT, "/tickets/by-id/**").hasAnyRole("USER", "AGENT", "ADMIN")
```

Esto produce dos niveles de autorización:

| Nivel | Pregunta | Ejemplo |
|-------|----------|---------|
| `SecurityConfig` | ¿Este rol puede intentar editar tickets? | USER, AGENT y ADMIN sí |
| `@PreAuthorize` | ¿Este usuario puede editar este ticket específico? | USER solo si lo creó; AGENT solo si lo tiene asignado |

---

## Paso 12: Tabla de autorización esperada

| Endpoint | Sin auth | USER | AGENT | ADMIN |
|----------|----------|------|-------|-------|
| `GET /tickets` | 200 | 200 | 200 | 200 |
| `GET /tickets/by-id/{id}` | 200 | 200 | 200 | 200 |
| `GET /tickets/{id}/history` | 401 | 403 | 403 | 200 |
| `POST /tickets` | 401 | 201 | 201 | 201 |
| `PUT /tickets/by-id/{id}` propio/permitido | 401 | 200 | 200 | 200 |
| `PUT /tickets/by-id/{id}` ajeno/no asignado | 401 | 403 | 403 | 200 |
| `DELETE /tickets/by-id/{id}` | 401 | 403 | 403 | 204 |
| `GET /users` | 200 | 200 | 200 | 200 |
| `POST /users` | 401 | 403 | 403 | 200/201 |

> Los códigos `200`, `201` y `204` pueden variar si falla una validación de negocio o si el recurso no existe. Lo importante para seguridad es distinguir `401` de `403`.

---

## Paso 13: Probar con Postman, Thunder Client o curl

### Generar Base64 en PowerShell

```powershell
[Convert]::ToBase64String([Text.Encoding]::UTF8.GetBytes("ana.garcia@empresa.com:user123"))
```

Resultado esperado:

```text
YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
```

### Generar Base64 en Linux / macOS

```bash
echo -n "ana.garcia@empresa.com:user123" | base64
```

### Credenciales disponibles

| Email | Contraseña | Rol | Base64 |
|-------|------------|-----|--------|
| `admin@empresa.com` | `pass123` | ADMIN | `YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==` |
| `ana.garcia@empresa.com` | `user123` | USER | `YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz` |
| `carlos.lopez@empresa.com` | `user123` | AGENT | `Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=` |

### Casos mínimos

```bash
# 1. GET público: debe devolver 200
curl -i http://localhost:8080/ticket-app/tickets

# 2. POST sin autenticación: debe devolver 401
curl -i -X POST http://localhost:8080/ticket-app/tickets \
  -H "Content-Type: application/json" \
  -d '{"title":"Test","description":"test"}'

# 3. POST con password incorrecta: debe devolver 401
curl -i -X POST http://localhost:8080/ticket-app/tickets \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTptYWxh" \
  -d '{"title":"Test","description":"test"}'

# 4. POST con USER válido: debe devolver 201 si el payload es válido
curl -i -X POST http://localhost:8080/ticket-app/tickets \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz" \
  -d '{"title":"Nuevo ticket","description":"descripcion"}'

# 5. DELETE con USER válido: debe devolver 403
curl -i -X DELETE http://localhost:8080/ticket-app/tickets/by-id/1 \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz"

# 6. DELETE con ADMIN válido: debe devolver 204 si el ticket existe
curl -i -X DELETE http://localhost:8080/ticket-app/tickets/by-id/1 \
  -H "Authorization: Basic YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw=="
```

### Casos de edición por propietario/asignado

Usa tickets existentes donde conozcas `createdBy.email` y `assignedTo.email`.

```bash
# USER edita un ticket creado por él: debe devolver 200 si el payload es válido
curl -i -X PUT http://localhost:8080/ticket-app/tickets/by-id/1 \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz" \
  -d '{"title":"Ticket actualizado","description":"descripcion","status":"OPEN"}'

# USER edita un ticket creado por otro usuario: debe devolver 403
curl -i -X PUT http://localhost:8080/ticket-app/tickets/by-id/2 \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz" \
  -d '{"title":"Intento no permitido","description":"descripcion","status":"OPEN"}'

# AGENT edita un ticket asignado a él: debe devolver 200 si el payload es válido
curl -i -X PUT http://localhost:8080/ticket-app/tickets/by-id/3 \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=" \
  -d '{"title":"Ticket gestionado","description":"descripcion","status":"IN_PROGRESS"}'

# AGENT edita un ticket no asignado a él: debe devolver 403
curl -i -X PUT http://localhost:8080/ticket-app/tickets/by-id/4 \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=" \
  -d '{"title":"Intento no permitido","description":"descripcion","status":"IN_PROGRESS"}'
```

### Caso opcional: usuario inactivo

En la base de datos:

```sql
UPDATE users SET active = false WHERE email = 'ana.garcia@empresa.com';
```

Luego repite el POST con Ana. Debe responder `401 Unauthorized`.

---

## Resumen de pasos

```text
1. Agregar spring-boot-starter-security
        ↓
2. Observar la seguridad por defecto
        ↓
3. Preparar User: password, role, active
        ↓
4. Crear migraciones o actualizar DataInitializer
        ↓
5. Agregar UserRepository.findByEmail
        ↓
6. Declarar PasswordEncoder BCrypt
        ↓
7. Crear CustomUserDetailsService
        ↓
8. Crear SecurityConfig con httpBasic y STATELESS
        ↓
9. Entender BasicAuthenticationFilter y el flujo interno
        ↓
10. Aplicar @PreAuthorize donde corresponda
        ↓
11. Crear TicketSecurity para edición por propietario/asignado
        ↓
12. Probar 200, 201, 204, 401 y 403
```

---

*[← Volver a Objetivo](01_objetivo_y_alcance.md) | [Conceptos: Autenticación vs Autorización →](03_autenticacion_vs_autorizacion.md)*



<!-- START OF FILE: docs_lessons_16-spring-security_03_autenticacion_vs_autorizacion.md -->
# Documento: docs lessons 16-spring-security 03 autenticacion vs autorizacion
---
# Lección 16 — Autenticación vs Autorización

## La confusión más común en seguridad

- **Autenticación:** ¿Quién eres? → verifica identidad
- **Autorización:** ¿Qué puedes hacer? → verifica permisos

Son dos pasos **secuenciales**: primero se autentica, después se autoriza. No puedes autorizar a alguien que no se ha autenticado.

---

## Comparativa

| Aspecto | Autenticación | Autorización |
|--------|---------------|--------------|
| **Pregunta** | ¿Quién eres? | ¿Qué puedes hacer? |
| **Respuesta** | Usuario validado | Rol/permiso asignado |
| **Ejemplo** | Email `admin@empresa.com` + contraseña `pass123` correcta | Usuario ADMIN puede eliminar tickets |
| **Si falla** | `401 Unauthorized` | `403 Forbidden` |
| **En Spring Security** | `UserDetailsService` + `PasswordEncoder` | Reglas en `SecurityConfig` o `@PreAuthorize` |

---

## Cómo funciona HTTP Basic Auth

En cada petición, el cliente envía las credenciales en el header `Authorization`:

```
Authorization: Basic <base64(email:contraseña)>
```

Por ejemplo, para `admin@empresa.com:pass123`:
```
echo -n "admin@empresa.com:pass123" | base64
→ YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==
```

Spring Security intercepta la petición con `BasicAuthenticationFilter`, decodifica el Base64, llama a `CustomUserDetailsService.loadUserByUsername(email)`, compara la contraseña con el hash BCrypt de la BD usando `PasswordEncoder.matches(...)` y, si coincide, construye un `Authentication` autenticado.

> **Nota de seguridad:** Base64 NO es cifrado. Las credenciales son recuperables si alguien intercepta el header. En producción, siempre usa HTTPS para que el header viaje cifrado.

---

## Arquitectura: el Security Filter Chain

Spring Security funciona como una **cadena de filtros** que intercepta cada petición HTTP antes de que llegue al controlador.

```
Petición HTTP
      │
      ▼
┌─────────────────────────────────────────────────────┐
│               Security Filter Chain                 │
│                                                     │
│  1. SecurityContextHolderFilter                     │
│     └─ Prepara el contexto de seguridad             │
│                                                     │
│  2. BasicAuthenticationFilter                       │
│     └─ Lee el header Authorization: Basic ...       │
│     └─ Llama a CustomUserDetailsService             │
│     └─ Verifica contraseña con BCryptPasswordEncoder│
│     └─ Si es válido → guarda Authentication         │
│                                                     │
│  3. ExceptionTranslationFilter                      │
│     └─ Captura errores de autenticación → 401       │
│     └─ Captura errores de autorización → 403        │
│                                                     │
│  4. AuthorizationFilter                             │
│     └─ Verifica las reglas de tu SecurityConfig     │
│     └─ .permitAll() → pasa sin autenticación        │
│     └─ .hasRole("ADMIN") → verifica el rol          │
│                                                     │
└─────────────────────────────────────────────────────┘
      │
      ▼ (si todos los filtros pasan)
   Controlador Spring MVC
      │
      ▼
   Respuesta HTTP
```

**Puntos clave de este flujo:**
1. Los filtros se ejecutan en orden, antes de que tu código de controlador corra
2. Si un filtro rechaza la petición, los siguientes filtros **no se ejecutan**
3. Tu `SecurityConfig` activa filtros como `BasicAuthenticationFilter` con `httpBasic(...)` y define reglas que aplicará `AuthorizationFilter`

---

## Flujo interno con HTTP Basic

Este es el camino completo de una petición protegida:

```text
Cliente
  Authorization: Basic base64(email:password)
        |
        v
BasicAuthenticationFilter
        |
        v
AuthenticationManager
        |
        v
DaoAuthenticationProvider
        |
        v
CustomUserDetailsService.loadUserByUsername(email)
        |
        v
PasswordEncoder.matches(passwordPlano, hashBCrypt)
        |
        v
SecurityContext: Authentication autenticado con ROLE_...
        |
        v
AuthorizationFilter / @PreAuthorize
        |
        v
Controlador
```

Responsabilidades principales:

- `BasicAuthenticationFilter`: captura el header `Authorization: Basic ...`. Este filtro lo aporta Spring Security; no se implementa manualmente.
- `CustomUserDetailsService`: carga el usuario desde `UserRepository.findByEmail(email)`.
- `PasswordEncoder`: compara la contraseña enviada contra el hash BCrypt guardado.
- `SecurityContext`: guarda el usuario autenticado durante la petición actual.
- `AuthorizationFilter`: aplica las reglas de `SecurityConfig`.
- `@PreAuthorize`: aplica reglas a nivel de método cuando `@EnableMethodSecurity` está habilitado.

Respuestas esperadas:

- `401 Unauthorized`: no se pudo autenticar. Falta header, el header es inválido, el usuario no existe, la contraseña es incorrecta o el usuario está inactivo.
- `403 Forbidden`: el usuario sí se autenticó, pero su rol no tiene permiso para ejecutar el endpoint.

---

## STATELESS vs STATEFUL

### STATEFUL (sesiones HTTP — no lo que usamos aquí)

En aplicaciones web tradicionales, el servidor guarda la sesión del usuario:

```
Login:
  Cliente → POST /login (usuario:contraseña)
  Servidor → crea Session ID → guarda en memoria
  Servidor → devuelve Cookie: JSESSIONID=abc123

Petición posterior:
  Cliente → GET /dashboard (Cookie: JSESSIONID=abc123)
  Servidor → busca la sesión abc123 → el usuario está autenticado ✅
```

**Problema para APIs REST:** Las cookies de sesión no funcionan bien con clientes móviles, microservicios, ni con múltiples instancias del servidor.

### STATELESS (lo que usamos en esta lección)

Con `SessionCreationPolicy.STATELESS`, el servidor **nunca guarda estado**:

```
Cada petición:
  Cliente → GET /tickets (Authorization: Basic YWRtaW5...)
  Servidor → verifica el header Authorization → autentica → responde
  (No guarda nada en memoria)

Siguiente petición:
  Cliente → POST /tickets (Authorization: Basic YWRtaW5...)
  Servidor → verifica el header Authorization otra vez → autentica → responde
```

**Ventajas para APIs REST:**
- Funciona igual con cualquier cliente (web, móvil, Postman, microservicio)
- No hay problemas al escalar horizontalmente (múltiples instancias)
- Más fácil de testear

---

## Flujo completo: autenticación + autorización

```mermaid
sequenceDiagram
    participant C as Cliente
    participant F as Security Filter Chain
    participant S as CustomUserDetailsService
    participant DB as Base de Datos
    participant CTRL as Controlador

    rect rgb(240, 248, 255)
        Note over C,DB: 1. AUTENTICACIÓN
        C->>F: POST /tickets<br/>Authorization: Basic YW5h...
        F->>F: Decodifica Base64<br/>→ ana.garcia@empresa.com:user123
        F->>S: loadUserByUsername("ana.garcia@empresa.com")
        S->>DB: SELECT * FROM users WHERE email = ?
        DB-->>S: {email, password=$2a$10$..., role=USER}
        S-->>F: UserDetails con ROLE_USER y hash BCrypt
        F->>F: encoder.matches("user123", hashBD) → true ✅
    end

    rect rgb(255, 248, 240)
        Note over C,CTRL: 2. AUTORIZACIÓN
        F->>F: ¿Tiene permiso para POST /tickets?
        F->>F: Regla: hasAnyRole("USER", "AGENT", "ADMIN")
        F->>F: Usuario tiene ROLE_USER → ✅ permitido
        F->>CTRL: Ejecuta el método del controlador
        CTRL-->>C: 201 Created
    end
```

---

## Roles en Spring Security

Spring Security usa el prefijo `ROLE_` internamente. En la implementación base de esta lección usamos `.roles(...)` para entregar el rol sin prefijo y dejar que Spring agregue `ROLE_` automáticamente:

```java
// Al construir UserDetails (en CustomUserDetailsService)
return org.springframework.security.core.userdetails.User
    .withUsername(user.getEmail())
    .password(user.getPassword())
    .roles(user.getRole().name())
    .disabled(!user.isActive())
    .build();

// En SecurityConfig (Spring agrega ROLE_ automáticamente)
.hasRole("ADMIN")        // Busca "ROLE_ADMIN" en el UserDetails
.hasAnyRole("USER", "AGENT", "ADMIN")  // Busca cualquiera de los tres

// En anotaciones de controladores
@PreAuthorize("hasRole('ADMIN')")       // Busca "ROLE_ADMIN"
@PreAuthorize("hasAnyRole('USER','AGENT','ADMIN')")
```

También existe esta alternativa:

```java
.authorities("ROLE_" + user.getRole().name())
```

> **Regla práctica:** en `.roles(...)`, `.hasRole(...)` y `@PreAuthorize("hasRole(...)")`, escribe el rol **sin** el prefijo `ROLE_`. Si usas `.authorities(...)` o `hasAuthority(...)`, escribe el valor completo, por ejemplo `ROLE_ADMIN`.

---

## Autorización por datos del recurso

Algunas reglas no dependen solo del rol. También dependen del recurso que se quiere modificar.

Ejemplo para editar tickets:

| Rol | Regla |
|-----|-------|
| `USER` | Puede editar solo tickets donde `ticket.createdBy.email` sea igual a `authentication.name` |
| `AGENT` | Puede editar solo tickets donde `ticket.assignedTo.email` sea igual a `authentication.name` |
| `ADMIN` | Puede editar cualquier ticket |

Esta autorización se conoce como autorización por recurso, por propiedad o por datos. `hasRole('USER')` no alcanza, porque solo responde si el usuario tiene el rol, pero no sabe si el ticket fue creado por él.

Para estos casos se usa un bean invocado desde `@PreAuthorize`:

```java
@PutMapping("/by-id/{id}")
@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")
public ResponseEntity<Object> updateTicketById(
    @PathVariable Long id,
    @Valid @RequestBody TicketRequest request) {
    // ...
}
```

La regla queda dividida en dos niveles:

| Nivel | Pregunta | Herramienta |
|-------|----------|-------------|
| Ruta y rol | ¿Este rol puede intentar editar tickets? | `SecurityConfig` con `hasAnyRole(...)` |
| Recurso específico | ¿Este usuario puede editar este ticket? | `@PreAuthorize` con `@ticketSecurity.canEdit(...)` |

Si el usuario está autenticado pero intenta editar un ticket ajeno o no asignado, Spring Security debe responder `403 Forbidden`.

---

## Escenarios reales

### Escenario 1: Crear ticket

```
GET  /tickets/by-id/1          → Público ✅ (sin auth → 200 OK)
POST /tickets (sin auth)        → ❌ 401 Unauthorized
POST /tickets (USER)            → ✅ ROLE_USER puede crear → 201 Created
POST /tickets (AGENT)           → ✅ ROLE_AGENT puede crear → 201 Created
POST /tickets (ADMIN)           → ✅ ROLE_ADMIN puede crear → 201 Created
```

### Escenario 2: Eliminar ticket

```
DELETE /tickets/by-id/1 (sin auth) → ❌ 401 Unauthorized
DELETE /tickets/by-id/1 (USER)     → ❌ ROLE_USER no puede eliminar → 403 Forbidden
DELETE /tickets/by-id/1 (AGENT)    → ❌ ROLE_AGENT no puede eliminar → 403 Forbidden
DELETE /tickets/by-id/1 (ADMIN)    → ✅ ROLE_ADMIN puede eliminar → 204 No Content
```

### Escenario 3: Editar ticket

```
PUT /tickets/by-id/1 (sin auth)             → ❌ 401 Unauthorized
PUT /tickets/by-id/1 (USER creador)         → ✅ ROLE_USER puede editar → 200 OK
PUT /tickets/by-id/1 (USER no creador)      → ❌ ROLE_USER autenticado, pero no es dueño → 403 Forbidden
PUT /tickets/by-id/1 (AGENT asignado)       → ✅ ROLE_AGENT puede editar → 200 OK
PUT /tickets/by-id/1 (AGENT no asignado)    → ❌ ROLE_AGENT autenticado, pero no está asignado → 403 Forbidden
PUT /tickets/by-id/1 (ADMIN)                → ✅ ROLE_ADMIN puede editar → 200 OK
```

### Escenario 4: Gestionar categorías

```
GET    /categories (sin auth)    → ✅ Público → 200 OK
POST   /categories (sin auth)    → ❌ 401 Unauthorized
POST   /categories (USER)        → ❌ 403 Forbidden (no tiene permiso)
POST   /categories (AGENT)       → ❌ 403 Forbidden (no tiene permiso)
POST   /categories (ADMIN)       → ✅ 201 Created
```

---

## Tabla completa de permisos

| Endpoint | Método | Sin auth | USER | AGENT | ADMIN |
|----------|--------|:--------:|:----:|:-----:|:-----:|
| `/tickets` | GET | ✅ 200 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets/by-id/{id}` | GET | ✅ 200 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets` | POST | ❌ 401 | ✅ 201 | ✅ 201 | ✅ 201 |
| `/tickets/by-id/{id}` propio/asignado | PUT | ❌ 401 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets/by-id/{id}` ajeno/no asignado | PUT | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 200 |
| `/tickets/by-id/{id}` | DELETE | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 204 |
| `/tickets/{id}/history` | GET | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 200 |
| `/categories` | GET | ✅ 200 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/categories` | POST | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 201 |
| `/categories/by-id/{id}` | PUT/DELETE | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 200/204 |



<!-- START OF FILE: docs_lessons_16-spring-security_04_ejemplos_practicos.md -->
# Documento: docs lessons 16-spring-security 04 ejemplos practicos
---
# Lección 16 — Ejemplos Avanzados

Esta sección contiene código adicional que extiende la implementación base. No es obligatorio para la actividad, pero es útil para entender el potencial de Spring Security.

---

## 1. Obtener el usuario autenticado en un controlador

Muchas veces necesitas saber **quién está haciendo la petición** dentro del método del controlador. Puedes inyectar el `Principal` o el `Authentication` directamente:

```java
import org.springframework.security.core.Authentication;

@GetMapping("/auth/me")
public ResponseEntity<Map<String, String>> whoAmI(Authentication authentication) {
    Map<String, String> info = new HashMap<>();
    info.put("email", authentication.getName());
    info.put("role", authentication.getAuthorities().iterator().next().getAuthority());
    return ResponseEntity.ok(info);
}
```

**Ejemplo de respuesta:**
```json
{
    "email": "ana.garcia@empresa.com",
    "role": "ROLE_USER"
}
```

También puedes obtener el usuario completo de la BD inyectando `UserRepository`:

```java
@GetMapping("/auth/me")
public ResponseEntity<User> whoAmI(Authentication authentication) {
    String email = authentication.getName();
    return userRepository.findByEmail(email)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
}
```

> **¿Cuándo usar esto?** Cuando un usuario solo debe ver sus propios tickets, o cuando quieres registrar quién realizó una acción.

---

## 2. Autorización con `@PreAuthorize` en el controlador

En lugar de (o además de) las reglas en `SecurityConfig`, puedes anotar métodos individuales del controlador:

```java
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    // Solo ADMIN puede ver el historial
    @GetMapping("/{id}/history")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<TicketHistory>> getHistory(@PathVariable Long id) {
        // ...
    }

    // USER, AGENT o ADMIN pueden crear tickets
    @PostMapping
    @PreAuthorize("hasAnyRole('USER', 'AGENT', 'ADMIN')")
    public ResponseEntity<String> create(@Valid @RequestBody TicketRequest dto) {
        // ...
    }
}
```

**Expresiones SpEL disponibles en `@PreAuthorize`:**

| Expresión | Descripción |
|-----------|-------------|
| `hasRole('ADMIN')` | Tiene el rol ADMIN |
| `hasAnyRole('USER', 'AGENT')` | Tiene cualquiera de los roles |
| `isAuthenticated()` | Está autenticado (cualquier rol) |
| `isAnonymous()` | No está autenticado |
| `authentication.name == 'admin@empresa.com'` | Es exactamente este usuario |
| `#id == authentication.principal.id` | El parámetro `id` coincide con el id del usuario autenticado |

> **`SecurityConfig` vs `@PreAuthorize`:** Para proyectos simples, las reglas en `SecurityConfig` son suficientes. `@PreAuthorize` es mejor cuando las condiciones dependen de los datos de la petición (ej: solo el creador puede editar su propio ticket).

---

## 3. Autorización por recurso con un bean de seguridad

Cuando la autorización depende del ticket específico, delega la decisión a un bean llamado desde `@PreAuthorize`.

Regla de ejemplo:

- `USER`: solo edita tickets creados por él.
- `AGENT`: solo edita tickets asignados a él.
- `ADMIN`: edita cualquier ticket.

```java
import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.respository.TicketRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component("ticketSecurity")
public class TicketSecurity {

    private final TicketRepository ticketRepository;

    public TicketSecurity(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public boolean canEdit(Long ticketId, Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }

        if (hasRole(authentication, "ROLE_ADMIN")) {
            return true;
        }

        String email = authentication.getName();

        return ticketRepository.findById(ticketId)
            .map(ticket -> canEditTicket(ticket, email, authentication))
            .orElse(false);
    }

    private boolean canEditTicket(Ticket ticket, String email, Authentication authentication) {
        if (hasRole(authentication, "ROLE_USER")) {
            return ticket.getCreatedBy() != null
                && email.equals(ticket.getCreatedBy().getEmail());
        }

        if (hasRole(authentication, "ROLE_AGENT")) {
            return ticket.getAssignedTo() != null
                && email.equals(ticket.getAssignedTo().getEmail());
        }

        return false;
    }

    private boolean hasRole(Authentication authentication, String role) {
        return authentication.getAuthorities().stream()
            .anyMatch(authority -> authority.getAuthority().equals(role));
    }
}
```

Uso en el controlador:

```java
@PutMapping("/by-id/{id}")
@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")
public ResponseEntity<Object> updateTicketById(
    @PathVariable Long id,
    @Valid @RequestBody TicketRequest request) {
    // ...
}
```

> **Por qué usar un bean:** `hasRole('USER')` solo sabe el rol. `TicketSecurity` puede consultar el ticket y comparar `createdBy.email` o `assignedTo.email` con `authentication.name`.

---

## 4. Alternativa: usar `authorities(...)` en lugar de `roles(...)`

La implementación base del guion usa `.roles(user.getRole().name())`, que agrega automáticamente el prefijo `ROLE_`. También puedes construir la authority completa manualmente:

```java
@Override
public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userRepository.findByEmail(email)
        .filter(u -> u.getPassword() != null && !u.getPassword().isBlank())
        .orElseThrow(() -> new UsernameNotFoundException(
            "Usuario no encontrado o sin contraseña: " + email));

    GrantedAuthority authority = () -> "ROLE_" + user.getRole().name();

    return org.springframework.security.core.userdetails.User
        .withUsername(user.getEmail())
        .password(user.getPassword())
        .authorities(authority)
        .disabled(!user.isActive())
        .build();
}
```

Si usas esta alternativa, recuerda que `hasRole("ADMIN")` busca `ROLE_ADMIN`. Por eso la authority debe incluir el prefijo `ROLE_`.

---

## 5. Configurar CORS para desarrollo con frontend

Si tienes un frontend (React, Angular, etc.) corriendo en `localhost:3000`, necesitas habilitar CORS en `SecurityConfig`:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .cors(cors -> cors.configurationSource(corsConfigurationSource()))  // ← Agrega esto
        .csrf(csrf -> csrf.disable())
        // ... resto de la configuración igual
        ;
    return http.build();
}

@Bean
public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.setAllowedOrigins(List.of("http://localhost:3000", "http://localhost:5173"));
    config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
    config.setAllowedHeaders(List.of("Authorization", "Content-Type"));
    config.setExposedHeaders(List.of("Authorization"));

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", config);
    return source;
}
```

**Imports necesarios:**
```java
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import java.util.List;
```

---

## 6. Generar hashes BCrypt manualmente

Si necesitas generar nuevos hashes para las migraciones, puedes hacerlo con una clase main temporal:

```java
// Crea este archivo temporalmente, ejecuta, copia los hashes y luego bórralo
public class GenerateHashes {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        System.out.println("admin123: " + encoder.encode("admin123"));
        System.out.println("user456:  " + encoder.encode("user456"));
    }
}
```

**Salida de ejemplo:**
```
admin123: $2a$10$5Cx.xR2y7...Qz3KaB1mP
user456:  $2a$10$9Dw.qR4z8...Rp4LcC2nQ
```

Copia esos hashes directamente en el SQL de la migración.

> **Importante:** Cada ejecución produce hashes diferentes (por el salt aleatorio), pero todos son válidos. Elige uno y ponlo en la migración.

---

## 7. Probar la seguridad con `curl`

```bash
# Test 1: GET público (debe funcionar sin auth)
curl -i http://localhost:8080/ticket-app/tickets

# Test 2: POST sin auth (debe devolver 401)
curl -i -X POST http://localhost:8080/ticket-app/tickets \
  -H "Content-Type: application/json" \
  -d '{"title":"Test","description":"test"}'

# Test 3: POST con credenciales USER
curl -i -X POST http://localhost:8080/ticket-app/tickets \
  -H "Content-Type: application/json" \
  -H "Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz" \
  -d '{"title":"Nuevo ticket","description":"descripcion"}'

# Test 4: DELETE con ADMIN
curl -i -X DELETE http://localhost:8080/ticket-app/tickets/by-id/1 \
  -H "Authorization: Basic YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw=="

# Generar el Base64 de cualquier credencial
echo -n "mi.email@empresa.com:micontraseña" | base64
```



<!-- START OF FILE: docs_lessons_16-spring-security_05_password_encoding.md -->
# Documento: docs lessons 16-spring-security 05 password encoding
---
# Lección 16 — Cifrado de Contraseñas con BCrypt

## ¿Por qué no guardar contraseñas en texto plano?

```
Base de datos filtrada (texto plano):
  admin@empresa.com  → pass123   ← atacante puede entrar inmediatamente
  ana@empresa.com    → user123   ← y en todos los otros sistemas donde usen la misma contraseña
```

```
Base de datos filtrada (BCrypt):
  admin@empresa.com  → $2a$10$gT.PsFi3xTq9xc3virQAf...  ← inútil sin la contraseña original
  ana@empresa.com    → $2a$10$LAK58ME84bgotvy2eL.eWe...  ← requiere fuerza bruta por cada usuario
```

**Solución:** Usar hashing irreversible con salt aleatorio.

---

## ¿Qué es un hash de contraseña?

Un hash es una función de una sola vía:

```
"pass123"  →  función hash  →  "$2a$10$gT.PsFi3xTq9xc3virQAf..."
                     ↑
          No existe función inversa
```

No puedes recuperar `"pass123"` a partir del hash. Lo único que puedes hacer es verificar si una contraseña candidata produce el mismo hash.

---

## BCryptPasswordEncoder

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();  // cost factor 10 por defecto
}
```

### Cómo funciona

```java
PasswordEncoder encoder = new BCryptPasswordEncoder(10);  // cost factor = 10

// Al registrar/seedear un usuario (operación lenta, ~100ms)
String hash = encoder.encode("pass123");
// → $2a$10$gT.PsFi3xTq9xc3virQAfesYBesY5g53tQ5R7lgJGqgVdVMH0I8qa

// Llama otra vez con la misma contraseña → hash DIFERENTE (salt aleatorio)
String otrohash = encoder.encode("pass123");
// → $2a$10$SomeOtherHashBecauseTheSaltIsRandom...

// Al verificar en cada login (operación lenta, ~100ms)
boolean ok = encoder.matches("pass123", hash);  // true
boolean ko = encoder.matches("malpass", hash);  // false
```

### Anatomía de un hash BCrypt

```
$2a$10$gT.PsFi3xTq9xc3virQAfesYBesY5g53tQ5R7lgJGqgVdVMH0I8qa
 │   │  │                  │                               │
 │   │  └─ Salt (22 chars) └─ Hash de la contraseña (31 chars)
 │   └─ Cost factor: 2^10 = 1024 iteraciones
 └─ Versión del algoritmo BCrypt
```

---

## El cost factor: velocidad vs seguridad

BCrypt es **intencionalmente lento**. El cost factor controla cuántas iteraciones realiza:

| Cost | Iteraciones | Tiempo (~) | Uso |
|------|-------------|------------|-----|
| 4 | 16 | < 1ms | Tests automáticos |
| 10 | 1,024 | ~100ms | **Producción (defecto)** |
| 12 | 4,096 | ~400ms | Alta seguridad |
| 14 | 16,384 | ~1.5s | Máxima seguridad (lento para el usuario) |

**¿Por qué queremos que sea lento?**

Un atacante que roba la BD con hashes BCrypt no puede hacer fuerza bruta eficientemente:
- Con SHA-256 (rápido): puede probar ~10,000,000,000 contraseñas por segundo
- Con BCrypt cost=10: puede probar ~100 contraseñas por segundo

Para el usuario final, 100ms por login es imperceptible. Para un atacante, probar millones de contraseñas toma años.

---

## El salt: por qué cada hash es diferente

El salt es un valor aleatorio que se agrega a la contraseña antes de hashear:

```
Sin salt:
  "pass123" → siempre produce el mismo hash
  Si dos usuarios tienen la misma contraseña → mismo hash en la BD
  → Un atacante puede usar tablas arcoíris (rainbow tables) precomputadas

Con salt (BCrypt):
  "pass123" + salt1 → hash1
  "pass123" + salt2 → hash2 (completamente diferente)
  El salt se guarda dentro del propio hash ($2a$10$SALT_AQUI...)
  → Las rainbow tables no funcionan porque cada hash tiene su propio salt
```

**Consecuencia práctica:** No puedes comparar dos hashes BCrypt directamente. Solo puedes verificar con `encoder.matches(password, hash)`.

---

## Flujo completo de verificación en Spring Security

```
Cliente envía:
  Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz

Spring Security:
  1. Decodifica Base64
     → email = "ana.garcia@empresa.com", password = "user123"

  2. Llama a CustomUserDetailsService.loadUserByUsername("ana.garcia@empresa.com")
     → Consulta la BD → devuelve UserDetails con hash BCrypt

  3. Compara con BCryptPasswordEncoder.matches("user123", hashDeLaBD)
     → true → autentica al usuario
     → false → devuelve 401 Unauthorized

(Spring Security hace la comparación automáticamente.
 Tú nunca llamas a encoder.matches() manualmente para el login.)
```

---

## Comparativa de algoritmos

| Algoritmo | Seguridad | Velocidad | ¿Usar en producción? |
|-----------|-----------|-----------|----------------------|
| Texto plano | ❌ Crítico | ⚡⚡⚡ | ❌ Nunca |
| MD5 | ❌ Roto | ⚡⚡⚡ | ❌ Nunca |
| SHA-1 | ❌ Roto | ⚡⚡⚡ | ❌ Nunca |
| SHA-256 sin salt | ⚠️ Vulnerable | ⚡⚡⚡ | ❌ No (rainbow tables) |
| SHA-256 + salt | ⚠️ Aceptable | ⚡⚡ | ⚠️ Solo si BCrypt no está disponible |
| **BCrypt** | ✅ Excelente | 🐢 Lento intencional | ✅ **SÍ (esta lección)** |
| Argon2 | ✅✅ Superior | 🐢🐢 Muy lento | ✅ Para máxima seguridad |

**Recomendación:** BCrypt para proyectos Spring Boot estándar. Es el estándar de la industria y Spring Security lo soporta nativamente.

---

## Reglas de oro

1. **Nunca** guardes contraseñas en texto plano — ni en la BD, ni en logs, ni en variables de entorno
2. **Nunca** construyas tu propio algoritmo de hashing — usa BCrypt o Argon2
3. **Siempre** usa `encoder.matches()` para comparar — nunca `hashAlmacenado.equals(hashNuevo)`
4. **Siempre** hashea en el backend — nunca confíes en un hash enviado desde el cliente
5. **Nunca** pongas el `PasswordEncoder` en el `CustomUserDetailsService` — ponlo en `SecurityConfig` como `@Bean` para evitar dependencias circulares



<!-- START OF FILE: docs_lessons_16-spring-security_06_troubleshooting.md -->
# Documento: docs lessons 16-spring-security 06 troubleshooting
---
# Lección 16 — Troubleshooting

Errores más frecuentes al implementar Spring Security con base de datos.

---

## Error 1: `401 Unauthorized` aunque las credenciales son correctas

**Síntoma:** Envías el header `Authorization: Basic ...` pero recibes 401.

**Causa más común:** El Base64 está mal generado.

**Diagnóstico:**
```bash
# Genera el Base64 correcto en la terminal
echo -n "admin@empresa.com:pass123" | base64
# → YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==

# Si tu sistema añade un salto de línea al final, el Base64 será incorrecto.
# El flag -n evita eso. En Windows (PowerShell):
[Convert]::ToBase64String([System.Text.Encoding]::UTF8.GetBytes("admin@empresa.com:pass123"))
```

**Otras causas:**
1. La contraseña en la BD no corresponde al hash BCrypt del texto que usas
2. El email no existe en la BD
3. El campo `password` del usuario es `null` o vacío
4. La migración V6 no se ejecutó y los usuarios no tienen contraseña
5. `active=false`, por lo que Spring Security considera el usuario deshabilitado
6. Falta `UserRepository.findByEmail(email)` o no está siendo usado por `CustomUserDetailsService`

**Verificación:**
```sql
-- Comprueba que los usuarios tienen password en la BD
SELECT email, role, active, LEFT(password, 20) AS password_preview FROM users;
-- Debe mostrar: $2a$10$... en la columna password
```

---

## Error 2: `403 Forbidden` aunque estoy autenticado

**Síntoma:** El login funciona (no es 401), pero el endpoint devuelve 403.

**Causa:** El rol del usuario no tiene permiso para ese endpoint.

**Diagnóstico:**
```bash
# Verifica el rol del usuario con:
# GET /auth/me (si lo implementaste) o consultando la BD directamente:
SELECT email, role FROM users WHERE email = 'ana.garcia@empresa.com';
```

**Verifica en `SecurityConfig`:**
```java
// ¿Está el rol del usuario en la regla correcta?
.requestMatchers(HttpMethod.DELETE, "/tickets/by-id/**").hasRole("ADMIN")
// → USER y AGENT reciben 403. Solo ADMIN puede eliminar.
```

**Verifica cómo construyes los roles:**
```java
// Opción recomendada en el guion: Spring agrega ROLE_ automáticamente.
.roles(user.getRole().name())

// Alternativa válida: tú agregas ROLE_ manualmente.
.authorities("ROLE_" + user.getRole().name())

// Incorrecto si luego usas hasRole("ADMIN"):
.authorities(user.getRole().name())
```

---

## Error 3: El compilador falla con `user.getRole()` — tipo incorrecto

**Síntoma:** Error de compilación en `CustomUserDetailsService`:
```
error: incompatible types: Role cannot be converted to String
```

**Causa:** El campo `role` en `User` es un **enum** (`Role`), no un `String`.

**Solución:** Llamar a `.name()` para convertir el enum a String:
```java
// ❌ INCORRECTO
.roles(user.getRole())

// ✅ CORRECTO
.roles(user.getRole().name())
// user.getRole() → Role.ADMIN (enum)
// .name()         → "ADMIN"  (String)
```

---

## Error 4: Los endpoints GET también requieren autenticación

**Síntoma:** `GET /tickets` devuelve 401 en lugar de 200.

**Causa:** Falta la regla `permitAll()` en `SecurityConfig`, o las reglas están en el orden incorrecto.

**Solución:**
```java
// En filterChain(), las reglas se evalúan en orden. El GET debe ir ANTES de anyRequest():
http.authorizeHttpRequests(auth -> auth
    .requestMatchers(HttpMethod.GET, "/tickets", "/tickets/by-id/**").permitAll()  // ← PRIMERO
    .requestMatchers(HttpMethod.GET, "/categories", "/categories/by-id/**").permitAll()
    // ... otras reglas ...
    .anyRequest().authenticated()   // ← SIEMPRE al final
);
```

> Si `.anyRequest().authenticated()` estuviera antes de las reglas `permitAll()`, Spring Security nunca llegaría a evaluarlas.

---

## Error 5: `NullPointerException` en `loadUserByUsername`

**Síntoma:**
```
java.lang.NullPointerException: Cannot invoke "cl.duoc.fullstack.tickets.model.User$Role.name()"
because the return value of "User.getRole()" is null
```

**Causa:** Un usuario en la BD tiene el campo `role` como `NULL`.

**Solución:**
```sql
-- Verifica usuarios sin rol asignado
SELECT id, email, role FROM users WHERE role IS NULL;

-- Corrige con un UPDATE
UPDATE users SET role = 'USER' WHERE role IS NULL;
```

También puedes agregar el filtro en el servicio:
```java
User user = userRepository.findByEmail(email)
    .filter(u -> u.getPassword() != null && !u.getPassword().isBlank())
    .filter(u -> u.getRole() != null)   // ← Previene NullPointerException
    .orElseThrow(() -> new UsernameNotFoundException("..."));
```

---

## Error 6: Spring Security no encontró `UserDetailsService`

**Síntoma:**
```
java.lang.IllegalStateException: No AuthenticationProvider found for
org.springframework.security.authentication.UsernamePasswordAuthenticationToken
```

**Causa:** `CustomUserDetailsService` no está siendo detectado por Spring.

**Verificación:**
1. ¿Tiene la anotación `@Service`?
   ```java
   @Service   // ← obligatorio
   public class CustomUserDetailsService implements UserDetailsService {
   ```
2. ¿Está en un paquete que Spring escanea? El paquete `config` dentro del paquete base de la aplicación está escaneado automáticamente.
3. ¿Hay más de una clase que implementa `UserDetailsService`? Spring no sabe cuál usar.

---

## Error 7: `@PreAuthorize` no funciona (siempre pasa o siempre falla)

**Síntoma:** La anotación `@PreAuthorize("hasRole('ADMIN')")` es ignorada.

**Causa:** Falta `@EnableMethodSecurity` en `SecurityConfig`.

**Solución:**
```java
@Configuration
@EnableWebSecurity
@EnableMethodSecurity   // ← Agrega esto para habilitar @PreAuthorize
public class SecurityConfig {
    // ...
}
```

---

## Error 8: Rutas con context-path no matchean

**Síntoma:** Las reglas de `SecurityConfig` no se aplican; todos los endpoints quedan sin protección o todos quedan bloqueados.

**Causa:** Incluir el context-path (`/ticket-app`) en las rutas de `requestMatchers`.

**Solución:** Los `requestMatchers` se escriben **sin** el context-path. Spring Security evalúa la ruta después de que el context-path es procesado:

```java
// ❌ INCORRECTO: incluye el context-path
.requestMatchers(HttpMethod.GET, "/ticket-app/tickets").permitAll()

// ✅ CORRECTO: solo la ruta del endpoint
.requestMatchers(HttpMethod.GET, "/tickets", "/tickets/by-id/**").permitAll()
```

El `context-path` se configura en `application.yml`:
```yaml
server:
  servlet:
    context-path: /ticket-app  # Spring Security no lo ve en requestMatchers
```

---

## Error 9: POST devuelve 403 aunque tengo rol correcto (CSRF)

**Síntoma:** GET funciona con autenticación, pero POST/PUT/DELETE devuelve 403 con el cuerpo:
```json
{"error": "Forbidden", "message": "...CSRF..."}
```

**Causa:** La protección CSRF está habilitada (es el comportamiento por defecto).

**Solución:** Deshabilitarla explícitamente en `SecurityConfig`:
```java
http
    .csrf(csrf -> csrf.disable())   // ← Agregar esto
    // ... resto de la configuración
```

> **¿Por qué deshabilitamos CSRF?** Las API REST STATELESS no usan cookies de sesión, por lo que la protección CSRF no aplica. CSRF solo es necesario en aplicaciones web que usan sesiones (formularios HTML).

---

## Error 10: `DataInitializer` duplica los datos en MySQL

**Síntoma:** La BD MySQL tiene el doble de usuarios esperados — los de la migración V6 y los del `DataInitializer`.

**Causa:** `DataInitializer` no tiene `@Profile("h2")` y se ejecuta en todos los perfiles.

**Solución:**
```java
@Component
@Profile("h2")   // ← Solo para H2; MySQL y Supabase usan las migraciones Flyway
public class DataInitializer implements CommandLineRunner {
    // ...
}
```

Después de agregar `@Profile("h2")`, con perfil MySQL el `DataInitializer` no se ejecuta y los datos solo vienen de las migraciones V5 y V6.

---

## Error 11: Error de dependencia circular con `PasswordEncoder`

**Síntoma:** La aplicación no arranca y muestra un error de ciclo de dependencias entre configuración, servicios y seguridad.

**Causa común:** Crear o inyectar dependencias de seguridad en lugares incorrectos, por ejemplo intentar construir el encoder dentro de `CustomUserDetailsService` o declarar beans duplicados.

**Solución:** Declara un único bean `PasswordEncoder`, normalmente en `SecurityConfig`, e inyéctalo solo donde necesites generar hashes, como `DataInitializer`.

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
```

`CustomUserDetailsService` no necesita inyectar `PasswordEncoder`. Solo debe cargar el usuario y entregar a Spring Security el hash guardado.

---

## Error 12: H2 funciona, pero MySQL/PostgreSQL no autentica

**Síntoma:** Con H2 puedes autenticar, pero con otro perfil recibes `401`.

**Causas probables:**

1. Flyway no ejecutó la migración que agrega `password`.
2. Los usuarios de la BD externa no tienen hash BCrypt.
3. El seed de datos de H2 no existe en MySQL/PostgreSQL.
4. Estás probando contra una base de datos antigua sin la columna `active` o sin roles válidos.

**Verificación:**

```sql
SELECT email, role, active, password FROM users;
```

La columna `password` debe contener valores que comiencen con `$2a$`, `$2b$` o `$2y$`.

---

## Error 13: `@ticketSecurity` no se encuentra

**Síntoma:** La aplicación falla al evaluar `@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")`.

**Causa:** El bean no existe con el nombre `ticketSecurity` o está fuera del paquete escaneado por Spring.

**Solución:** Declara el componente con nombre explícito dentro del paquete base de la aplicación:

```java
@Component("ticketSecurity")
public class TicketSecurity {
    // ...
}
```

---

## Error 14: USER o AGENT siempre reciben `403` al editar

**Síntoma:** El usuario está autenticado, tiene rol `USER` o `AGENT`, pero `PUT /tickets/by-id/{id}` siempre devuelve `403`.

**Causas probables:**

1. El ticket no existe y `ticketRepository.findById(id)` retorna vacío.
2. El ticket no tiene `createdBy` o `assignedTo`.
3. `authentication.getName()` no coincide con el email guardado en `createdBy.email` o `assignedTo.email`.
4. El usuario tiene una authority mal construida, por ejemplo `USER` en vez de `ROLE_USER`.
5. El `@PathVariable` se llama distinto y la expresión SpEL usa `#id`.

**Verificación:**

```sql
SELECT t.id, creator.email AS created_by, agent.email AS assigned_to
FROM tickets t
LEFT JOIN users creator ON creator.id = t.created_by_id
LEFT JOIN users agent ON agent.id = t.assigned_to_id
WHERE t.id = 1;
```

Y revisa que el método tenga el mismo nombre de parámetro usado por SpEL:

```java
@PutMapping("/by-id/{id}")
@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")
public ResponseEntity<Object> updateTicketById(@PathVariable Long id, ...) {
    // ...
}
```

---

## Error 15: ADMIN recibe `403` al editar tickets

**Síntoma:** Un usuario ADMIN autenticado no puede editar tickets.

**Causa:** `TicketSecurity` no está reconociendo la authority `ROLE_ADMIN`.

**Solución:** Verifica que `CustomUserDetailsService` construya roles con `.roles(user.getRole().name())` o authorities con el prefijo completo:

```java
.roles(user.getRole().name())
```

También verifica que el usuario admin tenga `role = 'ADMIN'` en la base de datos.



<!-- START OF FILE: docs_lessons_16-spring-security_07_checklist_rubrica_minima.md -->
# Documento: docs lessons 16-spring-security 07 checklist rubrica minima
---
# Lección 16 — Checklist y Rúbrica Mínima

## ✅ Checklist antes de entregar

### Dependencia y compilación
- [ ] `pom.xml` incluye `spring-boot-starter-security`
- [ ] El proyecto compila sin errores (`mvnw.cmd clean install`)

### Entidad y Base de Datos
- [ ] `User.java` tiene campo `password` anotado con `@Column(length = 255)` — nullable
- [ ] `User.java` tiene campo `role` como **enum** (`Role.USER`, `Role.AGENT`, `Role.ADMIN`) con `@Enumerated(EnumType.STRING)`
- [ ] `User.java` tiene campo `active` con valor por defecto `true`
- [ ] Migración V5 (`V5__lesson_16_add_password_to_users.sql`) — agrega columna `password` con `ALTER TABLE`
- [ ] Migración V6 (`V6__lesson_16_seed_users_with_auth.sql`) — inserta 3 usuarios con hashes BCrypt reales (no placeholders)
- [ ] `DataInitializer` tiene `@Profile("h2")` para no ejecutarse en MySQL/Supabase
- [ ] `DataInitializer` inyecta `PasswordEncoder` y llama a `passwordEncoder.encode()`

### Autenticación
- [ ] `CustomUserDetailsService.java` existe en el paquete `config/`
- [ ] Implementa `UserDetailsService` con `@Service`
- [ ] `loadUserByUsername` usa `UserRepository.findByEmail(email)`
- [ ] Filtra usuarios sin contraseña (`!= null && !isBlank()`)
- [ ] Construye roles con `.roles(user.getRole().name())` o authorities con `"ROLE_" + user.getRole().name()`
- [ ] Usa `.disabled(!user.isActive())` para bloquear usuarios inactivos
- [ ] `PasswordEncoder` declarado como `@Bean` y usando `BCryptPasswordEncoder`
- [ ] `httpBasic(Customizer.withDefaults())` está habilitado
- [ ] La autenticación funciona: POST con credenciales correctas → no es 401

### Autorización
- [ ] `SecurityConfig.java` existe en el paquete `config/`
- [ ] Tiene `@Configuration`, `@EnableWebSecurity`, `@EnableMethodSecurity`
- [ ] Tiene `SessionCreationPolicy.STATELESS`
- [ ] `csrf(csrf -> csrf.disable())` incluido
- [ ] GET `/tickets` y `/tickets/by-id/**` son `permitAll()`
- [ ] GET `/categories`, `/tags`, `/users` son `permitAll()`
- [ ] POST `/tickets` y PUT `/tickets/by-id/**` requieren `hasAnyRole("USER", "AGENT", "ADMIN")` como regla general
- [ ] DELETE `/tickets/by-id/**` requiere `hasRole("ADMIN")`
- [ ] Si se usa `@PreAuthorize`, `@EnableMethodSecurity` está presente
- [ ] Existe bean `TicketSecurity` con `@Component("ticketSecurity")`
- [ ] `PUT /tickets/by-id/{id}` usa `@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")`
- [ ] `TicketSecurity` permite a USER editar solo tickets donde `createdBy.email` coincide con `authentication.name`
- [ ] `TicketSecurity` permite a AGENT editar solo tickets donde `assignedTo.email` coincide con `authentication.name`
- [ ] `TicketSecurity` permite a ADMIN editar cualquier ticket

### Pruebas funcionales
- [ ] `GET /tickets` sin auth → `200 OK`
- [ ] `POST /tickets` sin auth → `401 Unauthorized`
- [ ] `POST /tickets` con USER → `201 Created`
- [ ] `POST /tickets` con AGENT → `201 Created`
- [ ] `PUT /tickets/by-id/{id}` con USER creador → `200 OK`
- [ ] `PUT /tickets/by-id/{id}` con USER no creador → `403 Forbidden`
- [ ] `PUT /tickets/by-id/{id}` con AGENT asignado → `200 OK`
- [ ] `PUT /tickets/by-id/{id}` con AGENT no asignado → `403 Forbidden`
- [ ] `DELETE /tickets/by-id/{id}` con USER → `403 Forbidden`
- [ ] `DELETE /tickets/by-id/{id}` con ADMIN → `204 No Content`
- [ ] Usuario `active=false` → `401 Unauthorized`

---

## 🎓 Rúbrica de Evaluación

### Entidad y Migración (20 pts)

| Criterio | Pts | Evidencia |
|----------|-----|-----------|
| Campo `password` en `User.java` (`@Column`, nullable) | 5 | Campo presente con anotación correcta |
| Campo `role` como enum con tres valores | 3 | `Role.USER`, `Role.AGENT`, `Role.ADMIN` |
| Migración V5 agrega columna `password` | 5 | Archivo `V5__lesson_16_add_password_to_users.sql` con `ALTER TABLE` |
| Migración V6 inserta usuarios con hashes BCrypt reales | 7 | Hashes con formato `$2a$10$...`, no texto plano ni placeholders |

### Autenticación (25 pts)

| Criterio | Pts | Evidencia |
|----------|-----|-----------|
| `CustomUserDetailsService` implementa `UserDetailsService` | 5 | `implements UserDetailsService` + `@Service` |
| `loadUserByUsername` carga usuario desde `UserRepository` | 10 | Usa `userRepository.findByEmail(email)` |
| Rol usa `.name()` para el enum | 5 | `.roles(user.getRole().name())` o `"ROLE_" + user.getRole().name()` |
| Login funciona con credenciales de la BD | 5 | POST con auth correcta → no es 401 |

### Autorización (25 pts)

| Criterio | Pts | Evidencia |
|----------|-----|-----------|
| GET endpoints son públicos (`permitAll`) | 5 | GET sin auth → 200 OK |
| POST `/tickets` permite USER y AGENT | 5 | USER → 201; AGENT → 201 |
| PUT aplica propiedad/asignación | 8 | USER propio → 200; USER ajeno → 403; AGENT asignado → 200; AGENT no asignado → 403 |
| DELETE solo para ADMIN | 7 | USER → 403; AGENT → 403; ADMIN → 204 |
| `SessionCreationPolicy.STATELESS` configurado | 5 | Presente en `SecurityConfig` |

### Seguridad (15 pts)

| Criterio | Pts | Evidencia |
|----------|-----|-----------|
| `PasswordEncoder` es `BCryptPasswordEncoder` | 5 | Bean declarado en `SecurityConfig` |
| Contraseñas almacenadas como hash | 5 | BD y migraciones guardan hashes BCrypt, no texto plano |
| `csrf(csrf -> csrf.disable())` incluido | 5 | POST/PUT/DELETE no devuelven 403 por CSRF |

### Documentación (15 pts)

| Criterio | Pts | Evidencia |
|----------|-----|-----------|
| README o comentarios explican los roles y credenciales | 8 | Email, contraseña y rol de cada usuario documentados |
| Explica flujo de autenticación | 7 | Descripción: email → `CustomUserDetailsService` → BD → BCrypt |

---

## 🚩 Red Flags (Falla automática)

- ❌ Contraseñas almacenadas en texto plano en la BD o en migraciones SQL
- ❌ GET endpoints requieren autenticación (rompe la especificación)
- ❌ `CustomUserDetailsService` no existe (usa `InMemoryUserDetailsManager` u otro)
- ❌ El campo `password` no está en la entidad `User`
- ❌ `csrf(csrf -> csrf.disable())` ausente (POST/PUT/DELETE fallan con 403)
- ❌ El proyecto no compila
- ❌ `user.getRole()` sin `.name()` en `UserDetails` → error de compilación o roles incorrectos
- ❌ Migración V6 con hashes en texto plano o con placeholder `$2a$10$...hash...`
- ❌ USER puede editar tickets creados por otro usuario
- ❌ AGENT puede editar tickets que no tiene asignados

**Total: 100 puntos**



<!-- START OF FILE: docs_lessons_16-spring-security_08_actividad_individual.md -->
# Documento: docs lessons 16-spring-security 08 actividad individual
---
# Lección 16 — Actividad Individual

## Objetivo

Proteger tu API REST de Tickets con autenticación basada en base de datos, autorización por roles y autorización por datos del ticket, usando Spring Security y Flyway.

> **Conexión con Lecciones 10–15:** En lecciones anteriores creaste la entidad `User` con JPA y migraciones Flyway. En esta actividad extenderás esa entidad para soportar autenticación real: los usuarios se cargarán desde la base de datos, con contraseñas guardadas como hashes BCrypt.

---

## Tabla de permisos esperada

| Endpoint | Método | Sin auth | USER | AGENT | ADMIN |
|----------|--------|:--------:|:----:|:-----:|:-----:|
| `/tickets` | GET | ✅ 200 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets/by-id/{id}` | GET | ✅ 200 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets` | POST | ❌ 401 | ✅ 201 | ✅ 201 | ✅ 201 |
| `/tickets/by-id/{id}` propio/asignado | PUT | ❌ 401 | ✅ 200 | ✅ 200 | ✅ 200 |
| `/tickets/by-id/{id}` ajeno/no asignado | PUT | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 200 |
| `/tickets/by-id/{id}` | DELETE | ❌ 401 | ❌ 403 | ❌ 403 | ✅ 204 |

---

## Instrucciones paso a paso

### Paso 1: Agregar dependencia

En `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

### Paso 2: Actualizar `User.java`

La entidad debe tener el campo `password`, el rol como enum y el campo `active`:

```java
@Column(length = 255)
private String password;   // BCrypt hash; nullable para usuarios sin acceso al sistema

@Enumerated(EnumType.STRING)
@Column(nullable = false, length = 20)
private Role role = Role.USER;

@Column(nullable = false)
private boolean active = true;

public enum Role {
    USER,
    AGENT,
    ADMIN
}
```

> Si tu entidad ya tiene `role` como `String`, migra a enum: es más seguro y evita valores inválidos.

### Paso 3: Crear migración para la columna `password`

Archivo: `V{n}__lesson_16_add_password_to_users.sql`

```sql
-- Agrega columna password a la tabla users para Spring Security
ALTER TABLE users ADD COLUMN password VARCHAR(255);
```

Donde `{n}` es el número que sigue a tu última migración existente.

### Paso 4: Crear migración seed con hashes BCrypt

Archivo: `V{n+1}__lesson_16_seed_users_with_auth.sql`

Los hashes a continuación corresponden a las contraseñas `pass123` y `user123`. Puedes generar los tuyos con:

```java
// Ejecuta esto una vez para generar tus propios hashes:
System.out.println(new BCryptPasswordEncoder(10).encode("tu_contraseña"));
```

```sql
-- Seed de usuarios con contraseñas BCrypt (cost factor 10)
-- admin@empresa.com  → pass123
-- ana.garcia@empresa.com → user123
-- carlos.lopez@empresa.com → user123
INSERT INTO users (name, email, role, active, password) VALUES
  ('Administrador',  'admin@empresa.com',         'ADMIN', true,
   '$2a$10$gT.PsFi3xTq9xc3virQAfesYBesY5g53tQ5R7lgJGqgVdVMH0I8qa'),
  ('Ana Garcia',     'ana.garcia@empresa.com',     'USER',  true,
   '$2a$10$LAK58ME84bgotvy2eL.eWeobSCHMDsaD3BajXq/swyevMwfw8PW/m'),
  ('Carlos Lopez',   'carlos.lopez@empresa.com',   'AGENT', true,
   '$2a$10$LAK58ME84bgotvy2eL.eWeobSCHMDsaD3BajXq/swyevMwfw8PW/m');
```

> **No uses placeholders.** Los hashes deben ser valores BCrypt reales. Puedes usar los de arriba (que ya están verificados) o generar los tuyos propios.

### Paso 5: Actualizar `DataInitializer` para H2

Agrega `@Profile("h2")` e inyecta `PasswordEncoder`:

```java
@Component
@Profile("h2")   // Solo corre con H2; MySQL/Supabase usan la migración Flyway
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            User admin = new User();
            admin.setName("Administrador");
            admin.setEmail("admin@empresa.com");
            admin.setPassword(passwordEncoder.encode("pass123"));
            admin.setRole(User.Role.ADMIN);
            admin.setActive(true);
            userRepository.save(admin);

            User ana = new User();
            ana.setName("Ana Garcia");
            ana.setEmail("ana.garcia@empresa.com");
            ana.setPassword(passwordEncoder.encode("user123"));
            ana.setRole(User.Role.USER);
            ana.setActive(true);
            userRepository.save(ana);

            User carlos = new User();
            carlos.setName("Carlos Lopez");
            carlos.setEmail("carlos.lopez@empresa.com");
            carlos.setPassword(passwordEncoder.encode("user123"));
            carlos.setRole(User.Role.AGENT);
            carlos.setActive(true);
            userRepository.save(carlos);
        }
    }
}
```

### Paso 6: Crear `CustomUserDetailsService`

Archivo: `src/main/java/.../config/CustomUserDetailsService.java`

```java
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
            .filter(u -> u.getPassword() != null && !u.getPassword().isBlank())
            .orElseThrow(() -> new UsernameNotFoundException(
                "Usuario no encontrado o sin contraseña: " + email));

        return org.springframework.security.core.userdetails.User
            .withUsername(user.getEmail())
            .password(user.getPassword())
            .roles(user.getRole().name())
            .disabled(!user.isActive())
            .build();
    }
}
```

> **Recuerda:** `user.getRole()` devuelve el enum. Llama a `.name()` para obtener `USER`, `AGENT` o `ADMIN`. El builder `.roles(...)` agrega internamente el prefijo `ROLE_`.

### Paso 7: Crear `SecurityConfig`

Archivo: `src/main/java/.../config/SecurityConfig.java`

```java
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET, "/tickets", "/tickets/by-id/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/tickets").hasAnyRole("USER", "AGENT", "ADMIN")
                .requestMatchers(HttpMethod.PUT, "/tickets/by-id/**").hasAnyRole("USER", "AGENT", "ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/tickets/by-id/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

> `CustomUserDetailsService` está anotado con `@Service`, así que Spring lo detecta automáticamente. No necesitas declararlo como bean aquí.

### Paso 8: Restringir edición por propietario/asignado

`PUT /tickets/by-id/{id}` debe aplicar una regla más fina que solo rol:

- `USER` solo edita tickets donde `createdBy.email` coincide con el usuario autenticado.
- `AGENT` solo edita tickets donde `assignedTo.email` coincide con el usuario autenticado.
- `ADMIN` edita cualquier ticket.

Crea `config/TicketSecurity.java`:

```java
package cl.duoc.fullstack.tickets.config;

import cl.duoc.fullstack.tickets.model.Ticket;
import cl.duoc.fullstack.tickets.respository.TicketRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component("ticketSecurity")
public class TicketSecurity {

    private final TicketRepository ticketRepository;

    public TicketSecurity(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public boolean canEdit(Long ticketId, Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return false;
        }

        if (hasRole(authentication, "ROLE_ADMIN")) {
            return true;
        }

        String email = authentication.getName();

        return ticketRepository.findById(ticketId)
            .map(ticket -> canEditTicket(ticket, email, authentication))
            .orElse(false);
    }

    private boolean canEditTicket(Ticket ticket, String email, Authentication authentication) {
        if (hasRole(authentication, "ROLE_USER")) {
            return ticket.getCreatedBy() != null
                && email.equals(ticket.getCreatedBy().getEmail());
        }

        if (hasRole(authentication, "ROLE_AGENT")) {
            return ticket.getAssignedTo() != null
                && email.equals(ticket.getAssignedTo().getEmail());
        }

        return false;
    }

    private boolean hasRole(Authentication authentication, String role) {
        return authentication.getAuthorities().stream()
            .anyMatch(authority -> authority.getAuthority().equals(role));
    }
}
```

Anota el método de actualización en `TicketController`:

```java
@PutMapping("/by-id/{id}")
@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")
public ResponseEntity<Object> updateTicketById(
    @PathVariable Long id,
    @Valid @RequestBody TicketRequest request) {
    // implementación existente
}
```

### Paso 9: Testear con Postman/Thunder Client

Usa el modo **Basic Auth** de Postman (pestaña Authorization → Type: Basic Auth) o el header manual:

| Email | Contraseña | Rol | Base64 |
|-------|-----------|-----|--------|
| admin@empresa.com | pass123 | ADMIN | `YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==` |
| ana.garcia@empresa.com | user123 | USER | `YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz` |
| carlos.lopez@empresa.com | user123 | AGENT | `Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=` |

#### Test 1: GET sin auth → debe ser 200
```
GET http://localhost:8080/ticket-app/tickets
```

#### Test 2: POST sin auth → debe ser 401
```
POST http://localhost:8080/ticket-app/tickets
Content-Type: application/json

{ "title": "Test", "description": "test" }
```

#### Test 3: POST con USER → debe ser 201
```
POST http://localhost:8080/ticket-app/tickets
Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
Content-Type: application/json

{ "title": "Test User", "description": "test" }
```

#### Test 4: POST con AGENT → debe ser 201
```
POST http://localhost:8080/ticket-app/tickets
Authorization: Basic Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=
Content-Type: application/json

{ "title": "Test Agent", "description": "test" }
```

#### Test 5: DELETE con USER → debe ser 403
```
DELETE http://localhost:8080/ticket-app/tickets/by-id/1
Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
```

#### Test 6: DELETE con ADMIN → debe ser 204
```
DELETE http://localhost:8080/ticket-app/tickets/by-id/1
Authorization: Basic YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==
```

#### Test 7: PUT con USER creador → debe ser 200
```
PUT http://localhost:8080/ticket-app/tickets/by-id/{ticketCreadoPorAna}
Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
Content-Type: application/json

{ "title": "Editado por creador", "description": "test", "status": "OPEN" }
```

#### Test 8: PUT con USER no creador → debe ser 403
```
PUT http://localhost:8080/ticket-app/tickets/by-id/{ticketCreadoPorOtroUsuario}
Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
Content-Type: application/json

{ "title": "Intento ajeno", "description": "test", "status": "OPEN" }
```

#### Test 9: PUT con AGENT asignado → debe ser 200
```
PUT http://localhost:8080/ticket-app/tickets/by-id/{ticketAsignadoACarlos}
Authorization: Basic Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=
Content-Type: application/json

{ "title": "Editado por agente", "description": "test", "status": "IN_PROGRESS" }
```

#### Test 10: PUT con AGENT no asignado → debe ser 403
```
PUT http://localhost:8080/ticket-app/tickets/by-id/{ticketNoAsignadoACarlos}
Authorization: Basic Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=
Content-Type: application/json

{ "title": "Intento no asignado", "description": "test", "status": "IN_PROGRESS" }
```

---

## Desafío extra

1. **Endpoint de perfil:** `GET /auth/me` que devuelva el email y rol del usuario autenticado
2. **Respetar `active`:** Modifica `CustomUserDetailsService` para rechazar usuarios con `active = false` (usa `.disabled(!user.isActive())`)
3. **Agregar CORS:** Configura CORS en `SecurityConfig` para permitir peticiones desde `localhost:3000`
4. **Rol VIEWER:** Agrega un cuarto rol `VIEWER` que solo pueda hacer GET, ni POST ni PUT

---

## Checklist de entrega

- [ ] `User.java` tiene campo `password` (nullable) y `role` como enum con AGENT
- [ ] Migración Flyway agrega columna `password` a tabla `users`
- [ ] Migración Flyway seed inserta 3 usuarios con hashes BCrypt **reales**
- [ ] `DataInitializer` tiene `@Profile("h2")` e inyecta `PasswordEncoder`
- [ ] `CustomUserDetailsService` carga usuarios desde `UserRepository`
- [ ] `loadUserByUsername` usa `.name()` para convertir el enum a `String`
- [ ] `SecurityConfig` tiene `STATELESS`, `csrf.disable()` y `@EnableMethodSecurity`
- [ ] `PasswordEncoder` es `BCryptPasswordEncoder` declarado como `@Bean`
- [ ] GET `/tickets` y GET `/tickets/by-id/{id}` son públicos
- [ ] POST `/tickets` permite USER, AGENT y ADMIN
- [ ] PUT `/tickets/by-id/{id}` usa `@PreAuthorize("@ticketSecurity.canEdit(#id, authentication)")`
- [ ] USER solo puede editar tickets creados por él
- [ ] AGENT solo puede editar tickets asignados a él
- [ ] ADMIN puede editar cualquier ticket
- [ ] DELETE `/tickets/by-id/{id}` requiere ADMIN
- [ ] Los 10 tests pasan correctamente



<!-- START OF FILE: docs_lessons_16-spring-security_README.md -->
# Documento: docs lessons 16-spring-security README
---
# Lección 16 — Spring Security: Autenticación y Autorización

**Protege tu API REST con autenticación basada en base de datos y autorización por roles. Los usuarios se cargan desde MySQL/H2, las contraseñas se almacenan con BCrypt, y cada endpoint define quién puede acceder.**

---

## 📚 Contenidos

| Documento | Duración | Para |
|-----------|----------|------|
| **01. Objetivo y Alcance** | 5 min | Entender qué aprenderás |
| **02. Guión Paso a Paso** ⭐ | 25 min | Instrucciones prácticas |
| **03. Autenticación vs Autorización** | 10 min | Conceptos clave y arquitectura |
| **04. Ejemplos Avanzados** | 15 min | Código adicional listo para usar |
| **05. Cifrado de Contraseñas** | 10 min | BCrypt en detalle |
| **06. Troubleshooting** | 10 min | Errores frecuentes y soluciones |
| **07. Checklist** | 5 min | Verificación antes de entregar |
| **08. Actividad Individual** | — | Tu tarea |

---

## 🎯 Quick Start

### Concepto

- **Autenticación:** Verificar identidad (¿quién eres?) → 401 si falla
- **Autorización:** Verificar permisos (¿qué puedes hacer?) → 403 si falla

### Flujo con HTTP Basic Auth

```
Cliente → GET /tickets
        ← 200 OK (endpoint público, sin autenticación)

Cliente → POST /tickets (sin header Authorization)
        ← 401 Unauthorized

Cliente → POST /tickets
          Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
        ← 201 Created  (USER puede crear)

Cliente → DELETE /tickets/by-id/1
          Authorization: Basic YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz
        ← 403 Forbidden  (USER no puede eliminar)

Cliente → DELETE /tickets/by-id/1
          Authorization: Basic YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==
        ← 204 No Content  (ADMIN puede eliminar)
```

> **HTTP Basic Auth:** Las credenciales viajan codificadas en Base64 en el header `Authorization`. No hay endpoint `/login`; Spring Security intercepta cada petición automáticamente.

---

## Lo que construirás

1. Agregar `spring-boot-starter-security` al `pom.xml`
2. Actualizar `User.java`: campo `password` + enum `Role` (USER / AGENT / ADMIN)
3. Crear migración Flyway `V5` — agrega columna `password` a la tabla `users`
4. Crear migración Flyway `V6` — seed de 3 usuarios con hashes BCrypt
5. Completar `UserRepository.findByEmail` — el email será el username de Basic Auth
6. Crear `PasswordEncoder` — BCrypt para validar contraseñas hasheadas
7. Crear `CustomUserDetailsService` — carga usuarios desde la BD y expone roles
8. Crear `SecurityConfig` — HTTP Basic, sesión STATELESS y reglas por rol
9. Aplicar `@PreAuthorize` cuando la autorización pertenezca al caso de uso
10. Crear `TicketSecurity` — USER edita solo tickets propios; AGENT solo tickets asignados; ADMIN cualquiera
11. Testear: sin auth → 401; rol insuficiente → 403; credenciales correctas → 200/201/204

---

## Credenciales de prueba

| Email | Contraseña | Rol | Base64 para Basic Auth |
|-------|-----------|-----|------------------------|
| admin@empresa.com | pass123 | ADMIN | `YWRtaW5AZW1wcmVzYS5jb206cGFzczEyMw==` |
| ana.garcia@empresa.com | user123 | USER | `YW5hLmdhcmNpYUBlbXByZXNhLmNvbTp1c2VyMTIz` |
| carlos.lopez@empresa.com | user123 | AGENT | `Y2FybG9zLmxvcGV6QGVtcHJlc2EuY29tOnVzZXIxMjM=` |

---

## 🚀 Sigue el Guión

Comienza con **[02. Guión Paso a Paso](02_guion_paso_a_paso.md)** para instrucciones detalladas.

---

*Lección 16 de 18 — [← Volver a Lecciones](../)*



<!-- START OF FILE: docs_lessons_17-logging_01_objetivo_y_alcance.md -->
# Documento: docs lessons 17-logging 01 objetivo y alcance
---
# Lección 17 - Logging: ¿Qué vas a aprender?

## ¿De dónde venimos?

En Lección 16 implementaste autenticación. Ahora sabes quién accede a tu API.

El siguiente paso: registrar qué hace cada usuario (auditoría).

---

## ¿Qué vas a construir?

Al terminar, tu aplicación registrará:

```
[2026-04-16 14:32:10] INFO  cl.duoc.fullstack.tickets.service.TicketService - Ticket creado: #5 "Software falla"
[2026-04-16 14:33:45] INFO  cl.duoc.fullstack.tickets.service.TicketService - Ticket actualizado: #5, estado: NEW → IN_PROGRESS
[2026-04-16 14:35:22] INFO  cl.duoc.fullstack.tickets.service.TicketService - Ticket eliminado: #5 por admin
[2026-04-16 14:36:01] ERROR cl.duoc.fullstack.tickets.service.TicketService - Fallo al actualizar #999: no encontrado
```

### Niveles en tu aplicación

- **DEBUG:** Entrada/salida de métodos, valores de variables (solo dev)
- **INFO:** Eventos de negocio (create, update, delete, login)
- **WARN:** Situaciones inesperadas (usuario no encontrado, reintentos)
- **ERROR:** Excepciones (violación de validación, error de BD)

---

## ¿Qué NO cubre esta lección?

| Tema | Razón |
|------|-------|
| ELK Stack (Elasticsearch + Kibana) | Herramienta externa, nivel producción |
| Distributed Tracing | Requiere correlacion-id complejo |
| Logs centralizados (Splunk, DataDog) | Servicios pagos |
| Structured logging (JSON) | Nivel avanzado |
| Async logging (performance) | Optimización posterior |

El foco: **SLF4J + Logback básico**.

---

## Requerimientos

| ID | Requerimiento |
|----|---------------|
| **REQ-25** | Loguear creación de ticket (INFO level) |
| **REQ-26** | Loguear actualización de ticket (INFO level) |
| **REQ-27** | Loguear eliminación de ticket (INFO level) |
| **REQ-28** | Loguear errores con stack trace (ERROR level) |
| **REQ-29** | Nivel de log configurable por perfil (DEBUG en dev, INFO en prod) |

---

## Estructura antes vs después

```
Antes:
├── controller/TicketController.java
└── service/TicketService.java        (sin logs)

Después:
├── controller/TicketController.java
└── service/TicketService.java        (+ @Slf4j, logger.info/error)

Nuevos archivos:
├── logback-spring.xml                (configuración de logs)
├── logback-spring-dev.xml            (DEBUG para desarrollo)
└── logback-spring-prod.xml           (INFO para producción)
```



<!-- START OF FILE: docs_lessons_17-logging_02_guion_paso_a_paso.md -->
# Documento: docs lessons 17-logging 02 guion paso a paso
---
# Lección 17 - Tutorial paso a paso: Logging con SLF4J

## Paso 1: Entender SLF4J + Logback

Spring Boot incluye ambos por defecto. No necesitas agregar dependencias.

## Paso 2: Agregar @Slf4j en Service

En `TicketService.java`:

```java
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j  // ← Agrega logger automáticamente
public class TicketService {

    public Ticket create(Ticket ticket) {
        log.info("Creando ticket: '{}'", ticket.getTitle());
        
        boolean exists = this.repository.existsByTitle(ticket.getTitle());
        if (exists) {
            log.warn("Título duplicado: '{}'", ticket.getTitle());
            throw new IllegalArgumentException("Ya existe ticket con este título");
        }

        try {
            Ticket saved = this.repository.save(ticket);
            log.info("Ticket creado exitosamente: ID={}", saved.getId());
            return saved;
        } catch (Exception e) {
            log.error("Error al crear ticket", e);
            throw e;
        }
    }

    public Ticket updateById(Long id, Ticket ticket) {
        log.info("Actualizando ticket: ID={}", id);
        
        Ticket toUpdate = this.repository.getById(id);
        if (toUpdate == null) {
            log.warn("Ticket no encontrado: ID={}", id);
            return null;
        }

        try {
            toUpdate.setTitle(ticket.getTitle());
            toUpdate.setDescription(ticket.getDescription());
            this.repository.update(toUpdate);
            log.info("Ticket actualizado: ID={}", id);
            return toUpdate;
        } catch (Exception e) {
            log.error("Error al actualizar ticket: ID={}", id, e);
            throw e;
        }
    }

    public Ticket deleteById(Long id) {
        log.info("Eliminando ticket: ID={}", id);
        
        try {
            Ticket found = this.repository.deleteById(id);
            if (found != null) {
                log.info("Ticket eliminado exitosamente: ID={}", id);
            } else {
                log.warn("Ticket a eliminar no encontrado: ID={}", id);
            }
            return found;
        } catch (Exception e) {
            log.error("Error al eliminar ticket: ID={}", id, e);
            throw e;
        }
    }
}
```

## Paso 3: Configurar niveles en application.yml

```yaml
logging:
  level:
    root: INFO
    cl.duoc.fullstack.tickets: DEBUG
  pattern:
    console: "%d{HH:mm:ss.SSS} [%-5level] %logger{0} - %msg%n"
  file:
    name: logs/tickets.log
```

## Paso 4: Configurar por perfil

**application-dev.yml:**
```yaml
logging:
  level:
    root: DEBUG
    cl.duoc.fullstack.tickets: DEBUG
```

**application-prod.yml:**
```yaml
logging:
  level:
    root: INFO
    cl.duoc.fullstack.tickets: INFO
```

## Paso 5: Testear

```bash
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"
```

Salida esperada:
```
14:32:10.123 [INFO] TicketService - Ticket creado: ID=3
14:32:11.456 [DEBUG] TicketRepository - Guardando en lista: Ticket{id=3}
```



<!-- START OF FILE: docs_lessons_17-logging_03_logback_vs_serilog.md -->
# Documento: docs lessons 17-logging 03 logback vs serilog
---
# Lección 17 - Logback vs Serilog

## Comparativa

| Aspecto | Logback (Java) | Serilog (.NET) |
|---------|--------|--------|
| **Lenguaje** | Java | C# |
| **Formato default** | Texto plano | Structured (JSON) |
| **Integración Spring** | Nativa | No aplicable |
| **Almacenamiento** | Archivo + consola | Sink-based (múltiples destinos) |
| **Performance** | Bueno | Excelente |

## Logback (aquí usamos)

**Ventajas:**
- Integrado en Spring Boot
- Configuración XML/YAML simple
- Rotación de archivos automática

**Desventajas:**
- Logs en texto plano (difícil de parsear en prod)
- No es structured logging

## Serilog (alternativa para .NET)

**Ventajas:**
- Structured logging (JSON)
- Enrichment poderoso
- Sinks múltiples

**Desventajas:**
- Solo .NET
- Más complejo que Logback

## Cuándo cada uno

- **Logback:** Desarrollo, testing, aplicaciones Spring pequeñas
- **Serilog:** Aplicaciones .NET, especialmente con ELK Stack
- **JSON + ELK:** Producción con múltiples servicios

## Pattern en Logback

```yaml
logging:
  pattern:
    console: "%d{HH:mm:ss} [%-5level] %logger{36} - %msg%n"
    #       timestamp      level      class name      message
```

**Ejemplo de salida:**
```
14:32:10 [INFO ] TicketService - Ticket creado: #5
14:32:11 [DEBUG] TicketRepository - Guardando: Ticket{id=5}
```



<!-- START OF FILE: docs_lessons_17-logging_04_ejemplos_practicos.md -->
# Documento: docs lessons 17-logging 04 ejemplos practicos
---
# Lección 17 - Ejemplos prácticos

## Loguear en Controller

```java
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/tickets")
@Slf4j
public class TicketController {

    @GetMapping
    public List<Ticket> getAllTickets() {
        log.debug("GET /tickets solicitado");
        return this.service.getTickets();
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Ticket ticket) {
        log.info("POST /tickets - creando: {}", ticket.getTitle());
        try {
            Ticket created = this.service.create(ticket);
            log.info("Ticket creado exitosamente: ID={}", created.getId());
            return ResponseEntity.status(HttpStatus.CREATED).body("Ticket Creado");
        } catch (IllegalArgumentException e) {
            log.warn("Validación fallida: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ErrorResponse(e.getMessage()));
        }
    }

    @DeleteMapping("/by-id/{id}")
    public ResponseEntity<?> deleteTicketById(@PathVariable Long id) {
        log.info("DELETE /tickets/{} solicitado", id);
        try {
            Ticket found = this.service.deleteById(id);
            if (found != null) {
                log.info("Ticket eliminado: ID={}", id);
                return ResponseEntity.ok(found);
            }
            log.warn("Ticket a eliminar no encontrado: ID={}", id);
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            log.error("Error al eliminar ticket: ID={}", id, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
```

## Loguear excepciones

```java
// Captura y loguea con stack trace
try {
    service.delete(id);
} catch (IllegalArgumentException e) {
    log.error("Error de validación en delete: ID={}", id, e);  // ← e incluye stack trace
    throw e;
}

// Salida:
// 14:32:10 [ERROR] TicketService - Error de validación en delete: ID=999
// java.lang.IllegalArgumentException: Ticket no encontrado
//   at cl.duoc.fullstack.tickets.service.TicketService.deleteById(...)
//   ...
```

## Patrones útiles

```java
// Con más contexto
log.info("Usuario {} intenta eliminar ticket {}", username, id);

// Con condición (evita concatenación si no se loguea)
if (log.isDebugEnabled()) {
    log.debug("Variable compleja: {}", complexObject.toString());
}

// Con nivel apropiado
log.debug("Valor variable x={}", x);      // Dev only
log.info("Operación exitosa");            // Todos los ambientes
log.warn("Reintentando conexión BD");     // Situación inesperada
log.error("Excepción no capturada", e);   // Error crítico
```



<!-- START OF FILE: docs_lessons_17-logging_05_configuracion_per_perfil.md -->
# Documento: docs lessons 17-logging 05 configuracion per perfil
---
# Lección 17 - Configuración por perfil

**application.yml** (base):
```yaml
logging:
  pattern:
    console: "%d{HH:mm:ss.SSS} [%-5level] %logger{0} - %msg%n"
  file:
    name: logs/tickets.log
    max-size: 10MB
    max-history: 10
```

**application-dev.yml:**
```yaml
logging:
  level:
    root: DEBUG
    cl.duoc.fullstack.tickets: DEBUG
    org.springframework.web: DEBUG
    org.springframework.security: DEBUG
```

**application-prod.yml:**
```yaml
logging:
  level:
    root: WARN
    cl.duoc.fullstack.tickets: INFO
    org.springframework: WARN
  file:
    name: /var/log/tickets/tickets.log
    max-size: 100MB
    max-history: 30
```

## Explicación

- **root: DEBUG** (dev) — todo es verbose
- **root: WARN** (prod) — solo warnings y errores
- **cl.duoc.fullstack.tickets: DEBUG** — package específico es verbose
- **max-size: 100MB** — rotar cuando archivo alcanza 100MB
- **max-history: 30** — guardar últimos 30 días



<!-- START OF FILE: docs_lessons_17-logging_06_troubleshooting.md -->
# Documento: docs lessons 17-logging 06 troubleshooting
---
# Lección 17 - Troubleshooting

## Problema 1: Logs no aparecen en consola

**Causa:** Nivel de log muy alto.

**Solución:**
```yaml
logging:
  level:
    cl.duoc.fullstack.tickets: DEBUG  # Baja el nivel
```

## Problema 2: Demasiados logs (ruido)

**Causa:** Nivel DEBUG para librerías externas.

**Solución:**
```yaml
logging:
  level:
    root: WARN
    cl.duoc.fullstack.tickets: DEBUG
    org.springframework: WARN
    org.hibernate: WARN
```

## Problema 3: Archivo de log no se crea

**Causa:** Carpeta logs/ no existe o sin permisos.

**Solución:**
```bash
mkdir -p logs/
chmod 755 logs/
```

## Problema 4: Stack trace incompleto

**Causa:** Loguear sin pasar la excepción.

```java
// ❌ INCORRECTO
log.error("Error: " + e.getMessage());

// ✅ CORRECTO
log.error("Error", e);  // ← Incluye stack trace completo
```

## Problema 5: Performance degradada

**Causa:** Logueo síncrono + archivos lentos.

**Solución (avanzada):**
```xml
<!-- logback.xml -->
<appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
    <encoder>
        <pattern>...</pattern>
    </encoder>
    <rollingPolicy class="...">
        <fileNamePattern>logs/tickets-%d{yyyy-MM-dd}.%i.log</fileNamePattern>
    </rollingPolicy>
</appender>
```

## Problema 6: Logs de Security ausentes

**Causa:** Nivel de Spring Security muy alto.

**Solución:**
```yaml
logging:
  level:
    org.springframework.security: DEBUG
```



<!-- START OF FILE: docs_lessons_17-logging_07_checklist_rubrica_minima.md -->
# Documento: docs lessons 17-logging 07 checklist rubrica minima
---
# Lección 17 - Checklist y rúbrica

## Checklist

- [ ] @Slf4j agregado en TicketService
- [ ] @Slf4j agregado en TicketController
- [ ] log.info() en create(), updateById(), deleteById()
- [ ] log.error() captura excepciones con stack trace
- [ ] logging.level.root configurado en application.yml
- [ ] application-dev.yml con DEBUG
- [ ] application-prod.yml con INFO/WARN
- [ ] Logs aparecen en consola al ejecutar
- [ ] Archivo logs/tickets.log se crea

## Rúbrica (50 pts)

| Criterio | Pts |
|----------|-----|
| @Slf4j presente en Service y Controller | 10 |
| Mínimo 5 logs INFO en operaciones principales | 15 |
| log.error() captura excepciones | 10 |
| Configuración YAML por perfil | 10 |
| Archivo log se genera correctamente | 5 |

**Total: 50 puntos**

Red flags:
❌ Ningún @Slf4j presente
❌ Logs con System.out.println()
❌ Sin configuración YAML



<!-- START OF FILE: docs_lessons_17-logging_08_actividad_individual.md -->
# Documento: docs lessons 17-logging 08 actividad individual
---
# Lección 17 - Actividad individual

## Objetivo

Agregar logging completo a tu API de Tickets usando SLF4J + Logback.

---

## Requisitos

1. **Agregar @Slf4j** a TicketService y TicketController
2. **Loguear eventos principales:**
   - Ticket creado (INFO)
   - Ticket actualizado (INFO)
   - Ticket eliminado (INFO)
   - Error al crear/actualizar/eliminar (ERROR)
3. **Configurar niveles por perfil:**
   - Dev: DEBUG
   - Prod: INFO/WARN
4. **Generar archivo de log** en `logs/tickets.log`

---

## Instrucciones

### Paso 1: Agregar @Slf4j

En TicketService:
```java
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TicketService {
    // ...
}
```

### Paso 2: Loguear operaciones CRUD

```java
public Ticket create(Ticket ticket) {
    log.info("Creando ticket: '{}'", ticket.getTitle());
    // ... resto del código
    log.info("Ticket creado: ID={}", saved.getId());
    return saved;
}
```

### Paso 3: Configurar YAML

En application.yml:
```yaml
logging:
  level:
    cl.duoc.fullstack.tickets: DEBUG
  file:
    name: logs/tickets.log
```

### Paso 4: Testear

```bash
mvn spring-boot:run
# Crear, actualizar, eliminar un ticket
# Verificar: logs/tickets.log se generó
```

---

## Desafío extra

1. Agregar correlation-id para rastrear operaciones
2. Loguear quién realizó cada acción (desde Spring Security)
3. Crear dashboard con logs en tiempo real



<!-- START OF FILE: docs_lessons_17-logging_README.md -->
# Documento: docs lessons 17-logging README
---
# Lección 17 - Logging: Auditoría e Investigación

## El problema

Sin logs, cuando algo falla en producción no tienes pista de qué pasó.

```
Cliente: "Mi ticket desapareció"
Tú: "¿Quién lo eliminó? ¿Cuándo? ¿Accidentalmente?"
Sin logs: "No sé." 😕
```

Con logs:

```
[2026-04-16 10:34:22] INFO  TicketService - Ticket #5 creado por admin
[2026-04-16 10:45:15] INFO  TicketService - Ticket #5 asignado a maria
[2026-04-16 11:02:47] ERROR TicketService - Error al eliminar #5: acceso denegado (user)
```

---

## Quick Start

### Concepto

Logging = registrar eventos con:
- **Timestamp:** cuándo
- **Level:** importancia (DEBUG, INFO, WARN, ERROR)
- **Mensaje:** qué pasó

### Niveles (del menos al más grave)

```
DEBUG   → Detalles técnicos (valores de variables)
INFO    → Eventos importantes (create, update, delete)
WARN    → Advertencias (recurso no encontrado, retry)
ERROR   → Errores (excepción lanzada)
```

---

## Lo que construirás

1. Agregar SLF4J + Logback (ya incluidos en Spring Boot)
2. Loguear en `create()`, `updateById()`, `deleteById()`
3. Diferenciar niveles por perfil (DEBUG en dev, INFO en prod)
4. Ver logs en consola + guardar en archivo

---

## Lecturas recomendadas

- Lección 11: Perfiles (DEBUG vs INFO por ambiente)
- Lección 16: Spring Security (loguear quién accede)



<!-- START OF FILE: docs_lessons_18-global-exception-handling_01_objetivo_y_alcance.md -->
# Documento: docs lessons 18-global-exception-handling 01 objetivo y alcance
---
# Lección 18 - Global Exception Handling: ¿Qué vas a aprender?

## ¿De dónde venimos?

En Lección 17 aprendiste a loguear eventos. Ahora registras qué pasó, pero si una excepción inesperada ocurre, el cliente recibe un `500` genérico sin detalles.

---

## ¿Qué vas a construir?

Al terminar, tu API manejará automáticamente TODAS las excepciones:

```
POST /tickets con título vacío
    ↓
@Valid valida → MethodArgumentNotValidException
    ↓
GlobalExceptionHandler captura
    ↓
Respuesta: 400 + {"message": "Título no puede estar vacío"}
```

### Excepciones capturadas

- `IllegalArgumentException` → 400 Bad Request
- `ConstraintViolationException` → 400 Bad Request
- `MethodArgumentNotValidException` → 400 Bad Request
- `EntityNotFoundException` → 404 Not Found
- `BadCredentialsException` → 401 Unauthorized
- `AccessDeniedException` → 403 Forbidden
- `Exception` genérico → 500 Internal Server Error + log

---

## ¿Qué NO cubre?

| Tema | Razón |
|------|-------|
| Excepciones de Base de Datos | Llegan después de JPA avanzado |
| Custom exceptions propias | Nivel intermedio |
| Retry logic | Patrón avanzado |

El foco: **handler centralizado para excepciones comunes**.

---

## Requerimientos

| ID | Requerimiento |
|----|---------------|
| **REQ-30** | Crear GlobalExceptionHandler con @ControllerAdvice |
| **REQ-31** | Capturar IllegalArgumentException → 400 |
| **REQ-32** | Capturar MethodArgumentNotValidException → 400 |
| **REQ-33** | Capturar Exception genérico → 500 + log |
| **REQ-34** | Stack trace solo en dev, oculto en prod |
| **REQ-35** | Capturar BadCredentialsException → 401 |
| **REQ-36** | Capturar AccessDeniedException → 403 |

---

## Estructura antes vs después

```
Antes:
└── controller/TicketController.java   (try/catch en cada endpoint)

Después:
├── controller/TicketController.java   (sin try/catch innecesario)
├── config/GlobalExceptionHandler.java ← NUEVO (@ControllerAdvice)
└── model/ErrorResponse.java           (reutilizado)
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_02_guion_paso_a_paso.md -->
# Documento: docs lessons 18-global-exception-handling 02 guion paso a paso
---
# Lección 18 - Tutorial paso a paso

## Paso 1: Crear GlobalExceptionHandler

```java
package cl.duoc.fullstack.tickets.config;

import cl.duoc.fullstack.tickets.model.ErrorResponse;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgument(IllegalArgumentException e) {
        log.warn("Validación fallida: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ErrorResponse(e.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidation(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldErrors().stream()
            .map(err -> err.getField() + ": " + err.getDefaultMessage())
            .reduce((a, b) -> a + "; " + b)
            .orElse("Validación fallida");
        log.warn("Validación de argumentos: {}", message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ErrorResponse(message));
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleNotFound(EntityNotFoundException e) {
        log.warn("Recurso no encontrado: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse(e.getMessage()));
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> handleBadCredentials(BadCredentialsException e) {
        log.warn("Credenciales inválidas: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
            .body(new ErrorResponse("Credenciales inválidas"));
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> handleAccessDenied(AccessDeniedException e) {
        log.warn("Acceso denegado: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
            .body(new ErrorResponse("Acceso denegado"));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneric(Exception e) {
        log.error("Excepción no capturada", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(new ErrorResponse("Error interno del servidor"));
    }
}
```

## Paso 2: Simplificar endpoints

Antes (con try/catch):
```java
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) {
    try {
        Ticket saved = service.create(ticket);
        return ResponseEntity.status(201).body(saved);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}
```

Después (GlobalExceptionHandler maneja la excepción):
```java
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) {
    Ticket saved = service.create(ticket);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    // Si IllegalArgumentException ocurre → GlobalExceptionHandler la captura
}
```

## Paso 3: Testear

```
POST /tickets con datos inválidos
```

Handler captura → Respuesta: 400 + `{"message": "..."}`

Sin handler, sería: 500 + stack trace

## Paso 4: Stack trace en dev

```java
@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleGeneric(Exception e) {
    log.error("Excepción no capturada", e);
    
    String message = (isDev() ? e.getStackTrace().toString() : "Error interno");
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(new ErrorResponse(message));
}

private boolean isDev() {
    return System.getProperty("app.env", "prod").equals("dev");
}
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_03_local_vs_global.md -->
# Documento: docs lessons 18-global-exception-handling 03 local vs global
---
# Lección 18 - Try/Catch local vs handler global

## Comparativa

| Aspecto | Try/Catch local | @ControllerAdvice |
|--------|---------|---------|
| **Dónde captura** | Cada endpoint | Una clase centralizada |
| **Repetición de código** | Mucha | Ninguna |
| **Mantenimiento** | Difícil | Fácil |
| **Lógica de error** | Dispersa | Centralizada |
| **Para debugging** | Acceso directo | Log centralizado |

## Ejemplo: Try/Catch local

```java
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) {
    try {
        return ResponseEntity.status(201).body(service.create(ticket));
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}

@PutMapping("/{id}")
public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Ticket ticket) {
    try {
        Ticket updated = service.updateById(id, ticket);
        return ResponseEntity.ok(updated);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}

@DeleteMapping("/{id}")
public ResponseEntity<?> delete(@PathVariable Long id) {
    try {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}
```

**Problema:** El catch se repite 3 veces.

## Ejemplo: GlobalExceptionHandler

```java
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handle(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    }
}

@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) {
    return ResponseEntity.status(201).body(service.create(ticket));
}

@PutMapping("/{id}")
public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Ticket ticket) {
    Ticket updated = service.updateById(id, ticket);
    return ResponseEntity.ok(updated);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> delete(@PathVariable Long id) {
    service.deleteById(id);
    return ResponseEntity.noContent().build();
}
```

**Ventaja:** Endpoints limpios, lógica centralizada.

## Cuándo cada uno

- **Try/Catch local:** 
  - Excepción específica del endpoint
  - Lógica de recuperación personalizada
  
- **Global handler:**
  - Excepciones comunes (validation, not found)
  - Respuesta uniforme requerida
  - Muchos endpoints



<!-- START OF FILE: docs_lessons_18-global-exception-handling_04_ejemplos_practicos.md -->
# Documento: docs lessons 18-global-exception-handling 04 ejemplos practicos
---
# Lección 18 - Ejemplos prácticos

```java
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgument(IllegalArgumentException e) {
        log.warn("Validación fallida: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ErrorResponse(e.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidation(MethodArgumentNotValidException e) {
        String message = e.getBindingResult()
            .getAllErrors().stream()
            .map(err -> err.getDefaultMessage())
            .collect(Collectors.joining(", "));
        log.warn("Error de validación: {}", message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ErrorResponse(message));
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleConstraintViolation(ConstraintViolationException e) {
        String message = e.getConstraintViolations().stream()
            .map(v -> v.getMessage())
            .collect(Collectors.joining(", "));
        log.warn("Violación de restricción: {}", message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ErrorResponse(message));
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleNotFound(EntityNotFoundException e) {
        log.warn("Recurso no encontrado: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorResponse(e.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneric(Exception e) {
        log.error("Excepción no capturada", e);
        String message = isDevelopment() ? 
            e.getStackTrace().toString() : 
            "Error interno del servidor";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(new ErrorResponse(message));
    }

    private boolean isDevelopment() {
        return System.getProperty("app.env", "prod").equals("dev");
    }
}
```

## Endpoints sin try/catch

```java
@RestController
@RequestMapping("/tickets")
public class TicketController {

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Ticket ticket) {
        Ticket saved = service.create(ticket);
        return ResponseEntity.status(HttpStatus.CREATED).body("Ticket Creado");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getById(@PathVariable Long id) {
        Ticket found = service.getById(id);
        return ResponseEntity.ok(found);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
```

## Flujos de captura

```
1. POST /tickets (sin "title")
   → @Valid valida
   → MethodArgumentNotValidException
   → GlobalExceptionHandler.handleValidation()
   → Respuesta: 400 + {"message": "El titulo es requerido"}

2. DELETE /tickets/999 (no existe)
   → service.deleteById(999)
   → return null
   → EntityNotFoundException lanzada
   → GlobalExceptionHandler.handleNotFound()
   → Respuesta: 404 + {"message": "..."}

3. POST /tickets con creador == asignado
   → service.create()
   → IllegalArgumentException
   → GlobalExceptionHandler.handleIllegalArgument()
   → Respuesta: 400 + {"message": "El creador y asignado no pueden ser iguales"}
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_05_respuesta_uniforme.md -->
# Documento: docs lessons 18-global-exception-handling 05 respuesta uniforme
---
# Lección 18 - Respuesta uniforme de errores

## Estructura base

```java
public record ErrorResponse(String message) {}
```

## En dev: incluir stack trace

```java
public record ErrorResponse(String message, String details, String timestamp) {}

// Handler
@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleGeneric(Exception e) {
    String details = isDevelopment() ? 
        Arrays.toString(e.getStackTrace()) : 
        null;
    
    ErrorResponse response = new ErrorResponse(
        e.getMessage(),
        details,
        LocalDateTime.now().toString()
    );
    
    return ResponseEntity.status(500).body(response);
}
```

## En prod: solo mensaje

```json
{
  "message": "Error interno del servidor",
  "timestamp": "2026-04-16T14:32:10"
}
```

## En dev: con stack trace

```json
{
  "message": "NullPointerException: valor es null",
  "details": "[cl.duoc.fullstack.tickets.service.TicketService.create(...), ...]",
  "timestamp": "2026-04-16T14:32:10"
}
```

## Controlar con propiedad

```yaml
# application.yml
app.environment: ${APP_ENV:dev}

# application-prod.yml
app.environment: prod
```

```java
@Value("${app.environment}")
private String environment;

private boolean isDevelopment() {
    return "dev".equals(environment);
}
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_06_validacion_integrada.md -->
# Documento: docs lessons 18-global-exception-handling 06 validacion integrada
---
# Lección 18 - Capturar validaciones de Spring

## @Valid y MethodArgumentNotValidException

```java
@PostMapping
public ResponseEntity<?> create(@Valid @RequestBody Ticket ticket) {
    // Si validación falla → MethodArgumentNotValidException
    // GlobalExceptionHandler la captura
    return ResponseEntity.status(201).body(service.create(ticket));
}
```

## Handler para MethodArgumentNotValidException

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<?> handleMethodArgumentNotValid(
        MethodArgumentNotValidException e) {
    
    String message = e.getBindingResult()
        .getAllErrors().stream()
        .map(ObjectError::getDefaultMessage)
        .collect(Collectors.joining(", "));
    
    log.warn("Error de validación: {}", message);
    
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ErrorResponse(message));
}
```

## Handler para ConstraintViolationException

```java
@ExceptionHandler(ConstraintViolationException.class)
public ResponseEntity<?> handleConstraintViolation(
        ConstraintViolationException e) {
    
    String message = e.getConstraintViolations().stream()
        .map(ConstraintViolation::getMessage)
        .collect(Collectors.joining(", "));
    
    log.warn("Violación de restricción: {}", message);
    
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new ErrorResponse(message));
}
```

## Ejemplos de validaciones capturadas

```
1. POST /tickets sin "title"
   @NotBlank(message = "El titulo es requerido")
   → Capturado: "El titulo es requerido"

2. POST /tickets con title.length() > 50
   @Size(max = 50)
   → Capturado: "Debe tener máximo 50 caracteres"

3. PUT /tickets/999 (no existe)
   → Capturado: "Ticket con ID 999 no encontrado"
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_07_troubleshooting.md -->
# Documento: docs lessons 18-global-exception-handling 07 troubleshooting
---
# Lección 18 - Troubleshooting

## Problema 1: Handler no se ejecuta

**Causa:** `@ControllerAdvice` mal declarado.

**Solución:**
```java
@ControllerAdvice  // ← Falta esta anotación
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handle(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(...);
    }
}
```

## Problema 2: Spring Security lanza excepción antes que handler

**Causa:** Orden de ejecución (autenticación antes de lógica).

**Síntoma:** 401/403 sin pasar por handler.

**Solución:** Crear handler separado para excepciones de Security:

```java
@ExceptionHandler(AccessDeniedException.class)
public ResponseEntity<?> handleAccessDenied(AccessDeniedException e) {
    return ResponseEntity.status(HttpStatus.FORBIDDEN)
        .body(new ErrorResponse("Acceso denegado"));
}
```

## Problema 3: Varios handlers pero solo uno se ejecuta

**Causa:** Order de herencia (mas específico primero).

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<?> handleValidation(...) { }  // Primero (más específico)

@ExceptionHandler(Exception.class)
public ResponseEntity<?> handleGeneric(...) { }      // Último (genérico)
```

## Problema 4: Stack trace no aparece en dev

**Causa:** Chequeo de environment incorrecto.

**Solución:**
```java
@Value("${app.environment:dev}")
private String environment;

private boolean isDev() {
    return "dev".equals(environment);
}
```

## Problema 5: Handler ignora validaciones @Valid

**Causa:** `@Valid` pero sin handler para `MethodArgumentNotValidException`.

**Solución:**
```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<?> handle(MethodArgumentNotValidException e) {
    String msg = e.getBindingResult().getAllErrors()
        .stream().map(ObjectError::getDefaultMessage)
        .collect(Collectors.joining(", "));
    return ResponseEntity.badRequest().body(new ErrorResponse(msg));
}
```

## Problema 6: Mensaje de error muy genérico

**Causa:** `catch (Exception e) { return error("Algo falló"); }`

**Solución:** Log primero, respuesta después:

```java
@ExceptionHandler(Exception.class)
public ResponseEntity<?> handle(Exception e) {
    log.error("Excepción: ", e);  // ← Log con stack
    return ResponseEntity.status(500)
        .body(new ErrorResponse(e.getMessage()));
}
```



<!-- START OF FILE: docs_lessons_18-global-exception-handling_08_actividad_individual.md -->
# Documento: docs lessons 18-global-exception-handling 08 actividad individual
---
# Lección 18 - Actividad individual

## Objetivo

Crear un GlobalExceptionHandler que capture todas las excepciones de tu API y devuelva respuestas uniformes.

---

## Requisitos

1. **Crear GlobalExceptionHandler**
   - Anotación `@ControllerAdvice`
   - Mínimo 4 handlers para diferentes excepciones

2. **Handlers requeridos**
   - `IllegalArgumentException` → 400
   - `MethodArgumentNotValidException` → 400
   - `EntityNotFoundException` → 404
   - `Exception` genérico → 500

3. **Simplificar endpoints**
   - Remover try/catch innecesario
   - Dejar que GlobalExceptionHandler maneje errores

4. **Testear múltiples escenarios**
   - POST sin datos requeridos (validación)
   - GET con ID inexistente
   - POST con creador == asignado (negocio)
   - Error genérico (500)

---

## Instrucciones paso a paso

### Paso 1: Crear GlobalExceptionHandler

```java
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegal(IllegalArgumentException e) {
        log.warn("Validación: {}", e.getMessage());
        return ResponseEntity.badRequest()
            .body(new ErrorResponse(e.getMessage()));
    }
    // ... resto de handlers
}
```

### Paso 2: Simplificar TicketController

Remueve try/catch y deja que handler los capture.

### Paso 3: Testear

```
POST /tickets (sin title)
→ 400 + {"message": "El titulo es requerido"}

GET /tickets/999
→ 404 + {"message": "Ticket no encontrado"}

POST /tickets (creador == asignado)
→ 400 + {"message": "No pueden ser iguales"}

Excepción inesperada
→ 500 + {"message": "Error interno"}
```

---

## Desafío extra

1. Incluir timestamp en respuesta
2. Stack trace solo en dev
3. Diferentes mensajes para dev vs prod



<!-- START OF FILE: docs_lessons_18-global-exception-handling_README.md -->
# Documento: docs lessons 18-global-exception-handling README
---
# Lección 18 - Global Exception Handling

## El problema

```java
// ❌ Código repetitivo
@PostMapping
public ResponseEntity<?> create(@RequestBody Ticket ticket) {
    try {
        Ticket saved = service.create(ticket);
        return ResponseEntity.status(201).body(saved);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(new ErrorResponse(e.getMessage()));
    } catch (Exception e) {
        return ResponseEntity.status(500).body(new ErrorResponse("Error interno"));
    }
}
```

Cada endpoint repite el mismo pattern. Con `@ControllerAdvice`, un solo handler captura TODAS las excepciones.

---

## Quick Start

### Concepto

`@ControllerAdvice` = handler global de excepciones

```
Usuario → Request con datos inválidos
    ↓
Spring valida → MethodArgumentNotValidException
    ↓
GlobalExceptionHandler.handle() ← CAPTURA AQUÍ
    ↓
Respuesta: 400 + {"message": "Título no puede estar vacío"}
```

---

## Lo que construirás

1. Crear `GlobalExceptionHandler`
2. Agregar handlers para:
   - `IllegalArgumentException` → 400 Bad Request
   - `EntityNotFoundException` → 404 Not Found
   - `ValidationException` → 400 Bad Request
   - `Exception` genérico → 500 Internal Server Error
3. Diferencia entre dev (stack trace) y prod (solo mensaje)

---

## Lecturas recomendadas

- Lección 07: Manejo de errores local (base)
- Lección 17: Logging (registrar excepciones)



<!-- START OF FILE: docs_lessons_levantamiento.pdf.md -->
# Documento: docs lessons levantamiento.pdf
---
# Evaluacion Parcial 2 — Fase de Levantamiento

**Proyecto Semestral · Arquitectura de Microservicios · DSY1103 Desarrollo FullStack 1**

| | |
|---|---|
| **Entrega** | Semana 10 |
| **Equipos** | 2–3 integrantes |
| **Formato** | Documento de analisis previo al desarrollo |

---

## 0. Contexto del encargo

Antes de escribir una sola linea de codigo, todo proyecto de software profesional comienza con un proceso de analisis y diseno. Este documento de levantamiento es la base que justificara todas las decisiones tecnicas que tome el equipo durante el desarrollo. Debe ser entregado junto al repositorio GitHub como parte del `README.md` o como documento adjunto.

> **IMPORTANTE**
> Esta fase es evaluada dentro de la dimension grupal (30%). Un levantamiento debil o generico se notara directamente en la coherencia de la arquitectura y afectara la defensa individual.

---

## 1. Identificacion del problema

Describe el problema real o simulado que la aplicacion busca resolver. Debe estar redactado desde la perspectiva del usuario afectado, no desde la tecnologia. Responde: ¿que situacion genera ineficiencia, perdida o frustracion?, ¿a quien afecta?, ¿por que es relevante?

**Entregables:**
- Parrafo de contexto del dominio (2–3 parrafos)
- Declaracion del problema principal (1 oracion clara)
- Identificacion de los actores/usuarios involucrados

> **Tips para redactarlo bien**
>
> - Evita decir "el sistema no existe" — enfocate en el dolor que genera la ausencia o ineficiencia actual.
>   *Ej: "Los encargados de bodega registran manualmente el stock en planillas compartidas, lo que genera inconsistencias y perdidas de inventario no detectadas a tiempo."*
> - Nombra roles concretos: administrador, cliente, cajero, medico, etc. No uses "el usuario" de forma generica.
> - Acota el dominio — no intentes resolver todo. Un sistema de reservas de cancha, no "un sistema deportivo completo".
>
> **Dominios sugeridos:** reserva de horas medicas · gestion de inventario · arriendo de vehiculos · e-commerce de productos · gestion de proyectos internos

---

## 2. Requerimientos del sistema

Lista las capacidades que el sistema debe tener. Se dividen en **funcionales** (que debe hacer) y **no funcionales** (como debe comportarse). Esta seccion es el contrato entre el equipo y el sistema a construir.

### 2.1 Requerimientos funcionales

Acciones concretas que el sistema debe permitir. Redacta cada uno comenzando con un verbo en infinitivo.

**Minimo 15 requerimientos funcionales, numerados (RF-01, RF-02...)**

> **Tips**
>
> - Cada requerimiento debe ser **verificable**. En lugar de "gestionar usuarios", escribe: *"Registrar un nuevo usuario con nombre, correo y contrasena encriptada."*
> - Agrupa por entidad o actor: primero los de Cliente, luego los de Administrador, etc. Esto te ayudara a identificar microservicios mas adelante.
> - Asegurate de incluir operaciones de creacion, consulta, modificacion y eliminacion para las entidades principales — cada una puede volverse un endpoint REST.

### 2.2 Requerimientos no funcionales

**Al menos 5 requerimientos no funcionales (RNF-01, RNF-02...)**

> **Tips**
>
> - En el contexto de esta evaluacion son relevantes: manejo adecuado de errores HTTP, validacion de datos de entrada, trazabilidad mediante logs, independencia entre microservicios, uso de convenciones REST.
> - Evita escribir "el sistema debe ser rapido" — prefiere *"cada endpoint debe retornar respuesta en menos de 500 ms bajo condiciones normales."*

---

## 3. Solucion propuesta

Describe, a nivel conceptual, como el equipo planea resolver el problema usando una arquitectura de microservicios. No entres en detalles de codigo — explica la logica de diseno y por que una arquitectura distribuida es apropiada para este dominio.

**Entregables:**
- Descripcion general de la solucion (2–3 parrafos)
- Justificacion del uso de microservicios en este dominio
- Diagrama conceptual de la arquitectura (bloques de microservicios y sus relaciones)

> **Tips**
>
> - Justifica por que cada bloque funcional merece ser un servicio independiente: separacion de responsabilidades, bases de datos propias, escalabilidad diferenciada.
> - El diagrama puede ser simple: cajas con nombre del servicio y flechas de comunicacion. Herramientas como draw.io, Excalidraw o incluso papel escaneado son validas.
> - Menciona que tecnologia usaran para la comunicacion entre servicios: **WebClient** o **Feign Client** (ambas validas segun la rubrica).

---

## 4. Casos de uso o historias de usuario

Documenta como los distintos actores interactuan con el sistema. Puedes elegir entre **casos de uso** (mas formal, con flujo principal y alternativo) o **historias de usuario** (mas agil, con criterios de aceptacion).

- **Minimo 8** casos de uso o historias de usuario
- Cada uno debe incluir: actor, objetivo, flujo / criterios de aceptacion

### Formato de historia de usuario (recomendado)

```
Como [rol/actor], quiero [funcionalidad], para [beneficio/objetivo].

Criterios de aceptacion:
- Dado que [contexto], cuando [accion], entonces [resultado esperado].
- El sistema debe retornar un error 400 si el campo requerido no esta presente.
- La respuesta debe incluir el ID generado del recurso creado.
```

**Ejemplo:**
> *Como cliente registrado, quiero reservar una hora con un medico, para asegurar mi atencion sin llamar por telefono.*
>
> Cada criterio de aceptacion se traduce directamente en un endpoint o validacion del backend.

> **OJO**
> Las historias de usuario deben poder mapearse a requerimientos funcionales y luego a endpoints REST. Si una historia no genera ningun endpoint, probablemente es demasiado vaga.

---

## 5. Definicion de microservicios

Esta es la seccion mas tecnica del levantamiento y la que mas impacta directamente en el desarrollo. Debes definir cada microservicio que el equipo implementara, con sus responsabilidades, entidades, endpoints y relaciones con otros servicios.

- **Minimo 10 microservicios** definidos (sin limite maximo)
- Para cada microservicio: nombre, responsabilidad, entidades JPA, endpoints REST y dependencias

### Plantilla por microservicio

| Campo | Descripcion |
|---|---|
| **Nombre** | Sustantivo representativo del dominio (ej: `reservation-service`, `patient-service`) |
| **Responsabilidad** | Una sola oracion que describe que gestiona este servicio y nada mas |
| **Entidades JPA** | Clases con sus atributos principales y relaciones (`@OneToMany`, `@ManyToOne`, etc.) |
| **Endpoints REST** | Metodo HTTP + ruta + descripcion breve. Ej: `POST /api/reservations` — crear nueva reserva |
| **Comunica con** | Que otros servicios consulta o llama, y por que |
| **Base de datos** | Nombre del esquema o BD propia (cada microservicio debe tener la suya) |

> **Tips para definir bien los microservicios**
>
> - El nombre del servicio debe reflejar **una sola responsabilidad**. Si sientes que necesitas "y" para describirlo (ej: "gestiona usuarios y notificaciones"), dividelo en dos.
> - Cada servicio tiene su **propia base de datos** — nunca dos servicios comparten la misma tabla directamente. La comunicacion entre servicios se hace via API REST.
> - Piensa en tus requerimientos funcionales: agrupalos por entidad o contexto. Cada agrupacion coherente puede convertirse en un microservicio.
> - Asegurate de que al menos **2–3 servicios se comunican entre si** (requisito de la rubrica). Ej: `order-service` llama a `product-service` para verificar stock.
> - Identifica cuales son los servicios **"core"** (sin ellos nada funciona) y cuales son de **soporte**. Los core deben estar completamente implementados con CRUD y validaciones.
>
> **Ejemplo para sistema de arriendo:** `vehicle-service` · `customer-service` · `rental-service` · `payment-service` · `branch-service` · `reservation-service` · `insurance-service` · `maintenance-service` · `category-service` · `review-service`

---

## 6. Checklist de entrega

- [ ] Identificacion del problema con actores definidos
- [ ] Minimo 15 RF y 5 RNF numerados y verificables
- [ ] Solucion propuesta con diagrama de arquitectura
- [ ] Minimo 8 historias de usuario con criterios de aceptacion
- [ ] Minimo 10 microservicios definidos con plantilla completa
- [ ] Al menos 2–3 servicios con comunicacion inter-servicio identificada
- [ ] Documento incluido en el repositorio GitHub (`README.md` o PDF adjunto)

---

*DSY1103 Desarrollo FullStack 1 · Subdireccion de Diseno Instruccional · 2025*



