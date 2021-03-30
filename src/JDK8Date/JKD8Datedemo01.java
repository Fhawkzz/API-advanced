package JDK8Date;

import java.time.LocalDateTime;

public class JKD8Datedemo01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now2=LocalDateTime.of(1111,11,11, 11,11,11);
        System.out.println(now);
        System.out.println(now2);
    }
}
