package practice.seminar_9.example.framework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by StudentTC on 03.11.2016.
 */
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Friend {
    String name();

}
