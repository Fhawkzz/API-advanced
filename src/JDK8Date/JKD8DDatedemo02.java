package JDK8Date;

import java.time.LocalDateTime;
//localdatetime的获取方法
public class JKD8DDatedemo02 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2000, 12, 12, 12, 12, 12);
        System.out.println(localDateTime);
        //JDK8Datepublic int getYear()获取年
        System.out.println("year   "+localDateTime.getYear());
// public int getMonthValue()获取月份（1-12）
        System.out.println("moth"+localDateTime.getMonthValue());
// public int getDayOfMonth()获 取月份中的第几天（1-31）
        System.out.println("day   "+localDateTime.getDayOfMonth());
// public int getDayOfYear()获取一年中的第几天（1-366）
        System.out.println("day   "+localDateTime.getDayOfYear());
// public DayOfWeek getDayOfWeek()获取星期
        System.out.println("day  "+localDateTime.getDayOfWeek());
// public int getMinute()获取分钟
        System.out.println("minute   "+localDateTime.getMinute());
// public int getHour()获取小时
        System.out.println("hour   "+localDateTime.getHour());
    }
}
