package ry.circular.reference;

import org.springframework.stereotype.Component;

/**
 * @date: 2024/2/4
 */
public class B {
    private String name;
    private A a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}
