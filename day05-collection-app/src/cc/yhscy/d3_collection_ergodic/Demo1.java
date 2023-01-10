package cc.yhscy.d3_collection_ergodic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by yhsec on 2023/1/8 22:40
 */
public class Demo1 {
    /*
    集合遍历三种方式：
    1.迭代器
    2.for循环
    3.lambda
     */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("java");
        c.add("python");
        c.add("go");
        c.add("js");
        System.out.println(c);

        Iterator it = c.iterator();
        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
