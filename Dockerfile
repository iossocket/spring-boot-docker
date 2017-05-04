FROM openjdk:8-jre-alpine
RUN adduser -D my-app-user
RUN mkdir /app
WORKDIR /app

ADD ./build/libs/spring-boot-docker-spike.jar /app/lib/

RUN chown -R my-app-user /app
USER my-app-user
EXPOSE 8080
CMD ["java", "-jar", "/app/lib/spring-boot-docker-spike.jar"]
