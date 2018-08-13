FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0

COPY start.sh  /start.sh
COPY ./target/javatest5-0.0.1-SNAPSHOT.jar  /java.jar
CMD ["/start.sh"]