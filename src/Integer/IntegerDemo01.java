package Integer;

public class IntegerDemo01 {
    public static void main(String[] args) {
        //Integer构造
        //旧
        Integer itg1=new Integer(100);
        System.out.println(itg1);
        Integer itg2=new Integer("100");
        System.out.println(itg2);
        //新
        Integer integer1 = Integer.valueOf(200);
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf("200");
        System.out.println(integer2);

    }
}
