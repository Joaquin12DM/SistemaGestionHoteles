# Hotel Service

Servicio para la gestión de hoteles, habitaciones y servicios adicionales.

## Responsabilidades
- CRUD de hoteles
- Gestión de habitaciones y tipos
- Servicios adicionales (spa, restaurante, etc.)
- Precios y disponibilidad
- Imágenes y multimedia

## Tecnología
- Spring Boot + JPA
- PostgreSQL
- Puerto: 8082

## Endpoints
- `GET /hotels` - Listar hoteles
- `POST /hotels` - Crear hotel
- `GET /hotels/{id}` - Obtener hotel por ID
- `PUT /hotels/{id}` - Actualizar hotel
- `DELETE /hotels/{id}` - Eliminar hotel
- `GET /hotels/{id}/rooms` - Habitaciones del hotel
- `POST /hotels/{id}/rooms` - Crear habitación
