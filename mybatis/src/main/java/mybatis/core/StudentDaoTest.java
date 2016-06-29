package mybatis.core;

import mybatis.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * Created by wjk on 16/6/24.
 */
public class StudentDaoTest {

    @org.junit.Test
    public void findUserById() {
        SqlSession sqlSession = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);

        Student student = userMapper.findStudentById(2);
        System.out.println(student.getName());

//        Student student = new Student();
//        student.setId(1L);
//        student.setName(new ArrayList<String>() {{
//            add("1");
//            add("1");
//        }});
//
//        System.out.println(userMapper.modify(student));
//
    }

}
