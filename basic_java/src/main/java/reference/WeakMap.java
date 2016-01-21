package reference;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by wjk on 16/1/15.
 */
public class WeakMap {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, Object> weakHashMap = new WeakHashMap<Object, Object>();
        Object key = new Object();
        Object value = new Object();
        weakHashMap.put(key, value);
        System.out.println(weakHashMap.containsValue(value));

        key = null;
        System.gc();
        Thread.sleep(1000);


        //一旦没有指向 key 的强引用, WeakHashMap 在 GC 后将自动删除相关的 entry

        System.out.println(weakHashMap.containsValue(value));

    }

}
