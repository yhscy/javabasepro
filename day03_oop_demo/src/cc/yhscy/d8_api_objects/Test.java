package cc.yhscy.d8_api_objects;

import java.util.Objects;

/**
 * Created by yhsec on 2023/1/2 15:38
 */
public class Test {
    public static void main(String[] args) {
        String name = null;
        String name2 = "shichun";
//
//        System.out.println(name.equals(name2)); //空指针

        System.out.println(Objects.equals(name,name2)); //更安全

        System.out.println(Objects.isNull(name)); //如果是空值的话，会返回true
    }
}
