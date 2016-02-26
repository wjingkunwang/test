package chuangjianxin.factorymethod;

/**
 * Created by wjk on 16/2/26.
 */
public class Test {
    public static KFC kfc;

    public static Food getFood(KFC kfc) {
        if (kfc instanceof EastKFC) {
            return new Youtiao();
        } else {
            return new Mianbao();
        }

    }

    public static void main(String[] args) {
        System.out.println("中国kfc的早餐");
        getFood(new EastKFC()).eating();
        System.out.println("外国kfc的早餐");
        getFood(new EastKFC()).eating();
    }
}
