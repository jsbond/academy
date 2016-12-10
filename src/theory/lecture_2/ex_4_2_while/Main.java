package theory.lecture_2.ex_4_2_while;

/**
 * Created by andrei on 03.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        boolean x = true;
        int i = 0;
        while (x) {

            System.out.println(i);
            if (i >= 5) {
                x = false;
            }
                i++;
        }
    }
}
