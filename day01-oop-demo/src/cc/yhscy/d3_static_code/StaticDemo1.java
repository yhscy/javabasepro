package cc.yhscy.d3_static_code;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/21 12:57
 */
public class StaticDemo1 {
    public static ArrayList<String> cards = new ArrayList<String>();

    static {
        //静态代码块
        System.out.println("静态代码块执行......");
        String[] size = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♦","♣","❤"};

        for (int i = 0; i < size.length ; i++) {
            for (int j = 0; j < colors.length; j++) {
                String rs = size[i] + colors[j];
                cards.add(rs);
            }




        }
        cards.add("小joker");
        cards.add("大joker");

    }
    public static void main(String[] args) {
        System.out.println(cards);


    }

}
