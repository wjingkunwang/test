package com.ioc.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wjk on 16/5/21.
 */
public class Test {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml,application.xml");

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","application.xml"});

        Student student = (Student) context.getBean("student");


//        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
//        Student student = (Student) beanFactory.getBean("student");
//
//        //资源
//        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//        //容器
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        //BeanDefinition读取器,通过回调配置给容器
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        //读取配置
//        reader.loadBeanDefinitions(resource);

//        Student student = (Student) factory.getBean("student");
//        System.out.println(student);
    }
}
