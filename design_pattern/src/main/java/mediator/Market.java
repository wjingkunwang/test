package mediator;

public class Market extends Department {

    public Market(Mediator mediator) {
        super(mediator);
    }


    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");
        getMediator().command(new Financial(getMediator()));
    }

    public void selfAction() {
        System.out.println("跑去接项目！");
    }
}
