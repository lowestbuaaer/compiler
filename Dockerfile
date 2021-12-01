FROM openjdk:14
COPY . /app/
WORKDIR /app/
RUN ls
RUN cd ./antlr
RUN ls
RUN cd ..
RUN javac -cp ./:./antlr/antlr-4.9.2-complete.jar main.java