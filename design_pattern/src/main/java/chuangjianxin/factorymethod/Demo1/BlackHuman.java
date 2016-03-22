package chuangjianxin.factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }

    public void talk() {
        System.out.println("黑人说的话听不懂");
    }
}
