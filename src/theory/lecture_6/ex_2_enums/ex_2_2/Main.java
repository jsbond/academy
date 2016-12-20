package theory.lecture_6.ex_2_enums.ex_2_2;

/**
 * Created by StudentTC on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        String[] months = season.getMonths();

        System.out.println(months[0]);

        season = Season.AUTUMN;
        months = season.getMonths();

        System.out.println(months[0]);
    }
}
