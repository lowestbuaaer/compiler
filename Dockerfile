FROM openjdk:8
WORKDIR /app/
RUN mkdir antlr
COPY ./* ./antlr
COPY ./*  ./
RUN cp ./antlr-4.9.2-complete.jar /usr/local/openjdk-8/bin/
RUN javac main.java -cp ./:./antlr-4.9.2-complete.jar