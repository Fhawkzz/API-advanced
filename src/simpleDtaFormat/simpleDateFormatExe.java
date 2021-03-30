package simpleDtaFormat;
//判断两位同学的下单时间是否在范围内
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatExe {
    public static void main(String[] args) throws ParseException {
String start="2020年11月11日 00:00:00";
String end="2020年11月11日 00:10:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date sta = sdf.parse(start);
        long a = sta.getTime();
        Date en = sdf.parse(end);
        long b = en.getTime();
long limit=b-a;
        System.out.println("=====");
        String xiaojia="2020年11月11日 00:03:47";
        Date jiat = sdf.parse(xiaojia);
        long jia1 = jiat.getTime();
        long jia=jia1-a;
        String xiaopi="2020年11月11日 00:10:11";
        Date pit = sdf.parse(xiaopi);
        long pi1 = pit.getTime();
        long pi=pi1-a;

        System.out.print("小贾");
        pick(limit,jia);
        System.out.print("小皮");
        pick(limit,pi);

    }

    public static void pick(long limit,long givetime) {
        if (givetime> limit){
            System.out.println("秒杀失败！！");
        }else{
            System.out.println("秒杀成功!!");
        }
    }
}
