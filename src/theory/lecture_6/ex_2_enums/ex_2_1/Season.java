package theory.lecture_6.ex_2_enums.ex_2_1;

/**
 * Created by StudentTC on 25.10.2016.
 */
public enum Season {
    WINTER(90),
    SPRING(93),
    SUMMER(92),
    AUTUMN(91);

    private int countOfDays;

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfDays() {
        return countOfDays;
    }


    @Override
    public String toString() {
        return "Not yet!";
    }
}
