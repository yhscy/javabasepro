package cc.yhscy.d2_polymorphic_advantage;

/**
 * Created by yhsec on 2023/1/1 16:29
 */
public class Test {
    public static void main(String[] args) {
        Animal A = new Dog();
        go(A);
//        A.lookDoor(); //多态不能调用子类的独有方法；

        Tortoise t = new Tortoise();
        go(t);



    }

    public static void go(Animal a){
        System.out.println("父类对象作为参数，开始");
        a.run();
        System.out.println("结束");


    }
}
