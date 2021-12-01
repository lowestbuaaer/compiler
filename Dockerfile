FROM openjdk:7
COPY ./src/ /app/
WORKDIR /app/
RUN ls
RUN javac -cp ./:./antlr/antlr-4.9.2-complete.jar main.java -encoding utf-8