package theory.lecture_13.generics.ex_3;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
class BoxPrinter<T, K> {
    private T val;
    private T val2;
    private K val3;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public BoxPrinter(T val, T val2, K val3) {
        this.val = val;
        this.val2 = val2;
        this.val3 = val3;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
