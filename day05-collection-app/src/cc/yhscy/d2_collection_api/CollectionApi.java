package cc.yhscy.d2_collection_api;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by yhsec on 2023/1/8 21:09
 */
public class CollectionApi {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //add 添加
        c.add("js");
        c.add("jenkins");
        c.add("selenuim");
        System.out.println(c);

        //2.清空集合元素
        c.clear();
        System.out.println(c);

        //3.判断是否是空
        System.out.println(c.isEmpty());

        //4.获取集合的大小
        c.add("js");
        c.add("jenkins");
        c.add("selenuim");
        System.out.println(c.size());

        //5.判读是否包含
        System.out.println(c.contains("js"));
        System.out.println(c.contains("jss"));
        System.out.println("------------------------");
        //删除某个元素
        System.out.println(c.remove("js"));
        System.out.println(c.remove("python1"));
        System.out.println(c);

        //把集合转化为数组；
        Object[] ar =c.toArray();
        System.out.println(ar.getClass());

        System.out.println("===============拓展================");
        //把c2的内容拷贝到c1
        Collection c11 = new ArrayList();
        //add 添加
        c11.add("js");
        c11.add("jenkins");
        c11.add("selenuim");

        Collection c22 = new ArrayList();
        //add 添加
        c22.add("1");
        c22.add("1");
        c22.add("1");

        c11.addAll(c22);
        System.out.println(c11);
    }
}
