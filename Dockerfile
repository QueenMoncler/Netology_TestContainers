FROM khipu/openjdk17-alpine
EXPOSE 8081
ADD target/Netology_TestContainers-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]