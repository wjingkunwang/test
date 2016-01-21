package leijiazai.a;


public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        //访问一个A父类静态域
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        //数组定义类引用
        A[] as = new A[10];//没有输出
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        //引用常量
        System.out.println(A.i);
    }
}

class A {
    public static int i = 100;

    public A() {
        System.out.println("创建A对象");
    }
}


