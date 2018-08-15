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
    Servlet规范三大技术要点： Servlet技术、Filter、Listener
    创建Servlet： 实现Servlet接口，继承HttpServlet
    Sevlet声明周期：
      a. 创建： 默认第一次访问时创建(可以通过配置，告诉容器在启动的时候就创建servlet对象, <load-on-startup>)
      b. 销毁： 服务器关闭时候销毁
      c. service： 每次访问都会执行service方法
    url-pattern的配置方式：
      a. 完全匹配  /a
      b. 目录匹配  /x/b/*
      c. 扩展名匹配 *.a
    ServletContext: 对应一个web,创建：web应用被加载（服务器启动或发布web应用），销毁：应用被卸载（服务器关闭，移除该web应用）
      可以获取web应用的全局初始化配置参数, <context-param><param-name><param-value>
      获得web应用中任何资源的绝对路径
      域对象， domain object, 全局数据共享

  3. Web核心技术: request&response
    Response缓冲区
      乱码问题、状态码、响应头、输出流
    Request
    Session&Cookie
    Session生命周期，过期。 正常关闭服务器，session会序列化到本地
    
  4. JSP&EL
    JSP运行原理： JSP本质就是Servlet
    JSP三大指令： <%@ %>
      page、include、taglib
    JSP九大内置对象：
      out、request、response、config、session、application、page、pageContext、exception
    JSPl两大标签（动作)
      动态包含 <jsp:include page="">
      请求转发 <jsp:forward page="">
    静态包含和动态包含的区别？
      前置发生在转换阶段，后者发生在编译阶段，产生两个类
    EL作用：减少jsp脚本的编写
    JSTL: JSP Standard Tag library,嵌入jsp页面，使用标签的形式完成业务逻辑功能。也是了减少jsp页面中的脚本代码
    JSP开发模式： model1:jsp+javabean, model2: jsp + servelt + javabean. MVC ， JavaEE服务器端开发三层架构 ， Web（与客户端交互）、Service（复杂业务处理）、Dao（与数据库进行交互）

# 数据库高级开发
  1. 事务操作
  2. 分页操作
# 服务器高级开发
  1. 过滤器和监听器
  2. ajax&jQuey的ajax
  