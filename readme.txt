下载docker容器
docker pull xxx:版本号

docker run -it  —name myname -d -p 3306:3306 -v /root/aaa:/root/aaa  容器id  /bin/bash


docker images



docker ps


docker stop   id

docker rmi  -f   id

docker exec -it id /bin/bash

docker login   -u账号   -p密码

———————————————————
修改docker的REPOSITORY及tag名称
docker tag 3bd2787b9fa3 zongxing/mycentos:latest

docker push zongxing/mycentos:latest


￼
windows docker加速

https://blog.csdn.net/xbinworld/article/details/78945879
解决windows系统无法对docker容器进行端口映射的问题
https://www.cnblogs.com/hypnus-ly/p/8683215.html



centos加速
https://www.cnblogs.com/shaohsiung/p/9642183.html

centos安装好了，启动不了的解决办法
https://www.cnblogs.com/amoyzhu/p/5261393.html



———————————————————
win10家庭版安装Docker
https://blog.csdn.net/hao_kkkkk/article/details/79853752

