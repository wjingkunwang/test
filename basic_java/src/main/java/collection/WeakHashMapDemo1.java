package collection;

import java.util.WeakHashMap;

/**
 * Created by wjk on 16/1/21.
 */
public class WeakHashMapDemo1 {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<String, String>();
        map.put("wjk", "hello");
        map.put("snail", "world");
        map.put(new String("wjk"), "hello");
        map.put(new String("snail"), "world");

        System.gc();
        System.out.println(map.size());

    }
}
