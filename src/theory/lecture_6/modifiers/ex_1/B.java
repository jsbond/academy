package theory.lecture_6.modifiers.ex_1;

/**
 * Created by Lenovo on 11.05.2017.
 */
public class B extends A {
    @Override
    public B getInstance(A a) {
        return new B();
    }
}
