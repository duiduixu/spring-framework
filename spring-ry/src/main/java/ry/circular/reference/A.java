package ry.circular.reference;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @date: 2024/2/4
 */
public class A {
    private String name;
    private B b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
