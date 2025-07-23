# Notification Service

Servicio para el envío de notificaciones y emails.

## Responsabilidades
- Envío de emails
- Notificaciones push
- SMS (opcional)
- Templates de mensajes
- Cola de mensajes

## Tecnología
- Spring Boot
- RabbitMQ/Apache Kafka
- Integración con SendGrid/SES
- Puerto: 8086

## Endpoints
- `POST /notifications/email` - Enviar email
- `POST /notifications/push` - Enviar notificación push
- `GET /notifications/templates` - Listar templates
- `POST /notifications/templates` - Crear template
