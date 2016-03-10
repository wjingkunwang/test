package AOP.demo1;


/**
 * before 横切关注点，即在原方法调用【之前】被调用
 */
interface BeforeAdvice extends Advice {
    public void before();
}