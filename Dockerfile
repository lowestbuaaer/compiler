FROM openjdk:8
WORKDIR /app/
COPY ./*  ./
RUN pwd
RUN ls
RUN export PATH=$PATH:/app/antlr/antlr-4.9.2-complete.jar
RUN echo $PATH
RUN echo 123
RUN javac main.java -classpath ./antlr/antlr-4.9.2-complete.jar