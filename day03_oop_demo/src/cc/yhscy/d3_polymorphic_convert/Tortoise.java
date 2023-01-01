package cc.yhscy.d3_polymorphic_convert;

/**
 * Created by yhsec on 2023/1/1 16:34
 */
public class Tortoise extends Animal {
    String name = "乌龟名称";
    @Override
    public void run(){
        System.out.println("乌龟也会跑");

    }
    public void layEggs(){
        System.out.println("下蛋");
    }
}

