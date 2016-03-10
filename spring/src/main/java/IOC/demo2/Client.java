package IOC.demo2;

import java.util.Date;

/**
 * ReportService 与 Container 之间存在双向关联，彼此互相有依赖关系。
 * 并且，如果想要重用 ReportService，由于它也是直接依赖于单独一个 Container 的具体查找逻辑。
 * 若其他容器具体不同的组件查找机制（如 JNDI），此时重用 ReportService 意味着需要修改 Container 的内部查找逻辑。
 *
 * 这个时候可以引入简介类ServiceLocator(一般的为接口)
 */
public class Client {
    public static void main(String[] args) {

        Container container = new Container();
        ReportService reportService = (ReportService) Container.getBean("reportService");
        reportService.getDailyReport(new Date());
    }
}
