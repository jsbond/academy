package practice.seminar_5.ex_1;

/**
 * Created by StudentTC on 17.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        B b = new B();
        C c = new C(12L, 10L);

        A a1 = new A();

        A a = new A(b, c);

        C c1 = new C(5L, 7L);
        a.setC(c1);

        B b1 = new B("all good", 5);
        a.setB(b1);

        b1.setAnyString("warning! was hacked");


    }
}
