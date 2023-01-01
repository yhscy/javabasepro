package cc.yhscy.d2_polymorphic_advantage;

/**
 * Created by yhsec on 2023/1/1 16:29
 */
public class Test {
    public static void main(String[] args) {
        Dog g = new Dog();
        go(g);

        Tortoise t = new Tortoise();
       go(t);


    }

    public static void go(Animal a){
        System.out.println("父类对象作为参数，开始");
        a.run();
        System.out.println("结束");


    }
}
