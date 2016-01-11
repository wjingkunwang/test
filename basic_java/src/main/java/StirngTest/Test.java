package StirngTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjk on 16/1/11.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(f(list));
    }

    public static int f(List<Integer> list) {
        int count = 0;
        for (Integer i : list) {
            //count += (i!=null)?i:0;
            //Exception in thread "main" java.lang.NullPointerException
            count += i;
        }
        return count;
    }
}

