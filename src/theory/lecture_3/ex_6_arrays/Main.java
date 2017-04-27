package theory.lecture_3.ex_6_arrays;

/**
 * Created by andrei on 12.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        String[] s1 = {"abc", "cc"};
        String[][] s2 = {{"abc", "aa"}, {"cc", "ab"}};



        int[][] array = new int[10][20];
//        array[0] = new int[10];
//        array[1] = new int[22];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

//        array[0] = 1;
//        array[1] = 5;
//        array[2] = 2;

//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt((20 - 0) + 1) + 0;
//        }
//
//        int counter = 0;
//        for (int element : array) {
//            System.out.println("element " + counter + " = " + element);
//            counter++;
//        }

    }
}
