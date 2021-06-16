FROM openjdk:11-jdk
VOLUME /tmp
COPY target/payment-service-1.3.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]