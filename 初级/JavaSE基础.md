
# Java能干什么
* 谁开发，谁拥有？

1995年Sun开发，现在由Oracle拥有，现在已经23岁

* 擅长什么？

1. 互联网： 电商、P2P
2. 企业级应用： ERP、CRM、OA

# 开发环境

- JDK First
- 虚拟机语言

# 运行

* 源文件.java-->编译.class-->VM解释执行
* 编译： javac
* 命令行执行：java -classpath [dir] [classname] 
* 查看class文件：javap printer

# Java编程基础

* 注释、关键字（规范约定表达语法含义）、标识符（类名，包括接口、枚举、抽象类，方法名、变量、常量名、包名等可以自定义的字符组合就是标识符）

String不是关键字，是标识符，String是Java基础库中的一个常用类的类名。
标识符由字母、下划线、数字、$符号组成，不能以数字开头，长度没有限制，区分大小写，不能是关键字

* 数据类型、常量

基本数据类型和引用数据类型（数组、类、接口）
常量：字面值常量和自定义常量
字面值常量：字符串常量（双引号括起来）、整数、小数、字符、布尔、空常量（null)
基本数据类型：四类（整、浮、字符、布尔），八种（byte1,short2,int4,long8,float4,double8,char2,boolean1)
char占几个字节：java采用unicode编码表示字符，即用2个字节来表示一个字符
整形常量：默认int，要定义long型的话，应加上L后缀，如1L
小数常量：默认double，要定义float的话，应加上F后缀

* 运算符

"1+1="+1+1 vs "1+1"+(1+1)
浮点运算中的两个特殊情况：NAN和Infifity.浮点运算中引入无限的概念。无限乘以0=NAN，无限除以0=无限，无限做除了乘以0以外的操作=无限  
double无限定义 1.0/0.0,NAN定义：0.0d / 0.0

* 流程控制

分支、循环

* 数组
* 方法

调用、重载（与返回值无关）
可实现业务逻辑的封装

* 自定义类

# 面向对象思想
其实就是管理的思想，小问题规模直接面向过程就可以解决了，但是遇到大问题规模的时候，我们就不能什么事都亲历亲为了，要用面向对象的方式思考处理问题，说白了就是分工，各司其职。
* 类和对象

类客观事件某种事物的抽象，抽象类的时候，人们往往是根据已有的经验和广泛的共识去做的。它可能并不一定是绝对真理，只是基本的共识而已。比如水杯，一般都认为是喝水有的，但是也有的可能会拿水杯吃屎。这特么谁又能管的了呢。
所以，在抽象具体事物的时候，大可不必钻牛角尖，按人类常识和生活经验去做就可以了。
抽象的原则是什么呢，是以属性为主还是以功能为主，仔细想想，其实我们生活中描述客观事物的时候，往往是以功能为主定义的，比如一个水杯，之所以定义为水杯，是因为他能够储水，提供了储水的功能，我们也主要是用它来喝水的。 至于它是什么材质我们并不关心，玻璃也好，不锈钢也好，到了具体的对象的时候，才是考虑属性的时候。

* 成员变量和局部变量
* 访问修饰符

default,public,private,protected

* 封装、继承、多态

继承有什么好处呢？ 增加了代码复用性，可以直接基于某个现存类直接实现一些功能。
有什么缺点呢？ 继承必然产生关联，也就导致了类与类之间的耦合。

判断某个对象是否属于某种数据类型？ instanceof 

多态有什么好处和缺点？ 多态是父类引用指向子类对象，自动向上转型，可以隐藏子类类型，提高了代码的扩展性。但是呢，使用向上转型后，引用只能访问父类的共性功能和属性了，无法访问具体子类的独有功能。
多态是如何提高代码扩展性的？ 配合继承和方法重写。重写机制保证不同的子类可以有不同的实现，再利用向上转型功能，就可以在调用某类的方法的时候，传递父类引用，这样以后如何被调用类需要改变实现方式的时候，在扩展的同时，不会影响到被调用者的代码。

* 构造方法、this、super

为什么要有this？ 提供一种方式，可以在当前类的任何地方访问到当前类的实例。this保存的是当前对象的引用。

* 抽象类、接口

抽象类是否可以没有抽象方法？如果可以，那么，该类还定义成抽象类有意义吗？
当然可以没有，只要用abstract修饰类名就算抽象类了。 有意义，当我们发现一种当前未知其功能的东西的时候，总要先为其分个类，命个名吧，比如火星石，这时我们就得用抽象类来表示有这样一个东西，但是你还不能直接使用它，因为不能直接创建该类的对象。

