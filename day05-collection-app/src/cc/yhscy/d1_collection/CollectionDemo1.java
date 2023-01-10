package cc.yhscy.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by yhsec on 2023/1/8 20:50
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Collection list = new ArrayList();  //多态的一种写法
        list.add("java");
        list.add("go");
        list.add("python");
        list.add(666);
        System.out.println(list);

        Collection list1 = new HashSet();  //多态的一种写法
        list1.add("java");
        list1.add("go");
        list1.add("js");
        list1.add("js");
        list1.add(666);
        System.out.println(list1);


    }

}
