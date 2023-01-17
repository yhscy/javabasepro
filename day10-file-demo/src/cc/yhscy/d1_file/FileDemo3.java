package cc.yhscy.d1_file;

import java.io.File;
import java.io.IOException;

/**
 * Created by yhsec on 2023/1/16 23:42
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {

        File f = new File("day10-file-demo/dreamcar2.jpeg");
        System.out.println(f.createNewFile()); //后续写文件都会自动创建，这个没什么卵用

        File f2 = new File("E:/testjava/aaa");
        System.out.println(f2.mkdir()); //创建一级目录

        File f3 = new File("E:/testjava/aaa/bb/ccd/dd");
        System.out.println(f3.mkdirs()); //创建一级目录

        File f4 = new File("E:/testjava/aaa/bb/ccd/dd");
        System.out.println(f4.delete());
    }
}
