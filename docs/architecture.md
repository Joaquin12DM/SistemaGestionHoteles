# Arquitectura del Sistema

## Diagrama de Arquitectura

```
┌─────────────────┐    ┌─────────────────┐
│   Frontend      │    │   API Gateway   │
│   (Angular)     │────│   (Port 8080)   │
│   Port 4200     │    │                 │
└─────────────────┘    └─────────────────┘
                              │
                    ┌─────────┼─────────┐
                    │         │         │
        ┌───────────▼──┐  ┌───▼────┐  ┌─▼─────────┐
        │ Auth Service │  │ Hotel  │  │ Booking   │
        │ Port 8081    │  │Service │  │ Service   │
        │              │  │Port    │  │ Port 8083 │
        └──────────────┘  │8082    │  └───────────┘
                          └────────┘
        ┌──────────────┐  ┌─────────────┐  ┌─────────────┐
        │ User Service │  │ Payment     │  │Notification │
        │ Port 8084    │  │ Service     │  │ Service     │
        │              │  │ Port 8085   │  │ Port 8086   │
        └──────────────┘  └─────────────┘  └─────────────┘
                          │
                    ┌─────▼─────┐
                    │PostgreSQL │
                    │Port 5432  │
                    └───────────┘
```

## Flujo de Datos

1. **Cliente → API Gateway**: Todas las requests pasan por el gateway
2. **API Gateway → Auth Service**: Validación de tokens
3. **API Gateway → Servicios**: Enrutamiento según endpoint
4. **Servicios → Base de Datos**: Operaciones CRUD
5. **Notification Service**: Envío asíncrono de notificaciones

## Patrones Implementados

- **API Gateway Pattern**: Punto único de entrada
- **Microservices**: Servicios independientes y especializados
- **Database per Service**: Cada servicio maneja su dominio
- **Event-Driven**: Comunicación asíncrona vía eventos
