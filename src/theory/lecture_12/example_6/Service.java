package theory.lecture_12.example_6;

import java.util.concurrent.atomic.AtomicInteger;

public class Service {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.getAndIncrement();
    }

    public AtomicInteger getCounter() {
        return counter;
    }
}
