package cc.yhscy.d4_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhsec on 2023/2/11 22:32
 */
public class Demo1 {
    public static void main(String[] args) {
        //集合list常用方法
        /*
        下行代码是经典写法，面向接口编程，运用多态特点，若是ArrayList变更为LinkList，集合对象的对应方法不用做调整
         */
        List<String> list = new ArrayList();
        list.add("java");
        list.add("go");


        System.out.println("索引为0时，对应的值是" + list.get(0) );
        System.out.println("索引为0时，返回被修改的元素值是：" + list.set(0,"js") );
        System.out.println(list);


    }

}
