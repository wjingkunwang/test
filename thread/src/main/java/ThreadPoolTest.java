import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wjk on 15/12/22.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {

        // 固定大小线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建5个线程
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();

        //将线程放入线程池
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        //关闭线程池
        pool.shutdown();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}