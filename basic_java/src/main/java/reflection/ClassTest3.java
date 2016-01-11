package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wjk on 16/1/11.
 */
public class ClassTest3 {
    public static void main(String[] args) throws Exception {
        //默认构造器产生对象
        Class<Student> clazz = (Class<Student>) Class.forName("reflection.Student");
        System.out.println(clazz.newInstance());

        //指定构造器产生对象
        Constructor<Student> c = clazz.getDeclaredConstructor(String.class, int.class);
        Student student = c.newInstance("xiaoming", 12);
        System.out.println("指定构造器产生对象后获取姓名: " + student.getName());

        //反射调用普通方法
        Method m = clazz.getDeclaredMethod("setName", String.class);
        m.invoke(student, "XIAOHUA ");
        System.out.println("反射调用普通方法修改姓名后获取姓名: " + student.getName());

        //修改该属性
        Student student1 = clazz.newInstance();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(student1, "wjk");
        System.out.println(student1.getName());
        System.out.println(field.get(student1));
    }
}
