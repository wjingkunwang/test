package factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    public void talk() {
        System.out.println("黄种人说的话是双字节");
    }
}
