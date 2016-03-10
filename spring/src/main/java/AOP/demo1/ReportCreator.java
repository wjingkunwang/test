package AOP.demo1;

/**
 * Created by wjk on 16/3/3.
 */
public interface ReportCreator {
    public void getHtmlReport(String path);

    public void getPdfReport(String path);
}