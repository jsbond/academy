package theory.lecture_10.ex_1_reflection.ex_1_1_reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A a = new A();
        A a1 = new A();

        a.getClass().getName();
        Field field = a.getClass().getField("size");
        int i = field.getInt(a);

        System.out.println(i);


    }


}
