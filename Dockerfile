FROM openjdk:8
WORKDIR /app/
COPY ./*  ./
RUN pwd
RUN ls
RUN cp ./antlr-4.9.2-complete.jar /usr/local/openjdk-8/bin/
RUN echo 123
RUN javac main.java -classpath ./antlr-4.9.2-complete.jar