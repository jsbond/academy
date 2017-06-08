package theory.lecture_13.localization.ex_2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {
        Locale l1 = new Locale("ru", "RU");// ISO-639 ISO-3166
        //ru RU uk UA   de DE

        System.out.println(l1.getDisplayLanguage() + " " + l1.getDisplayCountry());

        NumberFormat rubFormat = NumberFormat.getCurrencyInstance(l1);

        System.out.println(rubFormat.format(13.50));

        //Date JDK 1.0 - mutable
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l1);
        System.out.println(df.format(date));

        SimpleDateFormat d = new SimpleDateFormat("dd-M-yyyy hh:mm:ss", l1);
        System.out.println(d.format(date));

        //LocalDate - JDK 1.8 - immutable


        ZoneId zid1 = ZoneId.of("Europe/Moscow");
    }
}
