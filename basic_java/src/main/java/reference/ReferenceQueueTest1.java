package reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/**
 * Created by wjk on 16/1/15.
 */
public class ReferenceQueueTest1 {
    public static void main(String[] args) throws InterruptedException {
        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        SoftReference<Object> weakReference = new SoftReference<Object>(referent, referenceQueue);

        System.out.println("垃圾回收器或程序是否添加该引用到引用队列:   " + weakReference.isEnqueued());
        Reference<? extends Object> polled = referenceQueue.poll();
        System.out.println("返回队列可用的对象: " + polled);
        referent = null;
        System.gc();
        Thread.sleep(1000);
        //weakReference.enqueue();
        System.out.println("垃圾回收器及程序是否添加该引用到引用队列:   " + weakReference.isEnqueued());

        Reference<? extends Object> removed = referenceQueue.remove();
        System.out.println("阻塞移除队列的中的引用对象:   " + removed);
    }
}
