package theory.lecture_12.ex_2_2_interrupt;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("работает MyRunnable");
        }
    }

}
