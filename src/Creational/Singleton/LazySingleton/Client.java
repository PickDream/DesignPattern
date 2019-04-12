package Creational.Singleton.LazySingleton;

/**
 * @author Maoxin
 * @ClassName Client
 * @date 4/12/2019
 */
public class Client {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program");
    }
}
