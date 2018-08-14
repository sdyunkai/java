# 前端基础
  1. HTML、CSS
  2. JS、jQuery
  3. BootStrap
# 数据库
  1. MySQL加强
    delete和truncate区别？
      delete删除数据的时候是一条一条删除记录的，配合事务，可以将删除的数据找回。uid不会重置。
      truncate删除，是将整个表摧毁，然后再创建一张一模一样的表。删除的数据无法找回。uid会重置。
    select 
    from
    where
    group by 
    having 分组后带有条件只能使用having
    order by 它必须放在最后面

  2. JDBC加强
    ResultSet结果集可滚动，可影响数据库？
    conn.createStatement(int resultSetType, int resultSetConcurrenty)
    SQL注入攻击： PreparedStatement，同时可以提高效率，因为可以重复使用同一模板
    使用外键的目的： 保证数据的完整性，从表不能添加主表没有的数据，主表不能删除从表中已经引用的数据
    多对多需要建三张表，两个实体表，一个中间表
    多表查询：inner join（隐式内链接，内链接）, outter join.（left,right)
    内连接与外连接的区别： 内连接inner join 两表交集，  left outer join, 左表全部和两表交集，  right outer join ,右表全部和两表交集

  3. 连接池
    DBCP、C3P0、BoneCP、Druid
    JavaBean的序列化的应用场景：
      a. 把内存中的对象状态保存到一个文件中或者数据库中
      b. 想用套接字在网络上传送对象的时候
      c. 想通过RMI传输对象的时候

# 服务器端开发
  1. xml&Tomcat
    XML: w3c在1998年发布1.0版本
    限定XML内容：
      DTD或Schema
    解析XML，DOM,SAX,PULL
      dom4j,JAXP(sun),jDom,jsoup
    Web应用服务器
      a. weblogic： oracle公司的大型收费web服务器， 支持全部JavaEE规范
      b. webSphere: IBM公司的大型收费web服务器， 支持全部JavaEE规范
      c. Tomcat: Apache 开源免费中小型web应用服务器， 支持JavaEE的servlet和jsp规范
      d. JBoss： redhat 企业应用平台 ， 开源源代码引用服务器，管理EJB的容器和服务器，核心服务不包括支持servlet/jsp的web容器，一般与tomcat或jetty绑定使用
    http
      http/1.0 , 发送请求，创建一次连接，获得一个web资源，连接断开
      http/1.1, 发送请求，创建一次连接，获得多个web资源，连接断开
      http协议是web开发的基石，不深入了解http协议，就不能说掌握了web开发
      
  2. Web核心技术: servlet
  3. Web核心技术: request&response
  4. JSP&EL
# 数据库高级开发
  1. 事务操作
  2. 分页操作
# 服务器高级开发
  1. 过滤器和监听器
  2. ajax&jQuey的ajax
  