#Build stage
FROM maven:3.8.7-openjdk-18 AS build
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

#Runtime stage
FROM amazoncorretto:17

WORKDIR /app
COPY --from=build /build/target/InventoryManagementSystem-*.jar /app/

EXPOSE 8088

CMD java -jar InventoryManagementSystem-1.0.0.jar