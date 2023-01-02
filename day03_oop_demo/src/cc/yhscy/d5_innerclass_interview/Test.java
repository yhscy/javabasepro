package cc.yhscy.d5_innerclass_interview;

/**
 * Created by yhsec on 2023/1/2 12:00
 */
class People {
    private int heartbeat = 150;
    public class Heart{
        private int heartbeat = 110;
        public void show(){
            int heartbeat = 78;
            System.out.println(heartbeat);//78
            System.out.println(this.heartbeat);//110
            System.out.println(People.this.heartbeat);//150 people.this 看成一个整体：外部类的 实例成员变量
        }
    }
}




public class Test{
    public static void main(String[] args) {
        People.Heart H = new People().new Heart();
        H.show();


    }
}