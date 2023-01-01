package cc.yhscy.d8_interface_implements;

/**
 * Created by yhsec on 2023/1/1 10:19
 */
public class Student implements Person,Law {
    private String name;

    public Student(String name){
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println(name + "正在跑步~");

    }

    @Override
    public void say() {

        System.out.println(name + "正在说话~");
    }

    @Override
    public void rule() {
        System.out.println(name + "必须遵守法律");
    }
}
