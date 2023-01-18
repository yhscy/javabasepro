package cc.yhscy.d2_recursion;

/**
 * Created by yhsec on 2023/1/17 11:51
 */
public class RecursionDemo2 {
    //猴子吃桃
    public static void main(String[] args) {

        /*
           三要素：
           1）公式：f(x) - f(x)/2 - 1 = f(x + 1)
                  f(x) = 2f(x + 1) + 2
           2) 终点：f(10) = 1
           3) 方向：
         */
        System.out.println(eatPeer(1));

    }

    public static int eatPeer(int day){
        if ( day == 10 ){
            return 1;
        }else {
            return 2 * eatPeer(day + 1) + 2;
        }

    }
}
