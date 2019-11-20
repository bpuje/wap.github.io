FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-mysql.jar spring-boot-mysql.jar
ADD students.csv students.csv
EXPOSE 4446
#ENTRYPOINT ["java", "-jar", "spring-boot-mysql.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /spring-boot-mysql.jar" ]

