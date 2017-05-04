package theory.lecture_4.ex_4_comparator;

import java.util.Comparator;

/**
 * Created by Lenovo on 02.05.2017.
 */
public class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o2 == null || !o2.getClass().equals(Cat.class))
            return 1;
        if (o1 == null || !o1.getClass().equals(Cat.class))
            return -1;

        Cat first = (Cat) o1;
        Cat second = (Cat) o2;

        return first.getAge() - second.getAge();
    }
}
