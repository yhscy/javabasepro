package cc.yhscy.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yhsec on 2023/1/4 22:28
 */
public class SimpledateDemo2 {
    //计算出2023年1月4日22点35分10秒，往后走2天13小时49分06秒是多少

    public static void main(String[] args) throws ParseException {
        String date = "2023年1月4日 22:35:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        long time = d.getTime();
        time += (2L * 24 * 60 * 60 + 13 * 60 * 60 + 49 * 60 + 6) * 1000;

        System.out.println(sdf.format(time));


    }
}
