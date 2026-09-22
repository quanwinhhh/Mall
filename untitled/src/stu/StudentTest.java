package stu;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        student.setClassName("二班");
        student.setAge(18);
        student.setLove("打球");
        System.out.println(student.getName());
        System.out.println(student.getClassName());
        System.out.println(student.getAge());
        System.out.println(student.getLove());

    }
}
