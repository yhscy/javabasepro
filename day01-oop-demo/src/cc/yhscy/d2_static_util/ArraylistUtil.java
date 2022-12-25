package cc.yhscy.d2_static_util;

/**
 * @author ShiChun
 * @date 2022/12/21 10:07
 */
public class ArraylistUtil {
    private ArraylistUtil() {

    }

    public static String toString(int[] arraylist){
        if (arraylist == null){
            return null;
        }

        String arrayStr = "[";
        for (int i = 0; i < arraylist.length; i++) {
            int rs = arraylist[i];
            arrayStr += (i == arraylist.length - 1 ? rs : rs + " ,");

        }
        arrayStr += "]";
        return arrayStr;



    }

}
