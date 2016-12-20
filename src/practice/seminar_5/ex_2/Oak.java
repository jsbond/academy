package practice.seminar_5.ex_2;

/**
 * Created by StudentTC on 17.12.2016.
 */
public class Oak extends Plant {

    public Oak(int numberOfLeafs) {
        super(numberOfLeafs);
        numberOfLeafs = 20;

    }

    public void print() {
        super.printLeafs();
        this.printLeafs();
    }

    @Override
    public void printLeafs() {
//        super.printLeafs();

        System.out.println("oak");
    }

    public static void printForStatic() {
        System.out.println("вызов статического метода OAK");
    }


}
