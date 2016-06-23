package mybatis.core;

import java.util.List;

/**
 * Created by wjk on 16/6/16.
 */
public interface StudentDao {
    public void insert(Student student);

    public Student findStudentById(int id);

    public List<Student> findAllUsers();

    public List<Student> studentPage(Student student);


}
