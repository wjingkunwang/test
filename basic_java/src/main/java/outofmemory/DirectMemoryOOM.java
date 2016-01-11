package outofmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by wjk on 16/1/9.
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        Field unsafeFiled = Unsafe.class.getDeclaredFields()[0];
        unsafeFiled.setAccessible(true);
        try {
            Unsafe unsafe = (Unsafe) unsafeFiled.get(null);
            while (true) {
                unsafe.allocateMemory(_1MB);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
