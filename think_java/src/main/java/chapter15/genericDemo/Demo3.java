package chapter15.genericDemo;

/**
 * 泛型类
 */
public class Demo3<T> {
    private T obj;

    public Demo3(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3(1);
        demo3.setObj("a");
        System.out.println(demo3.getObj());
    }
}
