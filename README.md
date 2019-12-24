### 1、使用nacos作为注册中心 ###
### 2、使用nacos作为配置中心，将数据库连接放在nacos上 ###
### 3、使用sentinel，并实现nacos配置规则 ###
### 4、使用spring cloud gateway ###
### 5、使用消息中间件作为bus/stream ###

需要自备 nacos-server.jar 

>https://github.com/alibaba/nacos/releases

kafka
>http://kafka.apache.org/downloads

zipkin-server
>curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar