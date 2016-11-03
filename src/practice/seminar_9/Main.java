package practice.seminar_9;

import java.lang.reflect.Field;

/**
 * Created by StudentTC on 03.11.2016.
 */
public class Main {
    @Custom(superParameter = "wow")
    public int x = 5;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Main main = new Main();

        Class clazz = main.getClass();

        Field field = clazz.getField("x");
        field.setAccessible(true);
        int y = field.getInt(main);
        System.out.println(y);

        Class clazz2 = Main.class;
        Class clazz3 = Class.forName("practice.seminar_9.Main");



    }
}
