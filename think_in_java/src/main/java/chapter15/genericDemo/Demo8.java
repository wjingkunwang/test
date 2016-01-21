package chapter15.genericDemo;

import java.lang.ref.*;

/**
 * Created by wjk on 16/1/13.
 */

public class Demo8 {
    /**
     * 一旦没有指向 referent 的强引用, weak reference 在 GC 后会被自动回收
     */
        /*Object referent = new Object();
        WeakReference<Object> weakRerference = new WeakReference<Object>(referent);

        System.out.println(weakRerference.get());
        referent = null;
        System.gc();
        System.out.println(weakRerference.get());*/
    public static void softReference() {
        Object referent = new Object();
        SoftReference<Object> softRerference = new SoftReference<Object>(referent);
        System.out.println(softRerference.get());
        referent = null;
        System.gc();
        System.out.println(softRerference.get());
    }

    /**
     * 当一个 WeakReference 开始返回 null 时，
     * 它所指向的对象已经准备被回收， 这时可以做一些合适的清理工作.
     * 将一个 ReferenceQueue 传给一个 Reference 的构造函数， 当对象被回收时，
     * 虚拟机会自动将这个对象插入到 ReferenceQueue 中， WeakHashMap 就是利用 ReferenceQueue
     * 来清除 key 已经没有强引用的 entries.
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        SoftReference<Object> weakReference = new SoftReference<Object>(referent, referenceQueue);

        System.out.println("程序或垃圾回收器通知是否已将此引用对象加入队列  " + (weakReference.isEnqueued()));
        Reference<? extends Object> polled = referenceQueue.poll();
        System.out.println("轮询此队列，查看是否存在可用的引用对象  " + polled);

        referent = null;
        System.gc();

        System.out.println("程序或垃圾回收器通知是否已将此引用对象加入队列  " + (weakReference.isEnqueued()));
        Reference<? extends Object> removed = referenceQueue.remove();
        System.out.println("移除此队列中的下一个引用对象  " + removed);


    }
}
