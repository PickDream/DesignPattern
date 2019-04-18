package Structural.Adapter.ClassAdapter;

/**
 * 具体的目标
 * Created by geely
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
