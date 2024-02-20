//package ry.circular.reference;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author: xzy
// * @date: 2024/2/4
// */
//@Configuration
//public class ABConfig {
//
//    @Autowired
//    private A a;
//
//    @Autowired
//    private B b;
//
//    @Bean
//    public A getA() {
//        A a = new A();
//        a.setName("a name");
//        a.setB(b);
//        return a;
//    }
//    @Bean
//    public B getB() {
//        B b = new B();
//        b.setName("bbbb name222222222222");
//        b.setA(a);
//        return b;
//    }
//}
