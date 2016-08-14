package mybatis.core;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wjk on 16/6/16.
 */
@Data
@Alias("student")
public class Student implements Serializable {
    private static final long serialVersionUID = 5409185459234711691L;

    private Long id;
//    private String name;
    //测试TypeHandler时
    private List<String> name;
}
