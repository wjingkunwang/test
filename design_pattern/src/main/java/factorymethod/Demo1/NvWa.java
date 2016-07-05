package factorymethod.Demo1;

/**
 * Created by wjk on 16/3/16.
 */
public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //第一次火候不够造就白人
        System.out.println("*******造白人*******");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //第二次火候大了造就黑人
        System.out.println("*******造黑人*******");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        //第三次火候刚好造就黄人
        System.out.println("*******造黄人*******");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
