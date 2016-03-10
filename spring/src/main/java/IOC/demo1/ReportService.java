package IOC.demo1;

import java.util.Date;

/**
 * Created by wjk on 16/3/2.
 */
public class ReportService {

//    private ReportGenerator reportGenerator = new PDFGenerator();
    private ReportGenerator reportGenerator = new ExcelGenerator();

    void getDailyReport(Date date) {
        reportGenerator.generate("pdf导出周表");
        System.out.println("pdf导出周表");
    }

    void getMonthReport(Date date) {
        reportGenerator.generate("pfd导出月表");
        System.out.println("pfd导出月表");
    }
}
