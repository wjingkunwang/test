package chuangjianxin.prototype.qiancopy;

import lombok.Data;

/**
 * Created by wjk on 16/3/15.
 */
@Data
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }
}
