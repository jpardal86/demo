FROM adoptopenjdk/openjdk8-openj9:alpine-slim

RUN apk add maven
ENV PROJECT_HOME /usr/src/server

COPY . /usr/src/server

WORKDIR /usr/src/server

RUN mvn clean package -Dmaven.test.skip=true

CMD ["sh", "-c", "java -jar target/demo-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080