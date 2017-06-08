package theory.lecture_14.ex_3_2_syncronized_methods;

/**
 * Класс демонстрирует использования syncronized методов для синхронизации потоков выполнения
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread thread1 = new MyThread(service);
        thread1.start();

        System.out.println(service.getCounter());




    }
}
