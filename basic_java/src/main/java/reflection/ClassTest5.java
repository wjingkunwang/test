package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by wjk on 16/1/11.
 */
public class ClassTest5 {
    public static void test1(List<String> strings, Map<String, Object> map) {
        System.out.println("test1");
    }

    public static List<String> test2() {
        return null;
    }

    public static void main(String[] args) throws Exception {
        Class clazz = ClassTest5.class;
        Method m = clazz.getMethod("test1", List.class, Map.class);
        Type[] t = m.getGenericParameterTypes();
        for (Type type : t) {
            System.out.println("#" + type);
            if (type instanceof ParameterizedType) {
                Type[] genericTypes = ((ParameterizedType) type).getActualTypeArguments();
                for (Type genericType : genericTypes) {
                    System.out.println("泛型类型：" + genericType);
                }
            }
        }


        Method m2 = ClassTest5.class.getMethod("test2", null);
        Type returnType = m2.getGenericReturnType();
        if (returnType instanceof ParameterizedType) {
            Type[] genericTypes = ((ParameterizedType) returnType).getActualTypeArguments();

            for (Type genericType : genericTypes) {
                System.out.println("返回值，泛型类型：" + genericType);
            }

        }

    }
}
