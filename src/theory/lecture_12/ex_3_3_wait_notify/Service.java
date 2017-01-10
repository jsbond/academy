package theory.lecture_12.ex_3_3_wait_notify;

public class Service {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
