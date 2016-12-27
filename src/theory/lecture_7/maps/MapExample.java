package theory.lecture_7.maps;

import practice.seminar_4.compare.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("Petya", 2);
        map.put("Vasya", 3);
        map.put("Kolya", 2);

        System.out.println(map.get("Vasya"));

//        for (Map.Entry entry : map.entrySet()) {
//
//            System.out.println(entry.getKey() + " " + entry.getValue());
//
//        }

//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
//
//        for (Integer value : map.values()) {
//            System.out.println(value);
//        }

//        System.out.println(map);

        Set<String> strings = new HashSet<>();
        strings.add("sss");
        strings.add("eee");
        strings.add("fff");
        strings.add("ttt");

        for (String string : strings) {
            System.out.println(string);
        }






    }
}
