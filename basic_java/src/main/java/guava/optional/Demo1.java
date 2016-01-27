package guava.optional;

import com.google.common.base.Optional;

/**
 * Created by wjk on 16/1/21.
 */
public class Demo1 {
    public static void main(String[] args) {
        String a = new String("abc");
        Integer b = null;
        Optional optional = Optional.fromNullable(b);
        Optional optional1 = Optional.absent();
        System.out.println(optional1);
        System.out.println(optional1.or("1"));
        String string = new String("12");


    }
}
