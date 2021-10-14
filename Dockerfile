FROM crcentos:latest
MAINTAINER yun

WORKDIR /home/sg-mall-api

ADD ./dockerTest.jar /home/dockerTest.jar

ENV JAVA_HOME /usr/local/jdk/jdk1.8.0_241
ENV CLASSPATH .
ENV PATH $PATH:$JAVA_HOME/bin

EXPOSE 8009


ENTRYPOINT ["java","-jar","/home/dockerTest.jar.jar"]
