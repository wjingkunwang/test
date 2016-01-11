package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wjk on 16/1/11.
 */
public class ClassTest2 {
    public static void main(String[] args) throws Exception {
        // 获得类型
        Class clazz = Class.forName("reflection.Student");
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        // 获得属性
        // 获取全部方法
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("全部的属性:" + field.getName());
        }
        // 获取public修饰的方法
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println("私有的属性:" + field.getName());
        }
        // 获得方法
        // 获得全部方法
        Method[] methods = clazz.getDeclaredMethods();
        // 方法名字 + 无参数
        Method m01 = clazz.getDeclaredMethod("getName", null);
        // 方法名 + 有参数
        Method m02 = clazz.getDeclaredMethod("setName", String.class);
        for(Method m:methods){
            System.out.println("方法："+m);
        }
        // 获得构造器
        Constructor[] constructors = clazz.getDeclaredConstructors();
        Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println("获得构造器："+c);
        for(Constructor temp:constructors){
            System.out.println("构造器："+temp);
        }
    }
}
