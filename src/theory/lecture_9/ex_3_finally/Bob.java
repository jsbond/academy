package theory.lecture_9.ex_3_finally;

import java.io.IOException;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Bob {

    public void swim_10() throws Exception, Error {
        System.err.println("заплыли на 10м");
        swim_20();
        System.err.println("уплываем с 10м");
    }

    private void swim_20() throws Exception {
        System.err.println("заплыли на 20м");

        try {
            swim_50();

            System.err.println("плывем на 20м");
        } catch (Exception r) {
            System.err.println("акула уплывает на глубине 20м");
        } finally {
            throw new Exception();
        }

    }

    private void swim_50() throws IOException {
        System.err.println("заплыли на 50м");

        if (1 == 1) {
            throw new IOException("акула");
        }
        System.err.println("уплыли с 50м");
    }
}
