FROM eclipse-temurin:17-jdk-alpine as build

LABEL authors="olakunle <olakunlebalogun247@gmail.com>"
LABEL maintainer="olakunle <olakunlebalogun247@gmail.com>"

# Sets the file creator to olakunle i.e the system user and its group
RUN addgroup olakunle && adduser -S -G olakunle olakunle

ARG JAR_FILE=target/configuration-service.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]