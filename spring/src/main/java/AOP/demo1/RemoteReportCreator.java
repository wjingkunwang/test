package AOP.demo1;


/**
 * 用于根据【远程】文件路径生成报表
 */
class RemoteReportCreator implements ReportCreator {

    public void getHtmlReport(String path) {
        System.out.println("根据【远程】文件生成【HTML】格式的报表 ...");
    }

    public void getPdfReport(String path) {
        System.out.println("根据【远程】文件生成【PDF】格式的报表 ...");
    }
}
