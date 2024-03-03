package ry.aop.bak;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ry.aop.bak.service.StudentService;

/**
 * @author: ry
 * @date: 2024/2/20
 */
//@EnableAspectJAutoProxy
public class AopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop/beans.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AppConfig.class);
//        context.refresh();
        StudentService studentService = context.getBean(StudentService.class);
        studentService.save(new Student());
    }
}
