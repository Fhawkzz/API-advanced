package ArrayPlus;
//运用快排+递归对数组排序
public class MyQuickSortDemo2 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 8, 9, 1, 2, 10, 7, 4,11,12,16,14,13,18};

        findindex(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void findindex(int[] arr, int left, int right) {
        int left0 = left;
        int rigth0 = right;
   if (left>right){
            return;
        }
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
        findindex(arr,left0,left-1);
        findindex(arr,left+1,rigth0);
    }
}
