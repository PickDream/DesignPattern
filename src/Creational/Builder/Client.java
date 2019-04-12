package Creational.Builder;

/**
 * @author Maoxin
 * @ClassName Client
 * @date 4/12/2019
 */
public class Client {
    public static void main(String[] args) {
        Course course = new Course.ActualCourseBuilder().buildCourseArtical("Artical")
                .buildCourseName("Name").buildCoursePPT("PPT").buildCourseQA("QA").buildCourseVideo("video")
                .build();
        System.out.println(course);
    }
}
