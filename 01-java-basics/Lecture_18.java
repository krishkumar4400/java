
/**
 * Date
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Lecture_18 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // Thu Aug 27 19:20:52 IST 2026

        long time = date.getTime();
        System.out.println(time); // 1787838690557

        java.sql.Date sqlDate = new java.sql.Date(time);
        System.out.println(sqlDate); // 2026-08-27

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2026-08-27

        System.out.println(localDate.getMonthValue()); // 8
        System.out.println(localDate.getMonth()); // AUGUST

        LocalTime lt = LocalTime.now();
        System.out.println(lt); // 19:28:20.509575200
    }
}