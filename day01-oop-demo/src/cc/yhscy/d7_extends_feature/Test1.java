package cc.yhscy.d7_extends_feature;

/**
 * @author ShiChun
 * @date 2022/12/25 13:55
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        1.子类不能继承父类的构造器
        2.子类是否可以继承父类的私有成员？我认为是可以继承父类的私有成员，只是不能直接访问，其实在后面是可以访问私有成员；
        3.子类是否可以继承父类的静态成员？ 有争议知识点，子类可以直接使用父类的静态成员（共享），个人认为子类不能继承父类的静态成员。（共享并非继承）
         */
        Tiger t = new Tiger();
        t.run();
        System.out.println(Tiger.location);


    }
}


class Animal {

    public static String location = "长隆动物园";

    public void run(){
        System.out.println("会跑~~");
    }

}



class Tiger extends Animal {

}