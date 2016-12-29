package theory.lecture_9.ex_3_custom_exception;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class APIException extends Exception {
    public APIException(String message) {
        super("custom message" + message);
    }
}
