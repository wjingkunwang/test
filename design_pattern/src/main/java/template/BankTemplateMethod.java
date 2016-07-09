package template;

/**
 * Created by wjk on 16/7/9.
 */
public  abstract  class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("取号");
    }

    public abstract void transact();//具体业务

    public void evaluate(){
        System.out.println("反馈评价");
    }

    public final void process(){
        takeNumber();
        transact();
        evaluate();
    }
}
