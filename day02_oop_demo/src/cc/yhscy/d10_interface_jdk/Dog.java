package cc.yhscy.d10_interface_jdk;

/**
 * Created by yhsec on 2023/1/1 11:45
 */
public class Dog implements Animal {

}


class Test{

    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        Animal.eat();

    }

}