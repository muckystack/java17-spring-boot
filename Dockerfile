# Etapa 1: Compilar el proyecto con Maven y Java 17
FROM maven:3.9.4-eclipse-temurin-17 AS builder

WORKDIR /app
COPY pom.xml .
COPY src ./src

# Compila el proyecto y genera el JAR en target/
RUN mvn clean package -DskipTests

# Etapa 2: Imagen ligera solo con Java 17 y el JAR compilado
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copia el JAR desde el builder
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
