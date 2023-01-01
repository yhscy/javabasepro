package cc.yhscy.d4_polymorphic_demo;

/**
 * Created by yhsec on 2023/1/1 23:23
 */
public class Computer {
    public void install(Usb U){
        U.joinUp();
        //中间调用独有功能
        if (U instanceof Keyboard){
            Keyboard k = (Keyboard) U;
            k.write();
        }else if (U instanceof Mouse){
            Mouse m = (Mouse) U;
            m.click();
        }

        U.putOut();



    }
}
