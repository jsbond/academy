package practice.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public <T> void doSomething(List<T> animals) {

    }

    public <T extends Animal> void doSomethingElse(List<T> animals) {

    }

    public static void main(String[] args) {
        List<Dog> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);

        Generics generics = new Generics();
        generics.doSomething(integerList);
//        generics.doSomethingElse(animals);


    }
}

class Animal {
    public void run() {
        System.out.println("animal run");
    }
}

class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("dog run");
    }

    public void jump() {
        System.out.println("jump");
    }

}
