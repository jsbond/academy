package theory.lecture_10.ex_1_reflection.ex_1_2_change_final_field;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A instance = new A();
        System.out.println(instance.getSecret());

        workYourMagic(instance);
        System.out.println(instance.getSecret());
    }

    private static void workYourMagic(A instance) throws NoSuchFieldException, IllegalAccessException {
        Class<A> c = A.class;
        Field f = c.getDeclaredField("secret");
        f.setAccessible(true);
        f.set(instance, 2);
    }
}
