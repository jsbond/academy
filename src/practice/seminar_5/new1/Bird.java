package practice.seminar_5.new1;

import java.io.Serializable;

/**
 * Created by Lenovo on 04.05.2017.
 */
public abstract class Bird implements Flyable, Serializable {

    @Override
    public int fly(int a, int b) {
        return 1;
    }
}
