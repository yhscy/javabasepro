package cc.yhscy.d2_recursion;

import javax.crypto.spec.PSource;

/**
 * Created by yhsec on 2023/1/17 10:22
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        int rs = test(3);
        System.out.println(rs);

    }

    public static int test(int n){
        if (n == 1){
            return 1;
        }else {
            return test(n - 1) * n;
        }

    }
}
