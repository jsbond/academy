package theory.lecture_12.ex_3_3_wait_notify;

public class MyThread extends Thread {
    final Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        synchronized (service) {
            for (int i = 0; i < 100000; i++) {

                service.increment();

            }
            service.notify();
        }
    }
}
