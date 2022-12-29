package d6_abstract;

/**
 * Created by yhsec on 2022/12/29 21:39
 */
public class Test {
    public static void main(String[] args) {
        GoldCard g = new GoldCard();
        g.setMoney(1000);
        g.setUserName("王老五");
        g.pay(30);
    }
}
