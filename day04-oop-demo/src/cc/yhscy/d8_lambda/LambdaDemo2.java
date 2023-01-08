package cc.yhscy.d8_lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yhsec on 2023/1/8 17:02
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer[]  intArr = {1,4,5,6,77,78,88};
        //按照降序排序
        //未简化
//        Arrays.sort(intArr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });

        //简化
//        Arrays.sort(intArr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        Arrays.sort(intArr, (Integer o1,Integer o2) -> {

                return o2 - o1;
            }
        );
        System.out.println(Arrays.toString(intArr));


    }
}
