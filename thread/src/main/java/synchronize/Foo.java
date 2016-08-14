package synchronize;

/**
 * Created by wjk on 16/8/12.
 */
class Foo extends Thread {
    private int val;

    public Foo(int v) {
        val = v;
    }

    public void printVal(int v) {
        synchronized(this) {
            while (true) {
                System.out.println(v);
            }
        }
    }
    /*public void printVal(int v) {
        synchronized(Foo.class) {
            while(true)
                System.out.println(v);
        }
    }*/

    public void run() {
        printVal(val);
    }
}