package notify;

/**
 * http://www.bozhiyue.com/java/2016/0803/337676.html
 */
public class Calculator extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 101; i++) {
                total += i;
            }
            //（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
        }
        //注意notify()必须在同步代码块中
        /**
         * 原因:只用执行完同步代码块后才会释放锁,只有释放锁,才能唤醒等待的线程,同时这个线程只有获取锁才能执行,
         * 当notify不在同步代码块中,则notify可能锁没有释放(同步代码块没有没有执行完成),就唤醒等待的线程,而等待的线程需要锁
         * 才能执行,它就会竞争同步代码中锁.就报错:Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
         */
        notify();

        System.out.println(12333);
    }
}