package Objects;

import java.util.Objects;

public class Student {
    private int age;
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // alt+insert 自动重写equals方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name);
//    }


    // alt+insert 自动重写toString方法
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }
}
