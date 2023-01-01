package cc.yhscy.d4_polymorphic_demo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by yhsec on 2023/1/1 23:02
 */
public class Mouse implements Usb {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void joinUp() {
        System.out.println(name + "鼠标可以插入");
    }

    @Override
    public void putOut() {
        System.out.println(name + "鼠标可以拔出");

    }

    //独有功能
    public void click(){
        System.out.println(name + "正在双击666");
    }
}
