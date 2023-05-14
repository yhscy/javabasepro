package cc.yhscy.d1_stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhsec on 2023/2/13 14:11
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java");
        lists.add("java");
        lists.add("python");
        lists.add("js");
        System.out.println(lists);

        //1.以流的形式遍历
        lists.stream().forEach(System.out::println);

        //2.获取数量
        System.out.println(lists.stream().count());

        //3.


    }
}
