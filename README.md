# Sistema de Gestión de Hoteles - Monorepo

## Estructura del Proyecto

Este es un monorepo que contiene tanto el frontend como múltiples servicios de backend para el sistema de gestión de hoteles.

### Frontend
- **Angular**: Aplicación web principal para la interfaz de usuario

### Servicios Backend
- **api-gateway**: Gateway principal para el enrutamiento de APIs
- **auth-service**: Servicio de autenticación y autorización
- **hotel-service**: Gestión de hoteles, habitaciones y servicios
- **booking-service**: Gestión de reservas y disponibilidad
- **user-service**: Gestión de usuarios y perfiles
- **payment-service**: Procesamiento de pagos
- **notification-service**: Envío de notificaciones y emails

### Estructura de Carpetas Recomendada
```
/
├── frontend/
│   └── hotel-management-app/     # Aplicación Angular
├── services/
│   ├── api-gateway/              # Gateway principal
│   ├── auth-service/             # Autenticación
│   ├── hotel-service/            # Gestión de hoteles
│   ├── booking-service/          # Reservas
│   ├── user-service/             # Usuarios
│   ├── payment-service/          # Pagos
│   └── notification-service/     # Notificaciones
├── shared/
│   ├── common/                   # Librerías compartidas
│   ├── types/                    # Tipos TypeScript compartidos
│   └── configs/                  # Configuraciones compartidas
├── docs/                         # Documentación
├── docker/                       # Archivos Docker
└── scripts/                      # Scripts de automatización
```

## Tecnologías
- **Frontend**: Angular 17+
- **Backend**: Spring Boot (Java) / Node.js (según servicio)
- **Base de Datos**: PostgreSQL, MongoDB
- **Containerización**: Docker
- **Orquestación**: Docker Compose / Kubernetes
