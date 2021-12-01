FROM openjdk:8
WORKDIR /app/
COPY ./*  ./
COPY ./antlr ./
RUN pwd
RUN ls
RUN cp ./* /usr/local/openjdk-8/bin/
RUN echo 123
RUN javac main.java -classpath ./antlr-4.9.2-complete.jar: