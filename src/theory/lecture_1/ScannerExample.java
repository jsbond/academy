package theory.lecture_1;

import java.util.Scanner;

public class ScannerExample {

    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0 ;; i++){
//            System.out.println("Введите строку:");
//            String text = scanner.nextLine();
//            if (text.equals("bye")) {
//                break;
//            }
//            Integer number = Integer.parseInt(text);
//
//            System.out.println("Число, которую Вы ввели: " + (number * 2));
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Введите строку:");
//            String text = scanner.nextLine();
//            if (text.equals("bye")) {
//                break;
//            }
//            Integer number = Integer.parseInt(text);
//
//            System.out.println("Число, которую Вы ввели: " + (number * 2));
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                        //  Integer number = Integer.parseInt(text); если надо сравнить с числом
        boolean isLogined = ScannerExample.login(scanner);
        if (isLogined == true){
            System.out.println("Правильный пароль");
            System.out.println("Выберите операцию. 1-пополнить баланс, 2-снять деньги, 3-оплата услуг");
            String text = scanner.nextLine();
            switch (text) {
                case "1": {
                    System.out.println("Пополняем баланс");
                    break;
                }
                case "2": {
                    System.out.println("Снимаем деньги");
                    break;
                }
                case "3": {
                    System.out.println("Оплачиваем услуги");
                    break;
                }
                default: {
                    System.out.println("Неверно выбрана услуга");
                }
            }
        }
    }

    static boolean login(Scanner scanner){
        boolean isLogined = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите пароль");
            String text = scanner.nextLine();
            if (text.equals("111")) {
                isLogined = true;
                break;
            } else {
                System.out.println("Неверный пароль. Введите пароль еще раз");
            }
        }
        return isLogined;

    }
}




