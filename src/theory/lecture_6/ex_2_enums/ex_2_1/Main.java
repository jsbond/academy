package theory.lecture_6.ex_2_enums.ex_2_1;


/**
 * Created by StudentTC on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.getCountOfDays());
//        System.out.println(season.name());
        System.out.println(season.ordinal());

        Season[] seasons = Season.values();
        Season result = null;
        for (Season i : seasons) {
            if (i.getCountOfDays() == 92) {
                result = i;
                break;
            }
        }
        System.out.println(result);

        Season season1 = Season.valueOf("AUTUMN");
    }
}
