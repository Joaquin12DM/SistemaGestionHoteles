FROM openjdk:21-jdk-slim

# Instalar curl y otras dependencias necesarias
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copiar el JAR compilado
COPY target/reserva-service-*.jar app.jar

# Variables de entorno para Vault (CORREGIDAS)
ENV VAULT_TOKEN="myroot"
ENV VAULT_HOST="host.docker.internal"
ENV VAULT_PORT="8200"
ENV VAULT_ADDR="http://host.docker.internal:8200"

# Exponer el puerto de la aplicación
EXPOSE 8082

# Copiar el script de inicio
COPY docker-entrypoint.sh /docker-entrypoint.sh
RUN chmod +x /docker-entrypoint.sh

# Usar el script en lugar de java directamente
ENTRYPOINT ["/docker-entrypoint.sh"]