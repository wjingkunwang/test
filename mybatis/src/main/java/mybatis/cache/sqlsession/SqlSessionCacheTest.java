package mybatis.cache.sqlsession;

import mybatis.MybatisUtil;
import mybatis.core.Student;
import mybatis.core.StudentDao;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by wjk on 16/6/24.
 */
public class SqlSessionCacheTest {
    @org.junit.Test
    public void findUserById() {
        SqlSession sqlSession = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);

        Student student = userMapper.findStudentById(1);
        Student student1 = userMapper.findStudentById(1);
    }

}
