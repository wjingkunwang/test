package reflection;

import java.lang.reflect.Method;

/**
 * Created by wjk on 16/1/11.
 */
public class ClassTest4 {
    public static void test1() {
        Student student = new Student();
        long start = System.currentTimeMillis();
        for (Long i = 1L; i < 1000000L; i++) {
            student.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void test2() throws Exception {
        Student student = new Student();
        Class clazz = student.getClass();
        Method method = clazz.getDeclaredMethod("getName", null);
        long start = System.currentTimeMillis();
        for (Long i = 1L; i < 1000000L; i++) {
            method.invoke(student);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static void test3() throws Exception {
        Student student = new Student();
        Class clazz = student.getClass();
        Method method = clazz.getDeclaredMethod("getName", null);
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for (Long i = 1L; i < 1000000L; i++) {
            method.invoke(student);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    public static void main(String[] args) throws Exception {
        test1();
        test2();
        test3();
    }
}
