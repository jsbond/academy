package theory.lecture_8.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class ListExample {
    public static void main(String[] args) {

        //две реализации интерфейса List.

        // ArrayList построен как обертка над массивом,
        // LinkedList построен как двунаправленная очередь
        // (кроме интерфейса лист имеет также интерфейс Deque


        List<Integer> list = new ArrayList<>();
        list = new LinkedList<>();



    }
}
