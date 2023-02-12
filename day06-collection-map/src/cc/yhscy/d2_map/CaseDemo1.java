package cc.yhscy.d2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by yhsec on 2023/2/12 21:35
 */
public class CaseDemo1 {
    /*
    需求
某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

     */
    public static void main(String[] args) {
        String[] a = {"A","B","C","D"};
        //80个人选随机选一个
        Random rb = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80 ; i++) {
            sb.append( a[rb.nextInt(a.length)]);
        }
        System.out.println(sb);

        //2.构建一个map
        Map<Character,Integer> maps = new HashMap<>();
        //3.遍历字符串数组
        for (int i = 0; i < sb.length() ; i++) {
            char b = sb.charAt(i);
            if (maps.containsKey(b)){

                maps.put(b,maps.get(b) + 1);

            }
            else {
                maps.put(b,1);
            }


        }
        System.out.println(maps);

    }

}
