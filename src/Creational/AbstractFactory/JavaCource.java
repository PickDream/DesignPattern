package Creational.AbstractFactory;

/**
 * @author Maoxin
 * @ClassName JavaCource
 * @date 4/11/2019
 */
public class JavaCource implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Artical getArtical() {
        return new JavaArtical();
    }
}
