package ry.property.editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xzy
 * @date: 2024/1/16
 */
public class PropertyEditorTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("property.editor/beans.xml");
        UserManager userManager = (UserManager) applicationContext.getBean("userManager");
        System.out.println(userManager);
    }
}
