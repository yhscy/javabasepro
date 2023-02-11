package cc.yhscy.d8_tongpeifu;

import java.util.ArrayList;

/**
 * Created by yhsec on 2023/2/11 16:52
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<BMW> arrayList1 = new ArrayList<>();
        arrayList1.add(new BMW());
        arrayList1.add(new BMW());
        arrayList1.add(new BMW());


        ArrayList<BENZ> arrayList2 = new ArrayList<>();
        arrayList2.add(new BENZ());
        arrayList2.add(new BENZ());
        arrayList2.add(new BENZ());
        arrayList2.add(new BENZ());

        ArrayList<Dog> arrayList3 = new ArrayList<>();
        arrayList3.add(new Dog());

//        go(arrayList1);//报错
//        go(arrayList2);
        go(arrayList1);
//        go(arrayList3);  //加入dog类型也可以，于是引出了泛型上下限概念，加入限制后就报错
        //重要概念：ArrayList<BMW> ArrayList<BENZ> ArrayList<Car>  这三者是相对独立，并不因为引用类型存在继承关系，就可以匹配、
    }

    public static void go(ArrayList<? extends Car> e){

    }
}



class Car{

}
class Dog{

}


class BMW extends Car{

}

class BENZ extends Car{

}