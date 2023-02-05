package cc.yhscy.d2_factorypattern;

/**
 * Created by yhsec on 2023/2/4 10:47
 */
public class Huwei extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "正在启动，展示华为log");
    }
}
