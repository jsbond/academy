package theory.lecture_2.ex_1_literals;

/**
 * Created by andrei on 30.11.2016.
 */
public class Example {
    public int x = 5;
    public static void test() {
        Main eee = new Main();
        System.out.println(eee.getX1());
    }

    public int getX() {
        return x;
    }

    public void setX(int aX) {
        x = aX;
    }
}
