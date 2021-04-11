
FROM openjdk:11-jdk
MAINTAINER Sofiya San <sungsofiya@gmail.com>
ARG JAR_FILE=out/artifacts/backend_jar/backend.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
