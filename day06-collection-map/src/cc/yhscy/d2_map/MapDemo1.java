package cc.yhscy.d2_map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yhsec on 2023/2/12 18:57
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("java",2);
        map.put("java",2);
        map.put("pytho",3);
        System.out.println(map);  //无序、不重复
        System.out.println(map.size());
    }
}
