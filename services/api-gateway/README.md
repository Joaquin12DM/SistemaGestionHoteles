# API Gateway

Gateway principal que actúa como punto de entrada único para todas las requests del frontend.

## Responsabilidades
- Enrutamiento de requests a los servicios correspondientes
- Autenticación y autorización
- Rate limiting
- Logging centralizado
- Load balancing

## Tecnología
- Spring Boot con Spring Cloud Gateway
- Puerto: 8080

## Endpoints
- `/api/auth/**` → auth-service
- `/api/hotels/**` → hotel-service  
- `/api/bookings/**` → booking-service
- `/api/users/**` → user-service
- `/api/payments/**` → payment-service
- `/api/notifications/**` → notification-service
