package IOC.demo3;

import java.util.Date;

/**
 1: 注意该例子中对IoC、DI的使用，是以ReportService为客户端（即组件需求者）为基点的，
 而代码中的Client 类main()中的测试代码才是服务组件的最终用户，但它需要的不是组件，而是组件所具有的服务。
 2: 实际在Spring框剪中，初始化Container显然不是最终用户Client应该做的事情，它应该由服务提供方事先启动就绪。
 3: 在最终用户Client中，我们还是用到Container.getBean("reportService")
 来获取事先已在Container的构造函数中实例化好的服务组件。而在具体应用中，
 通常是用XML等配置文件将可用的服务组件部署到服务器中，再由Container读取该配置文件结合反射技术得以创建、注入具体的服务组件。

 分析：
 之前是由ReportService主动从Container中请求获取服务组件，
 而现在是被动地等待Container注入（Inject，也就是Push）服务组件。
 控制权明显地由底层模块（ReportService 是组件需求者）转移给高层模块（Container 是组件提供者），也就是控制反转了。
 */
public class Client {
    public static void main(String[] args) {

        Container container = new Container();
        System.out.println("container初始化完成");
        System.out.println("获取组件ReportService");
        ReportService reportService = (ReportService) Container.getBean("reportService");
        reportService.getDailyReport(new Date());
    }
}
