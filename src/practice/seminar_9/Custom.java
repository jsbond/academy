package practice.seminar_9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by StudentTC on 03.11.2016.
 */

@Retention(value = RetentionPolicy.RUNTIME)
public @interface Custom {
    String superParameter();
}
