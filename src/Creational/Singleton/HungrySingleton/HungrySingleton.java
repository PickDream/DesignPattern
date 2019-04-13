package Creational.Singleton.HungrySingleton;

/**
 * @author Maoxin
 * @ClassName HungrySingleton
 * @date 4/13/2019
 */
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
