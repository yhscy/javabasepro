package d6_abstract;

/**
 * Created by yhsec on 2022/12/29 21:32
 */
public abstract class Card {
    private String userName;
    private double money;


    public abstract void pay(double moneyNew);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
