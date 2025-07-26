#!/bin/bash

echo "Esperando a que Vault esté disponible en ${VAULT_ADDR}..."

# Función para verificar si Vault está disponible
wait_for_vault() {
    local retries=30
    local count=0

    until curl -s "${VAULT_ADDR}/v1/sys/health" > /dev/null 2>&1; do
        count=$((count + 1))
        if [ $count -eq $retries ]; then
            echo "Error: Vault no está disponible después de ${retries} intentos"
            exit 1
        fi
        echo "Vault no está disponible todavía, esperando... (intento ${count}/${retries})"
        sleep 3
    done
    echo "¡Vault está disponible!"
}

# Esperar a que Vault esté listo
wait_for_vault

# Verificar que las variables están configuradas
echo "Configuración de Vault:"
echo "  VAULT_ADDR: ${VAULT_ADDR}"
echo "  VAULT_HOST: ${VAULT_HOST}"
echo "  VAULT_PORT: ${VAULT_PORT}"

# Iniciar la aplicación Spring Boot
echo "Iniciando reserva-service..."
exec java -jar app.jar