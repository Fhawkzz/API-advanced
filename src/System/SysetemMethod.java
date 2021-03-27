package System;
//1.public  static void exit(int status)终止当前运行的Java虚拟机，非零表示异常终止
// 2.public  static long currentTimeMillis()返回当前时间(以毫秒为单位)
public class SysetemMethod {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int num=0;
        for (int i = 0; i < 100000; i++) {
           if (i>99999){
               System.exit(0);}
           else{ num=i+num;
               System.out.println(num);}

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
