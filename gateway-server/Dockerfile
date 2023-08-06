#stage 1
#Start with a base image containing Java runtime
FROM eclipse-temurin:17-jdk-alpine as build

# Add Maintainer Info
LABEL maintainer="Olakune Balogun <olakunebalogun247@gmail.com>"

# The application's jar file
ARG JAR_FILE=target/gateway-server.jar

LABEL authors="olakunle <olakunlebalogun247@gmail.com>"
LABEL maintainer="olakunle <olakunlebalogun247@gmail.com>"

# Sets the file creator to olakunle i.e the system user and its group
RUN addgroup olakunle && adduser -S -G olakunle olakunle
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
ENTRYPOINT ["java","-cp","app:app/lib/*","com.optimagrowth.gateway.ApiGatewayServerApplication"]