package theory.lecture_12.example_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Класс демонстрирует volatile
 */
public class Main {
    private static long aLong;

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
