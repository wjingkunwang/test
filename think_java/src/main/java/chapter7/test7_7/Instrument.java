package chapter7.test7_7;

/**
 * Created by wjk on 15/12/29.
 */
public class Instrument {
    public void play(){
        System.out.println("instrument");
    }

    static void tune(Instrument i){
        i.play();
    }
}
