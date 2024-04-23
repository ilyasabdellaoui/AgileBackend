FROM openjdk:17
EXPOSE 8080
ARG JAR_FILE=target/AgileBackend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "${JAR_FILE}"]