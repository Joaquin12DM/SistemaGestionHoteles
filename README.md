# Proyecto Sistema de Gestión de Hoteles - Monorepo

## Estructura del Proyecto

Este es un monorepo que contiene el frontend con Angular y como backend servicios que sera usados en el sistema de gestión de hoteles

### Frontend
- **Angular**: Aplicación web principal para la interfaz de usuario

### Servicios Backend
- **reservas-service**: Microservicio para la gestión completa del ciclo de vida de reservas hoteleras. Maneja operaciones CRUD de reservas.
- **por definir**: '''''''
- **por definir**: '''''''
- **por definir**: '''''''

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
- **Backend**: Spring Boot (Java) 
- **Base de Datos**: SQLServer
- **Containerización**: Docker(Aun por definir)
- **Orquestación**: Docker Compose / Kubernetes(Aun por definir)
