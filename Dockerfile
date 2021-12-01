FROM openjdk:8

COPY ./* ./
RUN pwd
RUN ls
RUN export CLASSPATH=$CLASSPATH:./antlr/antlr-4.9.2-complete.jar
RUN echo $CLASSPATH
RUN javac main.java