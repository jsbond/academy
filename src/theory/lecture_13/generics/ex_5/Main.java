package theory.lecture_13.generics.ex_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<?> intList = new ArrayList<Integer>();
//        intList.add(new Integer(10));

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(5);
        intList2.add(6);
        BoxPrinter.print(intList2);

        //так можно
        List<?> numList = new ArrayList<Integer>();
        numList = new ArrayList<String>();

        //запретим
        List<? extends Number> numList2 = new ArrayList<Integer>();
//        numList2 = new ArrayList<String>();
    }
}
