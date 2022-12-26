package cc.yhscy.d1_package;

import cc.yhscy.d1_package.t1.Student;

/**
 * Created by yhsec on 2022/12/26 23:51
 */
public class Test {
    public static void main(String[] args) {

        //1.相同包下的类可以直接访问
        System.out.println(User.onlineNum);

        //2.不同包下的类访问需要导包
        System.out.println(Student.name);

        //不同包下的同名类访问,默认只能导入一个类，另一个需要需要导入完整包路径
        System.out.println(cc.yhscy.d1_package.t2.Student.name);
    }
}
