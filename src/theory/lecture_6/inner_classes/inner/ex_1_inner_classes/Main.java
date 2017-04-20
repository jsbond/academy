package theory.lecture_6.inner_classes.inner.ex_1_inner_classes;

public class Main {
    public static void main(String[] args) {

        //inner class не может иметь статических объявлений. Статические методы возможны у OuterClass
        //нельзя объявить enum как inner class
        //при объявлении интерфейса inner классом, он все равно static

        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        OuterClass.InnerClass inner2 = new OuterClass().getInstance();

        int result = inner2.getStaticOuter();
    }
}
