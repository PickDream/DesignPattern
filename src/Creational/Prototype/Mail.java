package Creational.Prototype;

/**
 * @author Maoxin
 * @ClassName Mail
 * @date 4/14/2019
 */
public class Mail implements Cloneable{
    private String name;
    private String email;
    private String content;
    public Mail(){
        System.out.println("Main Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("执行可控方法");
        return super.clone();
    }
}
