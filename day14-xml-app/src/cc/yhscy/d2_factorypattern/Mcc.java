package cc.yhscy.d2_factorypattern;

/**
 * Created by yhsec on 2023/2/4 10:42
 */
public class Mcc extends Computer {


    @Override
    public void start() {
        System.out.println(getName() + "正在启动....");
    }
}
