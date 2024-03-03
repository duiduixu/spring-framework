package ry.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: ry
 * @date: 2024/2/28
 */
public class LogArgsAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(String.format("方法执行before:%s ;参数列表:%s;", method.getName(), Arrays.toString(args)));
    }
}
