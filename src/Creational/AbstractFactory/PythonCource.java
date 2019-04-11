package Creational.AbstractFactory;

/**
 * @author Maoxin
 * @ClassName PythonCource
 * @date 4/11/2019
 */
public class PythonCource implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Artical getArtical() {
        return new PythonArtical();
    }
}
