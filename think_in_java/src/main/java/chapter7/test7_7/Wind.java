package chapter7.test7_7;

/**
 * Created by wjk on 15/12/29.
 */
public class Wind extends Instrument {
    @Override
    public void play(){
        System.out.println("wind");
    }
    public static void main(String[] args) {

        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}
