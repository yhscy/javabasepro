package cc.yhscy.d4_static_singleinstance;

/**
 * @author ShiChun
 * @date 2022/12/25 10:08
 */
public class SingleInstance {
    /*
    恶汉单例模式实现单例类，在获取对象前提前准备好一个，这个对象只能是一个，所以定义静态成员变量记住；
     */
    public static SingleInstance instance = new SingleInstance();

    private SingleInstance() {
    }

}
