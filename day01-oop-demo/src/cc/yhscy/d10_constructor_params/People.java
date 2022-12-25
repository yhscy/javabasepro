package cc.yhscy.d10_constructor_params;

/**
 * @author ShiChun
 * @date 2022/12/25 21:55
 */
public class People {
    private String name;
    private int age;

    public People(){

    };

    public People(String name, int age) {
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
