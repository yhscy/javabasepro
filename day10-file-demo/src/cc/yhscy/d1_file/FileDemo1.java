package cc.yhscy.d1_file;

import java.io.File;

/**
 * Created by yhsec on 2023/1/16 22:43
 */
public class FileDemo1 {
    public static void main(String[] args) {
        /*
        路径（系统分隔符）的写法：
        1.双反斜杠 E:\testjava\meinv.jpeg
        2.单正斜杠 E:/testjava/meinvv.jpeg
        3.File.separator
         */
        File file = new File("E:\\testjava\\meinv.jpeg");
        System.out.println(file.exists());
        System.out.println(file.length());

        File file2 = new File("E:/testjava/meinvv.jpeg");
        System.out.println(file2.exists());
        System.out.println(file2.length());

        File file3 = new File("E:" + File.separator + "testjava" + File.separator + "dreamcar.jpeg");
        System.out.println(file3.exists());
        System.out.println(file3.length());
    }
}
