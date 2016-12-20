package theory.lecture_6.ex_1_inner_classes;

public class OuterClass {
    private int outer;
    private static int staticOuter;

    public class InnerClass {
        // no!
//        public static int innerStatic;

        public int inner;
    }

    public static class NestedClass {

        public static int nestedStatic;
        public int nested;

    }



}
