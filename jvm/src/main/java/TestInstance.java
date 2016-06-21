/**
 * Created by wjk on 16/5/15.
 */
public class TestInstance {
//    public static TestInstance instance = new TestInstance();
    public static int a;
    public static int b = 0;

    public TestInstance() {
        a++;
        b++;
    }
    public static TestInstance instance = new TestInstance();

    public static void main(String[] args) {
        System.out.println(TestInstance.a);
        System.out.println(TestInstance.b);
    }
}
