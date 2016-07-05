package factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }

    public void talk() {
        System.out.println("白种人说的话是单字节");
    }
}
