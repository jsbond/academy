package theory.lecture_9.ex_1_throw_exception;

/**
 * Created by StudentTC on 29.12.2016.
 */
public class Example {
    public static void main(String[] args) {
        try {
            populate();
        } catch (Throwable e) {

        }
    }

    public static void populate() throws Throwable{
        create();
    }

    public static void create() throws Exception, Error {
        boolean x = false;
        if (x) {
            throw new Exception();
        } else {
            throw new Error();
        }
    }
}
