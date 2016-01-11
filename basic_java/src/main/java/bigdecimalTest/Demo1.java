package bigdecimalTest;

import java.math.BigDecimal;

/**
 * Created by wjk on 16/1/6.
 */
public class Demo1 {
    public static void main(String[] args) {
        double a = 123.11;
        BigDecimal bigDecimal = new BigDecimal(a);
        bigDecimal.valueOf(a);
        System.out.println(BigDecimal.valueOf(a));
    }
}
