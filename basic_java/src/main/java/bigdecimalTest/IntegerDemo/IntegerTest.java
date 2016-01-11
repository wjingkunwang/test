
/**
 * Created by wjk on 16/1/7.
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        int c = 200;
        Integer d = 200;
        System.out.println(c == d);
        Integer e = new Integer(100);
        System.out.println(a == e);
    }
}
