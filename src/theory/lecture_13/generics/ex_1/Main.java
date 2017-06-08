package theory.lecture_13.generics.ex_1;

/**
 * Created by Anton_Bandarchyk on 6/8/2017.
 */
public class Main {


    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);

        // Здесь программист допустил ошибку, присваивая
        // переменной типа Integer значение типа String.
        Integer intValue2 = (Integer) value2.getValue();
    }


}
