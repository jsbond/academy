package theory.lecture_14.ex_3_1_syncronized_block;

public class Service {
    private int counter;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
