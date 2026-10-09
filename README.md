Een REST API voor een eenvoudig belastingsysteem.


## Functionaliteiten
- Gebruikers registreren en inloggen
- Belastingen toevoegen, bekijken en verwijderen
- Beveiliging met JWT en rollen (admin en gebruiker)
- Elke gebruiker heeft alleen toegang tot zijn eigen gegevens
- Wachtwoorden worden versleuteld opgeslagen met BCrypt

## Technieken
- Java 21, Spring Boot
- Spring Security, JWT
- Spring Data JPA, Hibernate
- PostgreSQL
- Docker en docker-compose
- Swagger (API-documentatie)

## Architectuur
Controller → Service → Repository → Database
DTO's tussen de controller en de service.

## Starten
docker compose up --build

De API draait op http://localhost:8080
Swagger: http://localhost:8080/swagger-ui/index.html

