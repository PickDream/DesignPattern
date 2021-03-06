# 外观模式/门面模式

提供一个统一的接口，用来访问子系统的一群接口，外观模式定义了一个高层的接口，让子系统更容易去使用

## 适用场景

+ 子系统越来越复杂，增加外观模式提供简单的接口调用

+ 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用

+ Web应用的Controller层其实就是一个外观模式

## 优点

+ 简化了调用过程，无需深入了解子系统，防止带来风险

+ 减少系统依赖，松散耦合

+ 更好的划分访问层次

+ 符合迪米特法则，最少知道（知识）原则

## 缺点

+ 增加子系统，扩展子系统行为的时候容易引入风险

+ 不符合开闭原则

## 相关的模式

+ 中介者模式的区别

外观模式关注外界和子系统的交互，中介者模式关注的是子系统内部的实现

+ 外观模式与单例模式的结合

常常将一般的外观对象作为单例使用

+ 与抽象工厂模式的结合

外观模式通过抽象工厂来获得子系统的实例

### 在源码中体现
+ Spring框架中的`ApplicationContext`类完成了
    + 读取配置信息
    + 将Bean注册到Factory
    + ...
+ Spring的JDBCUtils类
+ MyBatis的Configuration类
+ Tomcat的RequestFacade其实现了HttpServletRequest等等


