FROM openjdk:12
WORKDIR /app/
COPY ./src/ ./
RUN ls
RUN export CLASSPATH=$CLASSPATH:./antlr/antlr-4.9.2-complete.jar:.
RUN echo $CLASSPATH
RUN javac  main.java