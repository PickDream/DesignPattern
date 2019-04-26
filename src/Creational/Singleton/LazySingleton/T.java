package Creational.Singleton.LazySingleton;

/**
 * @author Maoxin
 * @ClassName T
 * @date 4/12/2019
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingletion lazySingletion = LazySingletion.getInstance();
        System.out.println(lazySingletion);
    }
}
