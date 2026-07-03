# back-Ventas_SpringBoot

Backend básico en Spring Boot para la gestión de ventas, ejecutándose en el puerto 8083.

## Requisitos
- Java 17
- Maven 3.8+
- Docker (opcional)

## Endpoints

- `GET /api/ventas`: Retorna un JSON con 3 ventas de prueba estáticas.

## Ejecución Local

1. Compilar el proyecto:
   ```bash
   mvn clean package
   ```

2. Ejecutar:
   ```bash
   mvn spring-boot:run
   ```
   El servicio estará disponible en `http://localhost:8083`

## Uso con Docker

1. Construir la imagen:
   ```bash
   docker build -t back-ventas .
   ```

2. Ejecutar el contenedor:
   ```bash
   docker run -p 8083:8083 back-ventas
   ```