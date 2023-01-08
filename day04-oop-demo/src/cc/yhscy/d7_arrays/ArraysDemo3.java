package cc.yhscy.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yhsec on 2023/1/8 15:54
 */
public class ArraysDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",22,1.85);
        Student s2= new Student("张四",24,1.65);
        Student s3 = new Student("张五",27,1.75);

        //定义一个学生对象数组；
        Student[] arr = {s1,s2,s3};

        //按照学生年龄来降序排列
//        Arrays.sort(arr, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(o1.getAge() - o2.getAge());
//            }
//        });
//
//        System.out.println(Arrays.toString(arr));  //打印出的对象地址，原因是没有重写tostring方法；

        //按照学生升高降序排列
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getHeight(),o1.getHeight());
            }
        });
        System.out.println(Arrays.toString(arr));  //打印出的对象地址，原因是没有重写tostring方法；


    }

}
