### 完成度：
__Details:__
- \- AppController.java:40 缺少专门查看team的接口

### 知识点：
* 了解下lombok
* 了解下三层架构
* 了解下Spring IoC Container
* 了解下restful最佳实践

__Details:__
- \- AppController.java:13 推荐使用构造器注入
- \- AppController.java:22 根据restful实践，资源名一般是复数
- \- AppController.java:23 根据restful实践，POST方法一般返回创建的内容或者Id
- \- AppController.java:24 如果不是有自定义返回的需求，ResponseEntity一般可省略
- \- AppController.java:25 Post请求的传参方式，一般使用@RequestBody
- \- AppService.java:11 数据存储相关的操作，不属于service的职责，应该抽取repository层做

### 工程实践：
__Details:__
- \- AppController.java:11 controller命名需要符合资源命名
- \- AppController.java:34 team相关的接口，单独抽取一个controller来做，与students不是操作的一个资源
- \- AppService.java:41 长方法，需要按模块抽取方法，进行重构
- \- AppService.java:45 Magic number 6， 5
- \- AppService.java:51 命名不够表意
