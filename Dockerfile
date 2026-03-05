FROM openjdk:17-ea-17-slim
WORKDIR /app
COPY target/scientific_calc-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["bash","-c","read -t 365d dummy || true; exec java -jar app.jar"]