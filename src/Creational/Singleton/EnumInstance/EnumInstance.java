package Creational.Singleton.EnumInstance;

/**
 * @author Maoxin
 * @ClassName EnumInstance
 * @date 4/13/2019
 */
public enum  EnumInstance {

    INSTANCE;

    private Object data;

    public Object getData(){
        return data;
    }
    public void setData(Object in){
        data = in;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
