package collection;

/**
 * Created by wjk on 16/1/19.
 */
public class Test {
    public static void main(String[] args) {
        SeniorStudent ss1 = new SeniorStudent("zhangsan", 10);
        SeniorStudent ss2 = new SeniorStudent("zhangsan", 20);
        Student s = new Student("zhangsan");

        System.out.println(s.equals(ss1));
        System.out.println(s.equals(ss2));
        System.out.println(ss1.equals(ss2));
    }
}
