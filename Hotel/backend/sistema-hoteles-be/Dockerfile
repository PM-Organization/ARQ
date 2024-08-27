# Use a Quarkus base image
FROM quay.io/quarkus/ubi-quarkus-native-image:22.2.0-java11 AS build
WORKDIR /work/
COPY mvnw ./
COPY .mvn .mvn
COPY pom.xml ./
COPY src ./src
RUN ./mvnw package -Pnative -Dquarkus.native.container-build=true -DskipTests

# Use a smaller base image for runtime
FROM quay.io/quarkus/quarkus-micro-image:1.0
WORKDIR /work/
COPY --from=build /work/target/*-runner /work/application
EXPOSE 8085
CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]

