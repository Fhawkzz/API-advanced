package Object;
//1。toString方法
//2.equals方法
public class ObjectMethod {
    public static void main(String[] args) {
        Student stu1=new Student(20,"xiaojiang");

        System.out.println(stu1.toString());

        Student stu2=new Student(18,"xiaowu");

        System.out.println(  stu1.equals(stu2));

        Student stu3=new Student(20,"xiaojiang");
        System.out.println(stu1.equals(stu3));



    }
}
