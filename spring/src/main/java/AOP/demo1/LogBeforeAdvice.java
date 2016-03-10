package AOP.demo1;

/**
 * Created by wjk on 16/3/3.
 */
/**
 * 用户自定义具体实现的before横切关注点
 */
class LogBeforeAdvice implements BeforeAdvice {

    public void before() {
        System.out.println("原业务方法被调用【之前】先打印日志...");
    }
}


