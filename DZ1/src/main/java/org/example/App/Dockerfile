FROM openjdk:20-jdk-slim AS compiler
WORKDIR /app
COPY App /app
RUN javac -d ./newOut -encoding utf-8 App/Main.java

FROM openjdk:20-jdk-slim AS executor
WORKDIR /app
COPY --from=compiler /app/newOut /app
CMD ["java", "Main"]