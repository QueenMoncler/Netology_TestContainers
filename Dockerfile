FROM khipu/openjdk17-alpine
EXPOSE 8080
ADD target/Netology_TestContainers-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]