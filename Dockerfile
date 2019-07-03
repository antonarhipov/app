FROM openjdk:8-jre
ADD build/libs/app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8010
ENTRYPOINT ["java", "-jar","/app.jar"]