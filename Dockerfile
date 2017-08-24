FROM centos7

MAINTAINER VinhNV <vinhnv@dtsgroup.com.vn>

RUN \
	yum update -y && \
	yum install -y wget && \
	cd /opt/ && \
	wget http://download.oracle.com/otn-pub/java/jdk/8u144-b01/090f390dda5b47b9b721c7dfaa008135/jdk-8u144-linux-x64.rpm && \
	rpm -ivh jdk-8u144-linux-x64.rpm &&\ java -version
	
WORKDIR /build

ADD ./target/jwt-spring-security-swagger-0.2.0.jar /build

CMD ["java","-jar","jwt-spring-security-swagger-0.2.0.jar","&"]