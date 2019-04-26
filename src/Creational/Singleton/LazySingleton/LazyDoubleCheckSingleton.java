package Creational.Singleton.LazySingleton;

import Others.Annotation.NotThreadSafe;

/**
 * @author Maoxin
 * @ClassName LazyDoubleCheckSingleton
 * @date 4/12/2019
 */
@NotThreadSafe
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
