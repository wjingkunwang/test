package chapter15.genericDemo;

/**
 * 泛型数组
 */
public class Demo4 {
    public static <T> void fun1(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static <T> T[] fun2(T... args) {
        return args;
    }

    public static void main(String[] args) {
        Integer i[] = fun2(1, 2, 3, 4);
        String j[] = fun2("a", "b", "c");
        fun1(i);
        fun1(j);
    }
}
