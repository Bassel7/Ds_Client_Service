FROM openjdk:8
VOLUME /tmp
ADD target/Client-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8886
ENTRYPOINT ["java","-jar","app.jar"]