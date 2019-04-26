package Creational.Builder;

/**
 * @author Maoxin
 * @ClassName Course
 * @date 4/11/2019
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseQA;
    private String courseNote;


    //
    public static class ActualCourseBuilder extends CourseBuilder{
        private Course course = new Course();
        @Override
        public CourseBuilder buildCourseName(String courseName) {
            course.setCourseName(courseName);
            return this;
        }

        @Override
        public CourseBuilder buildCoursePPT(String pptName) {
            course.setCoursePPT(pptName);
            return this;
        }

        @Override
        public CourseBuilder buildCourseVideo(String courseVideo) {
            course.setCourseVideo(courseVideo);
            return this;
        }

        @Override
        public CourseBuilder buildCourseArtical(String courseArtical) {
            course.setCourseNote(courseArtical);
            return this;
        }

        @Override
        public CourseBuilder buildCourseQA(String courseQA) {
            course.setCourseQA(courseQA);
            return this;
        }

        @Override
        public Course build() {
            return this.course;
        }
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    public String getCourseNote() {
        return courseNote;
    }

    public void setCourseNote(String courseNote) {
        this.courseNote = courseNote;
    }
}
