package factorymethod;

/**
 * Created by wjk on 16/2/26.
 */
public class EastKFC implements KFC {
    public Food createFood() {
        return new Youtiao();
    }
}
