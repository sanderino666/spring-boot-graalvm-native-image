FROM oracle/graalvm-ce:19.3.1-java11 as graalvm
RUN gu install native-image

COPY ./target/demo /home/app/demo
WORKDIR /home/app

EXPOSE 8080
ENTRYPOINT ["/home/app/demo", "-Djava.library.path=/app"]

