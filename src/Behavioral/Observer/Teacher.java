package Behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者 Teacher
 * Teacher需要观察到Course的更新
 * */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName){
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接受到一个"
                +question.getUserName()+"提交的"+question.getQuestionContent());
    }
}
