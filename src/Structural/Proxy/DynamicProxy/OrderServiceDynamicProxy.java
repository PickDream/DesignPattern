package Structural.Proxy.DynamicProxy;

import Structural.Proxy.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target){
        this.target = target;
    }
    /**
     * @param proxy
     * @param method 要执行的方法
     * @param args 方法传入的参数
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        afterMethod((Order) argObject);
        return null;
    }

    public Object bind(){
        Class cls = target.getClass();
        //传入ClassLoader，实现的接口，InvocationHandler实例
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }



    private void beforeMethod(Object order){
        System.out.println("Before...");
    }
    private void afterMethod(Order order){
        System.out.println("After...");
    }
}
