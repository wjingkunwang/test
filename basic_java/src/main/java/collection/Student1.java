package collection;

import java.util.HashSet;

/**
 * Created by wjk on 16/1/19.
 */
public class Student1 {
    private int age;
    private String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("调用equals()方法");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student1 student1 = (Student1) o;

        if (age != student1.age) return false;
        return !(name != null ? !name.equals(student1.name) : student1.name != null);

    }

    @Override
    public int hashCode() {
        System.out.println("调用hashCode()方法");
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        System.out.println("name:   " + name + "  age:    " + age + "   hashCode    "+result);
        return result;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"张三");
        Student1 s2 = new Student1(2,"张三");
        Student1 s3 = new Student1(1,"李四");
        Student1 s4 = new Student1(1,"张三");
        System.out.println("s1 == s4    " + (s1==s4 ));
        System.out.println("s1.equals(s4)" + s1.equals(s4));
        HashSet<Student1> hashSet = new HashSet();
        hashSet.add(s1);
        hashSet.add(s4);
        hashSet.add(s2);
        hashSet.add(s3);

        System.out.println(hashSet.size());
    }
}
