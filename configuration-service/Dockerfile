FROM eclipse-temurin:17-jdk-alpine as build

LABEL maintainer="Olakune Balogun <olakunebalogun247@gmail.com>"

ARG JAR_FILE=target/configuration-service.jar

COPY ${JAR_FILE} app.jar

RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)

# STAGE TWO

FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

ARG DEPENDENCY=/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","com.olakunle.configurationservice.ConfigurationServiceApplication"]