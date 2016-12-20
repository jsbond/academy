package theory.lecture_6.ex_1_local_class;

/**
 * Created by StudentTC on 20.12.2016.
 */
public class OuterClass {
    public void method() {
        class Inner {
            public void innerMethod() {
                System.out.println("111");
            }
        }

        Inner inner = new Inner();
    }
}
