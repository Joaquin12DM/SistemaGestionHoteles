# Dockerfile template para servicios Spring Boot
FROM openjdk:17-jre-slim

WORKDIR /app

# Crear usuario no-root para seguridad
RUN groupadd -r appuser && useradd -r -g appuser appuser

# Copiar el JAR
COPY target/*.jar app.jar

# Cambiar ownership y permisos
RUN chown appuser:appuser app.jar

# Cambiar a usuario no-root
USER appuser

EXPOSE 8080

HEALTHCHECK --interval=30s --timeout=10s --start-period=60s --retries=3 \
    CMD curl -f http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]
