package cc.yhscy.d2_modifier.t1;

import cc.yhscy.d2_modifier.Fu;

/**
 * Created by yhsec on 2022/12/27 0:36
 */
public class Zi extends Fu {
    public static void main(String[] args) {

        Zi z = new Zi();
        z.protectedMethod();
        z.pulicMethod();

        Fu f = new Fu();
        f.pulicMethod();

    }
}
