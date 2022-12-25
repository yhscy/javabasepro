package cc.yhscy.d1_static;

/**
 * @author ShiChun
 * @date 2022/12/19 16:12
 */
public class Student {

    private String name;
    private int age;

    public static int getMax(int age1,int age2){
        return age1 > age2 ? age1:age2;

    }

    public void study(){
        System.out.println(name);
    }

    public static void main(String[] args) {

//        int age = Student.getMax(21,22); //访问静态成员方法
//        System.out.println(age);

        int age = getMax(21,22); //访问静态成员方法
        System.out.println(age);

        Student s = new Student();
        s.name = "sc";
        s.age = 11;
        s.study();
    }

}
