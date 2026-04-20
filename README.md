@juanse la di toda :c


Nataly piedrahita
Leonardo Sepulveda 

# DimensionLog - Backend

microservicio hecho en spring boot para el proyecto de programacion web 2.

## Tecnologias

- Java 17
- Spring Boot
- PostgreSQL
- Docker

## Como correr

primero asegurate de tener docker instalado, luego:

```bash
./gradlew bootJar
docker-compose up --build
```

el servicio queda corriendo en el puerto 8080

## Endpoints

- GET /api/characters
- GET /api/characters/{id}
- GET /api/episodes
- GET /api/episodes/{id}
- GET /api/locations
- GET /api/locations/{id}

## Base de datos

se usa postgreSQL con datos precargados de rick and morty, personajes, episodios y locaciones.
