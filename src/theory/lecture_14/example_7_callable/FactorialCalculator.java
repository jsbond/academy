package theory.lecture_14.example_7_callable;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {

    private Integer number;

    public FactorialCalculator(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                result *= i;
                Thread.sleep(500);
            }
        } else {
            result = number;
        }
        System.out.println("Result for number - " + number + " -> " + result + " Thread is: " + Thread.currentThread().getName());

        return result;
    }
}
