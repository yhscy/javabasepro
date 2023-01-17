package cc.yhscy.d1_handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yhsec on 2023/1/16 21:03
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始执行....");
        try {
            pareTime("2022-11 11 11:11:11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束....");

    }



    public static void pareTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
}
