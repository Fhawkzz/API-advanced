package Integer;
//int和String类型相互转换

public class IntegerDemo03 {
    public static void main(String[] args) {
//int -->String
        //方法1  直接在数字后加一个空字符串
        int x=10;
        String s1 = x + " ";
        System.out.println(s1);
        //方法2  通过String类静态方法valueOf()
        String s2 = String.valueOf(x);
        System.out.println(s2);
        System.out.println("==========");
        System.out.println("==========");
        System.out.println("==========");
         //String-->int
         //方式一：先将字符串数字转成Integer，再调用valueOf()方法
         // Integer.valueOf（String str）；
         //对象.intvalue（）；
        String str1="200";
        Integer integer = Integer.valueOf(str1);
        int i = integer.intValue();
        System.out.println(i+100);
        //  方式二：通过Integer静态方法parseInt()进行转换
        System.out.println("==========");
        System.out.println(Integer.parseInt(str1));

    }
}
