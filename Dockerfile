FROM openjdk:11-jdk
VOLUME /tmp
COPY target/payment-service-*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]