# JsonRpcDemo
Dubbo JsonRpc protocol demo server-side
使用dubbo自带容器启动，不需要Tomcat

### 使用
git clone https://github.com/JoeCao/JsonRpcDemo.git
cd JsonRpcDemo
mvn clean install
cd target
tar -xvf JsonRpcDemo-1.0-SNAPSHOT-assembly.tar.gz
cd JsonRpcDemo-1.0-SNAPSHOT-assembly
cd bin
sh start.sh

### 调试
使用com.ofpay.demo.Demo作为入口