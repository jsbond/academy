package theory.lecture_7.treeSet;

import java.util.Comparator;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class NewYearTreeComparator implements Comparator<NewYearTree> {

    @Override
    public int compare(NewYearTree o1, NewYearTree o2) {
        return o1.getCountOfToys() - o2.getCountOfToys();
    }
}
