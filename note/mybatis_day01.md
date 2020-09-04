# Mybatis框架

简介:属于持久层的框架,代替JDBC技术来和DB进行交互.前身是ibatis框架.源码迁移到github上去了.

mybatis官方学习手册:https://mybatis.org/mybatis-3/zh/index.html

mybatis下载github:https://github.com/mybatis/mybatis-3/releases

最新版本3.5.5



# JDBC的弊端

* 编程步骤比较繁琐,影响开发效率.
* sql语句和java代码耦合在一块儿,不方便后期的维护.
* 查询结果集到java对象需要进行手动封装,过多考虑列的数据类型以及java对象的属性类型.
* 发送参数的时候,也是需要手动一一发送参数的.



## 好处

* 为访问不同的DB提供一个统一的路径.面向JDBC编程 - 面向接口编程.
* mybatis框架以及hibernate框架底层都是基于jdbc技术来实现的.



## mybatis和hibernate

ORM只是一个思想[对象到关系的映射的思想] - mybatis以及hibernate都是对ORM思想的具体的实现.

* mybatis是最火的**半自动的ORM框架** - 查询的结果有的时候需要手动绑定到java对象.
  * ***需要较强的***sql能力的,还是需要写sql以及进行sql优化的.
* hibernate是最火的**全自动的ORM框架** - 查询的结果可以自动封装到java对象
  * 不需要写sql语句,写的hql语句[面向对象的查询语言 - 底层是对sql语言的封装].



# 搭建mybatis的环境

* 创建java工程
* 导入mybatis-3.5.5.jar - 才能去使用mybatis框架的API



# mybatis核心图

![](imgs/mybatis.png) 

* mybatis-config.xml

  mybatis的主配置文件[数据库连接池以及事务配置] - mybatis框架运行的上下文环境.

* mapper.xml

  映射文件 - 写sql的地方.把sql语句和程序代码进行了分离.把所有的sql语句全部移植到mapper.xml映射文件中去了.

* 核心的API

  * SqlSessionFactoryBuilder

    作用:利用加载到内存中的mybatis-config.xml文件配置的一切信息来构建一个重量级的对象SqlSessionFactory

  * SqlSessionFactory

    重量级的对象,等同于JDBC中学习的连接池对象.数据源=连接池.线程安全.一个项目只需要配置一个数据源.

    负责创建SqlSession对象的

  * SqlSession

    负责创建一次会话,SqlSession = Connection(jdbc) + Cache(一级缓存);面向程序员的对象.

    该对象负责让我们程序员进行CRUD操作[提供很多操作DB的API].

  * Executor 

    执行器 - 不是面向程序员的,面向DB的.

    * BaseExecutor - 基本执行器
    * CachingExecutor - 缓存执行器[二级缓存,第三方缓存框架].

* MappedStatement

  mybatis底层的一个对象.封装我们映射文件中的所有的sql标签以及sql语句的.



# idea配置dtd文件

dtd文件在下载的mybatis的source code目录中.

mybatis-3-config.dtd以及mybatis-3-mapper.dtd



# 原始dao开发

* 创建表tbl_user
* 创建实体类User.java
* 写dao
* 编写映射文件UserDaoMapper.xml
* 写dao实现类



# 映射文件中

* select标签

  * ***resultType属性 - 指定返回的结果的对象.***

    实现查询列到实体之间的自动映射的过程.注意的是什么情况下才可以做到自动映射呢?

    必须是当且仅当***列名和实体中的属性名保持一致的时候*** **- 思考为什么可以做到???**

    * 查询列的名称框架有没有办法拿到 - ResultSetMetaData

    * tech.aistar.entity.User -> 反射得到user对应的class实例,反射创建user对象

    * 假设列的名称叫username -> 由于列的名称和属性的名称保持一致 -> Field对象

    * f.set(user对象,当前username这个列对应的列的值);

    * ----

    * 努力setter方法出来 - Method对象 - invoke(对象,列值);
  
  * resultType属性值的类型一定是接口中方法的返回类型保持值.如果是结合,resultType属性值应该是集合的泛型,默认情况下应该是写类型的全限定名.否则会抛出一个异常
  
    ~~~java
    org.apache.ibatis.type.TypeException: Could not resolve type alias 'User'.
    ~~~
  
    

# SqlSession-API

* selectList - 查询结果返回的是一个集合
* selectOne - 查询结果返回的是一个单个对象
* insert
* update
* delete

# mybatis主配置文件

* settings标签

  ~~~xml
   <settings>
     <!--        是否开启驼峰命名自动映射，即从经典数据库列名 A_COLUMN 映射到经典 Java 属性名 aColumn。-->
     <setting name="mapUnderscoreToCamelCase" value="true"/>
  </settings>
  ~~~

