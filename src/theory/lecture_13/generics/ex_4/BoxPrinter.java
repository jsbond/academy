package theory.lecture_13.generics.ex_4;

import java.util.List;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class BoxPrinter {
    public static <T> void populate(List<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.add(value);
        }
    }
}
