package produceAndConsume;

/**
 * Created by wjk on 15/12/22.
 */
public class Godown {


    //仓库

    public static final int max_size = 100;
    public int curnum;

    public static void main(String[] args) {
        Godown godown = new Godown(30);
        Consumer c1 = new Consumer(50, godown);
        Consumer c2 = new Consumer(20, godown);
        Consumer c3 = new Consumer(30, godown);
        Producer p1 = new Producer(10, godown);
        Producer p2 = new Producer(10, godown);
        Producer p3 = new Producer(10, godown);
        Producer p4 = new Producer(10, godown);
        Producer p5 = new Producer(10, godown);
        Producer p6 = new Producer(10, godown);
        Producer p7 = new Producer(80, godown);
        c1.start();
        c2.start();
        c3.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
    }

    Godown(int curnum) {
        this.curnum = curnum;
    }

    /**
     * 生产指定数量的产品
     */
    public synchronized void produce(int neednum) {
        while (neednum + curnum >= max_size) {
            System.out.println("要生产的产品数量" + neednum + "超过剩余库存量" + (max_size - curnum) + " 暂时不能执行生产任务 !");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //满足生产条件,则进行生产
        curnum += neednum;
        System.out.println("已经生产了" + neednum + "个产品,现仓储量为" + curnum);
        notifyAll();
    }

    /**
     * 消费指定数量的产品
     */
    public synchronized void consume(int neednum) {
        while (curnum < neednum) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        curnum -= neednum;
        System.out.println("已经消费了" + neednum + "个产品,现仓储量为" + curnum);
        notifyAll();

    }
}


//生产者
class Producer extends Thread {
    private int neednum;
    private Godown godown;

    Producer(int neednum, Godown godown) {
        this.neednum = neednum;
        this.godown = godown;
    }

    @Override
    public void run() {
        godown.produce(neednum);
    }
}

//消费者
class Consumer extends Thread {
    private int neednum;
    private Godown godown;

    Consumer(int neednum, Godown godown) {
        this.neednum = neednum;
        this.godown = godown;
    }

    @Override
    public void run() {
        godown.consume(neednum);
    }
}