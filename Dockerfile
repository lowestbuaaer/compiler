FROM openjdk:1.8.0
WORKDIR /app/
COPY ./* ./antlr/
COPY ./*  ./
RUN ls
RUN cd antlr
RUN ls
RUN cp ./antlr-4.9.2-complete.jar /usr/local/openjdk-8/bin/
RUN javac main.java -cp ./:./antlr-4.9.2-complete.jar