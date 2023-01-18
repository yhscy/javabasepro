package cc.yhscy.d2_recursion;

/**
 * Created by yhsec on 2023/1/18 10:19
 */
public class RucursionDemo4 {
    /*
    啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，
请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。

     */
    public static int totalNumber;  //总数量
    public static int lastBottleNumber;  //每次剩余的盖子数
    public static int lastHatNumber;   //记录每次剩余的盖子个数

    public static void main(String[] args) {
        buy(10);
        System.out.println(totalNumber);
        System.out.println(lastBottleNumber);
        System.out.println(lastHatNumber);

    }

    public static void buy(int money){
        int num = money / 2;  //5
        totalNumber += num;  //第一次购买的总数量

        //统计本轮的盖子数和瓶子数
        int bottleNumber = lastBottleNumber + num;
        System.out.println("瓶子数是" + bottleNumber);
        int hatNumber = lastHatNumber + num;
        System.out.println("瓶子数是" + hatNumber);


        //统计可以换算成的钱
        int totalmoney = 0;
        if (bottleNumber >= 2){
            totalmoney += (bottleNumber / 2) * 2;
            System.out.println("totalmoney" + totalmoney);
        }
        lastBottleNumber = bottleNumber % 2;

        if (hatNumber >= 4){
            totalmoney += (hatNumber / 4) * 2;
        }
        lastHatNumber = hatNumber % 4;

        if (totalmoney >= 2){
            buy(totalmoney);
        }




    }

}
