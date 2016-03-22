package chuangjianxin.prototype.qiancopy;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by wjk on 16/3/15.
 */
@Data
public class Teacher implements Serializable {
    private static final long UID = 6948989635489677685L;

    private String name;

    public Teacher(String name) {
        this.name = name;
    }
}
