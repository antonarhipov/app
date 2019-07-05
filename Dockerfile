FROM openjdk:8-jre
ADD build/libs/app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar","/app.jar"]