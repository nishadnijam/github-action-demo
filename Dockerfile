FROM openjdk:21-jdk
ARG JAR_FILE=target/github-action-demo-*.jar
COPY ${JAR_FILE} github-action-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "github-action-api.jar"]