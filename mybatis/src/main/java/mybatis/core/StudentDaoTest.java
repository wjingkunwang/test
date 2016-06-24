package mybatis.core;

import mybatis.MybatisUtil;
import mybatis.plugin.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by wjk on 16/6/24.
 */
public class StudentDaoTest {

    @org.junit.Test
    public void findUserById() {
        SqlSession sqlSession = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);

        Student student = userMapper.findStudentById(1);
    }

}
