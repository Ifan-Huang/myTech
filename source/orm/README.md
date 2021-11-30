## 自定义ORM框架

#### 框架端

1. 加载应用端配置文件、 提供读取应用端关键配置文件Mapper.xml及SqlMapperConfig.xml的功能。将配置文件加载成为字节输入流、存储在内存中。创建Resource类 方法：InputSteam getResourceAsStream(String path)。
2. 提供两个对象、分别存放两个配置文件中解析出的内容。Configuration、MapperStatement。
3. 解析配置文件：dom4j。创建类：SqlSessionFactoryBuilder method: build(InputStream is) 使用dom4j解析配置文件、解析出来的内容封装到容器对象当中。 随后创建SqlSessionFactory对象；生产SqlSession会话对象。
4. 创建SqlSessionFactory接口及实现类DefaultSqlSessionFactory。method: openSession() 生产SqlSession对象。
5. 创建SqlSession接口及实现类DefaultSqlSession，实现对于数据库的CRUD操作：SelectList、SelectOne、update、delete。
6. 创建Excutor接口及实现类SimpleExcutor method：query(Configuration, MapperStatement, Object... params)以执行JDBC代码。

####  应用端

1. 引入框架对应依赖或jar包。
2. 提供SqlMapperConfig.xml及Mapper.xml以应用。