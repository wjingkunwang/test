package proxy.demo1;

/**
 * Created by wjk on 16/3/2.
 */
public class LocalReportCreator implements ReportCreator {
    public void getHTML(String path) {
        System.out.println("[本地]获取{html}");
    }

    public void getPDF(String path) {
        System.out.println("[本地]获取{pdf}");
    }
}
