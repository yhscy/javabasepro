package cc.yhscy.d2_modifier;

/**
 * Created by yhsec on 2022/12/27 0:28
 */
public class Test {
    public static void main(String[] args) {
        //同一个包中其他类中看能够访问这四类权限方法

        Fu f = new Fu();
        f.protectedMethod();
        f.getMethod();
        f.pulicMethod();
    }
}
