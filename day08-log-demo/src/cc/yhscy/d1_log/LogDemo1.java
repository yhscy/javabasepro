package cc.yhscy.d1_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by yhsec on 2023/1/11 22:06
 */
public class LogDemo1 {
    //创建logback对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogDemo1.class");

    public static void main(String[] args) {

        while (true) {
            try {
                LOGGER.info("开始执行....");
                int a = 10;
                int b = 0;


                int c = a/b;
                System.out.println(c);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("报错了...");
            }
        }


    }
}
