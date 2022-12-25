package cc.yhscy.d1_static;

/**
 * @author ShiChun
 * @date 2022/12/19 10:01
 */
public class User {
    public static int onlineNum = 166; //静态成员变量

    private String name; //实例成员变量
    private int age;



    public static void main(String[] args) {
        //System.out.println(onlineNum);
        System.out.println(onlineNum);

        User u = new User();
        u.name = "shichun";
        u.age = 19;
        System.out.println(u.name);
        System.out.println(u.age);



    }

}
