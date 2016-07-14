package serialization;

import java.io.Serializable;

/**
 * Created by wjk on 16/7/12.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 7280703192543232805L;
    private transient String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