* typeAliases

  ~~~xml
  <!--    主要是给参数类型或者返回类型取别名-->
  <typeAliases>
    <!--        第一种写法:一一取别名 - 不推荐使用-->
    <!--        <typeAlias type="tech.aistar.entity.User" alias="user"></typeAlias>-->
  
    <!--        第二种写法:可以直接扫包操作,允许出现多个package标签-->
    <package name="tech.aistar.entity"/>
    <!--        <package name="tech.aistar.dto"/>-->
  </typeAliases>
  
  别名就允许使用user或者User即可.
  ~~~

# 占位符

 

* >  # 如果参数是简单类型[基本数据类型以及包装类型以及字符串类型] - #{value}

  也可以使用方法的参数的变量的名称#{username}

   不会造成sql注入的问题

* >  $ - 会

  是存在sql注入的问题.

* 分析#{}和${}的区别

  ~~~mysql
  select * from tbl_user where user_name = #{username}
  若使用#{username} -> 会pst.setString(1,username);//自动把username变成string类型
  select * from tbl_user where user_name = 'tom3';
  
  select * from tbl_user where user_name = ${username}
  直接将参数username的参数值原封不动的拼接到了sql
  select * from tbl_user where user_name = tom3;
  ~~~

  

# Mapper代理开发方式

简介:替代原始dao开发的.底层jdk动态代理.讲究的是规范.只要违背任何一个规范,都会报错.

* 去除了dao,取而代之的是mapper √
* ***接口的命名一定更要规范 - UserMapper.java***  √
* ***映射文件命名一定要和mapper接口名称高度保持一致 - UserMapper.xml*** √
* ***映射文件的位置一定要和mapper接口的位置在同一个包中 √***

* **映射文件中的namespace的属性值一定是mapper接口的全限定名 √**

* ***映射文件的标签的id属性的值必须和mapper接口中定义的方法的名称高度保持一致 √***

* mybatis-config.xml

  ~~~xml
   <mapper class="tech.aistar.mapper.UserMapper"></mapper>
  ~~~

  

## 底层剖析

* 第一步 - **加载mybatis-config.xml文件**以及映射文件

  ~~~java
  private static SqlSessionFactory factory = null;
  
  //通过静态代码块来读取mybatis-config.xml主配置文件
  static{
    try(InputStream in = Resources.getResourceAsStream("mybatis-config.xml")) {
      //2. 通过SqlSessionFactoryBuilder对象来利用mybatis-config.xml文件来构建出
      //数据源对象SqlSessionFactory
      factory = new SqlSessionFactoryBuilder().build(in);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  ctrl + 点击build方法
  public SqlSessionFactory build(InputStream inputStream) {
    return this.build((InputStream)inputStream, (String)null, (Properties)null);
  }
  ctrl + this.build方法
    
  public SqlSessionFactory build(InputStream inputStream, String environment, Properties properties) {
          SqlSessionFactory var5;
          try {
              XMLConfigBuilder parser = new XMLConfigBuilder(inputStream, environment, properties);
              //解析mybatis-config.xml文件的过程.
              var5 = this.build(parser.parse());
          } catch (Exception var14) {
              throw ExceptionFactory.wrapException("Error building SqlSession.", var14);
          } finally {
              ErrorContext.instance().reset();
  
              try {
                  inputStream.close();
              } catch (IOException var13) {
              }
  
          }
  
          return var5;
      }
  ~~~

* 第二步 - this.build(parser.parse());

  ~~~java
  public SqlSessionFactory build(Configuration config) {
    return new DefaultSqlSessionFactory(config);
  }
  ~~~

  点解DefaultSqlSessionFactory构造

  ~~~java
  public class DefaultSqlSessionFactory implements SqlSessionFactory {
      private final Configuration configuration;
  
      public DefaultSqlSessionFactory(Configuration configuration) {
          this.configuration = configuration;
      }
    //.....
  }
  ~~~

  达到第一个目的 - 将mybatis-config.xml配置文件映射关联到内存中的Configuration对象.

* 第三步 - > Configuration类中 - 观察空参构造

  ~~~java
  public Configuration(){
    //....
  	this.mapperRegistry = new MapperRegistry(this);
    //...
  }
  ~~~

* 第四步 - MapperRegistry - mapper注册器

  目的 - ***mybatis-config.xml中的配置的涉及到的mapper接口全部注册到mapper注册器中***

  ~~~java
  public <T> void addMapper(Class<T> type) {
          if (type.isInterface()) {
              if (this.hasMapper(type)) {
                  throw new BindingException("Type " + type + " is already known to the MapperRegistry.");
              }
  
              boolean loadCompleted = false;
  
              try {
                  this.knownMappers.put(type, new MapperProxyFactory(type));
                  MapperAnnotationBuilder parser = new MapperAnnotationBuilder(this.config, type);
                  parser.parse();
                  loadCompleted = true;
              } finally {
                  if (!loadCompleted) {
                      this.knownMappers.remove(type);
                  }
  
              }
          }
      }
  ~~~

* 第五步 -  MapperProxyFactory - 用来生成mapper接口的代理实现类的工厂.

* 第六步 - 通过MapperProxyFactory - > **MapperProxy** 

  ~~~java
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          try {
              return Object.class.equals(method.getDeclaringClass()) ? 
                method.invoke(this, args) :
            this.cachedInvoker(method).invoke(proxy, method, args, this.sqlSession);
          } catch (Throwable var5) {
              throw ExceptionUtil.unwrapThrowable(var5);
          }
      }
  
  调用我们在程序代码中调用被代理的接口UserMapper中的任何一个方法的时候比如findAll
  userMapper.findAll();//自动就会走此处的invoke方法.
  
  作用 - 在程序的运行的过程中通过动态代理的方式来给我们的目标Mapper接口在内存中生成一个该接口的代理实现类对象.
    
  点击this.cachedInvoker(method).invoke(proxy, method, args, this.sqlSession);
  private MapperProxy.MapperMethodInvoker cachedInvoker(Method method) throws Throwable {
          try {
              MapperProxy.MapperMethodInvoker invoker = (MapperProxy.MapperMethodInvoker)this.methodCache.get(method);
              return invoker != null ? invoker : (MapperProxy.MapperMethodInvoker)this.methodCache.computeIfAbsent(method, (m) -> {
                  if (m.isDefault()) {
                      try {
                          return privateLookupInMethod == null ? new MapperProxy.DefaultMethodInvoker(this.getMethodHandleJava8(method)) : new MapperProxy.DefaultMethodInvoker(this.getMethodHandleJava9(method));
                      } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException var4) {
                          throw new RuntimeException(var4);
                      }
                  } else {
                      return new MapperProxy.PlainMethodInvoker(new MapperMethod(this.mapperInterface, method, this.sqlSession.getConfiguration()));
                  }
              });
          } catch (RuntimeException var4) {
              Throwable cause = var4.getCause();
              throw (Throwable)(cause == null ? var4 : cause);
          }
      }
  ~~~

