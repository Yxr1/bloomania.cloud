# bloomania.cloud

Vaadin website for my homelab.

Built with Spring Boot 4.0.0 and Vaadin 24.9.6 for long-term support and current security patches.

## Getting started

1. Ensure Java 21+ and Maven are installed.
2. Run the development server (automatically installs the Vaadin frontend toolchain on first run):
   ```bash
   mvn spring-boot:run
   ```
   The app will be available at http://localhost:8080.
3. To create a production build with an optimized frontend bundle:
    ```bash
    mvn clean package -Pproduction
    ```
    The executable JAR will be written to `target/`.

## Project structure
- `pom.xml`: Maven configuration with Vaadin and Spring Boot dependencies.
- `src/main/java/com/bloomania/cloud/BloomaniaApplication.java`: Spring Boot entry point.
- `src/main/java/com/bloomania/cloud/views/MainView.java`: Default Vaadin view.
- `src/main/resources/application.properties`: Application configuration placeholder.
