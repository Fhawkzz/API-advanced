package ArrayPlus;

import java.sql.Array;

public class MyQuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 8, 9, 1, 2, 10, 7, 4};

        findindex(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void findindex(int[] arr, int left, int right) {
        int left0 = left;
        int rigth0 = right;
        while (left != right) {
            while (arr[right] >= arr[left0] && right > left) {
                right--;
            }
            while (arr[left] <= arr[left0] && right > left) {
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

    }
}
