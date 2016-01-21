package classLoaderTest;

/**
 * Created by wjk on 16/1/17.
 */
public class TestMyClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        FileSystemClassLoader loader = new FileSystemClassLoader("/Users/wjk/Desktop");
        FileSystemClassLoader loader1 = new FileSystemClassLoader("/Users/wjk/Desktop");
        Class c = loader.loadClass("com.Hello");
        Class c1 = loader1.loadClass("com.Hello");
        Class c2 = loader.loadClass("com.Hello");
        Class c3 = loader.loadClass("java.lang.String");


        System.out.println(c.hashCode());//被两个类加载器加载的同一个类,JVM认为是不同的(c和c1的hashCode值不一样)
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());


        System.out.println(c.getClassLoader());//使用的是自定义的类加载器
        System.out.println(c3.getClassLoader());//使用的是引导类加载器
    }
}
