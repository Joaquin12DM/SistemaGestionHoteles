@echo off
REM Script para construir todos los servicios en Windows

echo 🚀 Construyendo todos los servicios...

REM Frontend
echo 📱 Construyendo frontend...
cd frontend
npm install
npm run build
cd ..

REM Servicios backend
set services=api-gateway auth-service hotel-service booking-service user-service payment-service notification-service

for %%s in (%services%) do (
    echo 🛠️ Construyendo %%s...
    cd services\%%s
    mvnw.cmd clean package -DskipTests
    cd ..\..
)

echo ✅ Todos los servicios construidos exitosamente!
