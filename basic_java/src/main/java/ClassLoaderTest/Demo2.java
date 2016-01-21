package classLoaderTest;

/**
 * Created by wjk on 16/1/17.
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "hello world";
        //使用的是引导类加载器
        System.out.println(str.getClass().getClassLoader());
        //没有输出自定义java.lang.String
        System.out.println(str);
    }
}
