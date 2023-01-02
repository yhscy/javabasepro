package cc.yhscy.d11_api_system;

import java.util.Arrays;

/**
 * Created by yhsec on 2023/1/2 21:39
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。");
        System.out.println(System.currentTimeMillis()); //返回系统的时间毫秒值形式,从1970-1-1 00:00:00;
//        System.exit(0);
        System.out.println("程序结束。。。。");

        //数组拷贝
        /**
         * arraycopy(Object src,  int  srcPos,
         *                                         Object dest, int destPos,
         *                                         int length);
         */
        int[] a = {11,22,33,44,55};
        System.out.println(a.length);
        int[] b = new int[5];

        System.arraycopy(a,1,b,1,3);
        System.out.println(Arrays.toString(b));
    }
}
