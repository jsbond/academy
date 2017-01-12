package theory.lecture_12.ex_2_1_interrupt;

public class MyThread extends Thread {

    public void run() {
        while (true) {
            int x = 10;
            System.out.println("работает Mythread");
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("прервано");
            }
            x = 5;
        }
    }
}
