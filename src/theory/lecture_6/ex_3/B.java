package theory.lecture_6.ex_3;

/**
 * Created by StudentTC on 20.12.2016.
 */
public class B extends A {
    @Override
    public B getA(A a) {
        return new B();
    }

//    @Override
//    public A method(A b) {
//        return new A();
//    }
}
