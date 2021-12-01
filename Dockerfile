FROM openjdk:8
WORKDIR /app/
COPY ./* ./
RUN pwd
RUN ls
RUN export CLASSPATH=$CLASSPATH:/app/antlr/antlr-4.9.2-complete.jar
RUN echo $CLASSPATH
RUN javac main.java