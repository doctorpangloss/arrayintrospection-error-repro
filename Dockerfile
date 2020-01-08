FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
#FROM oracle/graalvm-ce:19.3.0-java11 as graalvm # For JDK 11
COPY . /home/app/arrayintrospection
WORKDIR /home/app/arrayintrospection
RUN gu install native-image
RUN native-image --no-server --static -cp build/libs/arrayintrospection-*-all.jar

FROM scratch
EXPOSE 8080
COPY --from=graalvm /home/app/arrayintrospection/arrayintrospection /app/arrayintrospection
ENTRYPOINT ["/app/arrayintrospection", "-Djava.library.path=/app"]
