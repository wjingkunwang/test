package mediator;

public class Development implements Department {

    private Mediator m;  //持有中介者(总经理)的引用

    public Development(Mediator m) {
        super();
        this.m = m;
        m.register("development", this);
    }

    public void outAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }

    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }
}