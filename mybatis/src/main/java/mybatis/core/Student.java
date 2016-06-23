package mybatis.core;


import lombok.Data;
import mybatis.plugin.PageParameter;

/**
 * Created by wjk on 16/6/16.
 */
@Data
public class Student {
    private Long id;
    private String name;

    PageParameter page = new PageParameter();

}
