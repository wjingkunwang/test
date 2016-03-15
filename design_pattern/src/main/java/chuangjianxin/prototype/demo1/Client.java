package chuangjianxin.prototype.demo1;

/**
 * Created by wjk on 16/3/15.
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
