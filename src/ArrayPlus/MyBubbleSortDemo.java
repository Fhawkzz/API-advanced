package ArrayPlus;


import java.util.Arrays;
//冒泡排序
//一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，依次对所有的数据进行操作，直至所有数据按要求完成排序
//如果有n个数据进行排序，总共需要比较n-1次
//每一次比较完毕，下一次的比较就会少一个数据参与
public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
