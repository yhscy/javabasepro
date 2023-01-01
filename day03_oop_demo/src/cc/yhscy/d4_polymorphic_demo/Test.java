package cc.yhscy.d4_polymorphic_demo;

/**
 * Created by yhsec on 2023/1/1 23:06
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        Usb u = new Keyboard("雷蛇");
        c.install(u);
        System.out.println("------------------------");
        Usb uu = new Mouse("罗技");
        c.install(uu);

    }
}
