# 单例模式
 可以很简单，可以很复杂
 
## 使用场景

+ 在任何情况下都绝对只有一个实例的场景
+ 单服务情况下的网站计数器
+ 线程池
+ 数据库连接池

## 优点
+ 控制在内存中只有一个实例，减小了内存开销
+ 可以避免对资源的多重占用
+ 设置全局访问点，严格控制访问方式
## 缺点
+ 没有接口，扩展困难
## 单例的特点与关键概念

+ 私有构造器
+ 线程安全
+ 双重检查锁
+ 延迟加载
+ 序列化以及反序列化安全
+ 防止反射攻击

## 相关设计模式
+ 工厂类
+ 享元模式

## 单例模式设计的演进
> 注意，在单例模式的演进中的示例代码中有@ThreadSafe以及@NotThreadSafe来指明演示代码是否是线程安全的

### 懒汉式
+ 单线程写法（线程不安全）
```java
@NotThreadSafe
public class LazySingletion {

    private static LazySingletion lazySingletion = null;
    public static LazySingletion getInstance(){
        if (lazySingletion==null){
            lazySingletion = new LazySingletion();
        }
        return lazySingletion;
    }
}
```
+ 第一种改进,直接加对Class加锁
```java
@ThreadSafe
public class LazySingletion {

    private static LazySingletion lazySingletion = null;
    public synchronized static LazySingletion getInstance(){
        if (lazySingletion==null){
            lazySingletion = new LazySingletion();
        }
        return lazySingletion;
    }
}
```
第一种虽然解决了线程不安全的问题但是效率很低，即使已经创建好了对象但是每次获取都需要获取锁
+ 双重检查锁(依旧有隐患,来源于指令重排序)
```java
@NotThreadSafe
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton singleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
//1.
        if (singleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (singleton==null){
//2.
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
```
隐患主要来源于指令重排序：
在`new LazyDoubleCheckSingleton`其涉及多个步骤，会发生指令重排序，例如

|顺序|预期顺序|实际顺序|
|:---|:----|:----|
|1|为对象分配内存|为对象分配内存|
|2|初始化对象|设置lazyDoubleCheckSingleton引用指向这个对象|
|3|设置lazyDoubleCheckSingleton引用指向这个对象|初始化对象|

由于JMM定义的`intra-thread semantics`可知，指令重排序是不影响单线程的执行顺序的，但是在多线程的情况下
由于指令重排序，在未初始化完成就暴露给其他线程这个对象的地址依然是很危险的事情，解决方案就是加入volatile关键字

`volatile` 关键字可以禁止指令重排序，并且保证内存可见性

```java
@ThreadSafe
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton singleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (singleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (singleton==null){
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
```
需要注意的是，对于重排序有两种解决方案
1. 不允许重排序
2. 不允许其他线程看到重排序

下面就通过静态内部类来完成以上第二点的内容，不允许其他线程看到重排序
```java
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        
    }
}
```

究其原因，是因为Class类对象在初始化阶段的过程中是加锁的，这个加锁一直持续到其完成初始化，这个时候即使会发生重排序，也没有什么问题

### 饿汉式

```java
public class HungrySingleton {
    private final static HungrySingleton singleton;
    static {
        singleton = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
```
## 单例模式的其他安全隐患

### 序列化和反序列化破坏单例模式
当单例模式实现序列化接口的时候如果被序列化之后进行反序列化的过程的时候，返回的对象并不是已经存在的单例对象，这个时候就需要在单例类中加入：
```java
private Object readResolve(){
    return singleton;
}
```
这个函数是`ObjectInputStream`对象中的`readObject`方法在创建了一个新的对象之后还会判断是否有这个方法并执行
###  反射攻击的解决方案
所谓反射攻击，就是利用反射修改构造器权限并且创建一个新对象，对于饿汉式单例，可以在构造器进行判断
```java
public class HungrySingleton {
    private final static HungrySingleton singleton;
    static {
        singleton = new HungrySingleton();
    }
    private HungrySingleton(){
        //反射防御的内容
        if (singleton!=null)
            throw new RuntimeException("单例构造器不允许反射创建");
    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
```
这样的方式对于在类加载期间创建对象的方式是有效的，但是对于懒汉式就不行了,对于懒汉式可以吸收饿汉式的经验添加一些静态的标志量，但是这些依然可以通过反射被破坏

## 其他单例模式

### 枚举单例（Effective Java 推荐）

### 容器单例

### ThreadLocal单例

## 总结



