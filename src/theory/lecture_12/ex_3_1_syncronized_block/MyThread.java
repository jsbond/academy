package theory.lecture_12.ex_3_1_syncronized_block;

public class MyThread extends Thread {
    final Service service;
    private final Object lock = new Object();

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (service) {
            for (int i = 0; i < 100000; i++) {
                service.increment();
            }
        }
    }
}
