package practice.example7;

/**
 * Created by Lenovo on 14.03.2017.
 */
public abstract class AbstractMan implements Man {
    protected Man[] people;
    private Instrument[] instruments;

    public AbstractMan(Man[] people) {
        this.people = people;
    }

    public AbstractMan(Man[] people, Instrument[] instruments) {
        this.people = people;
        this.instruments = instruments;
    }
}
