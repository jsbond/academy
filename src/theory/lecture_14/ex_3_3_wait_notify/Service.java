package theory.lecture_14.ex_3_3_wait_notify;

public class Service {
    private volatile Long counter;

    public void increment() {
        counter++;
    }

    public Long getCounter() {
        return counter;
    }
}
