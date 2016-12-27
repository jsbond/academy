package theory.lecture_7.treeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class TreeExample {
    public static void main(String[] args) {
        NewYearTree tree1 = new NewYearTree(3);
        NewYearTree tree2 = new NewYearTree(5);
        NewYearTree tree3 = new NewYearTree(1);
        NewYearTree tree4 = new NewYearTree(4);
        NewYearTree tree5 = new NewYearTree(12);
        NewYearTree tree6 = new NewYearTree(5);

        Set<NewYearTree> set = new TreeSet<>(new NewYearTreeComparator());
        set.add(tree1);
        set.add(tree2);
        set.add(tree3);
        set.add(tree4);
        set.add(tree5);
        set.add(tree6);

        System.out.println(set);


    }
}
