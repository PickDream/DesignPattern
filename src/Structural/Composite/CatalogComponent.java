package Structural.Composite;

/**
 * 该类指明的是与目录相关的类都应该拥有什么方法
 * 在这个实例中，相关的类只有两个
 * 一个是目录类
 * 一个是具体的课程类
 * 将这两个类的方法都抽象出来，放在一个抽象类中，而其具体的实现通过选择性重写抽象类
 * 的方法来完成，这就是组合模式
 * @author Maoxin
 * @ClassName CatalogComponent
 * @date 4/21/2019
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent component){
        throw new UnsupportedOperationException("不支持的添加操作");
    }
    public void remove(CatalogComponent component){
        throw new UnsupportedOperationException("不支持的删除操作");
    }
    public String getName(CatalogComponent component){
        throw new UnsupportedOperationException("不支持的获取名字的操作");
    }
    public double getPrice(CatalogComponent component){
        throw  new UnsupportedOperationException("不支持的获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
