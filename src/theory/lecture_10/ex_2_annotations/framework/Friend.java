package theory.lecture_10.ex_2_annotations.framework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(value = RetentionPolicy.RUNTIME)
public @interface Friend {
    String name();

}
