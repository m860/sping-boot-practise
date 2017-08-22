# spring-boot-practise

Learn spring boot step by step.

## [spring-boot-devtools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html)

*property defaults* 

*live reload*

### 配置livereload

```shell
$ ./gradlew build --continuous  # 持续编译,当源代码发生改变时将自动进行编译
$ ./gradlew bootRun # 运行application
```

如果在浏览器中还需要实现同步刷新,需要在浏览器中安装一个插件[live reload](http://livereload.com/extensions/)

### 如果在console查看unit test summary?

使用gradle plugin [gradle-console-reporter](https://github.com/ksoichiro/gradle-console-reporter)

## TODO

- [x] auto restart & live reload
- [x] unit test
- [ ] environment variable
