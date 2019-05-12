package Behavioral.Observer.GuavaEventDemo;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent event = new GuavaEvent();
        eventBus.register(event);
        eventBus.post("post的内容");

    }
}