* 第七步 - MapperMethod

  ~~~java
  private final MapperMethod.SqlCommand command;//每条映射文件中的对应的sql标签对象.
  
  public Object execute(SqlSession sqlSession, Object[] args) {
          Object result;
          Object param;
          switch(this.command.getType()) {
          case INSERT:
              param = this.method.convertArgsToSqlCommandParam(args);
              result = this.rowCountResult(sqlSession.insert(this.command.getName(), param));
              break;
          case UPDATE:
              param = this.method.convertArgsToSqlCommandParam(args);
              result = this.rowCountResult(sqlSession.update(this.command.getName(), param));
              break;
          case DELETE:
              param = this.method.convertArgsToSqlCommandParam(args);
              result = this.rowCountResult(sqlSession.delete(this.command.getName(), param));
              break;
          case SELECT:
              if (this.method.returnsVoid() && this.method.hasResultHandler()) {
                  this.executeWithResultHandler(sqlSession, args);
                  result = null;
              } else if (this.method.returnsMany()) {
                  result = this.executeForMany(sqlSession, args);
              }
      }
    
    result = this.executeForMany(sqlSession, args);
    
    private <E> Object executeForMany(SqlSession sqlSession, Object[] args) {
          Object param = this.method.convertArgsToSqlCommandParam(args);
          List result;
          if (this.method.hasRowBounds()) {
              RowBounds rowBounds = this.method.extractRowBounds(args);
              result = sqlSession.selectList(this.command.getName(), param, rowBounds);
          } else {
            //关键性的步骤....
              result = sqlSession.selectList(this.command.getName(), param);
          }
  
          if (!this.method.getReturnType().isAssignableFrom(result.getClass())) {
              return this.method.getReturnType().isArray() ? this.convertToArray(result) : this.convertToDeclaredCollection(sqlSession.getConfiguration(), result);
          } else {
              return result;
          }
      }
  ~~~

  

  ## 流程

  * 加载mybatis-config.xml文件 -> Configuration对象
  * 继续解析mybatis-config.xml文件中的mappers标签中的配置的所有的mapper接口的类.
    * 由于mapper映射文件和mapper接口名称以及位置高度保持一致,瞬间将mapper.xml文件加载到内存中
    * 将所有的mapper接口放入到MapperRegistry中[mapper注册器中] - MapperProxyFactory[mapper代理工厂]

  * sqlSession.getMapper(UserMapper.class);// -> 根据Mapper的类型来得到目录mapper接口呀.
  * userMapper.findAll();
    * mapper的接口的类的全限定名,比如tech.aistar.mapper.UserMapper
    * 当前正在被调用的方法的名称findAll肯定也是可以能拿到的.

  * MapperMethod中invoke方法 -> sqlSession的API -> 第一个参数namespace.标签的id值
    * namespace的值 - mapperInteface的全限定名.
    * 标签的id值 - 方法的名称.