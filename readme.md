### SpringBoot多模块项目搭建
参考:  
[Spring Boot 多模块项目创建与配置](https://testerhome.com/topics/11359)

问题:
> mvnw,mvnw.cmd是什么文件?

 答: mvnw全名是Maven Wrapper,它的原理是在maven-wrapper.properties文件中记录你要使用的Maven版本，当用户执行mvnw clean 命令时，发现当前用户的Maven版本和期望的版本不一致，那么就下载期望的版本，然后用期望的版本来执行mvn命令