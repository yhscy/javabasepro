package d7_abstract_template;

/**
 * Created by yhsec on 2022/12/29 22:05
 */
public class Test {
    public static void main(String[] args) {
        StudentMidddle m = new StudentMidddle();
        m.write();
        System.out.println("-------------");
        StudentHight h = new StudentHight();
        h.write();
    }
}
