package theory.lecture_9.ex_4_log4j;

import org.apache.log4j.Logger;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        logger.fatal("Fatal!");
        logger.error("Error!");
        logger.warn("Warn!");
        logger.info("Info!");
        logger.debug("Debug!");
//        Bob bob = new Bob();
//        bob.swim_10();
    }
}
