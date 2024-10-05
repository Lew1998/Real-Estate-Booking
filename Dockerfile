FROM openjdk:21-jdk

WORKDIR /app

COPY target/real-estate-booking-0.0.1-SNAPSHOT.jar /app/real-estate-booking.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/real-estate-booking.jar"]

ENV DB_URL=jdbc:postgresql://postgres:5432/realestatebooking
ENV DB_USERNAME=potest
ENV DB_PASSWORD=potest
ENV SPRING_PROFILES_ACTIVE=server
