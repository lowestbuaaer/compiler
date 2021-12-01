FROM openjdk:8

COPY ./* ./
RUN export CLASSPATH=$CLASSPATH:./antlr/antlr-4.9.2-complete.jar
RUN javac main.java