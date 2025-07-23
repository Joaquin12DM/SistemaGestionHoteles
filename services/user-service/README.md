# User Service

Servicio para la gestión de usuarios y perfiles.

## Responsabilidades
- Gestión de perfiles de usuario
- Información personal
- Preferencias
- Historial de reservas
- Roles de usuario (cliente, admin, empleado)

## Tecnología
- Spring Boot + JPA
- PostgreSQL
- Puerto: 8084

## Endpoints
- `GET /users` - Listar usuarios
- `POST /users` - Crear usuario
- `GET /users/{id}` - Obtener usuario por ID
- `PUT /users/{id}` - Actualizar usuario
- `DELETE /users/{id}` - Eliminar usuario
- `GET /users/{id}/profile` - Perfil del usuario
- `PUT /users/{id}/profile` - Actualizar perfil
