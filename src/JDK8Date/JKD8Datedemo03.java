package JDK8Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//方法说明
//| public LocalDate  toLocalDate () | 转换成为一个LocalDate对象 |
//| public LocalTime toLocalTime ()  | 转换成为一个LocalTime对象 |
// public String format (指定格式)                           |
// 把一个LocalDateTime格式化成为一个字符串                     |
//  public LocalDateTime parse (准备解析的字符串, 解析格式)   |
//  把一个日期字符串解析成为一个LocalDateTime对象               |
// public static DateTimeFormatter ofPattern(String pattern) |
// 使用指定的日期模板获取一个日期格式化器DateTimeFormatter对象 |



public class JKD8Datedemo03 {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.of(2000,12,12,12,12,12);
        LocalDate localDate = ldt.toLocalDate();
//| public LocalDate  toLocalDate () | 转换成为一个LocalDate对象 |
        System.out.println(localDate);
        //| public LocalTime toLocalTime ()  | 转换成为一个LocalTime对象 |
        LocalTime localTime = ldt.toLocalTime();
        System.out.println(localTime);
        System.out.println("=======");
        System.out.println("=======");
        System.out.println("=======");
        System.out.println("=======");
// public static DateTimeFormatter ofPattern(String pattern) |
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日  HH:mm:ss");
        String format = ldt.format(pattern);
        System.out.println(format);
//  public LocalDateTime parse (准备解析的字符串, 解析格式)   |
        LocalDateTime ldt2=LocalDateTime.parse(format,pattern);
        System.out.println(ldt2);


    }
}
