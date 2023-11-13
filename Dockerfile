FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/cambio-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]