package cc.yhscy.d8_extends_override;

/**
 * @author ShiChun
 * @date 2022/12/25 16:33
 */
public class Test1 {
    public static void main(String[] args) {

        Student s = new Student();
        s.run();

    }
}



class Person {
    public String name = "wangwu";

    public void run(){
        System.out.println("第一次跑");
    }

}

class Student extends Person {
    public String name = "sc";

    @Override
    public void run(){
        super.run();
        System.out.println("学生会跑~");
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
