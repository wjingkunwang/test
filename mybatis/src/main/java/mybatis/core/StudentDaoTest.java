package mybatis.core;

import mybatis.plugin.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.io.IOException;
import java.util.List;

/**
 * Created by wjk on 16/6/16.
 */
public class StudentDaoTest {

    @Test
    public void findUserById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);


        Student student = new Student();
        student.setId(1L);
        List<Student> user = userMapper.studentPage(student);
    }

    @Test
    public void pageHelper() {
        SqlSession sqlSession = getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();

        PageHelper.startPage(1, 10);
        userMapper.studentPage(student);
        System.out.println(PageHelper.endPage().getResult());
    }

    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }


}
