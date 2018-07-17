# Servlet规范

Servlet是JavaEE最重要的一部分，有了Servlet你就是JavaEE了，JavaEE其他方面的内容择需采用。

Servlet规范需要掌握的就是servlet和filter两项技术。绝大多数框架不是基于servlet就是基于filter，如果它要在servlet容器上运行，就永远也脱离不了这个模型。

## 为什么Servlet规范有两个包，javax.servlet和javax.servlet.http

早先设计该规范的人认为servlet是一种服务模型，不一定是依赖某种固定的网络协议之上，因此就抽象出一个javax.servlet，同时提供一个基于http协议上的接口扩展。 
但从实际运行这么多年来看， Servlet技术主要是应用在http协议之上。

javax.servlet 和 javax.servlet.http两个包总共加起来不过三十四个接口和类。 特别是下面几个接口要熟知每个方法的意思和用途：

* HttpServet
* ServletConfig
* ServletContext
* Filter
* FilterConfig
* FilterChain
* RequestDispatcher
* HttpServletRequest
* HttpServletResponse
* HttpSession
* 一些Listener类

## HttpServeletRequest和HttpServletResponse

Web开发离不开http协议，Servlet规范其实就是对HTTP协议做面向对象的封装，http协议中的请求和响应对应了这两个接口
可以通过前者获取所有请求相关的信息，包括URI、Cookie、Header、请求参数等。 同样可以通过后者，生成HTTP回应，包括Cookie、Header以及回应内容等。


## servlet

Java Servlet是一个基于java技术的web组件，运行在服务器端，由servlet容器管理，用于生成动态的内容。Servlet是平台独立的java类，编写一个servlet，实际上就是按照servlet规范编写的一个java类。

## servlet容器

servlet容器也叫servlet引擎，是web服务器或应用服务器的一部分，用于在发送的请求和响应之上提供网络服务，解码基于mime的请求，格式化基于mime的响应。Servlet没有main方法，不能独立运行，必须被部署到servlet容器中，由servlet容器来实例化和调用servlet。

1. servlet容器提供了什么？

通信支持：封装了与web服务器的通信技术，不用自己建立servetsocket，监听端口，创建流等，不用担心web服务器和自己web代码之间的api
生命周期管理：负责加载类、实例化和初始化servlet，调用servlet方法，以及servlet实例的垃圾回收，有了servlet容器，不用太多的考虑资源管理
多线程支持：容器自动为接收的每个servlet请求，创建一个新的线程，servlet运行完相应的http服务方法，线程就会结束。（并不是说不需要考虑线程安全性，其实还会遇到同步问题）
声明方式实现安全：利用容器，可以使用xml部署描述文件来配置和修改安全性，而不必硬编码写到servlet类中
jsp支持： 负责将jsp代码翻译为真正的java代码

2. 与cgi比优势
单实例多线程、标准API、Java编写，拥有java语言的所有优点，包括容易开发和平台独立性、可以访问java平台丰富的类库，使各种应用的开发更为容易，给servlet提供额外的功能，如错误处理和安全。

3. 分类
servlet容器可以分为三类：
* 独立运行的servlet
基于java技术的web服务器，servlet容器作为web服务器的一部分而存在， tomcat
* 进程内的servlet
由Web服务器插件和java容器两部分的实现组成。 web服务器插件在web服务器内部地址空间打开一个jvm，使用java容器可以在jvm中加载并运行servlet。web服务器通过jni技术将请求传递给java容器。
* 进程外的servlet
servlet容器运行在web服务器之外的地址空间，web服务器插件和java容器通过IPC（通常是TCP/IP)机制进行通信.响应速度不如进程内调用，但是具有更好的伸缩性和稳定性。


