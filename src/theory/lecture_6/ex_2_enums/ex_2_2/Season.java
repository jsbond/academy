package theory.lecture_6.ex_2_enums.ex_2_2;

/**
 * Created by StudentTC on 25.10.2016.
 */
public enum Season {
    WINTER(90) {
        @Override
        public String[] getMonths() {
            months[0] = "December";
            months[1] = "January";
            months[2] = "February";
            return months;
        }
    },
    SPRING(93) {
        @Override
        public String[] getMonths() {
            months[0] = "March";
            months[1] = "April";
            months[2] = "May";
            return months;
        }
    },
    SUMMER(92) {
        @Override
        public String[] getMonths() {
            months[0] = "June";
            months[1] = "July";
            months[2] = "August";
            return months;
        }
    },
    AUTUMN(91) {
        @Override
        public String[] getMonths() {
            months[0] = "September";
            months[1] = "October";
            months[2] = "November";
            return months;
        }
    };

    String[] months = new String[3];
    private int countOfDays;


    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public abstract String[] getMonths();

    public int getCountOfDays() {
        return countOfDays;
    }
}
