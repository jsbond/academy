package theory.lecture_2.ex_4_1_for;

/**
 * Created by andrei on 03.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;


//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        for (;;) {
//            System.out.println(1);
//            i++;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }




    }
}
