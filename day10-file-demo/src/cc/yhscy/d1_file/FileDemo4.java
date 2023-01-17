package cc.yhscy.d1_file;

import java.io.File;

/**
 * Created by yhsec on 2023/1/16 23:58
 */
public class FileDemo4 {
    public static void main(String[] args) {
        //文件夹遍历
        File f = new File("E:/testjava/");
        File[] fileList = f.listFiles();

        for(File ff : fileList) {
            System.out.println(ff.getName());
        }

        }
    }


