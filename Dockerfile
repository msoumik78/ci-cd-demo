FROM eclipse-temurin:17-jdk-jammy AS BUILD_IMAGE
WORKDIR /app
COPY src  .
RUN javac InfiniteLoop.java

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=BUILD_IMAGE /app/InfiniteLoop.class .
CMD ["java", "InfiniteLoop"]
