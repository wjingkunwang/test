package classLoaderTest;

/**
 * 线程上下文类加载器
 */
public class Demo3 {
    public static void main(String[] args) {
        //获得Demo类的类加载器
        ClassLoader loader1 = Demo.class.getClassLoader();
        System.out.println(loader1);
        //获得当前线程类加载器
        ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
        System.out.println(loader2);

        //使用自定义类加载器
        Thread.currentThread().setContextClassLoader(new FileSystemClassLoader("/Users/wjk/Desktop"));
        //获得当前线程类加载器
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
