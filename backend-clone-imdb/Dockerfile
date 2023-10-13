FROM amazoncorretto:17-alpine-jdk
COPY target/backend-clone-imdb-0.0.1-SNAPSHOT.jar /app/
CMD /usr/bin/java -Xmx400m -Xms400m -jar ./app/backend-clone-imdb-0.0.1-SNAPSHOT.jar
EXPOSE 8080