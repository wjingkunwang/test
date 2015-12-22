package atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wjk on 15/12/22.
 */
public class VolatileTest {
    private static AtomicInteger race = new AtomicInteger(0);
    private static final int THREAD_COUNT = 200;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];
        for(int i = 0; i < THREAD_COUNT; i++){
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for(int i = 0; i < 2000; i++){
                        race.incrementAndGet();
                    }
                }
            });

            threads[i].start();
        }

        while (Thread.activeCount() > 1) {
            Thread.yield();
            System.out.println(race);

        }
    }
}
