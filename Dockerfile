#四个部分 1，父镜像 2，维护者信息 3，镜像操作命令 4，容器启动命令
FROM java:8u111-jdk
MAINTAINER xingwu
ADD target/springrootone-1.0-SNAPSHOT.jar xw.jar
ENTRYPOINT ["echo","this is a CMDtest","$0","$1"]