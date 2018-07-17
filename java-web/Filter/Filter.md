#  java三大器之过滤器Filter工作原理

## 什么是Filter
Filter是Servlet API的一个接口

## 有什么用
通过实现该接口，可以在Web服务器访问Web资源的service方法之前，对访问的请求和响应进行拦截

## 工作原理
Filter接口中有个doFilter方法， 编写好Filter类，配置对某个Web资源拦截，Web服务器在调用web资源的service方法之前执行filter的doFilter方法。

doFileter中可以控制
调用目标资源之前执行代码
是否调用目标资源
调用目标资源后执行代码

通过执行filerChain的doFilter方法，web服务器就会调用web资源的service方法

## 开发流程
开发filter分两步：
1. 实现Filter接口创建Filter类
2. web.xml中配置filter，包括对filter类进行注册，和设置它所拦截的资源


## filter链


## Spring框架下，过滤器的配置
框架的功能就是帮助我提前实现了一些共性的接口，说白了就是让我们关注业务，忘掉技术细节。 所以如果使用Spring框架， 那么很多过滤器就不用自己来写了， Spring为我们写好了一些常用的过滤器。

## FilterConfig
在filter的<init-param>中配置参数，可以在init中通过filterConfig对象获取初始化参数。
