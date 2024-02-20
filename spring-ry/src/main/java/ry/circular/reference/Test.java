package ry.circular.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2024/2/4
 */
public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//        ac.register(ABConfig.class );
//        ac.refresh();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:**/beansAB.xml");
        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        System.out.println(a);
        System.out.println(b);
    }
}
