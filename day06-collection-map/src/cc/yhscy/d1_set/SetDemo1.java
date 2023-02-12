package cc.yhscy.d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yhsec on 2023/2/12 15:08
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> setlist = new HashSet<>();
        setlist.add("java");
        setlist.add("java");
        setlist.add("js");
        setlist.add("python");
        System.out.println(setlist);

    }

}
