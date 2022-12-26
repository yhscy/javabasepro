package cc.yhscy.d2_modifier;

/**
 * Created by yhsec on 2022/12/27 0:28
 */
public class Fu {

    private void privateMethod(){
        System.out.println("私有方法");

    }

    void getMethod(){
        System.out.println("缺省");
    }


    protected void protectedMethod(){
        System.out.println("protected");
    }


    public void pulicMethod(){
        System.out.println("公开方法");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.getMethod();
        f.protectedMethod();
        f.pulicMethod();
    }


}
