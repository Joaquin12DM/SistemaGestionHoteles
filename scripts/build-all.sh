#!/bin/bash

# Script para construir todos los servicios
echo "🚀 Construyendo todos los servicios..."

# Frontend
echo "📱 Construyendo frontend..."
cd frontend && npm install && npm run build && cd ..

# Servicios backend
services=("api-gateway" "auth-service" "hotel-service" "booking-service" "user-service" "payment-service" "notification-service")

for service in "${services[@]}"
do
    echo "🛠️ Construyendo $service..."
    cd "services/$service" && ./mvnw clean package -DskipTests && cd ../..
done

echo "✅ Todos los servicios construidos exitosamente!"
