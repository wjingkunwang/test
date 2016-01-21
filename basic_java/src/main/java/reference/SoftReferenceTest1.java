package reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * Created by wjk on 16/1/15.
 */
public class SoftReferenceTest1 {
    public static void main(String[] args) {
        String string = new String("hello world");
        SoftReference<String> reference = new SoftReference<String>(string);

        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        string = null;
        System.gc();


        System.out.println(reference.isEnqueued());


        System.out.println(reference.get());
    }

}
