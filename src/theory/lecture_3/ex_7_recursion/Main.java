package theory.lecture_3.ex_7_recursion;

/**
 * Класс демонстрирует ограниченное количество фреймвов
 * и возможность переполнить стэк при использовании рекурсии.
 */
public class Main {

    public static void main(String[] args) {
        test(0);
    }

    public static int test(Integer x) {
//        System.out.println(x);

        //рекурсия - вызов метода test внутри самого метода.
        //значение параметра отличается при каждом вызове.

        return test(x+1);
    }
}
