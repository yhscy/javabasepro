package cc.yhscy.d3_collection_ergodic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by yhsec on 2023/1/8 22:57
 */
public class Demo3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java");
        c.add("python");
        c.add("go");
        c.add("js");
//        System.out.println(c);

//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //简化写法
        c.forEach(s -> {
            System.out.println(s);
        });


        };

    }

