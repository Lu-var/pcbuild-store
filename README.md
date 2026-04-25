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
| **RNF-02** | Todos los endpoints deben validar los datos de entrada y retornar códigos HTTP semánticos (200, 201, 400, 401, 403, 404, 409, 500\) con cuerpo de error estructurado en JSON. |
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

**\[ CLIENTE / BROWSER \]**

|

**\[ API GATEWAY :8080 \]**

*| enrutamiento \+ validacion JWT |*

| auth-service:8081 | user-service:8082 | product-service:8083 | category-service:8084 | compatibility-service:8085 |
| :---: | :---: | :---: | :---: | :---: |
| **inventory-service:8086** | **cart-service:8087** | **order-service:8088** | **payment-service:8089** | **notification-service:8090** |

*Cada servicio tiene su propia base de datos independiente (MySQL)*

### **Flujos de comunicación inter-servicio clave**

* order-service → inventory-service: verifica y reserva stock antes de confirmar orden

* order-service → compatibility-service: valida compatibilidad del carrito antes de crear la orden

* order-service → payment-service: solicita procesamiento del pago

* order-service → notification-service: dispara email al cambiar estado de orden

* cart-service → product-service: consulta precio y disponibilidad al agregar items

# **4\. Historias de Usuario**

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

A continuacion se define cada uno de los 10 microservicios del sistema PCBuild Store, con su responsabilidad, entidades JPA, endpoints REST, dependencias y base de datos propia.

| MS-01 · api-gateway  (puerto :8080) |  |
| :---- | :---- |
| **Responsabilidad** | Actua como unico punto de entrada del sistema. Enruta solicitudes HTTP hacia los microservicios correspondientes, valida tokens JWT y aplica filtros de seguridad globales. |
| **Entidades JPA** | No maneja entidades JPA propias. Configuracion de rutas en application.yml. |
| **Endpoints REST** | Todas las rutas son proxies hacia los servicios internos. No expone logica propia. GET  /actuator/health — estado del gateway. |
| **Comunica con** | Llama internamente a auth-service para validar tokens JWT en cada solicitud entrante. |
| **Base de datos** | Sin base de datos propia (solo configuracion en memoria). |

| MS-02 · auth-service  (puerto :8081) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona la autenticacion de usuarios: registro, login y generacion/validacion de tokens JWT. |
| **Entidades JPA** | Credential { id, email, passwordHash, role, userId, createdAt } @OneToOne con User en user-service (referencia por userId, no FK directa) |
| **Endpoints REST** | POST /api/auth/register — registrar nuevo usuario. POST /api/auth/login — autenticar y obtener JWT. POST /api/auth/logout — invalidar token activo. GET  /api/auth/validate — validar token JWT (usado por gateway). |
| **Comunica con** | Es consultado por api-gateway en cada solicitud para validar JWT. |
| **Base de datos** | db\_auth (MySQL) — tabla: credentials. |

| MS-03 · user-service  (puerto :8082) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona los perfiles de usuario: datos personales, direcciones de despacho y preferencias. |
| **Entidades JPA** | User { id, name, lastName, email, phone, createdAt } Address { id, userId, street, city, region, postalCode, isPrimary } @OneToMany: User \-\> Address |
| **Endpoints REST** | GET  /api/users/{id} — obtener perfil de usuario. PUT  /api/users/{id} — actualizar datos personales. POST /api/users/{id}/addresses — agregar direccion de despacho. GET  /api/users/{id}/addresses — listar direcciones. DELETE /api/users/{id}/addresses/{addrId} — eliminar direccion. |
| **Comunica con** | Es consultado por order-service para obtener email y direccion de despacho al crear una orden. |
| **Base de datos** | db\_users (MySQL) — tablas: users, addresses. |

| MS-04 · category-service  (puerto :8084) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona las categorias de productos del catalogo (CPU, GPU, RAM, Placa Madre, etc.). |
| **Entidades JPA** | Category { id, nombre, slug, descripcion, activa } AttributeDefinition { id, categoryId, nombreAtributo, tipoDato, requerido }  — define que atributos tecnicos tiene cada categoria. @OneToMany: Category \-\> AttributeDefinition |
| **Endpoints REST** | GET  /api/categories — listar todas las categorias activas. GET  /api/categories/{id} — detalle de categoria con sus atributos. POST /api/categories — crear categoria (Admin). PUT  /api/categories/{id} — actualizar categoria (Admin). DELETE /api/categories/{id} — desactivar categoria (Admin). |
| **Comunica con** | Es consultado por product-service para validar que la categoriaId existe al crear/editar un producto. |
| **Base de datos** | db\_categories (MySQL) — tablas: categories, attribute\_definitions. |

