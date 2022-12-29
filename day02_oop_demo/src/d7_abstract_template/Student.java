package d7_abstract_template;

/**
 * Created by yhsec on 2022/12/29 21:58
 */
public abstract class Student {
    public void write(){
        System.out.println("标题");
        System.out.println(writeMain());
        System.out.println("结尾");
    }

    public abstract String writeMain();
}
