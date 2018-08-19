# 介绍
    起源：
        Rod Johnson创建开源框架。 2003年兴起的轻量级java开发框架。分层的javaee fullstack framework。
        Spring核心 IoC 和  AOP。

    一站式框架：
        容器性质，可以管理三层架构中的所有对象
        容器中装什么对象就有功能，所以可以一站式 ，不仅不排斥其他框架，还能帮助其他框架管理对象
        aop支持
        ioc思想
        spring jdbc
        aop事务， 声明式事务
        junit测试支持        

# Spring Framewordk Runtime
    DataAccess/Integration Web
    AOP Aspects Instrumentation Messaging
    CoreCotainer
    Test

# 搭建
    Core Container
        beans、context、core、expression

# 概念
    思想：Inverse of Control
        具体实现： Dependecy Injection
        注入方式：
            set方法注入、构造方法注入、字段注入
        注入类型：
            值类型、引用类型

# 配置
    Bean元素的Scope属性：
        singleton、prototype、request、session

# 属性注入
    构造方法属性注入、set方法属性注入
    
# spring注解配置
    bean定义：component
        controller
        service
        repository
    value
    bean注入：autowired resouce
    scope
    postconstruct、predestroy

# spring aop
    底层用到两种代理机制：
        jdk proxy 、cglib
    API:
        joinpoint、pointcut、advice、target、weaving、proxy、aspect
    创建advice
    配置织入
        <aop:config>
            <aop:pointcut>
            <aop:aspect ref="advice">
                <aop:before method="">
        </aop:config>
    注解配置和XML配置

底层实现
implement InvocationHandler
Proxy.newProxyInstance

implement MethodInterceptor
Enhance

# Spring 整合jdbc
    spring提供了很多模板整合Dao技术
        JDBC、Hibernate3.0、MyBatis、JPA
# Spring AOP事务
    spring封装事务管理代码
        事务操作对象
            PlatformTransactionManager接口
                DataSourceTransactionManager
                HibernateTransactionManager
            spring中做事务管理的关键是用好TransactionManager对象
        事务的传播行为
            propagation_required
    spring管理事务的方式
        编码实现
        xml配置
        注解配置