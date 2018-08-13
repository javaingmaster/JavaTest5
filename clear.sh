docker stop test5_java_javacontainer
docker stop test5_mysql_mysqlcontainer

 docker rm $(docker ps -a -q)

 docker rmi test5_java
 docker rmi test5_mysql
