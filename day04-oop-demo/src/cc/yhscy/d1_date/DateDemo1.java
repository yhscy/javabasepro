package cc.yhscy.d1_date;

import java.util.Date;

/**
 * Created by yhsec on 2023/1/4 22:08
 */
public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);

        //计算当前时间往后走1小时121秒
        time += ((60 * 60) + 121) * 1000;
        System.out.println("往后推迟的毫秒数是" + time);

        Date dd = new Date(time); //把时间毫秒转化为日期对象；
        System.out.println("当前日期是" + dd);

        dd.setTime(time);
        System.out.println(dd);


    }
}
