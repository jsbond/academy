package theory.lecture_15.behavior.strategy;

/**
 * Created by Lenovo on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Strategy s1 = new OpeationAdd();
        Strategy s2 = new OperationSubstract();

        Context context = new Context(s2);
        int result = context.executeOperation(5, 3);
        System.out.println(result);
    }
}