需要注意的是接口中的变量和方法都是有固定修饰符的，即使没写，java编译器也会自动为我们加上，对变量而言，固定的修饰符是 public static final, 对方法而言，固定的修饰符是 public abstract.所接口中的变量是常量，值不能修改，因为是static的，也就是实现类是共享该变量的。

多继承的问题：当多个父类中有相同的功能时，子类调用会产生不确定性。为什么会有不确定性？原因在于多继承父类中功能可能有方法体，导致调用运行时，不确定运行的哪个方法体中的内容。但是接口中的功能永远没有方法体，是由子类来明确的。

接口和抽象的区别？
相同点： 都位于继承的顶端，用于被其他类实现或继承；不能new；区别：抽象类可以有抽象方法和非抽象方法，接口只能是抽象方法；单继承，多实现；继承天然的体现出什么是什么的关系，接口不强调这种继承关系，可以用来表示扩展功能。

类不能多继承，但是接口可以多继承。

* final、static、包、代码块（局部代码块、构造代码块、静态代码块）

# 常用API
* Object类的equals和toString()
* String

字符串本质是一个不变的字符数组，final char[]
字符串字面量和 new String() 复制了字面量到堆中

* StringBuffer、StringBuilder

两者都是字符串缓冲区，不同在于线程安全问题。StringBuilder不保证同步，所以只能用在单线程中，效率会更高。 
StringBuffer since 1.0, StringBuilder since 1.5

* 正则表达式、Date、DateFormat、Calendar
* 包装类、System、Math、Arrays、BigInteger、BigDecimal

jdk1.5+ 自动装箱时，如果数值在byte范围之内，不会新创建对象空间而是使用原来已有的空间。
double和float类型在运算中很容易丢失精度，造成数据的不准确性例如0.09+0.01 != 0.1. Java提供了BigDecimal类可以实现浮点数据的高精度运算。构建BigDecimal类时候，采用字符串形式给出参数，因为参数结果是可以预知的。

# 集合框架

* 集合、Iterator迭代器、增强for
    集合与数组区别：数组长度固定，集合长度可变。
    List接口常用子类：ArrayList、LinkedList。
    Set接口常用子类：HashSet、LinkedHashSet。
    迭代器迭代的时候要注意并发修改异常
* 泛型
    好处：编译时限制了类型使用，减少了运行时期的ClassCastException；减少频繁类型转换的编码麻烦
    通配符：<?>、<? extends Class>、<? super Class>
* ArrayList、LinkedList、Vector
* HashSet、LinkedHashSet
    HashSet采用哈希表存储结构，通过hashCode()和equals()方法可以保证元素的唯一性。哈希表结构中，每个哈希码值位置上可以添加多个元素。
* Map(双列集合)、HashMap、LinkedHashMap
* 可变参数 （jdk1.5+）
* Collections工具类

# 异常
    Throwable->Error|Exception-->RuntimeException
    catch多个异常，异常类之间须是子父类关系，子类写前面，父类写后面
    方法抛出运行时异常时候，方法定义中无需throws声明
    编译时异常Exception,运行时异常RuntimeException

# IO
* File
* IO流
    字节流、字符流
        字符编码问题，unicode是符号集，规定了符号的二进制表示，utf-8是基于unicode的一种具体编码实现
    转换流、缓冲流
        InputStreamWriter (字节字符转换流)、BufferedInputStream
    Properties、序列化流、打印流、commons-io
        Properties extends Hashtable，唯一一个能与IO流交互的集合。
        序列化相关流就是ObjectInuptStream、ObjectOutputStream。
        静态数据不会被序列化，序列化是持久化对象数据，静态数据属于类，加了transient关键字告诉jvm不序列化
        
# 多线程
* Thread、线程创建、线程状态、线程池
    单核、多核、多线程、并行结算
    单核时代，多线程可以降低阻塞，提高CPU利用率。并发、互斥、同步、死锁。
        单核时代，大都算并发，多核时代真的就大为不同？单核时代，用volatile变量可以解决大部分问题，例如多个线程共同访问一个标志位，单核基本不会出问题，
        什么情况下会呢，Flag有多个，或是一个数组，这时候只能通过逻辑手段搞定问题了，多来几次空转无所谓，别出致命性的问具体就行，因为CPU只有一个，同时
        访问这个标志位的只能有一个线程。
        但是多核就不同了，仅仅volatile不太能解决问题，要用到具体语言，具体环境中的"信号量“，比如mutex,monitor,lock。
    创建线程的两种方式： 本质都得使用Thread类，一种是直接继承，重写run； 一种是构造自己的类型实现Runnable接口，实现类的对象传给Thread对象。 
        使用实现Runnable接口的好处是，避免了单继承的局限性，比如如果继承了Thread之后就不能再继承其他更需要继承的对象了。很多时候我只是想让这个类的某个方法在线程中执行而已，并不是说这个类is a Thread.
        Runnable接口对线程对象和线程任务进行解耦。
    线程池：Executors(工厂)、ExecutorService(线程池)、提交任务submit，关闭线程池
        Executors 来自 java.util.concurrent, Future
    使用线程池的方式： 提交Runnable接口对象；提交Callable接口对象。有了Runnable，为什么要增加Calllable,Runnable接口是在java.lang包中，callable接口在java.util.concurrent包中。Runnable不能throw exception，
    而Callable可以抛出异常，返回线程任务执行完毕后的结果。

