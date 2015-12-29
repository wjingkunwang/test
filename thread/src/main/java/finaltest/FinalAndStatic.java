package finaltest;

/**
 * final保证变量不可以变,static表示保存一个副本
 */
public class FinalAndStatic {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println("i: " + myClass1.i);
        System.out.println("j: " + myClass1.j);
        System.out.println("i: " + myClass2.i);
        System.out.println("j: " + myClass2.j);

    }
}

class MyClass {
    public final double i = Math.random();
    String
    public static double j = Math.random();
}
