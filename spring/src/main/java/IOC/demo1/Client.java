package IOC.demo1;

import java.util.Date;

/**
 * 按照不同要求导出Excel和pdf
 *
 * 缺点:ReportService依赖PDFGenerator 或 ExcelGenerator
 */
public class Client {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.getDailyReport(new Date());
        reportService.getMonthReport(new Date());
    }
}
