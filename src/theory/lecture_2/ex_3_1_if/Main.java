package theory.lecture_2.ex_3_1_if;

/**
 * Created by andrei on 03.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int x = 8;
        if (x == 10) {
            System.out.println(true);
        } else {
            System.out.println( false);
        }

        if (x == 9) {
            System.out.println(9);
        } else if (x > 6 && x < 9) {
            System.out.println(8);
        } else if (x>1 && x < 6) {
            System.out.println(1);
        }


    }
}
