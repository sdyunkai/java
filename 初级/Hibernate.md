# Hibernate
  Java下的ORM解决方案，开源

# 设计目标
  将软件开发人员从大量相同的数据持久层相关编程工作中解放出来。

# 发展历程
  2001年，澳大利亚墨尔本 Gavin King 27岁的程序员开发
  2003年，Hibernate进入JBoss
  2004年，整个java社区从实体bean向hibernate转移，
  Rod Johson的<<Expert One-on-One jee dep without ejb>>>,否定EJB，
  提出轻量级敏捷开发理念，以hibernate和spring为代表的轻量级开源框架开始成为
  java世界的主流和事实标准
  2006年，jee5.0，发布jpa，基本参考hibernate标准实现

# 使用
  加载jar
  配置文件

# API
  1. Configuration
  2. SessionFactory
    线程安全
    二级缓存：自动生成的sql，可重复利用的数据、映射数据
    一般情况，一个工程只需要一个，在static code block中构建
  3. Session
    获取： openSession ,getCurrentSession
    前者线程不安全，后着安全。
    前者需要close，后者自动
    操作对象的持久化，crud，一级缓存：当前工作单元加载的对象。
  4. Transaction

# Hibernate Reference
  1. hibernate中的对象状态
    三种状态： 瞬时、持久、游离
      瞬时状态： 没有id 没有在session缓存
      持久化： 有id 在session缓存
      游离： 有id 没有在session缓存
    状态转换： new -> saveOrupdate -> delete 
              close 
  2. 一级缓存
    提高查询效率，减少不必要的修改语句
    持久态对象为什么会自动更新数据库?
      依赖缓存快照：  
    
  3. 如何在项目中管理事务
    业务开始开启事务，正常完成commit，异常rollback
    事务控制一般放在service层
    使用getCurrentSession，要配合配置文件中的current_session_context_class配置
    getCurrentSession获取的session对象，事务提交的时候会自动关闭，不要手动调用close
  4. 批量查询
    多表不复杂，HQL
    单表条件Criteria
    复杂的业务查询,原生SQL
  5. 持久化类编写规则
    提供无参构造方法、属性私有提供getset、属性尽量使用包装类型（避免歧义,业务上的）、有一个唯一表示oid与表的主键对应、尽量不要使用final修饰（延迟加载的时候，会生成代理类，cglib代理，继承目标类，使用final，延迟加载的机制就会失效）
  6. 表关系
    一对一、一对多、多对多
    cascade（级联） 、inverse(维护外键)
    如果是多对多的关系，一定要选择一方放弃维护外键关系。
  7. 查询优化
    配置抓取策略和延迟加载  
    类级别查询：
      lazy 延迟加载 返回代理对象 使用属性的时候查询数据库
    关联级别查询：
      集合策略： lazy：true,false,extra、fetch:（使用什么类型sql加载集合数据)select（单表查询）、join（多表查询）、subselect
      关联属性策略： fetch :select,join 、lazy： false , proxy 
    批量抓取：
      batch-size： 抓取集合的数量（比如抓取客户的集合时候，一次抓取几个客户的联系人集合）
    no-session 问题解决： 扩大session作用范围
    如何扩大session作用范围？
      通过filter实现。 


