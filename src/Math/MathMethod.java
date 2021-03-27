package Math;
//1.public static int   abs(int a)返回参数的绝对值
// 2.public static double ceil(double a)返回大于或等于参数的最小double值，等于一个整数
// 3.public static double floor(double a)返回小于或等于参数的最大double值，等于一个整数
// 4,public   static int round(float a)按照四舍五入返回最接近参数的int
// 5.public static int   max(int a,int b)返回两个int值中的较大值
// 6.public   static int min(int a,int b)返回两个int值中的较小值
// 7.public   static double pow (double a,double b)返回a的b次幂的值
public class MathMethod {
    public static void main(String[] args) {
        //1..
        System.out.println(Math.abs(-3.14));
       //2.
        System.out.println(Math.ceil(3.14));
        //3.
        System.out.println(Math.floor(3.14));
        //4.
        System.out.println(Math.round(3.14));
        //5.
        System.out.println(Math.max(3.14,2.714));
        //6.
        System.out.println(Math.min(3.14,2.714));
        //7.
        System.out.println(Math.pow(2,10));
    }
}
