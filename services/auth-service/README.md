# Auth Service

Servicio de autenticación y autorización del sistema.

## Responsabilidades
- Registro de usuarios
- Login/Logout
- Gestión de tokens JWT
- Roles y permisos
- Recuperación de contraseñas

## Tecnología
- Spring Boot + Spring Security
- JWT tokens
- Puerto: 8081

## Endpoints
- `POST /auth/register` - Registro de usuario
- `POST /auth/login` - Iniciar sesión
- `POST /auth/logout` - Cerrar sesión
- `POST /auth/refresh` - Renovar token
- `POST /auth/forgot-password` - Recuperar contraseña
