package proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wjk on 16/3/2.
 */
public class ReportHandler implements InvocationHandler {
    private ReportCreator reportCreator;

    public ReportHandler(ReportCreator reportCreator) {
        this.reportCreator = reportCreator;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打印日志中~~~~~~~~~~~~~~");
        Object object = method.invoke(this.reportCreator,args);
        return object;
    }
}
