# 基于哪个镜像
FROM java:8

ADD springmvc-1.0-SNAPSHOT.war app.jar
RUN bash -c 'touch /app.jar'

# 开放21050端口
EXPOSE 8080

# 配置容器启动后执行的命令
ENTRYPOINT ["java", "-Xmx200m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
