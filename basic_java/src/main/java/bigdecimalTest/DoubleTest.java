package bigdecimalTest;

import innerClass.DotNew;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by wjk on 16/1/6.
 */
public class DoubleTest {
    public static void main(String[] args) {
      /*  String str = "123.4444";
        System.out.println(new BigDecimal(str).setScale(2,BigDecimal.ROUND_HALF_UP));

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println(format.format(new BigDecimal(str)));*/
        BigDecimal amount = new BigDecimal("3.1415");//请分别尝试"0", "0.00", "1.00","10.00"和"10.10"
        System.out.println(amount.signum());//正负
        System.out.println(amount.scale()); //标度
        System.out.println(amount.stripTrailingZeros());
        System.out.println(amount.stripTrailingZeros().scale());//去零后的标度
    }
}
