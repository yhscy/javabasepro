package cc.yhscy.d6_innerclass_anonymous;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by yhsec on 2023/1/2 12:23
 */
public class Test {
    public static void main(String[] args) {
//        Swim s = new Swim() {
//            @Override
//            public void swimGood() {
//                System.out.println("老师在游泳。。。");
//            }
//        };

//        Teacher t = new Teacher();
//        goWith(t);



        //省略实现类，用匿名类作为参数
        Swim s = new Swim() {
            @Override
            public void swimGood() {
                System.out.println("老师正在游泳。。。");
            }
        };
        goWith(s);

        System.out.println("------------学生--------------");
        goWith(new Swim() {
            @Override
            public void swimGood() {
                System.out.println("简写模式：学生正在游泳。。。");
            }
        });



    }


    public static void goWith(Swim s){
        System.out.println("角色开始游泳");
        s.swimGood();
        System.out.println("角色结束游泳");
    }
}


//class Teacher implements Swim{
//
//    @Override
//    public void swimGood() {
//        System.out.println("老师在游泳。。。。");
//    }
//}