package theory.lecture_14.ex_3_2_syncronized_methods;

public class Service {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }
}
