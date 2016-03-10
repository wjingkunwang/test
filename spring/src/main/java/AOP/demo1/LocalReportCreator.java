package AOP.demo1;

/**
 * 用于根据【本地】文件路径生成报表
 */
class LocalReportCreator implements ReportCreator {

    public void getHtmlReport(String path) {
        System.out.println("根据【本地】文件生成【HTML】格式的报表 ...");
    }

    public void getPdfReport(String path) {
        System.out.println("根据【本地】文件生成【PDF】格式的报表 ...");
    }
}

