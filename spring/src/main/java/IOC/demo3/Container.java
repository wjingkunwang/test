package IOC.demo3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wjk on 16/3/2.
 */
public class Container {
    private static Map<String, Object> hashMap = new HashMap<String, Object>();
    private ReportService reportService = new ReportService();

    public Container() {
        System.out.println("初始化container容器");
        System.out.println("初始化excelGenerator容器");
        ExcelGenerator excelGenerator = new ExcelGenerator();
        PDFGenerator pdfGenerator = new PDFGenerator();

        hashMap.put("excel", excelGenerator);
        hashMap.put("pdf", pdfGenerator);

        ReportService reportService = new ReportService();
        hashMap.put("reportService", reportService);
        reportService.setReportGenerator(excelGenerator);

    }

    public static Object getBean(String id) {
        return hashMap.get(id);
    }
}
