FROM openjdk:8
WORKDIR /app/
COPY antlr/ Dockerfile errorlistener.java judge.toml main.java test.txt visitor.java ./
RUN pwd
RUN ls
RUN export CLASSPATH=$CLASSPATH:/app/antlr/antlr-4.9.2-complete.jar
RUN echo $CLASSPATH
RUN echo 123
RUN javac main.java