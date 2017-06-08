package theory.lecture_13.generics.ex_6;

import theory.lecture_13.generics.ex_5.BoxPrinter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Animal());

        List<Cat> animals2 = new ArrayList<>();
        animals2.add(new Cat());

//        test1(animals1);
//        test1(animals2);
//
//        test2(animals1);
//        test2(animals2);

    }

    public static void test1(List<Animal> animals) {
        animals.get(0).voice();
    }

    public static void test2(List<? extends Animal> animals) {
        animals.get(0).voice();
    }

    public static class Cat extends Animal {
        public void voice() {
            System.out.println("Myaaay");
        }
    }

    public static class Animal {
        public void voice() {
            System.out.println("RRRRRRRR");
        }
    }
}
