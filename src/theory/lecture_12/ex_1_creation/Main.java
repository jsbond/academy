package theory.lecture_12.ex_1_creation;

/**
 * Создание потоков с помощью наследования класса Thread или использования интерфейса Runnable
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();                                   // NEW
        Thread myRunnable = new Thread(new MyRunnable());                   // NEW

        myThread.start();                                                   //RUNNABLE
        myRunnable.start();                                                 //RUNNABLE

        Thread.sleep(2000);

        myThread.join();                                             // главный поток ждет завершения выполнения потока
        myRunnable.join();                                           // главный поток ждет завершения выполнения потока
    }
}
