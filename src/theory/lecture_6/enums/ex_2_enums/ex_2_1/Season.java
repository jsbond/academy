package theory.lecture_6.enums.ex_2_enums.ex_2_1;

/**
 * Created by StudentTC on 25.10.2016.
 */
public enum Season {
    WINTER("Winter"),
    SPRING(93),
    SUMMER(92),
    AUTUMN(91);

    private int countOfDays;
    private String month;

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    Season(String month) {
        this.month = month;
    }

    public int getCountOfDays() {
        return countOfDays;
    }


    @Override
    public String toString() {
        return "Season{" +
                name() +
                " countOfDays=" + countOfDays +
                '}';
    }
}
