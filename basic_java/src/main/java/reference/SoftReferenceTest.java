package reference;

import java.lang.ref.SoftReference;

/**
 * 软引用
 */
public class SoftReferenceTest {
    public static void main(String[] args) {
        String string = new String("hello world");
        SoftReference<String> reference = new SoftReference<String>(string);
        string = null;
        System.out.println("gc()前弱引用所指向的对象是: "+reference.get());
        System.gc();//gc()不一定立刻执行垃圾回收
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("gc()后弱引用所指向的对象是: "+reference.get());
    }
}
