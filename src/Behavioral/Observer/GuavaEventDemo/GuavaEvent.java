package Behavioral.Observer.GuavaEventDemo;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行了Subscribe方法，传入的参数是："+str);
    }
}
