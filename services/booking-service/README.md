# Booking Service

Servicio para la gestión de reservas y disponibilidad.

## Responsabilidades
- Crear y gestionar reservas
- Verificar disponibilidad
- Cancelaciones y modificaciones
- Estados de reserva
- Integración con hotel-service

## Tecnología
- Spring Boot + JPA
- PostgreSQL
- Puerto: 8083

## Endpoints
- `GET /bookings` - Listar reservas
- `POST /bookings` - Crear reserva
- `GET /bookings/{id}` - Obtener reserva por ID
- `PUT /bookings/{id}` - Actualizar reserva
- `DELETE /bookings/{id}` - Cancelar reserva
- `GET /bookings/availability` - Verificar disponibilidad
- `GET /bookings/user/{userId}` - Reservas por usuario
