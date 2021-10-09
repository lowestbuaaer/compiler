FROM gcc:10
WORKDIR /app/
COPY word.c ./
RUN gcc word.c -o word
RUN chmod +x word