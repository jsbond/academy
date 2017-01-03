package theory.lecture_8.for_each;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by StudentTC on 03.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("125");
        stringList.add("126");
        stringList.add("127");
        stringList.add("128");
        stringList.add("129");

//        for (int i = 0; i < 3; i++) {
//            System.out.println(stringList.get(i));
//        }

        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
            stringList.remove(5);
            iterator.remove();
        }

        for (String string : stringList) {
            System.out.println(string);
            stringList.remove(5);
        }

    }
}
