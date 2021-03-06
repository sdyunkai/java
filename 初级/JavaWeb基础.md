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
    transaction
    控制事务的connection必须是同一个，才能对事务进行控制
    事务的特性：
      ACID：原子、一致、并发事务之间要相互隔离、持久性（一个事务一旦被提交，它对数据库中的数据的改变就是永久性的，接下来即使数据库发生故障也不应该对其有任何影响）
    并发访问问题： 由隔离性引起
      脏读：事务B读到了事务A的未提交数据。
      不可重复度： 一个事务中两次读取的数据内容不一致。
      幻度： 一个事务中两次读取的数据的数量不一致。
    解决并发，设置事务的四种隔离级别
      read-uncommitted、read-committed(oracle default)、repeatable-read（mysql default)、serializable(最高隔离级别，锁表))

  2. 分页操作
    VO： value object，通常用于业务层之间的数据传递
    构建pageBean VO 和 condition VO

# 服务器高级开发
  1. 过滤器和监听器
    javaEE包括13门规范，其中javaweb，常用的是servlet和jsp
    Servlet规范三个技术点：
      Servlet, listener, filter
    Listener: 常用8中监听器，3个域对象的生命周期listener,3个域对象的属性变化listener，2个特殊javebean在session作用域的listener(特殊，不需要在web.xml中配置)，和httpsessionAttributeListener的区别，不需要在web.xml中配置，javabean必须实现相应接口，只针对当前javabean使用
      事件源：被监听对象， 三个域对象， request, session, servletContext
      监听器：监听事件源对象
      注册监听器： 监听器和事件源绑定
      响应行为： 监听到变化，所涉及的功能代码
    监听器有哪些？
      第一维度： 按被监听对象划分， ServletRequest, HttpSession, ServletContext
      第二维度： 按监听对象的创建和销毁， 对象属性的变化
    Servlet'ContextListener主要作用：
      a. 初始化， 初始化对象 数据 --- 加载数据库驱动 连接池的初始化
      b. 加载一些初始化的配置文件 ，例如 spring的配置文件
      c. 任务调度 ---定时器---timer/timertask
    HttpSessionBindingListenner

    Filter:
      a. 作用
        1) 对客户端访问资源过滤
        2) 对目标资源访问前后进行逻辑处理
      b. 配置
        web.xml
      c. 生命周期
        1) 创建： 服务器启动就创建filter对象
        2) 销毁： 服务器关闭时filter销毁
      d. 应用
        1) 公共代码的提取
        2) 可以对request和response中的方法进行增强（装饰者模式/动态代理)
        3) 进行权限控制
        自动登录、解决全站乱码、屏蔽非法文字、进行响应数据压缩等
      e. 过滤器链
        FilterChain中的过滤器的执行的顺序跟<filter-mapping>的配置顺序有关
      f. 配置
        1) url-pattern 
        2) servlet-name
        3) dispatcher : request, forward, error, include

  2. ajax&jQuey的ajax
    浏览器内核中实现了ajax引擎，请求交给ajax引擎处理
    Json转换插件： 将java对象或集合转换成json字符串
      jsonlib,Gson(google),fastjson(alibaba)

  3. 类加载器
    a. 作用
      加载字节码文件，生成Class对象
    b. 分类
      1) BootStrap  加载 jre/lib/rt.jar
      2) ExtClassLoader 加载 jre/lib/ext/*.jar
      3) AppClassLoader（SystemclassLoader)  加载classpath指定的所有jar或目录
    c. 如何获得
      通过字节码对象，可以获得类加载器 getClassLoader()
    d. 类加载的加载机制
      全盘负责和双亲委托机制，所谓全盘负责就是 ，classLoader装载一个类时，除非显式使用另一个ClassLoader，则该类所依赖即引用的类，也都由这个classloader加载。
      本质上真正加载class文件生成Class对象由双亲委托机制实现。所谓双亲委托就是，子类加载器如果没有加载过目标类，则先委托其父类加载，只有父类加载器找不到字节码文件的时候，才从自己的类路径中查找并装载目标类。
      双亲委托机制只是java推荐的机制， 并不是强制的机制。 
      我们可以继承java.lang.ClassLoader, 实现自己的类加载器。 如果想保持双亲委托模型， 就应该重写findClass(name)方法， 如果想破坏双亲委托模型，可以重写loadClass(name)方法
      如果一个class文件，被两个类加载器加载，将是两个对象
      通过自定义类加载器，可以将一个class文件加载多次

  4. 动态代理
    a. 代理的流程(中介)
      调用者、中间人、目标方
    b. 何为动态
      不用手动编写一个代理对象，在运行时的内存中动态生成代理对象。 --- 字节码对象级别的代理对象。
    c. 如何实现
      1) jdk API实现
        jdk提供的动态代理的API。 Proxy.newProxyInstance(); // 注意： jdk的proxy方式实现的动态代理， 目标对象必须有接口，没有接口的话不能实现jdk版的动态代理
      2) cglib动态代理实现
        code generation library,开源项目，code生成类库， 底层基于ASM。 java bytecode 操作框架。
        cglib， 可以在运行期扩展java类和实现java接口， 弥补了jdk proxy api只能对有接口的对象实现动态代理的不足。
        Hibernate， SpringAOP的动态代理实现均采用的是cglib库的实现。


  5. 注解 @xxx
    a. 作用
      使用特定的语法，注释给jvm看的， 通过annotation， jvm可以对class执行预定义操作 ， 代替配置文件
      1) 编译检查：通知编译器实现基本的编译检查
      2) 代码分析：通过代码里的标识注解， 对代码进行分析， 从而达到取代xml的目的
      3) 编写文档： 辅助生成帮助文档对应的内容
    b. 与配置文件的对比
      注解优点：开发效率高 成本低
      注解缺点：耦合性大， 并且不利于后期维护
    c. 常用注解
      Override、Deprecated、SuppressWarning
    d. 自定义注解
      注解是一种类型， 与类、接口和枚举是平级的
      1) 关键字 @interface
        语法： 返回值 名称（）， 如果属性的名字是value，并且注解的属性只有一个， 那么使用注解时候就可以省略value
      2) 元注解
        @Retention、@Target
      3) 定义注解还是标示元注解， 包括自定义注解的保留策略和修饰对象
    e. 注解解析
      实质是从注解中解析出属性值


  