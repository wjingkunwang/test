package chapter15.genericDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的引入
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("abc");
        //list.add(1);
        for (Object obj : list) {
            System.out.println((String)obj);
        }
    }
}
