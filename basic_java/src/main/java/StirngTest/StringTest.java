package StirngTest;

/**
 * Created by wjk on 15/12/28.
 */
public class StringTest {
    public static void main(String[] args) {
        //new创建
        String str1 = new String("123");
        //直接指定
        String str2 = "123";
        System.out.println(str1 == str2);//false
        //使用 "+"
        String str3 = "12" + "3";
        System.out.println(str2 == str3);//true
        //使用包含变量的表达式来创建
        String str4 = new String("12");
        String str5 = str4 + "3";
        System.out.println(str5 == str2);//false
        //使用包含变量的表达式来创建
        String str6 = "12";
        String str7 = "3";
        String str8 = str6 + str7;
        System.out.println(str8 == str2);//false

    }
}
