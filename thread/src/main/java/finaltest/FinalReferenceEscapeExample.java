package finaltest;

/**
 * Created by wjk on 15/12/24.
 */
public class FinalReferenceEscapeExample {
    final int i;
    static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample () {
        i = 1;                              //1写final域
        obj = this;                          //2 this引用在此“逸出”
    }

    public static void writer() {
        new FinalReferenceEscapeExample ();
    }

    public static void reader() {
        if (obj != null) {                     //3
            int temp = obj.i;                 //4
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                writer();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                reader();
            }
        }).start();
    }
}
