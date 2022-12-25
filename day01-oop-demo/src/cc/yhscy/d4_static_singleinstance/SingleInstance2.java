package cc.yhscy.d4_static_singleinstance;

/**
 * @author ShiChun
 * @date 2022/12/25 10:20
 */
public class SingleInstance2 {
    /*
    懒汉单例模式
    不会像饿汉单例模式一样，提前把对象创造好，在需要的时候调获取对象的方法；
     */
    // 1.私有构造器，避免外部可以创建多个对象；
    private SingleInstance2(){

    }

    //2.定义一个静态成员变量,同类一同加载
    public static SingleInstance2 instance2; //null

    //3.定义一个方法，返回对象；
    public static SingleInstance2 getInstance2(){
        if (instance2 == null){
            instance2 = new SingleInstance2();
        }
        return instance2;

    }

}
