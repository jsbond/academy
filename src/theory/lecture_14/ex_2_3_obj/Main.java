package theory.lecture_14.ex_2_3_obj;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Thread myThread1 = new MyThread(service);                                   // NEW
        Thread myThread2 = new MyThread2(service);                                   // NEW

        myThread1.start();                                                   //RUNNABLE
        myThread2.start();                                                   //RUNNABLE

        Thread.sleep(1000);


    }
}
