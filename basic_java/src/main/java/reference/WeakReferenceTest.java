package reference;

import java.lang.ref.WeakReference;

/**
 * Created by wjk on 16/1/15.
 */
public class WeakReferenceTest {
    public static void main(String[] args) {
        String string = new String("hello world");
//        String string = "hello world";
        WeakReference<String> reference = new WeakReference<String>(string);
        string = null;
        System.out.println("gc()前弱引用所指向的对象是: " + reference.get());
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("gc()后弱引用所指向的对象是: " + reference.get());
    }
}
