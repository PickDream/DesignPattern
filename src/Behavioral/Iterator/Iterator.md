# 迭代器
提提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示
## 优点
+ 分离了集合对象的遍历行为
## 缺点
+ 类的个数成对增加
## 与其他设计模式进行比较
+ 注意访问者模式的区别
## 设计方式
这里针对一个Course的List写一个简单的且带起进行处理
```java
public class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
//封装List的课程合计类实现
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
//迭代器接口
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}
//迭代器实现
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}
```
