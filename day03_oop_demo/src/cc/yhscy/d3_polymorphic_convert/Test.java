package cc.yhscy.d3_polymorphic_convert;

/**
 * Created by yhsec on 2023/1/1 16:29
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
//        a.lookDoor();//无法调用子类的独有的功能；

//        //强制类型转换
//        Dog d = (Dog)a;  //把 a的地址赋给d
//        d.lookDoor();


        if (a instanceof Tortoise){
            Tortoise t = (Tortoise) a;
            t.layEggs();
        }else if (a instanceof Dog){
            Dog dd= (Dog)a;  //把 a的地址赋给d
            dd.lookDoor();
        }

    }

}
