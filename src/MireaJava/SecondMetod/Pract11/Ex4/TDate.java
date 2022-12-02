package MireaJava.SecondMetod.Pract11.Ex4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        int Month = sc.nextInt();
        int Day = sc.nextInt();
        int Hour = sc.nextInt();
        int Minute = sc.nextInt();

        Date nowDate = new Date(Year, Month, Day, Hour, Minute);
        Calendar nowCalender = new GregorianCalendar(Year, Month, Day, Hour, Minute);

        System.out.println(nowDate);
        System.out.println(nowCalender.getTime());
    }
}
