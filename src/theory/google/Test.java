package theory.google;

import java.util.List;

import com.google.common.base.Splitter;

public class Test {
    public static void main(String[] args) {
        Splitter splitter = Splitter.on(" ").limit(2);

        Iterable<String> s = splitter.split("1 2");

        String[] ss = "1 2 3".split(" ", 2);
        System.out.println(1);

    }
}
