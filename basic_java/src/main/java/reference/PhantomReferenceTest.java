package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * Created by wjk on 16/1/15.
 */
public class PhantomReferenceTest {
    public static void main(String[] args) {
        String string = new String("hello world");
        PhantomReference<String> reference = new PhantomReference<String>(string,new ReferenceQueue<String>());
        string = null;
        System.out.println("gc()前虚引用所指向的对象是: " + reference.get());
        System.gc();//gc()不一定立刻执行垃圾回收
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("gc()后虚引用所指向的对象是: " + reference.get());
    }
}
