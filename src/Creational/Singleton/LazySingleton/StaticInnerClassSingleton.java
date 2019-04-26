package Creational.Singleton.LazySingleton;

/**
 * @author Maoxin
 * @ClassName StaticInnerClassSingleton
 * @date 4/13/2019
 */
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
