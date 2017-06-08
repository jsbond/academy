package theory.lecture_14.ex_3_3_wait_notify;

public class MyThread extends Thread {
    final Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            service.increment();
        }
    }
}
