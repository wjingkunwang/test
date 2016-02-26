package chuangjianxin.factorymethod;

/**
 * Created by wjk on 16/2/26.
 */
public class WestKFC implements KFC {
    public Food createFood() {
        return new Mianbao();
    }
}
