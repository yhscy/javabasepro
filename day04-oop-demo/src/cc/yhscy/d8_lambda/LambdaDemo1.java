package cc.yhscy.d8_lambda;

/**
 * Created by yhsec on 2023/1/8 16:48
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        Swiming s1 = new Swiming() {
            @Override
            public void swim() {
                System.out.println("学生游泳很厉害！");
            }
        };

        goWith(s1);
//
//        //开始lambda简化
//        Swiming s2 = () ->{
//            System.out.println("学生游泳很厉害！");
//        };
//        goWith(s2);
//

        //进一步简化
        goWith(() ->{
            System.out.println("学生游泳很厉害！");
        });

    }

    public static void goWith(Swiming s){
        System.out.println("开始....");
        s.swim();
        System.out.println("结束....");

    };

}









