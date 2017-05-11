package theory.lecture_3.ex_1_2_wrappers;

/**
 * Класс демонстрирует разницу выполнения метода с boxing-unboxing int значения и без
 */
public class Main {
    private static long countOfIterations = 1_000_000_000L;

    public static void main(String[] args) {
        long startFirst = System.currentTimeMillis();

        for (long i = 0; i < countOfIterations; i++) {
            test(1);
        }
        long finishFirst = System.currentTimeMillis();
        long firstResult = finishFirst - startFirst;
        System.out.println(firstResult);

        long startSecond = System.currentTimeMillis();

        for (long i = 0; i < countOfIterations; i++) {
            test2(1);
        }
        long finishSecond = System.currentTimeMillis();
        long secondResult = finishSecond - startSecond;
        System.out.println(secondResult);

        System.out.println("результат: " +  (secondResult - firstResult));


    }

    public static int test(int value) {
        if (value == 1) {
            value = 5;
        }
        return value;
    }

    public static int test2(Integer value) {
        if (value == 1) {
            value = 5;
        }
        return value;
    }


}
