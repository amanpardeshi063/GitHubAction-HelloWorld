FROM openjdk:19
LABEL maintainer="javadocker.net"
COPY target/hellowWorld-0.0.1-SNAPSHOT.jar helloworld-0.0.1.jar
ENTRYPOINT ["java","-jar","helloworld-0.0.1.jar"]