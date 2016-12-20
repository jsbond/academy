package practice.seminar_5.ex_2;

/**
 * Created by StudentTC on 17.12.2016.
 */
public class Plant {
    protected int numberOfLeafs;

    public Plant(int numberOfLeafs) {
        this.numberOfLeafs = numberOfLeafs;
    }

    public void printLeafs() {

    }

    public static void printForStatic() {
        System.out.println("вызов статического метода PLANT");
    }
}
