package chuangjianxin.danli;

/**
 * 静态内部类的实现
 * (1)外部没有Static属性不会饿汉式那样立即加载对象
 * (2)真正调用getInstance()时,才会加载静态内部类.类加载时是线程安全的,static final保证内存中实例唯一
 * (3)兼具并发高效和延时加载的优势
 */
public class SingletonDemo2 {

    private static class singletonClass {
        private static final SingletonDemo2 instance = new SingletonDemo2();
    }

    public static SingletonDemo2 getInstance() {
        return singletonClass.instance;
    }

    private SingletonDemo2() {

    }
}
