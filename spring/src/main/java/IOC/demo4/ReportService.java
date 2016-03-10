package IOC.demo4;

import java.util.Date;

/**
 *
 */
public class ReportService {

    private ReportService reportService;
    private ReportGenerator reportGenerator;

    public ReportService() {
        System.out.println("初始化ReportService");
    }

    public void setReportGenerator(ReportGenerator reportGenerator) {
        System.out.println("开始注入reportGenerator");
        this.reportGenerator = reportGenerator;
    }

    void getDailyReport(Date date) {
        reportGenerator.generate("pdf导出周表");
        System.out.println("pdf导出周表");
    }

    void getMonthReport(Date date) {
        reportGenerator.generate("pfd导出月表");
        System.out.println("pfd导出月表");
    }



}
