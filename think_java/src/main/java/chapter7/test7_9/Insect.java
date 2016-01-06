package chapter7.test7_9;

/**
 * Created by wjk on 15/12/29.
 */
public class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + "   j= " + j );
        j = 10;
    }

    private static int x1 = printInit("static insect.x1 initialized");

    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }
    private static int x2 = printInit("static insect.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Better constructor");
        Beetle b = new Beetle();
    }

}