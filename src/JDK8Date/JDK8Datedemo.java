package JDK8Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8Datedemo {
    public static void main(String[] args) {
        String s="2020年11月11日 00:00:00";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(11);
        String result = newLocalDateTime.format(pattern);
        System.out.println(result);

    }

}
