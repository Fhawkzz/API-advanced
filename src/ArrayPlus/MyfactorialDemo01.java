package ArrayPlus;
//递归 求和
import java.util.Scanner;

public class MyfactorialDemo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入：");
        int nextInt = sc.nextInt();
        int sum =getSum(nextInt);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        if (i==1){
            return 1;
        }
        else {
            return i+getSum(i-1);
        }
    }
}
