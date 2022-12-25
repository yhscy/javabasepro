package cc.yhscy.d9_extends_constuctor;

/**
 * @author ShiChun
 * @date 2022/12/25 21:36
 */
public class Test1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);

        Dog d2 = new Dog("蛋黄");
        System.out.println(d2);
    }
}




class Animal {

    public Animal() {
        System.out.println("父类构造器执行......");
    }
}


class Dog extends Animal {
    public Dog() {
        super();//写不写都行
        System.out.println("子类构造器执行......");
    }

    public Dog(String name) {
        super();//写不写都行
        System.out.println("子类有参构造器执行...");

    }
}