package IOC.demo4;

import java.util.Date;


public class Client {
    public static void main(String[] args) {

        Container container = new Container();
        System.out.println("container初始化完成");
        System.out.println("获取组件ReportService");
        ReportService reportService = (ReportService) Container.getBean("reportService");
        reportService.getDailyReport(new Date());
    }
}
