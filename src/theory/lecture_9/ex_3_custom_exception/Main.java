package theory.lecture_9.ex_3_custom_exception;

import org.apache.log4j.Logger;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Bob bob = new Bob();
        bob.swim_10();
    }
}
