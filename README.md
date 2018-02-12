# Spring + Spring MVC + MyBaits + Maven Example

[SSM框架超级详细整合记录：Spring+Spring MVC+MyBatis+Maven+Git+MySQL+IDEA](http://blog.csdn.net/hanchao5272/article/details/79305666)

## 1.前言
本文主要对SSM框架整合的过程进行记录，作为之后参考的依据。

### 1.1.参考文章
[Spring代码实例系列-绪论](http://blog.csdn.net/hanchao5272/article/details/78994070)
[Spring MVC代码实例系列-绪论](http://blog.csdn.net/hanchao5272/article/details/79052074)
[MyBatis代码实例系列-绪论](http://blog.csdn.net/hanchao5272/article/details/79184189)

### 1.2.技术简介
在整合的SSM框架中，主要涉及的框架、插件或技术有：

- Spring：一个轻量级的控制反转（IoC）和面向切面（AOP）的容器框架。
- Spring MVC：一个用于构建 Web 应用程序的MVC框架(Spring的一个模块)，可以替代Struts等等。
- MyBatis：一个基于Java的持久层框架。
- Maven：一款流行的项目管理与构建工具。
- Git：一款流行的版本控制工具。
- MySQL：一款常用的关系型数据库。
- IDEA：一款流行的Java开发IDE。
- .gitignore：Git忽略规则文件，控制不需要添加到版本库的文件。
- README.md：项目说明。
- Junit4：一款常用的Java单元测试技术。
- JunitGenerator：一款IDEA提供的Junit插件。
- log4j：一款流行的开源日志实现项目，可以控制日志信息输送的目的地是控制台、文件等等。
- maven-compiler-plugin：可以集成到Maven的编译插件，用于解决IDEA项目刷新jdk回退的问题。
- tomcat7-maven-plugin：可以集成到Maven的tomcat插件，省去tomcat的下载安装等工作。
- mybatis-generator-maven-plugin：可以集成到Maven的MyBatis代码生成插件，用于生成MyBatis所需的三类文件。
- com.haier.hairy.mybatis-generator-core：一个可用的mybatis-generator二次开发jar包。
- org.github.pagehelper：一款可用的MyBatis分页插件。
- hibernate-validator：一个表单字段校验jar包。
- JsonResult：一个以泛型编写的通用的返回json对象的类。
- ValidationUtils：一个简单的校验工具类。
- CharacterEncodingFilter：编码过滤器，解决POST请求中文乱码问题。
- IntrospectorCleanupListener：内存清理监听，放置Spring内存泄漏。

## 2.SSM整合

[详见博文](http://blog.csdn.net/hanchao5272/article/details/79305666)

## 3.总结

1. <font color=red>**目录初始化**</font>
2. <font color=green>配置log4j并进行验证</font>
3. <font color=green>安装JUnitGenerator插件验证junit</font>
4. <font color=red>**初步整合Spring+Spring MVC**</font>
5. <font color=green>添加表单校验：hibernate-validator</font>
6. <font color=green>配置Spring MVC拦截器</font>
7. <font color=green>配置Spring MVC文件上传</font>
8. <font color=red>**初步整合MyBatis**</font>
9. <font color=green>实现MyBatis对SQL的打印</font>
10. <font color=green>配置分页插件PageHelper</font>
11. <font color=green>配置MyBatis Generator</font>

其中，

- 只有第1、4、8步骤是整合SSM的必须步骤。
- 第2、3、5、6、7、9、10、11都不是必须的，但是确是常用的。
- 可以根据项目情况选择取舍。