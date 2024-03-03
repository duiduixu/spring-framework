package ry.aop.bak;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: ry
 * @date: 2024/2/20
 */

@Component
@Aspect
public class TestAspect {

    @Pointcut("execution(* ry.aop.bak.StudentService.*(..))")
    private void testPointCut(){

    }

    @Before("testPointCut()")
    public void executeBefore(){
        System.out.println("executeBefore");
    }
    @After("execution(* ry.aop.bak.StudentService.*(..))")
    public void executeAfter(){
        System.out.println("executeAfter");
    }
    @AfterReturning("execution(* ry.aop.bak.StudentService.*(..))")
    public void executeAfterReturning(){
        System.out.println("executeAfterReturning");
    }

//    @Around("testPointCut()")
//    public void executeAround(){
//        System.out.println("executeAround");
//    }
}
