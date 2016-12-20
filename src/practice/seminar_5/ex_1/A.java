package practice.seminar_5.ex_1;

/**
 * Created by StudentTC on 17.12.2016.
 */
public class A {
    private B b;
    private C c;

    public A() {

    }

    public A(B variable, C c) {
        this.b = variable;
        this.c = c;
    }

    public B getB() {
        B copy = new B();
        copy.setAnyString(b.getAnyString());
        copy.setAnyInt(b.getAnyInt());

        return copy;
    }

    public void setB(B b) {
        B copy = new B();
        copy.setAnyString(b.getAnyString());
        copy.setAnyInt(b.getAnyInt());

        this.b = copy;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
