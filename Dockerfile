FROM eclipse-temurin:17

LABEL author=eduarchilon

COPY target/mail-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]