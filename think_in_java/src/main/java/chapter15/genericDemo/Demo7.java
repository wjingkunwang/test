package chapter15.genericDemo;

/**
 * Created by wjk on 16/1/13.
 */
public class Demo7 {

    public  <U extends Comparable> void count(U[] array, U ele) {
        int count = 0;
        for (U u : array) {
            if (ele.compareTo(u) == 1) {
                count++;
            }
        }
    }
}
