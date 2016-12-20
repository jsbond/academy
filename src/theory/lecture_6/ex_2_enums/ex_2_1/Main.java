package theory.lecture_6.ex_2_enums.ex_2_1;

import theory.lecture_6.ex_2_enums.ex_2_2.Season;

/**
 * Created by StudentTC on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.getCountOfDays());
        System.out.println(season.name());

        Season[] seasons = Season.values();
        Season result;
        for (Season i : seasons) {
            if (i.getCountOfDays() == 92) {
                result = i;
                break;
            }
        }
        Season season1 = Season.valueOf("AUTUMN");
    }
}
