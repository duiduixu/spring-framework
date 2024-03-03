package ry.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ry.aop.service.OrderService;
import ry.aop.service.UserService;

/**
 * @author: ry
 * @date: 2024/2/28
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop/beans.xml");
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);
        userService.createUser("ry", "last_ry", 18);
        userService.queryUser();
        orderService.createOrder("ry", "buick");
        orderService.queryOrder("ry");
    }
}
