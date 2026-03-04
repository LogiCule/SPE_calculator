FROM openjdk:17-ea-17-slim
WORKDIR /app
COPY target/scientific_calc-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]