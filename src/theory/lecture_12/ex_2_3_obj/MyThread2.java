package theory.lecture_12.ex_2_3_obj;

public class MyThread2 extends Thread {
    private Service service;


    public MyThread2(Service service) {
        this.service = service;
    }

    public void run() {
        while (true) {
            System.out.println(service.getX());
        }

    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