| MS-05 · product-service  (puerto :8083) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona el catalogo completo de productos: creacion, actualizacion, busqueda y atributos tecnicos por categoria. |
| **Entidades JPA** | Product { id, nombre, descripcion, precio, categoriaId, marca, modelo, activo, createdAt } ProductAttribute { id, productId, nombreAtributo, valor }  — almacena specs tecnicas (ej: socket=AM5, tdp=125W). @OneToMany: Product \-\> ProductAttribute |
| **Endpoints REST** | GET  /api/products — listar productos (filtros: category, marca, precioMin, precioMax). GET  /api/products/{id} — detalle completo con atributos tecnicos. POST /api/products — crear producto (Admin). PUT  /api/products/{id} — actualizar producto (Admin). DELETE /api/products/{id} — desactivar producto (Admin). GET  /api/products/{id}/attributes — obtener atributos tecnicos. |
| **Comunica con** | Consulta category-service para validar categoriaId. Es consultado por cart-service, order-service y compatibility-service. |
| **Base de datos** | db\_products (MySQL) — tablas: products, product\_attributes. |

| MS-06 · compatibility-service  (puerto :8085) |  |
| :---- | :---- |
| **Responsabilidad** | Verifica la compatibilidad tecnica entre dos o mas componentes, basandose en sus atributos y reglas de compatibilidad precargadas. |
| **Entidades JPA** | CompatibilityRule { id, categoryA, atributoA, operador, categoryB, atributoB, descripcionError }   — ejemplo: CPU.socket EQUALS MotherBoard.socket CompatibilityCheck { id, productoIds\[\], resultado, detalle, timestamp }  — historial de verificaciones. |
| **Endpoints REST** | POST /api/compatibility/check — verificar compatibilidad entre lista de productIds. GET  /api/compatibility/rules — listar reglas vigentes (Admin). POST /api/compatibility/rules — crear regla de compatibilidad (Admin). DELETE /api/compatibility/rules/{id} — eliminar regla (Admin). |
| **Comunica con** | Consulta product-service para obtener los atributos tecnicos de cada producto a verificar. Es consultado por order-service antes de confirmar una orden. |
| **Base de datos** | db\_compatibility (MySQL) — tablas: compatibility\_rules, compatibility\_checks. |

| MS-07 · inventory-service  (puerto :8086) |  |
| :---- | :---- |
| **Responsabilidad** | Controla el stock disponible y reservado de cada producto, procesando movimientos de entrada, reserva y liberacion. |
| **Entidades JPA** | Stock { id, productId, cantidadDisponible, cantidadReservada, umbralAlerta } StockMovement { id, productId, tipo (ENTRADA/RESERVA/LIBERACION/DESPACHO), cantidad, referencia, timestamp } |
| **Endpoints REST** | GET  /api/inventory/{productId} — consultar stock actual. GET  /api/inventory — listar todos (Admin, con filtro alertas). POST /api/inventory/{productId}/reserve — reservar cantidad para una orden. POST /api/inventory/{productId}/release — liberar reserva (orden cancelada). POST /api/inventory/{productId}/dispatch — confirmar despacho (reduce reserva). PUT  /api/inventory/{productId} — ajustar stock manualmente (Admin). |
| **Comunica con** | Es consultado por order-service al confirmar y cancelar ordenes. Puede ser consultado por product-service para mostrar disponibilidad. |
| **Base de datos** | db\_inventory (MySQL) — tablas: stock, stock\_movements. |

| MS-08 · cart-service  (puerto :8087) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona el carrito de compras activo de cada cliente autenticado, incluyendo items, cantidades y calculo de totales. |
| **Entidades JPA** | Cart { id, userId, estado (ACTIVO/CONVERTIDO), updatedAt } CartItem { id, cartId, productId, cantidad, precioUnitario } @OneToMany: Cart \-\> CartItem |
| **Endpoints REST** | GET  /api/cart — obtener carrito activo del cliente autenticado. POST /api/cart/items — agregar item al carrito. PUT  /api/cart/items/{itemId} — actualizar cantidad de item. DELETE /api/cart/items/{itemId} — eliminar item del carrito. DELETE /api/cart — vaciar carrito completo. GET  /api/cart/total — calcular total actual del carrito. |
| **Comunica con** | Consulta product-service para validar existencia y obtener precio actual. Consulta inventory-service para verificar stock antes de agregar item. |
| **Base de datos** | db\_cart (MySQL) — tablas: carts, cart\_items. |

