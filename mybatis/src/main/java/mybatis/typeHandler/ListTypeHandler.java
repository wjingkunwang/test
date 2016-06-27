package mybatis.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.springframework.util.CollectionUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wjk on 16/6/27.
 */
public class ListTypeHandler implements TypeHandler {
    private static final String LIST_SPLIT_FLAG = ",";

    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        List<String> list = (List) parameter;
        StringBuilder stringBuilder = new StringBuilder();
        if(!CollectionUtils.isEmpty(list)){
            for(String str : list){
                stringBuilder.append(str);
            }
        }
        ps.setString(i,stringBuilder.toString());

    }

    public Object getResult(ResultSet rs, String columnName) throws SQLException {
        String str = rs.getString(columnName);
        return CollectionUtils.arrayToList(str.split(LIST_SPLIT_FLAG));
    }

    public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
        String str = rs.getString(columnIndex);
        return CollectionUtils.arrayToList(str.split(LIST_SPLIT_FLAG));
    }

    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String str = cs.getString(columnIndex);
        return CollectionUtils.arrayToList(str.split(LIST_SPLIT_FLAG));
    }
}
