package practice.test;

/**
 * Created by Lenovo on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat vasya = new Cat();
        vasya.setAge(1);
        vasya.setName("Vasya");
        Cat murzik;
        murzik = vasya;

//        System.out.println(murzik.getName());

        murzik.setName("Murzik");

        run();

        System.out.println(vasya.getName());
    }

    public static void run() {
        Cat cat = new Cat();
    }
}
