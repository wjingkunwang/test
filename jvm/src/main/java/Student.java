/**
 * Created by wjk on 16/5/15.
 */

public class Student {
    private int age = 100;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student = new Student(1);
        System.out.println(student.getAge());
        student.setAge(10);
        System.out.println(student.getAge());
    }
}
