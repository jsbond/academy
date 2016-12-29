package theory.lecture_12.example_2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("работает MyRunnable");
        }
    }

}
