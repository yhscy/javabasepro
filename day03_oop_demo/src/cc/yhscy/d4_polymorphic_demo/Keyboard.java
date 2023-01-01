package cc.yhscy.d4_polymorphic_demo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by yhsec on 2023/1/1 23:05
 */
public class Keyboard implements Usb {
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void joinUp() {
        System.out.println("键盘可以插入");
    }

    @Override
    public void putOut() {
        System.out.println("键盘可以拔出");

    }

    public void write(){
        System.out.println(name + "正在输入：奥利给！！！");
    }
}
