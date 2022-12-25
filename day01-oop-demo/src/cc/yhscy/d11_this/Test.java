package cc.yhscy.d11_this;



/**
 * @author ShiChun
 * @date 2022/12/25 22:09
 */
public class Test {
    //理解this(...)的作用：本类构造器中访问本类兄弟构造器

    public static void main(String[] args) {
        Student s = new Student("zhansan",18);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        Student s1= new Student("zhansanfeng");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
