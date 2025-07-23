# Tipos TypeScript Compartidos

Este directorio contiene las definiciones de tipos TypeScript que se comparten entre el frontend y los servicios backend (si usan Node.js).

## Estructura recomendada

```
types/
├── user.types.ts          # Tipos relacionados con usuarios
├── hotel.types.ts         # Tipos relacionados con hoteles
├── booking.types.ts       # Tipos relacionados con reservas
├── payment.types.ts       # Tipos relacionados con pagos
├── notification.types.ts  # Tipos relacionados con notificaciones
├── common.types.ts        # Tipos comunes
└── api.types.ts          # Tipos para responses de API
```

## Uso

En el frontend Angular:
```typescript
import { User, UserRole } from '../../../shared/types/user.types';
```

En servicios Node.js:
```typescript
import { Hotel, Room } from '../../shared/types/hotel.types';
```
