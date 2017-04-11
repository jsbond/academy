package practice;

import org.apache.log4j.Logger;

/**
 * Created by Lenovo on 28.03.2017.
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        int x = 1;

        if (x == 1) {
            logger.debug(x);
            logger.info(x);
            logger.warn(x);
            logger.error(x);
            logger.fatal(x);
        }
    }
}
