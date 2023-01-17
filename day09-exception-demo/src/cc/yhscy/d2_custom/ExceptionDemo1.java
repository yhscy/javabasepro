package cc.yhscy.d2_custom;

/**
 * Created by yhsec on 2023/1/16 21:14
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            checkAge(2000);
        } catch (IllegalException e) {
            e.printStackTrace();
        }
        System.out.println("结束");

    }
    public static void checkAge(int age) throws IllegalException {
        if (age < 0 || age > 200){
            //抛出一个异常对象给调用者
            //throw: 在方法内部直接创建一个异常对象，并从此点抛出;
            //throws：用在方法申明上，抛出方法内部异常；
            throw new IllegalException(age +"is illeagal!");
        }else {
            System.out.println("合法");
        }
    }
}
