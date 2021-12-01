FROM openjdk:8
WORKDIR /app/
COPY . ./
RUN ls
RUN cd ./antlr
RUN ls
RUN cd ..
RUN javac main.java -cp ./:./antlr/antlr-4.9.2-complete.jar