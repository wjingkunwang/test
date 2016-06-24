package mybatis.plugin;

import mybatis.MybatisUtil;
import mybatis.core.Student;
import mybatis.core.StudentDao;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by wjk on 16/6/24.
 */
public class PluginTest {

    @org.junit.Test
    public void pageHelper() {
        SqlSession sqlSession = MybatisUtil.getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();

        PageHelper.startPage(1, 10);
        userMapper.studentPage(student);
        System.out.println(PageHelper.endPage().getResult());
    }

}
