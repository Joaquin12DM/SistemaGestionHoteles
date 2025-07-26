@echo off
echo Compilando el proyecto...
mvn clean package -DskipTests

echo Construyendo imagen Docker...
docker-compose build

echo Iniciando servicios...
docker-compose up -d

echo Esperando a que los servicios esten listos...
timeout /t 30 /nobreak

echo Verificando estado de los servicios...
docker-compose ps

echo Para ver los logs: docker-compose logs -f
echo Para detener: docker-compose down
pause