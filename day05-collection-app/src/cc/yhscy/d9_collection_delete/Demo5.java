package cc.yhscy.d9_collection_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yhsec on 2023/2/11 23:50
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //foreach 遍历删除ConcurrentModificationException,无法解决
//        for (Integer ele:list
//             ) {
//            if (ele.equals(1)){
//                list.remove(ele);
//            }
//            System.out.println(ele);
//
//        }

        //迭代器遍历删除
//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            Integer el = it.next();
//            if (el.equals(1)){
//                //list.remove(el);
//                it.remove();
//            }
//        }
//        System.out.println(list);


        //for循环删除
//        for (int i = 0; i <list.size() ; i++) {    //这种写法会漏掉元素
//            Integer el = list.get(i);
//            if (el.equals(2)){
//                list.remove(2);
//            }
//            System.out.println(list);
//
//        }

        for (int i= list.size() - 1; i >= 0; i--){   //i = 4
            if (list.get(i).equals(2)){
                list.remove(list.get(i));
            }


        }
        System.out.println(list);


    }
}
