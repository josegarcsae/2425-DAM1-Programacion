package fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class PruebaTimestamp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());


        LocalDate Current_Date = LocalDate.now();

        DayOfWeek Week_Day = Current_Date.getDayOfWeek();

        System.out.println("The current day of the Week is :: " + Week_Day);
        System.out.println("The current day of the Week in Number is :: " + Week_Day.getValue());
        System.out.println("The current day of the Week in full format is :: "
                + Week_Day.getDisplayName(TextStyle.FULL, Locale.of("ES")));
        System.out.println("The current day of the Week in short format is :: "
                + Week_Day.getDisplayName(TextStyle.SHORT, Locale.of("ES")));

    }
}
