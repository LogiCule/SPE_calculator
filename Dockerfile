FROM openjdk:17-ea-17-slim
WORKDIR /app
COPY target/scientific_calc-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["bash","-c","until [ -t 0 ]; do sleep 1; done; java -jar app.jar"]