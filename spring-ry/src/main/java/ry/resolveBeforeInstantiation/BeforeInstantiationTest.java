package ry.resolveBeforeInstantiation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xzy
 * @date: 2024/1/30
 */
public class BeforeInstantiationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "resolve.before.instantiation/beans.xml");
        BeforeInstantiationUser user = context.getBean(BeforeInstantiationUser.class);
        System.out.println(user);
        user.doSomething();
        context.registerShutdownHook();
    }
}
