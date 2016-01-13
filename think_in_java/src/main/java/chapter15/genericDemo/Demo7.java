package chapter15.genericDemo;

/**
 * Created by wjk on 16/1/13.
 */
public class Demo7<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Demo7<String> integerBox = new Demo7();
        integerBox.set("abc");	//能通过编译，因为T指定为String类型
//		integerBox.inspect("abc");//不能通过编译，因为U必须是Number类型或其子类
        integerBox.inspect(new Integer(10));
    }
}
