package cc.yhscy.d5_fanxclass;

/**
 * Created by yhsec on 2023/2/11 14:48
 */
public class ClassDemo1 {
    /*
    模拟ArrayList集合自定义一个集合MyArrayList集合,完成添加和删除功能的泛型设计即可。
     */
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("java");
        myArrayList.add("go");
        myArrayList.add("python");
        System.out.println(myArrayList.toString());


    }
}
