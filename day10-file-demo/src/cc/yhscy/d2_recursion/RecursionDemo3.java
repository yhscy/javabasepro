package cc.yhscy.d2_recursion;

import java.io.File;
import java.io.IOException;

/**
 * Created by yhsec on 2023/1/17 16:09
 */
public class RecursionDemo3 {
    //找指定文件dreamcar.jpeg
    public static void main(String[] args) {
        findFile(new File("E:/"),"geek.exe");

    }
    public static void findFile(File f,String fileName){
        if (f != null && f.isDirectory()){
            File[] files = f.listFiles();
            //判断是否有一级目录
            if (files != null && files.length > 0){
                for (File file : files){
                    if (file.isFile()){
                        if (file.getName().contains(fileName)){
                            System.out.println("找到了" + file.getAbsolutePath());
                            try {
                                Runtime r = Runtime.getRuntime();
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                    }else {
                        findFile(file,fileName);
                    }
                }
            }

            }else {
            System.out.println("路径不存在");
        }

        }
    }


