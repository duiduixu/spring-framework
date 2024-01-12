package ry;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ry.custom.User;

/**
 * @author: xzy
 * @date: 2024/1/12
 */
public class TestRy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) applicationContext.getBean("laoda");
        User user2 = (User) applicationContext.getBean("laoer");
        System.out.println(user);
        System.out.println(user2);

    }
}
