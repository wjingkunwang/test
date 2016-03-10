package AOP.demo1;

/**
 * Created by wjk on 16/3/3.
 */
public class Test {
    public static void main(String[] args) {
        // 初始化环境配置
        ProxyFactory proxyFactory = new ProxyFactory("/Users/wjk/myproject/test/spring/src/main/resources/config.properties");
        // 获取被代理后的Target对象
        ReportCreator reportCreator = (ReportCreator) proxyFactory
                .getProxy("targetProxy", "target");
        // 使用被代理后的target对象提供的服务
        reportCreator.getHtmlReport("http://code.google.com/file/...");
    }

}
