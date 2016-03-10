package IOC.demo4;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wjk on 16/3/2.
 */
public class Container {
    private static Map<String, Object> beans;

    public Container() {
        System.out.println("1...开始初始化 Container ...");

        beans = new HashMap<String, Object>();

        try {
            Properties props = new Properties();
            props.load(new FileInputStream("/Users/wjk/myproject/test/spring/src/main/resources/bean_config.properties"));

            for (Map.Entry entry : props.entrySet()) {
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();
                // 处理 key-value，进行依赖属性的注入
                this.handleEntry(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//      // 创建、保存具体的报表生起器
//      ReportGenerator reportGenerator = new PDFGenerator();
//      beans.put("reportGenerator", reportGenerator);
//
//      // 获取、管理 ReportService 的引用
//      ReportService reportService = new ReportService();
//      // 注入上面已创建的具体 ReportGenerator 实例
//      reportService.setReportGenerator(reportGenerator);
//      beans.put("reportService", reportService);

        System.out.println("5...结束初始化 Container ...");
    }

    /**
     * 根据key-value处理配置文件，从中获取bean及其依赖属性并注入
     *
     * @param key
     * @param value
     * @throws Exception
     */
    private void handleEntry(String key, String value) throws Exception {
        String[] keyParts = key.split("\\.");

        if (keyParts.length == 1) {
            // 组件定义：利用反射实例化该组件
            Object bean = Class.forName(value).newInstance();
            beans.put(keyParts[0], bean);
        } else {
            // 依赖注入：获取需要bean的主体，以及被注入的实例
            Object bean = beans.get(keyParts[0]);
            Object filedRef = beans.get(value);
            BeanUtil.setProperty(bean, keyParts[1], filedRef);
        }
    }

    public static Object getBean(String id) {
        System.out.println("最后获取服务组件...getBean() --> " + id + " ...");
        return beans.get(id);
    }
}