| MS-09 · order-service  (puerto :8088) |  |
| :---- | :---- |
| **Responsabilidad** | Orquesta la creacion, seguimiento y gestion del ciclo de vida de las ordenes de compra. |
| **Entidades JPA** | Order { id, userId, estado (PENDIENTE/PROCESANDO/DESPACHADO/ENTREGADO/CANCELADO), total, createdAt } OrderItem { id, orderId, productId, nombreProducto, cantidad, precioUnitario } @OneToMany: Order \-\> OrderItem |
| **Endpoints REST** | POST /api/orders — crear orden desde carrito activo. GET  /api/orders — listar ordenes del cliente autenticado. GET  /api/orders/{id} — detalle de orden. PATCH /api/orders/{id}/status — actualizar estado (Admin). POST /api/orders/{id}/cancel — cancelar orden pendiente (Cliente). |
| **Comunica con** | Consulta compatibility-service (validar compatibilidad antes de crear). Consulta inventory-service (reservar stock). Consulta user-service (email para notificacion). Llama a payment-service (procesar pago). Llama a notification-service (avisar cambio de estado). |
| **Base de datos** | db\_orders (MySQL) — tablas: orders, order\_items. |

| MS-10 · payment-service  (puerto :8089) |  |
| :---- | :---- |
| **Responsabilidad** | Procesa los pagos asociados a ordenes de compra mediante integracion con pasarela simulada, y registra el historial de transacciones. |
| **Entidades JPA** | Payment { id, orderId, monto, estado (PENDIENTE/APROBADO/RECHAZADO/REEMBOLSADO), metodoPago, referenciaPasarela, timestamp } Refund { id, paymentId, monto, motivo, timestamp } |
| **Endpoints REST** | POST /api/payments — iniciar pago para una orden. GET  /api/payments/{orderId} — consultar estado de pago de una orden. POST /api/payments/{id}/refund — solicitar reembolso (Admin). GET  /api/payments — listar todas las transacciones (Admin). |
| **Comunica con** | Es llamado por order-service al confirmar una orden. Notifica a order-service el resultado del pago para actualizar el estado. |
| **Base de datos** | db\_payments (MySQL) — tablas: payments, refunds. |

| MS-11 · notification-service  (puerto :8090) |  |
| :---- | :---- |
| **Responsabilidad** | Gestiona el envio de notificaciones por correo electronico a los clientes ante eventos del sistema (cambio de estado de orden, confirmacion de pago, etc.). |
| **Entidades JPA** | NotificationLog { id, userId, email, tipo, asunto, contenido, estado (ENVIADO/FALLIDO), timestamp } |
| **Endpoints REST** | POST /api/notifications/send — enviar notificacion (consumido internamente por otros servicios). GET  /api/notifications/logs — historial de notificaciones (Admin). GET  /api/notifications/logs?userId={id} — historial por usuario. |
| **Comunica con** | Es llamado por order-service al cambiar estado de orden y por payment-service al confirmar/rechazar pago. Consulta user-service para obtener el email del destinatario. |
| **Base de datos** | db\_notifications (MySQL) — tabla: notification\_logs. |

## **5.1 Resumen de comunicación inter-servicio**

| Servicio origen | Servicio destino | Motivo de la llamada |
| ----- | ----- | ----- |
| **order-service** | **compatibility-service** | Validar compatibilidad de items del carrito antes de crear la orden |
| **order-service** | **inventory-service** | Reservar stock al confirmar orden / liberar al cancelar |
| **order-service** | **payment-service** | Solicitar procesamiento del pago |
| **order-service** | **user-service** | Obtener email y direccion del cliente |
| **order-service** | **notification-service** | Enviar notificacion al cambiar estado de la orden |
| **cart-service** | **product-service** | Validar existencia y obtener precio al agregar items |
| **cart-service** | **inventory-service** | Verificar stock disponible antes de agregar al carrito |
| **compatibility-service** | **product-service** | Obtener atributos tecnicos de cada componente a verificar |
| **product-service** | **category-service** | Validar que la categoria del producto existe |
| **payment-service** | **order-service** | Notificar resultado del pago para actualizar estado de la orden |

