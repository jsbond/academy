package practice.example7;

/**
 * Created by Lenovo on 14.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Instrument instrument1 = new Hammer();
        Instrument instrument2 = new Hammer();
        Instrument instrument3 = new SquirelDriver();

        Instrument[] instruments = new Instrument[5];
        instruments[0] = instrument1;
        instruments[1] = instrument2;
        instruments[2] = instrument3;

        Man man1 = new Master(null, instruments);
        Man man2 = new Master(null, instruments);
        Man man3 = new Master(null, instruments);
        Man man4 = new Master(null, instruments);

        Man[] people = new Man[5];





    }
}
