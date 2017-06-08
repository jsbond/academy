package theory.lecture_13.generics.ex_5;

import java.util.List;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class BoxPrinter {
    public static void print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(1);
        }
    }
}
