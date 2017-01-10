package theory.lecture_12.ex_3_2_syncronized_methods;

public class MyThread extends Thread {
    final Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            service.increment();
        }
    }
}
