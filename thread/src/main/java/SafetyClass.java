import java.util.Vector;

/**
 * Created by wjk on 15/12/22.
 */
public class SafetyClass {
    private static Vector<Integer> vector = new Vector<Integer>();

    public static void main(String[] args) {
        while (true) {

                for (int i = 0; i < 10; i++) {
                    vector.add(i);
                }


            Thread threadRemove = new Thread(new Runnable() {
                public void run() {
                        for (int i = 0; i < vector.size(); i++) {
                            vector.remove(i);
                        }
                    }
            });



            Thread threadPrint = new Thread(new Runnable() {
                public void run() {
                        for (int i = 0; i < vector.size(); i++) {
                            System.out.println(vector.get(i));
                        }
                }
            });


            threadRemove.start();
            threadPrint.start();

            while (Thread.activeCount() > 20);
        }

    }
}
