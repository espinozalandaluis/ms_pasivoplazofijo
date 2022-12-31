FROM openjdk:11
#VOLUME /tmp
EXPOSE 8086
COPY "./target/pasivoplazofijo-0.0.1-SNAPSHOT.jar" "pasivoplazofijo.jar"
ENTRYPOINT ["java","-jar","pasivoplazofijo.jar"]