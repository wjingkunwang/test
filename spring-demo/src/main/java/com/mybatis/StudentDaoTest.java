package com.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * Created by wjk on 16/6/16.
 */
public class StudentDaoTest {

    @Test
    public void findUserById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        StudentDao userMapper = sqlSession.getMapper(StudentDao.class);


        Student user = userMapper.findUserById(1);
        System.out.println(user.toString());
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


   /* @Test
    public void alia(){
        Configuration con = getSessionFactory().getConfiguration();
        Map<String, Class<?>> typeMap = con.getTypeAliasRegistry().getTypeAliases();
        for(Map.Entry<String, Class<?>> entry: typeMap.entrySet()) {
            System.out.println(entry.getKey() + " ================> " + entry.getValue().getSimpleName());
        }
    }*/

}
