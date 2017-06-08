package theory.lecture_13.generics.ex_2;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        //diamond syntax
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
        System.out.println(value2);

        // Здесь повторяется ошибка предыдущего фрагмента кода
//        Integer intValue2 = value2.getValue();
    }


}
