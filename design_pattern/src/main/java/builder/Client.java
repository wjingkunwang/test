package builder;

/**
 * Created by wjk on 16/3/16.
 */
public class Client {
    public static void main(String[] args) {
        //建造者
        Builder builder = new MingGong();
        //设计师
        Designer designer = new Designer();
        //指挥建造
        designer.order(builder);
        //获取房屋
        builder.getRoom();
    }
}
