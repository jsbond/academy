package theory.lecture_2.ex_3_2_switch;

public class Main {
    public static void main(String[] args) {
        // в качестве входящего параметра может быть число, строка, символ а также enum
        int x = 1;
               switch (x) {
            case 1: {
                System.out.println("Осень!");
                break;
            }
            case 2: {
                System.out.println("Зима!");
                break;
            }
            default:{
                System.out.println("ошибка");
            }
        }
    }


}
