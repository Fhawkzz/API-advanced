package ArrayPlus;

//1,我现在要干嘛? --- 二分查找
//2.我干这件事情需要什么? --- 数组 元素
//3,我干完了,要不要把结果返回调用者 --- 把索引返回给调用者
public class MyBinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 6;
        int index = useMyBinarySearchDemo(arr, number);
        System.out.println(index);

    }

    private static int useMyBinarySearchDemo(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) >>1;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else if (arr[mid] == number) {
                return mid;
            }
        }
        return -1;


    }

}
