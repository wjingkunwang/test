package IOC.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wjk on 16/3/2.
 */
public class Container {
    private static Map<String, Object> hashMap = new HashMap<String, Object>();

    public Container() {
        ExcelGenerator excelGenerator = new ExcelGenerator();
        PDFGenerator pdfGenerator = new PDFGenerator();

        hashMap.put("excel", excelGenerator);
        hashMap.put("pdf", pdfGenerator);

        ReportService reportService = new ReportService();
        hashMap.put("reportService", reportService);
    }

    public static Object getBean(String id) {
        return hashMap.get(id);
    }
}
