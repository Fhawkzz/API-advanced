package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        public static String toString(int[] a)返回指定数组的内容的字符串表示形式
//        public static void sort(int[] a)按照数字顺序排列指定的数组
//        public static int binarySearch(int[] a, int key)利用二分查找返回指定元素的索引
    //1.
        int[] arr={3,1,5,2,4};
        System.out.println(Arrays.toString(arr));
        //2.
        System.out.println("=====");
        int[] arr2={3,1,5,2,4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("=====");
        int[] arr3={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(arr3, 6));
        System.out.println(Arrays.binarySearch(arr3, 11));

    }
}
