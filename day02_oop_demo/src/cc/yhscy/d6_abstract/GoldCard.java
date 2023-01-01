package cc.yhscy.d6_abstract;

/**
 * Created by yhsec on 2022/12/29 21:34
 */
public class GoldCard extends Card {
    @Override
    public void pay(double moneyNew) {
        System.out.println("当前用户是" + getUserName());
        System.out.println("当前金额是" + getMoney());
        double rs = moneyNew * 0.8;
        System.out.println("当前余额是" + (getMoney() - rs));
    }
}
