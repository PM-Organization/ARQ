
# Usar la imagen de Quarkus para la construcción
FROM quay.io/quarkus/quarkus-distroless-image:1.0 AS build

# Copiar el código fuente al contenedor
COPY . /usr/src/app

# Cambiar al directorio de la aplicación
WORKDIR /usr/src/app

# Construir el proyecto con Maven
RUN ./mvnw package -DskipTests

# Usar la imagen runtime de Quarkus
FROM quay.io/quarkus/quarkus-distroless-image:1.0

# Copiar el JAR generado al contenedor
COPY --from=build /usr/src/app/target/*-runner.jar /app/app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

