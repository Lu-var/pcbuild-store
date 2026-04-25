**Evaluación Parcial 2**

**TarroBuild**

*Plataforma online para asistencia de armado de computadores y analisis de compatibilidad de hardware*

## Contenido

- [1. Identificación del Problema](#1-identificación-del-problema)
- [2. Requerimientos del Sistema](#2-requerimientos-del-sistema)
- [3. Solución Propuesta](#3-solución-propuesta)
- [4. Historias de Usuario](#4-historias-de-usuario)
- [5. Definicion de Microservicios](#5-definicion-de-microservicios)

# **1\. Identificación del Problema**

## **1.1 Contexto del dominio**

En Chile, el interés por el armado de computadores ha experimentado un crecimiento sostenido, impulsado por la masificación del trabajo remoto, el gaming y la demanda de equipos de alto rendimiento a un menor costo. Sin embargo, para el usuario promedio, configurar y comprar hardware por piezas sigue siendo complicado: se deben visitar múltiples sitios, comparar precios manualmente y verificar si los componentes elegidos son compatibles entre sí.

Actualmente, un usuario que quiere armar o actualizar su PC se enfrenta a que la información técnica de compatibilidad (socket de CPU, tipo de RAM, formato de placa madre, TDP y fuente de poder requerida) está repartida por foros, fichas, documentos en inglés y videos de YouTube. Por otro lado, las tiendas online locales no ofrecen herramientas que validen automáticamente la selección de componentes, dejando al usuario expuesto a compras incorrectas que generan costos de devolución, tiempos de espera y frustración.

La ausencia de una plataforma inteligente y centralizada obliga a los usuarios a realizar múltiples verificaciones manuales, generando incompatibilidades, sobrecostos y decisiones de compra deficientes.

## **1.2 Declaración del problema principal**

*Los usuarios que desean armar o actualizar un computador no disponen de un sistema centralizado que permita validar automáticamente la compatibilidad técnica entre componentes, estimar requerimientos energéticos, comparar precios de referencia y recibir recomendaciones de mejora antes de tomar una decisión de compra.*

## **1.3 Actores / Usuarios involucrados**

| Actor | Descripción y necesidades |
| --- | --- |
| **Usuario registrado** | Puede crear configuraciones personalizadas, guardar builds, recibir análisis completos, comparar precios referenciales y gestionar alertas/notificaciones. |
| **Usuario no registrado** | Puede explorar el catálogo de componentes, consultar especificaciones técnicas y ejecutar verificaciones básicas de compatibilidad. |
| **Administrador** | Gestiona el catálogo de componentes, atributos técnicos, reglas de compatibilidad, referencias de precio y monitorea el funcionamiento general del sistema. |
| **Sistema** | Ejecuta validaciones automáticas, cálculos energéticos, generación de recomendaciones y envío de alertas configuradas. |

# **2\. Requerimientos del Sistema**

## **2.1 Requerimientos Funcionales**

| ID | Descripción | Actor |
| ----- | ----- | ----- |
| **RF-01** | Registrar un nuevo usuario con nombre, correo electrónico y contraseña encriptada (bcrypt). | Usuario no registrado |
| **RF-02** | Autenticar un usuario mediante correo y contraseña, retornando un token JWT válido. | Usuario no registrado / Administrador |
| **RF-03** | Listar todos los componentes del catálogo con categoría y especificaciones resumidas. | Usuario (registrado o no registrado) |
| **RF-04** | Obtener el detalle técnico completo de un componente. | Usuario (registrado o no registrado) |
| **RF-05** | Filtrar componentes por categoría, marca y rango de precio. | Usuario (registrado o no registrado) |
| **RF-06** | Crear una nueva build personalizada asociada a un usuario autenticado. | Usuario registrado |
| **RF-07** | Agregar, actualizar o eliminar componentes dentro de una build activa. | Usuario registrado |
| **RF-08** | Verificar automáticamente la compatibilidad entre todos los componentes de una build. | Usuario (registrado o no registrado) |
| **RF-09** | Calcular consumo energético estimado y potencia recomendada de fuente de poder para una build. | Usuario (registrado o no registrado) |
| **RF-10** | Obtener precios referenciales y disponibilidad aproximada desde vendedores registrados. | Usuario (registrado o no registrado) |
| **RF-11** | Generar análisis consolidado de build incluyendo compatibilidad, costo estimado y advertencias. | Usuario registrado |
| **RF-12** | Guardar builds favoritas e historial de configuraciones. | Usuario registrado |
| **RF-13** | Generar recomendaciones de mejora o upgrade según presupuesto o uso objetivo. | Usuario registrado |
| **RF-14** | Crear/editar componentes y atributos técnicos del catálogo. | Administrador |
| **RF-15** | Crear/editar reglas de compatibilidad entre categorías. | Administrador |
| **RF-16** | Registrar/actualizar referencias de precios de mercado. | Administrador |
| **RF-17** | Configurar alertas para cambios de precio o disponibilidad. | Usuario registrado |
| **RF-18** | Enviar notificaciones automáticas al usuario cuando una build presente alertas o cambios relevantes. | Sistema |

## **2.2 Requerimientos No Funcionales**

| ID | Descripción |
| ----- | ----- |
| **RNF-01** | Cada endpoint debe retornar una respuesta en menos de 500 ms bajo condiciones normales de carga. |
| **RNF-02** | Todos los endpoints deben validar los datos de entrada y retornar códigos HTTP semánticos (200, 201, 400, 401, 403, 404, 409, 500) con cuerpo de error estructurado en JSON. |
| **RNF-03** | Cada microservicio debe mantener logs estructurados (nivel INFO/ERROR) con identificador de correlación para trazabilidad entre servicios. |
| **RNF-04** | Cada microservicio debe tener su propia base de datos independiente. Está estrictamente prohibido que dos servicios compartan tablas o esquemas directamente. |
| **RNF-05** | La comunicación entre microservicios debe realizarse exclusivamente vía API REST usando WebClient o Feign Client. No se permite acceso directo a bases de datos ajenas. |
| **RNF-06** | Las contraseñas de usuarios deben almacenarse encriptadas con BCrypt. Ningún endpoint debe retornar contraseñas en texto plano bajo ninguna circunstancia. |

# **3\. Solución Propuesta**

## **3.1 Descripción general**

TarroBuild es una plataforma web basada en arquitectura de microservicios que permite a los usuarios explorar componentes de hardware, crear configuraciones de PC personalizadas y someterlas a procesos automáticos de validación técnica.

A través de un API Gateway centralizado, el sistema expone servicios especializados que colaboran entre sí para entregar una evaluación integral de cada build: compatibilidad entre piezas, estimación de consumo energético, consulta de precios referenciales, sugerencias de mejora y almacenamiento histórico de configuraciones.

El sistema no gestiona directamente procesos de venta física ni despacho de productos. En su lugar, centraliza información técnica de componentes, disponibilidad consultada desde proveedores, validación automática de compatibilidad y generación de cotizaciones persistentes.

La principal característica diferenciadora es que la plataforma no se limita a mostrar componentes, sino que interpreta técnicamente la combinación seleccionada por el usuario y genera un informe consolidado que reduce errores de compatibilidad y mejora la toma de decisiones antes de una compra real en el mercado.

Cada microservicio opera con su propia base de datos independiente y se comunica mediante WebClient o Feign Client bajo un modelo REST desacoplado.

## **3.2 Justificación del uso de microservicios**

TarroBuild utiliza una arquitectura de microservicios para separar los distintos contextos del dominio de configuración y validación de hardware en módulos independientes. Esto permite aislar responsabilidades como catálogo, compatibilidad y recomendaciones, evitando un diseño monolítico con alto acoplamiento.

Cada servicio puede evolucionar de forma autónoma según sus reglas de negocio y nivel de cambio, lo que facilita el mantenimiento y la escalabilidad del sistema. Por ejemplo, la lógica de compatibilidad puede ajustarse sin afectar el resto del sistema.

Además, la separación por servicios permite escalar de manera independiente aquellos módulos con mayor carga de consultas, manteniendo eficiencia en el uso de recursos.

## **3.3 Diagrama conceptual de la arquitectura**

## Arquitectura de Microservicios — TarroBuild

La plataforma se organiza en servicios especializados conectados mediante un API Gateway central.

```
CLIENTE / FRONTEND
        |
        v
API GATEWAY :8080
        |
------------------------------------------------------------
|        |        |        |        |        |        |
AUTH   USER   PRODUCT  CATEGORY  COMPAT.  PROVIDER  BUILD
8081   8082    8083     8084      8085     8086      8087
------------------------------------------------------------
                         |
                         v
                 ESTIMATE :8088
                         |
                         v
             RECOMMENDATION :8089
                         |
                         v
             NOTIFICATION :8090
```

### Características de la arquitectura

1. Cada microservicio cuenta con base de datos independiente (H2 / MySQL).
2. La comunicación entre servicios se realiza mediante WebClient o Feign Client.
3. El API Gateway actúa como único punto de entrada del sistema.
4. La arquitectura prioriza la separación de responsabilidades y la escalabilidad.

### Flujos de comunicación inter-servicio clave

Estas relaciones muestran qué servicio consulta a cuál para resolver cada caso de uso.

- build-service → product-service: obtiene información técnica de componentes para construir la configuración

- build-service → compatibility-service: valida compatibilidad entre componentes seleccionados en la build

- build-service → provider-service: consulta disponibilidad o referencia de componentes externos

- estimate-service → build-service: obtiene la configuración validada para generar la cotización

- estimate-service → product-service: obtiene precios y atributos técnicos actualizados

- recommendation-service → build-service: analiza la configuración actual del usuario

- recommendation-service → product-service: obtiene catálogo para generar sugerencias

- estimate-service → notification-service: envía notificación al usuario al generar una cotización

- recommendation-service → notification-service: notifica recomendaciones relevantes generadas al usuario


## 4. Historias de Usuario

### **HU-01 — Registro de cuenta**

Como cliente no registrado, quiero crear una cuenta con mi nombre, correo y contrasena, para poder realizar compras en la tienda.

**Criterios de aceptacion:**

* Dado que ingreso nombre, correo valido y contrasena \>= 8 caracteres, cuando envio el formulario, entonces el sistema crea la cuenta y retorna HTTP 201 con el ID generado.

* Si el correo ya existe en el sistema, el endpoint retorna HTTP 409 Conflict con mensaje descriptivo.

* La contrasena nunca se almacena en texto plano; se usa BCrypt.

### **HU-02 — Inicio de sesion**

Como cliente registrado, quiero autenticarme con mi correo y contrasena, para acceder a mi carrito e historial de ordenes.

**Criterios de aceptacion:**

* Dado que ingreso credenciales correctas, el sistema retorna HTTP 200 con un JWT valido de duracion 24 horas.

* Si las credenciales son incorrectas, retorna HTTP 401 Unauthorized.

* El JWT debe incluir el rol del usuario (CLIENTE o ADMIN).

### **HU-03 — Busqueda y filtrado de productos**

Como cliente no registrado, quiero explorar el catalogo filtrando por categoria (CPU, GPU, RAM, etc.), para encontrar las piezas que necesito rapidamente.

**Criterios de aceptacion:**

* El endpoint GET /api/products?category=CPU retorna solo los productos de esa categoria con nombre, precio y stock.

* Si la categoria no existe, retorna HTTP 400 con lista de categorias validas.

* Productos con stock 0 aparecen en la lista pero marcados como 'sin stock'.

### **HU-04 — Verificacion de compatibilidad**

Como cliente, quiero seleccionar una CPU y una Placa Madre y recibir confirmacion de si son compatibles entre si, para evitar comprar piezas incompatibles.

**Criterios de aceptacion:**

* Dado que envio los IDs de dos o mas componentes, el sistema retorna HTTP 200 con resultado: compatible: true/false y detalle tecnico de la razon.

* Si alguno de los IDs no existe, retorna HTTP 404 con el ID invalido especificado.

* La verificacion es accesible sin autenticacion (publico).

### **HU-05 — Agregar producto al carrito**

Como cliente autenticado, quiero agregar una GPU a mi carrito especificando la cantidad, para preparar mi compra.

**Criterios de aceptacion:**

* Dado que el producto existe y tiene stock suficiente, el sistema agrega el item y retorna HTTP 201 con el estado actualizado del carrito.

* Si la cantidad solicitada supera el stock disponible, retorna HTTP 409 con el stock real disponible.

* Si el producto ya esta en el carrito, actualiza la cantidad en lugar de duplicar el item.

### **HU-06 — Confirmar orden de compra**

Como cliente autenticado, quiero confirmar mi carrito como una orden de compra, para proceder al pago.

**Criterios de aceptacion:**

* El sistema verifica compatibilidad de todos los items del carrito antes de crear la orden; si hay incompatibilidad, retorna HTTP 422 con detalle.

* El sistema reserva el stock de todos los items; si alguno no tiene stock suficiente, la orden no se crea y retorna HTTP 409\.

* Si todo es correcto, se crea la orden con estado PENDIENTE y retorna HTTP 201 con el ID de la orden.

### **HU-07 — Consultar historial de ordenes**

Como cliente autenticado, quiero ver todas mis ordenes anteriores con su estado actual, para hacer seguimiento de mis compras.

**Criterios de aceptacion:**

* GET /api/orders retorna la lista de ordenes del cliente autenticado, ordenadas de mas reciente a mas antigua.

* Cada orden incluye: ID, fecha, lista de productos, total y estado actual.

* Si el cliente no tiene ordenes, retorna HTTP 200 con arreglo vacio.

### **HU-08 — Actualizar estado de orden (Admin)**

Como administrador, quiero actualizar el estado de una orden de PROCESANDO a DESPACHADO, para mantener informado al cliente.

**Criterios de aceptacion:**

* PATCH /api/orders/{id}/status con body {status: DESPACHADO} actualiza el estado y retorna HTTP 200\.

* Solo un ADMIN puede usar este endpoint; un CLIENTE recibe HTTP 403 Forbidden.

* Al cambiar el estado, el sistema dispara automaticamente una notificacion al correo del cliente.

* Transiciones invalidas (ej: ENTREGADO → PROCESANDO) retornan HTTP 400\.

### **HU-09 — Gestion de catalogo (Admin)**

Como administrador, quiero agregar una nueva GPU al catalogo con sus especificaciones tecnicas, para que los clientes puedan comprarla y el verificador de compatibilidad la reconozca.

**Criterios de aceptacion:**

* POST /api/products crea el producto y retorna HTTP 201 con el ID generado.

* El body debe incluir: nombre, descripcion, precio, stock, categoriaId y atributos tecnicos (ej: tipo de conector, VRAM, TDP).

* Si falta algun campo requerido, retorna HTTP 400 con lista de campos faltantes.

### **HU-10 — Recibir notificacion de cambio de estado**

Como cliente, quiero recibir un correo electronico cuando mi orden sea despachada, para saber que mi pedido esta en camino.

**Criterios de aceptacion:**

* Cuando order-service cambia el estado a DESPACHADO, envia un evento a notification-service.

* notification-service envia un correo al email del cliente con numero de orden y nuevo estado.

* Si el envio falla, el error queda registrado en el log del servicio sin afectar la operacion principal.

# **5\. Definicion de Microservicios**

A continuacion se define cada uno de los 11 microservicios del sistema TarroBuild, con su responsabilidad, entidades JPA, endpoints REST, dependencias y base de datos propia.

---

| MS-01 · api-gateway (puerto :8080) | |
| :---- | :---- |
| **Responsabilidad** | Actúa como único punto de entrada del sistema. Enruta solicitudes HTTP hacia los microservicios internos y centraliza la validación de seguridad mediante JWT. |
| **Entidades JPA** | No maneja entidades JPA propias. Configuración de rutas en application.yml. |
| **Endpoints REST** | Expone únicamente endpoints proxy hacia los servicios internos. GET /actuator/health para monitoreo del estado del sistema. |
| **Comunica con** | Consulta auth-service para validar tokens JWT. |
| **Base de datos** | No posee base de datos. |

---

| MS-02 · auth-service (puerto :8081) | |
| :---- | :---- |
| **Responsabilidad** | Gestiona autenticación de usuarios mediante registro, login, cierre de sesión y emisión de JWT. |
| **Entidades JPA** | Credential { id, email, passwordHash, role, userId, createdAt } |
| **Endpoints REST** | POST /api/auth/register, POST /api/auth/login, POST /api/auth/logout, GET /api/auth/validate |
| **Comunica con** | Es consultado por api-gateway para validar tokens JWT. Consulta user-service para asociación de perfil de usuario. |
| **Base de datos** | db_auth |

---

| MS-03 · user-service (puerto :8082) | |
| :---- | :---- |
| **Responsabilidad** | Gestiona información de usuario y perfiles asociados. |
| **Entidades JPA** | User { id, name, lastName, email, phone, createdAt } |
| **Endpoints REST** | CRUD de usuarios (/api/users) |
| **Comunica con** | Es consultado por notification-service y auth-service para obtener datos del usuario. |
| **Base de datos** | db_users |

---

| MS-04 · category-service (puerto :8084) | |
| :---- | :---- |
| **Responsabilidad** | Administra categorías de productos y sus atributos técnicos asociados. |
| **Entidades JPA** | Category { id, nombre, slug, descripcion, activa } / AttributeDefinition { id, categoryId, nombreAtributo, tipoDato, requerido } |
| **Endpoints REST** | CRUD de categorías y atributos técnicos. |
| **Comunica con** | Es consultado por product-service para validar que una categoría existe. |
| **Base de datos** | db_categories |

---

| MS-05 · product-service (puerto :8083) | |
| :---- | :---- |
| **Responsabilidad** | Gestiona el catálogo de componentes de hardware y sus especificaciones técnicas. |
| **Entidades JPA** | Product { id, nombre, descripcion, precio, categoriaId, marca, modelo, activo } / ProductAttribute { id, productId, nombreAtributo, valor } |
| **Endpoints REST** | CRUD de productos y consulta de atributos técnicos. |
| **Comunica con** | Consulta category-service para validar categorías. Es consultado por build-service, compatibility-service, recommendation-service y estimate-service para obtener datos de productos. |
| **Base de datos** | db_products |

---

| MS-06 · compatibility-service (puerto :8085) | |
| :---- | :---- |
| **Responsabilidad** | Valida compatibilidad técnica entre componentes de hardware basándose en reglas definidas. |
| **Entidades JPA** | CompatibilityRule { id, categoryA, atributoA, operador, categoryB, atributoB, descripcionError } / CompatibilityCheck { id, productIds, resultado, detalle } |
| **Endpoints REST** | POST /api/compatibility/check, CRUD de reglas de compatibilidad. |
| **Comunica con** | Consulta product-service para obtener atributos técnicos. |
| **Base de datos** | db_compatibility |

---

| MS-07 · provider-service (puerto :8086) | |
| :---- | :---- |
| **Responsabilidad** | Gestiona proveedores externos o referencias de mercado de componentes. |
| **Entidades JPA** | Provider { id, nombre, contacto, sitioWeb, activo } / ProviderProduct { id, providerId, productId, referenciaExterna } |
| **Endpoints REST** | CRUD de proveedores y consulta de referencias externas. |
| **Comunica con** | Es consultado por build-service para entregar referencias externas de componentes. |
| **Base de datos** | db_providers |

---

| MS-08 · build-service (puerto :8087) | |
| :---- | :---- |
| **Responsabilidad** | Núcleo del sistema. Gestiona configuraciones de hardware creadas por el usuario (builds). |
| **Entidades JPA** | Build { id, userId, nombre, estado, createdAt } / BuildItem { id, buildId, productId, cantidad } |
| **Endpoints REST** | CRUD de builds y gestión de componentes dentro de una configuración. |
| **Comunica con** | Consulta product-service, compatibility-service y provider-service para construir y validar builds. |
| **Base de datos** | db_builds |

---

| MS-09 · estimate-service (puerto :8088) | |
| :---- | :---- |
| **Responsabilidad** | Calcula el costo total de una configuración de hardware basada en los componentes seleccionados. |
| **Entidades JPA** | Estimate { id, buildId, totalPrice, currency, createdAt } |
| **Endpoints REST** | POST /api/estimate/calculate, GET /api/estimate/{buildId} |
| **Comunica con** | Consulta build-service y product-service para calcular el costo total. |
| **Base de datos** | db_estimates |

---

| MS-10 · recommendation-service (puerto :8089) | |
| :---- | :---- |
| **Responsabilidad** | Genera recomendaciones de componentes compatibles o mejoras para una configuración existente. |
| **Entidades JPA** | Recommendation { id, buildId, ruleApplied, suggestedProductId, reason, createdAt } |
| **Endpoints REST** | GET /api/recommendations/{buildId}, POST /api/recommendations/generate |
| **Comunica con** | Consulta build-service, product-service y compatibility-service para generar recomendaciones. |
| **Base de datos** | db_recommendations |

---

| MS-11 · notification-service (puerto :8090) | |
| :---- | :---- |
| **Responsabilidad** | Envía notificaciones al usuario sobre eventos del sistema (estimaciones, recomendaciones, cambios en builds). |
| **Entidades JPA** | NotificationLog { id, userId, tipo, contenido, estado, timestamp } |
| **Endpoints REST** | POST /api/notifications/send, GET /api/notifications/logs |
| **Comunica con** | Es consultado por estimate-service y recommendation-service. Consulta user-service para obtener el email del destinatario. |
| **Base de datos** | db_notifications |

## 5.1 Resumen de comunicación inter-servicio

| Servicio origen | Servicio destino | Motivo de la llamada |
| ----- | ----- | ----- |
| **build-service** | **product-service** | Obtener información técnica de componentes para construir configuraciones de hardware |
| **build-service** | **compatibility-service** | Validar compatibilidad entre componentes seleccionados en la build |
| **build-service** | **provider-service** | Consultar disponibilidad o referencias externas de componentes |
| **estimate-service** | **build-service** | Obtener configuración completa para calcular el costo total |
| **estimate-service** | **product-service** | Obtener precios actualizados de los componentes |
| **recommendation-service** | **build-service** | Analizar la configuración actual del usuario para generar sugerencias |
| **recommendation-service** | **product-service** | Obtener catálogo de componentes para generar recomendaciones |
| **recommendation-service** | **compatibility-service** | Validar compatibilidad de recomendaciones generadas |
| **estimate-service** | **notification-service** | Solicitar notificación al usuario cuando se genera una estimación de build |
| **recommendation-service** | **notification-service** | Solicitar notificación de recomendaciones de mejora o compatibilidad al usuario |
| **auth-service** | **user-service** | Asociar credenciales con perfil de usuario durante autenticación y registro |
| **api-gateway** | **auth-service** | Validar tokens JWT en cada solicitud entrante |
```