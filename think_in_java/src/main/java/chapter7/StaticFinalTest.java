package chapter7;

/**
 * Created by wjk on 15/12/29.
 */
public class StaticFinalTest {
    public static void main(String[] args) {
        RandomNum num1 = new RandomNum();
        RandomNum num2 = new RandomNum();
        System.out.println("final   " + num1.i);
        System.out.println("static  " + num1.j);
        System.out.println("final   " + num2.i);
        System.out.println("static  " + num2.j);
    }
}

class RandomNum {
    public final double i = Math.random();
    public static double j = Math.random();
}

