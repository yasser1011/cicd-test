FROM eclipse-temurin:17-jdk-alpine

COPY demo-cicd-app.jar demo-cicd-app.jar

CMD ["java", "-jar", "demo-cicd-app.jar"]

