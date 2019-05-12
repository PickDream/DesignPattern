package Behavioral.Observer;

public class Test {
    public static void main(String[] args) {
        //被观察者（维护观察者的列表）
        Course course = new Course("Java Design Pattern");
        //观察者
        Teacher teacher = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Alpha");
        //被观察者添加对他感兴趣的观察者
        course.addObserver(teacher);
        course.addObserver(teacher2);

        //设置观察者与被观察者之间传递的消息
        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("HelloWorld写法很奇怪");
        //修改被观察者的状态
        course.produceQuestion(course,question);

    }
}
