package cc.yhscy.d2_static_util;

import java.util.Random;

/**
 * @author ShiChun
 * @date 2022/12/21 9:56
 */
public class YhscyUtil {


    private YhscyUtil() {
    }

    public static String generateCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random rm = new Random();
        for (int i = 0; i <n ; i++) {
            int index = rm.nextInt(data.length());
            code += data.charAt(index);

        }
        return code;

    }
}
