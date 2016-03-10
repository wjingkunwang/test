package AOP.demo1;


/**
 * after 横切关注点，即在原方法调用【之后】被调用
 */
interface AfterAdvice extends Advice {
    public void after();
}