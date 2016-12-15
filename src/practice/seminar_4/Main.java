package practice.seminar_4;

import practice.seminar_4.object.MyObject;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyObject vasya = new MyObject();
        MyObject petya = new MyObject();
//        vasya.apply();
//
//        System.out.println(1);
//        System.out.println("2");

        System.out.println(vasya.toString());

        vasya.hashCode();
        vasya.equals(petya);

        //reflection
        vasya.getClass();

        //multi threading
        vasya.notify();
        vasya.notify();
        vasya.notify();

    }


}
