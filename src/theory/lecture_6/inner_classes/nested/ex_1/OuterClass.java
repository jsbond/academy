package theory.lecture_6.inner_classes.nested.ex_1;

/**
 * Created by Anton_Bandarchyk on 4/20/2017.
 */
public class OuterClass {
    private static int x;
    private int y;

    public static class Nested {
        private int z;

        public int nestedMethod1() {
            return x;
        }

        //в статическом классе (вложенном) нельзя обратиться к нестатическим членам внешнего класса (нет доступа к объекту внешнего класса)
//        public int nestedMethod2() {
//            return y;
//        }

        // можно обращаться к собственным нестатическим членам класса
        public int nestedMethod3() {
            z = nestedMethod1();
            return z;
        }

        public static int nestedMethod4() {
            return 4;
        }
    }
}
