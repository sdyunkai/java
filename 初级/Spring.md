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
    