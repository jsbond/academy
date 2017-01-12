package theory.lecture_12.ex_2_3_obj;

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            service.setX(1000);
        }
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
