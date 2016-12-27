package theory.lecture_7.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class ListExample {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "11";

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

    }
}
