package cc.yhscy.d1_polymorphic;

/**
 * Created by yhsec on 2023/1/1 16:29
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        System.out.println(a.name);

        Animal a1 = new Tortoise();
        a1.run();
        System.out.println(a.name);

    }
}
