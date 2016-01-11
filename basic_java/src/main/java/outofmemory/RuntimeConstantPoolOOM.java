package outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行是常量池溢出
 * 根据提示信息"PermGen space",说明常量池时方法区(HotStop虚拟机中的永久代)的一部分
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
     * -XX:MaxMetaspaceSize=2M
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        int i = 1;
        while (true){
            stringList.add(String.valueOf(i++));
        }
    }
}
