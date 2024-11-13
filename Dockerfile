FROM openjdk:8-jdk-alpine

# 创建程序目录
RUN mkdir -p /usr/app

# 进入程序目录
WORKDIR /usr/app

# 指定容器端口
EXPOSE 8443

# 挂载目录
VOLUME /tmp

# 定义自定义参数，指定原始 JAR 位置
ARG CUPCUBES_FILE=target/cupcubes-auth-1.0.0.jar

# 添加本地 JAR 到容器内
ADD ${CUPCUBES_FILE} app.jar

# 容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/app.jar"]
