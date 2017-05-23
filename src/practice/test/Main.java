package practice.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Lenovo on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {



        Map<String, Integer> map = new HashMap<>();
        map.put("Vasya", 5);
        map.put("Petya", 4);
        map.put("Anya", 5);




        Set<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("bcd");
        hashSet.add("dcc");
        hashSet.add("eccc");
        hashSet.add("abcd");

        Set<String> hm = new LinkedHashSet<>();
        hm.add("abc");
        hm.add("bcd");
        hm.add("dcc");
        hm.add("eccc");
        hm.add("abcd");

//        System.out.println(hm);

//        Set<String> treeSet = new TreeSet<>((o1, o2) -> 0);
//
//
//        treeSet.add("abc");
//        treeSet.add("bcggd");
//        treeSet.add("dccgggg");
//        treeSet.add("eccc");
//        treeSet.add("abd");
//
//        System.out.println(treeSet);

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcggd");
        list.add("dccgggg");
        list.add("eccc");
        list.add("abd");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String element : list) {
//            if (element.equals("abc")) {
//                list.remove(element);
//            }
//        }

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String el2 = it.next();
            it.remove();
        }





















    }

    public static void run() {
        Cat cat = new Cat();
    }
}
