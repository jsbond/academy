package theory.lecture_6.inner_classes.nested.ex_2;

/**
 * Created by Anton_Bandarchyk on 4/20/2017.
 */
public class OuterClass {
    private static int x;
    private int y;
    //мы можем не писать Outer.Nested, а использовать Nested внутри класса Outer
    //Outer класс имеет доступ к вложенному приватному классу
    private Nested nested = new Nested();

    public static Nested getNested() {
        return new Nested();
    }

    public Nested getAnotherNested() {
        return nested;
    }

    //используем нестатический метод вложенного класса
    public int nestedMethod1() {
        return new Nested().nestedMethod1();
    }

    //используем статический метод вложенного класса
    public static int nestedMethod2() {
        return Nested.nestedMethod2();
    }

    private static class Nested {
        public static int z;

        public int nestedMethod1() {
            return x;
        }

        public static int nestedMethod2() {
            return 2;
        }
    }
}
