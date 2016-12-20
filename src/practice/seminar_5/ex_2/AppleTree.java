package practice.seminar_5.ex_2;

/**
 * Created by StudentTC on 17.12.2016.
 */
public class AppleTree extends Plant {

    public AppleTree(int numberOfLeafs) {
        super(numberOfLeafs);
    }

    @Override
    public void printLeafs() {
        System.out.println("AppleTree");
    }
}
