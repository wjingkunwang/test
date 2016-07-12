package serialization;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by wjk on 16/7/12.
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3786405471193175026L;
    private String name;
    private Integer age;
}
