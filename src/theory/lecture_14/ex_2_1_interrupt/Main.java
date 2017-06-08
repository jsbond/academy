package theory.lecture_14.ex_2_1_interrupt;

/**
 * прерывание потока
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();                                   // NEW

        myThread.start();                                                   //RUNNABLE

        Thread.sleep(500);
//        myThread.stop();
        myThread.interrupt();                                              // TERMINATED
        System.out.println("закончено");
    }
}
