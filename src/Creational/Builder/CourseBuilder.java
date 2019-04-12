package Creational.Builder;

/**
 * @author Maoxin
 * @ClassName CourseBuilder
 * @date 4/11/2019
 */
public abstract class CourseBuilder {
//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseQA;
//    private String courseNote;

    public abstract CourseBuilder buildCourseName(String courseName);
    public abstract CourseBuilder buildCoursePPT(String pptName);
    public abstract CourseBuilder buildCourseVideo(String courseVideo);
    public abstract CourseBuilder buildCourseArtical(String courseArtical);
    public abstract CourseBuilder buildCourseQA(String courseQA);
    public abstract Course build();

}
