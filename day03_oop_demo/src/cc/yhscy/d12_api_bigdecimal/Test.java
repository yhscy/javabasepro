package cc.yhscy.d12_api_bigdecimal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by yhsec on 2023/1/2 22:34
 */
public class Test {
    public static void main(String[] args) {
        double d = 0.1;
        double dd = 0.2;
        double c = dd + d;
        System.out.println(c); //失真

        System.out.println("-------------下方为解决办法-------------");
        BigDecimal B = BigDecimal.valueOf(d);
        BigDecimal BB = BigDecimal.valueOf(dd);
        System.out.println(B.add(BB));
        System.out.println(B.add(BB).getClass());

        //将bigdecimal 转化为 double;
        System.out.println(B.add(BB).doubleValue());
        System.out.println(B.add(BB).doubleValue());


        System.out.println("_____________遇到不可精度计算解决办法______________");
        double a = 10.0;
        double aa = 3.0;
        System.out.println(a/aa);
        BigDecimal AA = BigDecimal.valueOf(aa);
        BigDecimal AAA = BigDecimal.valueOf(a);
        System.out.println(AAA.divide(AA,2, RoundingMode.HALF_UP));

    }}

