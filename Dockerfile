FROM openjdk:12
WORKDIR /app/
COPY . ./
RUN ls
RUN cd src
RUN ls
RUN export CLASSPATH=$CLASSPATH:.src/antlr/antlr-4.9.2-complete.jar:./src
RUN echo $CLASSPATH
RUN javac  /src/main.java