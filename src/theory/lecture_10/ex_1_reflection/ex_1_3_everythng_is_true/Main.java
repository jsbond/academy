package theory.lecture_10.ex_1_reflection.ex_1_3_everythng_is_true;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String args[]) throws Exception {
        setFinalStatic(Boolean.class.getField("FALSE"), true);

        Boolean test = false;
        System.out.println("Everything is " + (Boolean) false); // "Everything is true"
    }

    static void setFinalStatic(Field field, Object newValue) throws Exception {
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, newValue);
    }
}