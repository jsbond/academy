package theory.lecture_14.example_6;

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
