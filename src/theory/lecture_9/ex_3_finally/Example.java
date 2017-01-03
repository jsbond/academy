package theory.lecture_9.ex_3_finally;

/**
 * Created by StudentTC on 29.12.2016.
 */
public class Example {
    public static void main(String[] args) {
        int x = method();
        System.out.println(x);
    }

    public static int method() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
