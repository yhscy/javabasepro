package cc.yhscy.d10_constructor_params;

/**
 * @author ShiChun
 * @date 2022/12/25 21:48
 */
public class Test1 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三",19);
        System.out.println(t.getAge());
        System.out.println(t.getName());
    }
}
