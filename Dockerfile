FROM openjdk:8
WORKDIR /app/
COPY ./*  ./
COPY ./antlr ./
RUN cp ./antlr-4.9.2-complete.jar /usr/local/openjdk-8/bin/
RUN javac main.java -classpath ./antlr-4.9.2-complete.jar:./