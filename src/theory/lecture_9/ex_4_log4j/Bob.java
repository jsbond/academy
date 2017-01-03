package theory.lecture_9.ex_4_log4j;

import java.io.IOException;

import org.apache.log4j.Logger;


/**
 * Created by StudentTC on 01.11.2016.
 */
public class Bob {
    private static Logger logger = Logger.getLogger(Bob.class);

    public void swim_10() throws Exception, Error {
        logger.info("заплыли на 10м");
        swim_20();
        logger.info("уплываем с 10м");
    }

    private void swim_20() throws Exception {
        logger.info("заплыли на 20м");

        try {
            swim_50();
        } catch (Exception t) {
            logger.error("акула уплывает на глубине 20м", t);
        }
        logger.info("уплываем с 20м");
    }

    private void swim_50() throws IOException {
        logger.info("заплыли на 50м");

        throw new IOException("акула");
    }
}
