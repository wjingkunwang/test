package AOP.demo1;

/**
 * Created by wjk on 16/3/3.
 */
class LogAfterAdvice implements AfterAdvice {

    public void after() {
        System.out.println("原业务方法被调用【之后】再打印日志...");
    }
}
