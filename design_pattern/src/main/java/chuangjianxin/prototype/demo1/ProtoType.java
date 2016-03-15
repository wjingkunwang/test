package chuangjianxin.prototype.demo1;

/**
 * Created by wjk on 16/3/15.
 */
public class Prototype implements Cloneable{
    public Prototype clone(){
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
