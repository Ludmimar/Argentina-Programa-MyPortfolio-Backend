Proyecto: API REST Portfolio Personal
Desarrollé una aplicación backend en Spring Boot conectada a una base de datos MySQL (hospedada en Clever Cloud) para gestionar información de un portfolio web.
El proyecto implementa un sistema CRUD completo para administrar:

Personas: datos personales y perfil.
Educación: registros académicos.
Experiencia: proyectos y experiencia laboral.

Se aplicaron conceptos como:
Arquitectura RESTful con controladores (@RestController).
Conexión a base de datos mediante Spring Data JPA y repositorios.
Entidades JPA para mapear tablas en la base de datos.
Configuración de seguridad básica con CORS para integrarse con el frontend desplegado en Firebase.

👉 Este proyecto demuestra mis conocimientos en Java, Spring Boot, APIs REST, persistencia de datos y despliegue en la nube, integrando backend con frontend en un portfolio interactivo.

⚙️ Tecnologías utilizadas
Java 11+ → lenguaje de programación principal.
Spring Boot → framework backend para crear aplicaciones REST.
Spring Data JPA → para la persistencia de datos y consultas a la base.
Hibernate → ORM usado internamente para mapear entidades a tablas.
MySQL (Clever Cloud) → base de datos relacional en la nube.
Maven → gestión de dependencias y build del proyecto.
Lombok → para simplificar código (getters, setters, etc.).
Tomcat embebido → servidor web que levanta la API.
REST API → comunicación entre frontend y backend.
CORS (Cross-Origin Resource Sharing) → integración segura con el frontend.
Firebase Hosting (para el frontend que consume la API).
