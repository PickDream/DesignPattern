package Creational.FactoryMethod;

/**
 * @author Maoxin
 * @ClassName PythonVideoFactory
 * @date 4/10/2019
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
