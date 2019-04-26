package Creational.Singleton.ContainerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Maoxin
 * @ClassName ContainerSingleton
 * @date 4/13/2019
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap = new ConcurrentHashMap<>();
    public static void putInstance(String key,Object instance){
        //简单的判断
        if (key!=null&&instance!=null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }
    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
