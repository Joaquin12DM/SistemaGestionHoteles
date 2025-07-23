# Guía de Desarrollo

## Configuración del Entorno

### Prerrequisitos
- Java 17+
- Node.js 18+
- Docker & Docker Compose
- PostgreSQL (o usar Docker)

### Instalación Inicial

1. **Clonar el repositorio**
   ```bash
   git clone <tu-repo>
   cd SistemaGestionHoteles
   ```

2. **Instalar dependencias**
   ```bash
   npm install
   npm run install:all
   ```

3. **Configurar base de datos**
   ```bash
   docker-compose -f docker/docker-compose.yml up postgres -d
   ```

4. **Ejecutar servicios en desarrollo**
   ```bash
   # Opción 1: Con Docker
   npm run start:dev

   # Opción 2: Manual
   # Terminal 1: API Gateway
   cd services/api-gateway && ./mvnw spring-boot:run

   # Terminal 2: Frontend
   cd frontend && ng serve
   ```

## Estructura de Desarrollo

### Agregar Nuevo Servicio

1. Crear directorio en `services/`
2. Agregar README.md con documentación
3. Configurar puerto único
4. Actualizar docker-compose.yml
5. Actualizar scripts de build

### Convenciones de Código

- **Java**: Google Java Style Guide
- **TypeScript**: TSLint + Prettier
- **Git**: Conventional Commits

### Testing

```bash
# Todos los tests
npm run test:all

# Solo frontend
npm run test:frontend

# Solo backend
npm run test:services
```

## URLs de Desarrollo

- Frontend: http://localhost:4200
- API Gateway: http://localhost:8080
- Auth Service: http://localhost:8081
- Hotel Service: http://localhost:8082
- Booking Service: http://localhost:8083
- User Service: http://localhost:8084
- Payment Service: http://localhost:8085
- Notification Service: http://localhost:8086
