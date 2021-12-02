FROM openjdk:12
COPY . /app/
WORKDIR /app/
RUN cd src
RUN export CLASSPATH=$CLASSPATH:./antlr/antlr-4.9.2-complete.jar
RUN javac  main.java