package practice.andrey.examples;

import java.util.Scanner;

/**
 * Created by andrei on 12.12.2016.
 */
public class Main {
    public static int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();

        int result = calculate(number);

        System.out.println(result);
    }

    private static int calculate(int number) {

        if (number == 1) {
            return 1;
        }
        return calculate(number - 1) * number;
    }


}
