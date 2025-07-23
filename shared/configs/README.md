# Configuraciones Compartidas

Este directorio contiene archivos de configuración que se comparten entre diferentes servicios.

## Archivos de configuración

- `database.config.js` - Configuración de base de datos
- `jwt.config.js` - Configuración de JWT
- `cors.config.js` - Configuración de CORS
- `swagger.config.js` - Configuración de Swagger/OpenAPI
- `logging.config.js` - Configuración de logging

## Uso

Los servicios pueden importar estas configuraciones para mantener consistencia:

```javascript
const dbConfig = require('../../shared/configs/database.config');
const jwtConfig = require('../../shared/configs/jwt.config');
```
