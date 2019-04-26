package Creational.Prototype;

import java.text.MessageFormat;

/**
 * @author Maoxin
 * @ClassName MainUtil
 * @date 4/14/2019
 */
public class MainUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址{1},邮件内容:{2}发送邮件！";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmail(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
