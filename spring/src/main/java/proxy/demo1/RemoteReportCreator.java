package proxy.demo1;

/**
 * Created by wjk on 16/3/2.
 */
public class RemoteReportCreator implements ReportCreator {
    public void getHTML(String path) {
        System.out.println("[远程]获取{html}");
    }

    public void getPDF(String path) {
        System.out.println("[远程]获取{pdf}");
    }
}
