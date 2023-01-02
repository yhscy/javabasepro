package cc.yhscy.d7_api_object;

import java.util.Objects;

/**
 * Created by yhsec on 2023/1/2 15:06
 */
public class Test {
    public static void main(String[] args) {
//        People p = new People("王麻子",19);
        People p = new People("王麻子",19);
        People p2 = new People("王麻子",19);
        System.out.println(p2.getClass()); //获取这个对象的类名

//        System.out.println(p.toString());
//        System.out.println(p2.toString());
//        System.out.println(p); //省略toString不写，效果也是一致的;

//        System.out.println(p.equals(p2));   //当一个对象为空的时候，会报错，空指针。

        System.out.println(Objects.equals(p,p2));


    }
}
