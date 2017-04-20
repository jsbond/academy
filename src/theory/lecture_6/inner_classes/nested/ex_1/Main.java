package theory.lecture_6.inner_classes.nested.ex_1;

/**
 * Created by Anton_Bandarchyk on 4/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        //создание объекта вложенного класса
        OuterClass.Nested nested = new OuterClass.Nested();
        nested.nestedMethod1();

        //для вызова статического метода создавать объект не нужно
        OuterClass.Nested.nestedMethod4();


    }
}
