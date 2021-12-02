FROM openjdk:12
WORKDIR /app/
COPY ./src/ ./
ENV CLASSPATH=$CLASSPTH:.:./antlr/antlr-4.9.2-complete.jar
RUN javac  main.java