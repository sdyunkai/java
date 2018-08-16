# 命令
## 文件系统目录
  bin、sbin、usr、dev、boot、etc、mnt、home、root、var、tmp

## 目录crud
  cd 、rm、mv、find -name 

## 文件crud
  touch、cat/more/less/tail、vim(i,a,o)、rm
    1. tail -f 文件，可以对某个文件进行动态监控。

## 打包、压缩、解压缩
  tar -zcvf target source、tar -zxvf source -C target

## 其他
  pwd、grep(字符串)、|、ps -ef、kill -9、ifconfig、netstat -an
    grep something filename --color
    source profile
  man + cmd、help + cmd

## 权限
  ll drwx_rwx_rxw 、chmod、
    chmod u=rwx,g=rw,o=r file
    chmod 764 file

# 工具
  putty、secure'CRT、sshSecureSheel、xShell

# RPM
  rmp -qa | grep java
  rpm -e --nodeps file
  rpm -ivh MySQL-xxx-xxx.rpm

# MySQL
  service mysql start
  chkconfig --add mysql 加入到系统服务
  chkconfig mysql on 自动启动
  mysql -u root -p / set password=password('123')
  grant all privileges on *.* to 'root'@'%' identified by '123' / flush privileges;
  /sbin/iptables -l INPUT -p tcp -dport 3306 -j ACCEPT 开放防火墙端口
  /etc/rc.d/init.d/iptables save
