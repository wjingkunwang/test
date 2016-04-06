package beanmap;

import lombok.Data;

/**
 * Created by wjk on 16/4/6.
 */
@Data
public class Student {
    private Integer age;
    private String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
