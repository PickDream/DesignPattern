package Creational.Singleton.EnumInstance;

import java.io.*;

/**
 * @author Maoxin
 * @ClassName Test
 * @date 4/13/2019
 */
public class Test implements Serializable {
    //序列化测试
    public static void SerializeTest() throws IOException, ClassNotFoundException {
        EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects"));
        oos.writeObject(instance);
        File file = new File("objects");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance instance2 = (EnumInstance) ois.readObject();
        System.out.println(instance==instance2);
    }

    public static void main(String[] args)throws Exception{
        SerializeTest();
    }
}
