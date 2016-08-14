package notify;

/**
 *
 * http://blog.csdn.net/haluoluo211/article/details/49558155
 * wait导致当前的线程等待，直到其他线程调用此对象的 notify() 方法或 notifyAll() 方法,或被其他线程中断。wait只能由持有对像锁的线程来调用。

 notify唤醒在此对象监视器上等待的单个线程。如果所有线程都在此对象上等待，则会选择唤醒其中一个线程(随机)。直到当前的线程放弃此对象上的锁，才能继续执行被唤醒的线程。同Wait方法一样，
 notify只能由持有对像锁的线程来调用.notifyAll也一样，不同的是notifyAll会唤配所有在此对象锁上等待的线程。


 　sleep()睡眠时，保持对象锁，仍然占有该锁；
 　　　　而wait()睡眠时，释放对象锁。
 */
public class ReaderResult {
    public static void main(String[] args) {
        Calculator b = new Calculator();
        //启动计算线程
        b.start();
        //线程A拥有b对象上的锁。线程为了调用wait()或notify()方法，该线程必须是那个对象锁的拥有者
        synchronized (b) {
            try {
                System.out.println("等待对象b完成计算。。。");
                //当前线程A等待
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b对象计算的总和是：" + b.total);
        }
    }
}