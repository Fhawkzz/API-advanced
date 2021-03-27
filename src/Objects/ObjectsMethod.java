package Objects;

import java.util.Objects;

//1.public static String toString(对象)返回参数中对象的字符串表示形式。
// 2,public static String toString(对象, 默认字符串)返回对象的字符串表示形式。
// 3.public static Boolean isNull(对象)判断对象是否为空
// 4.public static Boolean nonNull(对象)判断对象是否不为空
public class ObjectsMethod {
    public static void main(String[] args) {
    Student stu=new Student(20,"xiaojiang");
        String stud = Objects.toString(stu);
        System.out.println(stud);
        System.out.println("========");
        Student stu2=new Student();
        stu2=null;
        String stud2 = Objects.toString(stu2,"没这个玩意");
        System.out.println(stud2);
        System.out.println("========");
        System.out.println(Objects.isNull(stu2));
        System.out.println("========");
        System.out.println(Objects.nonNull(stu2));


    }
}
