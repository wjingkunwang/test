package chapter15.genericDemo;

import java.util.Random;

/**
 * 泛型接口
 */
public class FruitsGenerator implements Generator {
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }

    public static void main(String[] args) {
        FruitsGenerator fruitsGenerator = new FruitsGenerator();
        System.out.println(fruitsGenerator.next());
        System.out.println(fruitsGenerator.next());
        System.out.println(fruitsGenerator.next());
    }

}
