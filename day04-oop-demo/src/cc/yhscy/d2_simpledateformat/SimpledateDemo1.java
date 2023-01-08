package cc.yhscy.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yhsec on 2023/1/4 22:20
 */
public class SimpledateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(sdf.format(d));


    }
}
