package leijiazai;

/**
 * Created by wjk on 16/1/16.
 */
public class Demo {
    static {
        System.out.println("Demo静态初始化块");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Demo的main方法");
        A a = new A();
    }
}


class A extends A_Father {
    public static int i = 100;
    public static final int J = 200;

    static {
        System.out.println("A静态初始化块");
        i = 300;
    }

    public A() {
        System.out.println("创建A对象");
    }
}

class A_Father {
    static {
        System.out.println("A_Father静态初始化块");
    }

}
