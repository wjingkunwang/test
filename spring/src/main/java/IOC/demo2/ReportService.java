package IOC.demo2;

import java.util.Date;

/**
 *
 */
public class ReportService {

    private ReportGenerator reportGenerator = (ReportGenerator) Container.getBean("pdf");

    void getDailyReport(Date date) {
        reportGenerator.generate("pdf导出周表");
        System.out.println("pdf导出周表");
    }

    void getMonthReport(Date date) {
        reportGenerator.generate("pfd导出月表");
        System.out.println("pfd导出月表");
    }
}
