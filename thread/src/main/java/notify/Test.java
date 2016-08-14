package notify;

/**
 * Created by wjk on 16/8/11.
 */
public class Test {
    private static boolean isTrue = true;

    public static synchronized void write(boolean b) {
        isTrue = b;
    }

    public static synchronized boolean read() {
        return isTrue;
    }

    public static void print() {
        System.out.println(isTrue);
    }

    public static void main(String[] args) throws InterruptedException {

        Test.write(false);
        Thread.sleep(1000);
        Test.read();
        Test.print();
    }

}
