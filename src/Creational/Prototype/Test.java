package Creational.Prototype;

/**
 * @author Maoxin
 * @ClassName Test
 * @date 4/14/2019
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化内容");
        for (int i =0;i<10;i++){
            //克隆对象
            Mail mailTemp =(Mail)mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmail(i+"@imooc.com");
            mailTemp.setContent("恭喜中奖");
            MainUtil.sendMail(mail);
        }
        MainUtil.saveOriginMailRecord(mail);
    }
}
