package example.test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static Date firstDateOfMonth(Date date) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
            return calendar.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstDateOfMonth(new Date(2010,11,12)));
    }
}
