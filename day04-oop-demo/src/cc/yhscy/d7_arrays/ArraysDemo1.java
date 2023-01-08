package cc.yhscy.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yhsec on 2023/1/8 15:20
 */
public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,45,5,66};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 45));
        System.out.println(Arrays.binarySearch(arr, 77)); //-7


}}
