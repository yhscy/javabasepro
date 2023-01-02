package cc.yhscy.d10_api_math;

import java.util.Random;

/**
 * Created by yhsec on 2023/1/2 18:32
 */
public class Test {
    public static void main(String[] args) {
        int a = -1;
        System.out.println(Math.abs(a)); //获取绝对值

        double b = 5.3;
        System.out.println(Math.ceil(b));//向上取整

        double c = 1.1;
        System.out.println(Math.floor(c));//向下取整；

        double d = 4.5;
        System.out.println(Math.round(d));//四舍五入

        System.out.println(Math.max(3,5)); //取最大值

        System.out.println(Math.pow(2,2)); //幂次方

        System.out.println(Math.random()); //0.0 - 1.0之间的值，左闭右开


        //需求：3- 9 之间的整数;  =  (0-6) + 3
        //方法一
        Random r = new Random();
        int  rs = r.nextInt(6) + 3;
        System.out.println("方法一：" + rs);

        //方法二
        System.out.println((int)(Math.random() * 7) + 3); //强转

    }
}
