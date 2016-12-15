package practice.seminar_4.comparator;

import practice.seminar_4.compare.User;

import java.util.Comparator;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class UserComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //привести к типу 2 объекта
        User first = (User) o1;
        User second = (User) o2;

        return first.getCounter() - second.getCounter();
    }
}
