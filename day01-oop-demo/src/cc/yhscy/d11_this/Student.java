package cc.yhscy.d11_this;

/**
 * @author ShiChun
 * @date 2022/12/25 22:15
 */
public class Student {
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name){
        this(name,20);//调用本类兄弟构造器

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
