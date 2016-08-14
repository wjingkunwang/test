package mybatis.typeAliases;

import mybatis.MybatisUtil;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Map;

/**
 * Created by wjk on 16/8/4.
 */
public class TypeAliasesTest {
    @Test
    public void getAliases() {
        SqlSessionFactory sqlSessionFactory = MybatisUtil.getSessionFactory();
        Configuration con = sqlSessionFactory.getConfiguration();
        Map<String, Class<?>> typeMap = con.getTypeAliasRegistry().getTypeAliases();
        for (Map.Entry<String, Class<?>> entry : typeMap.entrySet()) {
            System.out.println(entry.getKey() + " ================> " + entry.getValue().getSimpleName());
        }
    }
}
