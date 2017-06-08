package theory.lecture_14.ex_3_1_syncronized_block;

/**
 * Класс демонстрирует использования syncronized блока для синхронизации потоков выполнения
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread thread1 = new MyThread(service);
        thread1.start();
        Thread.sleep(5000);

        synchronized (service) {
            System.out.println("main thread waiting for notify...");

            System.out.println(service.getCounter());
        }


    }

    public synchronized static void run() {

    }

}
