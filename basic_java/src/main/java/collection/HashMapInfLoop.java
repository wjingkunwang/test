package collection;

import java.util.HashMap;

/**
 * Created by wjk on 16/1/20.
 */
public class HashMapInfLoop {

    private HashMap map = new HashMap();


    public HashMapInfLoop() {

                    for (int i = 0; i < 50000000; i++) {
                        map.put(new Integer(i), Integer.valueOf(i));
                    }

        }
/*
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 50000000; i++) {
                        map.get(i);
                    }
                }
            });
            thread.start();
        }*/



    public static void main(String[] args) {
        new HashMapInfLoop();
    }
}
