package theory.lecture_13.generics.ex_2;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
