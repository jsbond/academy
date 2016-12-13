package theory.lecture_5.inheritance.ex_1_inh_is_bad;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.clear();
        stack.push("4");
    }
}
