package test.xzy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.xzy.StudentTest;
import test.xzy.XzyClassPathXmlApplicationContext;

/**
 * @author: xzy
 * @date: 2024/1/2
 */
public class SpringTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("xzy/xzyTest.xml");
//        BeanFactory beanFactory = new XzyClassPathXmlApplicationContext("xzy/xzyTest.xml");
        System.out.println(String.format("beanFactory:%s", beanFactory));
        StudentTest studentTest = beanFactory.getBean("studentTest", StudentTest.class);
        System.out.println(studentTest);

    }
}
