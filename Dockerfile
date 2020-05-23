FROM openjdk:8u151
ENV JAVA_APP_JAR springboothelloworld-0.1.0.jar
WORKDIR /app/
COPY target/$JAVA_APP_JAR .
EXPOSE 8080
CMD java $JAVA_OPTIONS -jar $JAVA_APP_JAR