# 享元模式
享元模式，其实就是想办法重用已经创建过的对象，例如`Integer`等类中缓存的对象等等


## 适用场景
+ 其常常用于系统底层的开发，以便与解决系统的性能问题
+ 系统有大量相似的对象，需要缓冲池的场景

## 优点
+ 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
+ 减少内存之外其他资源的占用
## 缺点
+ 增加了复杂性
## 在源码中的应用
+ `Integer`的`ValueOf`获取对象的时候其获得的是`IntegerCache`缓冲的256个对象其中的一个
 ```java
Interger a = Integer.valueOf(100);
Integer b = 100;
Integer c = Integer.valueOf(1000);
Integer d = 1000;
System.out.println("a==b"+(a==b));
System.out.println("c==d"+(c==d));
```
+ 在连接池中的体现,连接池中的对象保存在双端队列中，同时`KeyedPooledObjectFactory`定义了在连接池对象的许多方法
    + 激活对象
    + 销毁对象
    + 创建对象
    + 钝化对象
    + 校验对象
