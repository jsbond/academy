package theory.lecture_6.inner_classes.inner.ex_1_inner_classes;

public class OuterClass {
    private int outer;
    private static int staticOuter;

    public class InnerClass {
        //нет статических членов класса
//        public static int innerStatic;

        public int inner;

        //есть доступ к приватным полям внешнего класса
        public int getOuter() {
            return outer;
        }

        public int getStaticOuter() {
            return staticOuter;
        }
    }



    public InnerClass getInstance() {
        return new InnerClass();
    }
}
