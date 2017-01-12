package theory.lecture_12.ex_6_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Service {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.getAndIncrement();
//        counter++;
    }

    public int getCounter() {
        return counter.intValue();
    }
}
