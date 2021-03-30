package Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //获取当前时间
        System.out.println(System.currentTimeMillis());
        //空参构造   输出当前时间
        Date date1=new Date();
        //有参构造 输出1970年1月1日8点（中国东8区 时间+8小时）0时0分加 数据值的时间
        System.out.println(date1);
        Date date2=new Date(0l);
        System.out.println( date2);

        method1(date1);
    }

    public static void method1(Date date1) {
//       getTime是获取时间的方法
        long time = date1.getTime();
        System.out.println(time);
//setTime是改变时间的方法
        date1.setTime(0L);
        System.out.println(date1);
    }
}
