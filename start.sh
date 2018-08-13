#!/bin/bash
sleep 20
echo "${driverClassName}:${url}:${username}:${password}"
nohup java -jar /java.jar &

tail -f /dev/null