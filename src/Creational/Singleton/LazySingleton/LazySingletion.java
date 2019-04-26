package Creational.Singleton.LazySingleton;

import Others.Annotation.NotThreadSafe;

/**
 * @author Maoxin
 * @ClassName LazySingletion
 * @date 4/12/2019
 */

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