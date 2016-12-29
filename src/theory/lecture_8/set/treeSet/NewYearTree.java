package theory.lecture_8.set.treeSet;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class NewYearTree {
    private int countOfToys;

    public NewYearTree(int countOfToys) {
        this.countOfToys = countOfToys;
    }

    public int getCountOfToys() {
        return countOfToys;
    }

    public void setCountOfToys(int countOfToys) {
        this.countOfToys = countOfToys;
    }

    @Override
    public String toString() {
        return "NewYearTree{" +
                "countOfToys=" + countOfToys +
                '}';
    }
}
