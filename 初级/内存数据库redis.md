# 简介
  内存数据库，nosql，本质上就是一个特殊的数据结构集合
  c编写，linux安装需要编译
  key-value存储系统

# bin
  redies-benchmark、redis-check-aof、redis-check-dump、redis-cli、redis.conf、redis-server

# 使用
  1. key
    key字符串类型，不要太长，最好不要超过1024byte，消耗内存，降低查找效率
    key也不要太短，太短会降低可读性
    key要有统一的命名规范
  2. value（支持五种数据类型）
    a) string、lists、sets、sorted sets、hashs
    b) string类型的value，二进制安全，最大存储521M
  3. 应用场景
    缓存（数据查询、短链接、新闻内容、商品内容)、聊天室的在线好友列表、任务队列（秒杀、抢购、12306）、应用排行榜、网站访问统计、数据过期处理、分布式集群架构中的session分离
  4. list rpoplpush应用场景
    消息队列，处理消息的时候程序崩溃，通过从主消息队列出数据，同时插入备份消息队列，完成正常逻辑删除，如果备份消息队列超时，则重新放回主队列
  5. set使用场景
    跟踪一些唯一性数据，比如ip地址、服务端的聚合操作高效、方便
  6. sorted-set使用场景
    游戏排名、微博热点话题

# 特性
  1. 一个redis实列可以包含多个数据库，最多可提供16个
  2. 服务器命令
    选择数据库、获取服务器信息和统计、删除数据库中的所有可以
  3. 消息发布和订阅、
  4. 事务
    multi、exec、discard
  5. 持久化
    RDB、AOF

# redis使用场景
  1. 取最新N个数据的操作，最新的评论
  2. 排行榜应用
  3. 精准设定过期时间的应用
  4. 计数器
  5. unique
  6. 实时系统，反垃圾系统
  7. pub/sub构建实时消息系统
  8. 队列
  
# NoSQL (not only sql) 应对大数据，高并发
  1. 四大类
   a. key-value
    Redis、内容缓存，处理大量数据的高访问负载、键值对、快速查询、存储的数据缺少结构化
   b. column db
    Cassandra，Hbase、分布式文件系统、列簇式存储，将同一列数据存在一起、查找速度块，可扩展性强，更容易进行分布式扩展、功能相对局限
   c. 文档型数据库
    CouchDB，MongoDB、web应用、键值对、数据结构要求不严格，value结构化、查询性能不高，缺乏统一的查询语法
   d. 图数据库
    Neo4J,InfoGrid,Infinite Graph、社交网络、图结构、利用图结构相关算法、需要对整个图做计算才能得出结果，不容易做分布式的集群方案
  
  2. 特点
    大数据存储上具备关系型数据库无法比拟的性能优势
    a. 易扩展
    b. 大数据量、高性能
    c. 灵活的数据模型
    d. 高可用