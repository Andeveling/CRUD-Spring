FROM ubuntu:latest
LABEL authors="andres"

ENTRYPOINT ["top", "-b"]