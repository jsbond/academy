package practice.seminar_4.logical_blocks;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class User {
    public final static int staticVariable;
    private int nonStaticVariable;

    static {
        staticVariable = 10;
        System.out.println("внутри статического блока");
    }

    {
        nonStaticVariable = 10;
        System.out.println("внутри логического блока");
    }

    public User() {
        System.out.println("внутри конструктора");
    }


}
