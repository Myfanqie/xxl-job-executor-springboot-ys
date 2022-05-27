FROM openjdk:8-jre-slim
MAINTAINER xuxueli

ENV PARAMS=""

ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/xxl-job-executor-sample-springboot-*.jar /app.jar
# 生成的cookie也放到一起，方便后续调用
ADD cookie.json /cookie.json

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /app.jar $PARAMS"]

#暴露9999端口
EXPOSE 9999