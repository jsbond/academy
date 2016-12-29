package theory.lecture_12.example_5;

public class MyThread extends Thread {

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + i);
        }
    }
}
