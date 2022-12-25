package cc.yhscy.d4_static_singleinstance;

/**
 * @author ShiChun
 * @date 2022/12/25 10:28
 */
public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.instance2;
        System.out.println(s1); //null

        SingleInstance2 s2 = SingleInstance2.getInstance2();
        System.out.println(s2);

        SingleInstance2 s3 = SingleInstance2.getInstance2();
        System.out.println(s2 == s3);
    }
}
