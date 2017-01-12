package theory.lecture_12.ex_6_1;

/**
 * Created by StudentTC on 10.01.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread thread1 = new MyThread(service);
        Thread thread2 = new MyThread(service);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(service.getCounter());
    }
}
