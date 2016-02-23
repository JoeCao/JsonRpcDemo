FROM java
MAINTAINER Joe Cao <caozupeng@139.com>
ENV REFRESHED_AT 2016-2-22
RUN apt-get -yqq update
RUN apt-get -yqq install net-tools
RUN mkdir -p /opt/app
ADD target/JsonRpcDemo-1.0-SNAPSHOT-assembly.tar.gz /opt/app
WORKDIR /opt/app/JsonRpcDemo-1.0-SNAPSHOT/bin
EXPOSE 10881 38081
ENTRYPOINT ["/opt/app/JsonRpcDemo-1.0-SNAPSHOT/bin/start.sh"]