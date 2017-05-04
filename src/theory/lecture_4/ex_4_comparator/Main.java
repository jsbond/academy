package theory.lecture_4.ex_4_comparator;

import com.mysql.jdbc.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by Lenovo on 02.05.2017.
 */
public class Main {
    private static Random r = new Random();
    private static Comparator c = new AgeComparator();

    public static void main(String[] args) {


        Cat[] cats = new Cat[10];

        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat(r.nextInt());
        }

        Arrays.sort(cats, c);


        for (int i = 0; i < 10; i++) {
            System.out.println(cats[i]);
        }
    }
}
