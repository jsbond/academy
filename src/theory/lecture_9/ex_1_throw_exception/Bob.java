package theory.lecture_9.ex_1_throw_exception;

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
        swim_50();
        System.err.println("уплываем с 20м");
    }

    private void swim_50() throws IOException {
        System.err.println("заплыли на 50м");

        throw new IOException("акула");

        //System.out.println("жемчуг");
        //System.out.println("уплываем с 50м");
    }
}
