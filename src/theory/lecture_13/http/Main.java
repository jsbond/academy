package theory.lecture_13.http;

import java.io.IOException;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String result = HttpClientHelper.get("http://tut.by");

        System.out.println(result);


    }
}
