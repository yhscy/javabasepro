package cc.yhscy.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * Created by yhsec on 2023/1/16 23:07
 */
public class FileDemo2 {
    public static void main(String[] args) {

//        File f = new File("E:/testjava/dreamcar.jpeg");
        File f = new File("day10-file-demo\\dreamcar.jpeg");
        //a.获取绝对路径
        System.out.println(f.getAbsoluteFile());

        //b.获取文件定义时的路径
        System.out.println(f.getPath());
        //c.获取文件大小
        System.out.println(f.length());
        //d.文件名称
        System.out.println(f.getName());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        //d.文件最后修改的时间
        long time = f.lastModified();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
    }
}
