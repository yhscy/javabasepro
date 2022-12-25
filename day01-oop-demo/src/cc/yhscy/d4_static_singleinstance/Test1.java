package cc.yhscy.d4_static_singleinstance;

/**
 * @author ShiChun
 * @date 2022/12/25 10:15
 */
public class Test1 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1 == s2);
    }

}
