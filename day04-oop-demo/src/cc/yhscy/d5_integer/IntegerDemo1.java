package cc.yhscy.d5_integer;

/**
 * Created by yhsec on 2023/1/6 22:34
 */
public class IntegerDemo1 {
    //搞清楚包装类
    public static void main(String[] args) {
        int a = 1;
        Integer aa = 2;
        System.out.println(a);
        System.out.println(aa);

        Integer aaa = a; //自动装箱
        System.out.println(aaa);


        double c = 6.4;
        Double cc = 6.5;
        System.out.println(c);
        System.out.println(cc);

        double ccc = c; //自动拆箱
        System.out.println(ccc);


        Double dddd = null; //包装类，默认值null;
        System.out.println(dddd);


        String num = "33";
        int n = Integer.valueOf(num);
        System.out.println(n);
    }
}
