package Behavioral.Observer;

import java.util.Observable;

/**
 * 被观察者：Observalbe
 * */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        //表明状态发生改变
        setChanged();
        //传递消息
        notifyObservers(question);
    }
}
