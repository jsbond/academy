package theory.lecture_14.ex_3_3_wait_notify;

/**
 * Класс демонстрирует возможность перевести поток из состояния Runnable в Waiting
 * и после завершения цикла другого потока вернуть его обратно.
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
