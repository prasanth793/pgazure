FROM openjdk:11
COPY target/pgazure-0.0.1-SNAPSHOT.jar pgazure.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/pgazure.jar"]