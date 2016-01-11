package reflection;

/**
 * Created by wjk on 16/1/11.
 */
public class Student {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void myPrivateMethod(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //默认构造器反射的时候不要省略
    public Student() {
    }
}
