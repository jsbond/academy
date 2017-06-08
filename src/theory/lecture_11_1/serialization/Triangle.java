package theory.lecture_11_1.serialization;

import java.io.Serializable;

/**
 * Класс для шестого примера
 */
public class Triangle implements Serializable {

    private static Triangle instance;

    private Triangle() {
    }

    public static Triangle getInstance() {
        if (instance == null) {
            instance = new Triangle();
        }
        return instance;
    }
}
