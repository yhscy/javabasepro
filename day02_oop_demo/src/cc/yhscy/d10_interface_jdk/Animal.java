package cc.yhscy.d10_interface_jdk;

/**
 * Created by yhsec on 2023/1/1 11:44
 */
public interface Animal {
    //默认方法
    default void run(){
        System.out.println("会跑");
        go();
    }


    //静态方法
    static void eat(){
        System.out.println("会吃");

    }


    //私有方法 - jdk 1.9以上版本支持接口私有方法
    private void go(){
        System.out.println("会跑");
    }

}
