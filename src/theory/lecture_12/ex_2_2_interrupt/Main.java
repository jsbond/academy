package theory.lecture_12.ex_2_2_interrupt;

/**
 * прерывание потока
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myRunnable = new Thread(new MyRunnable());                   // NEW

        myRunnable.start();                                                 //RUNNABLE
        Thread.sleep(1000);
        myRunnable.interrupt();                                             // TERMINATED
    }
}
