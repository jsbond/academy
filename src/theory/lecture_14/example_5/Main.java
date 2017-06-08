package theory.lecture_14.example_5;

/**
 * Класс демонстрирует возможность задавать приоритет потокам.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread();
        thread1.setName("Первый поток");
        Thread thread2 = new MyThread();
        thread2.setName("Второй поток");

        thread1.setPriority(10);
        thread2.setPriority(1);

        thread2.setDaemon(true); //почему ошибка

        thread1.start();
        thread2.start();


    }
}
