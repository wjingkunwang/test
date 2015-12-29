package StirngTest;

import java.lang.reflect.Field;

/**
 * Created by wjk on 15/12/28.
 */
public class StringReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "123";
        System.out.println(str); //123

        Field valueFiled = String.class.getDeclaredField("value");
        //访问属性设置
        valueFiled.setAccessible(true);
        char[] oldValue = (char[]) valueFiled.get(str);
        oldValue[0] = 'A';
        System.out.println(str);  //A123
    }
}
