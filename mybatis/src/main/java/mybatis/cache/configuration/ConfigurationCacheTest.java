package mybatis.cache.configuration;

import mybatis.MybatisUtil;
import mybatis.core.Student;
import mybatis.core.StudentDao;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by wjk on 16/6/24.
 */
public class ConfigurationCacheTest {
    @org.junit.Test
    public void findUserById() {
        SqlSession sqlSession = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);


        SqlSession sqlSession1 = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper1 = sqlSession1.getMapper(StudentDao.class);

        Student student = userMapper.findStudentById(1);
//        sqlSession.commit();
//        student.setName("heh");
//        userMapper.modify(student);
        Student student1 = userMapper.findStudentById(1);
    }

}
