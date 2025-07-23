# Payment Service

Servicio para el procesamiento de pagos.

## Responsabilidades
- Procesamiento de pagos
- Integración con pasarelas de pago
- Gestión de transacciones
- Reembolsos
- Historial de pagos

## Tecnología
- Spring Boot
- Integración con Stripe/PayPal
- Puerto: 8085

## Endpoints
- `POST /payments/process` - Procesar pago
- `GET /payments/{id}` - Obtener pago por ID
- `POST /payments/{id}/refund` - Procesar reembolso
- `GET /payments/booking/{bookingId}` - Pagos por reserva
- `GET /payments/user/{userId}` - Historial de pagos
