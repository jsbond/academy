package theory.lecture_2.ex_4_math;


import theory.lecture_2.ex_1_literals.Example;

import java.util.Objects;

public class Main {
    int x;
    static String s1;

    public static void main(String[] args) {
        Example example1 = new Example();
        Example example2 = example1;

        Main.changeExample(example2);

        System.out.println(example1.getX());

        String s2 = "abc";

        boolean b = Objects.equals(s1, s2);

        System.out.println(s1.equals(s2));



//        int a1 = 5;
//        int a2 = 5;
//        System.out.println(a1 == a2);
//        System.out.println(example1 == example2);


//        System.out.println(Main.getMax(2,5));
    }

    private static int getMax(int number, int another) {
        int result = Math.max(number, another);

        return result;
    }

    private static void changeExample(Example example) {
        example.setX(2000);
    }


}
