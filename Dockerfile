FROM openjdk:14
COPY . /app/
WORKDIR /app/
RUN ls
RUN cd ./antlr
RUN ls
RUN cd ..
RUN javac main.java 