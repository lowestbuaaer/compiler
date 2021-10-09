FROM gcc:10
COPY word.c ./
RUN gcc word.c -o word
RUN chmod +x word
