package practice.test;

/**
 * Created by Lenovo on 11.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        test(0);
    }

    public static int test(int x) {
        System.out.println(x);
         if ( x == 3000) {
             return 3000;
         }
         return test(x + 1);
    }


}
