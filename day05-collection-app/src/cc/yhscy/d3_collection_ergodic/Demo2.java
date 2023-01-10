package cc.yhscy.d3_collection_ergodic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yhsec on 2023/1/8 22:49
 */
public class Demo2 {
    //foreach
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java");
        c.add("python");
        c.add("go");
        c.add("js");
//        System.out.println(c);

        for (String ele:c) {
            System.out.println(ele);

        }

        //遍历数组

        Integer[] A = {1,3,34,4,5,5,5};
        for (Integer integer : A) {
            System.out.println(integer);

        }


    }

}
