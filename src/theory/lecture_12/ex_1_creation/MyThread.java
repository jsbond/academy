package theory.lecture_12.ex_1_creation;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("работает Mythread " + i);
        }
    }
}
