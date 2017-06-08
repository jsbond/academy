package theory.lecture_13.generics.ex_1;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
class BoxPrinter {
    private Object val;

    public BoxPrinter(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {
        return val;
    }
}
