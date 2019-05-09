package Behavioral.TemplateMethod;

/**
 * Created by geely
 */
public class DesignPatternCourse extends AbstractCourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
