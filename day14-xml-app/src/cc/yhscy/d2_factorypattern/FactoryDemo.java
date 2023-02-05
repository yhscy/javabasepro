package cc.yhscy.d2_factorypattern;

/**
 * Created by yhsec on 2023/2/4 10:51
 */
public class FactoryDemo {
    public static Computer create(String name) {
        switch (name){
            case "mac":
                Computer c = new Mcc();
                c.setName("mac");
                c.start();
                return c;
            case "huawei":
                Computer c2 = new Huwei();
                c2.setName("华为");
                c2.start();
                return c2;
            default:
                return null;
        }


    }


}
