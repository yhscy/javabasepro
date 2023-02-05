package cc.yhscy.d2_factorypattern;

/**
 * Created by yhsec on 2023/2/4 10:49
 */
public class Demo1 {
    public static void main(String[] args) {
        Computer c = FactoryDemo.create("huawei");
        Computer c2 = FactoryDemo.create("mac");
    }
}
