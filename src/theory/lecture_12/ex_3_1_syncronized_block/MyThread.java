package theory.lecture_12.ex_3_1_syncronized_block;

public class MyThread extends Thread {
    final Service service;
    final Service service1 = new Service();
    private final Object lock = new Object();

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 100000; i++) {
                service.increment();
            }
        }
    }

    public void serv() {
        synchronized (lock) {

        }
    }
}
