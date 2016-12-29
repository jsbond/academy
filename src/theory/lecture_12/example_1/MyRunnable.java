package theory.lecture_12.example_1;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("работает MyRunnable " + i);
        }
    }

}
