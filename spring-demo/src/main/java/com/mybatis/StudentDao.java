package com.mybatis;

import java.util.List;

/**
 * Created by wjk on 16/6/16.
 */
public interface StudentDao {

        public void insert(Student student);

        public Student findUserById (int id);

        public List<Student> findAllUsers();

}
