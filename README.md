# bloomania.cloud

Vaadin website for my homelab.

## Getting started

1. Ensure Java 21+ and Maven are installed.
2. Run the development server:
   ```bash
   mvn spring-boot:run
   ```
   The app will be available at http://localhost:8080.
3. To create a production build:
   ```bash
   mvn package
   ```
   The executable JAR will be written to `target/`.

## Project structure
- `pom.xml`: Maven configuration with Vaadin and Spring Boot dependencies.
- `src/main/java/com/bloomania/cloud/BloomaniaApplication.java`: Spring Boot entry point.
- `src/main/java/com/bloomania/cloud/views/MainView.java`: Default Vaadin view.
- `src/main/resources/application.properties`: Application configuration placeholder.
