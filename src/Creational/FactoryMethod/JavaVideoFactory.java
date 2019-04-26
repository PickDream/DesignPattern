package Creational.FactoryMethod;

/**
 * @author Maoxin
 * @ClassName JavaVideoFactory
 * @date 4/10/2019
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
