FROM adoptopenjdk/openjdk11:latest

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    APPDOCKER_SLEEP=0 \
    JAVA_OPTS=""


ADD *.war /app.war

EXPOSE 8081
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.war