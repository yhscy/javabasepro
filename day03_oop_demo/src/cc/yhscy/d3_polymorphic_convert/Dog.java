package cc.yhscy.d3_polymorphic_convert;

/**
 * Created by yhsec on 2023/1/1 16:23
 */
public class Dog extends Animal {
    String name = "狗狗名称";

    @Override
    public void run(){
        System.out.println("狗狗也会跑");

    }

    public void lookDoor(){
        System.out.println("看门狗");
    }




}

