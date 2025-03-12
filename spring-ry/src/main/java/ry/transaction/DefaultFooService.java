package ry.transaction;

/**
 * @author: ry
 * @date: 2024/3/6
 */
public class DefaultFooService implements FooService {

    @Override
    public Foo getFoo(String fooName) {
        return null;
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        return null;
    }

    @Override
    public void insertFoo(Foo foo) {
        // ...
    }

    @Override
    public void updateFoo(Foo foo) {
        // ...
    }
}