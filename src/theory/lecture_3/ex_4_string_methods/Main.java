package theory.lecture_3.ex_4_string_methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s1 = "Привет! Я строка ! Я с текстом";

        //взять char по индексу
//        char c1 = s1.charAt(0);
//        System.out.println(c1);

        //содержит ли строку
//        boolean b1 = s1.contains("Привет!");
//        System.out.println(b1);

        //склеиваем строку
//        System.out.println(s1 + s1);
//        System.out.println(s1.concat(s1));

        //получаем массив байтов
//        byte[] bytes = s1.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }

        //получаем индекс первого совпадения
//        int i1 = s1.indexOf("ст");
//        System.out.println(i1);

        //получаем индекс последнего совпадения
//        i1 = s1.lastIndexOf("ст");
//        System.out.println(i1);

        //строку можно разбить на массив строк по выбранному разделителю
//        String[] s3 = s1.split("!");
//        for (int i = 0; i < s3.length; i++) {
//            System.out.println(s3[i]);
//        }

        //matches проверяет, удовлетворяет ли строка условиям регулярного выражения
//        boolean b2 = s1.matches("\\D*");
//        System.out.println(b2);

        // Классы Pattern Matcher нужны для использования регулярных выражений.
        // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
//        https://www.tutorialspoint.com/java/java_regular_expressions.htm

//        Pattern p = Pattern.compile("!");
//        Matcher m = p.matcher(s1);
//
//        while (m.find()) {
//
//            System.out.println(1);
//        }
//
//        String s4 = s1.replace("!", "?");
//        System.out.println(s4);
//

//        String s5 = s1.replaceAll("[А-Я,а-я]", "1" + "\u005c\u005c\u005c\u005c");
//        System.out.println(s5);
    }
}