* 线程安全、线程同步、死锁、Lock锁、线程通信（等待唤醒机制）
    synchronized: 同步代码块（定义所对象）， 同步方法（在方法上面上加关键字，锁对象是this），静态同步方法（内部锁对象，是类名.class)
    Lock接口，Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作。 Lock接口子对象， ReentrantLock
    死锁是怎么发生的？  七个字，锁嵌套，互相等待.
    线程通信的背景，当多个线程在处理同一个资源的时候，不同线程对资源采取不同的动作，需要相互协作，就产生了线程通信。 为了有效地利用资源。
    等待唤醒机制，wait,notify,notifyAll,并不定在Thread和Runnable中，是定义在Object中的， 因为等待唤醒的使用必须要关联所属的锁，即用在线程同步当中。而锁对象可以是任意对象，能被任意对象调用的方法，一定是定义在Object中。
    sleep 和 wait区别， sleep不释放锁对象，休眠时间内不能被唤醒。 wait释放锁对象，等待时间内，能被唤醒。
    
# Database之MySQL
* 数据库和数据库管理系统
    数据库本质就是一个文件系统，是存储数据的仓库
    数据库管理系统，则是提供了一个专用的软件系统，用来管理和使用和维护数据库。

* JDBC、DBUtils、DBCP 
    JDBC，java访问关系数据库的标准规范。JDBCUtils封装注册驱动和获取连接
    apache commons组件的一个成员：DBUtils。 DBUtils就是JDBC的简化开发工具包。QueryRunner， update,query,ResultSetHandler
    apache common成员之一 DBCP

# 网络编程
* 网络通信协议
    TCP/IP应用四层结构,应用层(HTTP,FTP,DNS)-->传输层(TCP,UDP)-->网络层(IP,ICMP,IGMP)-->链路层（物理链路驱动，光纤、网线）
    InetAddress
* UDP通信
    DatagramPacket、DatagramSocket
* TCP通信
    three-way handshake , 本质是信道不可靠，但是通信双方需要就某个问题达成一致，而要解决这个问题，无论你在消息中包含什么信息，三次通信都是理论上的最小值。
    ServerSocket、Socket

# 反射
* 类加载器 
    类的加载，程序使用某个类的时候，如果该类还没有被加载到内存中的话，系统会通过加载、连接、初始化三步来实现对这个类进行初始化。
        1. 加载，将class文件读入内存，创建Class对象
        2. 连接，验证class是否有正确的内部结构并和其他类协调一致，准备： 负责为类的静态成员分配内存，并设置默认初始化值，解析： 将类的二进制数据中的符号引用替换为直接引用
        3. 初始化 
    初始化时机：
        创建类的实例，类的静态变量赋值，调用静态而方法，使用反射方式强制创建某个类或接口对应的java.lang.Class对象，初始化某个类的子类，使用java.exe运行某个主类
    类加载器：
        Bootstrap ClassLoader 引导类加载器，负责核心类的加载，比如System,String等。 在jdk中jre的lib目录下rt.jar文件中。
        Extension ClassLoader 扩展类加载器，负责jre的扩展目录中jar包的加载，在jdk中jar的lib目录下的ext目录。
        System ClassLoader 系统类加载器，负责在JVM启动时加载来自java命令的class文件，以及classpath环境变量所指定的jar包和类路径

* 反射概念
    运行时，直接操作类的Class字节码对象，动态创建实例，操作属性或者方法。
    Class对象没有公共构造方法， 由jvm和类加载器中的defineClass方法自动构造。因为Class只有在加载类的时候才能自动构造，因此获取并使用他只能是在运行时状态
    获取Class有几种方式？
        1. Object.getClass()
        2. 类名.class字面量
        3. Class.forName(类名)
    私有构造方法，通过反射创建对象？ 暴力反射，setAccessible(true),实质是通知jvm，取消java语言的访问控制检查
    什么是泛型擦除？
        程序编译后产生的.class文件中是没有泛型约束的。
