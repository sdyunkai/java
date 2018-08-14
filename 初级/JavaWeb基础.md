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
# 服务器端开发
  1. xml&Tomcat
  2. Web核心技术: servlet
  3. Web核心技术: request&response
  4. JSP&EL
# 数据库高级开发
  1. 事务操作
  2. 分页操作
# 服务器高级开发
  1. 过滤器和监听器
  2. ajax&jQuey的ajax
  