package classLoaderTest;

/**
 * Created by wjk on 16/1/17.
 */
public class Demo {
    public static void main(String[] args) {
        //获取应用程序类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        //获取扩展类加载器
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //获取引导类加载器
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());

        System.out.println(System.getProperty("java.class.path"));
    }
}
