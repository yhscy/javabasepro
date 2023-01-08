package cc.yhscy.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yhsec on 2023/1/8 15:30
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //搞清楚：二分查找比较器的使用
        //加入比较器,自定义排序,默认支持引用类型排序

        Integer[] ages = {11,33,55,88,44,22};
        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                /*
                如果认为左边数据 大于 右边数据 返回正整数
                如果认为左边数据 小于 右边数据  返回负整数
                如果认为左边数据  等于 右边数据  返回0
                 */
//                if (o1 > o2){
//                    return 1;
//                }else if (o1 < o2){
//                    return -1;
//                }
//                return 0;

                return -(o1 - o2);
            }
        });
        System.out.println(Arrays.toString(ages));

    }
}
