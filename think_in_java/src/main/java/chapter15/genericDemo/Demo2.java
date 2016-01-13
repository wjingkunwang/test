package chapter15.genericDemo;

/**
 * 泛型类
 */
public class Demo2 {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.setObject("abc");
        Integer a = (Integer)demo2.getObject();
    }
}
