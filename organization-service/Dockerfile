FROM eclipse-temurin:17-jdk-alpine as build

# Add Maintainer Info
LABEL authors="olakunle <olakunlebalogun247@gmail.com>"
LABEL maintainer="olakunle <olakunlebalogun247@gmail.com>"

# The application's jar file
ARG JAR_FILE=target/organization-service.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

#unpackage jar file
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)

#stage 2
#Same Java runtime
FROM eclipse-temurin:17-jdk-alpine

#Add volume pointing to /tmp
VOLUME /tmp

#Copy unpackaged application to new container
ARG DEPENDENCY=/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

#execute the application
ENTRYPOINT ["java","-cp","app:app/lib/*","com.optimagrowth.organizationservice.OrganizationServiceApplication"]