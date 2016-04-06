package beanmap;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wjk on 16/4/6.
 */
public class BeanMap {

    /**
     * 将bean封装为map
     *
     * @param obj
     * @return
     */
    public static Map<String, Object> bean2Map(Object obj) {

        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    map.put(key, value);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;

    }


    /**
     * 将Map封装为bean
     *
     * @param paramMap
     * @param target
     * @return
     */
    public static void map2Bean(Map<String, ? extends Object> paramMap, Object target) throws Exception {
        if (null == paramMap || null == target || paramMap.isEmpty()) {
            return;
        }
        if (target instanceof Map<?, ?> || target instanceof List<?>) {
            return; // 不处理 Map,List 以及。。。
        }
        Class<?> targetClazz = target.getClass();
        BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());
        PropertyDescriptor[] targetPds = beanInfo.getPropertyDescriptors();

        // 依赖 Spring 的 BeanUtils
        // PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(targetClazz);
        //
        for (PropertyDescriptor targetPd : targetPds) {
            Method writeMethod = targetPd.getWriteMethod();
            if (null == writeMethod) {
                continue;
            }
            //
            Class<?>[] pClazz = writeMethod.getParameterTypes();
            if (null == pClazz || pClazz.length != 1) {
                // 如果不是只有1个参数
                continue;
            }
            // 获取KEY和Value
            String keyName = targetPd.getName();
            Object value = paramMap.get(keyName);
            // 对比类型,如果类型不同,则进行解析转换, 主要是String转换
            value = tran2TargetType(value, pClazz[0]);
            if (null == value) {
                continue;
            }

            try {
                if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                    writeMethod.setAccessible(true);
                }
                // 执行 set 方法
                writeMethod.invoke(target, value);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }

        }
    }


    public static Object tran2TargetType(Object value, Class<?> pClazz) {
        Object result = null;
        // 为 null
        if (null == value || null == pClazz) {
            return result;
        }
        // 同一类型,不需要转换
        if (pClazz.isInstance(value)) {
            result = value;
            return result;
        }
        // 如果值不是为 String
        if (String.class != value.getClass()) {
            // 暂时没有转换器, 留 null
            return result;
        }
        //
        String str = value.toString();
        if (pClazz == int.class || pClazz == Integer.class) {
            result = Integer.parseInt(str);
        } else if (pClazz == Double.class || pClazz == double.class) {
            result = Double.parseDouble(str);
        } else if (pClazz == Float.class || pClazz == float.class) {
            result = Float.parseFloat(str);
        } else if (pClazz == Long.class || pClazz == long.class) {
            result = Long.parseLong(str);
        } else if (pClazz == Boolean.class || pClazz == boolean.class) {
            result = Boolean.parseBoolean(str);
        } else if (pClazz == Short.class || pClazz == short.class) {
            result = Short.parseShort(str);
        } else if (pClazz == Date.class) {
            result = parseStrToDate(str);
        } else if (pClazz == String.class) {
            result = str;
        }
        //
        return result;
    }

    private static Date parseStrToDate(String str) {
        // 需要解析各种格式,或者统一规范
        return null;
    }

    public static void main(String[] args) throws Exception{
        Student student = new Student(20, "wjk");
        Map map = bean2Map(student);


        Student stu = new Student();
        map2Bean(map, stu);
    }
}
