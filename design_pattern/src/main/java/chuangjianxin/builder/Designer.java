package chuangjianxin.builder;

/**
 * Created by wjk on 16/3/16.
 */
//设计者设计房屋但是自己不去建造,指挥工人去建造
public class Designer {
    public void order(Builder builder){
        builder.makeWindow();
        builder.makeFloor();
    }
}
