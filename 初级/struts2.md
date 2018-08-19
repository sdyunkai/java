# 来源
    Apache Struts2 ，缘起  Apache Structs 的 WebWork框架。对Struts的增强和改进，同时保留了Struts框架的类似结构。 
    2005年 ，WebWork宣布WebWork2.2 以Apache Struts2 的名义合并至Struts。
    2007年， 第一个全发布版本发布。

# 介绍
    开发Java EE Web应用程序的开源网页应用架构。 延伸了Servlet API，鼓励MVC架构
    Struts2对MVC重新理解并同时引入一些新的建筑学方面的设计理念，结构更加清晰，使用也更灵活方面。
    采用应用逻辑的横切面拦截器，基于注释的配置，功能强大表达式语言，可更改和重用的UI组件。

# 漏洞
    Struts2开发组常被指漏洞修复手法不妥，要么修复后仍可利用，要么无法修复长期闲置。
    包括一个由标记S2-003的漏洞报告引发的一连串远程执行问题。官方多次修复没能解决，在2013年发布版，在修复相中公开了一段远程执行漏洞的示例代码，本来想是让开发者知道漏洞，并采用绕过方案，缺被黑客利用，导致了中国大量大量使用Struts2的网站被入侵。

# 设计理念
    核心过滤器，过滤请求。抽象出拦截器概念，动态可插拔
    Interceptor 拦截器 ，可插拔式， aop思想
    封装的功能：
        自动封装参数
        参数教研
        结果的处理（转发|重定向）
        国际化
        显示等待页面
        表单防止重复提交
    约定： Action

# 使用
    POJO Plain Ordinary Java Object  纯的普通的java对象， 不继承特殊的类或实现接口
    创建Action的三种方式：
        1. pojo
        2. 实现Action接口
        3. 继承ActionSupport
    Action的访问： Action封装方法，防止Action过多。 
        1. 指定method
        2. 通配符方式配置访问  xxx_* {1}
        3. 动态方法访问 （前端配置 xxaction!save.action
    访问ServletAPI的方式：
        ActionContext ThreadLocal
        ServletActionContext.getRequest() 原生request
        通过实现接口的的方式 implements ServeltRequestAwware
    Action生命周期
        每次请求，都会创建新的Action实例
        Action是线程安全的， 可以使用成员变量接收参数
    Action如何获取参数
        1. 属性驱动
        2. 对象驱动 
        3. 模型驱动 （准备User成员变量 ， implements ModelDriven）

    如何直接在Action中获得远程的ServletAPI实例
        1. 实现接口： ServletRequestAware..
        2. ServletActionContext类

    OGNL
    拦截器
        拦截器创建：
            1. implements Interceptor (生命周期：随项目的启动而创建，随项目关闭而销毁)
            2. extends AbstractInterceptor
            3. extends MethodFilterInterceptor
        拦截器配置
            step1. 注册烂机器
            step2. 配置拦截器栈
            step3. 指定包中默认拦截器栈
    struts2的标签
        标签体系：
            jsp自定义标签
                jstl java标准标签库 jee5.0以后纳入标准标签库
                struts开发团队  struts2标签库


