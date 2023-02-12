package cc.yhscy.d6_fanxmethod;

/**
 * Created by yhsec on 2023/2/11 15:30
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer[] list1 = {1,56,655,2,2};
        show(list1);

        String[] list2 = {"java","js","python"};
        show(list2);

    }

    public static <T> void show(T[] e){
        if (e != null){
            StringBuilder sb = new StringBuilder("[");
            //for each 没法判断索引位置
            for (int i = 0; i < e.length ; i++) {
                sb.append(e[i]).append(i == e.length - 1 ? "]" : ", ");
            }
            System.out.println(sb);


        }else {
            System.out.println(e);
        }


    }
}
