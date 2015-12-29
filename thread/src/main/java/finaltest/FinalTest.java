package finaltest;

/**
 * 类的private方法会隐式地被指定为final方法
 * 当final变量是基本数据类型以及String类型时，
 * 如果在编译期间能知道它的确切值,
 * 则编译器会把它当做编译期常量使用
 */
public class FinalTest {
    public static void main(String[] args) {
        String str1 = "hello2";
        final String str2 = "hello";
        String str3 = "hello";
        String str4 = str2 + "2";
        String str5 = str3 + "2";
        String str6 = "hello";

        System.out.println(str1 == str4);//true
        System.out.println(str1 == str5);//false
        System.out.println(str3 == str6);//true

    }
}
