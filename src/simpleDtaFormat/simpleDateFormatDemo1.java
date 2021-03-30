package simpleDtaFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        //格式化
        String format = sdf.format(date1);
        System.out.println(format);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str ="1999年12月12日 06:12:12";
        //解析
        Date parse = sdf1.parse(str);
        System.out.println(parse);
    }
}
