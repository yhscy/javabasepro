package cc.yhscy.d2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Created by yhsec on 2023/2/12 19:15
 */
public class MapEach {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("java",2);
        map.put("java",2);
        map.put("pytho",3);
        map.put("go",3);
        map.put("js",3);
        map.put("c",3);
        System.out.println(map);

        //遍历方式1：先取所有键
//        Set<String> keys = map.keySet();
//        for (String k  : keys){
//
//            System.out.println(map.get(k));
//
//        }

        //遍历方式2：将键值对视为一个整体，先专为set
//        Set<Map.Entry<String,Integer>> kvs = map.entrySet();
//        for (Map.Entry<String,Integer> kv: kvs){
//            System.out.println(kv.getKey());
//            System.out.println(kv.getValue());
//        }

        //遍历方式3:lambda表达式
        map.forEach((k,v) ->
                System.out.println(k + "-----" + v)

        );

    }
}
