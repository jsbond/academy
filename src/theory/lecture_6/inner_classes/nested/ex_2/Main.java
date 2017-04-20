package theory.lecture_6.inner_classes.nested.ex_2;


/**
 * Created by Anton_Bandarchyk on 4/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        //нет доступа к приватному вложенному классу
//        OuterClass.Nested

        //так можно
        OuterClass.getNested();

        //а вот так не получится
//        OuterClass.Nested nested = OuterClass.getNested();
//        OuterClass.getNested().z;

    }
}
