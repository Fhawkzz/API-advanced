package ArrayPlus;

import java.util.Scanner;

//递归 求阶乘
public class MyfactorialDemo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入：");
        int nextInt = sc.nextInt();
        int finaall=multiply(nextInt);
        System.out.println(finaall);
    }

    private static int multiply(int i ){
if (i==1){return 1;}
else{
    return i*multiply(i-1) ;
}
    }
}
