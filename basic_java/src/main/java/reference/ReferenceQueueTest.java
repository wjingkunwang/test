package reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Created by wjk on 16/1/15.
 */
public class ReferenceQueueTest {
    public static void main(String[] args) throws InterruptedException {
        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        WeakReference<Object> weakReference = new WeakReference<Object>(referent, referenceQueue);


        System.out.println(weakReference.isEnqueued());
        //System.out.println(weakReference.get());
        Reference<? extends Object> polled = referenceQueue.poll();
        System.out.println(polled);
        referent = null;
        System.gc();
        Thread.sleep(1000);
        //System.out.println(weakReference.get());
       // System.out.println(weakReference.isEnqueued());
        System.out.println(referenceQueue.poll());
       /* Reference<? extends Object> removed = referenceQueue.remove();
        System.out.println(removed);*/
    }
}
