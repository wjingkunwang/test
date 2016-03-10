package proxy.demo1;

import java.lang.reflect.Proxy;

/**
 * 学习地址:http://haolloyin.blog.51cto.com/1177454/476026/
 */
public class Client {
    public static void main(String[] args) {

        ReportCreator reportCreator = new RemoteReportCreator();
        ReportHandler handler = new ReportHandler(reportCreator);
        ReportCreator reportCreatorProxy = (ReportCreator) Proxy.newProxyInstance(reportCreator.getClass().getClassLoader(),reportCreator.getClass().getInterfaces(),handler);
        reportCreatorProxy.getHTML("/root/1.txt");

    }
}
