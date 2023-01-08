package cc.yhscy.d3_calendar;

import java.util.Calendar;
import java.util.jar.JarInputStream;

/**
 * Created by yhsec on 2023/1/4 23:32
 */
public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int y = c.get(Calendar.YEAR);
        System.out.println("年份是" + y);
    }
}
